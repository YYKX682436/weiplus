package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.voip.model.NewVoipMgr$13 */
/* loaded from: classes14.dex */
public class C18858x8f03c38e extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6017xfdefe458> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 f257833d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18858x8f03c38e(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 d0Var, p012xc85e97e9.p093xedfae76a.y yVar) {
        super(yVar);
        this.f257833d = d0Var;
        this.f39173x3fe91575 = 635809864;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6017xfdefe458 c6017xfdefe458) {
        final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6017xfdefe458 c6017xfdefe4582 = c6017xfdefe458;
        if (c6017xfdefe4582 == null) {
            return false;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.voip.model.NewVoipMgr$13$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18858x8f03c38e c18858x8f03c38e = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18858x8f03c38e.this;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6017xfdefe458 c6017xfdefe4583 = c6017xfdefe4582;
                c18858x8f03c38e.getClass();
                int i17 = c6017xfdefe4583.f136311g.f88899a;
                if (i17 == 1) {
                    if (vq4.n0.g(c18858x8f03c38e.f257833d.f257907e.f520902a)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "video mode not allow ti response accept");
                        return;
                    }
                    nq4.f fVar = nq4.f.f420547a;
                    if (!nq4.f.f420552f) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "current has not broadcast coming message,not allow to response accept");
                        return;
                    }
                    jq4.c1 c1Var = gq4.v.Bi().f258114x;
                    if (c1Var.f382766b) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipService", "recalledVoipResumeByShortCut ");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.VoipFloatCardManager", "AcceptByShortCut " + c1Var.f382770f);
                        android.content.Intent intent = c1Var.f382770f;
                        if (intent != null) {
                            c1Var.k(intent);
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 d0Var = c18858x8f03c38e.f257833d;
                    int i18 = d0Var.f257922t;
                    long j17 = d0Var.f257923u;
                    long j18 = d0Var.f257924v;
                    boolean a17 = fVar.a();
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd c7006x6281fdcd = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd();
                    c7006x6281fdcd.f143206d = i18;
                    c7006x6281fdcd.f143207e = j17;
                    c7006x6281fdcd.f143208f = (int) j18;
                    c7006x6281fdcd.f143209g = a17 ? 1 : 0;
                    c7006x6281fdcd.f143210h = 1;
                    c7006x6281fdcd.f143211i = 0;
                    c7006x6281fdcd.o();
                    c7006x6281fdcd.k();
                    d0Var.g0();
                    return;
                }
                if (i17 != 2) {
                    return;
                }
                if (vq4.n0.e(c18858x8f03c38e.f257833d.c0())) {
                    nq4.f fVar2 = nq4.f.f420547a;
                    if (!nq4.f.f420552f) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "current has not broadcast coming message,not allow to response reject ");
                        return;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 d0Var2 = c18858x8f03c38e.f257833d;
                    boolean g17 = vq4.n0.g(d0Var2.f257907e.f520902a);
                    int i19 = d0Var2.f257922t;
                    long j19 = d0Var2.f257923u;
                    long j27 = d0Var2.f257924v;
                    boolean a18 = fVar2.a();
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd c7006x6281fdcd2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd();
                    c7006x6281fdcd2.f143206d = i19;
                    c7006x6281fdcd2.f143207e = j19;
                    c7006x6281fdcd2.f143208f = (int) j27;
                    c7006x6281fdcd2.f143209g = a18 ? 1 : 0;
                    c7006x6281fdcd2.f143210h = 1;
                    c7006x6281fdcd2.f143211i = 2;
                    c7006x6281fdcd2.o();
                    c7006x6281fdcd2.k();
                    d0Var2.y0(g17);
                    return;
                }
                if (vq4.n0.f(c18858x8f03c38e.f257833d.c0())) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 d0Var3 = c18858x8f03c38e.f257833d;
                    boolean z17 = d0Var3.f257921s;
                    int i27 = d0Var3.f257922t;
                    long j28 = d0Var3.f257923u;
                    long j29 = d0Var3.f257924v;
                    boolean a19 = nq4.f.f420547a.a();
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd c7006x6281fdcd3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd();
                    c7006x6281fdcd3.f143206d = i27;
                    c7006x6281fdcd3.f143207e = j28;
                    c7006x6281fdcd3.f143208f = (int) j29;
                    c7006x6281fdcd3.f143209g = a19 ? 1 : 0;
                    c7006x6281fdcd3.f143210h = 1;
                    c7006x6281fdcd3.f143211i = 5;
                    c7006x6281fdcd3.o();
                    c7006x6281fdcd3.k();
                    d0Var3.j0(z17);
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 d0Var4 = c18858x8f03c38e.f257833d;
                int i28 = d0Var4.f257922t;
                long j37 = d0Var4.f257923u;
                long j38 = d0Var4.f257924v;
                boolean a27 = nq4.f.f420547a.a();
                boolean z18 = d0Var4.f257920r;
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd c7006x6281fdcd4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd();
                c7006x6281fdcd4.f143206d = i28;
                c7006x6281fdcd4.f143207e = j37;
                c7006x6281fdcd4.f143208f = (int) j38;
                c7006x6281fdcd4.f143209g = a27 ? 1 : 0;
                c7006x6281fdcd4.f143210h = 1;
                c7006x6281fdcd4.f143211i = z18 ? 6 : 1;
                c7006x6281fdcd4.o();
                c7006x6281fdcd4.k();
                d0Var4.s0();
            }
        });
        return false;
    }
}
