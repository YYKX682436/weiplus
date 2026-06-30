package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class tr implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr f190639a;

    public tr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar) {
        this.f190639a = xrVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.q0
    /* renamed from: call */
    public void mo981x2e7a5e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar = this.f190639a;
        int m56356xb1ee36ee = xrVar.f192630f.m().m56356xb1ee36ee();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = xrVar.f192628d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar != null) {
            nyVar.f216907f = m56356xb1ee36ee;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xrVar.f192629e, "onRefreshEnd firstLoadMore " + xrVar.f192633i + " initPos " + m56356xb1ee36ee + " isFromBizPhoto " + xrVar.f192630f.f188768i + ' ' + pm0.v.u(xrVar.f192630f.f188769m));
        if (!xrVar.f192633i || m56356xb1ee36ee < 0) {
            return;
        }
        xrVar.f192633i = false;
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.sr(xrVar, m56356xb1ee36ee));
    }
}
