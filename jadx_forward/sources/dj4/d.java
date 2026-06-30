package dj4;

/* loaded from: classes10.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f314474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314476f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mj4.h f314477g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f314478h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314479i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f314480m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f314481n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f314482o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314483p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ dj4.a f314484q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j17, java.lang.String str, java.lang.String str2, mj4.h hVar, android.graphics.Bitmap bitmap, java.lang.String str3, android.widget.ImageView imageView, int i17, java.lang.ref.WeakReference weakReference, java.lang.String str4, dj4.a aVar) {
        super(0);
        this.f314474d = j17;
        this.f314475e = str;
        this.f314476f = str2;
        this.f314477g = hVar;
        this.f314478h = bitmap;
        this.f314479i = str3;
        this.f314480m = imageView;
        this.f314481n = i17;
        this.f314482o = weakReference;
        this.f314483p = str4;
        this.f314484q = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public final java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleImgUrl update ");
        sb6.append(java.lang.System.currentTimeMillis() - this.f314474d);
        sb6.append(' ');
        sb6.append(this.f314475e);
        sb6.append(' ');
        java.lang.String str = this.f314476f;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusImgHandler", sb6.toString());
        mj4.h hVar = this.f314477g;
        android.widget.ImageView imageView = this.f314480m;
        int i17 = this.f314481n;
        java.lang.ref.WeakReference weakReference = this.f314482o;
        java.lang.String str2 = this.f314483p;
        dj4.a aVar = this.f314484q;
        dj4.w.c(this.f314478h, str);
        android.graphics.Bitmap b17 = dj4.w.b(str);
        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Vi(this.f314479i, b17);
        return java.lang.Boolean.valueOf(imageView.post(new dj4.c(imageView, i17, b17, hVar, weakReference, str2, aVar)));
    }
}
