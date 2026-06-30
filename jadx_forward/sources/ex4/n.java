package ex4;

/* loaded from: classes3.dex */
public final class n implements com.p314xaae8f345.p3210x3857dc.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ex4.o f338757a;

    public n(ex4.o oVar) {
        this.f338757a = oVar;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public boolean a(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return true;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public void b(int i17) {
        ex4.o oVar = this.f338757a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = oVar.f338765h;
        if (c22633x83752a59 != null) {
            int mo120151x7520af94 = (int) (c22633x83752a59.mo120151x7520af94() * i17);
            android.widget.FrameLayout frameLayout = oVar.f338763f;
            int measuredHeight = frameLayout != null ? frameLayout.getMeasuredHeight() : 0;
            if (mo120151x7520af94 < measuredHeight) {
                mo120151x7520af94 = measuredHeight;
            }
            android.view.View view = oVar.f338766i;
            android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            if (layoutParams == null) {
                return;
            }
            layoutParams.height = mo120151x7520af94 + 2;
            android.view.View view2 = oVar.f338766i;
            if (view2 == null) {
                return;
            }
            view2.setLayoutParams(layoutParams);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
        android.view.View view2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        ex4.o oVar = this.f338757a;
        android.view.View view3 = oVar.f338770m;
        if ((view3 != null ? view3.getVisibility() : 8) == 0 && (view2 = oVar.f338770m) != null) {
            android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 0.0f, ((java.lang.Number) ((jz5.n) oVar.f338759b).mo141623x754a37bb()).intValue() - ((java.lang.Number) ((jz5.n) oVar.f338758a).mo141623x754a37bb()).intValue());
            translateAnimation.setDuration(80L);
            translateAnimation.setInterpolator(new android.view.animation.AccelerateInterpolator());
            translateAnimation.setAnimationListener(new ex4.i(oVar));
            view2.startAnimation(translateAnimation);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public void e(int i17, int i18, boolean z17, boolean z18, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }
}
