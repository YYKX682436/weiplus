package w82;

/* loaded from: classes11.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f525463a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f525464b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f525465c;

    public t0(java.util.ArrayList types, java.util.ArrayList tags, java.util.ArrayList keys) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tags, "tags");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys, "keys");
        this.f525463a = types;
        this.f525464b = tags;
        this.f525465c = keys;
    }

    /* renamed from: equals */
    public boolean m173336xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w82.t0)) {
            return false;
        }
        w82.t0 t0Var = (w82.t0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f525463a, t0Var.f525463a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f525464b, t0Var.f525464b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f525465c, t0Var.f525465c);
    }

    /* renamed from: hashCode */
    public int m173337x8cdac1b() {
        return (((this.f525463a.hashCode() * 31) + this.f525464b.hashCode()) * 31) + this.f525465c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m173338x9616526c() {
        return "SearchInfo(types=" + this.f525463a + ", tags=" + this.f525464b + ", keys=" + this.f525465c + ')';
    }
}
