package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class mu implements cw2.ea {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f216740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f216741e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.n f216742f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f216743g;

    public mu(long j17, int i17, v65.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f) {
        this.f216740d = j17;
        this.f216741e = i17;
        this.f216742f = nVar;
        this.f216743g = c15196x85976f5f;
    }

    @Override // cw2.ea
    /* renamed from: onVideoPause */
    public void mo1057x65d3157a() {
    }

    @Override // cw2.ea
    /* renamed from: onVideoPlay */
    public void mo1058x4d9b9b30() {
    }

    @Override // cw2.ea
    public void p4(long j17, long j18) {
        long j19 = this.f216740d;
        long j27 = (j19 - j17) / 1000;
        int i17 = this.f216741e;
        if (j27 <= i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPopupUIC", "waitBeforeFinWatchInterval updateProgress suc, totalPlayMs=" + j19 + " currentMs=" + j17 + " beforeFinWatchInterval=" + i17 + '!');
            this.f216742f.a(java.lang.Boolean.TRUE);
            this.f216743g.T(this);
        }
    }
}
