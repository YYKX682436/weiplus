package com.tencent.mm.plugin.finder.highlight;

/* loaded from: classes2.dex */
public final class q implements com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.highlight.u f111462d;

    public q(com.tencent.mm.plugin.finder.highlight.u uVar) {
        this.f111462d = uVar;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
        java.util.Iterator it = this.f111462d.f111473i.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it.next()).a(f17);
        }
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveHighlightDrawerUIC", "onDrawerDetach");
        java.util.Iterator it = this.f111462d.f111473i.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it.next()).b();
        }
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        com.tencent.mm.plugin.finder.highlight.u uVar = this.f111462d;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveHighlightDrawerUIC", "remove highlight progress listener to drawer, on close drawer");
            uVar.O6();
            uVar.f111470f.f111455b = null;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveHighlightDrawerUIC", "onDrawerOpen, isOpen: " + z17);
        java.util.Iterator it = uVar.f111473i.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it.next()).c(z17, z18, i17);
        }
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void d() {
        java.util.Iterator it = this.f111462d.f111473i.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it.next()).d();
        }
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void f() {
        java.util.Iterator it = this.f111462d.f111473i.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it.next()).f();
        }
    }
}
