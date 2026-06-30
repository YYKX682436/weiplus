package ss4;

/* loaded from: classes8.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f493649a;

    /* renamed from: b, reason: collision with root package name */
    public final int f493650b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f493651c;

    /* renamed from: d, reason: collision with root package name */
    public final int f493652d;

    public o0(java.lang.String oldUri, int i17, java.lang.String newUri, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldUri, "oldUri");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newUri, "newUri");
        this.f493649a = oldUri;
        this.f493650b = i17;
        this.f493651c = newUri;
        this.f493652d = i18;
    }

    /* renamed from: equals */
    public boolean m165181xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss4.o0)) {
            return false;
        }
        ss4.o0 o0Var = (ss4.o0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f493649a, o0Var.f493649a) && this.f493650b == o0Var.f493650b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f493651c, o0Var.f493651c) && this.f493652d == o0Var.f493652d;
    }

    /* renamed from: hashCode */
    public int m165182x8cdac1b() {
        return (((((this.f493649a.hashCode() * 31) + java.lang.Integer.hashCode(this.f493650b)) * 31) + this.f493651c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f493652d);
    }

    /* renamed from: toString */
    public java.lang.String m165183x9616526c() {
        return "RouteEntry(oldUri=" + this.f493649a + ", oldFuncId=" + this.f493650b + ", newUri=" + this.f493651c + ", newFuncId=" + this.f493652d + ')';
    }
}
