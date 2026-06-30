package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderWeAppHalfScreenScListener;", "Lcom/tencent/mm/plugin/appbrand/config/WeAppHalfScreenStatusChangeListener;", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderWeAppHalfScreenScListener */
/* loaded from: classes2.dex */
public final class C15360x63e3b670 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368 {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a f213050f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f213051g;

    public C15360x63e3b670(boolean z17, com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar) {
        super(z17);
        this.f213050f = aVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368
    public void c() {
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f213050f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp mpVar = aVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp) aVar : null;
        if (mpVar != null) {
            mpVar.j();
        }
        this.f213051g = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWeAppHalfScreenScListener", "onEnterFullScreen...");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368
    public void d() {
        if (this.f213051g) {
            this.f213051g = false;
            com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f213050f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp mpVar = aVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp) aVar : null;
            if (mpVar != null) {
                mpVar.i();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWeAppHalfScreenScListener", "onEnterHalfScreen...");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368
    public void e(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWeAppHalfScreenScListener", "onHalfScreenClose... isAnimationBegin=" + z17);
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f213050f;
        if (aVar != null) {
            aVar.c(false, z17, 0);
        }
        if (z17) {
            return;
        }
        eq.a.f337311b = false;
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar2 = this.f213050f;
        if (aVar2 != null) {
            aVar2.b();
        }
        this.f213050f = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368
    public void f(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWeAppHalfScreenScListener", "onHalfScreenOpen... isAnimationBegin=" + z17);
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f213050f;
        if (aVar != null) {
            aVar.c(true, z17, 0);
        }
        eq.a.f337311b = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368
    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWeAppHalfScreenScListener", "onHalfScreenPause...");
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f213050f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp mpVar = aVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp) aVar : null;
        if (mpVar != null) {
            mpVar.m();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368
    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWeAppHalfScreenScListener", "onHalfScreenResume...");
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f213050f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp mpVar = aVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp) aVar : null;
        if (mpVar != null) {
            mpVar.e();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368
    public void i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11817xcfa25a95 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        int i17 = info.f158925d;
        int i18 = info.f158926e;
        if (i17 > i18) {
            return;
        }
        float f17 = 1 - ((i17 * 1.0f) / i18);
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f213050f;
        if (aVar != null) {
            aVar.a(f17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWeAppHalfScreenScListener", "onHeightChanged " + info + " percent：" + f17);
    }
}
