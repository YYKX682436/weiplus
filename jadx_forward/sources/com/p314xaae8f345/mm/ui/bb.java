package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public class bb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ga f279408d;

    public bb(com.p314xaae8f345.mm.ui.ga gaVar) {
        this.f279408d = gaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.ga gaVar = this.f279408d;
        int width = gaVar.f290164J.getWidth();
        int i17 = gaVar.f290178g0;
        if (width < i17) {
            int i18 = i17 - width;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMActivityController", "expand back touch right:%s", java.lang.Integer.valueOf(i18));
            com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.INSTANCE.m42555xb328de9a(gaVar.f290164J, 0, 0, i18, 0);
        }
    }
}
