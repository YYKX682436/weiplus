package cj5;

/* loaded from: classes.dex */
public final class x2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.y2 f42270d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(cj5.y2 y2Var) {
        super(1);
        this.f42270d = y2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        cj5.y2 y2Var = this.f42270d;
        if (dVar != null && (dVar instanceof wi5.b)) {
            com.tencent.mars.xlog.Log.i("SelectContactOnlyMutiSelectResult", "onCreate: ClickCancelMenuAction");
            y2Var.getActivity().setResult(0, y2Var.getIntent());
            y2Var.getActivity().finish();
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wi5.c0)) {
            wi5.c0 c0Var = (wi5.c0) dVar2;
            com.tencent.mars.xlog.Log.i("SelectContactOnlyMutiSelectResult", "onCreate: SelectConfirmAction  usernameList.size:" + c0Var.f446282b.size());
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Contact", com.tencent.mm.sdk.platformtools.t8.c1(c0Var.f446282b, ","));
            y2Var.getActivity().setResult(-1, intent);
            y2Var.getActivity().finish();
        }
        return jz5.f0.f302826a;
    }
}
