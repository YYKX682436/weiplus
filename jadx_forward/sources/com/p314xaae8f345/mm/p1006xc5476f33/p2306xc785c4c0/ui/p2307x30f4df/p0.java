package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f256599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j f256600e;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar, android.view.View view) {
        this.f256600e = jVar;
        this.f256599d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        int width = this.f256599d.getWidth();
        int i17 = this.f256600e.P;
        if (width < i17) {
            int i18 = i17 - width;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "expand back touch right:%s", java.lang.Integer.valueOf(i18));
            com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.INSTANCE.m42555xb328de9a(this.f256599d, 0, 0, i18, 0);
        }
    }
}
