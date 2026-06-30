package mp5;

/* loaded from: classes9.dex */
public class a implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f412003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f412004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 f412005f;

    public a(com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223, int i17, boolean z17) {
        this.f412005f = c22894x55bf3223;
        this.f412003d = i17;
        this.f412004e = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayKeyBoard", "hide keyboard anim end");
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f412005f;
        c22894x55bf3223.f295352w.setVisibility(4);
        android.widget.LinearLayout linearLayout = c22894x55bf3223.f295352w;
        linearLayout.setTranslationY(linearLayout.getTranslationY() - this.f412003d);
        if (this.f412004e) {
            c22894x55bf3223.setVisibility(8);
        }
        if (c22894x55bf3223.E != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayKeyBoard", "do nextAction");
            c22894x55bf3223.E.run();
            c22894x55bf3223.E = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
