package qe;

/* loaded from: classes7.dex */
public class a0 implements com.p314xaae8f345.mm.p782x304bf2.p783x36a98bfc.C10722xbbfb2dae.ILockStepReportListener {
    public a0(qe.f0 f0Var) {
    }

    @Override // com.p314xaae8f345.mm.p782x304bf2.p783x36a98bfc.C10722xbbfb2dae.ILockStepReportListener
    /* renamed from: getNetworkType */
    public int mo45671x662add52() {
        try {
            be1.y E = be1.z.E(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LockStepNativeInstallHelper", "networkType = %s", E.f101073d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LockStepNativeInstallHelper", "getStatisticsNetType ret:%d", java.lang.Integer.valueOf(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
            if (E == be1.y.None) {
                return -1;
            }
            if (E == be1.y.Mobile_2g) {
                return 2;
            }
            if (E == be1.y.Mobile_3g) {
                return 3;
            }
            if (E == be1.y.Mobile_4g) {
                return 4;
            }
            if (E == be1.y.Mobile_5g) {
                return 5;
            }
            return E == be1.y.Wifi ? 1 : 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.LockStepNativeInstallHelper", e17, "getStatisticsNetType_", new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p782x304bf2.p783x36a98bfc.C10722xbbfb2dae.ILockStepReportListener
    /* renamed from: onIdKeyStat */
    public void mo45672x94ceb499(int[] iArr, int[] iArr2, int[] iArr3) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < iArr.length; i17++) {
            arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(iArr[i17], iArr2[i17], iArr3[i17]));
        }
        ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, false, false);
    }

    @Override // com.p314xaae8f345.mm.p782x304bf2.p783x36a98bfc.C10722xbbfb2dae.ILockStepReportListener
    /* renamed from: onKvStat */
    public void mo45673x4c31b11e(int i17, java.lang.String str) {
        ((ch1.d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c.class, true))).b(i17, str);
    }
}
