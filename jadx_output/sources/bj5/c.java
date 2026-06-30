package bj5;

/* loaded from: classes.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.n f21170d;

    public c(bj5.n nVar, wi5.n0 n0Var) {
        this.f21170d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/mvvm/uic/atsomeone/AtSomeOneTopMenuUIC$onCreate$1$10$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bj5.n nVar = this.f21170d;
        nVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KSelectUserList", "notify@all");
        intent.putExtra("chatroomName", nVar.f21203h);
        nVar.T6(1);
        nVar.getActivity().setResult(-1, intent);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("KSelectUserList", "notify@all");
        bundle.putString("chatroomName", nVar.f21203h);
        android.support.v4.os.ResultReceiver resultReceiver = (android.support.v4.os.ResultReceiver) ((jz5.n) nVar.f21209q).getValue();
        if (resultReceiver != null) {
            resultReceiver.b(-1, bundle);
        }
        nVar.getActivity().finish();
        yj0.a.h(this, "com/tencent/mm/ui/mvvm/uic/atsomeone/AtSomeOneTopMenuUIC$onCreate$1$10$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
