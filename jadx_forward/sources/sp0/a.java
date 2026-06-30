package sp0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f492474a;

    public a(java.lang.String apiName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiName, "apiName");
        this.f492474a = apiName;
    }

    /* renamed from: equals */
    public boolean m165015xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sp0.a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492474a, ((sp0.a) obj).f492474a);
    }

    /* renamed from: hashCode */
    public int m165016x8cdac1b() {
        return this.f492474a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m165017x9616526c() {
        return "FlutterCoverViewAttribute(apiName=" + this.f492474a + ')';
    }
}
