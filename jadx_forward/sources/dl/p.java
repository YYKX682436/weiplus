package dl;

/* loaded from: classes10.dex */
public class p implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl.t f316649d;

    public p(dl.t tVar) {
        this.f316649d = tVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f316649d.E = false;
        animator.removeAllListeners();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        dl.t tVar = this.f316649d;
        tVar.E = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CropArtist", "launchHideNineGridJob >> show box end");
        tVar.M();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        dl.t tVar = this.f316649d;
        tVar.P = true;
        tVar.E = true;
    }
}
