package x03;

/* loaded from: classes15.dex */
public class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f532621a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f532622b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f532623c;

    /* renamed from: f, reason: collision with root package name */
    public x03.r1 f532626f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.Surface f532627g;

    /* renamed from: h, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry f532628h;

    /* renamed from: j, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 f532630j;

    /* renamed from: k, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result f532631k;

    /* renamed from: d, reason: collision with root package name */
    public boolean f532624d = false;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f532625e = "";

    /* renamed from: i, reason: collision with root package name */
    public final x03.d2 f532629i = new x03.d2();

    /* renamed from: l, reason: collision with root package name */
    public boolean f532632l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f532633m = false;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f532634n = new x03.f1(this);

    public p1(android.content.Context context, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 c28681x6bf9b529, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry surfaceTextureEntry, java.lang.String str, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f532622b = "";
        this.f532623c = "";
        this.f532621a = context;
        this.f532630j = c28681x6bf9b529;
        this.f532628h = surfaceTextureEntry;
        this.f532631k = result;
        this.f532622b = str;
        this.f532623c = str;
        c28681x6bf9b529.m138415x95b45268(new x03.g1(this));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("textureId", java.lang.Long.valueOf(surfaceTextureEntry.id()));
        result.mo65720x90b54003(hashMap);
    }

    public void a() {
        if (this.f532632l) {
            this.f532626f.mo158547x360802();
        }
        this.f532628h.mo138094x41012807();
        this.f532630j.m138415x95b45268(null);
        android.view.Surface surface = this.f532627g;
        if (surface != null && surface.isValid()) {
            this.f532627g.release();
        }
        x03.r1 r1Var = this.f532626f;
        if (r1Var != null) {
            r1Var.mo158543x41012807();
        }
    }

    public java.lang.String b() {
        x03.r1 r1Var = this.f532626f;
        return r1Var != null ? r1Var.mo174785x4edea88a() : "";
    }
}
