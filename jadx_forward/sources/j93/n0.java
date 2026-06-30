package j93;

/* loaded from: classes.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.r0 f379992d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(j93.r0 r0Var) {
        super(1);
        this.f379992d = r0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof wi5.o)) {
            wi5.o oVar = (wi5.o) dVar;
            j93.r0 r0Var = this.f379992d;
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = r0Var.O6();
            if (O6 != null) {
                v65.i.b(O6, null, new j93.j0(r0Var, oVar, null), 1, null);
            }
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O62 = r0Var.O6();
            if (O62 != null) {
                v65.i.b(O62, null, new j93.m0(r0Var, oVar, null), 1, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
