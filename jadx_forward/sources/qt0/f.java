package qt0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f448037a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f448038b;

    public f(java.lang.String key, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f448037a = key;
        this.f448038b = z17;
    }

    /* renamed from: equals */
    public boolean m160875xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt0.f)) {
            return false;
        }
        qt0.f fVar = (qt0.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f448037a, fVar.f448037a) && this.f448038b == fVar.f448038b;
    }

    /* renamed from: hashCode */
    public int m160876x8cdac1b() {
        return (this.f448037a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f448038b);
    }

    /* renamed from: toString */
    public java.lang.String m160877x9616526c() {
        return "IndexTaskInfo(key=" + this.f448037a + ", isCreated=" + this.f448038b + ')';
    }
}
