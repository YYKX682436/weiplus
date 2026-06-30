package u62;

/* loaded from: classes12.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f506492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v25.b f506493e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13504x5739900b f506494f;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13504x5739900b c13504x5739900b, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, v25.b bVar) {
        this.f506494f = c13504x5739900b;
        this.f506492d = z3Var;
        this.f506493e = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5400x2495a482 c5400x2495a482 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5400x2495a482();
        am.s8 s8Var = c5400x2495a482.f135743g;
        s8Var.f89406a = 1;
        s8Var.f89407b = this.f506492d.d1();
        com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13504x5739900b c13504x5739900b = this.f506494f;
        s8Var.f89408c = c13504x5739900b.f181445o;
        s8Var.f89409d = c13504x5739900b.f181446p;
        s8Var.f89410e = new u62.k(this);
        c5400x2495a482.e();
    }
}
