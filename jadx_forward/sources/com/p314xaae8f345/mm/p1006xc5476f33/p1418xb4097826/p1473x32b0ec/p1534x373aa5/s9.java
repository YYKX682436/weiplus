package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes.dex */
public final class s9 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f198208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198210c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198211d;

    public s9(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f198208a = interfaceC29045xdcb5ca57;
        this.f198209b = str;
        this.f198210c = str2;
        this.f198211d = str3;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveProductSizeAssistPanelView", "updateLiteApp: createStore fail!");
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f198208a.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(-1000));
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveProductSizeAssistPanelView", "updateLiteApp: createStore success!");
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        this.f198208a.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).rj(this.f198209b, this.f198210c, this.f198211d))));
    }
}
