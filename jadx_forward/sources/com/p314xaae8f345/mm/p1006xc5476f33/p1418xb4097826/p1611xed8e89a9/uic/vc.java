package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class vc extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f205829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.xc f205830e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.xc xcVar) {
        super(1);
        this.f205829d = view;
        this.f205830e = xcVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        boolean z17 = it.f186860a;
        android.view.View view = this.f205829d;
        if (z17) {
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfilePostUIC$showPostBtn$5", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfilePostUIC$showPostBtn$5", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfilePostUIC", "createLiveReddot Finder_PersonalCenter_StartLive expose, time:" + c01.id.c());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = it.f186862c;
            if (jbVar != null) {
                zy2.fa.K0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), jbVar, "finder.personalcenter.startlive", c01.id.c(), false, 8, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.xc xcVar = this.f205830e;
            if (!xcVar.f205892n) {
                ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
                ll2.e.f400666a.j("finder.personalcenter.startlive", true);
                xcVar.f205892n = true;
                c61.ac acVar = (c61.ac) i95.n0.c(c61.ac.class);
                ml2.c1 c1Var = ml2.c1.f408858e;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", 1);
                jSONObject.put(ya.b.f77502x92235c1b, 2);
                ((b92.g1) acVar).Ai("finder.personalcenter.startlive", 60L, jSONObject);
            }
        } else if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfilePostUIC$showPostBtn$5", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfilePostUIC$showPostBtn$5", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
