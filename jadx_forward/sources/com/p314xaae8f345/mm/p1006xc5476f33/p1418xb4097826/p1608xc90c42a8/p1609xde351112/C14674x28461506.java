package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "userName", "Ljz5/f0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getMoreMenuItemSelectedListener$1$onMMMenuItemSelected$6 */
/* loaded from: classes2.dex */
final class C14674x28461506 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14656x5cc28977.LikedTimelinePresenter f204223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f204224e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f204225f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f204226g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14674x28461506(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14656x5cc28977.LikedTimelinePresenter likedTimelinePresenter, android.view.MenuItem menuItem, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, int i17) {
        super(1);
        this.f204223d = likedTimelinePresenter;
        this.f204224e = menuItem;
        this.f204225f = abstractC14490x69736cb5;
        this.f204226g = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String userName = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14656x5cc28977.LikedTimelinePresenter likedTimelinePresenter = this.f204223d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = likedTimelinePresenter.f204176d;
        db5.h4 h4Var = (db5.h4) this.f204224e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f204225f;
        ((c61.p2) ybVar).Mj(abstractActivityC21394xb3d2c0cf, userName, h4Var, abstractC14490x69736cb5.getFeedObject(), null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3.f206965a.e(likedTimelinePresenter.f204176d, userName, abstractC14490x69736cb5.mo2128x1ed62e84(), this.f204226g);
        return jz5.f0.f384359a;
    }
}
