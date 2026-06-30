package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class vk implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl f217785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f217786e;

    public vk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar, float f17) {
        this.f217785d = blVar;
        this.f217786e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15275x4b820d74 c15275x4b820d74 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15275x4b820d74) this.f217785d.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nuq);
        if (c15275x4b820d74 != null) {
            c15275x4b820d74.m62008x68ad0fc7(animatedFraction * this.f217786e);
        }
    }
}
