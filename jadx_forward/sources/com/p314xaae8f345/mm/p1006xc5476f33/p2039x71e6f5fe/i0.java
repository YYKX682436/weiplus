package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

/* loaded from: classes3.dex */
public final class i0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17262x2289077 f240273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f240274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 f240275f;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17262x2289077 c17262x2289077, java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a6357) {
        this.f240273d = c17262x2289077;
        this.f240274e = arrayList;
        this.f240275f = c17261xe88a6357;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17262x2289077 c17262x2289077 = this.f240273d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.f0 mMultiCodeMaskViewListener = c17262x2289077.getMMultiCodeMaskViewListener();
        if (mMultiCodeMaskViewListener != null) {
            mMultiCodeMaskViewListener.a(this.f240274e, this.f240275f, true);
        }
        c17262x2289077.a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }
}
