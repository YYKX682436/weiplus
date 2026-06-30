package ai4;

/* loaded from: classes11.dex */
public interface b {
    static /* synthetic */ long g(ai4.b bVar, java.lang.String str, java.lang.String str2, pj4.b0 b0Var, int i17, java.lang.String str3, long j17, float f17, pj4.s sVar, pj4.r rVar, boolean z17, int i18, java.lang.Object obj) {
        if (obj == null) {
            return bVar.L(str, str2, b0Var, (i18 & 8) != 0 ? 0 : i17, (i18 & 16) != 0 ? "NOT_SET" : str3, (i18 & 32) != 0 ? 0L : j17, (i18 & 64) != 0 ? 0.0f : f17, (i18 & 128) != 0 ? null : sVar, (i18 & 256) != 0 ? null : rVar, (i18 & 512) != 0 ? true : z17);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateStatus");
    }

    static /* synthetic */ void s(ai4.b bVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reqGetSelfInfo");
        }
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        bVar.m(z17);
    }

    boolean A(mj4.e eVar);

    java.util.List B();

    boolean C(mj4.l lVar);

    java.util.List D();

    mj4.h E();

    void F(int i17);

    si4.a G();

    boolean H(int i17, java.lang.String str, int i18);

    void I(java.lang.String str);

    void J(qi4.b bVar, qi4.b bVar2);

    java.util.List K();

    long L(java.lang.String str, java.lang.String str2, pj4.b0 b0Var, int i17, java.lang.String str3, long j17, float f17, pj4.s sVar, pj4.r rVar, boolean z17);

    mj4.h M(java.lang.String str);

    java.util.List N();

    d95.b0 a();

    void b();

    int c();

    java.util.List d();

    void e();

    void f();

    int h(int i17);

    hj4.b i();

    int j();

    java.util.List k();

    java.util.List l();

    void m(boolean z17);

    void n();

    boolean o(java.lang.String str);

    void p(qi4.b bVar, qi4.b bVar2);

    boolean q(mj4.e eVar);

    boolean r();

    boolean t(mj4.l lVar);

    boolean u(mj4.l lVar);

    boolean v(java.lang.String str, boolean z17);

    java.util.List w();

    boolean x();

    mj4.l y(java.lang.String str, java.lang.String str2);

    void z(java.util.Map map);
}
