package e0;

/* loaded from: classes5.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f327254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f327255e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(n0.e5 e5Var, n0.v2 v2Var) {
        super(0);
        this.f327254d = e5Var;
        this.f327255e = v2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        e0.y0 y0Var = new e0.y0();
        ((yz5.l) this.f327254d.mo128745x754a37bb()).mo146xb9724478(y0Var);
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.d dVar = y0Var.f327257b;
        java.util.List list = y0Var.f327258c;
        if (list == null) {
            list = kz5.p0.f395529d;
        }
        return new e0.a0(dVar, list, (e06.k) this.f327255e.mo128745x754a37bb());
    }
}
