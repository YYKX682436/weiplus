package dj4;

/* loaded from: classes10.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314514e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f314515f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mj4.h f314516g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f314517h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314518i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String str, java.lang.String str2, android.widget.ImageView imageView, mj4.h hVar, android.content.Context context, java.lang.String str3) {
        super(0);
        this.f314513d = str;
        this.f314514e = str2;
        this.f314515f = imageView;
        this.f314516g = hVar;
        this.f314517h = context;
        this.f314518i = str3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap b17 = dj4.w.b(this.f314513d);
        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Vi(this.f314514e, b17);
        dj4.u.i(dj4.u.f314582a, this.f314515f, b17, ((mj4.k) this.f314516g).v(), this.f314517h, 0.0f, this.f314518i, 16, null);
        return jz5.f0.f384359a;
    }
}
