package z61;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final z61.b f551857a;

    /* renamed from: b, reason: collision with root package name */
    public final int f551858b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f551859c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f551860d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f551861e;

    public c(z61.b type, int i17, java.lang.String customInfo, java.lang.String ticket, java.lang.String policyList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customInfo, "customInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ticket, "ticket");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(policyList, "policyList");
        this.f551857a = type;
        this.f551858b = i17;
        this.f551859c = customInfo;
        this.f551860d = ticket;
        this.f551861e = policyList;
    }

    /* renamed from: equals */
    public boolean m178449xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z61.c)) {
            return false;
        }
        z61.c cVar = (z61.c) obj;
        return this.f551857a == cVar.f551857a && this.f551858b == cVar.f551858b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f551859c, cVar.f551859c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f551860d, cVar.f551860d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f551861e, cVar.f551861e);
    }

    /* renamed from: hashCode */
    public int m178450x8cdac1b() {
        return (((((((this.f551857a.hashCode() * 31) + java.lang.Integer.hashCode(this.f551858b)) * 31) + this.f551859c.hashCode()) * 31) + this.f551860d.hashCode()) * 31) + this.f551861e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m178451x9616526c() {
        return "AccountPolicyAgreeEventObj(type=" + this.f551857a + ", isAgree=" + this.f551858b + ", customInfo=" + this.f551859c + ", ticket=" + this.f551860d + ", policyList=" + this.f551861e + ')';
    }
}
