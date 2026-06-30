package j93;

/* loaded from: classes.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.l1 f379959d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(j93.l1 l1Var) {
        super(1);
        this.f379959d = l1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Contact", kz5.n0.g0(c0Var.f527815b, ",", null, null, 0, null, null, 62, null));
            j93.l1 l1Var = this.f379959d;
            l1Var.m158354x19263085().setResult(-1, intent);
            l1Var.m158354x19263085().finish();
        }
        return jz5.f0.f384359a;
    }
}
