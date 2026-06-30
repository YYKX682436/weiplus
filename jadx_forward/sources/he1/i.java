package he1;

/* loaded from: classes15.dex */
public final class i extends he1.k {

    /* renamed from: a, reason: collision with root package name */
    public final int f362415a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f362416b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i17, java.lang.String errMsg) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        this.f362415a = i17;
        this.f362416b = errMsg;
    }

    /* renamed from: equals */
    public boolean m133446xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he1.i)) {
            return false;
        }
        he1.i iVar = (he1.i) obj;
        return this.f362415a == iVar.f362415a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362416b, iVar.f362416b);
    }

    /* renamed from: hashCode */
    public int m133447x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f362415a) * 31) + this.f362416b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m133448x9616526c() {
        return "Failure(errCode=" + this.f362415a + ", errMsg=" + this.f362416b + ')';
    }
}
