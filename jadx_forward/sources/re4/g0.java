package re4;

/* loaded from: classes9.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f476068a = "";

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f476069b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f476070c = "";

    public static java.lang.String a() {
        java.lang.String str = (java.lang.String) fu5.d.b().a().get(1, "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return str;
        }
        return "WechatAuthKeyPay&" + f476068a;
    }

    public static java.lang.String b() {
        try {
            java.lang.String j17 = gm0.j1.b().j();
            if (j17 == null || j17.isEmpty() || j17.equals("0")) {
                j17 = c01.b9.f118602c.a("last_login_uin", "");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterUtil", "getUinString empty, use last login uin:%s", j17);
            }
            java.lang.String g17 = kk.k.g(j17.getBytes());
            if (g17 != null) {
                return g17.substring(0, 8);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SoterUtil", e17, "get md5 exception", new java.lang.Object[0]);
        }
        return "";
    }

    public static boolean c() {
        if (wo.v1.f529361h.f529343a) {
            return cu5.b.c();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterUtil", "hy: dynamic config is not support soter");
        return false;
    }

    public static java.lang.String d(int i17) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String b17 = b();
        if (b17 == null) {
            b17 = "";
        }
        objArr[0] = b17;
        objArr[1] = java.lang.Integer.valueOf(i17);
        return java.lang.String.format("SoterAuthKeyV2_salt%s_scene%d", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(int r8) {
        /*
            java.lang.String r0 = ""
            r1 = 1
            if (r8 != r1) goto L16
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "WechatAuthKeyPay&"
            r8.<init>(r0)
            java.lang.String r0 = re4.g0.f476068a
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            return r8
        L16:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = re4.g0.f476068a     // Catch: java.lang.Exception -> L2d
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Exception -> L2d
            java.lang.String r4 = kk.k.g(r4)     // Catch: java.lang.Exception -> L2d
            if (r4 == 0) goto L37
            r5 = 8
            java.lang.String r4 = r4.substring(r3, r5)     // Catch: java.lang.Exception -> L2d
            goto L38
        L2d:
            r4 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = "MicroMsg.SoterUtil"
            java.lang.String r7 = "get md5 exception"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r6, r4, r7, r5)
        L37:
            r4 = r0
        L38:
            if (r4 != 0) goto L3b
            goto L3c
        L3b:
            r0 = r4
        L3c:
            r2[r3] = r0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r2[r1] = r8
            java.lang.String r8 = "SoterAuthKey_salt%s_scene%d"
            java.lang.String r8 = java.lang.String.format(r8, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: re4.g0.e(int):java.lang.String");
    }

    public static void f() {
        lm0.a b17 = gm0.j1.o().f354827a.b(c25.e.class);
        if (b17 == null) {
            iz5.a.d("Skeleton not initialized!", gm0.z1.f354828j);
            android.app.Application application = gm0.z1.f354828j.b().a().f390522c;
            b17 = null;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) b17)).b().d("SoterEntry"), 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterUtil", "dynamic config support soter: %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            wo.u1 u1Var = wo.v1.f529361h;
            u1Var.f529343a = true;
            u1Var.f529344b = 255;
            wo.z0 z0Var = wo.v1.f529359f;
            z0Var.f529400a = 1;
            z0Var.f529401b = 1;
        }
    }

    public static void g(int i17) {
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SOTER_UPLOAD_AK_FAILURE_INT_SYNC, java.lang.Integer.valueOf(i17));
    }
}
