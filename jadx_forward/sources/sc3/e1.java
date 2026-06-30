package sc3;

/* loaded from: classes7.dex */
public final class e1 implements h8.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f487974a;

    public e1(sc3.k1 k1Var) {
        this.f487974a = k1Var;
    }

    @Override // h8.c
    public java.lang.String a() {
        return "appbrand_file";
    }

    @Override // h8.c
    /* renamed from: accept */
    public boolean mo127722xab27b508(java.lang.Object obj) {
        return true;
    }

    @Override // h8.c
    public h8.b b(java.lang.Object obj, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab) {
        h8.b bVar = new h8.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str = (java.lang.String) obj;
        sc3.k1 k1Var = this.f487974a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k1Var.Q, "fetch data ".concat(str));
        bf3.g0 g0Var = bf3.g0.f101160a;
        jc3.x xVar = k1Var.f488019r;
        if (xVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgManagement");
            throw null;
        }
        java.nio.ByteBuffer c17 = g0Var.c(xVar, str);
        if (c17 != null) {
            bVar.f361044a = new nf.a(c17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(k1Var.Q, "fetch " + str + " failed");
            bVar.f361045b = "Read file " + str + " failed";
        }
        return bVar;
    }
}
