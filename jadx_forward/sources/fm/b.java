package fm;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f345495a;

    /* renamed from: b, reason: collision with root package name */
    public final int f345496b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f345497c;

    public b(boolean z17, int i17, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        this.f345495a = z17;
        this.f345496b = i17;
        this.f345497c = errMsg;
    }

    /* renamed from: equals */
    public boolean m129687xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm.b)) {
            return false;
        }
        fm.b bVar = (fm.b) obj;
        return this.f345495a == bVar.f345495a && this.f345496b == bVar.f345496b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f345497c, bVar.f345497c);
    }

    /* renamed from: hashCode */
    public int m129688x8cdac1b() {
        return (((java.lang.Boolean.hashCode(this.f345495a) * 31) + java.lang.Integer.hashCode(this.f345496b)) * 31) + this.f345497c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m129689x9616526c() {
        return "ResLoadResult(isSuccess=" + this.f345495a + ", errCode=" + this.f345496b + ", errMsg=" + this.f345497c + ')';
    }
}
