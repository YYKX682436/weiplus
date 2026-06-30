package l83;

/* loaded from: classes14.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e f398621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l83.c f398622e;

    public b(l83.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar) {
        this.f398622e = cVar;
        this.f398621d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar = this.f398621d;
        l83.c cVar = this.f398622e;
        if (eVar != null) {
            eVar.e();
            this.f398621d.f();
            this.f398621d = null;
            cVar.f398626d = false;
        }
        cVar.f398627e.v();
    }
}
