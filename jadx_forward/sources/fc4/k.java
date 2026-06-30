package fc4;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f342710a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f342711b;

    /* renamed from: c, reason: collision with root package name */
    public final long f342712c;

    public k(int i17, java.lang.String session, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        this.f342710a = i17;
        this.f342711b = session;
        this.f342712c = j17;
    }

    /* renamed from: equals */
    public boolean m129343xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleReportData");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleReportData");
            return true;
        }
        if (!(obj instanceof fc4.k)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleReportData");
            return false;
        }
        fc4.k kVar = (fc4.k) obj;
        if (this.f342710a != kVar.f342710a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleReportData");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f342711b, kVar.f342711b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleReportData");
            return false;
        }
        long j17 = this.f342712c;
        long j18 = kVar.f342712c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleReportData");
        return j17 == j18;
    }

    /* renamed from: hashCode */
    public int m129344x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleReportData");
        int hashCode = (((java.lang.Integer.hashCode(this.f342710a) * 31) + this.f342711b.hashCode()) * 31) + java.lang.Long.hashCode(this.f342712c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleReportData");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m129345x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleReportData");
        java.lang.String str = "FlexibleReportData(scene=" + this.f342710a + ", session=" + this.f342711b + ", sessionTimestamp=" + this.f342712c + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleReportData");
        return str;
    }
}
