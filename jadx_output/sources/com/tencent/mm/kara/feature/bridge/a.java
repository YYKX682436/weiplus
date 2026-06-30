package com.tencent.mm.kara.feature.bridge;

/* loaded from: classes13.dex */
public abstract class a {
    public static void a() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GetSnsVideoFeatureGroupEvent>(a0Var) { // from class: com.tencent.mm.kara.feature.bridge.KaraBridge$1
            {
                this.__eventId = 601395912;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GetSnsVideoFeatureGroupEvent getSnsVideoFeatureGroupEvent) {
                com.tencent.mm.autogen.events.GetSnsVideoFeatureGroupEvent getSnsVideoFeatureGroupEvent2 = getSnsVideoFeatureGroupEvent;
                com.tencent.mars.xlog.Log.i("KaraBridge", "snsid:%s", getSnsVideoFeatureGroupEvent2.f54417g.f7896a);
                com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
                am.sg sgVar = getSnsVideoFeatureGroupEvent2.f54417g;
                com.tencent.mm.plugin.sns.storage.SnsInfo b17 = Fj.b1(sgVar.f7896a);
                if (b17 != null) {
                    com.tencent.mm.kara.feature.feature.business.SnsVideoClickFeatureGroup snsVideoClickFeatureGroup = new com.tencent.mm.kara.feature.feature.business.SnsVideoClickFeatureGroup(b17);
                    tl0.b.f420195b.getClass();
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    long j17 = com.tencent.mm.sdk.platformtools.o4.L().getLong("SnsFeatureStorage_create_time_v1", 0L);
                    boolean z17 = false;
                    if (j17 != 0 && currentTimeMillis - j17 > (((((long) nl0.e.e()) * 1000) * 60) * 60) * 24) {
                        tl0.b.f420194a.getClass();
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        long j18 = com.tencent.mm.sdk.platformtools.o4.L().getLong("ChattingEventStorage_create_time_v1", 0L);
                        if (j18 != 0 && currentTimeMillis2 - j18 > (((((long) nl0.e.e()) * 1000) * 60) * 60) * 24) {
                            z17 = true;
                        }
                    }
                    if (z17) {
                        sgVar.f7897b = snsVideoClickFeatureGroup;
                    } else {
                        sgVar.f7897b = null;
                        com.tencent.mars.xlog.Log.e("KaraBridge", "SnsVideoClickFeatureGroup inValid");
                    }
                } else {
                    sgVar.f7897b = null;
                    com.tencent.mars.xlog.Log.e("KaraBridge", "snsInfo null");
                }
                return true;
            }
        }.alive();
    }
}
