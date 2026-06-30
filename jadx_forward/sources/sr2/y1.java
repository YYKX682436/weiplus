package sr2;

/* loaded from: classes10.dex */
public final class y1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f493332d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(sr2.y2 y2Var) {
        super(0);
        this.f493332d = y2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ya2.p1 p1Var = this.f493332d.f493333d;
        if (p1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("locationWidget");
            throw null;
        }
        yv2.b bVar = (yv2.b) p1Var;
        if (!bVar.f547739o) {
            bVar.f547738n = true;
            bVar.a().c();
        }
        return jz5.f0.f384359a;
    }
}
