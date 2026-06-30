package nn5;

/* loaded from: classes15.dex */
public final class b extends un5.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.View view) {
        super(view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }

    @Override // un5.b, on5.b
    public android.animation.ValueAnimator.AnimatorUpdateListener a(int i17) {
        if (i17 == 0) {
            return null;
        }
        if ((i17 >= 0 || !this.f511030i.canScrollHorizontally(1)) && (i17 <= 0 || !this.f511030i.canScrollHorizontally(-1))) {
            return null;
        }
        this.f511027f = i17;
        return this;
    }

    @Override // un5.b
    public tn5.g e() {
        return new nn5.a();
    }

    @Override // un5.b, android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        try {
            android.view.View view = this.f511030i;
            if (view instanceof android.widget.AbsListView) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.AbsListView");
                ((android.widget.AbsListView) view).scrollListBy(intValue - this.f511027f);
            } else {
                view.scrollBy(intValue - this.f511027f, 0);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("HRefreshCenterWrapper", "", e17);
        }
        this.f511027f = intValue;
    }
}
