package rh2;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f477179a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f477180b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f477181c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f477182d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f477183e;

    public f(java.lang.String engineSoPath, java.lang.String kwsJniSoPath, java.lang.String modelPath) {
        java.lang.String concat;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engineSoPath, "engineSoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kwsJniSoPath, "kwsJniSoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelPath, "modelPath");
        this.f477179a = engineSoPath;
        this.f477180b = kwsJniSoPath;
        this.f477181c = modelPath;
        java.lang.String parent = new java.io.File(modelPath).getParent();
        this.f477182d = (parent == null || (concat = parent.concat("/")) == null) ? "" : concat;
        java.lang.String name = new java.io.File(modelPath).getName();
        this.f477183e = name.length() == 0 ? modelPath : name;
    }

    /* renamed from: equals */
    public boolean m162415xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh2.f)) {
            return false;
        }
        rh2.f fVar = (rh2.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477179a, fVar.f477179a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477180b, fVar.f477180b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477181c, fVar.f477181c);
    }

    /* renamed from: hashCode */
    public int m162416x8cdac1b() {
        return (((this.f477179a.hashCode() * 31) + this.f477180b.hashCode()) * 31) + this.f477181c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m162417x9616526c() {
        return "KWSPaths(engineSoPath=" + this.f477179a + ", kwsJniSoPath=" + this.f477180b + ", modelPath=" + this.f477181c + ')';
    }
}
