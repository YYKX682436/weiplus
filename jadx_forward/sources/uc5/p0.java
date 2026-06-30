package uc5;

/* loaded from: classes8.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f508073a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f508074b;

    public p0(java.lang.String key, java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f508073a = key;
        this.f508074b = text;
    }

    /* renamed from: equals */
    public boolean m167845xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc5.p0)) {
            return false;
        }
        uc5.p0 p0Var = (uc5.p0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f508073a, p0Var.f508073a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f508074b, p0Var.f508074b);
    }

    /* renamed from: hashCode */
    public int m167846x8cdac1b() {
        return (this.f508073a.hashCode() * 31) + this.f508074b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m167847x9616526c() {
        return "Section(key=" + this.f508073a + ", text=" + this.f508074b + ')';
    }
}
