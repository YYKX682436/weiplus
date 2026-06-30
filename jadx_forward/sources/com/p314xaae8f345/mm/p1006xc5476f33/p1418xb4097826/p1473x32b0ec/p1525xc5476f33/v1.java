package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class v1 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 f196166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f196167b;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var, int i17) {
        this.f196166a = v3Var;
        this.f196167b = i17;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var = this.f196166a;
            java.lang.String username = ((mm2.c1) v3Var.P0(mm2.c1.class)).f410385o;
            long m75942xfb822ef2 = ((mm2.e1) v3Var.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            r0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("finder_username", username);
            hashMap.put("liveId", java.lang.String.valueOf(m75942xfb822ef2));
            int i17 = this.f196167b;
            hashMap.put("analysis_type", java.lang.String.valueOf(i17));
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.u1 u1Var = ml2.u1.f409607p2;
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            if (b17 == null) {
                b17 = "";
            }
            zy2.zb.I8(zbVar, u1Var, hashMap, b17, "1002", null, null, false, 112, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndThankGuideItemExpose report23057, liveid = " + m75942xfb822ef2 + ", analysisType=" + i17);
        }
    }
}
