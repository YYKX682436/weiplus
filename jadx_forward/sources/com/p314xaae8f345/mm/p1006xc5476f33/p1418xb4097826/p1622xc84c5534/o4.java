package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes4.dex */
public final class o4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o4 f206753a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o4();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f206754b;

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o4 o4Var, java.lang.String sessionID, int i17, java.lang.String wording, boolean z17, boolean z18, long j17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            wording = "";
        }
        if ((i18 & 8) != 0) {
            z17 = true;
        }
        if ((i18 & 16) != 0) {
            z18 = true;
        }
        if ((i18 & 32) != 0) {
            j17 = 0;
        }
        o4Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionID, "sessionID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6587x799a987 c6587x799a987 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6587x799a987();
        java.lang.String str = f206754b;
        if (str != null) {
            sessionID = str;
        }
        c6587x799a987.f139370d = c6587x799a987.b("SessinId", sessionID, true);
        f206754b = null;
        c6587x799a987.f139371e = i17;
        c6587x799a987.f139372f = c01.id.c();
        c6587x799a987.f139375i = c6587x799a987.b("FinderFeedId", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Ui(j17), true);
        c6587x799a987.f139376j = z17 ? 1L : 0L;
        c6587x799a987.f139377k = z18 ? 1L : 0L;
        c6587x799a987.f139378l = c6587x799a987.b("Wording", wording, true);
        c6587x799a987.k();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6587x799a987);
    }
}
