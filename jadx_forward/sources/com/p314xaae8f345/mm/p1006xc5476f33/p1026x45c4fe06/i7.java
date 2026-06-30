package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class i7 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f159868a;

    public i7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        this.f159868a = o6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0
    public void a(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11815xcf47e362) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "onCustomDataNotify, appId[%s], GetOnLineInfoInfoResult", this.f159868a.f156336n);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11815xcf47e362 c11815xcf47e362 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11815xcf47e362) obj;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(this.f159868a.f156336n).f167256p = c11815xcf47e362.f158884d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(this.f159868a.f156336n).f167257q = c11815xcf47e362.f158885e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(this.f159868a.f156336n).f167258r = c11815xcf47e362.f158886f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(this.f159868a.f156336n).f167259s = c11815xcf47e362.f158887g;
        }
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.p1761x2c1ddc83.C16043x7b3d453a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "gamelifeManager ,get event,GameLifeOutputDataWrapper.onCustomDataNotify, appId[%s]", this.f159868a.f156336n);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 component = this.f159868a.C0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.p1761x2c1ddc83.C16043x7b3d453a c16043x7b3d453a = (com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.p1761x2c1ddc83.C16043x7b3d453a) obj;
            java.lang.String sessionId = c16043x7b3d453a.f223517d;
            java.lang.String fromUserName = c16043x7b3d453a.f223518e;
            java.lang.String toUserName = c16043x7b3d453a.f223519f;
            nc1.a aVar = nc1.a.f417626i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUserName, "fromUserName");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUserName, "toUserName");
            nc1.a aVar2 = nc1.a.f417626i;
            aVar2.u(component);
            aVar2.t(kz5.c1.k(new jz5.l(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, sessionId), new jz5.l("fromUserName", fromUserName), new jz5.l("toUserName", toUserName)));
            aVar2.m();
        }
    }
}
