package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes.dex */
public final class y8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f199083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z8 f199084e;

    public y8(r45.qt2 qt2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z8 z8Var) {
        this.f199083d = qt2Var;
        this.f199084e = z8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRolePrivacyEntranceUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.W2;
        java.util.HashMap i17 = kz5.c1.i(new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "3"), new jz5.l("type", "2"));
        r45.qt2 qt2Var = this.f199083d;
        zy2.zb.T8(zbVar, t1Var, i17, qt2Var != null ? qt2Var.m75945x2fec8307(1) : null, qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)).toString() : null, null, null, false, 112, null);
        c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = this.f199084e.m158354x19263085();
        ((b92.d1) zbVar2).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14015x5ffd0217.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/FinderCommonLiveService", "goLivePrivacyUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/FinderCommonLiveService", "goLivePrivacyUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRolePrivacyEntranceUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
