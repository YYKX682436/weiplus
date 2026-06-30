package go2;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f355493a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f355494b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f355495c;

    public d0(boolean z17, java.lang.String failReason, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(failReason, "failReason");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        this.f355493a = z17;
        this.f355494b = failReason;
        this.f355495c = errMsg;
    }

    /* renamed from: equals */
    public boolean m131938xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go2.d0)) {
            return false;
        }
        go2.d0 d0Var = (go2.d0) obj;
        return this.f355493a == d0Var.f355493a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f355494b, d0Var.f355494b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f355495c, d0Var.f355495c);
    }

    /* renamed from: hashCode */
    public int m131939x8cdac1b() {
        return (((java.lang.Boolean.hashCode(this.f355493a) * 31) + this.f355494b.hashCode()) * 31) + this.f355495c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m131940x9616526c() {
        return "PayResult(success=" + this.f355493a + ", failReason=" + this.f355494b + ", errMsg=" + this.f355495c + ')';
    }
}
