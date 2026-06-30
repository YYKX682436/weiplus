package dk2;

/* loaded from: classes3.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.g0 f314836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f314837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314838f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(dk2.g0 g0Var, int i17, java.lang.String str) {
        super(0);
        this.f314836d = g0Var;
        this.f314837e = i17;
        this.f314838f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dk2.g0 g0Var = this.f314836d;
        if (g0Var.f315003c == 5) {
            int i17 = this.f314837e;
            if (i17 > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = g0Var.f315002b;
                if (k0Var != null) {
                    k0Var.m57777x8d7dac5b(dk2.g0.b(g0Var, this.f314838f, i17), false);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = g0Var.f315002b;
                if (k0Var2 != null) {
                    k0Var2.m57777x8d7dac5b(g0Var.f315009i, true);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
