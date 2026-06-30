package g75;

/* loaded from: classes11.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g75.f0 f350892d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g75.f0 f0Var) {
        super(1);
        this.f350892d = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        g75.z state = (g75.z) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null) {
            g75.f0 f0Var = this.f350892d;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f0Var.f350898c, dVar.getClass())) {
                v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) f0Var.f350897b).mo141623x754a37bb(), null, new g75.c0(f0Var, state, dVar, null), 1, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
