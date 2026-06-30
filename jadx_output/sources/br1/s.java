package br1;

/* loaded from: classes11.dex */
public final class s implements c01.p8 {
    @Override // c01.p8
    public void a(java.lang.String str, java.lang.String str2, int i17) {
    }

    @Override // c01.p8
    public void b(java.lang.String str, int i17, c01.o8 o8Var) {
        if (str != null) {
            i(str, o8Var);
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
            i(str, o8Var);
        }
    }

    @Override // c01.p8
    public void h(java.lang.String str, int i17, java.lang.String str2) {
    }

    public final void i(java.lang.String str, c01.o8 o8Var) {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = str;
        if (com.tencent.mm.storage.z3.E3(str)) {
            hr1.a y07 = yq1.u0.Bi().y0(str);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getContact] bizFans username=");
            sb6.append(str);
            sb6.append(", hasContact=");
            sb6.append(y07 != null);
            com.tencent.mars.xlog.Log.i("BizFans.BizFansContactInterceptor", sb6.toString());
            pm0.v.X(new br1.p(o8Var, str, y07));
            return;
        }
        if (!com.tencent.mm.storage.z3.G3(str)) {
            c01.p8 a17 = c01.n8.a();
            if (a17 instanceof c01.l8) {
                ((c01.k7) ((c01.l8) a17)).f37286a.b(str, 5, new br1.r(h0Var, o8Var));
                return;
            }
            return;
        }
        hr1.a y08 = yq1.u0.Ui().y0(str);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[getContact] photoFans username=");
        sb7.append(str);
        sb7.append(", hasContact=");
        sb7.append(y08 != null);
        com.tencent.mars.xlog.Log.i("BizFans.BizFansContactInterceptor", sb7.toString());
        pm0.v.X(new br1.q(o8Var, str, y08));
    }
}
