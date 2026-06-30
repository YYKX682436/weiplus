package xt2;

/* loaded from: classes3.dex */
public final class v4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.b5 f538609d;

    public v4(xt2.b5 b5Var) {
        this.f538609d = b5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initReplaySettings$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.j0.Qj((ml2.j0) c17, 1, 1, 0L, 0, 12, null);
        xt2.b5 b5Var = this.f538609d;
        xt2.b5.A(b5Var, 1, 1, new xt2.u4(b5Var, view));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initReplaySettings$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
