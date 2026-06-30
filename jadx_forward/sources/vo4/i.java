package vo4;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f520163a;

    /* renamed from: b, reason: collision with root package name */
    public final int f520164b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f520165c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f520166d;

    /* renamed from: e, reason: collision with root package name */
    public final vo4.r f520167e;

    /* renamed from: f, reason: collision with root package name */
    public os0.b f520168f;

    /* renamed from: g, reason: collision with root package name */
    public vo4.t f520169g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f520170h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f520171i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.l f520172j;

    /* renamed from: k, reason: collision with root package name */
    public final float f520173k;

    /* renamed from: l, reason: collision with root package name */
    public final float f520174l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f520175m;

    /* renamed from: n, reason: collision with root package name */
    public long f520176n;

    /* renamed from: o, reason: collision with root package name */
    public int f520177o;

    /* renamed from: p, reason: collision with root package name */
    public final int f520178p;

    /* renamed from: q, reason: collision with root package name */
    public final int f520179q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Rect f520180r;

    public i(int i17, int i18, boolean z17, boolean z18) {
        this.f520163a = i17;
        this.f520164b = i18;
        this.f520165c = z17;
        this.f520166d = z18;
        this.f520167e = new vo4.r(z18);
        this.f520173k = 1.0f;
        this.f520174l = 1.0f;
        this.f520176n = -1L;
    }

    public static void a(vo4.i iVar, android.graphics.Bitmap bitmap, boolean z17, yz5.a aVar, int i17, java.lang.Object obj) {
        vo4.t tVar;
        android.graphics.Bitmap bitmap2 = (i17 & 1) != 0 ? null : bitmap;
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        boolean z18 = z17;
        yz5.a aVar2 = (i17 & 4) != 0 ? null : aVar;
        if (iVar.f520175m && (tVar = iVar.f520169g) != null) {
            tVar.b(new vo4.c(iVar, tVar, bitmap2, z18, aVar2));
        }
    }

    public final void b(android.graphics.Rect rect) {
        if (rect != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogDirector", "setCropRect:" + rect + ", width:" + this.f520163a + ", height:" + this.f520164b + ", textureWidth:" + this.f520178p + ", textureHeight:" + this.f520179q);
            android.graphics.Rect rect2 = new android.graphics.Rect(rect);
            this.f520180r = rect2;
            os0.b bVar = this.f520168f;
            if (bVar != null) {
                bVar.f429541q = rect2;
            }
        }
    }

    public final void c(int i17, int i18) {
        vo4.r rVar = this.f520167e;
        rVar.getClass();
        rVar.f520211g = 1000 / i17;
        rVar.f520212h = 1000 / i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogScriptReader", "videoPtsStep :" + rVar.f520211g + " imagePtsStep:" + rVar.f520212h);
    }

    public final void d(vo4.t vLogSurface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vLogSurface, "vLogSurface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogDirector", hashCode() + " setSurface");
        this.f520169g = vLogSurface;
        vLogSurface.b(new vo4.h(this, vLogSurface));
    }

    public i(int i17, int i18, int i19, int i27, float f17, float f18, boolean z17, boolean z18) {
        this(i17, i18, z17, z18);
        this.f520173k = f17;
        this.f520174l = f18;
        this.f520178p = i19;
        this.f520179q = i27;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogDirector", "create VLogDirector, scale:[" + f17 + ", " + f18 + "], texture:[" + i19 + ", " + i27 + ']');
    }
}
