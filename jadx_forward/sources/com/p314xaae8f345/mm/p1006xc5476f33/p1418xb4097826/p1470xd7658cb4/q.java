package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4;

/* loaded from: classes2.dex */
public final class q implements com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.u f192995d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.u uVar) {
        this.f192995d = uVar;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void a(float f17) {
        java.util.Iterator it = this.f192995d.f193006i.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it.next()).a(f17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveHighlightDrawerUIC", "onDrawerDetach");
        java.util.Iterator it = this.f192995d.f193006i.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it.next()).b();
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void c(boolean z17, boolean z18, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.u uVar = this.f192995d;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveHighlightDrawerUIC", "remove highlight progress listener to drawer, on close drawer");
            uVar.O6();
            uVar.f193003f.f192988b = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveHighlightDrawerUIC", "onDrawerOpen, isOpen: " + z17);
        java.util.Iterator it = uVar.f193006i.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it.next()).c(z17, z18, i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void d() {
        java.util.Iterator it = this.f192995d.f193006i.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it.next()).d();
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void f() {
        java.util.Iterator it = this.f192995d.f193006i.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it.next()).f();
        }
    }
}
