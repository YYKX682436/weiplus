package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class k1 implements wd0.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f73968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wd0.m2 f73969b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f73970c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.m1 f73971d;

    public k1(com.tencent.mm.plugin.account.ui.m1 m1Var, kotlinx.coroutines.y0 y0Var, wd0.m2 m2Var, java.lang.String str) {
        this.f73971d = m1Var;
        this.f73968a = y0Var;
        this.f73969b = m2Var;
        this.f73970c = str;
    }

    @Override // wd0.c1
    public void a(wd0.e1 e1Var) {
        com.tencent.mars.xlog.Log.i("FingerprintVerifyHalfBottomDialog", "[fingerprint login] verifyFingerprintLoginCGI(callback) errCode: %d, errMsg: %s", java.lang.Integer.valueOf(e1Var.f444703a), e1Var.toString());
        int i17 = e1Var.f444703a;
        wd0.d1[] d1VarArr = wd0.d1.f444702d;
        wd0.m2 m2Var = this.f73969b;
        com.tencent.mm.plugin.account.ui.m1 m1Var = this.f73971d;
        if (i17 == 12) {
            if (m1Var.f74033i > 0) {
                r45.vt4 vt4Var = e1Var.f444708f;
                c01.f9.d(vt4Var.f388519f, vt4Var.f388518e, vt4Var.f388517d, true, e1Var.f444709g);
                wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
                kotlinx.coroutines.y0 y0Var = this.f73968a;
                java.lang.String str = this.f73970c;
                ((vd0.v1) j1Var).bj(y0Var, m2Var, str, new com.tencent.mm.plugin.account.ui.k1(m1Var, y0Var, m2Var, str));
                m1Var.f74033i--;
                return;
            }
            e1Var.f444703a = 8;
        }
        kotlin.jvm.internal.o.g(m2Var, "<set-?>");
        e1Var.f444710h = m2Var;
        m1Var.f74031g.a(e1Var);
    }

    @Override // wd0.c1
    public void b(boolean z17) {
    }
}
