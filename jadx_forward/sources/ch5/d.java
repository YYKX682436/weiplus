package ch5;

/* loaded from: classes3.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 f123077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f123078e;

    public d(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 c22418xd23ce184, yz5.l lVar) {
        this.f123077d = c22418xd23ce184;
        this.f123078e = lVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        int m80694x58bb39e6;
        int m80694x58bb39e62;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Integer num = animatedValue instanceof java.lang.Integer ? (java.lang.Integer) animatedValue : null;
        int intValue = num != null ? num.intValue() : 0;
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22418xd23ce184 c22418xd23ce184 = this.f123077d;
        c22418xd23ce184.f290366m = intValue;
        c22418xd23ce184.requestLayout();
        yz5.l dragTranslationListener = c22418xd23ce184.getDragTranslationListener();
        if (dragTranslationListener != null) {
            m80694x58bb39e6 = c22418xd23ce184.m80694x58bb39e6();
            m80694x58bb39e62 = c22418xd23ce184.m80694x58bb39e6();
            dragTranslationListener.mo146xb9724478(java.lang.Float.valueOf((m80694x58bb39e6 - intValue) / m80694x58bb39e62));
        }
        yz5.l lVar = this.f123078e;
        if (lVar != null) {
        }
    }
}
