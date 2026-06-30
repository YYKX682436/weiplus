package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes10.dex */
public final class g5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g5 f206586a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g5();

    /* renamed from: b, reason: collision with root package name */
    public static long f206587b;

    public final void a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context, boolean z17) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        if (z17 || f206587b > 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6608x4048ce66 c6608x4048ce66 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6608x4048ce66();
            java.lang.String str2 = "";
            if (V6 == null || (str = V6.m75945x2fec8307(0)) == null) {
                str = "";
            }
            c6608x4048ce66.f139614d = c6608x4048ce66.b("sessionid", str, true);
            if (V6 != null && (m75945x2fec8307 = V6.m75945x2fec8307(1)) != null) {
                str2 = m75945x2fec8307;
            }
            c6608x4048ce66.f139615e = c6608x4048ce66.b("contextid", str2, true);
            c6608x4048ce66.f139616f = c6608x4048ce66.b("event_id", z17 ? "1" : "2", true);
            c6608x4048ce66.f139617g = c01.id.c();
            c6608x4048ce66.f139618h = c6608x4048ce66.b("vst_type", "3", true);
            c6608x4048ce66.f139619i = (z17 || f206587b <= 0) ? 0L : c01.id.c() - f206587b;
            c6608x4048ce66.k();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6608x4048ce66);
            if (z17) {
                return;
            }
            f206587b = 0L;
        }
    }
}
