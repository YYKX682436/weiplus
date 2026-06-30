package cs3;

/* loaded from: classes9.dex */
public class i implements x51.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cs3.j f303646a;

    public i(cs3.j jVar) {
        this.f303646a = jVar;
    }

    @Override // x51.o0
    public boolean a() {
        return false;
    }

    @Override // x51.o0
    public x51.n0 b() {
        return null;
    }

    @Override // x51.o0
    public java.lang.String c() {
        return this.f303646a.f303647d;
    }

    @Override // x51.o0
    public java.lang.String d() {
        return this.f303646a.f303647d;
    }

    @Override // x51.o0
    public android.graphics.Bitmap e() {
        return null;
    }

    @Override // x51.o0
    public void f() {
    }

    @Override // x51.o0
    public java.lang.String g() {
        return this.f303646a.f303647d;
    }

    @Override // x51.o0
    public void h(x51.m0 m0Var, java.lang.String str) {
    }

    @Override // x51.o0
    public boolean i() {
        return false;
    }

    @Override // x51.o0
    public void j(java.lang.String str, boolean z17) {
    }

    @Override // x51.o0
    public java.lang.String k() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        c01.d9.b().getClass();
        sb6.append(((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).wi());
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(this.f303646a.f303647d));
        return sb6.toString();
    }

    @Override // x51.o0
    public android.graphics.Bitmap l(android.graphics.Bitmap bitmap, x51.m0 m0Var, java.lang.String str) {
        if (x51.m0.NET == m0Var) {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, k(), false);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UrlDrawable", e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.UrlDrawable", "save bitmap fail");
            }
        }
        m0Var.toString();
        return bitmap;
    }
}
