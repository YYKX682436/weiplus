package l31;

/* loaded from: classes9.dex */
public final class y extends l31.b {

    /* renamed from: e, reason: collision with root package name */
    public final k31.a f396935e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f396936f;

    /* renamed from: g, reason: collision with root package name */
    public final l31.v f396937g;

    /* renamed from: h, reason: collision with root package name */
    public f31.f f396938h;

    public y(k31.a aVar, boolean z17, l31.v vVar) {
        super("");
        this.f396935e = aVar;
        this.f396936f = z17;
        this.f396937g = vVar;
    }

    @Override // l31.b
    public void a() {
        this.f396849d = true;
        f31.f fVar = this.f396938h;
        if (fVar != null) {
            f31.b.f340802a.b(fVar);
        }
    }

    @Override // l31.u
    public void run() {
        l31.x xVar = new l31.x(this);
        f31.f fVar = new f31.f("", 8, this.f396936f);
        fVar.f340810f = xVar;
        this.f396938h = fVar;
        c(fVar);
    }
}
