package n72;

/* loaded from: classes14.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n72.q f416789d;

    public f(n72.q qVar) {
        this.f416789d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        n72.q qVar = this.f416789d;
        qVar.f416814p = n72.q.b(qVar);
        if (!this.f416789d.f416814p) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(917L, this.f416789d.G == 1 ? 3L : 39L, 1L, false);
            n72.q qVar2 = this.f416789d;
            qVar2.f416814p = n72.q.b(qVar2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(917L, this.f416789d.G == 1 ? 2L : 38L, 1L, false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new n72.e(this));
    }
}
