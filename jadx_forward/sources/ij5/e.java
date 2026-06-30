package ij5;

/* loaded from: classes.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.f f373299d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ij5.f fVar) {
        super(1);
        this.f373299d = fVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        j75.f Q6;
        j75.e eVar;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        ij5.f fVar = this.f373299d;
        if (dVar != null && (dVar instanceof wi5.f0) && (eVar = ((wi5.f0) dVar).f379600a) != null && (eVar instanceof wi5.g0)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KSelectUserList", ((wi5.g0) eVar).f527823a.mo14344x5f01b1f6());
            fVar.m158354x19263085().setResult(-1, intent);
            fVar.m158354x19263085().finish();
        }
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null && (Q6 = fVar.Q6()) != null) {
            Q6.B3(new wi5.f0(c0Var.f527815b));
        }
        return jz5.f0.f384359a;
    }
}
