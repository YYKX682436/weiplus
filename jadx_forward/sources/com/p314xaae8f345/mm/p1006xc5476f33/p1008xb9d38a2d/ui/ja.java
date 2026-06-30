package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class ja implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f155487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f155488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ db5.h4 f155489f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.la f155490g;

    public ja(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.la laVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, java.util.List list, db5.h4 h4Var) {
        this.f155490g = laVar;
        this.f155487d = k0Var;
        this.f155488e = list;
        this.f155489f = h4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/MobileInputLoginLogic$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.la laVar = this.f155490g;
        laVar.f155541d.mo48674x36654fab();
        this.f155487d.v();
        if (this.f155488e.contains(this.f155489f)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6968xc4cd5a52 c6968xc4cd5a52 = laVar.f155542e;
            c6968xc4cd5a52.f142767d = 1L;
            c6968xc4cd5a52.f142768e = 9L;
            c6968xc4cd5a52.k();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
