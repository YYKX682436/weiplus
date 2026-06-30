package rv0;

/* loaded from: classes5.dex */
public final class a2 implements com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uv0.u f481451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uv0.w f481453c;

    public a2(uv0.u uVar, rv0.n1 n1Var, uv0.w wVar) {
        this.f481451a = uVar;
        this.f481452b = n1Var;
        this.f481453c = wVar;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.o
    /* renamed from: onResult */
    public void mo47094x57429edc(java.lang.Object result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        uv0.u uVar = this.f481451a;
        boolean m160994x67ad68cc = uVar.m160994x67ad68cc();
        rv0.n1 n1Var = this.f481452b;
        if (m160994x67ad68cc && uVar.m160992x59adcaf2()) {
            gx0.kh q76 = n1Var.q7();
            java.lang.String string = uVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lm6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            q76.r7(string, null);
        }
        n1Var.m7().f96015d.mo522xb5bdeb7a(this.f481453c);
    }
}
