package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class wc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.xc f205858d;

    public wc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.xc xcVar) {
        this.f205858d = xcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfilePostUIC$showPostBtn$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c61.ac acVar = (c61.ac) i95.n0.c(c61.ac.class);
        ml2.c1 c1Var = ml2.c1.f408858e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 2);
        jSONObject.put(ya.b.f77502x92235c1b, 2);
        ((b92.g1) acVar).Ai("finder.personalcenter.startlive", 60L, jSONObject);
        i95.m c17 = i95.n0.c(c61.ac.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ll2.e.f400666a.c("finder.personalcenter.startlive", false, true);
        ml2.c1 c1Var2 = ml2.c1.f408858e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.xc xcVar = this.f205858d;
        xcVar.T6((int) 2);
        xcVar.Q6();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfilePostUIC$showPostBtn$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
