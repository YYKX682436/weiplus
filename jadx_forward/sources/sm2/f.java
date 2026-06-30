package sm2;

/* loaded from: classes3.dex */
public final class f extends bf2.b {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f490981f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 f490982g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f490981f = "FinderLiveAnchorEndUIC";
    }

    @Override // bf2.b
    public void i(fm2.a baseRouter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseRouter, "baseRouter");
        super.i(baseRouter);
        fm2.a aVar = this.f101128c;
        if (aVar != null) {
            android.view.View findViewById = aVar.findViewById(com.p314xaae8f345.mm.R.id.ej_);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3((android.view.ViewGroup) findViewById, aVar);
            this.f490982g = v3Var;
            v3Var.K0(8);
        }
    }

    public final void j() {
        in0.q qVar = this.f101130e;
        if (qVar != null) {
            qVar.F(new sm2.e());
        }
    }
}
