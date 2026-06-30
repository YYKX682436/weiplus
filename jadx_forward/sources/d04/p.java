package d04;

/* loaded from: classes13.dex */
public final class p implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb f307015d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb c17326x8613bffb) {
        this.f307015d = c17326x8613bffb;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb c17326x8613bffb = this.f307015d;
        android.widget.ImageView imageView = c17326x8613bffb.f241223x;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanLineImageView");
            throw null;
        }
        imageView.setTranslationY(floatValue);
        float height = c17326x8613bffb.T.height() * c17326x8613bffb.R;
        android.graphics.Rect rect = c17326x8613bffb.T;
        float f17 = floatValue - rect.top;
        if (f17 <= height) {
            float f18 = 1.0f - ((height - f17) / height);
            android.widget.ImageView imageView2 = c17326x8613bffb.f241223x;
            if (imageView2 != null) {
                imageView2.setAlpha(f18);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanLineImageView");
                throw null;
            }
        }
        float f19 = 1;
        if (f17 < rect.height() * (f19 - c17326x8613bffb.R)) {
            android.widget.ImageView imageView3 = c17326x8613bffb.f241223x;
            if (imageView3 != null) {
                imageView3.setAlpha(1.0f);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanLineImageView");
                throw null;
            }
        }
        float height2 = 1.0f - ((f17 - (c17326x8613bffb.T.height() * (f19 - c17326x8613bffb.R))) / height);
        android.widget.ImageView imageView4 = c17326x8613bffb.f241223x;
        if (imageView4 != null) {
            imageView4.setAlpha(height2);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanLineImageView");
            throw null;
        }
    }
}
