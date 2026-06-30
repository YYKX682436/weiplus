package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes5.dex */
public final class a8 extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.GestureDetectorOnGestureListenerC15274x151426e1 f213155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f213156e;

    public a8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.GestureDetectorOnGestureListenerC15274x151426e1 gestureDetectorOnGestureListenerC15274x151426e1, int i17) {
        this.f213155d = gestureDetectorOnGestureListenerC15274x151426e1;
        this.f213156e = i17;
    }

    @Override // wa2.z, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f213155d.f212526o = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.GestureDetectorOnGestureListenerC15274x151426e1 gestureDetectorOnGestureListenerC15274x151426e1 = this.f213155d;
        gestureDetectorOnGestureListenerC15274x151426e1.f212526o = false;
        gestureDetectorOnGestureListenerC15274x151426e1.getClass();
        if (this.f213156e == (-gestureDetectorOnGestureListenerC15274x151426e1.f212528q)) {
            gestureDetectorOnGestureListenerC15274x151426e1.m62003x764e55cc(true);
            yz5.a openCallback = gestureDetectorOnGestureListenerC15274x151426e1.getOpenCallback();
            if (openCallback != null) {
                openCallback.mo152xb9724478();
            }
            java.util.Iterator it = gestureDetectorOnGestureListenerC15274x151426e1.f212532u.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it.next()).c(true, false, 0);
            }
            return;
        }
        gestureDetectorOnGestureListenerC15274x151426e1.m62003x764e55cc(false);
        yz5.a closeCallback = gestureDetectorOnGestureListenerC15274x151426e1.getCloseCallback();
        if (closeCallback != null) {
            closeCallback.mo152xb9724478();
        }
        java.util.Iterator it6 = gestureDetectorOnGestureListenerC15274x151426e1.f212532u.iterator();
        while (it6.hasNext()) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it6.next()).c(false, false, 0);
        }
    }
}
