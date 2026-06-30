package s34;

/* loaded from: classes4.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f484105a = new java.util.ArrayList();

    public s34.b0 a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo$AdFinderLivePreviewInfo");
        if (a84.b0.c(map)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo$AdFinderLivePreviewInfo");
            return null;
        }
        try {
            if (!map.containsKey(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo$AdFinderLivePreviewInfo");
                return null;
            }
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            new s34.a0().a(map, str + ".productInfo");
            java.lang.String str2 = str + ".liveCheerIconList.iconInfo";
            int i17 = 0;
            while (true) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str2);
                sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                java.lang.String sb7 = sb6.toString();
                if (!map.containsKey(sb7)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo$AdFinderLivePreviewInfo");
                    return this;
                }
                s34.z zVar = new s34.z();
                zVar.a(map, sb7);
                ((java.util.ArrayList) this.f484105a).add(zVar);
                i17++;
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo$AdFinderLivePreviewInfo");
            return null;
        }
    }
}
