package lc3;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f399421a;

    /* renamed from: b, reason: collision with root package name */
    public final lc3.b f399422b;

    public c(java.lang.String pathInDataPath, lc3.b debugStrategy) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pathInDataPath, "pathInDataPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(debugStrategy, "debugStrategy");
        this.f399421a = pathInDataPath;
        this.f399422b = debugStrategy;
    }

    /* renamed from: equals */
    public boolean m145564xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc3.c)) {
            return false;
        }
        lc3.c cVar = (lc3.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399421a, cVar.f399421a) && this.f399422b == cVar.f399422b;
    }

    /* renamed from: hashCode */
    public int m145565x8cdac1b() {
        return (this.f399421a.hashCode() * 31) + this.f399422b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m145566x9616526c() {
        return "LocalDebugConfig(pathInDataPath=" + this.f399421a + ", debugStrategy=" + this.f399422b + ')';
    }
}
