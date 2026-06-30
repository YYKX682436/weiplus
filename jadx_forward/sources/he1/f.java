package he1;

/* loaded from: classes15.dex */
public final class f extends he1.h {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f362399c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f362400d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f362401e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f362402f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f362403g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f362404h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f362405i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f362406j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String issuerID, java.lang.String orderNo, java.lang.String sign, java.lang.String timestamp, java.lang.String operation, java.lang.String entrustId, java.lang.String paymentMode) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(issuerID, "issuerID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(orderNo, "orderNo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sign, "sign");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timestamp, "timestamp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entrustId, "entrustId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paymentMode, "paymentMode");
        this.f362399c = issuerID;
        this.f362400d = orderNo;
        this.f362401e = sign;
        this.f362402f = timestamp;
        this.f362403g = operation;
        this.f362404h = entrustId;
        this.f362405i = paymentMode;
        this.f362406j = true;
    }

    @Override // he1.h
    public java.lang.String a() {
        return "issue:" + this.f362399c;
    }

    @Override // he1.h
    public boolean b() {
        return this.f362406j;
    }

    /* renamed from: equals */
    public boolean m133440xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he1.f)) {
            return false;
        }
        he1.f fVar = (he1.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362399c, fVar.f362399c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362400d, fVar.f362400d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362401e, fVar.f362401e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362402f, fVar.f362402f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362403g, fVar.f362403g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362404h, fVar.f362404h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362405i, fVar.f362405i);
    }

    /* renamed from: hashCode */
    public int m133441x8cdac1b() {
        return (((((((((((this.f362399c.hashCode() * 31) + this.f362400d.hashCode()) * 31) + this.f362401e.hashCode()) * 31) + this.f362402f.hashCode()) * 31) + this.f362403g.hashCode()) * 31) + this.f362404h.hashCode()) * 31) + this.f362405i.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m133442x9616526c() {
        return "IssueCard(issuerID=" + this.f362399c + ", orderNo=" + this.f362400d + ", sign=" + this.f362401e + ", timestamp=" + this.f362402f + ", operation=" + this.f362403g + ", entrustId=" + this.f362404h + ", paymentMode=" + this.f362405i + ')';
    }
}
