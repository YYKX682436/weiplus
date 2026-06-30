package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes8.dex */
public final class l8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public ot0.q f289381d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f289382e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f289383f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f289384g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f289385h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f289386i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f289387m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f289388n;

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap f17;
        byte[] bArr;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f289383f)) {
            f17 = l01.d0.f396294a.f(this.f289384g, null);
        } else {
            f17 = l01.d0.f396294a.f("file://" + this.f289383f, null);
            if (f17 == null || f17.isRecycled()) {
                f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(this.f289384g);
                if (this.f289387m) {
                    com.p314xaae8f345.mm.vfs.w6.h(this.f289383f);
                }
            }
        }
        if (f17 == null || f17.isRecycled()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(this.f289388n != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenImKefuQuickBubbleDefaultHandler", "thumb image is null sendMessageDefaultImg:%b", objArr);
            bArr = this.f289388n;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenImKefuQuickBubbleDefaultHandler", "thumb image is not null ");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            f17.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(this.f289381d, this.f289382e, this.f289386i, this.f289385h, null, bArr);
    }
}
