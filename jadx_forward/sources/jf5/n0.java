package jf5;

/* loaded from: classes11.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final jf5.f0 f381017a;

    /* renamed from: b, reason: collision with root package name */
    public final int f381018b;

    public n0(jf5.f0 content, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f381017a = content;
        this.f381018b = i17;
    }

    /* renamed from: equals */
    public boolean m140854xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf5.n0)) {
            return false;
        }
        jf5.n0 n0Var = (jf5.n0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f381017a, n0Var.f381017a) && this.f381018b == n0Var.f381018b;
    }

    /* renamed from: hashCode */
    public int m140855x8cdac1b() {
        return (this.f381017a.hashCode() * 31) + java.lang.Integer.hashCode(this.f381018b);
    }

    /* renamed from: toString */
    public java.lang.String m140856x9616526c() {
        return "SelectionAnchor(content=" + this.f381017a + ", offset=" + this.f381018b + ')';
    }
}
