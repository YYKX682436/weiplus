package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes4.dex */
public final class t extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements bd4.v0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.k f250524d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f250525e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f250526f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f250527g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f250528h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f250529i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f250525e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.o(activity, this));
        this.f250526f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.n(this));
        this.f250527g = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.s.f250520d);
        this.f250528h = new java.util.LinkedList();
        this.f250529i = "";
    }

    public static final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 O6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getCommentFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 P6 = tVar.P6();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getCommentFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        return P6;
    }

    @Override // bd4.v0
    public boolean K1(android.view.MotionEvent ev6) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleDownEvent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("commentFooterIsVisible", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        boolean z17 = P6().getVisibility() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("commentFooterIsVisible", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 P6 = P6();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isTouchPointInView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
            int rawX = (int) ev6.getRawX();
            int rawY = (int) ev6.getRawY();
            int[] iArr = new int[2];
            P6.getLocationOnScreen(iArr);
            int i17 = iArr[0];
            int i18 = iArr[1];
            boolean z18 = (i18 <= rawY && rawY <= P6.getMeasuredHeight() + i18) && rawX >= i17 && rawX <= P6.getMeasuredWidth() + i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTouchPointInView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
            if (!z18) {
                R6();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleDownEvent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleDownEvent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        return false;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 P6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f250526f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662) mo141623x754a37bb;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        return c18037xf8026662;
    }

    public final gc4.b Q6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentKeyBoardStateDelegate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        gc4.b bVar = (gc4.b) ((jz5.n) this.f250525e).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentKeyBoardStateDelegate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        return bVar;
    }

    public final void R6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideFooter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i17 != 26) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        } else {
            P6().K(i18, intent);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBackPressed", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        R6();
        boolean mo2274xbdc3c5dc = super.mo2274xbdc3c5dc();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBackPressed", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        return mo2274xbdc3c5dc;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        super.mo2281xb01dfb57();
        Q6().a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        Q6().c();
        P6().B();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onWindowFocusChanged */
    public void mo14961xa4ec7b0b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
        super.mo14961xa4ec7b0b(z17);
        if (z17) {
            Q6().c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveCommentInputUIC");
    }
}
