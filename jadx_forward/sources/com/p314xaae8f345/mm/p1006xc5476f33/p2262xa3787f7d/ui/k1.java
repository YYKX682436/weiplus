package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f254579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18572xa5ae0822 f254580e;

    public k1(android.widget.Button button, com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18572xa5ae0822 activityC18572xa5ae0822) {
        this.f254579d = button;
        this.f254580e = activityC18572xa5ae0822;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/BindGuardianUI$updateView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.Button button = this.f254579d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(button.getContext());
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18572xa5ae0822 activityC18572xa5ae0822 = this.f254580e;
        u1Var.u(activityC18572xa5ae0822.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jrd));
        u1Var.g(activityC18572xa5ae0822.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jrc));
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.jre);
        u1Var.k(button.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31));
        u1Var.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.j1(activityC18572xa5ae0822));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/BindGuardianUI$updateView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
