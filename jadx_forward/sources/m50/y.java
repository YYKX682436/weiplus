package m50;

/* loaded from: classes.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m50.z f405056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(m50.z zVar) {
        super(1);
        this.f405056d = zVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectOnlyUIC", "SelectConfirmAction usernameList:" + c0Var.f527815b + ": ");
            android.content.Intent putExtra = new android.content.Intent().putExtra("Select_Conv_User", kz5.n0.g0(c0Var.f527815b, ",", null, null, 0, null, null, 62, null));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra, "putExtra(...)");
            m50.z zVar = this.f405056d;
            zVar.m158354x19263085().setResult(-1, putExtra);
            zVar.m158354x19263085().finish();
        }
        return jz5.f0.f384359a;
    }
}
