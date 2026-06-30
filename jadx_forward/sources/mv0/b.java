package mv0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.c f413063a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f413064b;

    public b(com.p314xaae8f345.p457x3304c6.p479x4179489f.c type, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f413063a = type;
        this.f413064b = z17;
    }

    /* renamed from: equals */
    public boolean m148443xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv0.b)) {
            return false;
        }
        mv0.b bVar = (mv0.b) obj;
        return this.f413063a == bVar.f413063a && this.f413064b == bVar.f413064b;
    }

    /* renamed from: hashCode */
    public int m148444x8cdac1b() {
        return (this.f413063a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f413064b);
    }

    /* renamed from: toString */
    public java.lang.String m148445x9616526c() {
        return "CanvasAspectRatioType(type=" + this.f413063a + ", isOriginal=" + this.f413064b + ')';
    }
}
