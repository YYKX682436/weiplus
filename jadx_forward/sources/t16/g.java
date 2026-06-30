package t16;

/* loaded from: classes15.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f496146a;

    public g(java.lang.Object obj) {
        this.f496146a = obj;
    }

    public abstract f26.o0 a(o06.v0 v0Var);

    public java.lang.Object b() {
        return this.f496146a;
    }

    /* renamed from: equals */
    public boolean m165629xb2c87fbf(java.lang.Object obj) {
        if (this != obj) {
            java.lang.Object b17 = b();
            t16.g gVar = obj instanceof t16.g ? (t16.g) obj : null;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, gVar != null ? gVar.b() : null)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m165630x8cdac1b() {
        java.lang.Object b17 = b();
        if (b17 != null) {
            return b17.hashCode();
        }
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String mo165625x9616526c() {
        return java.lang.String.valueOf(b());
    }
}
