package ku3;

/* loaded from: classes3.dex */
public final class r1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.z1 f393909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f393910e;

    public r1(ku3.z1 z1Var, int i17) {
        this.f393909d = z1Var;
        this.f393910e = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation, z17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doFrameShaderAni finish >> ");
        ku3.z1 z1Var = this.f393909d;
        sb6.append(z1Var.c().getY());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordFrameShaderPlugin", sb6.toString());
        jz5.g gVar = z1Var.f394030h;
        java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) mo141623x754a37bb).getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = this.f393910e;
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((android.view.View) mo141623x754a37bb2).setLayoutParams(layoutParams2);
    }
}
