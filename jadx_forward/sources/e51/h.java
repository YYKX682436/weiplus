package e51;

/* loaded from: classes10.dex */
public class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e51.j f331112d;

    public h(e51.j jVar) {
        this.f331112d = jVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        long currentPlayTime = valueAnimator.getCurrentPlayTime();
        e51.j jVar = this.f331112d;
        jVar.i(currentPlayTime);
        if (((java.util.ArrayList) jVar.f331119g).size() != 0 || currentPlayTime < jVar.f331123k) {
            jVar.f331116d.a(jVar.f331117e);
        } else {
            jVar.h();
        }
    }
}
