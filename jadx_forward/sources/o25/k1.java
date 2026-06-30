package o25;

/* loaded from: classes5.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f424082d;

    public k1(java.lang.ref.WeakReference weakReference) {
        this.f424082d = weakReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) this.f424082d.get();
        if (abstractActivityC21394xb3d2c0cf == null || abstractActivityC21394xb3d2c0cf.isFinishing() || abstractActivityC21394xb3d2c0cf.isDestroyed()) {
            return;
        }
        abstractActivityC21394xb3d2c0cf.getWindow().getDecorView().setSystemUiVisibility(abstractActivityC21394xb3d2c0cf.getWindow().getDecorView().getSystemUiVisibility() | 256);
        int c17 = fp.a.c(abstractActivityC21394xb3d2c0cf);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullScreenHelper", "setFullScreenAfterSetContentView to bodyView, height: %d, %d", java.lang.Integer.valueOf(c17), java.lang.Integer.valueOf(i65.a.b(abstractActivityC21394xb3d2c0cf, 2)));
        abstractActivityC21394xb3d2c0cf.m78510xe15784dd().setPadding(0, c17 - i65.a.b(abstractActivityC21394xb3d2c0cf, 2), 0, 0);
    }
}
