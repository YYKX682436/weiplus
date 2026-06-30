package q74;

/* loaded from: classes4.dex */
public class b implements d94.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q74.e f441940a;

    public b(q74.e eVar) {
        this.f441940a = eVar;
    }

    @Override // d94.a
    public android.graphics.Rect a() {
        q74.e eVar = this.f441940a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetAnimDiplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$2");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            q74.d dVar = eVar.f441977q;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            android.graphics.Rect rect = eVar.C;
            int width = dVar.f250834v0.getWidth();
            int[] iArr = new int[2];
            dVar.f250834v0.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            if (dVar.G0 == null) {
                dVar.G0 = dVar.f250834v0.findViewById(com.p314xaae8f345.mm.R.id.afc);
            }
            dVar.G0.getLocationOnScreen(iArr2);
            int height = (iArr2[1] + dVar.G0.getHeight()) - iArr[1];
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            rect.set(0, 0, width, height);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGetAnimDiplayRect, locRoot=");
            sb6.append(iArr[0]);
            sb6.append(", ");
            sb6.append(iArr[1]);
            sb6.append(", locComment=");
            sb6.append(iArr2[0]);
            sb6.append(", ");
            sb6.append(iArr2[1]);
            sb6.append(", ret=");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            sb6.append(rect);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSlideFullCardTimeLineItem", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetAnimDiplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$2");
            return rect;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdSlideFullCardTimeLineItem", "onGetAnimDiplayRect, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetAnimDiplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$2");
            return null;
        }
    }

    @Override // d94.a
    public android.graphics.Point b() {
        q74.e eVar = this.f441940a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetCoordOffset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$2");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            q74.d dVar = eVar.f441977q;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            if (dVar.E0 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                android.widget.FrameLayout frameLayout = eVar.B;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                if (frameLayout != null) {
                    int[] iArr = new int[2];
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                    q74.d dVar2 = eVar.f441977q;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                    dVar2.E0.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                    android.widget.FrameLayout frameLayout2 = eVar.B;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                    frameLayout2.getLocationOnScreen(iArr2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSlideFullCardTimeLineItem", "onGetCoordOffset, contentLoc=" + iArr[0] + ", " + iArr[1] + ", animLoc=" + iArr2[0] + ", " + iArr2[1]);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                    android.graphics.Point point = eVar.D;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                    point.x = iArr[0] - iArr2[0];
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                    point.y = iArr[1] - iArr2[1];
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdSlideFullCardTimeLineItem", "onGetCoordOffset, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        android.graphics.Point point2 = eVar.D;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetCoordOffset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$2");
        return point2;
    }
}
