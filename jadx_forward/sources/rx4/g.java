package rx4;

/* loaded from: classes8.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final rx4.g f482687d = new rx4.g();

    @Override // java.lang.Runnable
    public final void run() {
        yg0.o3 o3Var = (yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class));
        o3Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "setHalfScreenToFull");
        ch0.z b17 = o3Var.f543764e.b();
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", "setHalfScreenToFull, currentScene is null, just quit");
        } else if (b17.f122800g) {
            b17.f122807n.put("halfScreenAutoPlay", "1");
        }
    }
}
