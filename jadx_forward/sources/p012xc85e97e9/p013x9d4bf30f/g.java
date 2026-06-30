package p012xc85e97e9.p013x9d4bf30f;

/* loaded from: classes14.dex */
public abstract class g {

    /* renamed from: mCancellables */
    private java.util.concurrent.CopyOnWriteArrayList<p012xc85e97e9.p013x9d4bf30f.a> f87x54bd7d74 = new java.util.concurrent.CopyOnWriteArrayList<>();

    /* renamed from: mEnabled */
    private boolean f88x3e283e14;

    public g(boolean z17) {
        this.f88x3e283e14 = z17;
    }

    /* renamed from: addCancellable */
    public void m2522xc8077e2b(p012xc85e97e9.p013x9d4bf30f.a aVar) {
        this.f87x54bd7d74.add(aVar);
    }

    /* renamed from: handleOnBackPressed */
    public abstract void mo2523xc0eac894();

    /* renamed from: isEnabled */
    public final boolean m2524x7d80d2b7() {
        return this.f88x3e283e14;
    }

    /* renamed from: remove */
    public final void m2525xc84af884() {
        java.util.Iterator<p012xc85e97e9.p013x9d4bf30f.a> it = this.f87x54bd7d74.iterator();
        while (it.hasNext()) {
            it.next().mo2521xae7a2e7a();
        }
    }

    /* renamed from: removeCancellable */
    public void m2526x1bae4268(p012xc85e97e9.p013x9d4bf30f.a aVar) {
        this.f87x54bd7d74.remove(aVar);
    }

    /* renamed from: setEnabled */
    public final void m2527x514e147f(boolean z17) {
        this.f88x3e283e14 = z17;
    }
}
