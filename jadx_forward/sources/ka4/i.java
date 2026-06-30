package ka4;

/* loaded from: classes4.dex */
public final class i implements gl0.a {
    @Override // gl0.a
    public void a(fl0.b item, long j17, boolean z17, float f17) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finish", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$karaPredictCallback$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "finish >> " + z17 + ", " + j17);
        java.lang.Object b17 = ((pl0.e) item).b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = b17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) b17 : null;
        if (c17933xe8d1b226 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finish >> ");
            sb6.append(c17933xe8d1b226.m70367x7525eefd());
            sb6.append(", ");
            sb6.append(c17933xe8d1b226.m70357x3fdd41df());
            sb6.append(", ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMaxKaraVideoTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            int i17 = ka4.m.f387676h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMaxKaraVideoTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            sb6.append(i17);
            sb6.append(", ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMinKaraVideoTimestamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            int i18 = ka4.m.f387677i;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMinKaraVideoTimestamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            sb6.append(i18);
            sb6.append(", ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getKaraIsGoToStart$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            boolean z18 = ka4.m.f387678j;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getKaraIsGoToStart$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            sb6.append(z18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getPredictMap$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = ka4.m.f387671c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getPredictMap$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            ka4.a aVar = (ka4.a) concurrentHashMap.get(c17933xe8d1b226.m70367x7525eefd());
            if (aVar != null) {
                ka4.b bVar = z17 ? ka4.b.f387651g : ka4.b.f387652h;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPredictType", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
                aVar.f387646a = bVar;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPredictType", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPredictCost", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
                aVar.f387648c = j17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPredictCost", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
                str2 = "finish";
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsKaraOptionConfig", "when finish but no have sns info " + c17933xe8d1b226.m70367x7525eefd());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getPredictMap$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getPredictMap$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                str2 = "finish";
            }
            int m70357x3fdd41df = c17933xe8d1b226.m70357x3fdd41df();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMaxKaraVideoTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            int i19 = ka4.m.f387676h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMaxKaraVideoTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            if (m70357x3fdd41df == i19) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getKaraIsGoToStart$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                boolean z19 = ka4.m.f387678j;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getKaraIsGoToStart$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                if (z19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "is reach max");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAfterMaxToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    ((ku5.t0) ku5.t0.f394148d).h(ka4.g.f387663d, "THREAD_SNS_KARA_OPTION");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAfterMaxToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                }
            }
            int m70357x3fdd41df2 = c17933xe8d1b226.m70357x3fdd41df();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMinKaraVideoTimestamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            int i27 = ka4.m.f387677i;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMinKaraVideoTimestamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            if (m70357x3fdd41df2 == i27) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getKaraIsGoToStart$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                boolean z27 = ka4.m.f387678j;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getKaraIsGoToStart$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                if (z27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "is reach min");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBeforeMinToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                    ((ku5.t0) ku5.t0.f394148d).h(ka4.h.f387664d, "THREAD_SNS_KARA_OPTION");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBeforeMinToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                }
            }
            str = str2;
        } else {
            str = "finish";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$karaPredictCallback$1");
    }

    @Override // gl0.a
    public void b(fl0.b item) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("start", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$karaPredictCallback$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "start");
        java.lang.Object b17 = ((pl0.e) item).b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = b17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) b17 : null;
        if (c17933xe8d1b226 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "start >> snsId: " + c17933xe8d1b226.m70367x7525eefd());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getPredictMap$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = ka4.m.f387671c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getPredictMap$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$karaPredictCallback$1");
    }
}
