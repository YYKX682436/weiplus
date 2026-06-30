package ws2;

/* loaded from: classes3.dex */
public final class s0 implements ws2.p {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f530666d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Intent f530667e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 f530668f;

    /* renamed from: g, reason: collision with root package name */
    public ws2.q f530669g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14930xacbd9984 f530670h;

    /* JADX WARN: Type inference failed for: r3v1, types: [com.tencent.mm.plugin.finder.replay.FinderLiveReplayPresenter$feedChangeListener$1] */
    public s0(android.app.Activity context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        this.f530666d = context;
        this.f530667e = intent;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f530670h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3>(a0Var) { // from class: com.tencent.mm.plugin.finder.replay.FinderLiveReplayPresenter$feedChangeListener$1
            {
                this.f39173x3fe91575 = 439877283;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3) {
                ws2.q qVar;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 event = c5445x963cab3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.ia iaVar = event.f135785g;
                int i17 = iaVar.f88452b;
                ws2.s0 s0Var = ws2.s0.this;
                if (i17 != 14) {
                    if (i17 != 24 || (qVar = s0Var.f530669g) == null) {
                        return false;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14931xe48fc583 c14931xe48fc583 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14931xe48fc583) qVar;
                    c14931xe48fc583.f206415h.post(new ws2.o1(c14931xe48fc583, iaVar.f88451a));
                    return false;
                }
                long j17 = iaVar.f88451a;
                ws2.q qVar2 = s0Var.f530669g;
                if (qVar2 == null) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14931xe48fc583 c14931xe48fc5832 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14931xe48fc583) qVar2;
                c14931xe48fc5832.f206415h.post(new ws2.t1(c14931xe48fc5832, j17));
                return false;
            }
        };
    }

    @Override // fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        ym5.u uVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122;
        ws2.q qVar = this.f530669g;
        if (qVar != null && (uVar = (ym5.u) ((jz5.n) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14931xe48fc583) qVar).f206417m).mo141623x754a37bb()) != null && (abstractC13919x46aff122 = this.f530668f) != null) {
            abstractC13919x46aff122.m56401x31d4943c(uVar);
        }
        mo48814x2efc64();
    }
}
