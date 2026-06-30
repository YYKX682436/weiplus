package r01;

/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a */
    public static final r01.j f449652a = new r01.j();

    /* renamed from: b */
    public static final kk.j f449653b = new kk.l(20);

    public static /* synthetic */ void b(r01.j jVar, int i17, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, r01.f fVar, r01.g gVar, long j17, int i18, java.lang.Long l17, int i19, java.lang.Integer num, int i27, java.lang.Object obj) {
        jVar.a(i17, str, f9Var, fVar, gVar, j17, i18, l17, i19, (i27 & 512) != 0 ? 0 : num);
    }

    public static r01.g e(r01.j jVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        jVar.getClass();
        if (f9Var.t2()) {
            java.util.LinkedList linkedList = ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(f9Var.m124847x74d37ac6(), f9Var.j()).f430114i;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList) && i17 < linkedList.size()) {
                ot0.s0 s0Var = (ot0.s0) linkedList.get(i17);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s0Var.f430295e)) {
                    try {
                        android.net.Uri parse = android.net.Uri.parse(s0Var.f430295e);
                        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(parse.getQueryParameter("mid"), 0L);
                        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(parse.getQueryParameter("idx"), 0);
                        byte[] decode = android.util.Base64.decode(parse.getQueryParameter("__biz"), 2);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
                        return new r01.g(V, P, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(new java.lang.String(decode, r26.c.f450398a), 0L));
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
        }
        return null;
    }

    public final void a(int i17, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, r01.f fVar, r01.g gVar, long j17, int i18, java.lang.Long l17, int i19, java.lang.Integer num) {
        int i27;
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        if (i17 != 5 || f9Var == null) {
            i27 = -1;
        } else {
            int mo78013xfb85f7b0 = f9Var.mo78013xfb85f7b0();
            i27 = f9Var.mo78013xfb85f7b0() == 49 ? ot0.q.v(f9Var.j()).f430199i : -1;
            r4 = mo78013xfb85f7b0;
        }
        long currentTimeMillis = i17 == 4 ? java.lang.System.currentTimeMillis() : -1L;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[20];
        objArr[0] = str;
        objArr[1] = fVar != null ? java.lang.Integer.valueOf(fVar.f449591a) : null;
        objArr[2] = fVar != null ? fVar.f449593c : null;
        objArr[3] = java.lang.Integer.valueOf(i17);
        objArr[4] = num;
        objArr[5] = f9Var != null ? java.lang.Long.valueOf(f9Var.mo78012x3fdd41df()) : null;
        objArr[6] = java.lang.Long.valueOf(j17);
        objArr[7] = fVar != null ? java.lang.Integer.valueOf(fVar.f449592b) : null;
        objArr[8] = f9Var != null ? java.lang.Long.valueOf(f9Var.I0()) : null;
        objArr[9] = java.lang.Integer.valueOf(i18);
        objArr[10] = valueOf;
        objArr[11] = gVar != null ? java.lang.Long.valueOf(gVar.f449605c) : null;
        objArr[12] = gVar != null ? java.lang.Long.valueOf(gVar.f449603a) : null;
        objArr[13] = gVar != null ? java.lang.Integer.valueOf(gVar.f449604b) : null;
        objArr[14] = java.lang.Long.valueOf(currentTimeMillis);
        objArr[15] = fVar != null ? java.lang.Integer.valueOf(fVar.f449594d) : null;
        objArr[16] = java.lang.Integer.valueOf(r4);
        objArr[17] = java.lang.Integer.valueOf(i27);
        objArr[18] = l17;
        objArr[19] = java.lang.Integer.valueOf(i19);
        g0Var.d(19202, objArr);
    }

    public final void c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, r01.f fVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.G)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChattingItemReportHelper", "fillReportMsgSendType msg source null");
            return;
        }
        if (f9Var.mo78013xfb85f7b0() == 318767153) {
            fVar.f449592b = 2;
        }
        c01.ea w17 = c01.w9.w(f9Var.G);
        if (w17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChattingItemReportHelper", "fillReportMsgSendType msg source value null");
            return;
        }
        int i17 = w17.f118678d;
        fVar.f449594d = i17;
        if (w17.f118676b == 3) {
            fVar.f449592b = 1;
        }
        if (i17 >= 4 && i17 <= 6) {
            fVar.f449592b = 5;
        }
        if (r01.a0.t0(f9Var)) {
            fVar.f449592b = 4;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.R1())) {
            return;
        }
        fVar.f449592b = 3;
    }

    public final void d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, r01.f fVar) {
        ot0.q v17;
        f9Var.P1();
        fVar.getClass();
        f9Var.R1();
        if (f9Var.b3()) {
            fVar.f449591a = 1;
        } else if (f9Var.g3()) {
            fVar.f449591a = 9;
        } else if (f9Var.J2()) {
            fVar.f449591a = 2;
        } else if (f9Var.m78014x7b98c171()) {
            fVar.f449591a = 5;
        } else if (f9Var.mo78013xfb85f7b0() == 452984881 || f9Var.mo78013xfb85f7b0() == 520093745) {
            fVar.f449591a = 6;
        } else {
            if (f9Var.t2()) {
                fVar.f449591a = 3;
                java.util.LinkedList linkedList = ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(f9Var.m124847x74d37ac6(), f9Var.j()).f430114i;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                    java.lang.String str = ((ot0.s0) linkedList.get(0)).f430295e;
                    fVar.f449593c = str != null ? str : "";
                }
            } else if (f9Var.a3()) {
                fVar.f449591a = 10;
            } else if (f9Var.k2() && f9Var.j() != null && (v17 = ot0.q.v(f9Var.j())) != null) {
                int i17 = v17.f430199i;
                if (i17 == 33 || i17 == 36) {
                    fVar.f449591a = 4;
                    java.lang.String str2 = v17.f430207k;
                    fVar.f449593c = str2 != null ? str2 : "";
                    java.lang.String str3 = v17.f430210k2;
                    fVar.getClass();
                } else if (i17 == 5) {
                    fVar.f449591a = 7;
                } else if (i17 == 3) {
                    fVar.f449591a = 8;
                }
            }
        }
        if (fVar.f449593c.length() > 0) {
            java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y9.a(fVar.f449593c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "doUrlEncode(...)");
            fVar.f449593c = a17;
        }
    }
}
