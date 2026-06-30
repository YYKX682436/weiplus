package dj4;

/* loaded from: classes10.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f314542f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f314543g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f314544h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f314545i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, java.lang.String str2, android.widget.ImageView imageView, boolean z17, android.content.Context context, float f17) {
        super(0);
        this.f314540d = str;
        this.f314541e = str2;
        this.f314542f = imageView;
        this.f314543g = z17;
        this.f314544h = context;
        this.f314545i = f17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap b17 = dj4.w.b(this.f314540d);
        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Vi(this.f314541e, b17);
        dj4.u.i(dj4.u.f314582a, this.f314542f, b17, this.f314543g, this.f314544h, this.f314545i, null, 32, null);
        return jz5.f0.f384359a;
    }
}
