package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

/* loaded from: classes7.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3 f172276a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.h3 f172277b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.h3();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f172278c = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.i3.f172268d);

    public final int a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 o0Var) {
        return (o0Var != null ? o0Var.ordinal() : -1) + 1;
    }

    public final boolean b() {
        return ((java.lang.Boolean) ((jz5.n) f172278c).mo141623x754a37bb()).booleanValue();
    }

    public final long c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.g3 g3Var) {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        return uptimeMillis - f172277b.get().get(g3Var.f172252d, 1 + uptimeMillis);
    }

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.g3 g3Var) {
        f172277b.get().put(g3Var.f172252d, android.os.SystemClock.uptimeMillis());
    }

    public final void e(boolean z17, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar) {
        long c17 = c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.g3.f172247f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 w17 = yVar != null ? yVar.w1() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", "onAllocEmptySubContextEnd, costTimeMs: " + c17 + ", allocSuccess: " + z17 + ", componentInitType: " + w17);
        }
        if (b()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007 c6307x4654e007 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007();
            c6307x4654e007.f136643d = 8;
            c6307x4654e007.s(cl.x.b());
            c6307x4654e007.f136651l = a(w17);
            c6307x4654e007.f136646g = c17;
            c6307x4654e007.p(z17 ? "1" : "0");
            c6307x4654e007.k();
        }
    }

    public final void f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33, java.lang.String str, boolean z17, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar) {
        java.lang.String str2;
        long c17 = c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.g3.f172249h);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 w17 = yVar != null ? yVar.w1() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAllocSnapshotSubContextEnd, costTimeMs: ");
            sb6.append(c17);
            sb6.append(", commLibReader: ");
            sb6.append(interfaceC11702x4ae7c33 != null ? t(interfaceC11702x4ae7c33) : null);
            sb6.append(", contextName: ");
            sb6.append(str);
            sb6.append(", allocSuccess: ");
            sb6.append(z17);
            sb6.append(", componentInitType: ");
            sb6.append(w17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
        }
        if (b()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007 c6307x4654e007 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007();
            c6307x4654e007.f136643d = 11;
            if (interfaceC11702x4ae7c33 == null || (str2 = t(interfaceC11702x4ae7c33)) == null) {
                str2 = "";
            }
            c6307x4654e007.r(str2);
            c6307x4654e007.s(cl.x.b());
            c6307x4654e007.f136651l = a(w17);
            c6307x4654e007.f136646g = c17;
            c6307x4654e007.p(str);
            c6307x4654e007.q(z17 ? "1" : "0");
            c6307x4654e007.k();
        }
    }

    public final void g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33, java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAllocSnapshotSubContextStart, commLibReader: ");
            sb6.append(interfaceC11702x4ae7c33 != null ? t(interfaceC11702x4ae7c33) : null);
            sb6.append(", contextName: ");
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
        }
        d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.g3.f172249h);
        if (b()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007 c6307x4654e007 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007();
            c6307x4654e007.f136643d = 10;
            if (interfaceC11702x4ae7c33 == null || (str2 = t(interfaceC11702x4ae7c33)) == null) {
                str2 = "";
            }
            c6307x4654e007.r(str2);
            c6307x4654e007.s(cl.x.b());
            c6307x4654e007.p(str);
            c6307x4654e007.k();
        }
    }

    public final void h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33, java.lang.String str, boolean z17, cl.k1 k1Var, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar) {
        long j17 = k1Var == null ? 0L : k1Var.f124209b - k1Var.f124208a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 w17 = yVar != null ? yVar.w1() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBootstrapMainContext, costTimeMs: ");
            sb6.append(j17);
            sb6.append(", commLibReader: ");
            sb6.append(interfaceC11702x4ae7c33 != null ? t(interfaceC11702x4ae7c33) : null);
            sb6.append(", scriptName: ");
            sb6.append(str);
            sb6.append(", bootstrapSuccess: ");
            sb6.append(z17);
            sb6.append(", executeDetails: ");
            sb6.append(k1Var);
            sb6.append(", componentInitType: ");
            sb6.append(w17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
        }
        if (b()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007 c6307x4654e007 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007();
            c6307x4654e007.f136643d = 15;
            c6307x4654e007.s(cl.x.b());
            c6307x4654e007.f136651l = a(w17);
            c6307x4654e007.f136646g = j17;
            c6307x4654e007.p(str);
            c6307x4654e007.q(java.lang.String.valueOf((z17 ? 1 : -1) * (k1Var != null ? k1Var.f4717x67f135e7 : 0)));
            c6307x4654e007.k();
        }
    }

    public final void i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 snapshotInfo, boolean z17, cl.k1 k1Var, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotInfo, "snapshotInfo");
        long j17 = k1Var == null ? 0L : k1Var.f124209b - k1Var.f124208a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 w17 = yVar != null ? yVar.w1() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
        boolean z18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3 l3Var = snapshotInfo.f172201h;
        if (z18) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBootstrapSnapshotMainContextEnd, costTimeMs: ");
            sb6.append(j17);
            sb6.append(", commLibReader: ");
            sb6.append(interfaceC11702x4ae7c33 != null ? t(interfaceC11702x4ae7c33) : null);
            sb6.append(", category: ");
            sb6.append(l3Var);
            sb6.append(", bootstrapSuccess: ");
            sb6.append(z17);
            sb6.append(", executeDetails: ");
            sb6.append(k1Var);
            sb6.append(", componentInitType: ");
            sb6.append(w17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
        }
        if (b()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007 c6307x4654e007 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007();
            c6307x4654e007.f136643d = 17;
            if (interfaceC11702x4ae7c33 == null || (str = t(interfaceC11702x4ae7c33)) == null) {
                str = "";
            }
            c6307x4654e007.r(str);
            c6307x4654e007.s(cl.x.b());
            c6307x4654e007.f136651l = a(w17);
            c6307x4654e007.f136646g = j17;
            c6307x4654e007.p(java.lang.String.valueOf(z17));
            c6307x4654e007.q(l3Var.f172308d);
            c6307x4654e007.k();
        }
    }

    public final void j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 snapshotInfo) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotInfo, "snapshotInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3 l3Var = snapshotInfo.f172201h;
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBootstrapSnapshotMainContextStart, commLibReader: ");
            sb6.append(interfaceC11702x4ae7c33 != null ? t(interfaceC11702x4ae7c33) : null);
            sb6.append(", category: ");
            sb6.append(l3Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
        }
        if (b()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007 c6307x4654e007 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007();
            c6307x4654e007.f136643d = 16;
            if (interfaceC11702x4ae7c33 == null || (str = t(interfaceC11702x4ae7c33)) == null) {
                str = "";
            }
            c6307x4654e007.r(str);
            c6307x4654e007.s(cl.x.b());
            c6307x4654e007.p(l3Var.f172308d);
            c6307x4654e007.k();
        }
    }

    public final void k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33, java.lang.String str, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar) {
        java.lang.String str2;
        long c17 = c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.g3.f172250i);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 w17 = yVar != null ? yVar.w1() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBootstrapSnapshotSubContextEnd, costTimeMs: ");
            sb6.append(c17);
            sb6.append(", commLibReader: ");
            sb6.append(interfaceC11702x4ae7c33 != null ? t(interfaceC11702x4ae7c33) : null);
            sb6.append(", contextName: ");
            sb6.append(str);
            sb6.append(", componentInitType: ");
            sb6.append(w17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
        }
        if (b()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007 c6307x4654e007 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007();
            c6307x4654e007.f136643d = 13;
            if (interfaceC11702x4ae7c33 == null || (str2 = t(interfaceC11702x4ae7c33)) == null) {
                str2 = "";
            }
            c6307x4654e007.r(str2);
            c6307x4654e007.s(cl.x.b());
            c6307x4654e007.f136651l = a(w17);
            c6307x4654e007.f136646g = c17;
            c6307x4654e007.p(str);
            c6307x4654e007.k();
        }
    }

    public final void l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33, java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBootstrapSnapshotSubContextStart, commLibReader: ");
            sb6.append(interfaceC11702x4ae7c33 != null ? t(interfaceC11702x4ae7c33) : null);
            sb6.append(", contextName: ");
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
        }
        d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.g3.f172250i);
        if (b()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007 c6307x4654e007 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007();
            c6307x4654e007.f136643d = 12;
            if (interfaceC11702x4ae7c33 == null || (str2 = t(interfaceC11702x4ae7c33)) == null) {
                str2 = "";
            }
            c6307x4654e007.r(str2);
            c6307x4654e007.s(cl.x.b());
            c6307x4654e007.p(str);
            c6307x4654e007.k();
        }
    }

    public final void m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33, java.lang.String str, java.util.List list, java.util.List list2, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar) {
        cl.k1[] k1VarArr;
        java.lang.Boolean[] boolArr;
        long c17 = c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.g3.f172248g);
        java.lang.String str2 = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 w17 = yVar != null ? yVar.w1() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBootstrapSubContextEnd, costTimeMs: ");
            sb6.append(c17);
            sb6.append(", commLibReader: ");
            sb6.append(interfaceC11702x4ae7c33 != null ? t(interfaceC11702x4ae7c33) : null);
            sb6.append(", scriptName: ");
            sb6.append(str);
            sb6.append(", bootstrapSuccess: ");
            sb6.append((list == null || (boolArr = (java.lang.Boolean[]) list.toArray(new java.lang.Boolean[0])) == null) ? null : kz5.s.b(boolArr));
            sb6.append(", executeDetails: ");
            if (list2 != null && (k1VarArr = (cl.k1[]) list2.toArray(new cl.k1[0])) != null) {
                str2 = java.util.Arrays.toString(k1VarArr);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "toString(...)");
            }
            sb6.append(str2);
            sb6.append(", componentInitType: ");
            sb6.append(w17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
        }
        if (b()) {
            java.lang.String str3 = "";
            if (list != null && list2 != null && !list.isEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int size = list.size();
                int i17 = 0;
                while (true) {
                    int i18 = 1;
                    if (i17 < size) {
                        java.lang.Boolean bool = (java.lang.Boolean) list.get(i17);
                        if (bool == null) {
                            i18 = 0;
                        } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
                            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.FALSE)) {
                                throw new jz5.j();
                            }
                            i18 = -1;
                        }
                        cl.k1 k1Var = (cl.k1) list2.get(i17);
                        arrayList.add(java.lang.Integer.valueOf(i18 * (k1Var != null ? k1Var.f4717x67f135e7 : 0)));
                        i17++;
                    } else {
                        str3 = 1 == arrayList.size() ? java.lang.String.valueOf(((java.lang.Number) arrayList.get(0)).intValue()) : kz5.n0.g0(arrayList, "_", null, null, 0, null, null, 62, null);
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", "onBootstrapSubContextEnd, actionParams2: " + str3);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007 c6307x4654e007 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007();
            c6307x4654e007.f136643d = 9;
            c6307x4654e007.s(cl.x.b());
            c6307x4654e007.f136651l = a(w17);
            c6307x4654e007.f136646g = c17;
            c6307x4654e007.p(str);
            c6307x4654e007.q(str3);
            c6307x4654e007.k();
        }
    }

    public final void n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBootstrapSubContextStart, commLibReader: ");
            sb6.append(interfaceC11702x4ae7c33 != null ? t(interfaceC11702x4ae7c33) : null);
            sb6.append(", scriptName: ");
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
        }
        d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.g3.f172248g);
    }

    public final void o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 c12745x1ee4df80, long j17, long j18, boolean z17, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3 l3Var;
        java.lang.String str2;
        long j19 = j17;
        long c17 = c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.g3.f172246e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 w17 = yVar != null ? yVar.w1() : null;
        boolean z18 = c12745x1ee4df80 != null ? c12745x1ee4df80.f172207q : false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
        java.lang.String str3 = "";
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreateIsolateEnd, ");
            sb6.append(c12745x1ee4df80 != null ? "" : "not ");
            sb6.append("use snapshot, costTimeMs: ");
            sb6.append(c17);
            sb6.append(", isolateCreateCostMs: ");
            sb6.append(j19);
            sb6.append(", contextCreateCostMs: ");
            sb6.append(j18);
            sb6.append(", didRecover: ");
            sb6.append(z17);
            sb6.append(", isNodeSnapshot: ");
            sb6.append(z18);
            sb6.append(", commLibReader: ");
            sb6.append(interfaceC11702x4ae7c33 != null ? t(interfaceC11702x4ae7c33) : null);
            sb6.append(", componentInitType: ");
            sb6.append(w17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
        }
        boolean z19 = c12745x1ee4df80 != null;
        if (b()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007 c6307x4654e007 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007();
            c6307x4654e007.f136643d = 7;
            if (interfaceC11702x4ae7c33 == null || (str = t(interfaceC11702x4ae7c33)) == null) {
                str = "";
            }
            c6307x4654e007.r(str);
            c6307x4654e007.s(cl.x.b());
            c6307x4654e007.f136651l = a(w17);
            c6307x4654e007.f136646g = j19 >= 0 ? j19 : c17;
            c6307x4654e007.p(z19 ? "1" : "0");
            c6307x4654e007.q(j18 >= 0 ? java.lang.String.valueOf(j18) : "");
            if (c12745x1ee4df80 != null && (l3Var = c12745x1ee4df80.f172201h) != null && (str2 = l3Var.f172308d) != null) {
                str3 = str2;
            }
            c6307x4654e007.f136649j = c6307x4654e007.b("ActionParams3", str3, true);
            if (j19 < 0) {
                j19 = 0;
            }
            c6307x4654e007.f136650k = c6307x4654e007.b("ActionParams4", java.lang.String.valueOf((c17 - j19) - (j18 >= 0 ? j18 : 0L)), true);
            c6307x4654e007.f136652m = c6307x4654e007.b("ActionParams5", z17 ? "1" : "0", true);
            c6307x4654e007.f136653n = c6307x4654e007.b("ActionParams6", z18 ? "1" : "0", true);
            c6307x4654e007.k();
        }
    }

    public final void p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 c12745x1ee4df80) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3 l3Var;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c) {
            if (c12745x1ee4df80 != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreateIsolateStart, use snapshot, commLibReader: ");
                sb6.append(interfaceC11702x4ae7c33 != null ? t(interfaceC11702x4ae7c33) : null);
                sb6.append(", metaInfo: ");
                sb6.append(c12745x1ee4df80.f172206p);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onCreateIsolateStart, not use snapshot, commLibReader: ");
                sb7.append(interfaceC11702x4ae7c33 != null ? t(interfaceC11702x4ae7c33) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb7.toString());
            }
        }
        d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.g3.f172246e);
        boolean z17 = c12745x1ee4df80 != null;
        if (b()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007 c6307x4654e007 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007();
            c6307x4654e007.f136643d = 6;
            java.lang.String str3 = "";
            if (interfaceC11702x4ae7c33 == null || (str = t(interfaceC11702x4ae7c33)) == null) {
                str = "";
            }
            c6307x4654e007.r(str);
            c6307x4654e007.s(cl.x.b());
            c6307x4654e007.p(z17 ? "1" : "0");
            if (c12745x1ee4df80 != null && (l3Var = c12745x1ee4df80.f172201h) != null && (str2 = l3Var.f172308d) != null) {
                str3 = str2;
            }
            c6307x4654e007.q(str3);
            c6307x4654e007.k();
        }
    }

    public final void q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 commLibReader, com.p159x477cd522.p160x333422.p163x10fad5c4.C1515x4c3290a6 params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commLibReader, "commLibReader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", "onCreateSnapshotStart, commLibReader: " + t(commLibReader) + ", params: " + params);
        }
    }

    public final void r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onJsErrorInSnapshotContext, commLibReader: ");
            sb6.append(interfaceC11702x4ae7c33 != null ? t(interfaceC11702x4ae7c33) : null);
            sb6.append(", contextName: ");
            sb6.append(str);
            sb6.append(", message: ");
            sb6.append(str2);
            sb6.append(", stackTrace: ");
            sb6.append(str3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
        }
        if (b()) {
            java.lang.String str5 = "{message: '" + str2 + "', stack: '" + str3 + "'}";
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007 c6307x4654e007 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007();
            c6307x4654e007.f136643d = 14;
            if (interfaceC11702x4ae7c33 == null || (str4 = t(interfaceC11702x4ae7c33)) == null) {
                str4 = "";
            }
            c6307x4654e007.r(str4);
            c6307x4654e007.s(cl.x.b());
            c6307x4654e007.p(str);
            c6307x4654e007.q(fp.s0.b(str5, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            c6307x4654e007.k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 commLibReader, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3 category, int i17, int i18, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commLibReader, "commLibReader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", "onSnapshotUseBlock, commLibReader: " + t(commLibReader) + ", category: " + category + ", useExceptionCount: " + i17 + ", recoverCount: " + i18 + ", isV8VersionMisMatched: " + z17 + ", isSnapshotBad: " + z18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1923, 2);
        int i19 = z17;
        if (b()) {
            if (z18) {
                i19 = (z17 ? 1 : 0) | 2;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007 c6307x4654e007 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007();
            c6307x4654e007.f136643d = 3;
            c6307x4654e007.r(t(commLibReader));
            c6307x4654e007.s(cl.x.b());
            c6307x4654e007.p(java.lang.String.valueOf(i17));
            c6307x4654e007.q(java.lang.String.valueOf(i19));
            c6307x4654e007.f136649j = c6307x4654e007.b("ActionParams3", category.f172308d, true);
            c6307x4654e007.f136650k = c6307x4654e007.b("ActionParams4", java.lang.String.valueOf(i18), true);
            c6307x4654e007.k();
        }
    }

    public final java.lang.String t(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33) {
        return "[" + interfaceC11702x4ae7c33.i() + "][" + interfaceC11702x4ae7c33.Y0() + ']';
    }
}
