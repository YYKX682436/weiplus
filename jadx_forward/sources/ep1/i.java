package ep1;

/* loaded from: classes14.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pv.y f337165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f337166e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f337167f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fp1.b f337168g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ep1.k f337169h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f337170i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f337171m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ qn5.a f337172n;

    public i(pv.y yVar, android.graphics.Point point, android.graphics.Point point2, fp1.b bVar, ep1.k kVar, int i17, android.view.View view, qn5.a aVar) {
        this.f337165d = yVar;
        this.f337166e = point;
        this.f337167f = point2;
        this.f337168g = bVar;
        this.f337169h = kVar;
        this.f337170i = i17;
        this.f337171m = view;
        this.f337172n = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pv.y yVar = this.f337165d;
        yVar.f440042f = this.f337166e;
        yVar.f440041e = this.f337167f;
        fp1.b bVar = this.f337168g;
        yVar.f440048l = bVar != null ? bVar.a() : false;
        ep1.k.b(this.f337169h, this.f337170i, this.f337171m, yVar, this.f337172n);
    }
}
