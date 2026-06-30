package tn1;

/* loaded from: classes12.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f502347a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f502348b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f502349c = new java.util.HashSet();

    /* JADX WARN: Removed duplicated region for block: B:62:0x030c A[LOOP:0: B:7:0x0025->B:62:0x030c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0319 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.util.Map r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tn1.e.a(java.util.Map, boolean):void");
    }

    public static int b(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return -1;
        }
        int indexOf = str.indexOf(58);
        if (indexOf == -1 || !str.substring(0, indexOf).contains("<")) {
            return indexOf;
        }
        return -1;
    }

    public static t21.v2 c(java.lang.String str) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return tn1.f.f().e().h().g(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupStorageLogic", "getVideoInfoByFileName fileName is null.");
        return null;
    }

    public static java.lang.String d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, boolean z17) {
        return ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).yj(f9Var, str, z17);
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d e(long j17, java.lang.String str, java.lang.String str2) {
        ot0.q v17 = ot0.q.v(str2);
        if (v17 == null) {
            return null;
        }
        java.lang.String f17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.f(com.p314xaae8f345.mm.vfs.q7.c("attachment") + '/', v17.n(), v17.f430223o);
        int i17 = v17.f430183e;
        java.lang.String str3 = v17.f430179d;
        java.lang.String str4 = v17.f430227p;
        long j18 = v17.f430215m;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d();
        dVar.f68099xfeae815 = f17;
        dVar.f68094x28d45f97 = str3;
        dVar.f68110xfc39fee = i17;
        dVar.f68105x2c1f0acb = str4;
        dVar.f68113xeb1a61d6 = j18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFileSendStatus: isSend = false, stack = ");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilePreviewUtil", sb6.toString());
        dVar.f68112x10a0fed7 = 101;
        dVar.f68101x13f40970 = false;
        dVar.f68096xac3be4e = c01.id.a();
        dVar.f68103x4a777c2 = c01.id.e();
        dVar.f68106x315a5445 = j17;
        dVar.f68107xaaaa6883 = str;
        dVar.f68108x6a1cf14e = 0L;
        return dVar;
    }

    public static void f(java.lang.String str) {
        java.util.HashSet hashSet = (java.util.HashSet) f502347a;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) tn1.f.f().e().c()).n(str, true);
        if (n17.k2()) {
            ((java.util.HashSet) f502348b).add(n17.d1());
        }
        if (n17.w2()) {
            ((java.util.HashSet) f502349c).add(n17.d1());
        }
        if (((int) n17.E2) == 0) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupStorageLogic", "insertAndPushContact push, talker = " + str);
                tn1.c d17 = tn1.f.f().d();
                d17.f502329a.add(new tn1.b(d17, 2, str));
                ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) tn1.f.f().e().c()).h0(new com.p314xaae8f345.mm.p2621x8fb0427b.z3(str));
                return;
            }
            if (str.endsWith("@chatroom")) {
                tn1.d e17 = tn1.f.f().e();
                if (e17.f502345o == 0) {
                    throw new c01.c();
                }
                if (((com.p314xaae8f345.mm.p2621x8fb0427b.b3) e17.f502339i).L0(str) == null) {
                    tn1.c d18 = tn1.f.f().d();
                    d18.f502329a.add(new tn1.b(d18, 2, str));
                }
            }
        }
    }

    public static long g(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        long R9 = z17 ? ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) tn1.f.f().e().g()).R9(f9Var) : ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) tn1.f.f().e().g()).Q9(f9Var);
        if (R9 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupStorageLogic", "insertMsgWithContact failed: type:%d, talker:%s", java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()), f9Var.Q0());
        }
        return R9;
    }

    public static boolean h(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str);
    }
}
