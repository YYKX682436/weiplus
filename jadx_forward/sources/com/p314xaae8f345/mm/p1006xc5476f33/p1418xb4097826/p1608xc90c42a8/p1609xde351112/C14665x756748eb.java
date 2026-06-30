package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/assist/i4;", "actionMenuInfo", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/finder/assist/i4;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getCreateMoreMenuListener$1$actionMenuInfo$2 */
/* loaded from: classes2.dex */
final class C14665x756748eb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g4 f204201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f204202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f204203f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14665x756748eb(db5.g4 g4Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        super(1);
        this.f204201d = g4Var;
        this.f204202e = k0Var;
        this.f204203f = abstractActivityC21394xb3d2c0cf;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i4 actionMenuInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i4) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionMenuInfo, "actionMenuInfo");
        if (!actionMenuInfo.f183795l && this.f204201d.findItem(208) == null) {
            this.f204201d.j(208, actionMenuInfo.f183791h, com.p314xaae8f345.mm.R.raw.f78702x8b717bba, 0, actionMenuInfo.f183787d);
            hc2.f1.C(this.f204202e, this.f204203f);
        }
        return jz5.f0.f384359a;
    }
}
