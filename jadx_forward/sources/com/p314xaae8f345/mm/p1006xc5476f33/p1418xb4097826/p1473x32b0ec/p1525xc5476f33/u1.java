package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class u1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f196040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 f196041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f196042f;

    public u1(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var, int i17) {
        this.f196040d = h0Var;
        this.f196041e = v3Var;
        this.f196042f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$configThankGuidePanelByCurrentDataUnit$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) this.f196040d.f391656d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var = this.f196041e;
        if (c19786x6a1e2862 != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.content.Context context = v3Var.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            xc2.y2 y2Var = xc2.y2.f534876a;
            xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
            p0Var.f534785n = 0;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        }
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        java.lang.String username = ((mm2.c1) v3Var.P0(mm2.c1.class)).f410385o;
        long m75942xfb822ef2 = ((mm2.e1) v3Var.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        r0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("finder_username", username);
        hashMap.put("liveId", java.lang.String.valueOf(m75942xfb822ef2));
        int i17 = this.f196042f;
        hashMap.put("analysis_type", java.lang.String.valueOf(i17));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.f409527v2;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        zy2.zb.T8(zbVar, t1Var, hashMap, b17, "1002", null, null, false, 112, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndThankGuideItemClick report23059, liveid = " + m75942xfb822ef2 + ", analysisType=" + i17);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$configThankGuidePanelByCurrentDataUnit$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
