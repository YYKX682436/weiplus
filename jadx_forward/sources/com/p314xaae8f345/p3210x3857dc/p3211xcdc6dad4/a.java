package com.p314xaae8f345.p3210x3857dc.p3211xcdc6dad4;

/* loaded from: classes7.dex */
public abstract class a {
    private static final java.lang.String TAG = "PinusAdaptClient";

    /* renamed from: XWEB_PINUS */
    public static final int f61124xa63314b0 = 1;

    /* renamed from: psWebview */
    protected com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 f61125x344b8c76;

    /* renamed from: xwebType */
    public int f61126xfa790d36 = -1;

    /* renamed from: init */
    public void m120240x316510(com.p314xaae8f345.p3210x3857dc.i2 i2Var) {
        if (i2Var instanceof com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9) {
            mo120208x94b0d186((com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9) i2Var);
        } else {
            by5.c4.c(TAG, "PinusAdaptClient constructor error");
        }
        if (this.f61126xfa790d36 != -1) {
            return;
        }
        by5.c4.c(TAG, "xwebType = -1, super init not call view:" + i2Var);
        throw new java.lang.RuntimeException("PinusAdaptClient init error royle");
    }

    /* renamed from: initPSWebView */
    public void mo120208x94b0d186(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9) {
        this.f61126xfa790d36 = 1;
        this.f61125x344b8c76 = c27847xac2547f9;
    }
}
