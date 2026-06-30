package d55;

/* loaded from: classes12.dex */
public abstract class f0 extends d55.g0 {
    @Override // d55.g0
    public void j() {
        this.f308103m = java.lang.System.currentTimeMillis();
        int i17 = this.f308106p.f308124d.f308130a;
        if (i17 > 0) {
            super.j();
            return;
        }
        d55.o0.a(4, "MicroMsg.recovery.safePointLazy", "no need check, crash count = " + i17);
        this.f308116r.set(true);
        l();
        java.util.concurrent.Executors.newCachedThreadPool().submit(new d55.e0(this));
    }
}
