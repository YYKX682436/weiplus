package ee1;

/* loaded from: classes4.dex */
public final class c extends ee1.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f333107a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f333108b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.util.List validFpanidList, java.util.List validIssuerIdList) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(validFpanidList, "validFpanidList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(validIssuerIdList, "validIssuerIdList");
        this.f333107a = validFpanidList;
        this.f333108b = validIssuerIdList;
    }

    /* renamed from: equals */
    public boolean m127507xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee1.c)) {
            return false;
        }
        ee1.c cVar = (ee1.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f333107a, cVar.f333107a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f333108b, cVar.f333108b);
    }

    /* renamed from: hashCode */
    public int m127508x8cdac1b() {
        return (this.f333107a.hashCode() * 31) + this.f333108b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m127509x9616526c() {
        return "Ok(validFpanidList=" + this.f333107a + ", validIssuerIdList=" + this.f333108b + ')';
    }
}
