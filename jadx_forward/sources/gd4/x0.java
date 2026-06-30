package gd4;

/* loaded from: classes4.dex */
public interface x0 {
    static /* synthetic */ java.lang.Object d(gd4.x0 x0Var, java.lang.String str, android.widget.FrameLayout.LayoutParams layoutParams, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("prepare$default", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IVideoControllerForBreakFrame");
        if (obj != null) {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepare");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prepare$default", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IVideoControllerForBreakFrame");
            throw unsupportedOperationException;
        }
        if ((i17 & 2) != 0) {
            layoutParams = null;
        }
        if ((i17 & 4) != 0) {
            str2 = null;
        }
        java.lang.Object a17 = x0Var.a(str, layoutParams, str2, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prepare$default", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IVideoControllerForBreakFrame");
        return a17;
    }

    java.lang.Object a(java.lang.String str, android.widget.FrameLayout.LayoutParams layoutParams, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);

    void b(android.widget.FrameLayout.LayoutParams layoutParams);

    java.lang.Object c(long j17, boolean z17, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);

    /* renamed from: getCompletionFlow */
    p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 mo71212x32e9d820();

    /* renamed from: getCurrentPosInMills */
    long mo71213x35418e61();

    /* renamed from: getDurationMs */
    long mo71216x37a7fa50();

    /* renamed from: pause */
    void mo71226x65825f6();

    /* renamed from: resume */
    void mo71227xc84dc82d();

    /* renamed from: setFrameLayoutAlpha */
    void mo71230x3537f529(float f17);

    /* renamed from: start */
    void mo71239x68ac462();

    /* renamed from: stop */
    void mo71240x360802();
}
