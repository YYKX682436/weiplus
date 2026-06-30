package u26;

/* loaded from: classes14.dex */
public final class c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final u26.b0 f505673b = new u26.b0();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f505674a;

    public static final java.lang.Throwable a(java.lang.Object obj) {
        u26.a0 a0Var = obj instanceof u26.a0 ? (u26.a0) obj : null;
        if (a0Var != null) {
            return a0Var.f505668a;
        }
        return null;
    }

    public static final java.lang.Object b(java.lang.Object obj) {
        if (obj instanceof u26.b0) {
            return null;
        }
        return obj;
    }

    public static java.lang.String c(java.lang.Object obj) {
        if (obj instanceof u26.a0) {
            return ((u26.a0) obj).mo167471x9616526c();
        }
        return "Value(" + obj + ')';
    }

    /* renamed from: equals */
    public boolean m167473xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof u26.c0) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f505674a, ((u26.c0) obj).f505674a);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m167474x8cdac1b() {
        java.lang.Object obj = this.f505674a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m167475x9616526c() {
        return c(this.f505674a);
    }
}
