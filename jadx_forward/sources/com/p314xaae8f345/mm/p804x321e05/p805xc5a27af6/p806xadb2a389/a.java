package com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p806xadb2a389;

/* loaded from: classes13.dex */
public abstract class a {
    public static void a() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5623x4d14e0b8>(a0Var) { // from class: com.tencent.mm.kara.feature.bridge.KaraBridge$1
            {
                this.f39173x3fe91575 = 601395912;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5623x4d14e0b8 c5623x4d14e0b8) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5623x4d14e0b8 c5623x4d14e0b82 = c5623x4d14e0b8;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KaraBridge", "snsid:%s", c5623x4d14e0b82.f135950g.f89429a);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
                am.sg sgVar = c5623x4d14e0b82.f135950g;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = Fj.b1(sgVar.f89429a);
                if (b17 != null) {
                    com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p808xbba4bfc0.C10779x2a08330e c10779x2a08330e = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p808xbba4bfc0.C10779x2a08330e(b17);
                    tl0.b.f501728b.getClass();
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("SnsFeatureStorage_create_time_v1", 0L);
                    boolean z17 = false;
                    if (j17 != 0 && currentTimeMillis - j17 > (((((long) nl0.e.e()) * 1000) * 60) * 60) * 24) {
                        tl0.b.f501727a.getClass();
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        long j18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("ChattingEventStorage_create_time_v1", 0L);
                        if (j18 != 0 && currentTimeMillis2 - j18 > (((((long) nl0.e.e()) * 1000) * 60) * 60) * 24) {
                            z17 = true;
                        }
                    }
                    if (z17) {
                        sgVar.f89430b = c10779x2a08330e;
                    } else {
                        sgVar.f89430b = null;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KaraBridge", "SnsVideoClickFeatureGroup inValid");
                    }
                } else {
                    sgVar.f89430b = null;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KaraBridge", "snsInfo null");
                }
                return true;
            }
        }.mo48813x58998cd();
    }
}
