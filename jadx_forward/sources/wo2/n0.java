package wo2;

/* loaded from: classes2.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final wo2.n0 f529638a = new wo2.n0();

    /* renamed from: b, reason: collision with root package name */
    public static final int f529639b;

    /* renamed from: c, reason: collision with root package name */
    public static long f529640c;

    /* renamed from: d, reason: collision with root package name */
    public static final android.util.SparseArray f529641d;

    static {
        int intValue = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.P1().r()).intValue();
        f529639b = intValue;
        f529641d = new android.util.SparseArray();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyConfig", "CACHE_DATA_EXPIRED_MS:" + intValue);
    }

    public final int a() {
        int b17 = b();
        if (b17 == 1006) {
            return 112;
        }
        switch (b17) {
            case 1001:
            default:
                return 94;
            case 1002:
                return 15;
            case 1003:
                return 77;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b() {
        /*
            r7 = this;
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r1 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_NEARBY_ENTER_DEFAULT_TAB_INT_SYNC
            r2 = 0
            int r0 = r0.r(r1, r2)
            java.lang.String r1 = "NearbyConfig"
            r2 = 1006(0x3ee, float:1.41E-42)
            if (r0 == 0) goto L34
            r3 = 2
            if (r0 != r3) goto L1a
            r2 = 1002(0x3ea, float:1.404E-42)
        L1a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "get3TabTargetTabType: use server config, serverLbsDefaultTab="
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ", targetTabType="
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            return r2
        L34:
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r3 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_NEARBY_LAST_TAB_TYPE_INT_SYNC
            r4 = -1
            int r0 = r0.r(r3, r4)
            r3 = 1001(0x3e9, float:1.403E-42)
            if (r0 != r3) goto L48
            r0 = r2
        L48:
            java.lang.Class<c61.l7> r3 = c61.l7.class
            i95.m r3 = i95.n0.c(r3)
            c61.l7 r3 = (c61.l7) r3
            zy2.fa r3 = r3.nk()
            java.lang.String r5 = "NearbyEntrance"
            com.tencent.mm.plugin.finder.extension.reddot.jb r3 = r3.L0(r5)
            if (r3 == 0) goto L71
            int r5 = r3.m55856xfb85f7b0()
            r6 = 1014(0x3f6, float:1.421E-42)
            if (r5 != r6) goto L6c
            java.lang.String r3 = "Finder.NearbyRedDotLogic"
            java.lang.String r5 = "[getNearbyAliveTabType] entrance red dot is foot print, jump to default tab"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r5)
            goto L71
        L6c:
            int r3 = r3.T0()
            goto L72
        L71:
            r3 = r4
        L72:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "get3TabTargetTabType: defaultLiveType=1006, lastExitType:"
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r6 = " aliveType="
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r5)
            if (r3 == r4) goto L8f
            r2 = r3
            goto L96
        L8f:
            if (r0 == r4) goto L96
            r1 = 1003(0x3eb, float:1.406E-42)
            if (r0 == r1) goto L96
            r2 = r0
        L96:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wo2.n0.b():int");
    }

    public final int c(int i17) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - f529640c;
        java.lang.Integer num = (java.lang.Integer) f529641d.get(i17);
        int intValue = num == null ? 0 : num.intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyConfig", "getExitLiveTabId expiredMs:" + elapsedRealtime + " tabId:" + intValue + " commentScene: " + i17);
        if (elapsedRealtime > f529639b) {
            return 0;
        }
        return intValue;
    }

    public final java.lang.String d() {
        int b17 = b();
        if (b17 == 1006) {
            return "8003";
        }
        switch (b17) {
            case 1001:
            default:
                return "1001";
            case 1002:
                return "1002";
            case 1003:
                return "1003";
        }
    }
}
