package bh1;

/* loaded from: classes7.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f102380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1150x37bf4c.C12405x433a833 f102381e;

    public a(byte[] bArr, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1150x37bf4c.C12405x433a833 c12405x433a833) {
        this.f102380d = bArr;
        this.f102381e = c12405x433a833;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr = this.f102380d;
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p786x600aa8b.e.a(bArr, 0, bArr.length);
        java.lang.String str = lp0.b.i() + "wmpf_qrcode.png";
        com.p314xaae8f345.mm.vfs.w6.u(lp0.b.i());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(a17, 100, android.graphics.Bitmap.CompressFormat.PNG, str, true);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1150x37bf4c.ActivityC12406x137ca985.f167208e.a(this.f102381e.getContext(), str);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.WMPFAccessibleProvider", th6, "WMPFQRCodeDetectProxyUI.waitFor", new java.lang.Object[0]);
        }
    }
}
