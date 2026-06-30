package yf5;

/* loaded from: classes14.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f543386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf5.d f543387e;

    public c(int i17, yf5.d dVar) {
        this.f543386d = i17;
        this.f543387e = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvListViewPool", "start to per inflate view");
        yf5.d dVar = this.f543387e;
        dVar.getClass();
        int i17 = this.f543386d;
        if (i17 > 18) {
            i17 = 18;
        }
        for (int i18 = 0; i18 < i17; i18++) {
            android.view.View b17 = dVar.b();
            synchronized (dVar) {
                ((java.util.ArrayDeque) dVar.f543393b).offer(b17);
            }
        }
        dVar.f543394c.set(false);
    }
}
