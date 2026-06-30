package u62;

/* loaded from: classes12.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f506484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f506485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v25.b f506486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13502x57397e14 f506487g;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13502x57397e14 c13502x57397e14, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, java.lang.String[] strArr, v25.b bVar) {
        this.f506487g = c13502x57397e14;
        this.f506484d = z3Var;
        this.f506485e = strArr;
        this.f506486f = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5394x5f152971 c5394x5f152971 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5394x5f152971();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f506484d;
        java.lang.String d17 = z3Var.d1();
        am.i8 i8Var = c5394x5f152971.f135733g;
        i8Var.f88448a = d17;
        i8Var.f88449b = this.f506485e[1];
        i8Var.f88450c = c01.e2.C(z3Var.d1());
        boolean e17 = c5394x5f152971.e();
        v25.b bVar = this.f506486f;
        com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13502x57397e14 c13502x57397e14 = this.f506487g;
        if (!e17) {
            c13502x57397e14.k(4);
            bVar.a();
            return;
        }
        am.j8 j8Var = c5394x5f152971.f135734h;
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = j8Var.f88548b;
        try {
            c01.d9.e().a(522, new u62.d(this, com.p314xaae8f345.mm.p1006xc5476f33.ext.key.C13497xe8ed7151.b(j8Var.f88547a)));
            c01.d9.e().g(m1Var);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlProviderMsg", e18.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ExtControlProviderMsg", e18, "", new java.lang.Object[0]);
            c13502x57397e14.k(4);
            bVar.a();
        }
    }
}
