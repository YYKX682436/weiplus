package se3;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f488444a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f488445b;

    public b(java.lang.String path, java.lang.String query) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        this.f488444a = path;
        this.f488445b = query;
    }

    /* renamed from: equals */
    public boolean m164352xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se3.b)) {
            return false;
        }
        se3.b bVar = (se3.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f488444a, bVar.f488444a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f488445b, bVar.f488445b);
    }

    /* renamed from: hashCode */
    public int m164353x8cdac1b() {
        return (this.f488444a.hashCode() * 31) + this.f488445b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m164354x9616526c() {
        return "CreateFrameSetRootEvent(path=" + this.f488444a + ", query=" + this.f488445b + ')';
    }
}
