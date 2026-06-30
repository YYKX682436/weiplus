package p20;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final p20.j f432940a;

    /* renamed from: b, reason: collision with root package name */
    public final long f432941b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f432942c;

    public a(p20.j cacheRecord, long j17, java.lang.String groupName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheRecord, "cacheRecord");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupName, "groupName");
        this.f432940a = cacheRecord;
        this.f432941b = j17;
        this.f432942c = groupName;
    }

    public final java.lang.String a() {
        return this.f432940a.b();
    }

    /* renamed from: equals */
    public boolean m157771xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p20.a)) {
            return false;
        }
        p20.a aVar = (p20.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f432940a, aVar.f432940a) && this.f432941b == aVar.f432941b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f432942c, aVar.f432942c);
    }

    /* renamed from: hashCode */
    public int m157772x8cdac1b() {
        return (((this.f432940a.hashCode() * 31) + java.lang.Long.hashCode(this.f432941b)) * 31) + this.f432942c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m157773x9616526c() {
        return "PreloadTask(cacheRecord=" + this.f432940a + ", preloadSize=" + this.f432941b + ", groupName=" + this.f432942c + ')';
    }
}
