package js2;

/* loaded from: classes2.dex */
public final class b implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final int f383040d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f383041e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f383042f;

    /* renamed from: g, reason: collision with root package name */
    public final int f383043g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f383044h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f383045i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.a f383046m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f383047n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f383048o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f383049p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f383050q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.l f383051r;

    public b(int i17, java.lang.String wording, boolean z17, int i18, boolean z18, boolean z19, yz5.a aVar, boolean z27, boolean z28, java.lang.String str, java.lang.String str2, yz5.l lVar, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        boolean z29 = (i19 & 16) != 0 ? true : z18;
        boolean z37 = (i19 & 32) != 0 ? false : z19;
        yz5.a aVar2 = (i19 & 64) != 0 ? null : aVar;
        boolean z38 = (i19 & 128) != 0 ? false : z27;
        boolean z39 = (i19 & 256) == 0 ? z28 : false;
        java.lang.String str3 = (i19 & 512) != 0 ? "" : str;
        java.lang.String str4 = (i19 & 1024) == 0 ? str2 : "";
        yz5.l lVar2 = (i19 & 2048) == 0 ? lVar : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        this.f383040d = i17;
        this.f383041e = wording;
        this.f383042f = z17;
        this.f383043g = i18;
        this.f383044h = z29;
        this.f383045i = z37;
        this.f383046m = aVar2;
        this.f383047n = z38;
        this.f383048o = z39;
        this.f383049p = str3;
        this.f383050q = str4;
        this.f383051r = lVar2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return 1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return js2.b.class.hashCode();
    }
}
