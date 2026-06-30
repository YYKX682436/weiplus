package j0;

/* loaded from: classes14.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2.v f377758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f377759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2.e0 f377760f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f377761g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f377762h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(g2.v vVar, boolean z17, g2.e0 e0Var, k0.y0 y0Var, j0.c5 c5Var) {
        super(3);
        this.f377758d = vVar;
        this.f377759e = z17;
        this.f377760f = e0Var;
        this.f377761g = y0Var;
        this.f377762h = c5Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        g2.v vVar = this.f377758d;
        if (!booleanValue) {
            ((g2.t) vVar).getClass();
        }
        if (!booleanValue) {
            ((g2.t) vVar).getClass();
        }
        boolean z17 = false;
        if (this.f377759e) {
            g2.e0 e0Var = this.f377760f;
            long j17 = e0Var.f349227b;
            int i17 = a2.m1.f82315c;
            if (intValue != ((int) (j17 >> 32)) || intValue2 != a2.m1.c(j17)) {
                int i18 = intValue > intValue2 ? intValue2 : intValue;
                j0.v1 v1Var = j0.v1.None;
                k0.y0 y0Var = this.f377761g;
                if (i18 >= 0) {
                    if ((intValue < intValue2 ? intValue2 : intValue) <= e0Var.f349226a.length()) {
                        if (booleanValue || intValue == intValue2) {
                            j0.c5 c5Var = y0Var.f384511d;
                            if (c5Var != null) {
                                c5Var.f377774i = false;
                            }
                            y0Var.m(v1Var);
                        } else {
                            y0Var.h();
                        }
                        ((j0.a5) this.f377762h.f377780o).mo146xb9724478(new g2.e0(e0Var.f349226a, a2.n1.a(intValue, intValue2), (a2.m1) null, 4, (p3321xbce91901.jvm.p3324x21ffc6bd.i) null));
                        z17 = true;
                    }
                }
                j0.c5 c5Var2 = y0Var.f384511d;
                if (c5Var2 != null) {
                    c5Var2.f377774i = false;
                }
                y0Var.m(v1Var);
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
