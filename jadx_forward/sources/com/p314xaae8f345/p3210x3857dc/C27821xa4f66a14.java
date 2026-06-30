package com.p314xaae8f345.p3210x3857dc;

/* renamed from: com.tencent.xweb.XWebExtendPluginClient */
/* loaded from: classes7.dex */
public class C27821xa4f66a14 extends com.p314xaae8f345.p3210x3857dc.p3211xcdc6dad4.a {

    /* renamed from: NATIVE_VIEW_TYPE */
    public static final java.lang.String f61118x53f63a6c = "native_view";
    private static final java.lang.String TAG = "XWebExtendPluginClient";

    /* renamed from: mNativeViewClientMap */
    private final java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p3210x3857dc.j2> f61119xf8bbbbe8 = new java.util.HashMap<>();
    public com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 obj;

    public C27821xa4f66a14(com.p314xaae8f345.p3210x3857dc.i2 i2Var) {
        super.m120240x316510(i2Var);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3211xcdc6dad4.a
    /* renamed from: initPSWebView */
    public void mo120208x94b0d186(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9) {
        super.mo120208x94b0d186(c27847xac2547f9);
    }

    /* renamed from: onNativeViewReady */
    public com.p314xaae8f345.p3210x3857dc.k2 m120215x32c9d7c8(int i17) {
        return null;
    }

    /* renamed from: onPluginDestroy */
    public void mo120216x5444bda8(java.lang.String str, int i17) {
        if (f61118x53f63a6c.equals(str) && this.f61119xf8bbbbe8.containsKey(java.lang.Integer.valueOf(i17))) {
            this.f61119xf8bbbbe8.get(java.lang.Integer.valueOf(i17)).getClass();
            this.f61119xf8bbbbe8.remove(java.lang.Integer.valueOf(i17));
        }
    }

    /* renamed from: onPluginManagerDestroy */
    public void m120217x23805e1f() {
        by5.c4.f(TAG, "[onPluginManagerDestroy]");
        java.util.Iterator<com.p314xaae8f345.p3210x3857dc.j2> it = this.f61119xf8bbbbe8.values().iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        this.f61119xf8bbbbe8.clear();
    }

    /* renamed from: onPluginReady */
    public void mo120218x514e8ad1(java.lang.String str, int i17, android.graphics.SurfaceTexture surfaceTexture) {
    }

    /* renamed from: onPluginReadyForGPUProcess */
    public void mo120219x7230127b(java.lang.String str, int i17, android.view.Surface surface) {
    }

    /* renamed from: onPluginScreenshotTaken */
    public void mo120220xb1e0e6af(java.lang.String str, int i17, android.graphics.Bitmap bitmap) {
    }

    /* renamed from: onPluginSizeChanged */
    public void m120221xc1c1de21(java.lang.String str, int i17, int i18, int i19, android.graphics.SurfaceTexture surfaceTexture) {
        if (f61118x53f63a6c.equals(str)) {
            if (!this.f61119xf8bbbbe8.containsKey(java.lang.Integer.valueOf(i17))) {
                m120215x32c9d7c8(i17);
                by5.c4.c(TAG, "onPluginSizeChanged, onNativeViewReady return null");
                return;
            }
            this.f61119xf8bbbbe8.get(java.lang.Integer.valueOf(i17)).a(i18, i19);
        }
        by5.c4.f(TAG, "onPluginSizeChanged type:" + str + ", embedId:" + i17 + ", width:" + i18 + ", height:" + i19);
        if (surfaceTexture == null || i18 <= 0 || i19 <= 0) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(i18, i19);
    }

    /* renamed from: onPluginSizeChangedForGPUProcess */
    public void m120222x124aa12b(java.lang.String str, int i17, int i18, int i19, android.view.Surface surface) {
        if (f61118x53f63a6c.equals(str)) {
            if (this.f61119xf8bbbbe8.containsKey(java.lang.Integer.valueOf(i17))) {
                this.f61119xf8bbbbe8.get(java.lang.Integer.valueOf(i17)).a(i18, i19);
            } else {
                m120215x32c9d7c8(i17);
                by5.c4.c(TAG, "onPluginSizeChanged onNativeViewReady return null");
            }
        }
    }

    /* renamed from: onPluginTouch */
    public void m120224x516f906d(java.lang.String str, int i17, java.lang.String str2) {
    }

    /* renamed from: setPluginTextureScale */
    public void mo120225xc0b8afc4(java.lang.String str, int i17, float f17, float f18) {
        if (this.f61126xfa790d36 == 1) {
            this.f61125x344b8c76.mo120409xc0b8afc4(str, i17, f17, f18);
        }
    }

    /* renamed from: takePluginScreenshot */
    public void mo120226xf63e37a0(java.lang.String str, int i17) {
        if (this.f61126xfa790d36 == 1) {
            this.f61125x344b8c76.mo120421xf63e37a0(str, i17);
        }
    }

    /* renamed from: onPluginTouch */
    public void mo120223x516f906d(java.lang.String str, int i17, android.view.MotionEvent motionEvent) {
        if (f61118x53f63a6c.equals(str) && this.f61119xf8bbbbe8.containsKey(java.lang.Integer.valueOf(i17))) {
            this.f61119xf8bbbbe8.get(java.lang.Integer.valueOf(i17)).f301854a.dispatchTouchEvent(motionEvent);
        }
    }
}
