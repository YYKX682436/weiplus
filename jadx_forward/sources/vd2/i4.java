package vd2;

/* loaded from: classes3.dex */
public final class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c f517298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f517299e;

    public i4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c, boolean z17) {
        this.f517298d = c14167x40aca97c;
        this.f517299e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vd2.t1 t1Var = this.f517298d.f193019h;
        if (t1Var != null) {
            ((vd2.v2) t1Var).p(this.f517299e);
        }
    }
}
