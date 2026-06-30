package hd4;

/* loaded from: classes4.dex */
public final class e implements w64.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hd4.g f362104a;

    public e(hd4.g gVar) {
        this.f362104a = gVar;
    }

    @Override // w64.l
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent$mCardAnimPrepareListener$1");
        hd4.g gVar = this.f362104a;
        java.lang.String j17 = gVar.j();
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("ad_no_click_anim", false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$prepareFullCardAnimation", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
            gVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("prepareFullCardAnimation", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar = gVar.f362109r;
            if (iVar != null) {
                iVar.M(gVar.f362107p, bundle);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prepareFullCardAnimation", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$prepareFullCardAnimation", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent$mCardAnimPrepareListener$1");
    }

    @Override // w64.l
    public android.view.View b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent$mCardAnimPrepareListener$1");
        u74.d B = this.f362104a.B();
        android.view.View view = B != null ? B.f506698z : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent$mCardAnimPrepareListener$1");
        return view;
    }
}
