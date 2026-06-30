package s1;

/* loaded from: classes14.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.k0 f483588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f483589e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(s1.k0 k0Var, yz5.p pVar) {
        super(2);
        this.f483588d = k0Var;
        this.f483589e = pVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        boolean booleanValue = ((java.lang.Boolean) ((n0.q4) this.f483588d.f483556e).mo128745x754a37bb()).booleanValue();
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.W(207, java.lang.Boolean.valueOf(booleanValue));
        boolean f17 = y0Var2.f(booleanValue);
        if (booleanValue) {
            this.f483589e.mo149xb9724478(oVar, 0);
        } else {
            if (!(y0Var2.f415305m == 0)) {
                n0.e1.c("No nodes can be emitted before calling dactivateToEndGroup".toString());
                throw null;
            }
            if (!y0Var2.L) {
                if (f17) {
                    n0.j4 j4Var = y0Var2.E;
                    int i17 = j4Var.f415107f;
                    int i18 = j4Var.f415108g;
                    int i19 = i17;
                    while (i19 < i18) {
                        n0.j4 j4Var2 = y0Var2.E;
                        n0.w wVar = new n0.w(y0Var2, i19);
                        j4Var2.getClass();
                        int j17 = n0.l4.j(j4Var2.f415103b, i19);
                        i19++;
                        n0.k4 k4Var = j4Var2.f415102a;
                        int b17 = i19 < k4Var.f415124e ? n0.l4.b(k4Var.f415123d, i19) : k4Var.f415126g;
                        for (int i27 = j17; i27 < b17; i27++) {
                            wVar.mo149xb9724478(java.lang.Integer.valueOf(i27 - j17), j4Var2.f415105d[i27]);
                        }
                    }
                    n0.e1.a(y0Var2.f415311s, i17, i18);
                    y0Var2.E.l(i17);
                    y0Var2.E.n();
                } else {
                    y0Var2.N();
                }
            }
        }
        if (y0Var2.f415317y && y0Var2.E.f415109h == y0Var2.f415318z) {
            y0Var2.f415318z = -1;
            y0Var2.f415317y = false;
        }
        y0Var2.o(false);
        return jz5.f0.f384359a;
    }
}
