package nu1;

/* loaded from: classes13.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu1.n f421700d;

    public k(nu1.n nVar) {
        this.f421700d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nu1.n nVar = this.f421700d;
        if (nVar.Ai()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5978x27be076f c5978x27be076f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5978x27be076f();
            c5978x27be076f.f136275g.f88239a = true;
            c5978x27be076f.e();
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5978x27be076f c5978x27be076f2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5978x27be076f();
            c5978x27be076f2.f136275g.f88239a = false;
            c5978x27be076f2.e();
            nVar.wi();
        }
    }
}
