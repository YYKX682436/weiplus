package lf4;

/* loaded from: classes4.dex */
public final class q implements p012xc85e97e9.p103xe821e364.p104xd1075a44.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lf4.b0 f399992a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f399993b;

    public q(lf4.b0 b0Var, int i17) {
        this.f399992a = b0Var;
        this.f399993b = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        lf4.b0 b0Var = this.f399992a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f399891h, "onChanged: " + i17 + ' ' + i18);
        ((sf4.a1) b0Var.f399888e).e(this.f399993b, i17, i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void b(int i17, int i18) {
        lf4.b0 b0Var = this.f399992a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f399891h, "onInserted: " + i17 + ' ' + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = ((sf4.a1) b0Var.f399888e).f488944a;
        int i19 = c18497x85806502.f253635u;
        int i27 = this.f399993b;
        if (i19 != i27) {
            c18497x85806502.f253640y.post(new sf4.x0(c18497x85806502, i27));
        } else {
            pf4.x xVar = c18497x85806502.f253632r;
            if (xVar != null) {
                xVar.m8153xd399a4d9(i17, i18);
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void c(int i17, int i18) {
        lf4.b0 b0Var = this.f399992a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f399891h, "onRemoved: " + i17 + ' ' + i18);
        ((sf4.a1) b0Var.f399888e).f(this.f399993b, i17, i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void d(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f399992a.f399891h, "onMoved: " + i17 + ' ' + i18);
    }
}
