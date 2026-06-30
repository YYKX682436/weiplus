package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.j f290146d;

    public g(com.p314xaae8f345.mm.ui.j jVar) {
        this.f290146d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.j jVar = this.f290146d;
        int width = jVar.f290501a.getWidth();
        int i17 = jVar.f290520t;
        if (width < i17) {
            int i18 = i17 - width;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActionBarCustomArea", "expand back touch right:%s", java.lang.Integer.valueOf(i18));
            com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.INSTANCE.m42555xb328de9a(jVar.f290501a, 0, 0, i18, 0);
        }
    }
}
