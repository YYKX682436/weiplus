package zk3;

/* loaded from: classes5.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f555044d;

    public u(zk3.g0 g0Var) {
        this.f555044d = g0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitask/ui/uic/MultiTaskMinusScreenUIC$initUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zk3.g0 g0Var = this.f555044d;
        g0Var.Y6(false, true);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = g0Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.k7((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) a17, true, true, false, false, false, false, false, false, 248, null);
        yj0.a.h(this, "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskMinusScreenUIC$initUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
