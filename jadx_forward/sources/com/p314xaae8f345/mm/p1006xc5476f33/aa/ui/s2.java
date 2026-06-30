package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class s2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w2 f154328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.u2 f154329e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.v2 f154330f;

    public s2(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.v2 v2Var, com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w2 w2Var, com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.u2 u2Var) {
        this.f154330f = v2Var;
        this.f154328d = w2Var;
        this.f154329e = u2Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$AmountSelectListAdapter$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.v2 v2Var = this.f154330f;
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11348xdd034dc7 activityC11348xdd034dc7 = v2Var.f154384e;
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w2 w2Var = this.f154328d;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11348xdd034dc7.f7(activityC11348xdd034dc7, w2Var)) {
            this.f154329e.f154364i.q(v2Var.f154384e);
            yj0.a.i(false, this, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$AmountSelectListAdapter$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (v2Var.f154384e.i7() && c01.z1.r().equals(w2Var.f154403a)) {
            db5.t7.g(v2Var.f154384e.mo55332x76847179(), v2Var.f154384e.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iep));
        }
        if (v2Var.f154384e.i7() && !h61.o.o(v2Var.f154384e.f154030z, w2Var.f154403a)) {
            db5.t7.g(v2Var.f154384e.mo55332x76847179(), v2Var.f154384e.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ier));
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$AmountSelectListAdapter$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
