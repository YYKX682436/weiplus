package sg2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f489414a;

    public a(java.lang.String str) {
        this.f489414a = str;
    }

    /* renamed from: equals */
    public boolean m164533xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sg2.a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f489414a, ((sg2.a) obj).f489414a);
    }

    /* renamed from: hashCode */
    public int m164534x8cdac1b() {
        java.lang.String str = this.f489414a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m164535x9616526c() {
        return "AnchorFileStatus(d_lua=" + this.f489414a + ')';
    }
}
