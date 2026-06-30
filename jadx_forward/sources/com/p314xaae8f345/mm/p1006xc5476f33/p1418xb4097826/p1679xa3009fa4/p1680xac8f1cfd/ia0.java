package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ia0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 f216257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.da f216258e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f216259f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f216260g;

    public ia0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34, cw2.da daVar, long j17, java.lang.String str) {
        this.f216257d = c15482x9b531b34;
        this.f216258e = daVar;
        this.f216259f = j17;
        this.f216260g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34 = this.f216257d;
        cw2.da daVar = this.f216258e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34.N6(c15482x9b531b34, daVar);
        c15482x9b531b34.f215221x.remove(java.lang.Integer.valueOf(daVar.hashCode()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "[releaseVideoView] completed! cost=" + (java.lang.System.currentTimeMillis() - this.f216259f) + "ms, release view=" + daVar.hashCode() + " source=" + this.f216260g);
    }
}
