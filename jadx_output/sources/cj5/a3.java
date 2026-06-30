package cj5;

/* loaded from: classes.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.b3 f42067d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(cj5.b3 b3Var) {
        super(1);
        this.f42067d = b3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.c0)) {
            wi5.c0 c0Var = (wi5.c0) dVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactResultUIC", "onCreate: SelectConfirmAction  usernameList.size:" + c0Var.f446282b.size());
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_User", com.tencent.mm.sdk.platformtools.t8.c1(c0Var.f446282b, ","));
            cj5.b3 b3Var = this.f42067d;
            b3Var.getActivity().setResult(-1, intent);
            b3Var.getActivity().finish();
        }
        return jz5.f0.f302826a;
    }
}
