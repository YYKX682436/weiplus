package xt2;

/* loaded from: classes3.dex */
public final class a4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.dv1 f538152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.b5 f538153e;

    public a4(r45.dv1 dv1Var, xt2.b5 b5Var) {
        this.f538152d = dv1Var;
        this.f538153e = b5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initAnchorPresenterSettings$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bw5.q30 q30Var = (bw5.q30) this.f538152d.m75936x14adae67(41);
        if (q30Var != null) {
            bw5.x7 x7Var = q30Var.f113453g[3] ? q30Var.f113452f : new bw5.x7();
            if (x7Var != null) {
                i95.m c17 = i95.n0.c(pq.q.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                pq.q.Lb((pq.q) c17, new pq.a(this.f538153e.f199914d), x7Var, null, 4, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel$initAnchorPresenterSettings$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
