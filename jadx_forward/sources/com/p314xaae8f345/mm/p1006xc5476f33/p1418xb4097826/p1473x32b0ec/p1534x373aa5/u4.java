package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class u4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14313x19517c77 f198240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f198241e;

    public u4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14313x19517c77 c14313x19517c77, yz5.a aVar) {
        this.f198240d = c14313x19517c77;
        this.f198241e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f198240d.bringToFront();
        yz5.a aVar = this.f198241e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f198240d.bringToFront();
        yz5.a aVar = this.f198241e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
