package d82;

/* loaded from: classes11.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f308463a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f308464b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f308465c;

    /* renamed from: d, reason: collision with root package name */
    public d82.f f308466d;

    public g(java.lang.String dataId, java.lang.String originalPath, java.lang.String compressedPath, d82.f state, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        state = (i17 & 8) != 0 ? d82.f.f308459d : state;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataId, "dataId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originalPath, "originalPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compressedPath, "compressedPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        this.f308463a = dataId;
        this.f308464b = originalPath;
        this.f308465c = compressedPath;
        this.f308466d = state;
    }

    /* renamed from: equals */
    public boolean m123659xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d82.g)) {
            return false;
        }
        d82.g gVar = (d82.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f308463a, gVar.f308463a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f308464b, gVar.f308464b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f308465c, gVar.f308465c) && this.f308466d == gVar.f308466d;
    }

    /* renamed from: hashCode */
    public int m123660x8cdac1b() {
        return (((((this.f308463a.hashCode() * 31) + this.f308464b.hashCode()) * 31) + this.f308465c.hashCode()) * 31) + this.f308466d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m123661x9616526c() {
        return "CompressTaskInfo(dataId=" + this.f308463a + ", originalPath=" + this.f308464b + ", compressedPath=" + this.f308465c + ", state=" + this.f308466d + ')';
    }
}
