package c04;

/* loaded from: classes13.dex */
public final class s implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.api.ScanGoodsRequest f37690a;

    public s(com.tencent.mm.plugin.scanner.api.ScanGoodsRequest scanGoodsRequest) {
        this.f37690a = scanGoodsRequest;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        android.graphics.Bitmap a17 = com.tencent.mm.plugin.scanner.model.n1.f158959a.a(this.f37690a.f158673r);
        if (a17 == null || a17.isRecycled()) {
            km5.u.b().a(nm5.j.c(java.lang.Boolean.FALSE, "tipsImage getResource failed"));
            return null;
        }
        try {
            if (!a17.isRecycled()) {
                a17 = com.tencent.mm.sdk.platformtools.x.s0(a17, false, (float) java.lang.Math.floor(((a17.getWidth() > a17.getHeight() ? a17.getWidth() : a17.getHeight()) / 2.0d) + 0.5d));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanViewUtils", e17, "decodeRoundBitmap exception", new java.lang.Object[0]);
            a17 = null;
        }
        return a17;
    }
}
