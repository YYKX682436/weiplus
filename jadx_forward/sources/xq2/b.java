package xq2;

/* loaded from: classes2.dex */
public final class b extends pf5.o0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f537570e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final int f537571f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f537572g;

    /* renamed from: h, reason: collision with root package name */
    public long f537573h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f537574i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f537575m;

    public b() {
        int intValue = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.P1().r()).intValue();
        this.f537571f = intValue;
        this.f537572g = new java.util.HashMap();
        this.f537573h = intValue;
        this.f537574i = new java.util.HashMap();
        this.f537575m = new java.util.concurrent.ConcurrentHashMap();
    }

    public final xq2.a N6(java.lang.String themeId, java.lang.String themeTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(themeId, "themeId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(themeTag, "themeTag");
        java.lang.String str = themeId + '_' + themeTag;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f537570e;
        if (concurrentHashMap.get(str) == null) {
            concurrentHashMap.put(str, new xq2.a(themeId, themeTag));
        }
        java.lang.Object obj = concurrentHashMap.get(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        return (xq2.a) obj;
    }

    public final long O6(java.lang.String themeId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(themeId, "themeId");
        long j17 = (((r45.wz2) this.f537574i.get(themeId)) != null ? r5.f471127f : 0) * 1000;
        if (j17 == 0) {
            j17 = this.f537571f;
        }
        return j17 < com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d ? com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d : j17;
    }

    public final boolean P6(java.lang.String themeId, java.lang.String themeTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(themeId, "themeId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(themeTag, "themeTag");
        return java.lang.System.currentTimeMillis() - N6(themeId, themeTag).f537568g > O6(themeId);
    }

    public final void Q6(java.lang.String themeId, java.lang.String themeTag, int i17, int i18, java.util.ArrayList lastDataList, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.yz2 yz2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(themeId, "themeId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(themeTag, "themeTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastDataList, "lastDataList");
        xq2.a N6 = N6(themeId, themeTag);
        N6.f537566e = i17;
        N6.f537567f = i18;
        N6.f537564c = lastDataList;
        java.util.List list = N6.f537565d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<set-?>");
        N6.f537565d = list;
        N6.f537568g = java.lang.System.currentTimeMillis();
        N6.f537569h = yz2Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveThemePreloadCacheVM", "[store] themeId=" + themeId + " themeTag=" + themeTag + " lastExitPosition=" + i17 + " lastExitFromTopPx=" + i18 + " current=" + k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, N6.f537568g / 1000));
    }

    public final void R6(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveThemePreloadCacheVM", "storePrefetchInterval: globalPrefetchIntervalMap=" + j17);
        this.f537573h = j17;
    }
}
