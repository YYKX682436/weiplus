package bj5;

/* loaded from: classes.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.n f102703d;

    public c(bj5.n nVar, wi5.n0 n0Var) {
        this.f102703d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/mvvm/uic/atsomeone/AtSomeOneTopMenuUIC$onCreate$1$10$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bj5.n nVar = this.f102703d;
        nVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KSelectUserList", "notify@all");
        intent.putExtra("chatroomName", nVar.f102736h);
        nVar.T6(1);
        nVar.m158354x19263085().setResult(-1, intent);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("KSelectUserList", "notify@all");
        bundle.putString("chatroomName", nVar.f102736h);
        p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c c0050x5b3754c = (p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c) ((jz5.n) nVar.f102742q).mo141623x754a37bb();
        if (c0050x5b3754c != null) {
            c0050x5b3754c.b(-1, bundle);
        }
        nVar.m158354x19263085().finish();
        yj0.a.h(this, "com/tencent/mm/ui/mvvm/uic/atsomeone/AtSomeOneTopMenuUIC$onCreate$1$10$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
