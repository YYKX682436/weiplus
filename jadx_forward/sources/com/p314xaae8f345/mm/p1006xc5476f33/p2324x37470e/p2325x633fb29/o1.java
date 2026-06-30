package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public abstract class o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f257234a = 0;

    static {
        boolean z17 = p05.e5.f432043a;
        boolean z18 = tq5.k.f502805a;
        tq5.k.f502806b = p05.c5.f432009d;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.m97812xedc5400c(new p05.f2());
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.m97811x534d5c42(2);
        xm5.b.f536931a = new p05.g2();
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.d1.f257110a.a();
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_tavkit_vlog_asset_extractor, 0) == 1 || z65.c.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCompositionUtil", "use custom extractor");
            com.p314xaae8f345.tav.p2965xf0edce24.C25821x46b9d596.f48552x34c297d2 = true;
            com.p314xaae8f345.tav.p2965xf0edce24.C25822x78481d21.m97985x56b6a2a5(new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.g1());
            return;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_edit_use_system_extractor_api_level, 28);
        if (Ni <= 0 || !fp.h.c(Ni)) {
            com.p314xaae8f345.tav.p2965xf0edce24.C25821x46b9d596.f48552x34c297d2 = false;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCompositionUtil", "extractor config: " + Ni);
        com.p314xaae8f345.tav.p2965xf0edce24.C25821x46b9d596.f48552x34c297d2 = true;
    }
}
