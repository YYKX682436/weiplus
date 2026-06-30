package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class g2 implements gm5.a {
    public g2(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2 w2Var) {
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[triggerDoGetDefaultRedPacketSkinCgi] resp, errType:%s，cgiBack.errCode：%s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
        if (fVar2 == null) {
            return null;
        }
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[triggerDoGetDefaultRedPacketSkinCgi] resp，use_new_logic: %s、force_use_local_cache: %s", java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k0) fVar2).f226901h), java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k0) fVar.f152151d).f226902i));
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jd.f228589d.a((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k0) fVar.f152151d);
        }
        return java.lang.Boolean.TRUE;
    }
}
