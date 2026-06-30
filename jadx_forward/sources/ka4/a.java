package ka4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public ka4.b f387646a;

    /* renamed from: b, reason: collision with root package name */
    public final long f387647b;

    /* renamed from: c, reason: collision with root package name */
    public long f387648c;

    public a(ka4.b predictType, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predictType, "predictType");
        this.f387646a = predictType;
        this.f387647b = j17;
        this.f387648c = j18;
    }

    /* renamed from: equals */
    public boolean m142310xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
            return true;
        }
        if (!(obj instanceof ka4.a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
            return false;
        }
        ka4.a aVar = (ka4.a) obj;
        if (this.f387646a != aVar.f387646a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
            return false;
        }
        if (this.f387647b != aVar.f387647b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
            return false;
        }
        long j17 = this.f387648c;
        long j18 = aVar.f387648c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
        return j17 == j18;
    }

    /* renamed from: hashCode */
    public int m142311x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
        int hashCode = (((this.f387646a.hashCode() * 31) + java.lang.Long.hashCode(this.f387647b)) * 31) + java.lang.Long.hashCode(this.f387648c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m142312x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
        java.lang.String str = "KaraPredictItem(predictType=" + this.f387646a + ", predictStartTime=" + this.f387647b + ", predictCost=" + this.f387648c + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
        return str;
    }
}
