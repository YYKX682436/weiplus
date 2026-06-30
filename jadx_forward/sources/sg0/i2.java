package sg0;

/* loaded from: classes8.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final sg0.j2 f489256a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f489257b;

    public i2(sg0.j2 plugins, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugins, "plugins");
        this.f489256a = plugins;
        this.f489257b = context;
    }

    /* renamed from: equals */
    public boolean m164458xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg0.i2)) {
            return false;
        }
        sg0.i2 i2Var = (sg0.i2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f489256a, i2Var.f489256a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f489257b, i2Var.f489257b);
    }

    /* renamed from: hashCode */
    public int m164459x8cdac1b() {
        int m164471x8cdac1b = this.f489256a.m164471x8cdac1b() * 31;
        android.content.Context context = this.f489257b;
        return m164471x8cdac1b + (context == null ? 0 : context.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m164460x9616526c() {
        return "SearchResultFlutterInstance(plugins=" + this.f489256a + ", context=" + this.f489257b + ')';
    }
}
