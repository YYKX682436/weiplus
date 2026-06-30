package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f189350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f189351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 f189352f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(long j17, com.p314xaae8f345.mm.p944x882e457a.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 l0Var) {
        super(1);
        this.f189350d = j17;
        this.f189351e = fVar;
        this.f189352f = l0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        so2.j5 j5Var = (so2.j5) obj;
        if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
            long m59251x5db1b11 = abstractC14490x69736cb5.getFeedObject().m59251x5db1b11();
            long j17 = this.f189350d;
            if (m59251x5db1b11 == j17 && ((abstractC14490x69736cb5.getFeedObject().getMediaType() == 2 || abstractC14490x69736cb5.getFeedObject().getMediaType() == 4) && (c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) this.f189351e.f152151d).m75936x14adae67(2)) != null)) {
                boolean isHistoryFeed = abstractC14490x69736cb5.getIsHistoryFeed();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 l0Var = this.f189352f;
                if (!isHistoryFeed || abstractC14490x69736cb5.getFeedObject().m59347x965c8f17()) {
                    abstractC14490x69736cb5.getFeedObject().m59355xc51b2372(c19792x256d2725.m76758x8ed22866());
                    abstractC14490x69736cb5.getFeedObject().m59385x50740976(c19792x256d2725.m76791xf4204902());
                    abstractC14490x69736cb5.getFeedObject().m59381x85124ecc(c19792x256d2725.m76776x4ec953c0());
                    abstractC14490x69736cb5.getFeedObject().getFeedObject().m76905xc0364f2f(c19792x256d2725.m76812x1c39ba23());
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
                    am.ia iaVar = c5445x963cab3.f135785g;
                    iaVar.f88451a = j17;
                    iaVar.f88452b = 20;
                    if (!l0Var.f189666r.containsKey(java.lang.Long.valueOf(j17))) {
                        l0Var.f189666r.put(java.lang.Long.valueOf(j17), c5445x963cab3);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.f189659h, "preloadFirstPageComment: notify feed full update, feedId = ".concat(pm0.v.u(j17)));
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab32 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
                    am.ia iaVar2 = c5445x963cab32.f135785g;
                    iaVar2.f88451a = j17;
                    iaVar2.f88460j = 1;
                    iaVar2.f88452b = 0;
                    c5445x963cab32.e();
                    if (l0Var.f189658g instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) {
                        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.c0(l0Var));
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
