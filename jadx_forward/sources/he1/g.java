package he1;

/* loaded from: classes15.dex */
public final class g extends he1.h {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f362407c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f362408d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f362409e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f362410f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f362411g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f362412h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String issuerID, java.lang.String orderNo, java.lang.String sign, java.lang.String timestamp, java.lang.String operation) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(issuerID, "issuerID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(orderNo, "orderNo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sign, "sign");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timestamp, "timestamp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        this.f362407c = issuerID;
        this.f362408d = orderNo;
        this.f362409e = sign;
        this.f362410f = timestamp;
        this.f362411g = operation;
        this.f362412h = true;
    }

    @Override // he1.h
    public java.lang.String a() {
        return "recharge:" + this.f362407c;
    }

    @Override // he1.h
    public boolean b() {
        return this.f362412h;
    }

    /* renamed from: equals */
    public boolean m133443xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he1.g)) {
            return false;
        }
        he1.g gVar = (he1.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362407c, gVar.f362407c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362408d, gVar.f362408d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362409e, gVar.f362409e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362410f, gVar.f362410f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362411g, gVar.f362411g);
    }

    /* renamed from: hashCode */
    public int m133444x8cdac1b() {
        return (((((((this.f362407c.hashCode() * 31) + this.f362408d.hashCode()) * 31) + this.f362409e.hashCode()) * 31) + this.f362410f.hashCode()) * 31) + this.f362411g.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m133445x9616526c() {
        return "Recharge(issuerID=" + this.f362407c + ", orderNo=" + this.f362408d + ", sign=" + this.f362409e + ", timestamp=" + this.f362410f + ", operation=" + this.f362411g + ')';
    }
}
