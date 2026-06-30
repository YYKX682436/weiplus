package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class a2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 f193316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f193317e;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        this.f193316d = v3Var;
        this.f193317e = c19786x6a1e2862;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$doShowGuide$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var = this.f193316d;
        java.lang.String username = ((mm2.c1) v3Var.P0(mm2.c1.class)).f410385o;
        long m75942xfb822ef2 = ((mm2.e1) v3Var.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info = this.f193317e;
        java.lang.String m76523x98b23862 = info.m76523x98b23862();
        r0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("finder_username", username);
        hashMap.put("liveId", java.lang.String.valueOf(m75942xfb822ef2));
        if (m76523x98b23862 == null) {
            m76523x98b23862 = "";
        }
        hashMap.put("diagnosis_txt", m76523x98b23862);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.f409524u2;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        zy2.zb.T8(zbVar, t1Var, hashMap, b17 == null ? "" : b17, "1002", null, null, false, 112, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "report23057, liveid = " + ((java.lang.String) hashMap.get("liveid")));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        xc2.y2 y2Var = xc2.y2.f534876a;
        xc2.p0 p0Var = new xc2.p0(info);
        p0Var.f534785n = 0;
        xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        v3Var.R = java.lang.System.currentTimeMillis();
        v3Var.F1(2);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$doShowGuide$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
