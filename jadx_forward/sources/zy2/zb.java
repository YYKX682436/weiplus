package zy2;

/* loaded from: classes2.dex */
public interface zb extends i95.m {
    static /* synthetic */ void E9(zy2.zb zbVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, ml2.x1 x1Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21053OnExpose");
        }
        if ((i18 & 8) != 0) {
            str2 = "";
        }
        java.lang.String str4 = str2;
        if ((i18 & 16) != 0) {
            str3 = null;
        }
        java.lang.String str5 = str3;
        if ((i18 & 32) != 0) {
            i17 = 0;
        }
        ((ml2.j0) zbVar).wj(abstractC14490x69736cb5, x1Var, str, str4, str5, i17);
    }

    static void I8(zy2.zb zbVar, ml2.u1 elementId, java.util.Map eidUdfKVMap, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportElementExpose");
        }
        if ((i17 & 2) != 0) {
            eidUdfKVMap = new java.util.LinkedHashMap();
        }
        if ((i17 & 4) != 0) {
            str = null;
        }
        if ((i17 & 8) != 0) {
            str2 = null;
        }
        if ((i17 & 16) != 0) {
            str3 = null;
        }
        if ((i17 & 32) != 0) {
            str4 = null;
        }
        if ((i17 & 64) != 0) {
            z17 = true;
        }
        ml2.j0 j0Var = (ml2.j0) zbVar;
        j0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elementId, "elementId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eidUdfKVMap, "eidUdfKVMap");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6464xd152d07e c6464xd152d07e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6464xd152d07e();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c6464xd152d07e.f138070d = java.lang.System.currentTimeMillis();
        if (str4 == null || str4.length() == 0) {
            str4 = ml2.j0.f409116i.C;
        }
        c6464xd152d07e.u(str4);
        c6464xd152d07e.p("");
        c6464xd152d07e.A("");
        c6464xd152d07e.y("");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6464xd152d07e.w(Ri);
        if (str == null) {
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            str = b52.b.b();
            if (str == null) {
                str = "";
            }
        }
        c6464xd152d07e.r(str);
        if (str2 == null) {
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            str2 = a52.a.f83117l;
        }
        c6464xd152d07e.q(str2);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        c6464xd152d07e.f138078l = c6464xd152d07e.b("TabContextID", c17, true);
        c6464xd152d07e.x("");
        c6464xd152d07e.v("");
        c6464xd152d07e.f138081o = c6464xd152d07e.b("ref_commentscene", "", true);
        c6464xd152d07e.s(elementId.f409641d);
        c6464xd152d07e.t(j0Var.Bi(eidUdfKVMap, z17));
        if (str3 == null) {
            str3 = "";
        }
        c6464xd152d07e.f138085s = c6464xd152d07e.b("session_buffer", str3, true);
        c6464xd152d07e.z(((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
        c6464xd152d07e.k();
    }

    static /* synthetic */ void Kh(zy2.zb zbVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, ml2.x1 x1Var, java.lang.String str, ml2.y yVar, int i17, long j17, int i18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21053");
        }
        ((ml2.j0) zbVar).oj(c1163xf1deaba4, x1Var, str, yVar, (i19 & 16) != 0 ? 0 : i17, (i19 & 32) != 0 ? -1L : j17, (i19 & 64) != 0 ? 0 : i18);
    }

    static /* synthetic */ void Ng(zy2.zb zbVar, long j17, long j18, java.lang.String str, java.lang.String str2, long j19, long j27, ml2.x1 x1Var, java.lang.String str3, java.lang.String str4, int i17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21053OnClick");
        }
        ((ml2.j0) zbVar).pj(j17, j18, (i18 & 4) != 0 ? null : str, str2, j19, j27, x1Var, str3, (i18 & 256) != 0 ? "" : str4, (i18 & 512) != 0 ? 0 : i17, c19792x256d2725);
    }

    static void T8(zy2.zb zbVar, ml2.t1 elementId, java.util.Map eidUdfKVMap, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportElementClick");
        }
        if ((i17 & 2) != 0) {
            eidUdfKVMap = new java.util.LinkedHashMap();
        }
        if ((i17 & 4) != 0) {
            str = null;
        }
        if ((i17 & 8) != 0) {
            str2 = null;
        }
        if ((i17 & 16) != 0) {
            str3 = null;
        }
        if ((i17 & 32) != 0) {
            str4 = null;
        }
        if ((i17 & 64) != 0) {
            z17 = true;
        }
        ml2.j0 j0Var = (ml2.j0) zbVar;
        j0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elementId, "elementId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eidUdfKVMap, "eidUdfKVMap");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318 c6463x6ead4318 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c6463x6ead4318.f138055d = java.lang.System.currentTimeMillis();
        if (str4 == null || str4.length() == 0) {
            str4 = ml2.j0.f409116i.C;
        }
        c6463x6ead4318.u(str4);
        c6463x6ead4318.p("");
        c6463x6ead4318.B("");
        c6463x6ead4318.y("");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6463x6ead4318.w(Ri);
        if (str == null) {
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            str = b52.b.b();
            if (str == null) {
                str = "";
            }
        }
        c6463x6ead4318.r(str);
        if (str2 == null) {
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            str2 = a52.a.f83117l;
        }
        c6463x6ead4318.q(str2);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        c6463x6ead4318.A(c17);
        c6463x6ead4318.x("");
        c6463x6ead4318.v("");
        c6463x6ead4318.s(elementId.f409546d);
        c6463x6ead4318.t(j0Var.Bi(eidUdfKVMap, z17));
        c6463x6ead4318.f138069r = c6463x6ead4318.b("session_buffer", str3, true);
        c6463x6ead4318.z(((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
        c6463x6ead4318.k();
    }

    static void f5(zy2.zb zbVar, ml2.z4 actionType, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21054AssistantEnable");
        }
        if ((i17 & 4) != 0) {
            str2 = null;
        }
        ml2.j0 j0Var = (ml2.j0) zbVar;
        j0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        if (!zl2.r4.f555483a.w1()) {
            mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
            if ((c1Var == null || c1Var.T) ? false : true) {
                return;
            }
        }
        j0Var.Ej(actionType, str, str2);
    }

    static /* synthetic */ void j5(zy2.zb zbVar, long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21017");
        }
        if ((i17 & 4) != 0) {
            str2 = null;
        }
        ((ml2.j0) zbVar).hj(j17, str, str2);
    }

    static /* synthetic */ void qd(zy2.zb zbVar, int i17, int i18, long j17, java.util.Map map, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21017ForAnchorLivePath");
        }
        if ((i19 & 8) != 0) {
            map = kz5.q0.f395534d;
        }
        ((ml2.j0) zbVar).ij(i17, i18, j17, map);
    }

    static /* synthetic */ void qg(zy2.zb zbVar, ml2.y2 y2Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21106");
        }
        if ((i17 & 4) != 0) {
            str2 = "";
        }
        if ((i17 & 8) != 0) {
            str3 = "";
        }
        ((ml2.j0) zbVar).Ij(y2Var, str, str2, str3);
    }

    static /* synthetic */ void s3(zy2.zb zbVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, long j17, ml2.x1 x1Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21053OnClick");
        }
        ((ml2.j0) zbVar).qj(abstractC14490x69736cb5, j17, x1Var, str, (i17 & 16) != 0 ? "" : str2, (i17 & 32) != 0 ? null : str3);
    }

    static /* synthetic */ void y6(zy2.zb zbVar, ml2.z4 z4Var, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21054");
        }
        if ((i17 & 4) != 0) {
            str2 = null;
        }
        ((ml2.j0) zbVar).yj(z4Var, str, str2);
    }
}
