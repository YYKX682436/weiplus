package ug5;

/* loaded from: classes3.dex */
public abstract class h implements android.animation.Animator.AnimatorListener, android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public ug5.v f509146d;

    public void a(android.animation.Animator animation, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
    }

    public void b(ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
    }

    public void c(android.animation.Animator animation, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
    }

    public void d(float f17, android.graphics.Rect clipRect, android.graphics.Rect canvasRect, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clipRect, "clipRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvasRect, "canvasRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
    }

    public void e(android.content.Context context, boolean z17, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
    }

    public void f() {
    }

    public void g(android.content.Context context, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        this.f509146d = performer;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        if (this.f509146d != null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37656x8d5fc89e);
        throw null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        ug5.v vVar = this.f509146d;
        if (vVar != null) {
            a(animation, vVar);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37656x8d5fc89e);
            throw null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        if (this.f509146d != null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37656x8d5fc89e);
        throw null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        ug5.v vVar = this.f509146d;
        if (vVar != null) {
            c(animation, vVar);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37656x8d5fc89e);
            throw null;
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        if (this.f509146d != null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37656x8d5fc89e);
        throw null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animation, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation, z17);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animation, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationStart(animation, z17);
    }
}
