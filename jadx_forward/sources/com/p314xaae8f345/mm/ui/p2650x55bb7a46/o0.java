package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public ot0.q f283577d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f283578e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f283579f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f283580g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f283581h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f283582i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f283583m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f283584n;

    public o0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.j0 j0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap f17;
        byte[] bArr;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f283579f)) {
            f17 = l01.d0.f396294a.f(this.f283580g, null);
        } else {
            f17 = l01.d0.f396294a.f("file://" + this.f283579f, null);
            if (f17 == null || f17.isRecycled()) {
                f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(this.f283580g);
                if (this.f283583m) {
                    com.p314xaae8f345.mm.vfs.w6.h(this.f283579f);
                }
            }
        }
        if (f17 == null || f17.isRecycled()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(this.f283584n != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandServiceChattingUI", "thumb image is null sendMessageDefaultImg:%b", objArr);
            bArr = this.f283584n;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandServiceChattingUI", "thumb image is not null ");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            f17.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(this.f283577d, this.f283578e, this.f283582i, this.f283581h, null, bArr);
    }
}
