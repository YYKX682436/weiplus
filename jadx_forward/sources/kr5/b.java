package kr5;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr5.c f393057d;

    public b(kr5.c cVar) {
        this.f393057d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        kr5.c cVar = this.f393057d;
        try {
            java.lang.String b17 = kr5.c.c().b();
            java.lang.String str = kr5.d.f393064a[0];
            bs5.q qVar = new bs5.q("34745", "Sh63l8wv", "347982594");
            tr5.e0 e0Var = new tr5.e0();
            e0Var.d(b17);
            e0Var.b("DesHttp");
            e0Var.e(str);
            e0Var.f(qVar);
            e0Var.c(kr5.p.f393103a);
            e0Var.g(2000);
            e0Var.f503003l = true;
            e0Var.f502998g = false;
            tr5.g0 f17 = tr5.l.f(e0Var.a());
            gs5.f.a("HDNSGetDomainIP", f17);
            if (f17.f503026e.d()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.List asList = java.util.Arrays.asList(f17.f503025d.f503042d);
                java.util.List a17 = cVar.a();
                arrayList.addAll(asList);
                arrayList.addAll(a17);
                cVar.e(arrayList);
            }
        } catch (java.lang.Exception e17) {
            or5.b.c(5, e17, "getServerIpsTask failed", new java.lang.Object[0]);
        }
    }
}
