package pa5;

/* loaded from: classes3.dex */
public final class a implements u3.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pa5.l f434619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f434620b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pa5.k f434621c;

    public a(pa5.l lVar, int i17, pa5.k kVar) {
        this.f434619a = lVar;
        this.f434620b = i17;
        this.f434621c = kVar;
    }

    @Override // u3.p
    public final void a(u3.s sVar, boolean z17, float f17, float f18) {
        int i17 = this.f434620b;
        pa5.l lVar = this.f434619a;
        if (lVar != null) {
            lVar.a(i17, 1.0f);
        }
        pa5.k kVar = this.f434621c;
        if (kVar != null) {
            kVar.a(z17, i17, f18);
        }
    }
}
