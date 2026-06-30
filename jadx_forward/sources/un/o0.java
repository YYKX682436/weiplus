package un;

/* loaded from: classes.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.p0 f510851d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(un.p0 p0Var) {
        super(1);
        this.f510851d = p0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        un.p0 p0Var = this.f510851d;
        if (dVar != null && (dVar instanceof wi5.o)) {
            wi5.o oVar = (wi5.o) dVar;
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = p0Var.O6();
            if (O6 != null) {
                v65.i.b(O6, null, new un.n0(p0Var, oVar, state, null), 1, null);
            }
        }
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(c0Var.f527815b, ","));
            p0Var.m158354x19263085().setResult(-1, intent);
            p0Var.m158354x19263085().finish();
        }
        return jz5.f0.f384359a;
    }
}
