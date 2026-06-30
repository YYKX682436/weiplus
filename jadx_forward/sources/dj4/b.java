package dj4;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314461e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f314462f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mj4.h f314463g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f314464h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314465i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dj4.a f314466m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, java.lang.String str2, android.widget.ImageView imageView, mj4.h hVar, java.lang.ref.WeakReference weakReference, java.lang.String str3, dj4.a aVar) {
        super(0);
        this.f314460d = str;
        this.f314461e = str2;
        this.f314462f = imageView;
        this.f314463g = hVar;
        this.f314464h = weakReference;
        this.f314465i = str3;
        this.f314466m = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public final java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap b17 = dj4.w.b(this.f314460d);
        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Vi(this.f314461e, b17);
        dj4.u.i(dj4.u.f314582a, this.f314462f, b17, ((mj4.k) this.f314463g).v(), (android.content.Context) this.f314464h.get(), 0.0f, this.f314465i, 16, null);
        dj4.a aVar = this.f314466m;
        if (aVar == null) {
            return null;
        }
        ((dj4.h) aVar).a();
        return jz5.f0.f384359a;
    }
}
