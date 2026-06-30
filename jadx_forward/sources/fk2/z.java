package fk2;

/* loaded from: classes3.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f345052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f345053e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f345054f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f345055g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f345056h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f345057i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f345058m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ fk2.g0 f345059n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345060o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345061p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context, android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var, int i17, int i18, boolean z17, bm2.h1 h1Var, fk2.g0 g0Var, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f345052d = context;
        this.f345053e = bitmap;
        this.f345054f = f0Var;
        this.f345055g = i17;
        this.f345056h = i18;
        this.f345057i = z17;
        this.f345058m = h1Var;
        this.f345059n = g0Var;
        this.f345060o = str;
        this.f345061p = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(this.f345052d.getResources(), this.f345053e);
        fk2.x xVar = fk2.g0.f344923m;
        jz5.g gVar = fk2.g0.f344924n;
        bitmapDrawable.setBounds(0, 0, ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue(), ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue());
        al5.w wVar = new al5.w(bitmapDrawable, 1);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = this.f345054f;
        int i17 = this.f345055g;
        int i18 = this.f345056h;
        al5.w[] wVarArr = (al5.w[]) f0Var.getSpans(i17, i18, al5.w.class);
        if (wVarArr != null) {
            for (al5.w wVar2 : wVarArr) {
                f0Var.removeSpan(wVar2);
            }
        }
        f0Var.c(wVar, i17, i18, 33);
        if (this.f345057i) {
            f0Var.c(new fk2.y(this.f345059n, this.f345060o, this.f345061p), i17, i18, 33);
        }
        bm2.h1 h1Var = this.f345058m;
        h1Var.f103460e.b(f0Var);
        h1Var.f103460e.invalidate();
        return jz5.f0.f384359a;
    }
}
