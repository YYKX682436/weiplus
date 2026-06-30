package df2;

/* loaded from: classes3.dex */
public final class gj implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.oj f311756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311757b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311758c;

    public gj(df2.oj ojVar, java.lang.String str, java.lang.String str2) {
        this.f311756a = ojVar;
        this.f311757b = str;
        this.f311758c = str2;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f311756a.f312504m, "invokeLiteApp createStore fail!");
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        df2.oj ojVar = this.f311756a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ojVar.f312504m, "invokeLiteApp createStore success!");
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).rj(ojVar.h7(), this.f311757b, this.f311758c);
    }
}
