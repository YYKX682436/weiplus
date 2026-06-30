package p3321xbce91901.jvm.p3324x21ffc6bd;

/* loaded from: classes11.dex */
public final class w implements p3321xbce91901.jvm.p3324x21ffc6bd.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Class f391660d;

    public w(java.lang.Class jClass, java.lang.String moduleName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jClass, "jClass");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        this.f391660d = jClass;
    }

    /* renamed from: equals */
    public boolean m143958xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof p3321xbce91901.jvm.p3324x21ffc6bd.w) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391660d, ((p3321xbce91901.jvm.p3324x21ffc6bd.w) obj).f391660d)) {
                return true;
            }
        }
        return false;
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.f
    public java.lang.Class f() {
        return this.f391660d;
    }

    /* renamed from: hashCode */
    public int m143959x8cdac1b() {
        return this.f391660d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m143960x9616526c() {
        return this.f391660d.toString() + " (Kotlin reflection is not available)";
    }
}
