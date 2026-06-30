package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class s2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.w2 f72795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.u2 f72796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.v2 f72797f;

    public s2(com.tencent.mm.plugin.aa.ui.v2 v2Var, com.tencent.mm.plugin.aa.ui.w2 w2Var, com.tencent.mm.plugin.aa.ui.u2 u2Var) {
        this.f72797f = v2Var;
        this.f72795d = w2Var;
        this.f72796e = u2Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$AmountSelectListAdapter$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.aa.ui.v2 v2Var = this.f72797f;
        com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI = v2Var.f72851e;
        com.tencent.mm.plugin.aa.ui.w2 w2Var = this.f72795d;
        if (!com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI.f7(launchAAByPersonAmountSelectUI, w2Var)) {
            this.f72796e.f72831i.q(v2Var.f72851e);
            yj0.a.i(false, this, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$AmountSelectListAdapter$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (v2Var.f72851e.i7() && c01.z1.r().equals(w2Var.f72870a)) {
            db5.t7.g(v2Var.f72851e.getContext(), v2Var.f72851e.getContext().getString(com.tencent.mm.R.string.iep));
        }
        if (v2Var.f72851e.i7() && !h61.o.o(v2Var.f72851e.f72497z, w2Var.f72870a)) {
            db5.t7.g(v2Var.f72851e.getContext(), v2Var.f72851e.getContext().getString(com.tencent.mm.R.string.ier));
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$AmountSelectListAdapter$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
