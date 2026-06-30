package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f206622a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f206623b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f206624c = "";

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k kVar, r45.qt2 qt2Var, long j17, long j18, java.lang.Long l17, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            l17 = 1L;
        }
        kVar.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6473xf2e7d637 c6473xf2e7d637 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6473xf2e7d637();
        c6473xf2e7d637.f138159d = c6473xf2e7d637.b("finderUsername", kVar.f206622a, true);
        c6473xf2e7d637.f138160e = c6473xf2e7d637.b("toUsername", kVar.f206623b, true);
        c6473xf2e7d637.f138161f = c6473xf2e7d637.b("toFinderUsername", kVar.f206624c, true);
        c6473xf2e7d637.f138162g = 2L;
        c6473xf2e7d637.f138163h = j18;
        c6473xf2e7d637.f138166k = j17;
        if (qt2Var != null) {
            java.lang.String m75945x2fec8307 = qt2Var.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            c6473xf2e7d637.f138164i = c6473xf2e7d637.b("sessionid", m75945x2fec8307, true);
            java.lang.String m75945x2fec83072 = qt2Var.m75945x2fec8307(2);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            c6473xf2e7d637.f138165j = c6473xf2e7d637.b("clicktabcontextid", m75945x2fec83072, true);
        }
        java.lang.String str = c6473xf2e7d637.f138164i;
        if (str == null) {
            str = "";
        }
        c6473xf2e7d637.f138164i = c6473xf2e7d637.b("sessionid", str, true);
        java.lang.String str2 = c6473xf2e7d637.f138165j;
        c6473xf2e7d637.f138165j = c6473xf2e7d637.b("clicktabcontextid", str2 != null ? str2 : "", true);
        c6473xf2e7d637.f138167l = l17 != null ? l17.longValue() : 1L;
        c6473xf2e7d637.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206755a, "onClickFinderChat", c6473xf2e7d637);
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k kVar, r45.qt2 qt2Var, long j17, java.lang.Long l17, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            l17 = 1L;
        }
        kVar.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6473xf2e7d637 c6473xf2e7d637 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6473xf2e7d637();
        c6473xf2e7d637.f138159d = c6473xf2e7d637.b("finderUsername", kVar.f206622a, true);
        c6473xf2e7d637.f138160e = c6473xf2e7d637.b("toUsername", kVar.f206623b, true);
        c6473xf2e7d637.f138161f = c6473xf2e7d637.b("toFinderUsername", kVar.f206624c, true);
        c6473xf2e7d637.f138162g = 1L;
        c6473xf2e7d637.f138163h = 0L;
        if (qt2Var != null) {
            java.lang.String m75945x2fec8307 = qt2Var.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            c6473xf2e7d637.f138164i = c6473xf2e7d637.b("sessionid", m75945x2fec8307, true);
            java.lang.String m75945x2fec83072 = qt2Var.m75945x2fec8307(2);
            c6473xf2e7d637.f138165j = c6473xf2e7d637.b("clicktabcontextid", m75945x2fec83072 != null ? m75945x2fec83072 : "", true);
        }
        c6473xf2e7d637.f138166k = j17;
        c6473xf2e7d637.f138167l = l17 != null ? l17.longValue() : 1L;
        c6473xf2e7d637.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206755a, "onExpose", c6473xf2e7d637);
    }

    public final void c(java.lang.String finderUserName, java.lang.String toUserName, java.lang.String toFinderUserName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUserName, "toUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toFinderUserName, "toFinderUserName");
        this.f206622a = finderUserName;
        this.f206623b = toUserName;
        this.f206624c = toFinderUserName;
    }
}
