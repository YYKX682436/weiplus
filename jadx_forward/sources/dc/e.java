package dc;

/* loaded from: classes16.dex */
public class e extends dc.j implements java.lang.Comparable {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f310139h;

    /* renamed from: i, reason: collision with root package name */
    public final long f310140i;

    /* renamed from: m, reason: collision with root package name */
    public long f310141m;

    /* renamed from: n, reason: collision with root package name */
    public dc.f[] f310142n;

    /* renamed from: o, reason: collision with root package name */
    public dc.f[] f310143o;

    /* renamed from: p, reason: collision with root package name */
    public int f310144p;

    /* renamed from: q, reason: collision with root package name */
    public final fc.n f310145q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Set f310146r;

    public e(long j17, dc.o oVar, java.lang.String str, long j18) {
        super(j17, oVar);
        this.f310145q = new fc.n();
        this.f310146r = new java.util.HashSet();
        this.f310139h = str;
        this.f310140i = j18;
    }

    /* renamed from: equals */
    public final boolean m123892xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof dc.e) && compareTo((dc.e) obj) == 0;
    }

    /* renamed from: hashCode */
    public int m123893x8cdac1b() {
        return this.f310139h.hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int compareTo(dc.e eVar) {
        long j17 = eVar.f310164d;
        long j18 = this.f310164d;
        if (j18 == j17) {
            return 0;
        }
        int compareTo = this.f310139h.compareTo(eVar.f310139h);
        return compareTo != 0 ? compareTo : j18 - eVar.f310164d > 0 ? 1 : -1;
    }

    public java.util.Map n() {
        java.util.HashMap hashMap = new java.util.HashMap();
        ((ec.b) h()).f332461d = this.f310140i;
        int f17 = ((ec.b) h()).f() & 65535;
        for (int i17 = 0; i17 < f17; i17++) {
            dc.f fVar = this.f310143o[i17];
            k();
            ((ec.b) h()).c();
            hashMap.put(fVar, l(fVar.f310147a));
        }
        return hashMap;
    }

    public dc.e o() {
        return this.f310166f.f310158i.b(this.f310141m);
    }

    /* renamed from: toString */
    public final java.lang.String m123894x9616526c() {
        return this.f310139h.replace('/', '.');
    }
}
