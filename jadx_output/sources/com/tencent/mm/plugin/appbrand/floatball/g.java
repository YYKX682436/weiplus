package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public final class g implements mp1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.i f78094a;

    public g(com.tencent.mm.plugin.appbrand.floatball.i iVar) {
        this.f78094a = iVar;
    }

    @Override // mp1.b
    public void a() {
        com.tencent.mm.plugin.appbrand.floatball.i iVar = this.f78094a;
        com.tencent.mars.xlog.Log.i(iVar.f78100w, "onAnimationCancel#onClosePermissionAllowed");
        iVar.f93239n.q(true);
    }

    @Override // mp1.b
    public void onAnimationEnd() {
        com.tencent.mm.plugin.appbrand.floatball.i iVar = this.f78094a;
        com.tencent.mars.xlog.Log.i(iVar.f78100w, "onAnimationEnd#onClosePermissionAllowed");
        iVar.f93239n.q(false);
    }
}
