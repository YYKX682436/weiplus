package at0;

/* loaded from: classes10.dex */
public final class r extends ms0.c {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f95159t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f95160u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i17, int i18, int i19) {
        super(0, 0, 0, 0, i17, i18, 15, null);
        this.f95159t = i17;
        this.f95160u = i19;
    }

    @Override // ms0.c
    public os0.a f() {
        return ts0.d.f503083a.a() ? new os0.e(this.f412478a, this.f412479b, this.f412480c, this.f412481d, this.f95159t, this.f412483f) : new os0.c(this.f412478a, this.f412479b, this.f412480c, this.f412481d, this.f95159t, this.f412483f);
    }

    @Override // ms0.c
    public is0.c g() {
        if (this.f95160u != 1) {
            return this.f412487j;
        }
        os0.a aVar = this.f412484g;
        if (aVar != null) {
            return aVar.f429533i;
        }
        return null;
    }
}
