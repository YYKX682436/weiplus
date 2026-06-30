package vo4;

/* loaded from: classes10.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f520135a;

    /* renamed from: b, reason: collision with root package name */
    public final int f520136b;

    /* renamed from: c, reason: collision with root package name */
    public final int f520137c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0 f520138d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f520139e;

    /* renamed from: f, reason: collision with root package name */
    public int f520140f;

    /* renamed from: g, reason: collision with root package name */
    public int f520141g;

    /* renamed from: h, reason: collision with root package name */
    public int f520142h;

    /* renamed from: i, reason: collision with root package name */
    public int f520143i;

    /* renamed from: j, reason: collision with root package name */
    public int f520144j;

    /* renamed from: k, reason: collision with root package name */
    public int f520145k;

    /* renamed from: l, reason: collision with root package name */
    public int f520146l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f520147m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f520148n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f520149o;

    public b(int i17, int i18, int i19, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0 material, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(material, "material");
        this.f520135a = i17;
        this.f520136b = i18;
        this.f520137c = i19;
        this.f520138d = material;
        this.f520139e = z17;
        this.f520142h = -1;
        this.f520143i = -1;
        this.f520144j = -1;
        this.f520145k = -1;
    }

    public abstract void a(boolean z17);

    public abstract void b(long j17, boolean z17);

    public abstract void c();

    public abstract void d(long j17);

    public abstract void e();

    public abstract void f();

    public /* synthetic */ b(int i17, int i18, int i19, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0 p0Var, boolean z17, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, i18, i19, p0Var, (i27 & 16) != 0 ? true : z17);
    }
}
