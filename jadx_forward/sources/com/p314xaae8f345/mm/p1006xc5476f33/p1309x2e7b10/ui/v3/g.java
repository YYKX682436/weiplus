package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class g implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f176852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f f176853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.j f176854f;

    public g(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f activityC13069x47bc6a4f, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.j jVar) {
        this.f176852d = s0Var;
        this.f176853e = activityC13069x47bc6a4f;
        this.f176854f = jVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI$CardConverter$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.a) this.f176852d.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f activityC13069x47bc6a4f = this.f176853e;
        rl5.r rVar = new rl5.r(activityC13069x47bc6a4f.mo55332x76847179(), view);
        rVar.f478884u = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.e(activityC13069x47bc6a4f);
        rVar.f478887x = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.f(this.f176854f, aVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        android.graphics.Point a17 = lu1.b0.a(view);
        rVar.n(a17.x, a17.y);
        yj0.a.i(false, this, "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI$CardConverter$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
