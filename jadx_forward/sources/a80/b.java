package a80;

@j95.b
/* loaded from: classes12.dex */
public final class b extends jm0.o implements xs.w0 {

    /* renamed from: m, reason: collision with root package name */
    public static final a80.a f83480m = new a80.a(null);

    /* renamed from: n, reason: collision with root package name */
    public static final int f83481n;

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f83482o;

    static {
        int c17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20518xc2aa30ca());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CImgPathFeatureService", "c2cOriginImgExpireDays: " + c17);
        if (c17 <= 0) {
            c17 = 14;
        }
        f83481n = c17;
        f83482o = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bm5.o1.f104252a.d(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20517x43ca093a()), 1);
    }

    public final zz.b Zi(java.lang.String str) {
        zz.b bj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(str, 3, null, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CImgPathFeatureService", "imageCheckDup:%s ret:%s hitCache:%s copyResult:%s replaceResult:%s", str, java.lang.Integer.valueOf(bj6.f559224a), java.lang.Boolean.valueOf(bj6.f559225b), java.lang.Boolean.valueOf(bj6.f559227d), java.lang.Long.valueOf(bj6.f559228e));
        return bj6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (r2 != 0) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String aj(bm5.y r31, java.lang.String r32, boolean r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a80.b.aj(bm5.y, java.lang.String, boolean, boolean):java.lang.String");
    }

    public java.lang.String bj(bm5.f0 resType, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resType, "resType");
        return aj(bm5.y.f104289i.a(f9Var, resType), str, z17, z18);
    }

    public int cj(long j17) {
        int i17 = f83481n;
        if (i17 < 0) {
            i17 = 0;
        }
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        long millis = timeUnit.toMillis(i17);
        if (j17 < 0) {
            j17 = 0;
        }
        long c17 = (j17 + millis) - (f83482o ? c01.id.c() : java.lang.System.currentTimeMillis());
        return (int) timeUnit.convert((c17 >= 0 ? c17 : 0L) + (timeUnit.toMillis(1L) - 1), java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public int fj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        return cj(msgInfo.mo78012x3fdd41df());
    }

    public jz5.l hj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        m11.b0 b0Var;
        if (f9Var == null || f9Var.m124847x74d37ac6() <= 0 || f9Var.z2()) {
            return new jz5.l(0, 0);
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 S1 = m11.b1.Di().S1(f9Var);
        if (S1 == null || !S1.j() || S1.f404182q <= 0) {
            b0Var = null;
        } else {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            b0Var = m11.b1.Di().C1(java.lang.Long.valueOf(S1.f404182q));
        }
        if (b0Var == null || b0Var.f404166a <= 0) {
            return new jz5.l(0, 0);
        }
        java.lang.String aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f104095g, b0Var.f404170e, "", "");
        i95.m c17 = i95.n0.c(tg3.u0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(((k90.b) ((tg3.u0) c17)).hj(b0Var.f404170e, "", "", true));
        boolean k17 = b0Var.k();
        boolean j18 = com.p314xaae8f345.mm.vfs.w6.j(aj6);
        int fj6 = fj(f9Var);
        if (j17 && k17) {
            return new jz5.l(2, 0);
        }
        h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr = h90.a.f361204d;
        return ((g90.u) wVar).Bi(f9Var, 1) == 3 ? fj6 <= 0 ? new jz5.l(6, 0) : new jz5.l(4, java.lang.Integer.valueOf(fj6)) : (j18 && k17) ? new jz5.l(3, java.lang.Integer.valueOf(java.lang.Math.max(fj6, 1))) : fj6 <= 0 ? !k17 ? new jz5.l(5, 0) : new jz5.l(7, 0) : new jz5.l(1, java.lang.Integer.valueOf(fj6));
    }

    public j15.a ij(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return f9Var == null ? new j15.a() : g45.c.b(f9Var);
    }

    public boolean mj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        if (f9Var == null) {
            return false;
        }
        bm5.x xVar = bm5.y.f104289i;
        bm5.f0 f0Var = bm5.f0.f104098m;
        if (com.p314xaae8f345.mm.vfs.w6.k(bm5.z.i(xVar.a(f9Var, f0Var), null, java.lang.Boolean.TRUE, false, 5, null)) > 0) {
            return true;
        }
        if (str == null) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 S1 = m11.b1.Di().S1(f9Var);
            if (S1 == null || S1.f404166a == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.C2CImgPathFeatureService", "can not get imgInfo, talker: " + f9Var.Q0() + ", msgId: " + f9Var.m124847x74d37ac6());
                return false;
            }
            str = S1.f404172g;
        }
        return com.p314xaae8f345.mm.vfs.w6.k(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).bj(f9Var, f0Var, str, null, null, false, false)) > 0;
    }

    public void nj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        if (pt0.f0.f439742b1.g() || f9Var == null) {
            return;
        }
        f9Var.L = 1;
        f9Var.f317711r = true;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    public void oj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, int i18) {
        j15.d dVar;
        if (!pt0.f0.f439742b1.g()) {
            if (f9Var != null) {
                f9Var.H = i17;
                f9Var.f317711r = true;
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            }
            if (f9Var == null) {
                return;
            }
            f9Var.I = i18;
            f9Var.f317711r = true;
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            return;
        }
        java.lang.String j17 = f9Var != null ? f9Var.j() : null;
        if ((j17 == null || r26.n0.N(j17) ? this : null) != null) {
            dVar = new j15.d();
        } else {
            j15.d dVar2 = new j15.d();
            java.lang.String j18 = f9Var != null ? f9Var.j() : null;
            if (j18 == null) {
                j18 = "";
            }
            dVar2.m126728xdc93280d(j18);
            dVar = dVar2;
        }
        if ((f9Var != null && f9Var.A0() == 0) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.j()) && com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0())) {
            return;
        }
        if (dVar.o().q() == 0 || dVar.o().n() == 0) {
            dVar.o().Y(i17);
            dVar.o().U(i18);
            if (f9Var == null) {
                return;
            }
            f9Var.d1(dVar.m126747x696739c());
        }
    }

    public boolean pj(bm5.v vVar) {
        if (bm5.v.f104276f == vVar) {
            return pt0.f0.f439742b1.f();
        }
        if (bm5.v.f104279i == vVar) {
            return pt0.f0.f439742b1.c(vVar);
        }
        if (bm5.v.f104280m != vVar) {
            return false;
        }
        pt0.f0.f439742b1.getClass();
        return ((java.lang.Boolean) ((jz5.n) pt0.e0.f439736k).mo141623x754a37bb()).booleanValue();
    }
}
