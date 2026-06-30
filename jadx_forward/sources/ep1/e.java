package ep1;

/* loaded from: classes14.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ep1.k f337145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f337146e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f337147f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pv.y f337148g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qn5.a f337149h;

    public e(ep1.k kVar, int i17, android.view.View view, pv.y yVar, qn5.a aVar) {
        this.f337145d = kVar;
        this.f337146e = i17;
        this.f337147f = view;
        this.f337148g = yVar;
        this.f337149h = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ep1.k.b(this.f337145d, this.f337146e, this.f337147f, this.f337148g, this.f337149h);
    }
}
