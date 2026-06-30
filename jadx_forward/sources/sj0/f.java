package sj0;

/* loaded from: classes13.dex */
public class f extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sj0.g f489887e;

    public f(sj0.g gVar) {
        this.f489887e = gVar;
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "Handle_Monitor_mem_cpu";
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context;
        synchronized (this.f489887e.f489894h) {
            sj0.g gVar = this.f489887e;
            if (gVar.f489892f) {
                java.util.Iterator it = gVar.f489891e.values().iterator();
                while (it.hasNext()) {
                    sj0.c cVar = (sj0.c) ((sj0.b) it.next());
                    java.util.List list = cVar.f489873b;
                    if (list != null && ((java.util.ArrayList) list).size() <= 10000 && (context = cVar.f489872a) != null) {
                        ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getMemoryInfo(new android.app.ActivityManager.MemoryInfo());
                        double d17 = ((r5.totalMem - r5.availMem) / 1024.0d) / 1024.0d;
                        cVar.f489875d = java.lang.Math.min(d17, cVar.f489875d);
                        ((java.util.ArrayList) list).add(java.lang.Double.valueOf(d17));
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PerformanceMonitor", "hy: already stopped");
                b();
            }
        }
    }
}
