package ch5;

/* loaded from: classes14.dex */
public final class i1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c f123118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f123119e;

    public i1(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c c22426x8efb1b1c, yz5.l lVar) {
        this.f123118d = c22426x8efb1b1c;
        this.f123119e = lVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Integer num = animatedValue instanceof java.lang.Integer ? (java.lang.Integer) animatedValue : null;
        int intValue = num != null ? num.intValue() : 0;
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c c22426x8efb1b1c = this.f123118d;
        c22426x8efb1b1c.getClass();
        android.view.View view = c22426x8efb1b1c.f290379h;
        if (view != null) {
            view.setTranslationY(intValue);
        }
        yz5.l dragTranslationListener = c22426x8efb1b1c.getDragTranslationListener();
        if (dragTranslationListener != null) {
            dragTranslationListener.mo146xb9724478(java.lang.Float.valueOf((c22426x8efb1b1c.m80705x58bb39e6() - intValue) / c22426x8efb1b1c.f290383o));
        }
        yz5.p dragStatusBlock = c22426x8efb1b1c.getDragStatusBlock();
        if (dragStatusBlock != null) {
            dragStatusBlock.mo149xb9724478("onHalfScreenHeightIsChanging", com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c.a(c22426x8efb1b1c));
        }
        yz5.l lVar = this.f123119e;
        if (lVar != null) {
        }
    }
}
