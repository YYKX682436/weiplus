package hq5;

/* loaded from: classes5.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.k0 f364770d;

    public j0(hq5.k0 k0Var) {
        this.f364770d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC$onStateChange$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hq5.k0 k0Var = this.f364770d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f364772d, "click go system ap setting btn");
        jq5.n.f382815a.f(k0Var.m80379x76847179());
        yj0.a.h(this, "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC$onStateChange$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
