package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes10.dex */
public final class i0 implements zy2.hc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.l0 f235889a;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.l0 l0Var) {
        this.f235889a = l0Var;
    }

    @Override // zy2.hc
    public void a(java.util.List noticeList, int i17, r45.c32 c32Var, boolean z17) {
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        java.util.LinkedList m75941xfb8219142;
        r45.h32 h32Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeList, "noticeList");
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.l0 l0Var = this.f235889a;
        java.lang.String b17 = x51.j1.b(l0Var.f235921b.f470778s.f451659d);
        int i18 = 0;
        if ((!noticeList.isEmpty()) && z17) {
            r45.h32 h32Var2 = (r45.h32) kz5.n0.X(noticeList);
            r45.j32 j32Var = l0Var.f235929j;
            if (j32Var != null && (m75941xfb8219142 = j32Var.m75941xfb821914(0)) != null && (h32Var = (r45.h32) kz5.n0.Z(m75941xfb8219142)) != null) {
                h32Var.set(1, java.lang.Integer.valueOf(h32Var2.m75939xb282bd08(1)));
                h32Var.set(0, java.lang.Integer.valueOf(h32Var2.m75939xb282bd08(0)));
                h32Var.set(3, h32Var2.m75945x2fec8307(3));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
            java.lang.String m75945x2fec8307 = h32Var2.m75945x2fec8307(4);
            i1Var.a(b17, m75945x2fec8307 != null ? m75945x2fec8307 : "", h32Var2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", "update first notice: noticeId=" + h32Var2.m75945x2fec8307(4) + ", status=" + h32Var2.m75939xb282bd08(1));
        } else {
            java.util.Iterator it = noticeList.iterator();
            while (it.hasNext()) {
                r45.h32 h32Var3 = (r45.h32) it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1 i1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
                java.lang.String m75945x2fec83072 = h32Var3.m75945x2fec8307(4);
                if (m75945x2fec83072 == null) {
                    m75945x2fec83072 = "";
                }
                r45.h32 e17 = i1Var2.e(b17, m75945x2fec83072);
                if (e17 != null) {
                    e17.set(1, java.lang.Integer.valueOf(h32Var3.m75939xb282bd08(1)));
                }
                r45.j32 j32Var2 = l0Var.f235929j;
                if (j32Var2 != null && (m75941xfb821914 = j32Var2.m75941xfb821914(i18)) != null) {
                    java.util.Iterator it6 = m75941xfb821914.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it6.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.h32) obj).m75945x2fec8307(4), h32Var3.m75945x2fec8307(4))) {
                                break;
                            }
                        }
                    }
                    r45.h32 h32Var4 = (r45.h32) obj;
                    if (h32Var4 != null) {
                        h32Var4.set(1, java.lang.Integer.valueOf(h32Var3.m75939xb282bd08(1)));
                    }
                }
                i18 = 0;
            }
        }
        r45.j32 j32Var3 = l0Var.f235929j;
        if (j32Var3 != null) {
            int m75939xb282bd08 = j32Var3.m75939xb282bd08(2);
            if (i17 <= m75939xb282bd08) {
                m75939xb282bd08 = i17;
            }
            j32Var3.set(3, java.lang.Integer.valueOf(m75939xb282bd08));
        }
        if (c32Var != null) {
            l0Var.f235930k = c32Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", "update nextLiveNotificationInfo");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        l0Var.j(b17);
        l0Var.i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", "more list dismissed, totalReserveCnt=" + i17 + ", hasTopOperation=" + z17);
    }
}
