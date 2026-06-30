package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public class l0 extends com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22920xf0d5c107 {
    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22920xf0d5c107
    /* renamed from: onHangDetected */
    public void mo52390xe1823493(final java.lang.String str, final java.lang.String str2, final long j17) {
        ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.report.k0$$c
            @Override // java.lang.Runnable
            public final void run() {
                boolean z17;
                java.lang.String str3;
                java.lang.String str4;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559;
                java.lang.String str5 = str;
                long j18 = j17;
                java.lang.String str6 = str2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(str5);
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.m0.f169449b;
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.m0.class) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.b("AppBrandJsThreadHangReporter");
                    if (b18 != null) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        long j19 = b18.getLong("window_start_ms", 0L);
                        int i18 = b18.getInt("window_report_count", 0);
                        if (j19 <= 0 || currentTimeMillis - j19 >= com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.m0.f169448a) {
                            i18 = 0;
                        } else {
                            currentTimeMillis = j19;
                        }
                        if (i18 < 10) {
                            b18.putLong("window_start_ms", currentTimeMillis);
                            b18.putInt("window_report_count", i18 + 1);
                            z17 = true;
                        }
                    }
                    z17 = false;
                }
                if (!z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsThreadHangReporter", "report skipped by freq limit, appId:%s", str5);
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = (b17 == null || !(b17.u0() instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1)) ? null : b17.u0();
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str5 == null) {
                    str5 = "";
                }
                java.lang.String str7 = str5;
                int i19 = u07 != null ? u07.L : 0;
                int i27 = (u07 == null || (c12559xbdae8559 = u07.f128802b2) == null) ? 0 : c12559xbdae8559.f169323f;
                if (b17 == null || b17.x0() == null || (str3 = b17.x0().m52170xad58292c()) == null) {
                    str3 = "";
                }
                java.lang.String str8 = str3;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e8.f157048a;
                if (interfaceC11702x4ae7c33 == null || (str4 = interfaceC11702x4ae7c33.W0()) == null) {
                    str4 = "";
                }
                java.lang.String str9 = str4;
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsThreadHangReporter", "report type=%d appId=%s durationUs=%d page=%s", java.lang.Integer.valueOf(com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14510xca992952), str7, java.lang.Long.valueOf(j18), str8);
                    java.lang.String str10 = "";
                    if (str6 != null) {
                        try {
                            str10 = fp.s0.b(str6, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandJsThreadHangReporter", e17, "encode stackJson failed, appId:%s", str7);
                        }
                    }
                    jx3.f.INSTANCE.d(38236, java.lang.Integer.valueOf(com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14510xca992952), str7, java.lang.Long.valueOf(j18), str10, java.lang.Integer.valueOf(i19), str9, java.lang.Integer.valueOf(i27), str8);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandJsThreadHangReporter", e18, "report failed, appId:%s", str7);
                }
            }
        });
    }
}
