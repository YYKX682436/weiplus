package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.FingerprintInsets */
/* loaded from: classes13.dex */
public final class C3113x71559cda {

    /* renamed from: ICON_INVISIBLE */
    public static final int f11890x6e077b47 = 0;

    /* renamed from: ICON_VISIBLE */
    public static final int f11891x8c33ce8c = 1;

    /* renamed from: KEY_HAS_UNDER_DISPLAY_FINGERPRINT */
    private static final java.lang.String f11892x1139ed1b = "has_under_display_fingerprint";

    /* renamed from: KEY_ICON_POSITION */
    private static final java.lang.String f11893x4517182f = "icon_position";

    /* renamed from: KEY_ICON_STATE */
    private static final java.lang.String f11894xad3e0b2b = "icon_state";

    /* renamed from: KEY_MAJOR_VERSION */
    private static final java.lang.String f11895xe52ffe12 = "version_major";

    /* renamed from: KEY_MINOR_VERSION */
    private static final java.lang.String f11896x764ff40e = "version_minor";

    /* renamed from: KEY_QUERY_JSON_STRING */
    private static final java.lang.String f11897x2e20f431 = "query_json";

    /* renamed from: KEY_TOKEN */
    private static final java.lang.String f11898x7aa95bd9 = "token";

    /* renamed from: MSG_CLEAR */
    private static final int f11899x98617fcf = 10002;

    /* renamed from: MSG_ICON_STATE_CHANGE */
    private static final int f11900x16ace7e6 = 10001;

    /* renamed from: MSG_INTERNAL_NOTIFY_READY */
    private static final int f11901xb74700f1 = 10;

    /* renamed from: MSG_QUERY_INFO */
    private static final int f11902xbbf61183 = 10000;
    private static final java.lang.String TAG = "FingerprintInsets";

    /* renamed from: VERSION_MAJOR */
    private static final int f11903x32955f52 = 1;

    /* renamed from: VERSION_MINOR */
    private static final int f11904x3299114e = 1;

    /* renamed from: sDebuggable */
    private static boolean f11905xec4698a1;

    /* renamed from: sInstance */
    private static com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda f11906xbfaed628;

    /* renamed from: mContextRef */
    private java.lang.ref.WeakReference<android.content.Context> f11908xec8370b1;

    /* renamed from: mIsBound */
    private boolean f11910x189a9947;

    /* renamed from: mListener */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.FingerprintInsetsListener f11911x753a6c41;

    /* renamed from: mService */
    private android.os.Messenger f11914x145c7988;

    /* renamed from: mConnection */
    private android.content.ServiceConnection f11907xadf6772b = new android.content.ServiceConnection() { // from class: com.tencent.kinda.framework.app.FingerprintInsets.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.this.f11914x145c7988 = new android.os.Messenger(iBinder);
            com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.m24937x5b09653("Attached.");
            android.os.Message obtain = android.os.Message.obtain((android.os.Handler) null, 10000);
            obtain.arg1 = 1;
            obtain.arg2 = 1;
            com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.m24937x5b09653("query ".concat(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.this.m24956xd0c45b1b(obtain) ? "success." : "failed!"));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName componentName) {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.this.f11914x145c7988 = null;
            com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.m24937x5b09653("Disconnected.");
        }
    };

    /* renamed from: mProperties */
    private java.util.Map<java.lang.String, com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.Property> f11913xa4ff8580 = new android.util.ArrayMap(8);

    /* renamed from: mHandler */
    private android.os.Handler f11909xc7640a1d = new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.IncomingHandler(this);

    /* renamed from: mMessenger */
    private android.os.Messenger f11912x251e0526 = new android.os.Messenger(this.f11909xc7640a1d);

    /* renamed from: com.tencent.kinda.framework.app.FingerprintInsets$FingerprintInsetsListener */
    /* loaded from: classes9.dex */
    public interface FingerprintInsetsListener {
        /* renamed from: onIconStateChanged */
        void mo24971xa25277fb(int i17);

        /* renamed from: onReady */
        void mo24972xb03baf04();
    }

    /* renamed from: com.tencent.kinda.framework.app.FingerprintInsets$IncomingHandler */
    /* loaded from: classes13.dex */
    public static class IncomingHandler extends android.os.Handler {

        /* renamed from: mInsets */
        private java.lang.ref.WeakReference<com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda> f11916x8dce9c3;

        public IncomingHandler(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda c3113x71559cda) {
            this.f11916x8dce9c3 = new java.lang.ref.WeakReference<>(c3113x71559cda);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda c3113x71559cda = this.f11916x8dce9c3.get();
            if (c3113x71559cda == null) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.m24937x5b09653("missing insets reference");
                super.handleMessage(message);
                return;
            }
            int i17 = message.what;
            if (i17 == 10) {
                c3113x71559cda.m24952x976377da();
                return;
            }
            if (i17 == 10000) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.m24937x5b09653(java.lang.String.format(java.util.Locale.ENGLISH, "Received from service, version:%d.%d", java.lang.Integer.valueOf(message.arg1), java.lang.Integer.valueOf(message.arg2)));
                android.os.Bundle data = message.getData();
                c3113x71559cda.m24955x94620652(data != null ? data.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.f11897x2e20f431) : null);
            } else {
                if (i17 != 10001) {
                    super.handleMessage(message);
                    return;
                }
                int i18 = message.arg1;
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.m24937x5b09653("Received from service, icon state:" + i18);
                c3113x71559cda.m24951xc47ded65(i18);
            }
        }
    }

    /* renamed from: com.tencent.kinda.framework.app.FingerprintInsets$Property */
    /* loaded from: classes13.dex */
    public static class Property<T> {
        java.lang.String key;

        /* renamed from: value */
        T f11917x6ac9171;

        public Property(java.lang.String str, T t17) {
            this.key = str;
            this.f11917x6ac9171 = t17;
        }

        /* renamed from: value */
        public T m24973x6ac9171() {
            return this.f11917x6ac9171;
        }
    }

    private C3113x71559cda(android.content.Context context) {
        this.f11908xec8370b1 = new java.lang.ref.WeakReference<>(context);
        m24945x3164ae(java.lang.String.format(java.util.Locale.ENGLISH, "model:%s, product:%s, device:%s, manufacturer:%s", wo.w0.m(), android.os.Build.PRODUCT, android.os.Build.DEVICE, android.os.Build.MANUFACTURER));
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda m24936xaf65a0fc(android.content.Context context, com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.FingerprintInsetsListener fingerprintInsetsListener) {
        if (!m24947x36c512ec()) {
            return null;
        }
        if (f11906xbfaed628 == null) {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda c3113x71559cda = new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda(context);
            c3113x71559cda.m24970x37b2e18c(fingerprintInsetsListener);
            c3113x71559cda.m24938x3924522d();
            f11906xbfaed628 = c3113x71559cda;
        }
        return f11906xbfaed628;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: debug */
    public static void m24937x5b09653(java.lang.String str) {
        if (f11905xec4698a1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, str);
        }
    }

    /* renamed from: doBindService */
    private boolean m24938x3924522d() {
        android.content.Context context = this.f11908xec8370b1.get();
        if (context == null) {
            m24937x5b09653("Context missed!");
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            intent.setClassName("com.vivo.fingerprintui", "com.vivo.fingerprintui.export.MessengerService");
        } else {
            intent.setClassName("com.vivo.udfingerprint", "com.vivo.udfingerprint.service.MessengerService");
        }
        intent.putExtra(f11895xe52ffe12, 1);
        intent.putExtra(f11896x764ff40e, 1);
        try {
            if (context.bindService(intent, this.f11907xadf6772b, 1)) {
                m24937x5b09653("Binding.");
                this.f11910x189a9947 = true;
            } else {
                m24945x3164ae("Service not exist");
                this.f11910x189a9947 = false;
                m24950x46138cea();
                android.os.Message.obtain(this.f11909xc7640a1d, 10).sendToTarget();
            }
        } catch (java.lang.SecurityException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "bindService failed:" + e17.getMessage());
        }
        return this.f11910x189a9947;
    }

    /* renamed from: doUnbindService */
    private void m24939xdd3b90b4() {
        if (!this.f11910x189a9947) {
            m24937x5b09653("Service not bound");
            return;
        }
        if (this.f11914x145c7988 != null) {
            m24956xd0c45b1b(android.os.Message.obtain((android.os.Handler) null, 10002));
            this.f11914x145c7988 = null;
        }
        this.f11910x189a9947 = false;
        android.content.Context context = this.f11908xec8370b1.get();
        if (context == null) {
            m24937x5b09653("Context missed!");
        } else {
            context.unbindService(this.f11907xadf6772b);
            m24937x5b09653("Unbinding.");
        }
    }

    /* renamed from: getFingerprintModule */
    private static java.lang.String m24940xe0a0c7ba() {
        java.lang.String m24941x40a81b4b = m24941x40a81b4b("sys.fingerprint.boot", "");
        return android.text.TextUtils.isEmpty(m24941x40a81b4b) ? m24941x40a81b4b("persist.sys.fptype", com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a) : m24941x40a81b4b;
    }

    /* renamed from: getProperty */
    private static java.lang.String m24941x40a81b4b(java.lang.String str, java.lang.String str2) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return (java.lang.String) cls.getMethod("get", java.lang.String.class, java.lang.String.class).invoke(cls, str, str2);
        } catch (java.lang.Exception e17) {
            m24937x5b09653(e17.getMessage());
            return str2;
        }
    }

    /* renamed from: getPropertyBoolean */
    private boolean m24942xc81fae5d(java.lang.String str) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.Property property = this.f11913xa4ff8580.get(str);
        if (property == null) {
            return false;
        }
        return ((java.lang.Boolean) property.m24973x6ac9171()).booleanValue();
    }

    /* renamed from: getPropertyInteger */
    private int m24943x38f9c373(java.lang.String str) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.Property property = this.f11913xa4ff8580.get(str);
        if (property == null) {
            return -1;
        }
        return ((java.lang.Integer) property.m24973x6ac9171()).intValue();
    }

    /* renamed from: getPropertyRect */
    private android.graphics.Rect m24944x2d6a4bcf(java.lang.String str) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.Property property = this.f11913xa4ff8580.get(str);
        if (property == null) {
            return null;
        }
        return (android.graphics.Rect) property.m24973x6ac9171();
    }

    /* renamed from: info */
    private static void m24945x3164ae(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, str);
    }

    /* renamed from: isUdModule */
    private static boolean m24946x7e40e125() {
        java.lang.String m24940xe0a0c7ba = m24940xe0a0c7ba();
        return !android.text.TextUtils.isEmpty(m24940xe0a0c7ba) && m24940xe0a0c7ba.startsWith("udfp_");
    }

    /* renamed from: isVivoDevice */
    private static boolean m24947x36c512ec() {
        return android.os.Build.MANUFACTURER.equalsIgnoreCase("vivo");
    }

    /* renamed from: isX20PlusUD */
    private static boolean m24948x8a23aff5() {
        java.lang.String str = android.os.Build.DEVICE;
        if (str.equalsIgnoreCase("PD1721")) {
            return true;
        }
        return str.equalsIgnoreCase("PD1710") && android.os.Build.VERSION.SDK_INT < 26 && m24946x7e40e125();
    }

    /* renamed from: isX21UD */
    private static boolean m24949x7b9b2e7c() {
        java.lang.String str = android.os.Build.DEVICE;
        if (str.equalsIgnoreCase("PD1728UD")) {
            return true;
        }
        return (str.contains("1728") || str.contains("1725")) && android.os.Build.VERSION.SDK_INT <= 27 && m24946x7e40e125();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* renamed from: loadPropertiesOffline */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m24950x46138cea() {
        /*
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L1b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "fingerprint: "
            r0.<init>(r1)
            java.lang.String r1 = m24940xe0a0c7ba()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            m24937x5b09653(r0)
        L1b:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r1 = m24948x8a23aff5()
            r2 = 540(0x21c, float:7.57E-43)
            r3 = 0
            if (r1 == 0) goto L36
            java.lang.String r1 = "isX20PlusUD"
            m24937x5b09653(r1)
            r1 = 160(0xa0, float:2.24E-43)
            r4 = 2006(0x7d6, float:2.811E-42)
        L32:
            r5 = r4
            r4 = r2
            r2 = r1
            goto L4f
        L36:
            boolean r1 = m24949x7b9b2e7c()
            if (r1 == 0) goto L46
            java.lang.String r1 = "isX21UD"
            m24937x5b09653(r1)
            r1 = 170(0xaa, float:2.38E-43)
            r4 = 1924(0x784, float:2.696E-42)
            goto L32
        L46:
            java.lang.String r1 = "No under display fingerprint detected"
            m24937x5b09653(r1)
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
            r8.m24958xfef647d1(r2, r3)
            goto L79
        L6c:
            java.lang.String r1 = "icon_position"
            r8.m24960x63b346db(r1, r0)
            java.lang.String r0 = "icon_state"
            r8.m24959x6fd05ce7(r0, r4)
            r8.m24958xfef647d1(r2, r4)
        L79:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.m24950x46138cea():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: notifyIconStateChanged */
    public void m24951xc47ded65(int i17) {
        m24959x6fd05ce7(f11894xad3e0b2b, i17);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.FingerprintInsetsListener fingerprintInsetsListener = this.f11911x753a6c41;
        if (fingerprintInsetsListener != null) {
            fingerprintInsetsListener.mo24971xa25277fb(i17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: notifyReady */
    public void m24952x976377da() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.FingerprintInsetsListener fingerprintInsetsListener = this.f11911x753a6c41;
        if (fingerprintInsetsListener != null) {
            fingerprintInsetsListener.mo24972xb03baf04();
        }
    }

    /* renamed from: parsePosition */
    private android.graphics.Rect m24953xfde4b4fc(android.util.JsonReader jsonReader) {
        jsonReader.beginArray();
        int nextInt = jsonReader.hasNext() ? jsonReader.nextInt() : 0;
        int nextInt2 = jsonReader.hasNext() ? jsonReader.nextInt() : 0;
        int nextInt3 = jsonReader.hasNext() ? jsonReader.nextInt() : 0;
        int nextInt4 = jsonReader.hasNext() ? jsonReader.nextInt() : 0;
        jsonReader.endArray();
        return new android.graphics.Rect(nextInt, nextInt2, nextInt3, nextInt4);
    }

    /* renamed from: parseProperties */
    private void m24954x8e080046(android.util.JsonReader jsonReader) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String nextName = jsonReader.nextName();
            if (android.text.TextUtils.equals(nextName, f11894xad3e0b2b)) {
                m24959x6fd05ce7(nextName, jsonReader.nextInt());
            } else if (android.text.TextUtils.equals(nextName, f11892x1139ed1b)) {
                m24958xfef647d1(nextName, jsonReader.nextBoolean());
            } else if (android.text.TextUtils.equals(nextName, f11893x4517182f)) {
                m24960x63b346db(nextName, m24953xfde4b4fc(jsonReader));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: parseQueryResult */
    public void m24955x94620652(java.lang.String str) {
        m24958xfef647d1(f11892x1139ed1b, false);
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                android.util.JsonReader jsonReader = new android.util.JsonReader(new java.io.StringReader(str));
                try {
                    m24954x8e080046(jsonReader);
                    jsonReader.close();
                } finally {
                }
            } catch (java.io.IOException unused) {
                this.f11913xa4ff8580.clear();
            }
        }
        android.os.Message.obtain(this.f11909xc7640a1d, 10).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendMessageToService */
    public boolean m24956xd0c45b1b(android.os.Message message) {
        android.content.Context context;
        android.os.Messenger messenger = this.f11914x145c7988;
        if (messenger == null || (context = this.f11908xec8370b1.get()) == null) {
            return false;
        }
        try {
            android.os.Bundle data = message.getData();
            if (data == null) {
                data = new android.os.Bundle();
            }
            if (!data.containsKey(f11898x7aa95bd9)) {
                data.putString(f11898x7aa95bd9, context.getPackageName());
            }
            message.setData(data);
            message.replyTo = this.f11912x251e0526;
            messenger.send(message);
            return true;
        } catch (android.os.RemoteException unused) {
            return false;
        }
    }

    /* renamed from: setDebugEnable */
    public static void m24957xfb4317f4(boolean z17) {
        f11905xec4698a1 = z17;
    }

    /* renamed from: setPropertyBoolean */
    private void m24958xfef647d1(java.lang.String str, boolean z17) {
        if (this.f11913xa4ff8580.containsKey(str)) {
            m24937x5b09653("update property " + str);
        }
        this.f11913xa4ff8580.put(str, new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.Property(str, java.lang.Boolean.valueOf(z17)));
    }

    /* renamed from: setPropertyInteger */
    private void m24959x6fd05ce7(java.lang.String str, int i17) {
        if (this.f11913xa4ff8580.containsKey(str)) {
            m24937x5b09653("update property " + str);
        }
        this.f11913xa4ff8580.put(str, new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.Property(str, java.lang.Integer.valueOf(i17)));
    }

    /* renamed from: setPropertyRect */
    private void m24960x63b346db(java.lang.String str, android.graphics.Rect rect) {
        this.f11913xa4ff8580.put(str, new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.Property(f11893x4517182f, rect));
    }

    /* renamed from: destroy */
    public void m24961x5cd39ffa() {
        if (f11906xbfaed628 != null) {
            m24939xdd3b90b4();
            this.f11913xa4ff8580.clear();
            this.f11908xec8370b1.clear();
            f11906xbfaed628 = null;
        }
    }

    /* renamed from: getFingerprintIconBottom */
    public int m24962x88408e52() {
        android.graphics.Rect m24944x2d6a4bcf = m24944x2d6a4bcf(f11893x4517182f);
        if (m24944x2d6a4bcf == null) {
            return -1;
        }
        return m24944x2d6a4bcf.bottom;
    }

    /* renamed from: getFingerprintIconLeft */
    public int m24963x339271ee() {
        android.graphics.Rect m24944x2d6a4bcf = m24944x2d6a4bcf(f11893x4517182f);
        if (m24944x2d6a4bcf == null) {
            return -1;
        }
        return m24944x2d6a4bcf.left;
    }

    /* renamed from: getFingerprintIconPosition */
    public android.graphics.Rect m24964x26591f90() {
        android.graphics.Rect m24944x2d6a4bcf = m24944x2d6a4bcf(f11893x4517182f);
        return m24944x2d6a4bcf == null ? new android.graphics.Rect(-1, -1, -1, -1) : new android.graphics.Rect(m24944x2d6a4bcf);
    }

    /* renamed from: getFingerprintIconRight */
    public int m24965x3f122d15() {
        android.graphics.Rect m24944x2d6a4bcf = m24944x2d6a4bcf(f11893x4517182f);
        if (m24944x2d6a4bcf == null) {
            return -1;
        }
        return m24944x2d6a4bcf.right;
    }

    /* renamed from: getFingerprintIconState */
    public int m24966x3f252f8a() {
        return m24943x38f9c373(f11894xad3e0b2b);
    }

    /* renamed from: getFingerprintIconTop */
    public int m24967x4bfc968e() {
        android.graphics.Rect m24944x2d6a4bcf = m24944x2d6a4bcf(f11893x4517182f);
        if (m24944x2d6a4bcf == null) {
            return -1;
        }
        return m24944x2d6a4bcf.top;
    }

    /* renamed from: hasUnderDisplayFingerprint */
    public boolean m24968xae36bbc0() {
        return m24942xc81fae5d(f11892x1139ed1b);
    }

    /* renamed from: isReady */
    public boolean m24969x7b5e8699() {
        return (this.f11910x189a9947 && this.f11913xa4ff8580.isEmpty()) ? false : true;
    }

    /* renamed from: setFingerprintInsetsListener */
    public void m24970x37b2e18c(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3113x71559cda.FingerprintInsetsListener fingerprintInsetsListener) {
        this.f11911x753a6c41 = fingerprintInsetsListener;
    }
}
