package eq2;

/* loaded from: classes2.dex */
public final class b extends pf5.o0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f337416e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f337417f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public int f337418g = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.P1().r()).intValue();

    public final eq2.a N6(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('_');
        sb6.append(i18);
        java.lang.String sb7 = sb6.toString();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f337416e;
        if (concurrentHashMap.get(sb7) == null) {
            concurrentHashMap.put(sb7, new eq2.a(i17, i18));
        }
        java.lang.Object obj = concurrentHashMap.get(sb7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        return (eq2.a) obj;
    }

    public final void O6(int i17, int i18, int i19, int i27, int i28, java.util.ArrayList lastDataList, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.dk2 dk2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastDataList, "lastDataList");
        this.f337418g = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.P1().r()).intValue();
        this.f337417f.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19));
        eq2.a N6 = N6(i17, i18);
        N6.f337412c = i27;
        N6.f337413d = i28;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(lastDataList);
        N6.f337410a = arrayList;
        java.util.List list = N6.f337411b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<set-?>");
        N6.f337411b = list;
        N6.f337414e = java.lang.System.currentTimeMillis();
        N6.f337415f = dk2Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveThemePreloadCacheVM", "[store] tabId=" + i17 + " lastExitPosition=" + i27 + " lastExitFromTopPx=" + i28 + " subTabId=" + i18 + " subTabIndex=" + i19 + " current=" + k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, N6.f337414e / 1000));
    }
}
