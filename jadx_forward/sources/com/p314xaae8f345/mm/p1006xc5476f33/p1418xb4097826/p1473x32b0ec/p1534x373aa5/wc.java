package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes2.dex */
public final class wc implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14370x2f9d6210 f198317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f198318b;

    public wc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14370x2f9d6210 c14370x2f9d6210, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        this.f198317a = c14370x2f9d6210;
        this.f198318b = c14994x9b99c079;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[4];
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        jz5.l lVar = new jz5.l("behaviour_session_id", Ri);
        boolean z17 = false;
        lVarArr[0] = lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14370x2f9d6210 c14370x2f9d6210 = this.f198317a;
        r45.qt2 reportObj = c14370x2f9d6210.getReportObj();
        lVarArr[1] = new jz5.l("finder_context_id", reportObj != null ? reportObj.m75945x2fec8307(1) : null);
        r45.qt2 reportObj2 = c14370x2f9d6210.getReportObj();
        lVarArr[2] = new jz5.l("finder_tab_context_id", reportObj2 != null ? reportObj2.m75945x2fec8307(2) : null);
        r45.nw1 m59258xd0557130 = this.f198318b.m59258xd0557130();
        if (m59258xd0557130 != null && m59258xd0557130.m75939xb282bd08(2) == 1) {
            z17 = true;
        }
        lVarArr[3] = new jz5.l("live_enter_status", java.lang.Integer.valueOf(z17 ? 1 : 2));
        return kz5.c1.k(lVarArr);
    }
}
