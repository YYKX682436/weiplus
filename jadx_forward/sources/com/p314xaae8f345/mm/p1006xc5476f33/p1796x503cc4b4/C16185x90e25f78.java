package com.p314xaae8f345.mm.p1006xc5476f33.p1796x503cc4b4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/listener/FinderLiteAppHalfDrawListener;", "Lcom/tencent/mm/plugin/lite/api/LiteAppHalfScreenStatusChangeListener;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.listener.FinderLiteAppHalfDrawListener */
/* loaded from: classes2.dex */
public final class C16185x90e25f78 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588 {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a f224936f;

    public C16185x90e25f78(com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar) {
        super(java.lang.Boolean.TRUE);
        this.f224936f = aVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiteAppHalfDrawListener", "onCloseAnimEnd");
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f224936f;
        if (aVar != null) {
            aVar.c(false, false, 0);
        }
        eq.a.f337310a = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiteAppHalfDrawListener", "onCloseAnimStart");
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f224936f;
        if (aVar != null) {
            aVar.c(false, true, 0);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiteAppHalfDrawListener", "onFullScreenAnimEnd");
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f224936f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp mpVar = aVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp) aVar : null;
        if (mpVar != null) {
            mpVar.j();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588
    public void f(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiteAppHalfDrawListener", "onHeightChanged currentHeight: " + i17 + ", baseHeight: " + i18);
        if (i17 > i18 || i17 <= 0) {
            return;
        }
        float f17 = 1 - ((i17 * 1.0f) / i18);
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f224936f;
        if (aVar != null) {
            aVar.a(f17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588
    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiteAppHalfDrawListener", "onOpenAnimEnd");
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f224936f;
        if (aVar != null) {
            aVar.c(true, false, 0);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588
    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiteAppHalfDrawListener", "onOpenAnimStart");
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f224936f;
        if (aVar != null) {
            aVar.c(true, true, 0);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588
    public void i() {
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f224936f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp mpVar = aVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp) aVar : null;
        if (mpVar != null) {
            mpVar.m();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588
    public void m() {
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f224936f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp mpVar = aVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp) aVar : null;
        if (mpVar != null) {
            mpVar.e();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588
    public void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiteAppHalfDrawListener", "onResumeHalfScreenAnimStart");
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f224936f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp mpVar = aVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp) aVar : null;
        if (mpVar != null) {
            mpVar.i();
        }
    }
}
