package he1;

/* loaded from: classes15.dex */
public final class d extends he1.h {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f362397c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f362398d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String issuerID, java.util.List fields) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(issuerID, "issuerID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fields, "fields");
        this.f362397c = issuerID;
        this.f362398d = fields;
    }

    /* renamed from: equals */
    public boolean m133437xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he1.d)) {
            return false;
        }
        he1.d dVar = (he1.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362397c, dVar.f362397c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362398d, dVar.f362398d);
    }

    /* renamed from: hashCode */
    public int m133438x8cdac1b() {
        return (this.f362397c.hashCode() * 31) + this.f362398d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m133439x9616526c() {
        return "GetCardInfo(issuerID=" + this.f362397c + ", fields=" + this.f362398d + ')';
    }
}
