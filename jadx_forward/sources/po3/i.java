package po3;

/* loaded from: classes9.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5993x579c3db0 f438864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po3.k f438865e;

    public i(po3.k kVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5993x579c3db0 c5993x579c3db0) {
        this.f438865e = kVar;
        this.f438864d = c5993x579c3db0;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f438864d.f136288g.f89192a;
        if (po3.k.A(f9Var.Q0())) {
            this.f438865e.r(f9Var);
        }
    }
}
