package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff;

/* loaded from: classes7.dex */
public final class h1 implements m91.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f169732a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f169733b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f169734c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.d1 f169735d;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f169732a = runtime;
        m91.j jVar = m91.j.f406488a;
        m91.j.f406489b.add(this);
        this.f169735d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.d1(this);
    }

    public static void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.h1 h1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 page, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.j0 scene, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.l0 l0Var, com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5133xf1a4812 c5133xf1a4812, int i17, java.lang.Object obj) {
        int i18 = 1;
        boolean z18 = (i17 & 4) != 0 ? true : z17;
        com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5133xf1a4812 c5133xf1a48122 = (i17 & 16) != 0 ? null : c5133xf1a4812;
        h1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        if (!z18 && !z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.j0 j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.j0.f169742d;
        }
        if (page.j2() && z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = page.t3();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 u07 = t37 != null ? t37.u0() : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(u07, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c6.a(52, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) u07);
        }
        if (z18 && scene != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.j0.f169744f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.b();
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.a.f169688a[scene.ordinal()];
            if (i19 != 1) {
                i18 = 2;
                if (i19 != 2) {
                    i18 = 3;
                    if (i19 != 3) {
                        i18 = 0;
                    }
                }
            }
            bVar.s("type", java.lang.Integer.valueOf(i18));
            page.i(bVar, new int[0]);
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.g1(h1Var, scene, z18, l0Var, page, c5133xf1a48122));
    }

    public final java.util.List a() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = this.f169732a.x0();
        if (x07 != null) {
            java.util.Iterator h07 = x07.h0(true);
            while (true) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g4 g4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g4) h07;
                if (!g4Var.hasNext()) {
                    break;
                }
                linkedList.addLast(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2) g4Var.next()).mo14683xad58292c());
            }
        }
        return linkedList;
    }

    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7040xd8bd499e b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 S2;
        java.lang.String a17;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7040xd8bd499e c7040xd8bd499e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7040xd8bd499e();
        c7040xd8bd499e.f143563e = c7040xd8bd499e.b("Appid", this.f169732a.f156336n, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 u07 = this.f169732a.u0();
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 c3897xbc286aa1 = u07 instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 ? (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) u07 : null;
        if (c3897xbc286aa1 != null) {
            c7040xd8bd499e.f143562d = c7040xd8bd499e.b("InstanceId", c3897xbc286aa1.f128810w, true);
            c7040xd8bd499e.f143564f = c7040xd8bd499e.b("Username", c3897xbc286aa1.f128811x, true);
            c7040xd8bd499e.f143565g = c3897xbc286aa1.f128817z + 1000;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = c3897xbc286aa1.f128802b2;
            c7040xd8bd499e.f143566h = c12559xbdae8559.f169323f;
            java.lang.String str = c12559xbdae8559.f169324g;
            c7040xd8bd499e.f143567i = c7040xd8bd499e.b("SceneNote", (str == null || (a17 = fp.s0.a(str)) == null) ? null : u46.l.t(a17, 0, 1024), true);
            c7040xd8bd499e.f143568j = c3897xbc286aa1.L;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f169732a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = c11510xdd90c2f2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) c11510xdd90c2f2 : null;
        c7040xd8bd499e.f143569k = c7040xd8bd499e.b("PublibVersionStr", (o6Var == null || (S2 = o6Var.S2(false)) == null) ? null : S2.W0(), true);
        c7040xd8bd499e.f143570l = c7040xd8bd499e.b("NetWorkType", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.c(null, 1, null), true);
        c7040xd8bd499e.f143573o = java.lang.System.currentTimeMillis();
        c7040xd8bd499e.f143576r = c7040xd8bd499e.b("QualityIssuePageLastError", null, true);
        java.lang.String str2 = this.f169734c;
        c7040xd8bd499e.f143577s = c7040xd8bd499e.b("QualityIssueServiceLastError", str2 != null ? u46.l.t(str2, 0, 1024) : null, true);
        c7040xd8bd499e.f143578t = c7040xd8bd499e.b("ServiceRuntimeContext", this.f169733b, true);
        java.lang.String str3 = this.f169732a.u0().f158812e;
        if (str3 == null) {
            str3 = "";
        }
        c7040xd8bd499e.B = c7040xd8bd499e.b("NickName", fp.s0.a(str3), true);
        return c7040xd8bd499e;
    }

    public final void c(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7040xd8bd499e c7040xd8bd499e, java.util.List list) {
        c7040xd8bd499e.f143574p = list.size();
        c7040xd8bd499e.f143575q = c7040xd8bd499e.b("LastNPagePath", u46.l.t(kz5.n0.g0(list, "#", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e1.f169713d, 30, null), 0, 1024), true);
    }
}
