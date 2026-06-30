package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes3.dex */
public final class h4 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f206101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 f206102e;

    public h4(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var) {
        this.f206101d = i17;
        this.f206102e = s4Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public final void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var != null) {
            m1Var.m48017xd0f4c159(true);
        }
        if (i17 == 0 && i18 == 0 && this.f206101d == 3) {
            com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558 = m1Var != null ? m1Var.mo47948x7f0c4558() : null;
            com.p314xaae8f345.mm.p944x882e457a.o oVar = mo47948x7f0c4558 instanceof com.p314xaae8f345.mm.p944x882e457a.o ? (com.p314xaae8f345.mm.p944x882e457a.o) mo47948x7f0c4558 : null;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar != null ? oVar.f152244b.f152233a : null;
            r45.su0 su0Var = fVar instanceof r45.su0 ? (r45.su0) fVar : null;
            if (su0Var != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#doReserveInternal FinderAudienceReserveOpType_ReserveAll back coupon size: ");
                java.util.LinkedList m75941xfb821914 = su0Var.m75941xfb821914(3);
                sb6.append(m75941xfb821914 != null ? java.lang.Integer.valueOf(m75941xfb821914.size()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMoreLiveNoticeListWidget", sb6.toString());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.LinkedList<r45.h32> m75941xfb8219142 = su0Var.m75941xfb821914(3);
                if (m75941xfb8219142 != null) {
                    for (r45.h32 h32Var : m75941xfb8219142) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h32Var);
                        r45.ov2 a17 = zl2.t.a(h32Var);
                        if (a17 != null) {
                            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o7.a(a17)) {
                                a17 = null;
                            }
                            if (a17 != null) {
                                java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(4);
                                if (m75945x2fec8307 == null) {
                                    m75945x2fec8307 = "";
                                }
                                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dd(a17, m75945x2fec8307));
                            }
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var = this.f206102e;
                r45.j32 j32Var = s4Var.f206297r;
                if (j32Var != null) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = s4Var.f206292m;
                    java.lang.Object layoutManager = c1163xf1deaba4 != null ? c1163xf1deaba4.getLayoutManager() : null;
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4.I.a(s4Var.f206281b, j32Var, s4Var.f206298s, s4Var.D, null, "", 0L, s4Var.f206280a, arrayList, c1162x665295de != null ? c1162x665295de.w() : -1, s4Var);
                }
            }
        }
    }
}
