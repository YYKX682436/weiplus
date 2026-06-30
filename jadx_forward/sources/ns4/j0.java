package ns4;

/* loaded from: classes3.dex */
public final class j0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.p0 f421085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f421086e;

    public j0(ns4.p0 p0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f421085d = p0Var;
        this.f421086e = z2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
        if (com.p314xaae8f345.mm.ui.w9.c(this.f421085d.f421141a) || com.p314xaae8f345.mm.ui.bk.g0() || com.p314xaae8f345.mm.ui.bk.f0() || !fp.h.a(30)) {
            return;
        }
        android.view.View view = this.f421086e.f293591g;
        java.lang.Object animatedValue = anim.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setPadding(0, 0, 0, ((java.lang.Integer) animatedValue).intValue());
    }
}
