package ca5;

/* loaded from: classes14.dex */
public class g implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.transvoice.ui.SoundWaveView f40088e;

    public g(com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView, int i17) {
        this.f40088e = soundWaveView;
        this.f40087d = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView = this.f40088e;
        if (ca5.i.WAITING == soundWaveView.f196428e) {
            if (this.f40087d == soundWaveView.f196431h.size() - 1 && soundWaveView.isShown()) {
                java.util.Iterator it = soundWaveView.f196431h.iterator();
                while (it.hasNext()) {
                    ((android.animation.AnimatorSet) it.next()).start();
                }
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
