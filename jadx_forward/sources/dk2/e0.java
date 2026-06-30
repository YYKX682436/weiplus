package dk2;

/* loaded from: classes3.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.g0 f314868d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(dk2.g0 g0Var) {
        super(0);
        this.f314868d = g0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var;
        dk2.g0 g0Var = this.f314868d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = g0Var.f315002b;
        android.content.Context context = k0Var2 != null ? k0Var2.getContext() : null;
        if (context != null) {
            java.lang.CharSequence b17 = dk2.g0.b(g0Var, g0Var.f315010j, g0Var.f315006f);
            int i17 = g0Var.f315003c;
            if (i17 == 1 || i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var3 = g0Var.f315002b;
                if (k0Var3 != null) {
                    if (b17 == null) {
                        b17 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d5r, java.lang.Integer.valueOf(g0Var.f315006f));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getString(...)");
                    }
                    k0Var3.m57778xb0d3bc2e(b17);
                }
            } else if (i17 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var4 = g0Var.f315002b;
                if (k0Var4 != null) {
                    if (b17 == null) {
                        b17 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d5q, java.lang.Integer.valueOf(g0Var.f315006f));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getString(...)");
                    }
                    k0Var4.m57778xb0d3bc2e(b17);
                }
            } else if (i17 == 5 && (k0Var = g0Var.f315002b) != null) {
                k0Var.m57778xb0d3bc2e(b17);
            }
        }
        return jz5.f0.f384359a;
    }
}
