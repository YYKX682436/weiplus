package un;

/* loaded from: classes.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.g1 f510863d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(un.g1 g1Var) {
        super(1);
        this.f510863d = g1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof wi5.c)) {
            un.g1 g1Var = this.f510863d;
            boolean z17 = g1Var.f510794i;
            if (z17 || g1Var.f510798p) {
                un.a aVar = new un.a(true);
                aVar.f510764b = z17;
                aVar.f510765c = g1Var.f510798p;
                dVar.a(aVar);
            } else if (g1Var.f510795m || g1Var.f510799q) {
                un.a aVar2 = new un.a(true);
                aVar2.f510766d = g1Var.f510799q;
                dVar.a(aVar2);
            }
        }
        return jz5.f0.f384359a;
    }
}
