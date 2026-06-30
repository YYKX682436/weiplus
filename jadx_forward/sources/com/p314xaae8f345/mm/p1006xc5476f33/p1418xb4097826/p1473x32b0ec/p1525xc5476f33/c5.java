package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class c5 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.y52 f193647a;

    public c5(r45.y52 y52Var) {
        this.f193647a = y52Var;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        r45.nw1 nw1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            dk2.ef efVar = dk2.ef.f314905a;
            mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
            if (c1Var == null || (str = c1Var.f410385o) == null) {
                str = "";
            }
            mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
            long m75942xfb822ef2 = (e1Var == null || (nw1Var = e1Var.f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0);
            java.lang.String m75945x2fec8307 = this.f193647a.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            r0Var.getClass();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("finder_username", str);
            hashMap.put("liveId", java.lang.String.valueOf(m75942xfb822ef2));
            hashMap.put("bannerid", m75945x2fec8307);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.u1 u1Var = ml2.u1.f409569c2;
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            zy2.zb.I8(zbVar, u1Var, hashMap, b17 == null ? "" : b17, "1002", null, null, false, 112, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndLiveHotBannerExposed bannerid=".concat(m75945x2fec8307));
        }
    }
}
