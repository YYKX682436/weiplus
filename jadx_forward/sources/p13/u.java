package p13;

/* loaded from: classes12.dex */
public class u {

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f432671r = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public int f432673b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f432674c = null;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f432675d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f432676e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f432677f = null;

    /* renamed from: g, reason: collision with root package name */
    public int[] f432678g = null;

    /* renamed from: h, reason: collision with root package name */
    public int[] f432679h = null;

    /* renamed from: i, reason: collision with root package name */
    public int f432680i = Integer.MAX_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public java.util.HashSet f432681j = new java.util.HashSet();

    /* renamed from: k, reason: collision with root package name */
    public java.util.HashSet f432682k = new java.util.HashSet();

    /* renamed from: l, reason: collision with root package name */
    public java.util.Comparator f432683l = null;

    /* renamed from: m, reason: collision with root package name */
    public o13.x f432684m = null;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f432685n = null;

    /* renamed from: o, reason: collision with root package name */
    public int f432686o = -1;

    /* renamed from: p, reason: collision with root package name */
    public boolean f432687p = false;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f432688q = new java.util.ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final int f432672a = f432671r.incrementAndGet();

    public static p13.u b(java.lang.String str, int[] iArr, int[] iArr2, int i17, java.util.HashSet hashSet, java.util.Comparator comparator, o13.x xVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        p13.u uVar = new p13.u();
        uVar.f432674c = str;
        uVar.f432675d = null;
        uVar.f432678g = iArr;
        uVar.f432679h = iArr2;
        uVar.f432680i = i17;
        uVar.f432681j = hashSet;
        uVar.f432683l = comparator;
        uVar.f432684m = xVar;
        uVar.f432685n = n3Var;
        return uVar;
    }

    public p13.u a() {
        p13.u uVar = new p13.u();
        uVar.f432673b = this.f432673b;
        uVar.f432674c = this.f432674c;
        uVar.f432675d = this.f432675d;
        uVar.f432676e = this.f432676e;
        uVar.f432677f = this.f432677f;
        uVar.f432678g = this.f432678g;
        uVar.f432679h = this.f432679h;
        uVar.f432680i = this.f432680i;
        uVar.f432681j = this.f432681j;
        uVar.f432682k = this.f432682k;
        uVar.f432683l = this.f432683l;
        uVar.f432684m = this.f432684m;
        uVar.f432685n = this.f432685n;
        uVar.f432686o = this.f432686o;
        uVar.f432687p = this.f432687p;
        return uVar;
    }

    /* renamed from: equals */
    public boolean m157689xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f432672a == ((p13.u) obj).f432672a;
    }

    /* renamed from: toString */
    public java.lang.String m157690x9616526c() {
        return java.lang.String.format("{id: %d, query: %s}", java.lang.Integer.valueOf(this.f432672a), this.f432674c);
    }
}
