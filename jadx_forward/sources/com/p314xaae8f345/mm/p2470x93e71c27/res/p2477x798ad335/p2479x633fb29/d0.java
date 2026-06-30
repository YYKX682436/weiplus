package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29;

@j95.b
/* loaded from: classes5.dex */
public final class d0 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.s0 f271201d = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.c0(this);

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f271202e;

    static {
        new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.d0();
    }

    public d0() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f271202e = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5160x33ad8273>(this, a0Var) { // from class: com.tencent.mm.pluginsdk.res.downloader.model.PinResDownloaderCore$2
            {
                this.f39173x3fe91575 = 2123042947;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5160x33ad8273 c5160x33ad8273) {
                boolean z17;
                if (!c5160x33ad8273.f135510g.f89217a) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.n2) i95.n0.c(ob0.n2.class))).getClass();
                    if (gi.d.h(84)) {
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.r2) i95.n0.c(ob0.r2.class))).Zi(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54060x9c452acf, ph.t.k().c());
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.q2) i95.n0.c(ob0.q2.class))).getClass();
                        if (gi.i0.f353588b) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PinResDownloaderCore", "skip resume onCallback for low energy: doze mode on!");
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.r2) i95.n0.c(ob0.r2.class))).getClass();
                            ri.o.a(84);
                        }
                    }
                    ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.h0(), "PostTaskCheckResume-Check");
                }
                return false;
            }
        };
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        java.util.Iterator it = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.m0.a().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.n nVar = (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.n) ((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.o) it.next());
            nVar.f271159b.mo48813x58998cd();
            com.p314xaae8f345.mm.app.w.INSTANCE.a(nVar.f271158a);
            gm0.j1.e().k(new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.m(nVar), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        }
        gm0.j1.n().a(this.f271201d);
        this.f271202e.mo48813x58998cd();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        gm0.j1.n().d(this.f271201d);
        this.f271202e.mo48814x2efc64();
        java.util.Iterator it = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.m0.a().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.n nVar = (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.n) ((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.o) it.next());
            nVar.f271159b.mo48814x2efc64();
            com.p314xaae8f345.mm.app.w.INSTANCE.p(nVar.f271158a);
        }
    }
}
