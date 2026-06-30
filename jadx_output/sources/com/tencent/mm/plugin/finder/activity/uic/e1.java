package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.h1 f101868d;

    public e1(com.tencent.mm.plugin.finder.activity.uic.h1 h1Var) {
        this.f101868d = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/uic/FinderActivitySelectCoverUIC$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.activity.uic.h1 h1Var = this.f101868d;
        if (h1Var.f101889r) {
            h1Var.getClass();
            h1Var.f101887p = "";
            h1Var.f101888q = true;
            h1Var.S6("");
            h1Var.Q6();
        } else {
            com.tencent.mm.plugin.finder.activity.uic.h1.O6(h1Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivitySelectCoverUIC$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
