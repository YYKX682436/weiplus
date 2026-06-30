package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final class s3 extends com.tencent.mm.app.n3 {

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53765k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53766l;

    public s3() {
        super("system.info");
        new com.tencent.mm.app.m3(this.f53529j, "BRAND", false, false, null, null, null).e(android.os.Build.BRAND);
        new com.tencent.mm.app.m3(this.f53529j, "MODEL", false, false, null, null, null).e(android.os.Build.MODEL);
        new com.tencent.mm.app.m3(this.f53529j, "FINGERPRINT", false, false, null, null, null).e(android.os.Build.FINGERPRINT);
        new com.tencent.mm.app.m3(this.f53529j, "API_LEVEL", false, false, null, null, null).e(java.lang.Integer.toString(android.os.Build.VERSION.SDK_INT));
        com.tencent.mm.app.m3 m3Var = new com.tencent.mm.app.m3(this.f53529j, "ARCH", false, false, null, null, null);
        m3Var.e(android.os.Build.CPU_ABI);
        this.f53765k = m3Var;
        this.f53766l = new com.tencent.mm.app.m3(this.f53529j, "IMEI", false, false, null, null, null);
        new com.tencent.mm.app.m3(this.f53529j, "MORE", false, false, null, null, null).e("MANUFACTURER:[" + android.os.Build.MANUFACTURER + "] DEVICE:[" + android.os.Build.DEVICE + "] PRODUCT:[" + android.os.Build.PRODUCT + "] BOARD:[" + android.os.Build.BOARD + "] DISPLAY:[" + android.os.Build.DISPLAY + "] VERSION.CODENAME:[" + android.os.Build.VERSION.CODENAME + "] VERSION.RELEASE:[" + android.os.Build.VERSION.RELEASE + "] VERSION.INCREMENTAL:[" + android.os.Build.VERSION.INCREMENTAL + "] HOST:[" + android.os.Build.HOST + "] TAGS:[" + android.os.Build.TAGS + "] TYPE:[" + android.os.Build.TYPE + "] USER:[" + android.os.Build.USER + "]");
    }
}
