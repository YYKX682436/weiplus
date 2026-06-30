package oh5;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f427049a;

    /* renamed from: b, reason: collision with root package name */
    public final long f427050b;

    public p(java.lang.String soName, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(soName, "soName");
        this.f427049a = soName;
        this.f427050b = j17;
    }

    /* renamed from: equals */
    public boolean m151412xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh5.p)) {
            return false;
        }
        oh5.p pVar = (oh5.p) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427049a, pVar.f427049a) && this.f427050b == pVar.f427050b;
    }

    /* renamed from: hashCode */
    public int m151413x8cdac1b() {
        return (this.f427049a.hashCode() * 31) + java.lang.Long.hashCode(this.f427050b);
    }

    /* renamed from: toString */
    public java.lang.String m151414x9616526c() {
        return "MemoryHookInfo(soName=" + this.f427049a + ", soSize=" + this.f427050b + ')';
    }
}
