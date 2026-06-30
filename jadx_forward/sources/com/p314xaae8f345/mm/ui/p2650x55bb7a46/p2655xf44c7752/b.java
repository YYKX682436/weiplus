package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes8.dex */
public final class b implements db5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f282330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21742xc037988c f282331b;

    public b(java.util.concurrent.atomic.AtomicInteger atomicInteger, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21742xc037988c c21742xc037988c) {
        this.f282330a = atomicInteger;
        this.f282331b = c21742xc037988c;
    }

    @Override // db5.d
    /* renamed from: onComplete */
    public final void mo2162x815f5438(boolean z17) {
        if (!z17 && this.f282330a.getAndIncrement() < 1) {
            db5.f.c(this.f282331b.f282065g, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.a.f282303a);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityPullDownCloseLayout", "convertTranslucent drawComplete : " + z17);
    }
}
