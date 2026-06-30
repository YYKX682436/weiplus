package g65;

/* loaded from: classes4.dex */
public interface a extends i95.m {
    static void hg(g65.a aVar, int i17, int i18, java.lang.String str, int i19, int i27, int i28, long j17, long j18, long j19, long j27, int i29, java.lang.String str2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str3, int i37, java.lang.Object obj) {
        int i38;
        java.lang.String m69267x9616526c;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportWorkStatus");
        }
        java.lang.String workId = (i37 & 4) != 0 ? "" : str;
        int i39 = (i37 & 8) != 0 ? 0 : i19;
        int i47 = (i37 & 16) != 0 ? 0 : i27;
        int i48 = (i37 & 32) != 0 ? -1 : i28;
        long j28 = (i37 & 64) != 0 ? 0L : j17;
        long j29 = (i37 & 128) != 0 ? 0L : j18;
        long j37 = (i37 & 256) != 0 ? 0L : j19;
        long j38 = (i37 & 512) != 0 ? 0L : j27;
        int i49 = (i37 & 1024) != 0 ? 0 : i29;
        java.lang.String encodeConfig = (i37 & 2048) != 0 ? "" : str2;
        java.lang.Boolean bool3 = (i37 & 4096) != 0 ? null : bool;
        long j39 = j38;
        java.lang.Boolean bool4 = (i37 & 8192) != 0 ? null : bool2;
        java.lang.String outputVideoPath = (i37 & 16384) != 0 ? "" : str3;
        ((yp4.a) aVar).getClass();
        java.lang.Boolean bool5 = bool3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workId, "workId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encodeConfig, "encodeConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputVideoPath, "outputVideoPath");
        java.lang.String str4 = encodeConfig;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FakeVideoTecReporter", "reportWorkStatus >> " + i18 + ", " + i47 + ", " + i48 + ", " + j29);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6893x57fb842b c6893x57fb842b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6893x57fb842b();
        c6893x57fb842b.f142084d = i18;
        c6893x57fb842b.p(workId);
        c6893x57fb842b.f142087g = i39;
        c6893x57fb842b.f142086f = i48;
        c6893x57fb842b.f142089i = j37;
        c6893x57fb842b.f142090j = j39;
        c6893x57fb842b.f142091k = j28;
        c6893x57fb842b.f142092l = j29;
        c6893x57fb842b.f142088h = i47;
        java.lang.Boolean bool6 = java.lang.Boolean.TRUE;
        c6893x57fb842b.f142095o = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool4, bool6) ? 1 : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool4, java.lang.Boolean.FALSE) ? 2 : 0;
        c6893x57fb842b.f142097q = i49;
        c6893x57fb842b.f142098r = i17;
        if (i18 == 3 && i47 == 4007 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(outputVideoPath)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(outputVideoPath, true);
            c6893x57fb842b.f142096p = c6893x57fb842b.b("MixVideoInfo", (d17 == null || (m69267x9616526c = d17.m69267x9616526c()) == null) ? "" : r26.i0.t(m69267x9616526c, ",", ";", false), true);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            i38 = 0;
        } else {
            i38 = 0;
            c6893x57fb842b.f142094n = c6893x57fb842b.b("EncodeConfig", r26.i0.t(str4, ",", ";", false), true);
        }
        c6893x57fb842b.f142093m = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool5, bool6) ? 1 : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool5, java.lang.Boolean.FALSE) ? 2 : i38;
        c6893x57fb842b.k();
    }
}
