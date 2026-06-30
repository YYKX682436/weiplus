package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f256555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j f256556e;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar, int i17) {
        this.f256556e = jVar;
        this.f256555d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = this.f256556e;
        int i17 = jVar.I;
        if (this.f256555d == i17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.c1) ((java.util.ArrayList) jVar.H).get(i17)).f256477c.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onH5RenderFinished hide fakeIv " + jVar.I);
        }
    }
}
