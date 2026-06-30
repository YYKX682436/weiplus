package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class o1 implements q80.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f198085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f198086b;

    public o1(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f198085a = c0Var;
        this.f198086b = interfaceC29045xdcb5ca57;
    }

    @Override // q80.s
    public void a(android.view.View liteAppView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppView, "liteAppView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveAnchorDataPanelView", "startLiteAppView: success,liteAppView:" + liteAppView);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14300xaa703dd8.d(this.f198085a, this.f198086b, true);
    }

    @Override // q80.s
    /* renamed from: fail */
    public void mo9542x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveAnchorDataPanelView", "startLiteAppView: fail!");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14300xaa703dd8.d(this.f198085a, this.f198086b, false);
    }
}
