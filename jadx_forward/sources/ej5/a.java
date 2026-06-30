package ej5;

/* loaded from: classes.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej5.b f334927d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ej5.b bVar) {
        super(1);
        this.f334927d = bVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        ej5.b bVar = this.f334927d;
        if (dVar != null && (dVar instanceof wi5.b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BackUpProcessResultUIC", "onCreate: ClickCancelMenuAction");
            bVar.m158354x19263085().setResult(0, bVar.m158359x1e885992());
            bVar.m158354x19263085().finish();
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof wi5.c0)) {
            wi5.c0 c0Var = (wi5.c0) dVar2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BackUpProcessResultUIC", "onCreate: SelectConfirmAction  usernameList.size:" + c0Var.f527815b.size());
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(c0Var.f527815b, ","));
            bVar.m158354x19263085().setResult(-1, intent);
            bVar.m158354x19263085().finish();
        }
        return jz5.f0.f384359a;
    }
}
