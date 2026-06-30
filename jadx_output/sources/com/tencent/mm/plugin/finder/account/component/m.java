package com.tencent.mm.plugin.finder.account.component;

/* loaded from: classes2.dex */
public final class m implements com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer f101720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.account.component.s f101721e;

    public m(com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer finderAccountSwitchDrawer, com.tencent.mm.plugin.finder.account.component.s sVar) {
        this.f101720d = finderAccountSwitchDrawer;
        this.f101721e = sVar;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        this.f101720d.t(this);
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        if (z17 || z18) {
            return;
        }
        this.f101720d.t(this);
        com.tencent.mm.plugin.finder.account.component.s sVar = this.f101721e;
        sVar.getClass();
        sVar.getClass();
    }
}
