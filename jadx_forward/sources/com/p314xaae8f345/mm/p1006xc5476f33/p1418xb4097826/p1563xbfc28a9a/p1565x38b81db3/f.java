package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3;

/* loaded from: classes2.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.d f202669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 f202670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f202671f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.d dVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        super(1);
        this.f202669d = dVar;
        this.f202670e = c19781xd1c47b87;
        this.f202671f = abstractC14490x69736cb5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object[] objArr;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112;
        java.lang.String str;
        r45.xk b17;
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        mo2.q qVar = (mo2.q) this.f202669d;
        qVar.getClass();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 item = this.f202670e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed = this.f202671f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            objArr = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            objArr = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (objArr == false && (activityC0065xcd7aa112 = qVar.f411922f) != null) {
            long m59251x5db1b11 = feed.getFeedObject().m59251x5db1b11();
            java.lang.String m59229xb5af1dd5 = feed.getFeedObject().m59229xb5af1dd5();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0();
            yj0Var.f68959xf9a02e3e = m59251x5db1b11;
            yj0Var.f68957xec748fc6 = m59229xb5af1dd5;
            yj0Var.f68965x29d3a50c = 2;
            yj0Var.f68953x27838069.set(1, item);
            yj0Var.n1(0L);
            so2.y0 y0Var = new so2.y0(yj0Var);
            r45.ky0 m76052x34c6289e = item.m76052x34c6289e();
            jz5.f0 f0Var2 = null;
            f0Var2 = null;
            if (hc2.g0.a(m76052x34c6289e != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) m76052x34c6289e.m75936x14adae67(5) : null) == null && !hc2.c0.a(item.m76068x3ffea218()) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(item.m76102x6c03c64c(), qVar.f411923g)) {
                java.lang.String m76102x6c03c64c = item.m76102x6c03c64c();
                if (m76102x6c03c64c == null) {
                    m76102x6c03c64c = "";
                }
                if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(m76102x6c03c64c)) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).ql(qVar.f411922f, feed.getFeedObject().m59299x6bf53a6c(), y0Var, qVar.f411923g, 11);
                }
            }
            r45.ky0 m76052x34c6289e2 = item.m76052x34c6289e();
            if (m76052x34c6289e2 == null || (str = m76052x34c6289e2.m75945x2fec8307(4)) == null) {
                str = "";
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76053x3682fe62 = item.m76053x3682fe62();
            if (m76053x3682fe62 != null && (b17 = ya2.d.b(ya2.d.h(m76053x3682fe62, null, false, 3, null), false)) != null) {
                java.lang.String m75945x2fec8307 = b17.m75945x2fec8307(0);
                java.lang.String str2 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                so2.g0.b(y0Var, activityC0065xcd7aa112, str2, nyVar != null ? nyVar.f216913n : 0, feed.getFeedObject(), str);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                java.lang.String m76102x6c03c64c2 = item.m76102x6c03c64c();
                if (m76102x6c03c64c2 == null) {
                    m76102x6c03c64c2 = "";
                }
                so2.g0.d(y0Var, m76102x6c03c64c2, activityC0065xcd7aa112, str);
            }
        }
        return f0Var;
    }
}
