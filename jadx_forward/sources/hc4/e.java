package hc4;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f361894a;

    /* renamed from: b, reason: collision with root package name */
    public int f361895b;

    /* renamed from: c, reason: collision with root package name */
    public long f361896c;

    /* renamed from: d, reason: collision with root package name */
    public long f361897d;

    /* renamed from: e, reason: collision with root package name */
    public int f361898e;

    /* renamed from: f, reason: collision with root package name */
    public long f361899f;

    /* renamed from: g, reason: collision with root package name */
    public int f361900g;

    /* renamed from: h, reason: collision with root package name */
    public int f361901h;

    public e(long j17, int i17, long j18, long j19, int i18, long j27, int i19, int i27, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        long j28 = (i28 & 1) != 0 ? 0L : j17;
        int i29 = (i28 & 2) != 0 ? 0 : i17;
        long j29 = (i28 & 4) != 0 ? 0L : j18;
        long j37 = (i28 & 8) != 0 ? 0L : j19;
        int i37 = (i28 & 16) != 0 ? 0 : i18;
        long j38 = (i28 & 32) == 0 ? j27 : 0L;
        int i38 = (i28 & 64) != 0 ? 0 : i19;
        int i39 = (i28 & 128) == 0 ? i27 : 0;
        this.f361894a = j28;
        this.f361895b = i29;
        this.f361896c = j29;
        this.f361897d = j37;
        this.f361898e = i37;
        this.f361899f = j38;
        this.f361900g = i38;
        this.f361901h = i39;
    }

    /* renamed from: equals */
    public boolean m133202xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            return true;
        }
        if (!(obj instanceof hc4.e)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            return false;
        }
        hc4.e eVar = (hc4.e) obj;
        if (this.f361894a != eVar.f361894a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            return false;
        }
        if (this.f361895b != eVar.f361895b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            return false;
        }
        if (this.f361896c != eVar.f361896c) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            return false;
        }
        if (this.f361897d != eVar.f361897d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            return false;
        }
        if (this.f361898e != eVar.f361898e) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            return false;
        }
        if (this.f361899f != eVar.f361899f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            return false;
        }
        if (this.f361900g != eVar.f361900g) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            return false;
        }
        int i17 = this.f361901h;
        int i18 = eVar.f361901h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        return i17 == i18;
    }

    /* renamed from: hashCode */
    public int m133203x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        int hashCode = (((((((((((((java.lang.Long.hashCode(this.f361894a) * 31) + java.lang.Integer.hashCode(this.f361895b)) * 31) + java.lang.Long.hashCode(this.f361896c)) * 31) + java.lang.Long.hashCode(this.f361897d)) * 31) + java.lang.Integer.hashCode(this.f361898e)) * 31) + java.lang.Long.hashCode(this.f361899f)) * 31) + java.lang.Integer.hashCode(this.f361900g)) * 31) + java.lang.Integer.hashCode(this.f361901h);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m133204x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        long j17 = this.f361894a;
        long j18 = this.f361896c;
        long j19 = j17 - j18;
        long j27 = j19 > 0 ? ((this.f361895b - this.f361901h) * 1000) / j19 : -1L;
        long j28 = j18 > 0 ? (this.f361901h * 1000) / j18 : -1L;
        stringBuffer.append("total time:" + this.f361894a + " ms,scroll time:" + this.f361896c + " ms,idle time:" + j19 + '\n');
        stringBuffer.append("total jank time:" + this.f361899f + " ms, scroll jank time:" + this.f361897d + " ms,idle jank time:" + (this.f361899f - this.f361897d) + " ms\n");
        stringBuffer.append("total frame:" + this.f361895b + " ,janke frame:" + this.f361898e + " scroll frame:" + this.f361901h + '\n');
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("scroll fps:");
        sb6.append(j28);
        sb6.append(" ,idle fps:");
        sb6.append(j27);
        sb6.append('\n');
        stringBuffer.append(sb6.toString());
        java.lang.String stringBuffer2 = stringBuffer.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringBuffer2, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        return stringBuffer2;
    }
}
