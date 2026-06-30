package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class pj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f155652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f155653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ db5.h4 f155654f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11475xf1a02871 f155655g;

    public pj(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11475xf1a02871 activityC11475xf1a02871, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, java.util.List list, db5.h4 h4Var) {
        this.f155655g = activityC11475xf1a02871;
        this.f155652d = k0Var;
        this.f155653e = list;
        this.f155654f = h4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/WelcomeActivity$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11475xf1a02871 activityC11475xf1a02871 = this.f155655g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11475xf1a02871.S6(activityC11475xf1a02871);
        this.f155652d.v();
        if (this.f155653e.contains(this.f155654f)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6968xc4cd5a52 c6968xc4cd5a52 = activityC11475xf1a02871.f155227f;
            c6968xc4cd5a52.f142767d = 1L;
            c6968xc4cd5a52.f142768e = 1L;
            c6968xc4cd5a52.k();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/WelcomeActivity$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
