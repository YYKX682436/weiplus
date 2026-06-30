package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class h6 {

    /* renamed from: a, reason: collision with root package name */
    public long f245771a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f245772b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f245773c = false;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f245774d = new java.util.LinkedList();

    public final boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryGetSettings", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        java.util.LinkedList linkedList = this.f245774d;
        linkedList.clear();
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsImgPreLoadingTimeLimit");
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = d17 == null ? "null" : d17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPreTimelineService", "preloadLimit:%s", objArr);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPreTimelineService", "preloadLimit:%s", d17);
                for (java.lang.String str : d17.split(";")) {
                    java.lang.String[] split = str.split("-");
                    java.lang.String[] split2 = split[0].split(":");
                    int D1 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split2[0], 0) * 60) + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split2[1], 0);
                    java.lang.String[] split3 = split[1].split(":");
                    linkedList.add(new android.util.Pair(java.lang.Integer.valueOf(D1), java.lang.Integer.valueOf((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split3[0], 0) * 60) + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split3[1], 0))));
                }
            } catch (java.lang.Exception unused) {
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryGetSettings", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
            return true;
        }
        linkedList.add(new android.util.Pair(0, 1440));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryGetSettings", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        return false;
    }
}
