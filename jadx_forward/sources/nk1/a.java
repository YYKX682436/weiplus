package nk1;

/* loaded from: classes7.dex */
public final class a implements r9.k {

    /* renamed from: a, reason: collision with root package name */
    public final nk1.c f419479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r9.q f419480b;

    public a(android.content.Context context, r9.k0 k0Var, nk1.c baseDataSource, r9.q realDataSource, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        realDataSource = (i17 & 8) != 0 ? new r9.q(context, k0Var, baseDataSource) : realDataSource;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseDataSource, "baseDataSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(realDataSource, "realDataSource");
        this.f419479a = baseDataSource;
        this.f419480b = realDataSource;
    }

    @Override // r9.k
    public int a(byte[] bArr, int i17, int i18) {
        return this.f419480b.a(bArr, i17, i18);
    }

    @Override // r9.k
    public long b(r9.n nVar) {
        return this.f419480b.b(nVar);
    }

    @Override // r9.k
    /* renamed from: close */
    public void mo10286x5a5ddf8() {
        this.f419480b.mo10286x5a5ddf8();
    }

    @Override // r9.k
    /* renamed from: getUri */
    public android.net.Uri mo10287xb5887636() {
        return this.f419480b.mo10287xb5887636();
    }
}
