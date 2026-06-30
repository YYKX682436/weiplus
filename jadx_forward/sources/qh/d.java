package qh;

/* loaded from: classes12.dex */
public class d implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.o2 f444862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qh.e f444863b;

    public d(qh.e eVar, rh.o2 o2Var) {
        this.f444863b = eVar;
        this.f444862a = o2Var;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        qh.b bVar = (qh.b) obj;
        long e17 = bVar.e();
        for (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry threadJiffiesEntry : ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) this.f444862a.f477019c).f134095h.f477093a) {
            if (threadJiffiesEntry.f134101e.toUpperCase().contains("R")) {
                this.f444863b.f444866a.x(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c.class, new qh.c(this, threadJiffiesEntry, e17, bVar));
            }
        }
    }
}
