package s9;

/* loaded from: classes7.dex */
public final class i implements r9.j {

    /* renamed from: a, reason: collision with root package name */
    public final s9.c f486479a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.j f486480b;

    /* renamed from: c, reason: collision with root package name */
    public final r9.j f486481c;

    /* renamed from: d, reason: collision with root package name */
    public final r9.h f486482d;

    /* renamed from: e, reason: collision with root package name */
    public final s9.g f486483e;

    public i(s9.c cVar, r9.j jVar, r9.j jVar2, r9.h hVar, int i17, s9.g gVar) {
        this.f486479a = cVar;
        this.f486480b = jVar;
        this.f486481c = jVar2;
        this.f486482d = hVar;
        this.f486483e = gVar;
    }

    @Override // r9.j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public s9.h mo10288xb8a7ce81() {
        s9.c cVar = this.f486479a;
        r9.k mo10288xb8a7ce81 = this.f486480b.mo10288xb8a7ce81();
        r9.k mo10288xb8a7ce812 = this.f486481c.mo10288xb8a7ce81();
        r9.h hVar = this.f486482d;
        return new s9.h(cVar, mo10288xb8a7ce81, mo10288xb8a7ce812, hVar != null ? new s9.e(((s9.f) hVar).f486459a, 10485760L, 20480) : null, 2, this.f486483e);
    }
}
