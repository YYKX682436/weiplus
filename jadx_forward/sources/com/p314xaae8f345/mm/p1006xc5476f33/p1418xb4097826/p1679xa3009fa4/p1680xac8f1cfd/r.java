package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s f217282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f217283f;

    public r(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s sVar, java.lang.String str) {
        this.f217281d = s0Var;
        this.f217282e = sVar;
        this.f217283f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderAccountRecommendListConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f217281d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t) s0Var.f374658i;
        java.lang.String m76197x6c03c64c = tVar.f217481d.m76197x6c03c64c();
        if (m76197x6c03c64c == null) {
            m76197x6c03c64c = "";
        }
        ya2.b2 b17 = ya2.h.f542017a.b(m76197x6c03c64c);
        boolean z17 = false;
        if (b17 != null) {
            int i17 = b17.f69313xcad4ef95;
            l75.e0 e0Var = ya2.b2.O2;
            if (i17 == ya2.b2.Q2) {
                z17 = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s sVar = this.f217282e;
        if (z17) {
            sVar.getClass();
            android.content.Context context = s0Var.f374654e;
            if (sVar.f217378e == null) {
                android.content.res.Resources resources = context.getResources();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
                k0Var.q(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572822cn3), 17);
                k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m(sVar, resources);
                k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.n(sVar, context, m76197x6c03c64c, s0Var, tVar);
                k0Var.f293387d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o(sVar);
                sVar.f217378e = k0Var;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = sVar.f217378e;
            if (k0Var2 != null && !k0Var2.i()) {
                k0Var2.v();
            }
        } else {
            android.content.Context context2 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s.n(sVar, context2, m76197x6c03c64c, !z17);
        }
        sVar.o(s0Var, tVar);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("finderusername", m76197x6c03c64c);
        jSONObject.put("click_action_type", z17 ? 2 : 1);
        jSONObject.put("recommend_source_finder_username", this.f217283f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
        android.content.Context context3 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context3 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, "frifollow_page_follow_button", 1, jSONObject, false, null, 48, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAccountRecommendListConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
