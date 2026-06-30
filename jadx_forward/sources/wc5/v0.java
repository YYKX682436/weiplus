package wc5;

/* loaded from: classes10.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final uc5.k0 f526178a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f526179b;

    public v0(uc5.k0 k0Var, java.util.List contents) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contents, "contents");
        this.f526178a = k0Var;
        this.f526179b = contents;
    }

    /* renamed from: equals */
    public boolean m173462xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc5.v0)) {
            return false;
        }
        wc5.v0 v0Var = (wc5.v0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526178a, v0Var.f526178a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526179b, v0Var.f526179b);
    }

    /* renamed from: hashCode */
    public int m173463x8cdac1b() {
        uc5.k0 k0Var = this.f526178a;
        return ((k0Var == null ? 0 : k0Var.mo148315x8cdac1b()) * 31) + this.f526179b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m173464x9616526c() {
        return "Section(timeline=" + this.f526178a + ", contents=" + this.f526179b + ')';
    }
}
