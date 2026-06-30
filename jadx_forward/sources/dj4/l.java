package dj4;

/* loaded from: classes10.dex */
public final class l implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f314533a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314534b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mj4.h f314535c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f314537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f314538f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314539g;

    public l(android.widget.ImageView imageView, java.lang.String str, mj4.h hVar, java.lang.String str2, int i17, android.content.Context context, java.lang.String str3) {
        this.f314533a = imageView;
        this.f314534b = str;
        this.f314535c = hVar;
        this.f314536d = str2;
        this.f314537e = i17;
        this.f314538f = context;
        this.f314539g = str3;
    }

    @Override // k70.f0
    public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        if (bitmap == null) {
            return;
        }
        dj4.w.a(new dj4.k(this.f314533a, this.f314534b, this.f314535c, bitmap, this.f314536d, this.f314537e, this.f314538f, this.f314539g));
    }
}
