package qe;

/* loaded from: classes7.dex */
public class t0 implements com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2.IWcWssReportListener {
    public t0(qe.d1 d1Var) {
    }

    @Override // com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2.IWcWssReportListener
    /* renamed from: getNetworkType */
    public int mo83418x662add52() {
        try {
            int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WcWssNativeInstallHelper", "getStatisticsNetType ret:%d", java.lang.Integer.valueOf(m40067xab9ed241));
            if (m40067xab9ed241 == -1) {
                return -1;
            }
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                return 3;
            }
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                return 4;
            }
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                return 5;
            }
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(m40067xab9ed241)) {
                return 1;
            }
            return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40090x5fd3d5c(m40067xab9ed241) ? 2 : 6;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.WcWssNativeInstallHelper", e17, "getStatisticsNetType_", new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2.IWcWssReportListener
    /* renamed from: onIdKeyStat */
    public void mo83419x94ceb499(int[] iArr, int[] iArr2, int[] iArr3) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < iArr.length; i17++) {
            arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(iArr[i17], iArr2[i17], iArr3[i17]));
        }
        ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, false, false);
    }

    @Override // com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2.IWcWssReportListener
    /* renamed from: onKvStat */
    public void mo83420x4c31b11e(int i17, java.lang.String str) {
        ((ch1.d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c.class, true))).b(i17, str);
    }
}
