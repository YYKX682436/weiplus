package po3;

/* loaded from: classes9.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5991xa0d42363 f438862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po3.k f438863e;

    public h(po3.k kVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5991xa0d42363 c5991xa0d42363) {
        this.f438863e = kVar;
        this.f438862d = c5991xa0d42363;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f438862d.f136286g.f88994a;
        if (po3.k.A(f9Var.Q0())) {
            this.f438863e.q(f9Var);
        }
    }
}
