package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes.dex */
public final class p1 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f198107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198108b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198109c;

    public p1(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.String str, java.lang.String str2) {
        this.f198107a = interfaceC29045xdcb5ca57;
        this.f198108b = str;
        this.f198109c = str2;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveAnchorDataPanelView", "updateLiteApp: createStore fail!");
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f198107a.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(-1000));
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorDataPanelView", "updateLiteApp: createStore success!");
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        this.f198107a.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).rj(this.f198108b, "dataPanelStore/updateDataPanelStr", this.f198109c))));
    }
}
