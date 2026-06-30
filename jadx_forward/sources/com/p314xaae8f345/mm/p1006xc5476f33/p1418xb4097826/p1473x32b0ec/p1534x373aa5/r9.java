package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class r9 implements q80.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v65.n f198187a;

    public r9(v65.n nVar) {
        this.f198187a = nVar;
    }

    @Override // q80.s
    public void a(android.view.View liteAppView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppView, "liteAppView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveProductSizeAssistPanelView", "startLiteAppView: success,liteAppView:" + liteAppView);
        this.f198187a.a(java.lang.Boolean.TRUE);
    }

    @Override // q80.s
    /* renamed from: fail */
    public void mo9542x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveProductSizeAssistPanelView", "startLiteAppView: fail!");
        this.f198187a.a(java.lang.Boolean.FALSE);
    }
}
