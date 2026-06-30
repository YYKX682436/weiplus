package bj5;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.y f21233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f21234e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(bj5.y yVar, java.lang.String str) {
        super(1);
        this.f21233d = yVar;
        this.f21234e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.p pVar = (wi5.p) state.a(wi5.p.class);
        bj5.y yVar = this.f21233d;
        if (pVar != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerView k17 = ((em.l2) ((jz5.n) yVar.f21246e).getValue()).k();
            kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
            if (a17 instanceof com.tencent.mm.ui.mvvm.list.SelectContactMvvmList) {
                ((em.l2) ((jz5.n) yVar.f21246e).getValue()).l().setAlphabet(new java.lang.String[]{"🔍", "#"});
                ((com.tencent.mm.ui.mvvm.list.SelectContactMvvmList) a17).f152071u.observe(yVar.getActivity(), new bj5.s(yVar, a17));
            }
        }
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KSelectUserList", kz5.n0.g0(c0Var.f446282b, ",", null, null, 0, null, null, 62, null));
            java.lang.String str = this.f21234e;
            intent.putExtra("chatroomName", str);
            yVar.getActivity().setResult(-1, intent);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("KSelectUserList", kz5.n0.g0(c0Var.f446282b, ",", null, null, 0, null, null, 62, null));
            bundle.putString("chatroomName", str);
            android.support.v4.os.ResultReceiver resultReceiver = (android.support.v4.os.ResultReceiver) ((jz5.n) yVar.f21247f).getValue();
            if (resultReceiver != null) {
                resultReceiver.b(-1, bundle);
            }
            yVar.getActivity().finish();
        }
        return jz5.f0.f302826a;
    }
}
