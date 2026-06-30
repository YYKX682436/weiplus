package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class z0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f176944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf f176945e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.c1 f176946f;

    public z0(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf activityC13074xfcf8fabf, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.c1 c1Var) {
        this.f176944d = s0Var;
        this.f176945e = activityC13074xfcf8fabf;
        this.f176946f = c1Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/VipCardListUI$VipCardConverter$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.t0 t0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.t0) this.f176944d.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf activityC13074xfcf8fabf = this.f176945e;
        rl5.r rVar = new rl5.r(activityC13074xfcf8fabf.mo55332x76847179(), view);
        rVar.f478884u = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.x0(activityC13074xfcf8fabf);
        rVar.f478887x = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.y0(this.f176946f, t0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        android.graphics.Point a17 = lu1.b0.a(view);
        rVar.n(a17.x, a17.y);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19747, 1, 3);
        yj0.a.i(false, this, "com/tencent/mm/plugin/card/ui/v3/VipCardListUI$VipCardConverter$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
