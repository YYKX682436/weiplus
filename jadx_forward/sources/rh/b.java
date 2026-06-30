package rh;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.g f476839d;

    public b(rh.g gVar) {
        this.f476839d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        rh.g gVar = this.f476839d;
        synchronized (gVar.f476926e) {
            for (int i17 = 0; i17 < gVar.f476926e.size(); i17++) {
                java.util.List list = (java.util.List) gVar.f476926e.valueAt(i17);
                if (list != null && list.size() > gVar.f476930i) {
                    wh.j2.b(list);
                }
            }
        }
        if (((java.util.ArrayList) gVar.f476923b).size() > gVar.f476930i) {
            oj.j.f("Matrix.battery.AbsTaskMonitorFeature", "cooling task jiffies list, before = " + ((java.util.ArrayList) gVar.f476923b).size(), new java.lang.Object[0]);
            java.util.List n17 = gVar.n(0L);
            gVar.l();
            oj.j.f("Matrix.battery.AbsTaskMonitorFeature", "cooling task jiffies list, after = " + ((java.util.ArrayList) gVar.f476923b).size(), new java.lang.Object[0]);
            oj.j.f("Matrix.battery.AbsTaskMonitorFeature", "report task jiffies list overheat", new java.lang.Object[0]);
            gVar.s(n17);
        }
    }
}
