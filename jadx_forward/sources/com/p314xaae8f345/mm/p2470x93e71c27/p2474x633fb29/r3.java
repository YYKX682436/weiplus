package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes8.dex */
public final class r3 {
    public static final void a(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17) {
        long j18 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.t3.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 1L : 2L;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7155x5a2d2100 c7155x5a2d2100 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7155x5a2d2100();
        c7155x5a2d2100.f144615g = j17;
        c7155x5a2d2100.f144612d = c7155x5a2d2100.b("ContextId", str, true);
        if (str2 == null) {
            str2 = "";
        }
        c7155x5a2d2100.f144614f = c7155x5a2d2100.b("FileFormat", str2, true);
        if (str3 == null) {
            str3 = "";
        }
        c7155x5a2d2100.f144613e = c7155x5a2d2100.b("FileId", str3, true);
        c7155x5a2d2100.f144616h = j18;
        c7155x5a2d2100.f144617i = i17;
        c7155x5a2d2100.k();
        java.lang.String n17 = c7155x5a2d2100.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("QQBrowseEntranceReporterReporter", "report%s %s", 25696, r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        a(str, str2, str3, j17, context instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w3 ? ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w3) context).i5().a() : 0);
    }
}
