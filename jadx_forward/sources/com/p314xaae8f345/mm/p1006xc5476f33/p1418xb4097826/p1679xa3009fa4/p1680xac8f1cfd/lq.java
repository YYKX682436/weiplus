package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class lq {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a f216610a;

    public lq(com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar) {
        this.f216610a = aVar;
    }

    public final void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNpsContainerState", "onHalfScreenClose... isAnimationBegin=" + z17);
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f216610a;
        if (aVar != null) {
            aVar.c(false, z17, 0);
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar2 = this.f216610a;
        if (aVar2 != null) {
            aVar2.b();
        }
        this.f216610a = null;
    }

    public final void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNpsContainerState", "onHalfScreenOpen... isAnimationBegin=" + z17);
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f216610a;
        if (aVar != null) {
            aVar.c(true, z17, 0);
        }
    }

    public final void c(float f17) {
        if (f17 > 1.0f || f17 < 0.0f) {
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f216610a;
        if (aVar != null) {
            aVar.a(f17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNpsContainerState", "onHeightChanged percent：" + f17);
    }
}
