package ck3;

/* loaded from: classes8.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk3.d f124045d;

    public p(kk3.d dVar) {
        this.f124045d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kk3.d dVar = this.f124045d;
        if (dVar != null) {
            kk3.d.f(dVar, 0, 1, null);
        }
    }
}
