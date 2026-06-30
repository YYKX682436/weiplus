package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.x0 f169959a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.x0();

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 service, java.lang.String str, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(service.mo48798x74292566(), true);
        if (b17 != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7139xc4caa9b9 c7139xc4caa9b9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7139xc4caa9b9();
            c7139xc4caa9b9.f144483d = c7139xc4caa9b9.b("appid", b17.f169668e, true);
            c7139xc4caa9b9.f144484e = b17.f169672i;
            c7139xc4caa9b9.f144485f = b17.f169669f;
            c7139xc4caa9b9.f144486g = 9;
            c7139xc4caa9b9.f144488i = c7139xc4caa9b9.b("errorMessage", str, true);
            c7139xc4caa9b9.f144489j = c7139xc4caa9b9.b("errorStack", str2, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 x17 = service.x();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x17);
            c7139xc4caa9b9.f144490k = c7139xc4caa9b9.b("sdkversion", x17.W0(), true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 x18 = service.x();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x18);
            c7139xc4caa9b9.f144494o = c7139xc4caa9b9.b("sdkupdatetime", x18.B7(), true);
            c7139xc4caa9b9.f144491l = b17.f169670g;
            c7139xc4caa9b9.f144495p = b17.B.get();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 V0 = service.V0();
            java.lang.String X1 = V0.X1();
            java.lang.String s17 = u46.l.s(V0.Y1(), X1.length());
            if (s17 == null) {
                s17 = "";
            }
            c7139xc4caa9b9.f144492m = c7139xc4caa9b9.b(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.f16281x190f801f, fp.s0.a(X1), true);
            c7139xc4caa9b9.f144493n = c7139xc4caa9b9.b("query", fp.s0.a(s17), true);
            c7139xc4caa9b9.f144497r = c7139xc4caa9b9.b("networkType", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.c(null, 1, null), true);
            c7139xc4caa9b9.k();
        }
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 service, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n scriptInfo, boolean z17, long j17, long j18, java.lang.Object obj) {
        int i17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scriptInfo, "scriptInfo");
        java.lang.String str = scriptInfo.f128885i;
        if (str == null || str.length() == 0) {
            return;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandServiceWCScriptReporter", "reportEvaluateResult, !succeed name[" + str + "], appId[" + service.mo48798x74292566() + ']');
            if (scriptInfo.f128887k <= 0) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "WAServiceMainContext.js")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(370, 73);
                }
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        int hashCode = str.hashCode();
        if (hashCode != -979125780) {
            if (hashCode != 293174862) {
                if (hashCode == 452806299 && str.equals("WAGame.js")) {
                    if (z17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.f169705a.b(service, str, scriptInfo.f128887k, z17, j17, j18, obj);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.m(service.mo48798x74292566(), 24, 0);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.i(service.mo48798x74292566(), service.t3().d2(), service.t3().f156338p.f158814g, 778, 14, 1);
                    }
                    if (service.t3() != null) {
                        if (z17) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.f(service.mo48798x74292566(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35226xc85567d6, "WAGame.js", j17, j18);
                            return;
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.d(service.mo48798x74292566(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35226xc85567d6, "", "WAGame.js", j17, j18);
                            return;
                        }
                    }
                    return;
                }
            } else if (str.equals("app-service.js")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.A(370, 9);
                if (!z17) {
                    try {
                        g0Var.A(370, 10);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.m(service.mo48798x74292566(), 24, 0);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.i(service.mo48798x74292566(), service.t3().E0().f387385r.f33456x1c82a56c, service.t3().E0().f387385r.f156932d, 370, 10, 1);
                        return;
                    } catch (java.lang.NullPointerException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandServiceWCScriptReporter", "Inject External Service Script Failed, report npe = %s", e17);
                        return;
                    }
                }
                if (service.H0() || service.mo50262x39e05d35()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = service.t3();
                    cl.k1 k1Var = obj instanceof cl.k1 ? (cl.k1) obj : null;
                    long j19 = k1Var != null ? k1Var.f124208a : j17;
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[0] = t37 != null ? t37.f156336n : null;
                    objArr[1] = java.lang.Integer.valueOf(t37 != null ? t37.hashCode() : -1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandServiceWCScriptReporter", "[QualitySystem] app-service.js runtime.appId=[%s], runtime.hashCode = [%d]", objArr);
                    i18 = 370;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.d(service, "app-service.js", scriptInfo.f128887k, "", 0, j19, t37 != null ? t37.hashCode() : -1, k1Var);
                } else {
                    i18 = 370;
                }
                g0Var.A(i18, 11);
                return;
            }
            i17 = 370;
        } else {
            if (str.equals("WAServiceMainContext.js")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandServiceWCScriptReporter", "reportEvaluateResult, service_lib_script[" + str + "], succeed[" + z17 + ']');
                if (service.t3() != null) {
                    if (z17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.f(service.mo48798x74292566(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35223x8dde28c6, "", j17, j18);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.d(service.mo48798x74292566(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35223x8dde28c6, "", "", j17, j18);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.f169705a.b(service, str, scriptInfo.f128887k, z17, j17, j18, obj);
                jz5.o oVar = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "WAServiceMainContext.js") ? new jz5.o(61, 62, 63) : new jz5.o(0, 0, 0);
                int intValue = ((java.lang.Number) oVar.f384374d).intValue();
                int intValue2 = ((java.lang.Number) oVar.f384375e).intValue();
                int intValue3 = ((java.lang.Number) oVar.f384376f).intValue();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var2.A(370, intValue);
                if (z17) {
                    g0Var2.A(370, intValue3);
                    return;
                }
                g0Var2.A(370, intValue2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.m(service.mo48798x74292566(), 24, 0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.i(service.mo48798x74292566(), service.t3() != null ? service.t3().E0().f387385r.f33456x1c82a56c : 0, service.t3() != null ? service.t3().E0().f387385r.f156932d : -1, 370, intValue2, 1);
                return;
            }
            i17 = 370;
        }
        if (r26.i0.n(str, "/app-service.js", false)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var3.A(i17, 30);
            if (z17) {
                g0Var3.A(i17, 31);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandServiceWCScriptReporter", "inject module(" + str + ") script failed");
            g0Var3.A(i17, 32);
        }
    }
}
