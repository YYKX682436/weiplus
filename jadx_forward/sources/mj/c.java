package mj;

/* loaded from: classes14.dex */
public class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f408487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mj.d f408488e;

    public c(mj.d dVar, android.view.View view) {
        this.f408488e = dVar;
        this.f408487d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        mj.d dVar = this.f408488e;
        mj.i iVar = dVar.f408494i;
        if (iVar.f408506c) {
            iVar.f408505b.x = ((java.lang.Integer) valueAnimator.getAnimatedValue("trans")).intValue();
            mj.i iVar2 = dVar.f408494i;
            iVar2.f408504a.updateViewLayout(this.f408487d, iVar2.f408505b);
        }
    }
}
