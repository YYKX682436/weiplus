package hd4;

/* loaded from: classes4.dex */
public final class b implements d94.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hd4.g f362098a;

    public b(hd4.g gVar) {
        this.f362098a = gVar;
    }

    @Override // d94.a
    public android.graphics.Rect a() {
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        hd4.g gVar = this.f362098a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetAnimDiplayRect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent$animTouchRectProvider$1");
        try {
            u74.d B = gVar.B();
            int width = (B == null || (view3 = B.f506696x) == null) ? 0 : view3.getWidth();
            int[] iArr = new int[2];
            u74.d B2 = gVar.B();
            if (B2 != null && (view2 = B2.f506696x) != null) {
                view2.getLocationOnScreen(iArr);
            }
            int[] iArr2 = new int[2];
            u74.d B3 = gVar.B();
            android.view.View findViewById = (B3 == null || (view = B3.f506696x) == null) ? null : view.findViewById(com.p314xaae8f345.mm.R.id.afc);
            if (findViewById != null) {
                findViewById.getLocationOnScreen(iArr2);
                hd4.g.y(gVar).set(0, 0, width, (iArr2[1] + findViewById.getHeight()) - iArr[1]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.j(), "onGetAnimDiplayRect, locRoot is " + iArr[0] + ", " + iArr[1] + ", locComment is " + iArr2[0] + ", " + iArr2[1] + ", ret is " + hd4.g.y(gVar));
                android.graphics.Rect y17 = hd4.g.y(gVar);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetAnimDiplayRect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent$animTouchRectProvider$1");
                return y17;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(gVar.j(), "onGetAnimDiplayRect, exp is " + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetAnimDiplayRect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent$animTouchRectProvider$1");
        return null;
    }

    @Override // d94.a
    public android.graphics.Point b() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var;
        hd4.g gVar = this.f362098a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetCoordOffset", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent$animTouchRectProvider$1");
        try {
            u74.d B = gVar.B();
            if (((B == null || (g9Var = B.f506687o) == null) ? null : g9Var.f249947d) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getParticleAnimContainer$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
                android.widget.FrameLayout frameLayout = gVar.f362112u;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getParticleAnimContainer$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
                if (frameLayout != null) {
                    int[] iArr = new int[2];
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var2 = gVar.B().f506687o;
                    if (g9Var2 != null && (view = g9Var2.f249947d) != null) {
                        view.getLocationOnScreen(iArr);
                    }
                    int[] iArr2 = new int[2];
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getParticleAnimContainer$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
                    android.widget.FrameLayout frameLayout2 = gVar.f362112u;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getParticleAnimContainer$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
                    if (frameLayout2 != null) {
                        frameLayout2.getLocationOnScreen(iArr2);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.j(), "onGetCoordOffset, contentLoc is " + iArr[0] + ", " + iArr[1] + ", animLoc is " + iArr2[0] + ", " + iArr2[1]);
                    hd4.g.z(gVar).x = iArr[0] - iArr2[0];
                    hd4.g.z(gVar).y = iArr[1] - iArr2[1];
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(gVar.j(), "onGetCoordOffset, exp is " + th6);
        }
        android.graphics.Point z17 = hd4.g.z(gVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetCoordOffset", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent$animTouchRectProvider$1");
        return z17;
    }
}
