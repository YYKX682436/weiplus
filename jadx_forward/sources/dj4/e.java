package dj4;

/* loaded from: classes10.dex */
public final class e implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f314485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314487c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mj4.h f314488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f314490f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f314491g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f314492h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314493i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ dj4.a f314494j;

    public e(long j17, java.lang.String str, java.lang.String str2, mj4.h hVar, java.lang.String str3, android.widget.ImageView imageView, int i17, java.lang.ref.WeakReference weakReference, java.lang.String str4, dj4.a aVar) {
        this.f314485a = j17;
        this.f314486b = str;
        this.f314487c = str2;
        this.f314488d = hVar;
        this.f314489e = str3;
        this.f314490f = imageView;
        this.f314491g = i17;
        this.f314492h = weakReference;
        this.f314493i = str4;
        this.f314494j = aVar;
    }

    @Override // k70.f0
    public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        if (bitmap == null) {
            return;
        }
        dj4.w.a(new dj4.d(this.f314485a, this.f314486b, this.f314487c, this.f314488d, bitmap, this.f314489e, this.f314490f, this.f314491g, this.f314492h, this.f314493i, this.f314494j));
    }
}
