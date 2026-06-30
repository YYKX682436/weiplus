package ax;

/* loaded from: classes7.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq0.x f96490d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(fq0.x xVar) {
        super(0);
        this.f96490d = xVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fq0.x xVar = this.f96490d;
        if (xVar.f347016g > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBrandFlutterPluginBase", "saveCardHeight " + xVar);
            rv.p2 p2Var = (rv.p2) i95.n0.c(rv.p2.class);
            int i17 = xVar.f347016g;
            vw.b bVar = (vw.b) p2Var;
            bVar.getClass();
            java.lang.String frameSetName = xVar.f347010a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
            jz5.g gVar = bVar.f522123d;
            if (i17 <= 0) {
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).remove(frameSetName);
            } else {
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).putInt(frameSetName, i17);
            }
        }
        return jz5.f0.f384359a;
    }
}
