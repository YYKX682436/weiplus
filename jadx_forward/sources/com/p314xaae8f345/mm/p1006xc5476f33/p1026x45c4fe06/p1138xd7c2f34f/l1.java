package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class l1 implements hm0.t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166277e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f166278f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2 f166279g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f166280h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f166281i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12333xba065a6f f166282m;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.m1 m1Var, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2 x2Var, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12333xba065a6f c12333xba065a6f) {
        this.f166276d = str;
        this.f166277e = str2;
        this.f166278f = rVar;
        this.f166279g = x2Var;
        this.f166280h = i17;
        this.f166281i = i18;
        this.f166282m = c12333xba065a6f;
    }

    @Override // hm0.t
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrepareTask", "PrepareCall#invoke onMMKernelStartupDone username[%s] appId[%s]", this.f166276d, this.f166277e);
        gm0.y1 y1Var = gm0.j1.i().f354741a.f354835g;
        y1Var.getClass();
        fm5.b bVar = new fm5.b(this, y1Var);
        synchronized (y1Var) {
            y1Var.f345714d.remove(bVar);
        }
        boolean n17 = gm0.j1.b().n();
        boolean r17 = gm0.m.r();
        if (n17 && !r17) {
            final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5285x2f901cd4> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5285x2f901cd4>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareCall$2$2
                {
                    this.f39173x3fe91575 = 19430116;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5285x2f901cd4 c5285x2f901cd4) {
                    if (c5285x2f901cd4 != null) {
                        mo48814x2efc64();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrepareTask", "prepareCall account notifyAllDone, start real prepare");
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l1.this.f166279g.m();
                    return false;
                }
            };
            if (gm0.j1.b().f354787q) {
                abstractC20980x9b9ad01d.mo1xf5bc2045(null);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrepareTask", "prepareCall account not notifyAllDone yet, wait for it");
                abstractC20980x9b9ad01d.mo48813x58998cd();
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrepareTask", "prepareCall, startup done, hasLogin %B, hold %B", java.lang.Boolean.valueOf(n17), java.lang.Boolean.valueOf(r17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k1(this));
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f166278f;
        if (rVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906 c12334xbda92906 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906();
            c12334xbda92906.f165918d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o1.EVENT_KILL_CLIENT_PROCESS;
            rVar.a(c12334xbda92906);
        }
    }

    @Override // hm0.t
    public void e(boolean z17) {
        gm0.y1 y1Var = gm0.j1.i().f354741a.f354835g;
        y1Var.getClass();
        fm5.b bVar = new fm5.b(this, y1Var);
        synchronized (y1Var) {
            y1Var.f345714d.remove(bVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrepareTask", "kernel onExit(%b), kill prepare process appId[%s] type[%d] scene[%d] sessionId[%s]", java.lang.Boolean.valueOf(z17), this.f166277e, java.lang.Integer.valueOf(this.f166280h), java.lang.Integer.valueOf(this.f166281i), this.f166282m.f165915f.f128809v);
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f166278f;
        if (rVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906 c12334xbda92906 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12334xbda92906();
            c12334xbda92906.f165918d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o1.EVENT_KILL_CLIENT_PROCESS;
            rVar.a(c12334xbda92906);
        }
    }
}
