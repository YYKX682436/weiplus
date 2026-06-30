package ng2;

/* loaded from: classes10.dex */
public final class k implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng2.s f418504d;

    public k(ng2.s sVar) {
        this.f418504d = sVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        ng2.s sVar = this.f418504d;
        int i17 = sVar.q().top - ((int) ((sVar.q().top - sVar.s().top) * floatValue));
        int i18 = sVar.q().left - ((int) ((sVar.q().left - sVar.s().left) * floatValue));
        int width = sVar.q().width() - ((int) ((sVar.q().width() - sVar.s().width()) * floatValue));
        int height = sVar.q().height() - ((int) (floatValue * (sVar.q().height() - sVar.s().height())));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = sVar.f400106t;
        android.view.ViewGroup.LayoutParams layoutParams = c22646x1e9ca55 != null ? c22646x1e9ca55.getLayoutParams() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i17;
        marginLayoutParams.leftMargin = i18;
        marginLayoutParams.width = width;
        marginLayoutParams.height = height;
        ig2.q qVar = sVar.f418520v;
        if (qVar != null) {
            qVar.a(width, height);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca552 = sVar.f400106t;
        if (c22646x1e9ca552 != null) {
            c22646x1e9ca552.requestLayout();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f400090e, "topMargin = " + marginLayoutParams.topMargin + " leftMargin = " + marginLayoutParams.leftMargin + " width = " + width + " height = " + height);
    }
}
