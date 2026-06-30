package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class fe implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ie f205246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ls2.a f205247e;

    public fe(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ie ieVar, ls2.a aVar) {
        this.f205246d = ieVar;
        this.f205247e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileServiceMenuUIC$refreshMenu$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xc2.y2 y2Var = xc2.y2.f534876a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ie ieVar = this.f205246d;
        android.app.Activity m80379x76847179 = ieVar.m80379x76847179();
        ls2.a aVar = this.f205247e;
        xc2.y2.i(y2Var, m80379x76847179, aVar.f402553d, 0, null, 12, null);
        android.app.Activity context = ieVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        org.json.JSONObject a17 = ls2.g.f402561e.a(ieVar.m80379x76847179(), aVar.f402553d.f534767a);
        ya2.b2 b2Var = aVar.f402553d.f534782k;
        a17.put("finderusername", b2Var != null ? b2Var.D0() : "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a, V6, "menu", 1, a17, false, null, 48, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileServiceMenuUIC$refreshMenu$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
