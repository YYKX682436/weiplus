package he1;

/* loaded from: classes15.dex */
public final class b extends he1.h {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f362391c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f362392d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f362393e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f362394f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f362395g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f362396h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String issuerID, java.lang.String orderNo, java.lang.String sign, java.lang.String timestamp, java.lang.String refundAccountNumber) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(issuerID, "issuerID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(orderNo, "orderNo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sign, "sign");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timestamp, "timestamp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refundAccountNumber, "refundAccountNumber");
        this.f362391c = issuerID;
        this.f362392d = orderNo;
        this.f362393e = sign;
        this.f362394f = timestamp;
        this.f362395g = refundAccountNumber;
        this.f362396h = true;
    }

    @Override // he1.h
    public java.lang.String a() {
        return com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55714x23574fe5 + this.f362391c;
    }

    @Override // he1.h
    public boolean b() {
        return this.f362396h;
    }

    /* renamed from: equals */
    public boolean m133434xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he1.b)) {
            return false;
        }
        he1.b bVar = (he1.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362391c, bVar.f362391c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362392d, bVar.f362392d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362393e, bVar.f362393e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362394f, bVar.f362394f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362395g, bVar.f362395g);
    }

    /* renamed from: hashCode */
    public int m133435x8cdac1b() {
        return (((((((this.f362391c.hashCode() * 31) + this.f362392d.hashCode()) * 31) + this.f362393e.hashCode()) * 31) + this.f362394f.hashCode()) * 31) + this.f362395g.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m133436x9616526c() {
        return "DeleteCard(issuerID=" + this.f362391c + ", orderNo=" + this.f362392d + ", sign=" + this.f362393e + ", timestamp=" + this.f362394f + ", refundAccountNumber=" + this.f362395g + ')';
    }
}
