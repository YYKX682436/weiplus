package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public final class s3 extends com.p314xaae8f345.mm.app.n3 {

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135298k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135299l;

    public s3() {
        super("system.info");
        new com.p314xaae8f345.mm.app.m3(this.f135062j, "BRAND", false, false, null, null, null).e(android.os.Build.BRAND);
        new com.p314xaae8f345.mm.app.m3(this.f135062j, "MODEL", false, false, null, null, null).e(android.os.Build.MODEL);
        new com.p314xaae8f345.mm.app.m3(this.f135062j, "FINGERPRINT", false, false, null, null, null).e(android.os.Build.FINGERPRINT);
        new com.p314xaae8f345.mm.app.m3(this.f135062j, "API_LEVEL", false, false, null, null, null).e(java.lang.Integer.toString(android.os.Build.VERSION.SDK_INT));
        com.p314xaae8f345.mm.app.m3 m3Var = new com.p314xaae8f345.mm.app.m3(this.f135062j, "ARCH", false, false, null, null, null);
        m3Var.e(android.os.Build.CPU_ABI);
        this.f135298k = m3Var;
        this.f135299l = new com.p314xaae8f345.mm.app.m3(this.f135062j, "IMEI", false, false, null, null, null);
        new com.p314xaae8f345.mm.app.m3(this.f135062j, "MORE", false, false, null, null, null).e("MANUFACTURER:[" + android.os.Build.MANUFACTURER + "] DEVICE:[" + android.os.Build.DEVICE + "] PRODUCT:[" + android.os.Build.PRODUCT + "] BOARD:[" + android.os.Build.BOARD + "] DISPLAY:[" + android.os.Build.DISPLAY + "] VERSION.CODENAME:[" + android.os.Build.VERSION.CODENAME + "] VERSION.RELEASE:[" + android.os.Build.VERSION.RELEASE + "] VERSION.INCREMENTAL:[" + android.os.Build.VERSION.INCREMENTAL + "] HOST:[" + android.os.Build.HOST + "] TAGS:[" + android.os.Build.TAGS + "] TYPE:[" + android.os.Build.TYPE + "] USER:[" + android.os.Build.USER + "]");
    }
}
