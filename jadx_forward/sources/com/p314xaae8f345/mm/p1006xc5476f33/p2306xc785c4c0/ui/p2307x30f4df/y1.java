package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public final class y1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public wm4.y f256646d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f256647e;

    /* renamed from: f, reason: collision with root package name */
    public int f256648f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f256649g;

    /* renamed from: h, reason: collision with root package name */
    public r45.f03 f256650h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Integer f256651i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f256648f = -1;
    }

    public final void O6(android.content.Intent intent) {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar;
        r45.vs2 vs2Var;
        org.json.JSONObject jSONObject2;
        r45.fn6 fn6Var;
        int intExtra = (intent == null ? m158359x1e885992() : intent).getIntExtra("key_chosetab", 0);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.d.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.d) a17;
        r45.vs2 vs2Var2 = dVar.f256484f;
        r45.xs2 xs2Var = dVar.f256485g;
        r45.in6 in6Var = dVar.f256482d;
        r45.rn6 rn6Var = in6Var != null ? in6Var.f458714J : null;
        int i17 = (rn6Var == null || (fn6Var = rn6Var.f466565d) == null) ? -1 : fn6Var.f456002d;
        boolean z17 = in6Var != null && in6Var.K == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStoryTabBubbleUIC", "onCreate");
        boolean m40539x7a994349 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349();
        n51.e eVar = n51.f.f416647a;
        if (m40539x7a994349) {
            java.util.Objects.toString(vs2Var2 != null ? vs2Var2.mo12245xcc313de3() : null);
            java.util.Objects.toString(xs2Var != null ? xs2Var.mo12245xcc313de3() : null);
            if (rn6Var != null) {
                jSONObject2 = new org.json.JSONObject();
                try {
                    eVar.d(jSONObject2, "contentRedDotModel", rn6Var.f466565d, false);
                } catch (java.lang.Exception unused) {
                }
            } else {
                jSONObject2 = null;
            }
            java.util.Objects.toString(jSONObject2);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate() called with isEnterLastStrategy:");
            sb6.append(z17);
            sb6.append(" path:NewLife.Entrance chooseCategory:");
            sb6.append(intExtra);
            sb6.append(" contentRedDotCategory:");
            sb6.append(i17);
            sb6.append(" redDotExtInfo:");
            sb6.append(xs2Var != null ? xs2Var.mo12245xcc313de3() : null);
            sb6.append(" \n topStoryRedDotModel:");
            if (rn6Var != null) {
                jSONObject = new org.json.JSONObject();
                try {
                    eVar.d(jSONObject, "contentRedDotModel", rn6Var.f466565d, false);
                } catch (java.lang.Exception unused2) {
                }
            } else {
                jSONObject = null;
            }
            sb6.append(jSONObject);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStoryTabBubbleUIC", sb6.toString());
        }
        if (i17 == -1 || rn6Var == null) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        pf5.z zVar = pf5.z.f435481a;
        p012xc85e97e9.p093xedfae76a.c1 a18 = zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.d.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
        r45.in6 in6Var2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.d) a18).f256482d;
        boolean z18 = in6Var2 != null && in6Var2.K == 1;
        r45.fn6 fn6Var2 = rn6Var.f466565d;
        int i18 = fn6Var2 != null ? fn6Var2.f456002d : -1;
        r45.bz2 bz2Var = fn6Var2 != null ? fn6Var2.f456003e : null;
        r45.f03 f03Var = fn6Var2 != null ? fn6Var2.f456004f : null;
        if (fn6Var2 == null || (vs2Var = fn6Var2.f456005g) == null) {
            jbVar = null;
        } else {
            jbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb();
            jbVar.t0(vs2Var);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
        java.util.List<wm4.y> list = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.d) zVar.a(activity3).a(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.d.class)).f256483e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStoryTabBubbleUIC", "tryToShowTips");
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStoryTabBubbleUIC", "tryToShowTips return tabItems == null");
            return;
        }
        if (i18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStoryTabBubbleUIC", "tryToShowTips return contentRedDotCategory == -1");
            return;
        }
        this.f256649g = jbVar;
        this.f256650h = f03Var;
        this.f256651i = java.lang.Integer.valueOf(i18);
        if (z18) {
            if (bz2Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStoryTabBubbleUIC", "tryToShowTips return showTipsInfo == null");
                return;
            }
            if (i18 == intExtra) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStoryTabBubbleUIC", "tryToShowTips return contentRedDotCategory == chooseCategory");
                return;
            }
            for (wm4.y yVar : list) {
                if (yVar.f528851b == i18) {
                    android.view.View view = yVar.f528863n;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStoryTabBubbleUIC", "contentRedDotCategory match tabViewContainer:" + view);
                    if (view != null) {
                        yVar.a(0, "", jbVar, f03Var);
                        view.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.x1(this, view, bz2Var, i18, yVar, jbVar, f03Var), 450L);
                        this.f256648f = i18;
                        dn4.a aVar = dn4.a.f323566a;
                        android.app.Activity context = m80379x76847179();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                        aVar.b(context, "view_exp", i18);
                        return;
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        O6(null);
    }
}
