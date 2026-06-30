package ze;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze.g f553255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f553256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f553257f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f553258g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f553259h;

    public e(ze.g gVar, boolean z17, boolean z18, java.lang.String str, boolean z19) {
        this.f553255d = gVar;
        this.f553256e = z17;
        this.f553257f = z18;
        this.f553258g = str;
        this.f553259h = z19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f553255d.m178755xe0e57a67(this.f553256e, this.f553257f, this.f553258g, this.f553259h);
    }
}
