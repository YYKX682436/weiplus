package qh;

/* loaded from: classes12.dex */
public class c implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry f444856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f444857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qh.b f444858c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qh.d f444859d;

    public c(qh.d dVar, com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry threadJiffiesEntry, long j17, qh.b bVar) {
        this.f444859d = dVar;
        this.f444856a = threadJiffiesEntry;
        this.f444857b = j17;
        this.f444858c = bVar;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c cVar = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c) obj;
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry threadJiffiesEntry = this.f444856a;
        long longValue = ((java.lang.Long) threadJiffiesEntry.f477085a).longValue();
        long j17 = this.f444857b;
        long j18 = longValue / j17;
        boolean h17 = this.f444858c.h();
        qh.d dVar = this.f444859d;
        if (h17) {
            if (j17 <= 10 || j18 <= dVar.f444863b.f444867b.f444921d.f444868d.f444824j) {
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("threadWatchDog fg set, name = ");
            rh.o2 o2Var = dVar.f444862a;
            sb6.append(((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var.f477019c).f134093f);
            sb6.append(", pid = ");
            sb6.append(((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var.f477019c).f134091d);
            sb6.append(", tid = ");
            sb6.append(threadJiffiesEntry.f134098b);
            oj.j.c("Matrix.battery.BatteryPrinter", sb6.toString(), new java.lang.Object[0]);
            cVar.m(true, ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var.f477019c).f134091d, threadJiffiesEntry.f134098b);
            return;
        }
        if (j17 <= 10 || j18 <= dVar.f444863b.f444867b.f444921d.f444868d.f444825k) {
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("threadWatchDog bg set, name = ");
        rh.o2 o2Var2 = dVar.f444862a;
        sb7.append(((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var2.f477019c).f134093f);
        sb7.append(", pid = ");
        sb7.append(((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var2.f477019c).f134091d);
        sb7.append(", tid = ");
        sb7.append(threadJiffiesEntry.f134098b);
        oj.j.c("Matrix.battery.BatteryPrinter", sb7.toString(), new java.lang.Object[0]);
        cVar.m(false, ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var2.f477019c).f134091d, threadJiffiesEntry.f134098b);
    }
}
