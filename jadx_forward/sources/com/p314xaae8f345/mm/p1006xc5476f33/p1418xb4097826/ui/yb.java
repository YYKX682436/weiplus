package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class yb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f211582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d f211583e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ac f211584f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f211585g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f211586h;

    public yb(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d activityC15052xa671b52d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ac acVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        this.f211582d = h0Var;
        this.f211583e = activityC15052xa671b52d;
        this.f211584f = acVar;
        this.f211585g = k3Var;
        this.f211586h = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderPostAtUI$SelectAtContactAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ya2.b2 b2Var = (ya2.b2) this.f211582d.f391656d;
        boolean z17 = (b2Var == null || (b2Var.f69345xaed49e5b & 4) == 0) ? false : true;
        int i17 = this.f211586h;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f211585g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ac acVar = this.f211584f;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d activityC15052xa671b52d = this.f211583e;
            if (activityC15052xa671b52d.A == 2) {
                java.lang.String a17 = com.p314xaae8f345.mm.ui.l2.a("wxid_wi_1d142z0zdj03");
                if (a17 == null) {
                    a17 = "";
                }
                ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).bj(activityC15052xa671b52d.mo55332x76847179(), "wxid_wi_1d142z0zdj03", 5, a17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.xb(acVar, k3Var, i17, activityC15052xa671b52d));
                yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderPostAtUI$SelectAtContactAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        acVar.x(k3Var, i17);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderPostAtUI$SelectAtContactAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
