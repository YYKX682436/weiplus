package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class h5 implements q80.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14316xd081b6f3 f197881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f197882b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f197883c;

    public h5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14316xd081b6f3 c14316xd081b6f3, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f197881a = c14316xd081b6f3;
        this.f197882b = c0Var;
        this.f197883c = interfaceC29045xdcb5ca57;
    }

    @Override // q80.s
    public void a(android.view.View liteAppView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppView, "liteAppView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14316xd081b6f3 c14316xd081b6f3 = this.f197881a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c14316xd081b6f3.f197433f, "startLiteAppView success,liteAppView:" + liteAppView);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14316xd081b6f3.d(this.f197882b, this.f197883c, c14316xd081b6f3, true);
    }

    @Override // q80.s
    /* renamed from: fail */
    public void mo9542x2fd71e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14316xd081b6f3 c14316xd081b6f3 = this.f197881a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c14316xd081b6f3.f197433f, "startLiteAppView fail!");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14316xd081b6f3.d(this.f197882b, this.f197883c, c14316xd081b6f3, false);
    }
}
