package ta4;

/* loaded from: classes15.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f498329a;

    /* renamed from: b, reason: collision with root package name */
    public int f498330b;

    /* renamed from: c, reason: collision with root package name */
    public int f498331c;

    public l(int i17, int i18, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i27 & 1) != 0 ? 0 : i17;
        i18 = (i27 & 2) != 0 ? 0 : i18;
        i19 = (i27 & 4) != 0 ? 0 : i19;
        this.f498329a = i17;
        this.f498330b = i18;
        this.f498331c = i19;
    }

    public final int a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLoaderQueueSize", "com.tencent.mm.plugin.sns.report.QueueSize");
        int i17 = this.f498331c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLoaderQueueSize", "com.tencent.mm.plugin.sns.report.QueueSize");
        return i17;
    }

    public final java.lang.String b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toReport", "com.tencent.mm.plugin.sns.report.QueueSize");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("pendingQueueSize", this.f498329a);
        jSONObject.put("downloadingQueueSize", this.f498330b);
        java.lang.String a17 = ta4.v0.a(jSONObject);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toReport", "com.tencent.mm.plugin.sns.report.QueueSize");
        return a17;
    }

    /* renamed from: equals */
    public boolean m166071xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.report.QueueSize");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.report.QueueSize");
            return true;
        }
        if (!(obj instanceof ta4.l)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.report.QueueSize");
            return false;
        }
        ta4.l lVar = (ta4.l) obj;
        if (this.f498329a != lVar.f498329a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.report.QueueSize");
            return false;
        }
        if (this.f498330b != lVar.f498330b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.report.QueueSize");
            return false;
        }
        int i17 = this.f498331c;
        int i18 = lVar.f498331c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.report.QueueSize");
        return i17 == i18;
    }

    /* renamed from: hashCode */
    public int m166072x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.report.QueueSize");
        int hashCode = (((java.lang.Integer.hashCode(this.f498329a) * 31) + java.lang.Integer.hashCode(this.f498330b)) * 31) + java.lang.Integer.hashCode(this.f498331c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.report.QueueSize");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m166073x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.report.QueueSize");
        java.lang.String str = "[pending:" + this.f498329a + ", downloading:" + this.f498330b + ']';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.report.QueueSize");
        return str;
    }
}
