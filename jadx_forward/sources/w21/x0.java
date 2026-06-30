package w21;

/* loaded from: classes12.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f524044a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static volatile java.util.HashMap f524045b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static volatile java.util.HashMap f524046c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static volatile java.util.HashMap f524047d = new java.util.HashMap();

    public static boolean a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        if (str == null) {
            return false;
        }
        w21.w0 j17 = j(str);
        if (j17 == null) {
            return true;
        }
        if (j17.f524021e != 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D0(j17.f524019c, j17.f524021e);
        }
        return e(f9Var, str);
    }

    public static boolean b(java.lang.String str) {
        if (str == null) {
            return false;
        }
        w21.w0 j17 = j(str);
        if (j17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceLogic", "cancel null record : ".concat(str));
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceLogic", "cancel record : " + str + " LocalId:" + j17.f524029m);
        long j18 = j17.f524029m;
        boolean e17 = e(j18 != 0 ? pt0.f0.Li(j17.f524019c, j18) : null, str);
        long j19 = j17.f524029m;
        if (j19 != 0) {
            pt0.f0.P7(j17.f524019c, j19);
        }
        return e17;
    }

    public static boolean c(java.lang.String str) {
        w21.w0 j17;
        int i17;
        if (str == null || (j17 = j(str)) == null || (i17 = j17.f524031o) >= 250) {
            return false;
        }
        j17.f524031o = i17 + 1;
        j17.f524017a = 8192;
        return w(j17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x016b, code lost:
    
        if (r6 == r21) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long d(w21.w0 r31, boolean r32, int r33, java.lang.String r34, java.lang.String r35, com.p314xaae8f345.mm.p944x882e457a.p0 r36) {
        /*
            Method dump skipped, instructions count: 1458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w21.x0.d(w21.w0, boolean, int, java.lang.String, java.lang.String, com.tencent.mm.modelbase.p0):long");
    }

    public static boolean e(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceLogic", "deleteRecordFile() called with: fileName = [" + str + "]");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        w21.p0.Di().d(str);
        w21.p0.Di().m0(bm5.y.a(f9Var, bm5.f0.f104106u), str);
        java.lang.String yj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).yj(f9Var, str, false);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(yj6)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(yj6);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        return m17.a() && m17.f294799a.d(m17.f294800b);
    }

    public static int f(int i17, byte[] bArr, int i18, int i19) {
        int i27;
        if (bArr != null && bArr.length != 0) {
            if (i17 == 0) {
                i17 = bArr.hashCode() & 255;
                i27 = i17;
            } else {
                i27 = i17 & 255;
            }
            for (int i28 = 0; i28 < i19; i28++) {
                i17 += (bArr[i18 + i28] & i27) * 256;
            }
        }
        return i17;
    }

    public static java.lang.String g(java.lang.String str, java.lang.String str2) {
        java.lang.String n07 = w21.g1.n0(c01.z1.r(), str2);
        w21.w0 w0Var = new w21.w0();
        w0Var.f524018b = n07;
        w0Var.f524019c = str;
        w0Var.f524026j = java.lang.System.currentTimeMillis() / 1000;
        w0Var.f524020d = n07;
        w0Var.f524027k = java.lang.System.currentTimeMillis() / 1000;
        w0Var.f524025i = 1;
        w0Var.f524030n = c01.z1.r();
        w0Var.f524017a = -1;
        if (!w21.p0.Di().L0(w0Var)) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceLogic", "startRecord insert voicestg success");
        return n07;
    }

    public static w21.j h(bm5.y yVar, java.lang.String str, java.lang.String str2, boolean z17) {
        w21.g1 Di = w21.p0.Di();
        Di.getClass();
        java.lang.String wj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).wj(yVar, str2, false, z17);
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, -1);
        if (P == 1) {
            java.util.HashMap hashMap = (java.util.HashMap) Di.f523908f;
            if (hashMap.get(wj6) == null) {
                hashMap.put(wj6, new w21.l0(wj6));
            }
            return (w21.j) hashMap.get(wj6);
        }
        if (P != 4) {
            java.util.HashMap hashMap2 = (java.util.HashMap) Di.f523907e;
            if (hashMap2.get(wj6) == null) {
                hashMap2.put(wj6, new w21.a(wj6));
            }
            return (w21.j) hashMap2.get(wj6);
        }
        java.util.HashMap hashMap3 = (java.util.HashMap) Di.f523909g;
        if (hashMap3.get(wj6) == null) {
            hashMap3.put(wj6, new w21.x(wj6));
        }
        return (w21.j) hashMap3.get(wj6);
    }

    public static w21.j i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        w21.g1 Di = w21.p0.Di();
        Di.getClass();
        return Di.u0(bm5.y.a(f9Var, bm5.f0.f104106u), str);
    }

    public static w21.w0 j(java.lang.String str) {
        return w21.p0.Di().y0(str);
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.f9 k(java.lang.String str) {
        w21.w0 j17;
        if (str == null || (j17 = j(str)) == null) {
            return null;
        }
        return pt0.f0.Li(j17.f524019c, j17.f524029m);
    }

    public static java.util.List l(int i17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        android.database.Cursor cursor;
        l75.k0 k0Var = w21.p0.Di().f523906d;
        if (k0Var != null) {
            cursor = k0Var.d(false, "voiceinfo", new java.lang.String[]{"FileName", "MsgLocalId", "MsgId"}, "MsgTalker IS NULL", new java.lang.String[0], null, null, null, i17 + "", c26987xeef691ab);
        } else {
            cursor = null;
        }
        if (cursor == null || !cursor.moveToFirst()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        do {
            w21.w0 w0Var = new w21.w0();
            w0Var.f524018b = cursor.getString(0);
            w0Var.f524029m = cursor.getLong(1);
            w0Var.f524021e = cursor.getLong(2);
            arrayList.add(w0Var);
        } while (cursor.moveToNext());
        cursor.close();
        return arrayList;
    }

    public static float m(long j17) {
        float f17 = ((float) j17) / 1000.0f;
        if (f17 < 1.0f) {
            f17 = 1.0f;
        }
        if (f17 > 60.0f) {
            f17 = 60.0f;
        }
        return java.lang.Math.round(f17);
    }

    public static boolean n(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null || !f9Var.g3()) {
            return false;
        }
        return new w21.u0(f9Var.j()).f524014c;
    }

    public static boolean o(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return f9Var != null && f9Var.g3() && f9Var.A0() != 1 && new w21.u0(f9Var.j()).f524013b == 0;
    }

    public static boolean p(java.lang.String str) {
        w21.w0 j17;
        if (str == null || (j17 = j(str)) == null) {
            return false;
        }
        j17.f524025i = 8;
        j17.f524024h = w21.v0.d(null, str);
        j17.f524017a = 96;
        return w(j17);
    }

    public static void q(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null || !f9Var.g3()) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(f9Var.Q0(), f9Var.m124847x74d37ac6());
        if (Li.m124847x74d37ac6() != f9Var.m124847x74d37ac6()) {
            return;
        }
        w21.u0 u0Var = new w21.u0(Li.j());
        if (u0Var.f524014c) {
            return;
        }
        u0Var.f524014c = true;
        f9Var.d1(u0Var.b());
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.m124847x74d37ac6(), f9Var, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002c, code lost:
    
        if (r8.startsWith("silk_") != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String r(java.lang.String r7, java.lang.String r8, int r9) {
        /*
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r7)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r8)
            if (r0 == 0) goto L11
            java.lang.String r0 = ""
            goto L2f
        L11:
            java.lang.String r0 = "amr_"
            boolean r2 = r8.startsWith(r0)
            if (r2 == 0) goto L1a
            goto L2f
        L1a:
            java.lang.String r2 = "spx_"
            boolean r3 = r8.startsWith(r2)
            if (r3 == 0) goto L25
        L23:
            r0 = r2
            goto L2f
        L25:
            java.lang.String r2 = "silk_"
            boolean r3 = r8.startsWith(r2)
            if (r3 == 0) goto L2f
            goto L23
        L2f:
            java.lang.String r7 = g(r7, r0)
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r7)
            if (r0 == 0) goto L3a
            return r1
        L3a:
            java.lang.Class<tg3.u0> r0 = tg3.u0.class
            i95.m r2 = i95.n0.c(r0)
            tg3.u0 r2 = (tg3.u0) r2
            bm5.y r3 = bm5.y.f104290j
            k90.b r2 = (k90.b) r2
            r4 = 0
            java.lang.String r8 = r2.vj(r3, r8, r4)
            i95.m r0 = i95.n0.c(r0)
            tg3.u0 r0 = (tg3.u0) r0
            k90.b r0 = (k90.b) r0
            r2 = 1
            java.lang.String r0 = r0.wj(r3, r7, r4, r2)
            long r3 = com.p314xaae8f345.mm.vfs.w6.d(r8, r0, r4)
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 >= 0) goto L63
            return r1
        L63:
            t(r7, r9, r2, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w21.x0.r(java.lang.String, java.lang.String, int):java.lang.String");
    }

    public static boolean s(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 234L, 1L, false);
        if (str == null) {
            return false;
        }
        w21.w0 j17 = j(str);
        if (j17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceLogic", "Set error failed file:".concat(str));
            return false;
        }
        j17.f524025i = 98;
        j17.f524027k = java.lang.System.currentTimeMillis() / 1000;
        j17.f524017a = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e;
        boolean w17 = w(j17);
        ((hg0.k) ((eg0.e) i95.n0.c(eg0.e.class))).wi(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceLogic", "setError file:" + str + " msgid:" + j17.f524029m + " old stat:" + j17.f524025i);
        if (j17.f524029m == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17.f524019c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceLogic", "setError failed msg id:" + j17.f524029m + " user:" + j17.f524019c);
            return w17;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(j17.f524019c, j17.f524029m);
        jx3.f.INSTANCE.mo68477x336bdfd8(111L, 33L, 1L, true);
        Li.m124849x5361953a(j17.f524029m);
        Li.r1(5);
        Li.u1(j17.f524019c);
        Li.d1(w21.u0.c(j17.f524030n, java.lang.Math.max(j17.f524028l, 0), true));
        Li.l1(Li.F & (-8193));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Li.m124847x74d37ac6(), Li, true);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6220x84bdfe90 c6220x84bdfe90 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6220x84bdfe90();
        long m124847x74d37ac6 = Li.m124847x74d37ac6();
        am.p00 p00Var = c6220x84bdfe90.f136469g;
        p00Var.f89123a = m124847x74d37ac6;
        p00Var.f89124b = false;
        p00Var.f89125c = j17.c();
        c6220x84bdfe90.b(android.os.Looper.getMainLooper());
        return w17;
    }

    public static boolean t(java.lang.String str, int i17, int i18, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        w21.w0 j17;
        if (str == null || (j17 = j(str)) == null) {
            return false;
        }
        int i19 = j17.f524025i;
        if (i19 != 97 && i19 != 98) {
            j17.f524025i = 3;
        }
        int d17 = w21.v0.d(null, str);
        j17.f524024h = d17;
        if (d17 <= 0) {
            s(str);
            return false;
        }
        j17.f524027k = java.lang.System.currentTimeMillis() / 1000;
        j17.f524028l = i17;
        j17.f524017a = 4197728;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var2.u1(j17.f524019c);
        f9Var2.m124850x7650bebc(34);
        f9Var2.j1(1);
        if (!pt0.f0.f439742b1.j()) {
            f9Var2.i1(str);
        }
        int i27 = j17.f524025i;
        if (i27 == 97) {
            f9Var2.r1(2);
            f9Var2.d1(w21.u0.c(j17.f524030n, j17.f524028l, false));
        } else if (i27 == 98) {
            f9Var2.r1(5);
            f9Var2.d1(w21.u0.c(j17.f524030n, -1L, true));
        } else {
            f9Var2.r1(1);
            f9Var2.d1(w21.u0.c(j17.f524030n, j17.f524028l, false));
        }
        f9Var2.e1(c01.w9.o(j17.f524019c));
        f9Var2.q3(i18);
        ((aq1.d1) po.a.f438812a).d(f9Var2);
        j17.f524029m = c01.w9.x(f9Var2);
        j17.f524040x = f9Var2.Q0();
        boolean w17 = w(j17);
        if (w17 && f9Var != null) {
            ui3.b bVar = new ui3.b();
            bVar.f66416x297eb4f7 = f9Var2.m124847x74d37ac6();
            bVar.f66418xb3e44c2f = f9Var.m124847x74d37ac6();
            bVar.f66419x34d46056 = f9Var.I0();
            bVar.f66420x66425b6d = f9Var.Q0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceLogic", "insert voice msg result:%s msgQuoteId:%s", java.lang.Boolean.valueOf(((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Di().mo880xb970c2b9(bVar)), java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        }
        ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).yj(f9Var2, str, false);
        java.util.HashMap hashMap = f524044a;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
        return w17;
    }

    public static int u(java.lang.String str, int i17, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        w21.w0 j17;
        if (str == null || (j17 = j(str)) == null) {
            return -1;
        }
        j17.f524023g = i17;
        j17.f524027k = java.lang.System.currentTimeMillis() / 1000;
        j17.f524017a = 272;
        int i18 = j17.f524024h;
        int i19 = 0;
        if (i18 <= 0 || i17 < i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceLogic", "updateRecv file:" + str + " newsize:" + i17 + " total:" + j17.f524024h + " status:" + j17.f524025i);
        } else {
            v(j17, p0Var);
            j17.f524025i = 99;
            j17.f524038v = 0;
            j17.f524017a = j17.f524017a | 64 | 1048576;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceLogic", "END!!! updateRecv  file:" + str + " newsize:" + i17 + " total:" + j17.f524024h + " status:" + j17.f524025i + " netTimes:" + j17.f524031o);
            w21.p0.Di().m0(bm5.y.f104290j, str);
            i19 = 1;
        }
        if (!w(j17)) {
            return -3;
        }
        if (i19 == 1) {
            ((hg0.k) ((eg0.e) i95.n0.c(eg0.e.class))).wi(str);
        }
        return i19;
    }

    public static boolean v(w21.w0 w0Var, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        try {
            w0Var.f524029m = (int) d(w0Var, true, 3, "", w0Var.f524033q, p0Var);
            w0Var.f524040x = w0Var.f524019c;
            w0Var.f524017a = w0Var.f524017a | 2048 | 4194304;
            return w(w0Var);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceLogic", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return false;
        }
    }

    public static boolean w(w21.w0 w0Var) {
        if (w0Var == null || w0Var.f524017a == -1) {
            return false;
        }
        return w21.p0.Di().P0(w0Var.f524018b, w0Var);
    }

    public static boolean x(bm5.y yVar, java.lang.String str, java.lang.String str2, byte[] bArr) {
        int c17 = h(yVar, str, str2, true).c(bArr, bArr.length, 0);
        if (c17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceLogic", "Write Failed File:" + str2 + " newOffset:" + c17 + " voiceFormat:" + str);
            return false;
        }
        if (bArr.length == c17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceLogic", "writeVoiceFile file:[" + str2 + "] + buf:" + bArr.length + " voiceFormat:" + str);
            w21.p0.Di().m0(yVar, str2);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceLogic", "Write File:" + str2 + " fileOff:" + c17 + " bufLen:" + bArr.length + " voiceFormat:" + str);
        return false;
    }
}
