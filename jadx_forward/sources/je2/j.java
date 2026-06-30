package je2;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f380770a;

    /* renamed from: b, reason: collision with root package name */
    public r45.wq1 f380771b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f380772c;

    public j(java.lang.String id6, r45.wq1 extInfo, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 jumpInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        this.f380770a = id6;
        this.f380771b = extInfo;
        this.f380772c = jumpInfo;
    }

    public final boolean a() {
        r45.k74 m76504xa819f0c7 = this.f380772c.m76504xa819f0c7();
        return m76504xa819f0c7 != null && m76504xa819f0c7.m75939xb282bd08(11) == 0;
    }

    /* renamed from: equals */
    public boolean m140777xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je2.j)) {
            return false;
        }
        je2.j jVar = (je2.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f380770a, jVar.f380770a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f380771b, jVar.f380771b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f380772c, jVar.f380772c);
    }

    /* renamed from: hashCode */
    public int m140778x8cdac1b() {
        return (((this.f380770a.hashCode() * 31) + this.f380771b.hashCode()) * 31) + this.f380772c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m140779x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id:");
        sb6.append(this.f380770a);
        sb6.append(',');
        sb6.append(pm0.b0.g(this.f380771b));
        sb6.append('\n');
        sb6.append(this.f380772c.m76523x98b23862());
        sb6.append(",position:");
        r45.k74 m76504xa819f0c7 = this.f380772c.m76504xa819f0c7();
        sb6.append(m76504xa819f0c7 != null ? java.lang.Integer.valueOf(m76504xa819f0c7.m75939xb282bd08(11)) : null);
        return sb6.toString();
    }
}
