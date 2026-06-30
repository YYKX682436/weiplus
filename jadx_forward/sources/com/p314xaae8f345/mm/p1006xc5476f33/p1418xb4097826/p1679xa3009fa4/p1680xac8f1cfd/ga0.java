package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ga0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 f216017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.da f216018e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f216019f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f216020g;

    public ga0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34, cw2.da daVar, long j17, java.lang.String str) {
        this.f216017d = c15482x9b531b34;
        this.f216018e = daVar;
        this.f216019f = j17;
        this.f216020g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34 = this.f216017d;
        cw2.da daVar = this.f216018e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34.N6(c15482x9b531b34, daVar);
        c15482x9b531b34.f215221x.remove(java.lang.Integer.valueOf(daVar.hashCode()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "[releaseVideoView] completed! cost=" + (java.lang.System.currentTimeMillis() - this.f216019f) + "ms, release view=" + daVar.hashCode() + " source=" + this.f216020g);
    }
}
