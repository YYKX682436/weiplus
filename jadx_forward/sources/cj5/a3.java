package cj5;

/* loaded from: classes.dex */
public final class a3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.b3 f123600d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(cj5.b3 b3Var) {
        super(1);
        this.f123600d = b3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof wi5.c0)) {
            wi5.c0 c0Var = (wi5.c0) dVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactResultUIC", "onCreate: SelectConfirmAction  usernameList.size:" + c0Var.f527815b.size());
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_User", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(c0Var.f527815b, ","));
            cj5.b3 b3Var = this.f123600d;
            b3Var.m158354x19263085().setResult(-1, intent);
            b3Var.m158354x19263085().finish();
        }
        return jz5.f0.f384359a;
    }
}
