package com.tencent.kinda.framework.app;

/* loaded from: classes13.dex */
public final class FingerprintInsets {
    public static final int ICON_INVISIBLE = 0;
    public static final int ICON_VISIBLE = 1;
    private static final java.lang.String KEY_HAS_UNDER_DISPLAY_FINGERPRINT = "has_under_display_fingerprint";
    private static final java.lang.String KEY_ICON_POSITION = "icon_position";
    private static final java.lang.String KEY_ICON_STATE = "icon_state";
    private static final java.lang.String KEY_MAJOR_VERSION = "version_major";
    private static final java.lang.String KEY_MINOR_VERSION = "version_minor";
    private static final java.lang.String KEY_QUERY_JSON_STRING = "query_json";
    private static final java.lang.String KEY_TOKEN = "token";
    private static final int MSG_CLEAR = 10002;
    private static final int MSG_ICON_STATE_CHANGE = 10001;
    private static final int MSG_INTERNAL_NOTIFY_READY = 10;
    private static final int MSG_QUERY_INFO = 10000;
    private static final java.lang.String TAG = "FingerprintInsets";
    private static final int VERSION_MAJOR = 1;
    private static final int VERSION_MINOR = 1;
    private static boolean sDebuggable;
    private static com.tencent.kinda.framework.app.FingerprintInsets sInstance;
    private java.lang.ref.WeakReference<android.content.Context> mContextRef;
    private boolean mIsBound;
    private com.tencent.kinda.framework.app.FingerprintInsets.FingerprintInsetsListener mListener;
    private android.os.Messenger mService;
    private android.content.ServiceConnection mConnection = new android.content.ServiceConnection() { // from class: com.tencent.kinda.framework.app.FingerprintInsets.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            com.tencent.kinda.framework.app.FingerprintInsets.this.mService = new android.os.Messenger(iBinder);
            com.tencent.kinda.framework.app.FingerprintInsets.debug("Attached.");
            android.os.Message obtain = android.os.Message.obtain((android.os.Handler) null, 10000);
            obtain.arg1 = 1;
            obtain.arg2 = 1;
            com.tencent.kinda.framework.app.FingerprintInsets.debug("query ".concat(com.tencent.kinda.framework.app.FingerprintInsets.this.sendMessageToService(obtain) ? "success." : "failed!"));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName componentName) {
            com.tencent.kinda.framework.app.FingerprintInsets.this.mService = null;
            com.tencent.kinda.framework.app.FingerprintInsets.debug("Disconnected.");
        }
    };
    private java.util.Map<java.lang.String, com.tencent.kinda.framework.app.FingerprintInsets.Property> mProperties = new android.util.ArrayMap(8);
    private android.os.Handler mHandler = new com.tencent.kinda.framework.app.FingerprintInsets.IncomingHandler(this);
    private android.os.Messenger mMessenger = new android.os.Messenger(this.mHandler);

    /* loaded from: classes9.dex */
    public interface FingerprintInsetsListener {
        void onIconStateChanged(int i17);

        void onReady();
    }

    /* loaded from: classes13.dex */
    public static class IncomingHandler extends android.os.Handler {
        private java.lang.ref.WeakReference<com.tencent.kinda.framework.app.FingerprintInsets> mInsets;

        public IncomingHandler(com.tencent.kinda.framework.app.FingerprintInsets fingerprintInsets) {
            this.mInsets = new java.lang.ref.WeakReference<>(fingerprintInsets);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            com.tencent.kinda.framework.app.FingerprintInsets fingerprintInsets = this.mInsets.get();
            if (fingerprintInsets == null) {
                com.tencent.kinda.framework.app.FingerprintInsets.debug("missing insets reference");
                super.handleMessage(message);
                return;
            }
            int i17 = message.what;
            if (i17 == 10) {
                fingerprintInsets.notifyReady();
                return;
            }
            if (i17 == 10000) {
                com.tencent.kinda.framework.app.FingerprintInsets.debug(java.lang.String.format(java.util.Locale.ENGLISH, "Received from service, version:%d.%d", java.lang.Integer.valueOf(message.arg1), java.lang.Integer.valueOf(message.arg2)));
                android.os.Bundle data = message.getData();
                fingerprintInsets.parseQueryResult(data != null ? data.getString(com.tencent.kinda.framework.app.FingerprintInsets.KEY_QUERY_JSON_STRING) : null);
            } else {
                if (i17 != 10001) {
                    super.handleMessage(message);
                    return;
                }
                int i18 = message.arg1;
                com.tencent.kinda.framework.app.FingerprintInsets.debug("Received from service, icon state:" + i18);
                fingerprintInsets.notifyIconStateChanged(i18);
            }
        }
    }

    /* loaded from: classes13.dex */
    public static class Property<T> {
        java.lang.String key;
        T value;

        public Property(java.lang.String str, T t17) {
            this.key = str;
            this.value = t17;
        }

        public T value() {
            return this.value;
        }
    }

    private FingerprintInsets(android.content.Context context) {
        this.mContextRef = new java.lang.ref.WeakReference<>(context);
        info(java.lang.String.format(java.util.Locale.ENGLISH, "model:%s, product:%s, device:%s, manufacturer:%s", wo.w0.m(), android.os.Build.PRODUCT, android.os.Build.DEVICE, android.os.Build.MANUFACTURER));
    }

    public static com.tencent.kinda.framework.app.FingerprintInsets create(android.content.Context context, com.tencent.kinda.framework.app.FingerprintInsets.FingerprintInsetsListener fingerprintInsetsListener) {
        if (!isVivoDevice()) {
            return null;
        }
        if (sInstance == null) {
            com.tencent.kinda.framework.app.FingerprintInsets fingerprintInsets = new com.tencent.kinda.framework.app.FingerprintInsets(context);
            fingerprintInsets.setFingerprintInsetsListener(fingerprintInsetsListener);
            fingerprintInsets.doBindService();
            sInstance = fingerprintInsets;
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void debug(java.lang.String str) {
        if (sDebuggable) {
            com.tencent.mars.xlog.Log.i(TAG, str);
        }
    }

    private boolean doBindService() {
        android.content.Context context = this.mContextRef.get();
        if (context == null) {
            debug("Context missed!");
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            intent.setClassName("com.vivo.fingerprintui", "com.vivo.fingerprintui.export.MessengerService");
        } else {
            intent.setClassName("com.vivo.udfingerprint", "com.vivo.udfingerprint.service.MessengerService");
        }
        intent.putExtra(KEY_MAJOR_VERSION, 1);
        intent.putExtra(KEY_MINOR_VERSION, 1);
        try {
            if (context.bindService(intent, this.mConnection, 1)) {
                debug("Binding.");
                this.mIsBound = true;
            } else {
                info("Service not exist");
                this.mIsBound = false;
                loadPropertiesOffline();
                android.os.Message.obtain(this.mHandler, 10).sendToTarget();
            }
        } catch (java.lang.SecurityException e17) {
            com.tencent.mars.xlog.Log.w(TAG, "bindService failed:" + e17.getMessage());
        }
        return this.mIsBound;
    }

    private void doUnbindService() {
        if (!this.mIsBound) {
            debug("Service not bound");
            return;
        }
        if (this.mService != null) {
            sendMessageToService(android.os.Message.obtain((android.os.Handler) null, 10002));
            this.mService = null;
        }
        this.mIsBound = false;
        android.content.Context context = this.mContextRef.get();
        if (context == null) {
            debug("Context missed!");
        } else {
            context.unbindService(this.mConnection);
            debug("Unbinding.");
        }
    }

    private static java.lang.String getFingerprintModule() {
        java.lang.String property = getProperty("sys.fingerprint.boot", "");
        return android.text.TextUtils.isEmpty(property) ? getProperty("persist.sys.fptype", com.eclipsesource.mmv8.Platform.UNKNOWN) : property;
    }

    private static java.lang.String getProperty(java.lang.String str, java.lang.String str2) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return (java.lang.String) cls.getMethod("get", java.lang.String.class, java.lang.String.class).invoke(cls, str, str2);
        } catch (java.lang.Exception e17) {
            debug(e17.getMessage());
            return str2;
        }
    }

    private boolean getPropertyBoolean(java.lang.String str) {
        com.tencent.kinda.framework.app.FingerprintInsets.Property property = this.mProperties.get(str);
        if (property == null) {
            return false;
        }
        return ((java.lang.Boolean) property.value()).booleanValue();
    }

    private int getPropertyInteger(java.lang.String str) {
        com.tencent.kinda.framework.app.FingerprintInsets.Property property = this.mProperties.get(str);
        if (property == null) {
            return -1;
        }
        return ((java.lang.Integer) property.value()).intValue();
    }

    private android.graphics.Rect getPropertyRect(java.lang.String str) {
        com.tencent.kinda.framework.app.FingerprintInsets.Property property = this.mProperties.get(str);
        if (property == null) {
            return null;
        }
        return (android.graphics.Rect) property.value();
    }

    private static void info(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(TAG, str);
    }

    private static boolean isUdModule() {
        java.lang.String fingerprintModule = getFingerprintModule();
        return !android.text.TextUtils.isEmpty(fingerprintModule) && fingerprintModule.startsWith("udfp_");
    }

    private static boolean isVivoDevice() {
        return android.os.Build.MANUFACTURER.equalsIgnoreCase("vivo");
    }

    private static boolean isX20PlusUD() {
        java.lang.String str = android.os.Build.DEVICE;
        if (str.equalsIgnoreCase("PD1721")) {
            return true;
        }
        return str.equalsIgnoreCase("PD1710") && android.os.Build.VERSION.SDK_INT < 26 && isUdModule();
    }

    private static boolean isX21UD() {
        java.lang.String str = android.os.Build.DEVICE;
        if (str.equalsIgnoreCase("PD1728UD")) {
            return true;
        }
        return (str.contains("1728") || str.contains("1725")) && android.os.Build.VERSION.SDK_INT <= 27 && isUdModule();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean loadPropertiesOffline() {
        /*
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L1b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "fingerprint: "
            r0.<init>(r1)
            java.lang.String r1 = getFingerprintModule()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            debug(r0)
        L1b:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r1 = isX20PlusUD()
            r2 = 540(0x21c, float:7.57E-43)
            r3 = 0
            if (r1 == 0) goto L36
            java.lang.String r1 = "isX20PlusUD"
            debug(r1)
            r1 = 160(0xa0, float:2.24E-43)
            r4 = 2006(0x7d6, float:2.811E-42)
        L32:
            r5 = r4
            r4 = r2
            r2 = r1
            goto L4f
        L36:
            boolean r1 = isX21UD()
            if (r1 == 0) goto L46
            java.lang.String r1 = "isX21UD"
            debug(r1)
            r1 = 170(0xaa, float:2.38E-43)
            r4 = 1924(0x784, float:2.696E-42)
            goto L32
        L46:
            java.lang.String r1 = "No under display fingerprint detected"
            debug(r1)
            r1 = r3
            r2 = r1
            r4 = r2
            r5 = r4
        L4f:
            int r6 = r4 + r1
            int r7 = r5 + r2
            r0.set(r4, r5, r6, r7)
            int r1 = -r1
            int r1 = r1 / 2
            int r2 = -r2
            int r2 = r2 / 2
            r0.offset(r1, r2)
            boolean r1 = r0.isEmpty()
            java.lang.String r2 = "has_under_display_fingerprint"
            r4 = 1
            if (r1 == 0) goto L6c
            r8.setPropertyBoolean(r2, r3)
            goto L79
        L6c:
            java.lang.String r1 = "icon_position"
            r8.setPropertyRect(r1, r0)
            java.lang.String r0 = "icon_state"
            r8.setPropertyInteger(r0, r4)
            r8.setPropertyBoolean(r2, r4)
        L79:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.app.FingerprintInsets.loadPropertiesOffline():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyIconStateChanged(int i17) {
        setPropertyInteger(KEY_ICON_STATE, i17);
        com.tencent.kinda.framework.app.FingerprintInsets.FingerprintInsetsListener fingerprintInsetsListener = this.mListener;
        if (fingerprintInsetsListener != null) {
            fingerprintInsetsListener.onIconStateChanged(i17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyReady() {
        com.tencent.kinda.framework.app.FingerprintInsets.FingerprintInsetsListener fingerprintInsetsListener = this.mListener;
        if (fingerprintInsetsListener != null) {
            fingerprintInsetsListener.onReady();
        }
    }

    private android.graphics.Rect parsePosition(android.util.JsonReader jsonReader) {
        jsonReader.beginArray();
        int nextInt = jsonReader.hasNext() ? jsonReader.nextInt() : 0;
        int nextInt2 = jsonReader.hasNext() ? jsonReader.nextInt() : 0;
        int nextInt3 = jsonReader.hasNext() ? jsonReader.nextInt() : 0;
        int nextInt4 = jsonReader.hasNext() ? jsonReader.nextInt() : 0;
        jsonReader.endArray();
        return new android.graphics.Rect(nextInt, nextInt2, nextInt3, nextInt4);
    }

    private void parseProperties(android.util.JsonReader jsonReader) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String nextName = jsonReader.nextName();
            if (android.text.TextUtils.equals(nextName, KEY_ICON_STATE)) {
                setPropertyInteger(nextName, jsonReader.nextInt());
            } else if (android.text.TextUtils.equals(nextName, KEY_HAS_UNDER_DISPLAY_FINGERPRINT)) {
                setPropertyBoolean(nextName, jsonReader.nextBoolean());
            } else if (android.text.TextUtils.equals(nextName, KEY_ICON_POSITION)) {
                setPropertyRect(nextName, parsePosition(jsonReader));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void parseQueryResult(java.lang.String str) {
        setPropertyBoolean(KEY_HAS_UNDER_DISPLAY_FINGERPRINT, false);
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                android.util.JsonReader jsonReader = new android.util.JsonReader(new java.io.StringReader(str));
                try {
                    parseProperties(jsonReader);
                    jsonReader.close();
                } finally {
                }
            } catch (java.io.IOException unused) {
                this.mProperties.clear();
            }
        }
        android.os.Message.obtain(this.mHandler, 10).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean sendMessageToService(android.os.Message message) {
        android.content.Context context;
        android.os.Messenger messenger = this.mService;
        if (messenger == null || (context = this.mContextRef.get()) == null) {
            return false;
        }
        try {
            android.os.Bundle data = message.getData();
            if (data == null) {
                data = new android.os.Bundle();
            }
            if (!data.containsKey(KEY_TOKEN)) {
                data.putString(KEY_TOKEN, context.getPackageName());
            }
            message.setData(data);
            message.replyTo = this.mMessenger;
            messenger.send(message);
            return true;
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    public static void setDebugEnable(boolean z17) {
        sDebuggable = z17;
    }

    private void setPropertyBoolean(java.lang.String str, boolean z17) {
        if (this.mProperties.containsKey(str)) {
            debug("update property " + str);
        }
        this.mProperties.put(str, new com.tencent.kinda.framework.app.FingerprintInsets.Property(str, java.lang.Boolean.valueOf(z17)));
    }

    private void setPropertyInteger(java.lang.String str, int i17) {
        if (this.mProperties.containsKey(str)) {
            debug("update property " + str);
        }
        this.mProperties.put(str, new com.tencent.kinda.framework.app.FingerprintInsets.Property(str, java.lang.Integer.valueOf(i17)));
    }

    private void setPropertyRect(java.lang.String str, android.graphics.Rect rect) {
        this.mProperties.put(str, new com.tencent.kinda.framework.app.FingerprintInsets.Property(KEY_ICON_POSITION, rect));
    }

    public void destroy() {
        if (sInstance != null) {
            doUnbindService();
            this.mProperties.clear();
            this.mContextRef.clear();
            sInstance = null;
        }
    }

    public int getFingerprintIconBottom() {
        android.graphics.Rect propertyRect = getPropertyRect(KEY_ICON_POSITION);
        if (propertyRect == null) {
            return -1;
        }
        return propertyRect.bottom;
    }

    public int getFingerprintIconLeft() {
        android.graphics.Rect propertyRect = getPropertyRect(KEY_ICON_POSITION);
        if (propertyRect == null) {
            return -1;
        }
        return propertyRect.left;
    }

    public android.graphics.Rect getFingerprintIconPosition() {
        android.graphics.Rect propertyRect = getPropertyRect(KEY_ICON_POSITION);
        return propertyRect == null ? new android.graphics.Rect(-1, -1, -1, -1) : new android.graphics.Rect(propertyRect);
    }

    public int getFingerprintIconRight() {
        android.graphics.Rect propertyRect = getPropertyRect(KEY_ICON_POSITION);
        if (propertyRect == null) {
            return -1;
        }
        return propertyRect.right;
    }

    public int getFingerprintIconState() {
        return getPropertyInteger(KEY_ICON_STATE);
    }

    public int getFingerprintIconTop() {
        android.graphics.Rect propertyRect = getPropertyRect(KEY_ICON_POSITION);
        if (propertyRect == null) {
            return -1;
        }
        return propertyRect.top;
    }

    public boolean hasUnderDisplayFingerprint() {
        return getPropertyBoolean(KEY_HAS_UNDER_DISPLAY_FINGERPRINT);
    }

    public boolean isReady() {
        return (this.mIsBound && this.mProperties.isEmpty()) ? false : true;
    }

    public void setFingerprintInsetsListener(com.tencent.kinda.framework.app.FingerprintInsets.FingerprintInsetsListener fingerprintInsetsListener) {
        this.mListener = fingerprintInsetsListener;
    }
}
