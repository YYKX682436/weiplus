package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes8.dex */
public final class i8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public ot0.q f289282d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f289283e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f289284f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f289285g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f289286h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f289287i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f289288m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f289289n;

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap f17;
        byte[] bArr;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f289284f)) {
            f17 = l01.d0.f396294a.f(this.f289285g, null);
        } else {
            f17 = l01.d0.f396294a.f("file://" + this.f289284f, null);
            if (f17 == null || f17.isRecycled()) {
                f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(this.f289285g);
                if (this.f289288m) {
                    com.p314xaae8f345.mm.vfs.w6.h(this.f289284f);
                }
            }
        }
        if (f17 == null || f17.isRecycled()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(this.f289289n != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenImKefuQuickBubbleDefaultHandler", "thumb image is null sendMessageDefaultImg:%b", objArr);
            bArr = this.f289289n;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenImKefuQuickBubbleDefaultHandler", "thumb image is not null ");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            f17.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(this.f289282d, this.f289283e, this.f289287i, this.f289286h, null, bArr);
    }
}
