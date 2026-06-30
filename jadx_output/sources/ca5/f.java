package ca5;

/* loaded from: classes5.dex */
public class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.transvoice.ui.SoundWaveView f40086e;

    public f(com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView, int i17) {
        this.f40086e = soundWaveView;
        this.f40085d = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView = this.f40086e;
        soundWaveView.f196430g.set(this.f40085d, (java.lang.Integer) valueAnimator.getAnimatedValue());
        soundWaveView.invalidate();
    }
}
