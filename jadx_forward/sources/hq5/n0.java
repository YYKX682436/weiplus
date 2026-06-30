package hq5;

/* loaded from: classes5.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.t0 f364785d;

    public n0(hq5.t0 t0Var) {
        this.f364785d = t0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wedrop/ui/uic/ui/WeDropSelectFileUIC$onStateChange$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hq5.t0 t0Var = this.f364785d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t0Var.f364804d, "click selectImg");
        t0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        ((e60.k1) i95.n0.c(e60.k1.class)).getClass();
        pf5.j0.a(intent, i33.h.class);
        intent.putExtra("key_force_show_raw_iamge_size", true);
        intent.putExtra("key_wedrop_select_size_limit", t0Var.f364809i);
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = t0Var.m158354x19263085();
        int i17 = t0Var.f364805e;
        ((ub0.r) oVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.c(m158354x19263085, i17, 99, 49, 3, false, intent);
        yj0.a.h(this, "com/tencent/mm/wedrop/ui/uic/ui/WeDropSelectFileUIC$onStateChange$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
