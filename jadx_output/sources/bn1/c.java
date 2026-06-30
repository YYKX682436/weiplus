package bn1;

/* loaded from: classes14.dex */
public final class c extends bn1.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.audio.view.BizAudioPlayerDraggableLayout f22788d;

    public c(com.tencent.mm.plugin.audio.view.BizAudioPlayerDraggableLayout bizAudioPlayerDraggableLayout) {
        this.f22788d = bizAudioPlayerDraggableLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f22788d.setSettling(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f22788d.setSettling(false);
    }
}
