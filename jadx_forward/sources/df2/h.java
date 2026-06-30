package df2;

/* loaded from: classes3.dex */
public final class h implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.k f311798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311800c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311801d;

    public h(df2.k kVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f311798a = kVar;
        this.f311799b = str;
        this.f311800c = str2;
        this.f311801d = str3;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f311798a.f312055m, "invokeLiteApp createStore fail!");
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311798a.f312055m, "invokeLiteApp createStore success!");
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).rj(this.f311799b, this.f311800c, this.f311801d);
    }
}
