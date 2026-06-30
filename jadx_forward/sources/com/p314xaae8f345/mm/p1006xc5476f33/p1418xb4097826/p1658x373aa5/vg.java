package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes5.dex */
public final class vg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f214773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f214774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214775f;

    public vg(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17, android.view.View view) {
        this.f214773d = abstractActivityC21394xb3d2c0cf;
        this.f214774e = i17;
        this.f214775f = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderPostFooter$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Lk(this.f214773d, this.f214774e, null, 1);
        hc2.p0.d(this.f214775f, "post_at", "view_clk", null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderPostFooter$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
