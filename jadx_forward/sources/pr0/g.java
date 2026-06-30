package pr0;

/* loaded from: classes14.dex */
public abstract class g implements android.hardware.display.DisplayManager.DisplayListener, nr0.y, nr0.z, nr0.b0, nr0.a0 {

    /* renamed from: e, reason: collision with root package name */
    public sr0.i f439367e;

    /* renamed from: i, reason: collision with root package name */
    public final android.hardware.display.DisplayManager f439371i;

    /* renamed from: d, reason: collision with root package name */
    public final int f439366d = hashCode();

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f439368f = jz5.h.b(pr0.f.f439360d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f439369g = jz5.h.b(new pr0.e(this));

    /* renamed from: h, reason: collision with root package name */
    public volatile long f439370h = -1;

    public g() {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("display");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        this.f439371i = (android.hardware.display.DisplayManager) systemService;
    }

    public final nr0.x k() {
        return (nr0.x) ((jz5.n) this.f439369g).mo141623x754a37bb();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKit", "Display #" + i17 + " added.");
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKit", "Display #" + i17 + " changed.");
        if (this.f439367e == null) {
            return;
        }
        if (java.lang.System.currentTimeMillis() - this.f439370h < 1000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Camera.CameraKit", "jump onDisplayChanged");
            return;
        }
        sr0.i iVar = this.f439367e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar);
        int d17 = iVar.d();
        sr0.i iVar2 = this.f439367e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar2);
        if (k().f420654m.f537711d != ((((sr0.f) iVar2).A() - d17) + com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) {
            this.f439370h = java.lang.System.currentTimeMillis();
            pr0.n0 n0Var = (pr0.n0) this;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKit", "updateScreenRotate");
            n0Var.m("updateScreenRotate", new pr0.l0(n0Var, null));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKit", "Display #" + i17 + " removed.");
    }
}
