package yf5;

/* loaded from: classes14.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf5.d f543383d;

    public b(yf5.d dVar) {
        this.f543383d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yf5.d dVar = this.f543383d;
        dVar.getClass();
        for (int i17 = 0; i17 < 18; i17++) {
            android.view.View b17 = dVar.b();
            synchronized (dVar) {
                ((java.util.ArrayDeque) dVar.f543393b).offer(b17);
            }
        }
    }
}
