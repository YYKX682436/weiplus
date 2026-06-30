package dj4;

/* loaded from: classes10.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f314554f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f314555g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314556h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f314557i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f314558m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f314559n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, java.lang.String str2, android.graphics.Bitmap bitmap, android.widget.ImageView imageView, java.lang.String str3, boolean z17, android.content.Context context, float f17) {
        super(0);
        this.f314552d = str;
        this.f314553e = str2;
        this.f314554f = bitmap;
        this.f314555g = imageView;
        this.f314556h = str3;
        this.f314557i = z17;
        this.f314558m = context;
        this.f314559n = f17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public final java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadByUrl update ");
        java.lang.String str = this.f314552d;
        sb6.append(str);
        sb6.append(" url:");
        java.lang.String str2 = this.f314553e;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusImgHandler", sb6.toString());
        dj4.w.c(this.f314554f, str);
        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Vi(str2, dj4.w.b(str));
        android.widget.ImageView imageView = this.f314555g;
        return java.lang.Boolean.valueOf(imageView.post(new dj4.n(imageView, this.f314556h, this.f314554f, this.f314557i, this.f314558m, this.f314559n)));
    }
}
