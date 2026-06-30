package a80;

@j95.b
/* loaded from: classes12.dex */
public final class b extends jm0.o implements xs.w0 {

    /* renamed from: m, reason: collision with root package name */
    public static final a80.a f1947m = new a80.a(null);

    /* renamed from: n, reason: collision with root package name */
    public static final int f1948n;

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f1949o;

    static {
        int c17 = j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigMsgOriginReserveMaxDays());
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CImgPathFeatureService", "c2cOriginImgExpireDays: " + c17);
        if (c17 <= 0) {
            c17 = 14;
        }
        f1948n = c17;
        f1949o = kotlin.jvm.internal.o.b(bm5.o1.f22719a.d(new com.tencent.mm.repairer.config.msgsend.RepairerConfigMsgOriginCleanExpireUseServerTime()), 1);
    }

    public final zz.b Zi(java.lang.String str) {
        zz.b bj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(str, 3, null, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CImgPathFeatureService", "imageCheckDup:%s ret:%s hitCache:%s copyResult:%s replaceResult:%s", str, java.lang.Integer.valueOf(bj6.f477691a), java.lang.Boolean.valueOf(bj6.f477692b), java.lang.Boolean.valueOf(bj6.f477694d), java.lang.Long.valueOf(bj6.f477695e));
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

    public java.lang.String bj(bm5.f0 resType, com.tencent.mm.storage.f9 f9Var, java.lang.String str, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(resType, "resType");
        return aj(bm5.y.f22756i.a(f9Var, resType), str, z17, z18);
    }

    public int cj(long j17) {
        int i17 = f1948n;
        if (i17 < 0) {
            i17 = 0;
        }
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        long millis = timeUnit.toMillis(i17);
        if (j17 < 0) {
            j17 = 0;
        }
        long c17 = (j17 + millis) - (f1949o ? c01.id.c() : java.lang.System.currentTimeMillis());
        return (int) timeUnit.convert((c17 >= 0 ? c17 : 0L) + (timeUnit.toMillis(1L) - 1), java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public int fj(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        return cj(msgInfo.getCreateTime());
    }

    public jz5.l hj(com.tencent.mm.storage.f9 f9Var) {
        m11.b0 b0Var;
        if (f9Var == null || f9Var.getMsgId() <= 0 || f9Var.z2()) {
            return new jz5.l(0, 0);
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 S1 = m11.b1.Di().S1(f9Var);
        if (S1 == null || !S1.j() || S1.f322649q <= 0) {
            b0Var = null;
        } else {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            b0Var = m11.b1.Di().C1(java.lang.Long.valueOf(S1.f322649q));
        }
        if (b0Var == null || b0Var.f322633a <= 0) {
            return new jz5.l(0, 0);
        }
        java.lang.String aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f22562g, b0Var.f322637e, "", "");
        i95.m c17 = i95.n0.c(tg3.u0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        boolean j17 = com.tencent.mm.vfs.w6.j(((k90.b) ((tg3.u0) c17)).hj(b0Var.f322637e, "", "", true));
        boolean k17 = b0Var.k();
        boolean j18 = com.tencent.mm.vfs.w6.j(aj6);
        int fj6 = fj(f9Var);
        if (j17 && k17) {
            return new jz5.l(2, 0);
        }
        h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr = h90.a.f279671d;
        return ((g90.u) wVar).Bi(f9Var, 1) == 3 ? fj6 <= 0 ? new jz5.l(6, 0) : new jz5.l(4, java.lang.Integer.valueOf(fj6)) : (j18 && k17) ? new jz5.l(3, java.lang.Integer.valueOf(java.lang.Math.max(fj6, 1))) : fj6 <= 0 ? !k17 ? new jz5.l(5, 0) : new jz5.l(7, 0) : new jz5.l(1, java.lang.Integer.valueOf(fj6));
    }

    public j15.a ij(com.tencent.mm.storage.f9 f9Var) {
        return f9Var == null ? new j15.a() : g45.c.b(f9Var);
    }

    public boolean mj(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        if (f9Var == null) {
            return false;
        }
        bm5.x xVar = bm5.y.f22756i;
        bm5.f0 f0Var = bm5.f0.f22565m;
        if (com.tencent.mm.vfs.w6.k(bm5.z.i(xVar.a(f9Var, f0Var), null, java.lang.Boolean.TRUE, false, 5, null)) > 0) {
            return true;
        }
        if (str == null) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 S1 = m11.b1.Di().S1(f9Var);
            if (S1 == null || S1.f322633a == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.C2CImgPathFeatureService", "can not get imgInfo, talker: " + f9Var.Q0() + ", msgId: " + f9Var.getMsgId());
                return false;
            }
            str = S1.f322639g;
        }
        return com.tencent.mm.vfs.w6.k(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).bj(f9Var, f0Var, str, null, null, false, false)) > 0;
    }

    public void nj(com.tencent.mm.storage.f9 f9Var, int i17) {
        if (pt0.f0.f358209b1.g() || f9Var == null) {
            return;
        }
        f9Var.L = 1;
        f9Var.f236178r = true;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    public void oj(com.tencent.mm.storage.f9 f9Var, int i17, int i18) {
        j15.d dVar;
        if (!pt0.f0.f358209b1.g()) {
            if (f9Var != null) {
                f9Var.H = i17;
                f9Var.f236178r = true;
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
            if (f9Var == null) {
                return;
            }
            f9Var.I = i18;
            f9Var.f236178r = true;
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
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
            dVar2.fromXml(j18);
            dVar = dVar2;
        }
        if ((f9Var != null && f9Var.A0() == 0) && !com.tencent.mm.sdk.platformtools.t8.K0(f9Var.j()) && com.tencent.mm.storage.z3.R4(f9Var.Q0())) {
            return;
        }
        if (dVar.o().q() == 0 || dVar.o().n() == 0) {
            dVar.o().Y(i17);
            dVar.o().U(i18);
            if (f9Var == null) {
                return;
            }
            f9Var.d1(dVar.toXml());
        }
    }

    public boolean pj(bm5.v vVar) {
        if (bm5.v.f22743f == vVar) {
            return pt0.f0.f358209b1.f();
        }
        if (bm5.v.f22746i == vVar) {
            return pt0.f0.f358209b1.c(vVar);
        }
        if (bm5.v.f22747m != vVar) {
            return false;
        }
        pt0.f0.f358209b1.getClass();
        return ((java.lang.Boolean) ((jz5.n) pt0.e0.f358203k).getValue()).booleanValue();
    }
}
