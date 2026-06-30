package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class tr implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xr f109106a;

    public tr(com.tencent.mm.plugin.finder.feed.xr xrVar) {
        this.f109106a = xrVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.feed.xr xrVar = this.f109106a;
        int initPos = xrVar.f111097f.m().getInitPos();
        com.tencent.mm.ui.MMActivity context = xrVar.f111095d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null) {
            nyVar.f135374f = initPos;
        }
        com.tencent.mars.xlog.Log.i(xrVar.f111096e, "onRefreshEnd firstLoadMore " + xrVar.f111100i + " initPos " + initPos + " isFromBizPhoto " + xrVar.f111097f.f107235i + ' ' + pm0.v.u(xrVar.f111097f.f107236m));
        if (!xrVar.f111100i || initPos < 0) {
            return;
        }
        xrVar.f111100i = false;
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.sr(xrVar, initPos));
    }
}
