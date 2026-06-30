package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class fa implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ha f215914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f215915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f215916f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a f215917g;

    public fa(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ha haVar, int i17, yz5.l lVar, com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar) {
        this.f215914d = haVar;
        this.f215915e = i17;
        this.f215916f = lVar;
        this.f215917g = aVar;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void a(float f17) {
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f215917g;
        if (aVar != null) {
            aVar.a(f17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void b() {
        yz5.l lVar = this.f215916f;
        if (lVar != null) {
            lVar.mo146xb9724478(this);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f215917g;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void c(boolean z17, boolean z18, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ha haVar = this.f215914d;
        if (!z18) {
            int i18 = this.f215915e;
            if (z17) {
                java.lang.Integer num = (java.lang.Integer) haVar.f216133d.peek();
                if (num == null || num.intValue() != i18) {
                    haVar.f216133d.push(java.lang.Integer.valueOf(i18));
                }
            } else {
                yz5.l lVar = this.f215916f;
                if (lVar != null) {
                    lVar.mo146xb9724478(this);
                }
                java.lang.Integer num2 = (java.lang.Integer) haVar.f216133d.peek();
                if (num2 != null && num2.intValue() == i18) {
                    haVar.f216133d.pop();
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDrawerRecordUIC", "onDrawerOpen isOpen:" + z17 + " isBegin:" + z18 + " invokeSourceType:" + i17 + ", drawerStack:" + haVar.f216133d.size() + " top:" + haVar.f216133d.peek());
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f215917g;
        if (aVar != null) {
            aVar.c(z17, z18, i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void d() {
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f215917g;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp
    public void e() {
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f215917g;
        l93.k0 k0Var = aVar instanceof l93.k0 ? (l93.k0) aVar : null;
        if (k0Var != null) {
            k0Var.e();
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void f() {
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f215917g;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp
    public void i() {
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f215917g;
        l93.k0 k0Var = aVar instanceof l93.k0 ? (l93.k0) aVar : null;
        if (k0Var != null) {
            k0Var.i();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp
    public void j() {
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f215917g;
        l93.k0 k0Var = aVar instanceof l93.k0 ? (l93.k0) aVar : null;
        if (k0Var != null) {
            k0Var.j();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp
    public void m() {
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f215917g;
        l93.k0 k0Var = aVar instanceof l93.k0 ? (l93.k0) aVar : null;
        if (k0Var != null) {
            k0Var.m();
        }
    }
}
