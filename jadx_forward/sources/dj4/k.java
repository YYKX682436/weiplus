package dj4;

/* loaded from: classes10.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f314525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mj4.h f314527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f314528g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314529h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f314530i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f314531m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314532n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.widget.ImageView imageView, java.lang.String str, mj4.h hVar, android.graphics.Bitmap bitmap, java.lang.String str2, int i17, android.content.Context context, java.lang.String str3) {
        super(0);
        this.f314525d = imageView;
        this.f314526e = str;
        this.f314527f = hVar;
        this.f314528g = bitmap;
        this.f314529h = str2;
        this.f314530i = i17;
        this.f314531m = context;
        this.f314532n = str3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.ImageView imageView = this.f314525d;
        imageView.post(new dj4.j(imageView, this.f314530i, this.f314528g, this.f314527f, this.f314531m, this.f314532n));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleImgOnlyByUrl update ");
        java.lang.String str = this.f314526e;
        sb6.append(str);
        sb6.append(' ');
        sb6.append(((mj4.k) this.f314527f).l());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusImgHandler", sb6.toString());
        dj4.w.c(this.f314528g, str);
        android.graphics.Bitmap b17 = dj4.w.b(str);
        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Vi(this.f314529h, b17);
        return jz5.f0.f384359a;
    }
}
