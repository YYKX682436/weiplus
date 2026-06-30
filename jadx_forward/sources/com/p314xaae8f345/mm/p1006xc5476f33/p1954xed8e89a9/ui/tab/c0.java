package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes10.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.l0 f235793d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.l0 l0Var) {
        super(0);
        this.f235793d = l0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.h32 h32Var;
        java.lang.String m75945x2fec8307;
        r45.j32 j32Var;
        java.util.LinkedList m75941xfb821914;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.l0 l0Var = this.f235793d;
        java.lang.String b17 = x51.j1.b(l0Var.f235921b.f470778s.f451659d);
        r45.j32 j32Var2 = l0Var.f235929j;
        if (j32Var2 != null) {
            int i17 = 0;
            java.util.LinkedList m75941xfb8219142 = j32Var2.m75941xfb821914(0);
            if (m75941xfb8219142 != null && (h32Var = (r45.h32) kz5.n0.Z(m75941xfb8219142)) != null && (m75945x2fec8307 = h32Var.m75945x2fec8307(4)) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
                r45.h32 e17 = i1Var.e(b17, m75945x2fec8307);
                if (e17 != null && (j32Var = l0Var.f235929j) != null && (m75941xfb821914 = j32Var.m75941xfb821914(0)) != null) {
                    for (java.lang.Object obj : m75941xfb821914) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        r45.h32 h32Var2 = (r45.h32) obj;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h32Var2.m75945x2fec8307(4), m75945x2fec8307)) {
                            h32Var2.set(1, java.lang.Integer.valueOf(e17.m75939xb282bd08(1)));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", "sync notice to list: index=" + i17 + ", noticeId=" + m75945x2fec8307 + ", status=" + e17.m75939xb282bd08(1));
                        }
                        i17 = i18;
                    }
                }
            }
        }
        if (l0Var.f() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ContactBizHeaderLiveNoticeLogicV2", "liveUtilsService is null!");
        } else if (l0Var.f235929j == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ContactBizHeaderLiveNoticeLogicV2", "liveNoticeListInfo is null!");
        } else {
            java.lang.String b18 = x51.j1.b(l0Var.f235921b.f470778s.f451659d);
            if (l0Var.f235927h == null) {
                r45.qt2 qt2Var = new r45.qt2();
                vd2.i5 f17 = l0Var.f();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b18);
                zy2.ic T6 = vd2.i5.T6(f17, b18, l0Var.f235920a, l0Var.f235924e.a(), qt2Var, 0, 16, null);
                l0Var.f235927h = T6;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4) T6).H = 102;
                zy2.ic icVar = l0Var.f235927h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(icVar);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4) icVar).f206303x = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.i0(l0Var);
            }
            p3325xe03a0797.p3326xc267989b.r2 r2Var = l0Var.f235935p;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            l0Var.f235935p = p3325xe03a0797.p3326xc267989b.l.d(l0Var.f235933n, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.k0(b18, l0Var, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
