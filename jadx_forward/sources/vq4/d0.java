package vq4;

/* loaded from: classes14.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static long f520816a;

    /* renamed from: b, reason: collision with root package name */
    public static int f520817b;

    /* renamed from: c, reason: collision with root package name */
    public static long f520818c;

    public static void a(java.lang.String str, java.lang.String str2) {
        java.lang.Thread.currentThread().getId();
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "[" + java.lang.Thread.currentThread().getId() + "]" + str2);
    }

    public static void c(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[" + java.lang.Thread.currentThread().getId() + "]" + str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int d(android.content.Context context) {
        int i17;
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((sb0.f) jVar).getClass();
        if (!j35.u.d(context2, "android.permission.READ_PHONE_STATE", true)) {
            return 0;
        }
        try {
            int dataNetworkType = ((android.telephony.TelephonyManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("phone")).getDataNetworkType();
            switch (dataNetworkType) {
                case 0:
                    i17 = 0;
                    break;
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    i17 = 1;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i17 = 3;
                    break;
                case 13:
                case 18:
                case 19:
                    i17 = 5;
                    break;
                case 20:
                    i17 = 6;
                    break;
                default:
                    i17 = 0;
                    break;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipHelper", "ratioType:%s, getMobileType(2G/3G/4G/...): %s ", java.lang.Integer.valueOf(dataNetworkType), java.lang.Integer.valueOf(i17));
            return i17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoipHelper", e17, "", new java.lang.Object[0]);
            return 0;
        }
    }

    public static int e(android.content.Context context) {
        return f(((android.net.ConnectivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity")).getActiveNetworkInfo());
    }

    public static int f(android.net.NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return 2;
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipHelper", "getNetType: %s %s", java.lang.Integer.valueOf(networkInfo.getType()), java.lang.Integer.valueOf(networkInfo.getSubtype()));
            int i17 = 4;
            if (networkInfo.getType() == 1) {
                return 4;
            }
            if (networkInfo.getType() == 9) {
                return 7;
            }
            if (networkInfo.getType() != 0) {
                return 2;
            }
            int subtype = networkInfo.getSubtype();
            switch (subtype) {
                case 0:
                    i17 = 2;
                    break;
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    i17 = 1;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i17 = 3;
                    break;
                case 13:
                case 18:
                case 19:
                    i17 = 5;
                    break;
                case 20:
                    i17 = 6;
                    break;
                default:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipHelper", "NEWEST type, use wifi as default!");
                    break;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipHelper", "steve: subType:%s, getMobileType(2G/3G/4G/...): %s ", java.lang.Integer.valueOf(subtype), java.lang.Integer.valueOf(i17));
            return i17;
        } catch (java.lang.NullPointerException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoipHelper", e17, "", new java.lang.Object[0]);
            return 2;
        }
    }

    public static int g(java.lang.String str) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("static_cap_mmkv_key").getInt(str, 0);
    }

    public static void h(byte[] bArr, java.lang.String str, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            bArr = new byte[0];
        }
        java.lang.String str2 = new java.lang.String(bArr);
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, str2);
        } else if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str2);
        }
        str.equals("MicroMsg.v2Core");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x001b, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x002a, code lost:
    
        if (ip.b.i() != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (ip.b.k() != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        r3 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(int r8) {
        /*
            r0 = 26
            boolean r0 = fp.h.c(r0)
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L1d
            boolean r0 = ip.b.d()
            if (r0 == 0) goto L12
            r0 = r2
            goto L13
        L12:
            r0 = r1
        L13:
            boolean r3 = ip.b.k()
            if (r3 == 0) goto L1b
        L19:
            r3 = r2
            goto L2d
        L1b:
            r3 = r1
            goto L2d
        L1d:
            boolean r0 = ip.b.b()
            if (r0 == 0) goto L25
            r0 = r2
            goto L26
        L25:
            r0 = r1
        L26:
            boolean r3 = ip.b.i()
            if (r3 == 0) goto L1b
            goto L19
        L2d:
            com.tencent.mm.plugin.report.service.g0 r4 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r5 = 12
            java.lang.Object[] r5 = new java.lang.Object[r5]
            com.tencent.mm.plugin.voip.model.h2 r6 = gq4.v.Bi()
            int r6 = r6.m()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 0
            r5[r7] = r6
            com.tencent.mm.plugin.voip.model.h2 r6 = gq4.v.Bi()
            long r6 = r6.n()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r5[r2] = r6
            com.tencent.mm.plugin.voip.model.h2 r6 = gq4.v.Bi()
            long r6 = r6.o()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r5[r1] = r6
            boolean r6 = e11.b.f327890a
            if (r6 == 0) goto L64
            r6 = r2
            goto L65
        L64:
            r6 = r1
        L65:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 3
            r5[r7] = r6
            boolean r6 = ip.b.s()
            if (r6 == 0) goto L74
            r6 = r2
            goto L75
        L74:
            r6 = r1
        L75:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 4
            r5[r7] = r6
            boolean r6 = ip.b.t()
            if (r6 == 0) goto L84
            r6 = r2
            goto L85
        L84:
            r6 = r1
        L85:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 5
            r5[r7] = r6
            android.content.SharedPreferences r6 = ip.b.v()
            java.lang.String r7 = "settings_voip_show_detail"
            boolean r6 = r6.getBoolean(r7, r2)
            if (r6 == 0) goto L9b
            r6 = r2
            goto L9c
        L9b:
            r6 = r1
        L9c:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 6
            r5[r7] = r6
            r6 = 7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r6] = r0
            r0 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5[r0] = r3
            boolean r0 = ip.b.e()
            if (r0 == 0) goto Lba
            r0 = r2
            goto Lbb
        Lba:
            r0 = r1
        Lbb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 9
            r5[r3] = r0
            boolean r0 = ip.b.f()
            if (r0 == 0) goto Lca
            r1 = r2
        Lca:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r1 = 10
            r5[r1] = r0
            r0 = 11
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5[r0] = r8
            r8 = 16366(0x3fee, float:2.2934E-41)
            r4.r(r8, r2, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vq4.d0.i(int):void");
    }

    public static void j(int i17, long j17, int i18, int i19) {
        if (gq4.v.Bi().m() != 0 && gq4.v.Bi().n() != 0) {
            f520816a = gq4.v.Bi().o();
            f520817b = i17;
            f520818c = j17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.r(16516, true, true, java.lang.Long.valueOf(f520816a), java.lang.Integer.valueOf(f520817b), java.lang.Long.valueOf(f520818c), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipHelper", "room type " + f520816a + "room id" + f520817b + "room key" + f520818c + "call type " + i18 + "type " + i19);
    }

    public static void k(int i17) {
        try {
            java.lang.Thread.sleep(i17);
        } catch (java.lang.InterruptedException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoipHelper", e17, "", new java.lang.Object[0]);
        }
    }
}
