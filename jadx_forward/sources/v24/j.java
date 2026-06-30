package v24;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f514461a;

    /* renamed from: b, reason: collision with root package name */
    public long f514462b;

    /* renamed from: c, reason: collision with root package name */
    public int f514463c;

    /* renamed from: d, reason: collision with root package name */
    public int f514464d;

    public j(java.lang.String path, long j17, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i19 & 2) != 0 ? 0L : j17;
        i17 = (i19 & 4) != 0 ? 0 : i17;
        i18 = (i19 & 8) != 0 ? 0 : i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f514461a = path;
        this.f514462b = j17;
        this.f514463c = i17;
        this.f514464d = i18;
    }

    /* renamed from: equals */
    public boolean m171012xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v24.j)) {
            return false;
        }
        v24.j jVar = (v24.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f514461a, jVar.f514461a) && this.f514462b == jVar.f514462b && this.f514463c == jVar.f514463c && this.f514464d == jVar.f514464d;
    }

    /* renamed from: hashCode */
    public int m171013x8cdac1b() {
        return (((((this.f514461a.hashCode() * 31) + java.lang.Long.hashCode(this.f514462b)) * 31) + java.lang.Integer.hashCode(this.f514463c)) * 31) + java.lang.Integer.hashCode(this.f514464d);
    }

    /* renamed from: toString */
    public java.lang.String m171014x9616526c() {
        return "DirEnt(path=" + this.f514461a + ", diskSpace=" + this.f514462b + ", fileCount=" + this.f514463c + ", dirCount=" + this.f514464d + ')';
    }
}
