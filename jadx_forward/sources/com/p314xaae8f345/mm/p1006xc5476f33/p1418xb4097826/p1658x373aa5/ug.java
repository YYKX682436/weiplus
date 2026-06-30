package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes5.dex */
public final class ug implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tg f214711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214712e;

    public ug(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tg tgVar, android.view.View view) {
        this.f214711d = tgVar;
        this.f214712e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderPostFooter$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sr2.w0 w0Var = (sr2.w0) this.f214711d;
        w0Var.getClass();
        w0Var.O6("#", "");
        if (w0Var.X6().getVisibility() == 8) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = w0Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo26063x7b383410();
        }
        hc2.p0.d(this.f214712e, "post_topic", "view_clk", null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderPostFooter$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
