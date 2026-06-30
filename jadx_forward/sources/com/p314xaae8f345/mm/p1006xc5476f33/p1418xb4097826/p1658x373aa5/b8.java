package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes5.dex */
public final class b8 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.GestureDetectorOnGestureListenerC15274x151426e1 f213233d;

    public b8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.GestureDetectorOnGestureListenerC15274x151426e1 gestureDetectorOnGestureListenerC15274x151426e1) {
        this.f213233d = gestureDetectorOnGestureListenerC15274x151426e1;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.GestureDetectorOnGestureListenerC15274x151426e1 gestureDetectorOnGestureListenerC15274x151426e1 = this.f213233d;
        android.view.View view = gestureDetectorOnGestureListenerC15274x151426e1.f212522h;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        float translationY = (1.0f * view.getTranslationY()) / gestureDetectorOnGestureListenerC15274x151426e1.f212525n;
        java.util.Iterator it6 = gestureDetectorOnGestureListenerC15274x151426e1.f212532u.iterator();
        while (it6.hasNext()) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it6.next()).a(translationY);
        }
        yz5.l translationCallback = gestureDetectorOnGestureListenerC15274x151426e1.getTranslationCallback();
        if (translationCallback != null) {
            translationCallback.mo146xb9724478(java.lang.Float.valueOf(translationY));
        }
    }
}
