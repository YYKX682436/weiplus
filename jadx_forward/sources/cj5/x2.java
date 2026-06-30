package cj5;

/* loaded from: classes.dex */
public final class x2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.y2 f123803d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(cj5.y2 y2Var) {
        super(1);
        this.f123803d = y2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        cj5.y2 y2Var = this.f123803d;
        if (dVar != null && (dVar instanceof wi5.b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SelectContactOnlyMutiSelectResult", "onCreate: ClickCancelMenuAction");
            y2Var.m158354x19263085().setResult(0, y2Var.m158359x1e885992());
            y2Var.m158354x19263085().finish();
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof wi5.c0)) {
            wi5.c0 c0Var = (wi5.c0) dVar2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SelectContactOnlyMutiSelectResult", "onCreate: SelectConfirmAction  usernameList.size:" + c0Var.f527815b.size());
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(c0Var.f527815b, ","));
            y2Var.m158354x19263085().setResult(-1, intent);
            y2Var.m158354x19263085().finish();
        }
        return jz5.f0.f384359a;
    }
}
