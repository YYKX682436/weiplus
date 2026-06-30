package dn2;

/* loaded from: classes3.dex */
public final class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn2.s0 f323496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.pj1 f323497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 f323498f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.f1 f323499g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f323500h;

    public q0(dn2.s0 s0Var, r45.pj1 pj1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var, p3325xe03a0797.p3326xc267989b.f1 f1Var, android.view.View view) {
        this.f323496d = s0Var;
        this.f323497e = pj1Var;
        this.f323498f = k0Var;
        this.f323499g = f1Var;
        this.f323500h = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yg2.b m57691xa0fa63f9;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/ShoppingHotSaleNotificationItem$getView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f323496d.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on notification clicked, product = ");
        r45.y23 y23Var = (r45.y23) this.f323497e.m75936x14adae67(0);
        sb6.append(y23Var != null ? java.lang.Long.valueOf(y23Var.m75942xfb822ef2(0)) : null);
        sb6.append(", curlayout = ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = this.f323498f;
        sb6.append(k0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShoppingHotSaleNotificationItem", sb6.toString());
        if (k0Var != null && (m57691xa0fa63f9 = k0Var.m57691xa0fa63f9()) != null) {
            p3325xe03a0797.p3326xc267989b.l.d(m57691xa0fa63f9, null, null, new dn2.p0(this.f323499g, this.f323500h, this.f323498f, this.f323496d, this.f323497e, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/ShoppingHotSaleNotificationItem$getView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
