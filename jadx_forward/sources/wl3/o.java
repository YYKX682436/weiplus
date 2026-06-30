package wl3;

/* loaded from: classes15.dex */
public class o implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16641x95e58cfe f528609d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16641x95e58cfe c16641x95e58cfe) {
        this.f528609d = c16641x95e58cfe;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16641x95e58cfe c16641x95e58cfe = this.f528609d;
        c16641x95e58cfe.D = floatValue;
        c16641x95e58cfe.invalidate();
    }
}
