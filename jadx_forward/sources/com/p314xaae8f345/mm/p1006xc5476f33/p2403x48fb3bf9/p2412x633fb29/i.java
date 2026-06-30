package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f264459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j f264460e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j jVar, boolean z17) {
        this.f264460e = jVar;
        this.f264459d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f264459d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j jVar = this.f264460e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k.a(jVar.f264481f, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlayLogic", "enableAutoPlay (true)");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k.a(jVar.f264481f, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlayLogic", "enableAutoPlay (false)");
        }
    }
}
