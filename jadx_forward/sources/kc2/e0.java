package kc2;

/* loaded from: classes15.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f387891d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f387892e;

    public e0(java.lang.ref.WeakReference rManager, java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rManager, "rManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f387891d = rManager;
        this.f387892e = key;
    }

    @Override // java.lang.Runnable
    public void run() {
        kc2.g1 g1Var = (kc2.g1) this.f387891d.get();
        jz5.f0 f0Var = null;
        if (g1Var != null) {
            g1Var.q(kc2.w1.f388047e, this.f387892e);
            g1Var.A = null;
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderKaraInfoManager", "ClickWatchTask run but manager is null!");
        }
    }
}
