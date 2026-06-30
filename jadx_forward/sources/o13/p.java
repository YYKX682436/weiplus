package o13;

/* loaded from: classes12.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f423781a = {8, 9, 10, 11, 12, 14, 19, 20, 21, 22, 24, 25, 26, 15, 28, 29};

    /* renamed from: b, reason: collision with root package name */
    public static final o13.o f423782b = new o13.o();

    /* renamed from: c, reason: collision with root package name */
    public static long f423783c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static long f423784d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f423785e = "";

    public static final void a(java.util.ArrayList arrayList, int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c344.m40330x4c144dd(i17);
        c4582x424c344.m40331x936762bd(i18);
        c4582x424c344.m40332x57b2b64f(i19);
        arrayList.add(c4582x424c344);
    }

    public static java.lang.String b() {
        java.lang.String str = f423785e;
        if (str == null || "".equals(str)) {
            f423785e = "" + java.lang.System.currentTimeMillis();
        }
        return f423785e;
    }

    public static java.lang.String c(long j17) {
        if (j17 == 0) {
            return "0";
        }
        if (j17 > 0) {
            return java.lang.Long.toString(j17, 10);
        }
        char[] cArr = new char[64];
        long j18 = (j17 >>> 1) / 5;
        long j19 = 10;
        int i17 = 63;
        cArr[63] = java.lang.Character.forDigit((int) (j17 - (j18 * j19)), 10);
        while (j18 > 0) {
            i17--;
            cArr[i17] = java.lang.Character.forDigit((int) (j18 % j19), 10);
            j18 /= j19;
        }
        return new java.lang.String(cArr, i17, 64 - i17);
    }

    public static final void d(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSReportApiLogic", "reportCommonChatroom: %d %d", 14731, java.lang.Integer.valueOf(i17));
        jx3.f.INSTANCE.d(14731, java.lang.Integer.valueOf(i17));
    }

    public static void e(int i17) {
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c344.m40330x4c144dd(146);
        c4582x424c344.m40331x936762bd(0);
        c4582x424c344.m40332x57b2b64f(1L);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c4582x424c344);
        if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3442.m40330x4c144dd(146);
            c4582x424c3442.m40331x936762bd(2);
            c4582x424c3442.m40332x57b2b64f(1L);
            arrayList.add(c4582x424c3442);
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3443 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3443.m40330x4c144dd(146);
            c4582x424c3443.m40331x936762bd(i17);
            c4582x424c3443.m40332x57b2b64f(1L);
            arrayList.add(c4582x424c3443);
        } else {
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3444 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3444.m40330x4c144dd(146);
            c4582x424c3444.m40331x936762bd(1);
            c4582x424c3444.m40332x57b2b64f(1L);
            arrayList.add(c4582x424c3444);
        }
        jx3.f.INSTANCE.b(arrayList, false);
    }

    public static void f(int i17, long j17) {
        if (i17 > 0) {
            int i18 = ((i17 - 1) * 2) + 1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c344.m40330x4c144dd(601);
            c4582x424c344.m40331x936762bd(i18);
            c4582x424c344.m40332x57b2b64f((int) j17);
            arrayList.add(c4582x424c344);
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3442.m40330x4c144dd(601);
            c4582x424c3442.m40331x936762bd(i18 + 1);
            c4582x424c3442.m40332x57b2b64f(1L);
            arrayList.add(c4582x424c3442);
            jx3.f.INSTANCE.b(arrayList, false);
        }
    }

    public static void g(int i17, long j17) {
        if (i17 > 0) {
            int i18 = ((i17 - 1) * 4) + 1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c344.m40330x4c144dd(602);
            c4582x424c344.m40331x936762bd(i18);
            c4582x424c344.m40332x57b2b64f(1L);
            arrayList.add(c4582x424c344);
            if (j17 <= 100) {
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3442.m40330x4c144dd(602);
                c4582x424c3442.m40331x936762bd(i18 + 1);
                c4582x424c3442.m40332x57b2b64f(1L);
                arrayList.add(c4582x424c3442);
            } else if (j17 <= 500) {
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3443 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3443.m40330x4c144dd(602);
                c4582x424c3443.m40331x936762bd(i18 + 2);
                c4582x424c3443.m40332x57b2b64f(1L);
                arrayList.add(c4582x424c3443);
            } else {
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3444 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3444.m40330x4c144dd(602);
                c4582x424c3444.m40331x936762bd(i18 + 3);
                c4582x424c3444.m40332x57b2b64f(1L);
                arrayList.add(c4582x424c3444);
            }
            jx3.f.INSTANCE.b(arrayList, false);
        }
    }

    public static final void h(int i17, long j17, long j18) {
        boolean z17;
        int[] iArr = f423781a;
        int i18 = 0;
        while (true) {
            if (i18 >= 16) {
                z17 = false;
                break;
            } else {
                if (i17 == iArr[i18]) {
                    z17 = true;
                    break;
                }
                i18++;
            }
        }
        if (z17) {
            long longValue = new kk.v(gm0.j1.b().h()).longValue();
            if (o45.wf.f424563h) {
                if (longValue % 100 != 1) {
                    return;
                }
            } else if (o45.wf.f424565j && longValue % 10 != 1) {
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[11];
            objArr[0] = 0;
            objArr[1] = java.lang.Integer.valueOf(i17);
            objArr[2] = java.lang.Long.valueOf(j17);
            objArr[3] = 0;
            o13.o oVar = f423782b;
            objArr[4] = java.lang.Integer.valueOf(oVar.f423776a >= 1536 ? 1 : 0);
            objArr[5] = java.lang.Long.valueOf(oVar.f423776a);
            objArr[6] = java.lang.Long.valueOf(oVar.f423777b);
            objArr[7] = java.lang.Long.valueOf(oVar.f423778c);
            objArr[8] = java.lang.Long.valueOf(oVar.f423779d);
            objArr[9] = java.lang.Long.valueOf(oVar.f423780e);
            objArr[10] = java.lang.Long.valueOf(j18);
            jx3.f.INSTANCE.mo68478xbd3cda5f(14175, java.lang.String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", objArr));
        }
    }
}
