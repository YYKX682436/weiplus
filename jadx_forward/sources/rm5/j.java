package rm5;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: v, reason: collision with root package name */
    public static final rm5.i f479031v = new rm5.i(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f479032a;

    /* renamed from: b, reason: collision with root package name */
    public final int f479033b;

    /* renamed from: c, reason: collision with root package name */
    public long f479034c;

    /* renamed from: d, reason: collision with root package name */
    public long f479035d;

    /* renamed from: e, reason: collision with root package name */
    public long f479036e;

    /* renamed from: f, reason: collision with root package name */
    public long f479037f;

    /* renamed from: g, reason: collision with root package name */
    public long f479038g;

    /* renamed from: h, reason: collision with root package name */
    public float f479039h;

    /* renamed from: i, reason: collision with root package name */
    public float f479040i;

    /* renamed from: j, reason: collision with root package name */
    public long f479041j;

    /* renamed from: k, reason: collision with root package name */
    public int f479042k;

    /* renamed from: l, reason: collision with root package name */
    public int f479043l;

    /* renamed from: m, reason: collision with root package name */
    public int f479044m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Rect f479045n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Rect f479046o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f479047p;

    /* renamed from: q, reason: collision with root package name */
    public rm5.n f479048q;

    /* renamed from: r, reason: collision with root package name */
    public long f479049r;

    /* renamed from: s, reason: collision with root package name */
    public long f479050s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f479051t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79 f479052u;

    public j(java.lang.String path, int i17) {
        android.graphics.Bitmap bitmap;
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f479032a = path;
        this.f479033b = i17;
        this.f479039h = 1.0f;
        this.f479040i = 1.0f;
        this.f479045n = new android.graphics.Rect();
        this.f479046o = new android.graphics.Rect();
        this.f479047p = true;
        this.f479048q = new rm5.n(null, null, 0L, 7, null);
        this.f479051t = true;
        xm5.b.c("CompositionTrack", "create VCLogCompositionTrack path:" + path + ", type:" + i17 + ", id:" + this.f479034c, new java.lang.Object[0]);
        if (i17 == 1) {
            a();
            synchronized (rm5.l.f479053a) {
                bitmap = (android.graphics.Bitmap) rm5.l.f479056d.get(path);
            }
            if (bitmap != null) {
                this.f479042k = bitmap.getWidth();
                this.f479043l = bitmap.getHeight();
                xm5.b.c("CompositionTrack", "initImageClipInfo sourceWidth:" + this.f479042k + ", sourceHeight:" + this.f479043l, new java.lang.Object[0]);
            }
        } else if (i17 == 2 || i17 == 3) {
            rm5.p d17 = rm5.l.f479053a.d(path);
            if (d17 != null) {
                this.f479042k = d17.f479065a;
                this.f479043l = d17.f479066b;
                xm5.b.c("CompositionTrack", "initVideoClipInfo, sourceWidth:" + this.f479042k + ", sourceHeight:" + this.f479043l, new java.lang.Object[0]);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                xm5.b.c("CompositionTrack", "initVideoClipInfo failed", new java.lang.Object[0]);
            }
        }
        this.f479041j = a().m98723x51e8b0a().m97232x31040141() / 1000;
        e(0L);
        d(this.f479041j);
        b(this.f479038g);
    }

    public final com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7 a() {
        return rm5.l.f479053a.c(this);
    }

    public final void b(long j17) {
        if (j17 >= 0) {
            this.f479036e = j17;
        }
    }

    public final void c(long j17) {
        if (j17 >= 0) {
            this.f479035d = j17;
        }
    }

    public final void d(long j17) {
        if (j17 >= 0) {
            this.f479038g = j17;
        }
    }

    public final void e(long j17) {
        if (j17 >= 0) {
            this.f479037f = j17;
        }
    }

    public final void f(float f17) {
        this.f479040i = f17;
        if (this.f479033b != 2 || this.f479051t) {
            com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79 c25874xcf526e79 = this.f479052u;
            com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25895x5a280429 mo98543xf63bd6b6 = c25874xcf526e79 != null ? c25874xcf526e79.mo98543xf63bd6b6() : null;
            if (mo98543xf63bd6b6 == null) {
                return;
            }
            mo98543xf63bd6b6.m98675x27f73e1c(f17);
        }
    }

    public final void g() {
        b(((float) this.f479035d) + (((float) (this.f479038g - this.f479037f)) / this.f479039h));
    }
}
