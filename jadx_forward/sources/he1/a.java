package he1;

/* loaded from: classes15.dex */
public final class a extends he1.h {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f362389c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f362390d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String issuerID, java.lang.String actionType) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(issuerID, "issuerID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        this.f362389c = issuerID;
        this.f362390d = actionType;
    }

    public final java.lang.String c() {
        java.lang.String str = this.f362390d;
        int hashCode = str.hashCode();
        if (hashCode == -1335458389) {
            return !str.equals("delete") ? "issueCardService" : "deletCardService";
        }
        if (hashCode == -806191449) {
            return !str.equals("recharge") ? "issueCardService" : "rechargeService";
        }
        if (hashCode != 100509913) {
            return "issueCardService";
        }
        str.equals("issue");
        return "issueCardService";
    }

    /* renamed from: equals */
    public boolean m133431xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he1.a)) {
            return false;
        }
        he1.a aVar = (he1.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362389c, aVar.f362389c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362390d, aVar.f362390d);
    }

    /* renamed from: hashCode */
    public int m133432x8cdac1b() {
        return (this.f362389c.hashCode() * 31) + this.f362390d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m133433x9616526c() {
        return "CheckSupport(issuerID=" + this.f362389c + ", actionType=" + this.f362390d + ')';
    }
}
