package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes5.dex */
public final class u7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e f239510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f239511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f239512f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f239513g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f239514h;

    public u7(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e c17147x9fa5370e, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.util.ArrayList arrayList) {
        this.f239510d = c17147x9fa5370e;
        this.f239511e = c22621x7603e017;
        this.f239512f = c0Var;
        this.f239513g = h0Var;
        this.f239514h = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceRemarkInputHalfPage$showDialog$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("launch_from_remittance", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e c17147x9fa5370e = this.f239510d;
        c17147x9fa5370e.f239094d.m78545xde66c1f2(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.t7(this.f239511e, this.f239512f, this.f239513g, this.f239514h, c17147x9fa5370e));
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e c17147x9fa5370e2 = this.f239510d;
        c17147x9fa5370e2.f239094d.mo53060x36654fab(this.f239511e);
        intent.putExtra("enter_scene_address", 4);
        j45.l.n(c17147x9fa5370e2.f239094d, "address", ".ui.WalletSelectAddrUI", intent, 123);
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/ui/RemittanceRemarkInputHalfPage$showDialog$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
