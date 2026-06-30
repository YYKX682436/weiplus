package sk3;

/* loaded from: classes8.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.bg.C16607x5430141d f490487d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.bg.C16607x5430141d c16607x5430141d) {
        this.f490487d = c16607x5430141d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBgContainer.", "hide gradient");
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10434xd4fc3d40 dynamicBgSurfaceView = this.f490487d.getDynamicBgSurfaceView();
        if (dynamicBgSurfaceView != null) {
            dynamicBgSurfaceView.m43653x16ae2614(false);
        }
    }
}
