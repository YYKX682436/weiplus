package d04;

/* loaded from: classes8.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17325xac7c40dc f306911d;

    public b(float f17, float f18, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17325xac7c40dc c17325xac7c40dc) {
        this.f306911d = c17325xac7c40dc;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        ((java.lang.Float) animatedValue).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17325xac7c40dc c17325xac7c40dc = this.f306911d;
        boolean z17 = c17325xac7c40dc.D;
        c17325xac7c40dc.canVibrate = true;
        c17325xac7c40dc.c(c17325xac7c40dc.f241204i);
        if (z17) {
            if (c17325xac7c40dc.f241212t != 2) {
                c17325xac7c40dc.f241212t = 2;
                d04.i3 i3Var = c17325xac7c40dc.f241211s;
                if (i3Var != null) {
                    i3Var.a(2);
                    return;
                }
                return;
            }
            return;
        }
        if (z17 || c17325xac7c40dc.f241212t == 3) {
            return;
        }
        c17325xac7c40dc.f241212t = 3;
        d04.i3 i3Var2 = c17325xac7c40dc.f241211s;
        if (i3Var2 != null) {
            i3Var2.a(3);
        }
    }
}
