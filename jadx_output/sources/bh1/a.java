package bh1;

/* loaded from: classes7.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f20847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.wmpf.WMPFAccessibleProvider f20848e;

    public a(byte[] bArr, com.tencent.mm.plugin.appbrand.luggage.export.wmpf.WMPFAccessibleProvider wMPFAccessibleProvider) {
        this.f20847d = bArr;
        this.f20848e = wMPFAccessibleProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr = this.f20847d;
        android.graphics.Bitmap a17 = com.tencent.mm.graphics.e.a(bArr, 0, bArr.length);
        java.lang.String str = lp0.b.i() + "wmpf_qrcode.png";
        com.tencent.mm.vfs.w6.u(lp0.b.i());
        com.tencent.mm.sdk.platformtools.x.D0(a17, 100, android.graphics.Bitmap.CompressFormat.PNG, str, true);
        try {
            com.tencent.mm.plugin.appbrand.luggage.export.wmpf.WMPFQRCodeDetectProxyUI.f85675e.a(this.f20848e.getContext(), str);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.WMPFAccessibleProvider", th6, "WMPFQRCodeDetectProxyUI.waitFor", new java.lang.Object[0]);
        }
    }
}
