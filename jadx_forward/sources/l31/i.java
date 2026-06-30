package l31;

/* loaded from: classes9.dex */
public final class i extends l31.b {

    /* renamed from: e, reason: collision with root package name */
    public final k31.a f396893e;

    /* renamed from: f, reason: collision with root package name */
    public final l31.f f396894f;

    /* renamed from: g, reason: collision with root package name */
    public f31.f f396895g;

    public i(k31.a aVar, l31.f fVar) {
        super("");
        this.f396893e = aVar;
        this.f396894f = fVar;
    }

    @Override // l31.b
    public void a() {
        this.f396849d = true;
        f31.f fVar = this.f396895g;
        if (fVar != null) {
            f31.b.f340802a.b(fVar);
        }
    }

    @Override // l31.u
    public void run() {
        l31.h hVar = new l31.h(this);
        f31.f fVar = new f31.f("", 7);
        fVar.f340810f = hVar;
        this.f396895g = fVar;
        c(fVar);
    }
}
