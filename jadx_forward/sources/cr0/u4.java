package cr0;

/* loaded from: classes12.dex */
public final class u4 implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f303304a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f303305b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qh.b f303306c;

    public u4(rh.c1 c1Var, java.util.List list, qh.b bVar) {
        this.f303304a = c1Var;
        this.f303305b = list;
        this.f303306c = bVar;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        java.lang.Object obj2;
        int b17;
        java.lang.String str;
        rh.o2 o2Var = (rh.o2) obj;
        cr0.v4 v4Var = cr0.v4.f303317a;
        rh.d3 end = o2Var.f477018b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(end, "end");
        cr0.v4.a(v4Var, (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) end);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dumpThreadSizing, fork=");
        rh.c1 c1Var = this.f303304a;
        sb6.append(c1Var.f476870s);
        sb6.append('-');
        sb6.append(c1Var.z());
        sb6.append(", isRunning=");
        sb6.append(c1Var.E());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadProfiler", sb6.toString());
        int i17 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.a.f149056m0;
        for (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry threadJiffiesEntry : this.f303305b) {
            java.util.List list = ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var.f477019c).f134095h.f477093a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getList(...)");
            java.util.Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot) obj2).f134098b == threadJiffiesEntry.f134098b) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot threadJiffiesSnapshot = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot) obj2;
            if (threadJiffiesSnapshot != null) {
                java.lang.String stat = threadJiffiesSnapshot.f134101e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stat, "stat");
                java.lang.String upperCase = stat.toUpperCase(java.util.Locale.ROOT);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upperCase, "toUpperCase(...)");
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(upperCase, "R") && (b17 = a06.d.b((((float) (threadJiffiesSnapshot.f477085a.longValue() * 10)) * 100.0f) / ((float) o2Var.f477020d))) >= 50) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Thread WatchDog Alert: ");
                    sb7.append(threadJiffiesSnapshot.f134099c);
                    sb7.append(", tid=");
                    sb7.append(threadJiffiesSnapshot.f134098b);
                    sb7.append(", cpuLoad=");
                    sb7.append(b17);
                    sb7.append("%, chargeLoad=");
                    qh.b bVar = this.f303306c;
                    sb7.append(bVar.f444845e);
                    sb7.append('%');
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ThreadProfiler", sb7.toString());
                    ph.u e17 = gi.d.e();
                    if (e17 == null || (str = e17.f435829h.f444868d.A.a(threadJiffiesSnapshot.f134098b)) == null) {
                        str = "";
                    }
                    ap.a.b(10002, "ThreadProfiler", r26.i0.t(r26.i0.t(str, "\n", ";", false), "\t", "", false), null, "WatchDogAlert", threadJiffiesSnapshot.f134099c, java.lang.String.valueOf(b17), java.lang.String.valueOf(bVar.f444845e));
                    int i18 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.a.f149056m0;
                }
            }
        }
    }
}
