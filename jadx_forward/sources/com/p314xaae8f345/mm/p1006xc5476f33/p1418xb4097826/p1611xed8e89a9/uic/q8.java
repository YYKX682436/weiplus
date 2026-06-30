package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class q8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob f205680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f205681e;

    public q8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar, xc2.p0 p0Var) {
        this.f205680d = obVar;
        this.f205681e = p0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleMessageBtn$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xc2.y2 y2Var = xc2.y2.f534876a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar = this.f205680d;
        xc2.y2.i(y2Var, obVar.m80379x76847179(), this.f205681e, 0, null, 12, null);
        android.app.Activity context = obVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        ls2.b bVar = ls2.g.f402561e;
        android.app.Activity m80379x76847179 = obVar.m80379x76847179();
        xc2.p0 p0Var = this.f205681e;
        org.json.JSONObject a17 = bVar.a(m80379x76847179, p0Var.f534767a);
        ya2.b2 b2Var = p0Var.f534782k;
        a17.put("finderusername", b2Var != null ? b2Var.D0() : "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a, V6, "menu", 1, a17, false, null, 48, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t2.f206896a.b(obVar.m158354x19263085(), obVar.m58741x6c03c64c(), true, obVar.Q1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleMessageBtn$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
