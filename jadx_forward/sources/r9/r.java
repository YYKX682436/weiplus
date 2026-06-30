package r9;

/* loaded from: classes7.dex */
public final class r implements r9.j {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f474946a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.k0 f474947b;

    /* renamed from: c, reason: collision with root package name */
    public final r9.j f474948c;

    public r(android.content.Context context, r9.k0 k0Var, r9.j jVar) {
        this.f474946a = context.getApplicationContext();
        this.f474947b = k0Var;
        this.f474948c = jVar;
    }

    @Override // r9.j
    /* renamed from: createDataSource */
    public r9.k mo10288xb8a7ce81() {
        return new r9.q(this.f474946a, this.f474947b, this.f474948c.mo10288xb8a7ce81());
    }
}
