package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff;

/* loaded from: classes7.dex */
public abstract class u {
    public static final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7108xda6a1515 a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 session) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7108xda6a1515 c7108xda6a1515 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7108xda6a1515();
        c7108xda6a1515.f144257e = c7108xda6a1515.b("AppId", session.f169668e, true);
        c7108xda6a1515.f144256d = c7108xda6a1515.b("InstanceId", session.f169667d, true);
        int i17 = session.f169669f;
        c7108xda6a1515.f144259g = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.g0.demo : cm.g0.debug : cm.g0.release;
        c7108xda6a1515.f144260h = session.f169670g;
        c7108xda6a1515.f144262j = session.f169671h;
        c7108xda6a1515.f144258f = session.f169672i;
        return c7108xda6a1515;
    }

    public static final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7111x29f27a4c b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 session) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7111x29f27a4c c7111x29f27a4c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7111x29f27a4c();
        c7111x29f27a4c.f144298e = c7111x29f27a4c.b("AppId", session.f169668e, true);
        c7111x29f27a4c.f144297d = c7111x29f27a4c.b("InstanceId", session.f169667d, true);
        int i17 = session.f169669f;
        c7111x29f27a4c.f144300g = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.n0.demo : cm.n0.debug : cm.n0.release;
        c7111x29f27a4c.f144301h = session.f169670g;
        c7111x29f27a4c.f144303j = session.f169671h;
        c7111x29f27a4c.f144299f = session.f169672i;
        return c7111x29f27a4c;
    }

    public static final int c() {
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a)) {
            return 0;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, "wifi")) {
            return 1;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, "2g")) {
            return 2;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, "3g")) {
            return 3;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, "4g")) {
            return 4;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, "offline") ? 5 : 10000;
    }

    public static final long d() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.app.u6 u6Var = com.p314xaae8f345.mm.app.u6.INSTANCE;
        long e17 = u6Var.e(com.p314xaae8f345.mm.app.t6.UNTIL_KERNEL_STARTUP_END);
        if (e17 <= -1) {
            return 0L;
        }
        long j17 = u6Var.f135363g;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return (java.lang.System.currentTimeMillis() - (android.os.SystemClock.elapsedRealtime() - j17)) + e17;
    }

    public static final void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime, boolean z17, boolean z18) {
        java.lang.String a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.a(runtime);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a18);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7098xa94c910b c7098xa94c910b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7098xa94c910b();
        c7098xa94c910b.f144110e = c7098xa94c910b.b("AppId", a18.f169668e, true);
        c7098xa94c910b.f144111f = a18.f169672i;
        int i17 = a18.f169669f;
        c7098xa94c910b.f144112g = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.z.demo : cm.z.debug : cm.z.release;
        c7098xa94c910b.f144113h = a18.f169670g;
        c7098xa94c910b.f144114i = runtime.l2().f169323f;
        java.lang.String str = runtime.l2().f169324g;
        c7098xa94c910b.f144130y = c7098xa94c910b.b("SceneNote", (str == null || (a17 = fp.s0.a(str)) == null) ? null : u46.l.t(a17, 0, 1024), true);
        if (1036 == runtime.l2().f169323f || 1346 == runtime.l2().f169323f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = runtime.u0().D;
            c7098xa94c910b.f144120o = c7098xa94c910b.b("scene_data", c11812xa040dc98 != null ? c11812xa040dc98.f158856e : null, true);
        }
        c7098xa94c910b.f144116k = c7098xa94c910b.b("networkType", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), true);
        c7098xa94c910b.f144118m = c7098xa94c910b.b("UserName", runtime.u0().f128811x, true);
        c7098xa94c910b.f144109d = c7098xa94c910b.b("InstanceId", a18.f169667d, true);
        c7098xa94c910b.f144129x = c7098xa94c910b.b(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, runtime.u0().f128809v, true);
        c7098xa94c910b.f144117l = z17 ? 0L : 1L;
        c7098xa94c910b.f144115j = a18.f169678q;
        c7098xa94c910b.f144119n = java.lang.Long.valueOf(z18 ? 1L : 0L).longValue();
        c7098xa94c910b.f144121p = a18.b();
        java.lang.String t07 = runtime.t0();
        if (t07 == null) {
            t07 = "";
        }
        java.lang.String b17 = s91.a.b(t07);
        c7098xa94c910b.f144122q = c7098xa94c910b.b(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, b17 != null ? u46.l.t(b17, 0, 1024) : null, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1141xc84c5534.C12376xdd2459a1 c12376xdd2459a1 = runtime.u0().f128801a2;
        if (c12376xdd2459a1 != null) {
            c7098xa94c910b.f144123r = c7098xa94c910b.b("reload_referrer", c12376xdd2459a1.f166660d, true);
            c7098xa94c910b.f144124s = c7098xa94c910b.b("reload_reason", c12376xdd2459a1.f166661e, true);
        }
        c7098xa94c910b.f144125t = a18.f169674n ? 1 : 0;
        c7098xa94c910b.f144126u = runtime.u0().K1;
        c7098xa94c910b.f144127v = runtime.u0().W1.f129157d;
        c7098xa94c910b.f144128w = c7098xa94c910b.b("shortLink", runtime.u0().E1, true);
        c7098xa94c910b.f144131z = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.a(a18.F);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 S2 = runtime.S2(false);
        c7098xa94c910b.A = c7098xa94c910b.b("PubLibVersion", S2 != null ? S2.W0() : null, true);
        c7098xa94c910b.B = a18.f169675o;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppStartupPerformanceReportUtil", "qualityOpen report username[" + runtime.u0().f128811x + "] appId[" + runtime.f156336n + "], instanceId[" + c7098xa94c910b.f144109d + "], sessionId[" + c7098xa94c910b.f144129x + ']');
        c7098xa94c910b.k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0196, code lost:
    
        if (r7 != false) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a8  */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.f(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel, java.lang.String, boolean):java.lang.String");
    }

    public static final void g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc parcel, java.lang.String instanceId, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceId, "instanceId");
        if (parcel.f166443o.f169330p != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7088xe1c6c983 c7088xe1c6c983 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7088xe1c6c983();
            c7088xe1c6c983.f143960d = c7088xe1c6c983.b("instanceId", instanceId, true);
            c7088xe1c6c983.f143970n = parcel.f166443o.f169330p.getInt("CgiSpeedOutSideStructCgiNo");
            c7088xe1c6c983.f143966j = c7088xe1c6c983.b("networkType", parcel.f166443o.f169330p.getString("CgiSpeedOutSideStructNetworkType"), true);
            c7088xe1c6c983.f143962f = c7088xe1c6c983.b(dm.i4.f66875xa013b0d5, parcel.f166434d, true);
            c7088xe1c6c983.f143961e = c7088xe1c6c983.b("appid", str, true);
            c7088xe1c6c983.f143969m = parcel.f166443o.f169330p.getInt("CgiSpeedOutSideStructBizRet");
            c7088xe1c6c983.f143965i = parcel.f166443o.f169330p.getLong("CgiSpeedOutSideStructCostTime");
            c7088xe1c6c983.f143964h = parcel.f166443o.f169330p.getLong("CgiSpeedOutSideStructEndTimeStamp");
            c7088xe1c6c983.f143967k = parcel.f166443o.f169330p.getLong("CgiSpeedOutSideStructResponseSize");
            c7088xe1c6c983.f143968l = parcel.f166443o.f169330p.getInt("CgiSpeedOutSideStructRet");
            c7088xe1c6c983.f143963g = parcel.f166443o.f169330p.getLong("CgiSpeedOutSideStructStartTimeStamp");
            c7088xe1c6c983.k();
        }
    }
}
