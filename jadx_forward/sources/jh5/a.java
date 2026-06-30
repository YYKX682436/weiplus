package jh5;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final jh5.a f381394e = new jh5.a("", 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f381395a;

    /* renamed from: b, reason: collision with root package name */
    public final long f381396b;

    /* renamed from: c, reason: collision with root package name */
    public final long f381397c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f381398d;

    public a(java.lang.String keyword, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
        this.f381395a = keyword;
        this.f381396b = j17;
        this.f381397c = j18;
        this.f381398d = z17;
    }

    public final java.lang.String a() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("keyword", this.f381395a);
        hashMap.put("messageLocalId", java.lang.Long.valueOf(this.f381396b));
        hashMap.put("randomSeed", java.lang.Long.valueOf(this.f381397c));
        hashMap.put("resume", java.lang.Boolean.valueOf(this.f381398d));
        java.lang.String gVar = new cl0.g(hashMap).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
        return gVar;
    }

    /* renamed from: equals */
    public boolean m140975xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh5.a)) {
            return false;
        }
        jh5.a aVar = (jh5.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f381395a, aVar.f381395a) && this.f381396b == aVar.f381396b && this.f381397c == aVar.f381397c && this.f381398d == aVar.f381398d;
    }

    /* renamed from: hashCode */
    public int m140976x8cdac1b() {
        return (((((this.f381395a.hashCode() * 31) + java.lang.Long.hashCode(this.f381396b)) * 31) + java.lang.Long.hashCode(this.f381397c)) * 31) + java.lang.Boolean.hashCode(this.f381398d);
    }

    /* renamed from: toString */
    public java.lang.String m140977x9616526c() {
        return "MagicEmojiEggExtData(keyword=" + this.f381395a + ", messageLocalId=" + this.f381396b + ", randomSeed=" + this.f381397c + ", resume=" + this.f381398d + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String keyword, long j17, long j18) {
        this(keyword, j17, j18, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
    }
}
