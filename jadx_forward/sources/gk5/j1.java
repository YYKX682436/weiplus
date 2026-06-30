package gk5;

/* loaded from: classes.dex */
public final class j1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.k1 f354210d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(gk5.k1 k1Var) {
        super(1);
        this.f354210d = k1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        gk5.k1 k1Var = this.f354210d;
        if (c0Var != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_User", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(c0Var.f527815b, ","));
            intent.putExtra("label_source", state.f527845e);
            intent.putExtra("Is_Chatroom", c0Var.f527816c == 1);
            intent.putExtra("scene_from", 13);
            k1Var.m158354x19263085().setResult(-1, intent);
            k1Var.m158354x19263085().finish();
        }
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof wi5.o)) {
            wi5.o oVar = (wi5.o) dVar;
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = k1Var.O6();
            if (O6 != null) {
                v65.i.b(O6, null, new gk5.f1(state, k1Var, oVar, null), 1, null);
            }
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O62 = k1Var.O6();
            if (O62 != null) {
                v65.i.b(O62, null, new gk5.i1(k1Var, oVar, state, null), 1, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
