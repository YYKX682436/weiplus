package ax;

/* loaded from: classes7.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq0.x f14957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(fq0.x xVar) {
        super(0);
        this.f14957d = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fq0.x xVar = this.f14957d;
        if (xVar.f265483g > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBrandFlutterPluginBase", "saveCardHeight " + xVar);
            rv.p2 p2Var = (rv.p2) i95.n0.c(rv.p2.class);
            int i17 = xVar.f265483g;
            vw.b bVar = (vw.b) p2Var;
            bVar.getClass();
            java.lang.String frameSetName = xVar.f265477a;
            kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
            jz5.g gVar = bVar.f440590d;
            if (i17 <= 0) {
                ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).remove(frameSetName);
            } else {
                ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).putInt(frameSetName, i17);
            }
        }
        return jz5.f0.f302826a;
    }
}
