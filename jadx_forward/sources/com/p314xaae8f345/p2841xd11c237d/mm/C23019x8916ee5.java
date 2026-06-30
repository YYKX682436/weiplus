package com.p314xaae8f345.p2841xd11c237d.mm;

/* renamed from: com.tencent.paymars.mm.MMStnManagerCallback */
/* loaded from: classes12.dex */
public class C23019x8916ee5 implements com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack {

    /* renamed from: ACTION_ACK_ASYNC */
    public static int f40174x49f4583d = -100;

    /* renamed from: ACTION_ACK_FAILED */
    public static int f40175xfc19f67c = 3;

    /* renamed from: ACTION_ACK_MALFORMED */
    public static int f40176xf43bc0fc = 1;

    /* renamed from: ACTION_ACK_OK */
    public static int f40177x92a76f9b = 0;

    /* renamed from: ACTION_ACK_UNSUPPORTED */
    public static int f40178x38df5736 = 2;
    private static java.lang.String TAG = "MMStnManagerCallback";

    /* renamed from: payCgis */
    static final java.util.List<java.lang.Integer> f40179xd1092156 = java.util.Arrays.asList(385, 386, 387, java.lang.Integer.valueOf(nd1.u0.f72979x366c91de), java.lang.Integer.valueOf(nd1.p1.f72967x366c91de), 390, 391, 392, 393, 394, java.lang.Integer.valueOf(zd.d.f77569x366c91de), 396, 397, 398, 399, 400, 401, 402, 403, 404, 405, 406, 410, java.lang.Integer.valueOf(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60880xaa1da1d9), 461, 462, 463, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.r1.f34829x366c91de), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n1.f34819x366c91de), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.b6.f33879x366c91de), 467, java.lang.Integer.valueOf(wc1.p.f77345x366c91de), java.lang.Integer.valueOf(kf1.i.f72437x366c91de), 470, 471, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.u.f34771x366c91de), 473, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.q.f33744x366c91de), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.x.f33756x366c91de), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.r.f33697x366c91de), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.g.f33895x366c91de), 478, java.lang.Integer.valueOf(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60871x50a06163), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.j.f33899x366c91de), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.e0.f34847x366c91de), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.l.f34861x366c91de), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m.f34863x366c91de), 508, 509, 514, 524, 525, java.lang.Integer.valueOf(uc1.x1.f76938x366c91de), java.lang.Integer.valueOf(be1.x0.f4238x366c91de), 565, 566, 567, 568, 569, 570, 571, 573, 580, 583, java.lang.Integer.valueOf(nd1.k2.f72953x366c91de), java.lang.Integer.valueOf(zd.b.f77565x366c91de), 586, 587, 588, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.e0.f34791x366c91de), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1.f34581x366c91de), 591, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.h.f34167x366c91de), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.f.f34165x366c91de), 600, 606, java.lang.Integer.valueOf(com.p290xb772556d.p291xca4f91d6.C2828xd7507fe8.ErrCode.f9501x82ef07b8), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1218xd0d16f79.i.f35311x366c91de), java.lang.Integer.valueOf(com.p314xaae8f345.p3085x8ea91595.p3088xaf3f29eb.C26651x338099a8.f55984x5fe5d0c0), 844, 859, 1002, java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46406xaf4081cb), 1109, 1120, 1211, 1230, 1241, 1256, 1257, 1259, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x4.f35004x366c91de), java.lang.Integer.valueOf(zd1.o.f77579x366c91de), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.f1.f34290x366c91de), java.lang.Integer.valueOf(eh1.b.f69673x366c91de), 1280, 1281, java.lang.Integer.valueOf(cc1.s.f4288x366c91de), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de), 1304, 1305, 1317, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.i0.f33795x366c91de), java.lang.Integer.valueOf(zd1.s.f77583x366c91de), 1323, 1324, 1335, 1336, 1338, 1340, 1344, 1348, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.dd.f34111x366c91de), 1370, java.lang.Integer.valueOf(hb1.a.f69822x366c91de), 1376, 1378, 1380, java.lang.Integer.valueOf(tb1.n0.f76788x366c91de), 1385, 1386, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.g0.f34294x366c91de), java.lang.Integer.valueOf(v31.d.f77243x366c91de), java.lang.Integer.valueOf(v31.k.f77251x366c91de), 1477, 1488, 1495, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.t.f34133x366c91de), 1502, 1503, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.x0.f34424x366c91de), java.lang.Integer.valueOf(hc1.i.f69826x366c91de), 1506, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f2.f33853x366c91de), 1508, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.o.f33909x366c91de), 1510, 1511, 1512, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.g.f34334x366c91de), 1514, 1515, 1516, 1517, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.g.f29746x366c91de), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.k.f29752x366c91de), 1527, 1529, 1530, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.m0.f34626x366c91de), 1535, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.mc.f34455x366c91de), 1537, 1540, 1542, 1543, 1544, 1545, 1551, 1552, 1554, 1555, 1556, 1558, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.p.f33911x366c91de), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.q.f33913x366c91de), 1561, 1562, 1563, 1564, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i9.f34360x366c91de), 1566, 1568, 1569, 1570, 1571, 1572, 1573, 1574, 1575, java.lang.Integer.valueOf(fe1.i.f69740x366c91de), java.lang.Integer.valueOf(fe1.t.f69748x366c91de), java.lang.Integer.valueOf(fe1.o.f69744x366c91de), java.lang.Integer.valueOf(fe1.l.f69742x366c91de), java.lang.Integer.valueOf(fe1.f.f69738x366c91de), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.d.f34437x366c91de), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u6.f34900x366c91de), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r6.f34501x366c91de), 1588, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.m.f34145x366c91de), 1590, 1591, 1592, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.h.f34336x366c91de), 1594, 1595, 1596, 1597, 1598, 1599, 1600, 1601, 1602, 1603, 1604, 1605, 1606, 1607, 1608, 1610, 1612, 1613, 1614, 1616, 1617, 1618, 1622, 1623, 1624, 1625, 1628, 1629, 1630, 1631, 1633, 1638, 1639, 1640, 1641, 1643, 1644, 1645, 1647, 1648, 1649, 1650, 1652, 1653, 1654, 1655, 1656, 1659, 1663, 1664, 1665, 1666, 1667, 1668, 1669, 1672, 1674, 1675, 1676, 1679, 1680, 1682, 1684, 1685, 1686, 1688, 1689, 1691, 1692, 1694, 1695, 1697, 1698, 1699, 1724, 1725, 1735, 1736, 1737, 1742, 1752, 1753, 1754, 1767, 1768, 1769, 1770, 1773, 1779, 1782, 1786, 1800, 1805, 1809, java.lang.Integer.valueOf(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26811xa9bfd794.f57460x39770346), 1813, 1820, 1827, 1830, 1836, 1837, 1855, 1859, java.lang.Integer.valueOf(com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.f40030xf65ec7a6), 1878, 1888, 1891, 1903, 1904, 1906, 1907, 1914, 1916, 1917, 1922, 1923, 1930, 1950, 1953, 1958, 1960, 1963, 1964, 1965, 1966, 1967, 1970, 1971, 1972, 1973, 1976, 1978, 1979, 1981, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.f27792x78e4cdb4), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.f27794x4202466e), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.f27791x324eeed3), 1986, 1987, 1988, 1990, 1992, 1993, 1997, java.lang.Integer.valueOf(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2973xf88930d7.f10219x6e770e02), 2501, 2504, 2505, 2506, 2507, 2508, 2512, 2514, 2515, 2516, 2519, 2520, 2527, 2529, 2532, 2533, 2541, 2542, 2544, 2545, 2547, 2549, 2551, 2553, 2554, 2556, 2557, 2561, 2562, 2565, 2567, 2568, 2570, 2573, 2576, 2581, 2584, 2585, 2589, 2590, 2595, 2598, 2607, 2609, 2612, 2613, 2614, 2615, 2616, 2618, 2620, 2621, 2622, 2626, 2628, 2629, 2630, 2632, 2633, 2635, 2642, 2652, 2654, 2655, 2658, 2659, 2661, 2662, 2663, 2665, 2666, 2668, 2671, 2672, 2673, 2675, 2677, 2680, 2682, 2685, 2686, 2687, 2689, 2693, 2694, 2696, 2697, 2699, 2702, 2704, 2705, 2708, 2713, 2714, 2715, 2719, 2720, 2722, 2724, 2725, 2726, 2728, 2730, 2732, 2736, 2737, 2739, 2740, 2741, 2742, 2745, 2750, 2752, 2753, 2755, 2756, 2760, 2764, 2765, 2767, 2773, 2774, 2780, 2783, 2784, 2786, 2791, 2796, 2797, 2798, 2800, 2801, 2803, 2806, 2807, 2811, 2814, 2815, 2817, 2820, 2821, 2823, 2824, 2825, 2826, 2828, 2840, 2841, 2844, 2845, 2847, 2848, 2849, 2850, 2851, 2852, 2853, 2856, 2858, 2860, 2861, 2862, 2863, 2867, 2868, 2870, 2871, 2872, 2876, 2878, 2880, 2882, 2886, 2887, 2888, 2892, 2894, 2896, 2901, 2907, 2910, 2911, 2916, 2923, 2924, 2925, 2926, 2927, 2928, 2929, 2930, 2931, 2935, 2938, 2939, 2941, 2952, 2956, 2958, 2960, 2961, 2969, 2970, 2971, 2976, 2980, 2983, 2984, 2987, 2990, 2992, 2993, 2996, 2997, 3505, 3521, 3555, 3570, 3572, 3573, 3584, 3591, 3634, 3651, 3665, 3671, 3708, 3730, 3766, 3768, 3774, 3780, 3781, 3795, 3801, 3857, 3858, 3885, 3920, 3962, 3989);

    /* renamed from: _hellAccFlag_ */
    private byte f40181x7f11beae;

    /* renamed from: UUID_CACHE */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f40180xa9640dde = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(100);

    /* renamed from: totalWifiRecv */
    private int f40186xb1aaa5ff = 0;

    /* renamed from: totalWifiSend */
    private int f40187xb1ab1ba1 = 0;

    /* renamed from: totalMobileRecv */
    private int f40184x6d26b00c = 0;

    /* renamed from: totalMobileSend */
    private int f40185x6d2725ae = 0;

    /* renamed from: lastReportTime */
    private long f40182x7f950d57 = 0;

    /* renamed from: netCallbacks */
    private final java.util.Set<com.p314xaae8f345.mm.p971x6de15a2e.b0> f40183xf710dfb1 = new java.util.HashSet();

    /* renamed from: l, reason: collision with root package name */
    private final java.util.concurrent.locks.Lock f296747l = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: exception2String */
    private java.lang.String m84421x6cf4e7b4(java.lang.Exception exc) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        exc.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: getPidByProcessName */
    private int m84422xfd828c6e(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getPicByProcessName() processName == null");
            return -1;
        }
        try {
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getPicByProcessName() processes == null");
                return -1;
            }
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo.pid;
                }
            }
            return -1;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "getPidByProcessName() %s %s %s", str, e17.getClass().getSimpleName(), e17.getMessage());
            return -1;
        }
    }

    /* renamed from: killMainProcess */
    private void m84423x2d1bc438() {
        int m84422xfd828c6e = m84422xfd828c6e(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a);
        java.lang.String str = TAG;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(m84422xfd828c6e);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "killPushProcess() pid = %s, stack[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        m84424x1e599531(m84422xfd828c6e);
    }

    /* renamed from: killProcess */
    private void m84424x1e599531(int i17) {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/paymars/mm/MMStnManagerCallback", "killProcess", "(I)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/paymars/mm/MMStnManagerCallback", "killProcess", "(I)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "killProcess %s, %s %s", java.lang.Integer.valueOf(i17), e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$OnActionNotify$0 */
    public static /* synthetic */ void m84425xd8913107(byte[] bArr) {
        com.p314xaae8f345.mm.p971x6de15a2e.x2.f().a(326, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$OnActionNotify$1 */
    public static /* synthetic */ void m84426xd8913108(byte[] bArr) {
        com.p314xaae8f345.mm.p971x6de15a2e.x2.f().a(327, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$OnActionNotify$2 */
    public static /* synthetic */ void m84427xd8913109(byte[] bArr) {
        com.p314xaae8f345.mm.p971x6de15a2e.x2.f().a(328, bArr);
    }

    /* renamed from: needNotifyDeveloper */
    private boolean m84428xa47cc30b() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return false;
    }

    /* renamed from: notifyPayCgiDeveloper */
    private void m84429x615d1b04(java.lang.String str, java.lang.String str2) {
        m84428xa47cc30b();
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: OnActionNotify */
    public int mo84384x8a9f58be(java.lang.String str, long j17, final byte[] bArr, byte[] bArr2, final byte[] bArr3, final long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[OnActionNotify] code: %d, uuid: %s, taskid:%d", java.lang.Long.valueOf(j17), str, java.lang.Long.valueOf(j18));
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "[OnActionNotify] e: " + e17.getMessage());
        }
        if (this.f40180xa9640dde.k(str) && j17 != 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[OnActionNotify] uuid = " + str + ", is Repeated");
            return f40177x92a76f9b;
        }
        this.f40180xa9640dde.put(str, str);
        if (j17 == 2) {
            if (bArr != null) {
                com.p314xaae8f345.mm.p971x6de15a2e.x2.e().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback.5
                    @Override // java.lang.Runnable
                    public void run() {
                        com.p314xaae8f345.mm.p971x6de15a2e.x2.f().a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, bArr);
                    }
                });
            }
            return f40177x92a76f9b;
        }
        if (j17 == 4) {
            if (bArr != null) {
                com.p314xaae8f345.mm.p971x6de15a2e.x2.e().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback.6
                    @Override // java.lang.Runnable
                    public void run() {
                        com.p314xaae8f345.mm.p971x6de15a2e.x2.f().a(322, bArr);
                    }
                });
            }
            return f40177x92a76f9b;
        }
        if (j17 == 7) {
            if (bArr != null) {
                com.p314xaae8f345.mm.p971x6de15a2e.x2.e().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback.7
                    @Override // java.lang.Runnable
                    public void run() {
                        com.p314xaae8f345.mm.p971x6de15a2e.x2.f().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.xe.f35014x366c91de, bArr);
                    }
                });
            }
            return f40177x92a76f9b;
        }
        if (j17 == 5) {
            if (bArr == null) {
                return f40175xfc19f67c;
            }
            com.p314xaae8f345.mm.p971x6de15a2e.x2.e().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback.8
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        r45.jy5 jy5Var = new r45.jy5();
                        jy5Var.f459751d = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
                        jy5Var.f459752e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr3);
                        jy5Var.f459753f = j18;
                        com.p314xaae8f345.mm.p971x6de15a2e.x2.f().a(321, jy5Var.mo14344x5f01b1f6());
                    } catch (java.io.IOException e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p314xaae8f345.p2841xd11c237d.mm.C23019x8916ee5.TAG, e18, null, new java.lang.Object[0]);
                    }
                }
            });
            return f40174x49f4583d;
        }
        if (j17 == 8) {
            if (bArr != null) {
                com.p314xaae8f345.mm.p971x6de15a2e.x2.e().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.p2841xd11c237d.mm.C23019x8916ee5.m84425xd8913107(bArr);
                    }
                });
            }
            return f40177x92a76f9b;
        }
        if (j17 == 9) {
            if (bArr != null) {
                com.p314xaae8f345.mm.p971x6de15a2e.x2.e().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.p2841xd11c237d.mm.C23019x8916ee5.m84426xd8913108(bArr);
                    }
                });
            }
            return f40177x92a76f9b;
        }
        if (j17 == 11) {
            if (bArr != null) {
                com.p314xaae8f345.mm.p971x6de15a2e.x2.e().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.p2841xd11c237d.mm.C23019x8916ee5.m84427xd8913109(bArr);
                    }
                });
            }
            return f40177x92a76f9b;
        }
        return f40178x38df5736;
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: ackActionNotify */
    public int mo84385x708d4848(java.lang.String str, long j17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "action notify task=" + j17 + ",result=" + i17);
        return ((com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.class)).m84358x988efe88(str, j17, i17);
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: addMMNetCommonCallback */
    public void mo84386x7433764c(android.os.IInterface iInterface) {
        if (iInterface == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "add net callback is null");
        } else {
            if (!(iInterface instanceof com.p314xaae8f345.mm.p971x6de15a2e.b0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "Callback type mismatch!");
                return;
            }
            this.f296747l.lock();
            this.f40183xf710dfb1.add((com.p314xaae8f345.mm.p971x6de15a2e.b0) iInterface);
            this.f296747l.unlock();
        }
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: buf2Resp */
    public int mo84387xa261f88f(int i17, java.lang.Object obj, java.lang.String str, byte[] bArr, int[] iArr, int[] iArr2, int i18, int[] iArr3) {
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.h() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "mars2 buf2Resp NetTaskAdapter is empty.");
            return -1;
        }
        int i19 = iArr[0];
        int i27 = iArr2[0];
        int i28 = iArr3[0];
        try {
            return com.p314xaae8f345.mm.p971x6de15a2e.x2.h().a(i17, obj, bArr, iArr, iArr2, i18, iArr3);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m84421x6cf4e7b4(e17));
            return -1;
        }
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: doCertificateVerify */
    public int mo84388x2f1063a5(java.lang.String str, byte[][] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "certifivate verify for %s", str);
        try {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4546xcbb9aa9 m40149xe12d20f8 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.m40149xe12d20f8(bArr, "RSA", str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "host %s verify result %d, isknownroots %b", str, java.lang.Integer.valueOf(m40149xe12d20f8.m39971x2fe4f2e8()), java.lang.Boolean.valueOf(m40149xe12d20f8.m39973x5df97c79()));
            return m40149xe12d20f8.m39971x2fe4f2e8();
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, e17.getLocalizedMessage());
            return -1;
        } catch (java.security.KeyStoreException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, e18.getLocalizedMessage());
            return -1;
        } catch (java.security.NoSuchAlgorithmException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, e19.getLocalizedMessage());
            return -1;
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, e27.getLocalizedMessage());
            return -1;
        }
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: doLiveSpeedTest */
    public int mo84389x17921322(java.lang.String str, int i17, int i18, int i19, int i27, byte[] bArr, byte[] bArr2, android.os.IInterface iInterface) {
        return 0;
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: doNetIdRequest */
    public void mo84390xed157802() {
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: getCurLanguage */
    public java.lang.String mo84391xbdfe8082() {
        try {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: getHostByName */
    public int mo84392x8faab340(java.lang.String str, java.util.List<java.lang.String> list) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p2841xd11c237d.mm.C23016xebd53123 c23016xebd53123 = new com.p314xaae8f345.p2841xd11c237d.mm.C23016xebd53123();
        ((com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.class)).m84344x7f49a52e(str, c23016xebd53123);
        for (int i17 = 0; i17 < c23016xebd53123.f40094xbe0e3ae6; i17++) {
            list.add(c23016xebd53123.f40093xac04aca4[i17]);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.ReportInfo reportInfo = new com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.ReportInfo();
        reportInfo.f40137x9d48d1f1 = 11L;
        reportInfo.f40138xc00dc316 = currentTimeMillis;
        reportInfo.f40147xa0336a48 = currentTimeMillis2;
        reportInfo.f40139x36253652 = str;
        reportInfo.f296746ip = c23016xebd53123.f40094xbe0e3ae6 > 0 ? c23016xebd53123.f40093xac04aca4[0] : "0.0.0.0";
        mo84416x731e15a8(reportInfo);
        return c23016xebd53123.f40095x368f3a;
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: getIntegerExpt */
    public java.lang.String mo84393x96e271f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "getIntegerExpt has not been implemented on android");
        return "";
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: getJavaActionId */
    public int mo84394x641430a9(long j17) {
        switch ((int) j17) {
            case 1:
                return 10955;
            case 2:
                return 10104;
            case 3:
                return 10103;
            case 4:
                return 10105;
            case 5:
                return 10102;
            case 6:
                return 10101;
            case 7:
                return 1105;
            case 8:
                return 10428;
            case 9:
                return -1;
            case 10:
                return -2;
            case 11:
                return -3;
            default:
                return 0;
        }
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: getLogIdSubType */
    public int mo84395x47ecc391(long j17, java.lang.String str) {
        if (j17 == 11108) {
            try {
                if (f40179xd1092156.contains(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)))) {
                    return 1;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: getSnsIpsForScene */
    public int mo84396x65185ded(java.util.List<java.lang.String> list, boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p2841xd11c237d.mm.C23016xebd53123 c23016xebd53123 = new com.p314xaae8f345.p2841xd11c237d.mm.C23016xebd53123();
        ((com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.class)).m84354x2f97f28a(z17, c23016xebd53123);
        for (int i17 = 0; i17 < c23016xebd53123.f40094xbe0e3ae6; i17++) {
            list.add(c23016xebd53123.f40093xac04aca4[i17]);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.ReportInfo reportInfo = new com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.ReportInfo();
        reportInfo.f40137x9d48d1f1 = 11L;
        reportInfo.f40138xc00dc316 = currentTimeMillis;
        reportInfo.f40147xa0336a48 = currentTimeMillis2;
        reportInfo.f40139x36253652 = "mmsns.qpic.cn";
        reportInfo.f296746ip = c23016xebd53123.f40094xbe0e3ae6 > 0 ? c23016xebd53123.f40093xac04aca4[0] : "0.0.0.0";
        mo84416x731e15a8(reportInfo);
        return c23016xebd53123.f40095x368f3a;
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: getSnsIpsForSceneWithHostName */
    public int mo84397x77eff5c6(java.util.List<java.lang.String> list, java.lang.String str, boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p2841xd11c237d.mm.C23016xebd53123 c23016xebd53123 = new com.p314xaae8f345.p2841xd11c237d.mm.C23016xebd53123();
        ((com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.class)).m84357x820c86e3(str, z17, c23016xebd53123);
        for (int i17 = 0; i17 < c23016xebd53123.f40094xbe0e3ae6; i17++) {
            list.add(c23016xebd53123.f40093xac04aca4[i17]);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.ReportInfo reportInfo = new com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.ReportInfo();
        reportInfo.f40137x9d48d1f1 = 11L;
        reportInfo.f40138xc00dc316 = currentTimeMillis;
        reportInfo.f40147xa0336a48 = currentTimeMillis2;
        reportInfo.f40139x36253652 = str;
        reportInfo.f296746ip = c23016xebd53123.f40094xbe0e3ae6 > 0 ? c23016xebd53123.f40093xac04aca4[0] : "0.0.0.0";
        mo84416x731e15a8(reportInfo);
        return c23016xebd53123.f40095x368f3a;
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: getUserIDCLocale */
    public java.lang.String mo84398xfa8df3e1() {
        try {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "HK" : "CN";
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: getXAgreementId */
    public int mo84399xb4bebfa3() {
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.n9.f274417a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("C2Java", "MMLogic get xagreement id %s", java.lang.Integer.valueOf(i17));
        return i17;
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: ifUseNewNetId */
    public java.lang.String mo84400xe56f1322() {
        java.lang.String a17 = j62.e.g().a("clicfg_mars_use_new_netid", "1", false, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("C2Java", "use new netid flag is " + a17);
        return a17 == null ? "0" : a17;
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: isOverseasUser */
    public int mo84401x6682a70d() {
        java.lang.String a17 = j62.e.g().a("clicfg_android_newdns_cn", "1", false, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "newdns use cn flag is " + a17);
        if ("0".equals(a17)) {
            return 1;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 1 : 0;
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: networkAnalysisCallBack */
    public void mo84402x252d11af(int i17, int i18, boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "networkAnalysisCallBack: status:%d, stage:%d, isDetectEnd:%b, kvInfo:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17), str);
        try {
            com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153537y.mo48346x252d11af(i17, i18, z17, str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: notifyNewSpeedTestReport */
    public void mo84403xc058cd76(byte[] bArr, int i17, int i18, int i19, int i27, java.lang.String str, int i28, java.lang.String str2, int i29, int i37) {
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.f() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("C2Java", "notifyNewSpeedTestReport failed");
            return;
        }
        r45.zc6 zc6Var = new r45.zc6();
        zc6Var.f473447h = i17;
        zc6Var.f473448i = i18;
        zc6Var.f473449m = i19;
        zc6Var.f473450n = i27;
        zc6Var.f473443d = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
        zc6Var.f473445f = "";
        zc6Var.f473444e = "";
        zc6Var.f473446g = "";
        if (i37 == 3) {
            zc6Var.f473444e = "dual";
        }
        r45.wc6 wc6Var = new r45.wc6();
        r45.wc6 wc6Var2 = new r45.wc6();
        wc6Var.f470603d = str;
        wc6Var.f470604e = i28;
        wc6Var2.f470603d = str2;
        wc6Var2.f470604e = i29;
        zc6Var.f473452p = wc6Var;
        zc6Var.f473451o = wc6Var2;
        new java.lang.String(bArr);
        int length = bArr.length;
        int length2 = zc6Var.f473443d.f273689a.length;
        try {
            final byte[] mo14344x5f01b1f6 = zc6Var.mo14344x5f01b1f6();
            com.p314xaae8f345.mm.p971x6de15a2e.x2.e().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback.4
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.mm.p971x6de15a2e.x2.f().a(zc1.b.f77555x366c91de, mo14344x5f01b1f6);
                }
            });
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("C2Java", "notifyNewSpeedTestReport :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: notifyPayCgiNewDnsTagIncorrect */
    public void mo84404x5825913a(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "your pay cgi should not be marked with pay newdns tag, please verify and remove it, cgiId: %d, cgiUrl: %s", java.lang.Integer.valueOf(i17), str);
        m84429x615d1b04("⚠️支付cgi错打newdns业务标记", java.lang.String.format("支付cgi:[id: %d, url: %s] 错打了newdns业务标记，请确认去掉标记后再行测试，点击确定将退出微信", java.lang.Integer.valueOf(i17), str));
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: notifyPayCgiNewDnsTagMiss */
    public void mo84405x47b0a247(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "your pay cgi should be marked with pay newdns tag, please verify and add it, cgiId: %d, cgiUrl: %s", java.lang.Integer.valueOf(i17), str);
        m84429x615d1b04("⚠️支付cgi漏打newdns业务标记", java.lang.String.format("支付cgi:[id: %d, url: %s] 漏打了newdns业务标记，请确认补充标记后再行测试，点击确定将退出微信", java.lang.Integer.valueOf(i17), str));
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: notifyStnWeaknet */
    public void mo84406x31a1e061(final boolean z17) {
        com.p314xaae8f345.mm.p971x6de15a2e.x2.e().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback.9
            @Override // java.lang.Runnable
            public void run() {
                byte[] bArr = new byte[1];
                if (z17) {
                    bArr[0] = 1;
                }
                com.p314xaae8f345.mm.p971x6de15a2e.x2.f().a(10098, bArr);
            }
        });
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: onDisasterNodeNotify */
    public void mo84407x12aa61eb(java.lang.String str) {
        com.p314xaae8f345.mm.p971x6de15a2e.g2.a(str);
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: onLiveSpeedTestCallback */
    public void mo84408xce1830b3(com.p314xaae8f345.p2841xd11c237d.mm.C23017xf5d28c4a c23017xf5d28c4a, boolean z17) {
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: onOOBNotify */
    public void mo84409x851b014c(final java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("C2Java", "onOOBNotify:" + str);
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.f() == null) {
            com.p314xaae8f345.p2841xd11c237d.mm.C23013x75755f66.m84284x7ca149f4(false);
            return;
        }
        try {
            com.p314xaae8f345.mm.p971x6de15a2e.x2.e().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback.3
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.mm.p971x6de15a2e.x2.f().a(268369923, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? null : str.getBytes());
                }
            });
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("C2Java", "onOOBNotify :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: receiveWeakNetNotify */
    public void mo84410x7797f08b(boolean z17, int i17) {
        this.f296747l.lock();
        try {
            try {
                for (com.p314xaae8f345.mm.p971x6de15a2e.b0 b0Var : this.f40183xf710dfb1) {
                    if (b0Var != null) {
                        b0Var.Xe(z17, i17);
                    }
                }
            } catch (java.lang.Exception e17) {
                java.lang.String str = TAG;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "receiveWeakNetNotify : %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        } finally {
            this.f296747l.unlock();
        }
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: removeMMNetCommonCallback */
    public void mo84411x7b24ad89(android.os.IInterface iInterface) {
        if (iInterface == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "remove net callback is null");
        } else {
            if (!(iInterface instanceof com.p314xaae8f345.mm.p971x6de15a2e.b0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "Callback type mismatch!");
                return;
            }
            this.f296747l.lock();
            this.f40183xf710dfb1.remove((com.p314xaae8f345.mm.p971x6de15a2e.b0) iInterface);
            this.f296747l.unlock();
        }
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: reportFlow */
    public void mo84412x73181082(int i17, int i18, int i19, int i27) {
        int i28 = this.f40186xb1aaa5ff + i17;
        this.f40186xb1aaa5ff = i28;
        int i29 = this.f40187xb1ab1ba1 + i18;
        this.f40187xb1ab1ba1 = i29;
        int i37 = this.f40184x6d26b00c + i19;
        this.f40184x6d26b00c = i37;
        int i38 = this.f40185x6d2725ae + i27;
        this.f40185x6d2725ae = i38;
        int i39 = i37 + i38 + i28 + i29;
        final u31.c cVar = com.p314xaae8f345.mm.p971x6de15a2e.x2.g().f153717a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("C2Java", "reportNetFlow time[%d,%d] sum:%d wr[%d,%d] ws[%d,%d] mr[%d,%d] ms[%d,%d] fgbg:%b Moniter:%s", java.lang.Long.valueOf(this.f40182x7f950d57), java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(this.f40182x7f950d57)), java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f40186xb1aaa5ff), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f40187xb1ab1ba1), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.f40184x6d26b00c), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(this.f40185x6d2725ae), java.lang.Boolean.valueOf(z65.c.f551988a), cVar);
        if (cVar == null) {
            return;
        }
        if (i39 >= 102400 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(this.f40182x7f950d57) >= 30) {
            this.f40182x7f950d57 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            final int i47 = this.f40186xb1aaa5ff;
            this.f40186xb1aaa5ff = 0;
            final int i48 = this.f40187xb1ab1ba1;
            this.f40187xb1ab1ba1 = 0;
            final int i49 = this.f40184x6d26b00c;
            this.f40184x6d26b00c = 0;
            final int i57 = this.f40185x6d2725ae;
            this.f40185x6d2725ae = 0;
            try {
                com.p314xaae8f345.mm.p971x6de15a2e.x2.e().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            cVar.si(i47, i48, i49, i57);
                        } catch (java.lang.Throwable th6) {
                            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("C2Java", "reportFlowData :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
                        }
                    }
                });
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("C2Java", "reportFlowData :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
            }
        }
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: reportGroupIDKey */
    public void mo84413xc9114479(int[] iArr, int[] iArr2, int[] iArr3, int i17, boolean z17, boolean z18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(iArr[i18], iArr2[i18], iArr3[i18]));
        }
        jx3.f.INSTANCE.j(arrayList, z17, z18);
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: reportIDKey */
    public void mo84414xf0018e90(long j17, long j18, long j19, boolean z17) {
        jx3.f.INSTANCE.mo68477x336bdfd8(j17, j18, j19, z17);
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: reportKV */
    public void mo84415xe68be19f(long j17, java.lang.String str, boolean z17, boolean z18, long j18, boolean z19) {
        jx3.f.INSTANCE.e((int) j17, (int) j18, str, z18, z17, z19);
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: reportStat */
    public void mo84416x731e15a8(final com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.ReportInfo reportInfo) {
        try {
            com.p314xaae8f345.mm.p971x6de15a2e.x2.e().mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.paymars.mm.MMStnManagerCallback.1
                @Override // java.lang.Runnable
                public void run() {
                    int mo84394x641430a9 = com.p314xaae8f345.p2841xd11c237d.mm.C23019x8916ee5.this.mo84394x641430a9(reportInfo.f40137x9d48d1f1);
                    if (mo84394x641430a9 == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("C2Java", "ActionId Can not convert");
                    } else {
                        reportInfo.f40137x9d48d1f1 = mo84394x641430a9;
                    }
                }
            });
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.CallBack
    /* renamed from: simpleTestCommand */
    public void mo84417x19d1d47(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (str.contains("testReportFlush")) {
            ((com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.class)).m84383xc89b4a3e();
            return;
        }
        if (str.contains("speedtest")) {
            return;
        }
        if (str.contains("oversea")) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        } else if (str.contains(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6)) {
            ((com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.mm.C23018xb3cd6a80.class)).m84349xbb09de0b();
        }
    }
}
