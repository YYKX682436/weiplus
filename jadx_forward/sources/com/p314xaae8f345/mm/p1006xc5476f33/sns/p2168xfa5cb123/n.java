package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public int f246442b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Map f246443c;

    /* renamed from: d, reason: collision with root package name */
    public long f246444d;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f246441a = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f246445e = "";

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("flush", "com.tencent.mm.plugin.sns.statistics.SnsGalleryReporter");
        java.util.Map map = this.f246443c;
        if (map != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f246444d;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.put("stay_time", java.lang.Long.valueOf(currentTimeMillis));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w("SnsGalleryReporter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
            wVar.a("view_unexp", "sns_large_image", linkedHashMap);
        }
        this.f246443c = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("flush", "com.tencent.mm.plugin.sns.statistics.SnsGalleryReporter");
    }
}
