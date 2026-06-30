package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public final class b8 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a8 f245635g = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a8(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f245636a;

    /* renamed from: b, reason: collision with root package name */
    public long f245637b;

    /* renamed from: c, reason: collision with root package name */
    public long f245638c;

    /* renamed from: d, reason: collision with root package name */
    public int f245639d;

    /* renamed from: e, reason: collision with root package name */
    public long f245640e;

    /* renamed from: f, reason: collision with root package name */
    public int f245641f;

    public b8(java.lang.String userName, long j17, long j18, int i17, long j19, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f245636a = userName;
        this.f245637b = j17;
        this.f245638c = j18;
        this.f245639d = i17;
        this.f245640e = j19;
        this.f245641f = i18;
    }

    public final int a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickFeedCount", "com.tencent.mm.plugin.sns.model.WsFoldData");
        int i17 = this.f245639d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickFeedCount", "com.tencent.mm.plugin.sns.model.WsFoldData");
        return i17;
    }

    public final long b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLastUnFoldTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
        long j17 = this.f245637b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastUnFoldTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
        return j17;
    }

    public final void c(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLastUnFoldTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
        this.f245637b = j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLastUnFoldTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
    }

    public final void d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setReportScene", "com.tencent.mm.plugin.sns.model.WsFoldData");
        this.f245641f = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setReportScene", "com.tencent.mm.plugin.sns.model.WsFoldData");
    }

    public final void e(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsId", "com.tencent.mm.plugin.sns.model.WsFoldData");
        this.f245640e = j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsId", "com.tencent.mm.plugin.sns.model.WsFoldData");
    }

    /* renamed from: equals */
    public boolean m70021xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b8)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b8 b8Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b8) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f245636a, b8Var.f245636a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
            return false;
        }
        if (this.f245637b != b8Var.f245637b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
            return false;
        }
        if (this.f245638c != b8Var.f245638c) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
            return false;
        }
        if (this.f245639d != b8Var.f245639d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
            return false;
        }
        if (this.f245640e != b8Var.f245640e) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
            return false;
        }
        int i17 = this.f245641f;
        int i18 = b8Var.f245641f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.model.WsFoldData");
        return i17 == i18;
    }

    /* renamed from: hashCode */
    public int m70022x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.model.WsFoldData");
        int hashCode = (((((((((this.f245636a.hashCode() * 31) + java.lang.Long.hashCode(this.f245637b)) * 31) + java.lang.Long.hashCode(this.f245638c)) * 31) + java.lang.Integer.hashCode(this.f245639d)) * 31) + java.lang.Long.hashCode(this.f245640e)) * 31) + java.lang.Integer.hashCode(this.f245641f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.model.WsFoldData");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m70023x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
        java.lang.String str = this.f245636a + ',' + this.f245637b + ',' + this.f245638c + ',' + this.f245639d + ',' + this.f245640e + ',' + this.f245641f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
        return str;
    }
}
