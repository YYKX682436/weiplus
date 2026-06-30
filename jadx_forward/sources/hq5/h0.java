package hq5;

/* loaded from: classes5.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.k0 f364766d;

    public h0(hq5.k0 k0Var) {
        this.f364766d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC$onStateChange$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hq5.k0 k0Var = this.f364766d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f364772d, "click retry btn");
        j75.f Q6 = k0Var.Q6();
        if (Q6 != null) {
            Q6.B3(new eq5.f());
        }
        yj0.a.h(this, "com/tencent/mm/wedrop/ui/uic/ui/WeDropProgressUIC$onStateChange$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
