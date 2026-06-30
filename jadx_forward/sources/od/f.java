package od;

/* loaded from: classes8.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final od.p f426034a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f426035b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f426036c = false;

    public f(od.p pVar) {
        this.f426034a = pVar;
    }

    public synchronized void a(od.e eVar) {
        if (!this.f426036c && eVar.f426030b.optLong("liteCallbackId", 0L) == 0) {
            this.f426035b.add(eVar);
        }
        b(eVar);
    }

    public final void b(od.e eVar) {
        long optLong = eVar.f426030b.optLong("liteCallbackId", 0L);
        od.p pVar = this.f426034a;
        if (optLong != 0) {
            pVar.mo32260x738236e6(eVar.m151054x9616526c(), null);
        } else {
            pVar.mo32260x738236e6(java.lang.String.format("if(typeof luggageBridge !== 'undefined') luggageBridge._processMessageFromJava(%s);", eVar.m151054x9616526c()), null);
        }
    }
}
