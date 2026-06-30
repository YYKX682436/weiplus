package mp5;

/* loaded from: classes9.dex */
public class e implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mp5.g f412011d;

    public e(mp5.g gVar) {
        this.f412011d = gVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayKeyBoard", "show keyboard anim end");
        mp5.g gVar = this.f412011d;
        if (!gVar.f412014d) {
            gVar.f412015e.f295347r.setVisibility(0);
            gVar.f412015e.f295353x.setVisibility(4);
        }
        if (gVar.f412015e.E != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayKeyBoard", "do nextAction");
            gVar.f412015e.E.run();
            gVar.f412015e.E = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        mp5.g gVar = this.f412011d;
        gVar.f412015e.f295352w.setVisibility(0);
        if (gVar.f412014d) {
            gVar.f412015e.f295347r.setVisibility(0);
        } else {
            gVar.f412015e.f295347r.setVisibility(4);
        }
    }
}
