package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe;

/* renamed from: com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework */
/* loaded from: classes14.dex */
public class C27901xdeb6b867 {
    private static final java.lang.String TAG = "YtSDKKitFramework";

    /* renamed from: instance */
    private static com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867 f61764x21169495 = null;

    /* renamed from: version */
    private static final java.lang.String f61765x14f51cd8 = "1.0.8.118.1-wx";

    /* renamed from: eventListener */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitFrameworkEventListener f61767xde76616e;

    /* renamed from: previewRect */
    private android.graphics.Rect f61769xb3088dcc = new android.graphics.Rect(0, 0, 480, 640);

    /* renamed from: detectRect */
    private android.graphics.Rect f61766x8c06eb27 = new android.graphics.Rect(10, 60, 470, 580);

    /* renamed from: networkRequestTimeoutMS */
    private int f61768x4322a346 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;

    /* renamed from: com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$IYTBaseFunctionListener */
    /* loaded from: classes14.dex */
    public interface IYTBaseFunctionListener {
        /* renamed from: base64Encode */
        java.lang.String mo63468xbce55045(byte[] bArr, int i17);

        /* renamed from: getVoiceData */
        byte[] mo63469xc2a8cd46();
    }

    /* renamed from: com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$IYTReflectListener */
    /* loaded from: classes14.dex */
    public interface IYTReflectListener {
        /* renamed from: onGetAppBrightness */
        float mo63471xee427d9b();

        /* renamed from: onReflectEvent */
        void mo63473xbd8fe55c(android.graphics.ColorMatrixColorFilter colorMatrixColorFilter, float f17);

        /* renamed from: onReflectStart */
        void mo63474xbe543724(long j17);
    }

    /* renamed from: com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$IYtSDKKitFrameworkEventListener */
    /* loaded from: classes14.dex */
    public interface IYtSDKKitFrameworkEventListener {
        /* renamed from: onFrameworkEvent */
        void mo63470x53c0c6fb(java.util.HashMap<java.lang.String, java.lang.Object> hashMap);

        /* renamed from: onNetworkRequestEvent */
        void mo63472x2ed2023a(java.lang.String str, java.lang.String str2, java.util.HashMap<java.lang.String, java.lang.String> hashMap, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser);
    }

    /* renamed from: com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$IYtSDKKitNetResponseParser */
    /* loaded from: classes13.dex */
    public interface IYtSDKKitNetResponseParser {
        /* renamed from: onNetworkResponseEvent */
        void mo120776xd218dbca(java.util.HashMap<java.lang.String, java.lang.String> hashMap, java.lang.Exception exc);
    }

    /* renamed from: com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtFrameworkFireEventType */
    /* loaded from: classes14.dex */
    public enum YtFrameworkFireEventType {
        YT_EVENT_TRIGGER_BEGIN_LIVENESS,
        YT_EVENT_TRIGGER_CANCEL_LIVENESS
    }

    /* renamed from: com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode */
    /* loaded from: classes14.dex */
    public enum YtSDKKitFrameworkWorkMode {
        YT_FW_UNKNOWN(0),
        YT_FW_OCR_TYPE(1),
        YT_FW_SILENT_TYPE(2),
        YT_FW_ACTION_TYPE(3),
        YT_FW_REFLECT_TYPE(4),
        YT_FW_ACTREFLECT_TYPE(5),
        YT_FW_LIPREAD_TYPE(6),
        YT_FW_DETECTONLY_TYPE(7),
        YT_FW_OCR_VIID_TYPE(8);

        private static java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode> map = new java.util.HashMap<>();

        /* renamed from: value */
        private int f61784x6ac9171;

        static {
            for (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode : m120783xcee59d22()) {
                map.put(java.lang.Integer.valueOf(ytSDKKitFrameworkWorkMode.f61784x6ac9171), ytSDKKitFrameworkWorkMode);
            }
        }

        YtSDKKitFrameworkWorkMode(int i17) {
            this.f61784x6ac9171 = i17;
        }

        /* renamed from: getValue */
        public int m120784x754a37bb() {
            return this.f61784x6ac9171;
        }

        /* renamed from: valueOf */
        public static com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode m120781xdce0328(int i17) {
            if (map.get(java.lang.Integer.valueOf(i17)) == null) {
                return YT_FW_UNKNOWN;
            }
            return map.get(java.lang.Integer.valueOf(i17));
        }
    }

    /* renamed from: com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKPlatformContext */
    /* loaded from: classes14.dex */
    public static class YtSDKPlatformContext {

        /* renamed from: baseFunctionListener */
        public com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYTBaseFunctionListener f61785x46d5cd9d;

        /* renamed from: cameraHandler */
        public android.os.Handler f61786xdca44865;

        /* renamed from: currentAppContext */
        public android.content.Context f61787xb485b2a7;

        /* renamed from: currentCamera */
        public android.hardware.Camera f61788x695aadfe;

        /* renamed from: currentCameraId */
        public int f61789x7d672fb9;

        /* renamed from: currentRotateState */
        public int f61790x3fe50cbd;

        /* renamed from: imageToComapreType */
        public int f61791x9b5d3e67 = 0;

        /* renamed from: imageToCompare */
        public android.graphics.Bitmap f61792xb20562cf;

        /* renamed from: reflectLayout */
        public android.widget.RelativeLayout f61793xcc30fc47;

        /* renamed from: reflectListener */
        public com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYTReflectListener f61794x2116f291;
    }

    private C27901xdeb6b867() {
    }

    /* renamed from: clearInstance */
    public static synchronized void m120757xf5161202() {
        synchronized (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.class) {
            f61764x21169495 = null;
        }
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867 m120758x9cf0d20b() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867 c27901xdeb6b867;
        synchronized (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.class) {
            if (f61764x21169495 == null) {
                f61764x21169495 = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867();
            }
            c27901xdeb6b867 = f61764x21169495;
        }
        return c27901xdeb6b867;
    }

    /* renamed from: parseStateFrom */
    private com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb m120759xdc96fe68(java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb abstractC27898x7ecec5bb = null;
        try {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb abstractC27898x7ecec5bb2 = (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb) java.lang.Class.forName(str).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            try {
                abstractC27898x7ecec5bb2.mo120730xc7c4b6b1(str, jSONObject);
                return abstractC27898x7ecec5bb2;
            } catch (java.lang.Throwable th6) {
                th = th6;
                abstractC27898x7ecec5bb = abstractC27898x7ecec5bb2;
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "Parse state " + str + "failed:" + th.getMessage());
                return abstractC27898x7ecec5bb;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    /* renamed from: deInit */
    public int m120760xb056bd31() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "sdkkit framework 1.0.8.118.1-wx deinit");
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.m121041xf5161202();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120718x360802();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120702xf5161202();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120660xadb51e13();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120653xf5161202();
        return 0;
    }

    /* renamed from: doPause */
    public void m120761x6bee482b() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120709x57a15e8c();
    }

    /* renamed from: doResume */
    public void m120762x157bec98() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120710x19d51f25();
    }

    /* renamed from: fireEvent */
    public void m120763xed82fe04(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtFrameworkFireEventType ytFrameworkFireEventType, java.lang.Object obj) {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120708x5797ad52(ytFrameworkFireEventType, obj);
    }

    /* renamed from: getDetectRect */
    public android.graphics.Rect m120764x7a47a31d() {
        return this.f61766x8c06eb27;
    }

    /* renamed from: getNetworkRequestTimeoutMS */
    public int m120765x13230b10() {
        return this.f61768x4322a346;
    }

    /* renamed from: getPlatformContext */
    public com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKPlatformContext m120766x76565f86() {
        return com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179();
    }

    /* renamed from: getPreviewRect */
    public android.graphics.Rect m120767x8cded496() {
        return this.f61769xb3088dcc;
    }

    /* renamed from: init */
    public int m120768x316510(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKPlatformContext ytSDKPlatformContext, org.json.JSONObject jSONObject, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, java.util.ArrayList<java.lang.String> arrayList, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitFrameworkEventListener iYtSDKKitFrameworkEventListener) {
        int i17;
        java.lang.String str = TAG;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(str, "sdkkit framework 1.0.8.118.1-wx init");
        if (ytSDKPlatformContext == null) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(str, "Context cannot be null");
            return -1;
        }
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(str, "Pipeline state name cannot be empty");
            return -1;
        }
        if (iYtSDKKitFrameworkEventListener == null) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(str, "Event listener cannot be null");
            return -1;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120718x360802();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120716x2eac842c(iYtSDKKitFrameworkEventListener);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120715xe9f5beed(ytSDKPlatformContext);
        java.util.Iterator<java.lang.String> it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120711xac7e53ae(m120759xdc96fe68(it.next(), jSONObject));
        }
        if (jSONObject.has("thread_priority")) {
            try {
                i17 = jSONObject.getInt("thread_priority");
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "failed to get priority " + e17.getLocalizedMessage());
            }
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120717x68ac462(arrayList.get(0), ytSDKKitFrameworkWorkMode, i17);
            return 0;
        }
        i17 = -20;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120717x68ac462(arrayList.get(0), ytSDKKitFrameworkWorkMode, i17);
        return 0;
    }

    /* renamed from: reset */
    public void m120769x6761d4f() {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.1
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().mo120664x6761d4f();
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120712x6761d4f();
            }
        });
    }

    /* renamed from: setDetectRect */
    public void m120770xa86bf129(android.graphics.Rect rect) {
        this.f61766x8c06eb27 = rect;
    }

    /* renamed from: setNetworkRequestTimeoutMS */
    public void m120771x2952f084(int i17) {
        if (i17 < 0) {
            i17 = 0;
        }
        this.f61768x4322a346 = i17;
    }

    /* renamed from: setPreviewRect */
    public void m120772x2344480a(android.graphics.Rect rect) {
        this.f61769xb3088dcc = rect;
    }

    /* renamed from: updateSDKSetting */
    public void m120773x1b37865f(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120722x1b37865f(jSONObject);
    }

    /* renamed from: updateWithFrameData */
    public int m120774x5101c248(byte[] bArr, int i17, int i18, int i19) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis <= 946684800000L) {
            return com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61518xa259b9bc;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120721xce0038c9(bArr, i17, i18, i19, currentTimeMillis);
        return 0;
    }

    /* renamed from: version */
    public java.lang.String m120775x14f51cd8() {
        return "1.0.8.118.1-wx";
    }
}
