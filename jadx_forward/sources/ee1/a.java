package ee1;

/* loaded from: classes4.dex */
public final class a extends ee1.e {

    /* renamed from: a, reason: collision with root package name */
    public final int f333102a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f333103b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, java.lang.String retMsg) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(retMsg, "retMsg");
        this.f333102a = i17;
        this.f333103b = retMsg;
    }

    /* renamed from: equals */
    public boolean m127501xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee1.a)) {
            return false;
        }
        ee1.a aVar = (ee1.a) obj;
        return this.f333102a == aVar.f333102a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f333103b, aVar.f333103b);
    }

    /* renamed from: hashCode */
    public int m127502x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f333102a) * 31) + this.f333103b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m127503x9616526c() {
        return "BizError(retCode=" + this.f333102a + ", retMsg=" + this.f333103b + ')';
    }
}
