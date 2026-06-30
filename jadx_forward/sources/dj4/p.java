package dj4;

/* loaded from: classes10.dex */
public final class p implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314561b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f314562c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f314564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f314565f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f314566g;

    public p(java.lang.String str, java.lang.String str2, android.widget.ImageView imageView, java.lang.String str3, boolean z17, android.content.Context context, float f17) {
        this.f314560a = str;
        this.f314561b = str2;
        this.f314562c = imageView;
        this.f314563d = str3;
        this.f314564e = z17;
        this.f314565f = context;
        this.f314566g = f17;
    }

    @Override // k70.f0
    public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        if (bitmap == null) {
            return;
        }
        dj4.w.a(new dj4.o(this.f314560a, this.f314561b, bitmap, this.f314562c, this.f314563d, this.f314564e, this.f314565f, this.f314566g));
    }
}
