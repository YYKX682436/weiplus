package ft1;

/* loaded from: classes10.dex */
public final class p implements c01.p8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ft1.q f348043a;

    public p(ft1.q qVar) {
        this.f348043a = qVar;
    }

    @Override // c01.p8
    public void a(java.lang.String str, java.lang.String str2, int i17) {
        if (str != null) {
            i(str, i17, null);
        }
    }

    @Override // c01.p8
    public void b(java.lang.String str, int i17, c01.o8 o8Var) {
        if (str != null) {
            i(str, i17, o8Var);
        }
    }

    @Override // c01.p8
    public void d() {
    }

    @Override // c01.p8
    public void e(java.lang.String str) {
    }

    @Override // c01.p8
    public void f(java.lang.String str) {
    }

    @Override // c01.p8
    public void g(java.lang.String str, java.lang.String str2, int i17, c01.o8 o8Var) {
        if (str != null) {
            i(str, i17, o8Var);
        }
    }

    @Override // c01.p8
    public void h(java.lang.String str, int i17, java.lang.String str2) {
    }

    public final void i(java.lang.String str, int i17, c01.o8 o8Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BypGetContactInterceptor", "getContact from server: %s", str);
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            p3325xe03a0797.p3326xc267989b.l.d(c20976x6ba6452a, p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new ft1.o(this.f348043a, str, i17, o8Var, null), 2, null);
        }
    }
}
