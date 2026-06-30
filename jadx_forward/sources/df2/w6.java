package df2;

/* loaded from: classes3.dex */
public final class w6 {

    /* renamed from: a, reason: collision with root package name */
    public final df2.x6 f313200a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 f313201b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f313202c;

    public w6(df2.x6 type, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 gift, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gift, "gift");
        this.f313200a = type;
        this.f313201b = gift;
        this.f313202c = bundle;
    }

    /* renamed from: equals */
    public boolean m124275xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df2.w6)) {
            return false;
        }
        df2.w6 w6Var = (df2.w6) obj;
        return this.f313200a == w6Var.f313200a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f313201b, w6Var.f313201b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f313202c, w6Var.f313202c);
    }

    /* renamed from: hashCode */
    public int m124276x8cdac1b() {
        int hashCode = ((this.f313200a.hashCode() * 31) + this.f313201b.m57187x8cdac1b()) * 31;
        android.os.Bundle bundle = this.f313202c;
        return hashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m124277x9616526c() {
        return " type = " + this.f313200a + ", giftId = " + this.f313201b.f197133r;
    }
}
