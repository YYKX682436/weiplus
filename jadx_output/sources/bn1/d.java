package bn1;

/* loaded from: classes14.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.audio.view.BizAudioPlayerDraggableLayout f22798d;

    public d(com.tencent.mm.plugin.audio.view.BizAudioPlayerDraggableLayout bizAudioPlayerDraggableLayout) {
        this.f22798d = bizAudioPlayerDraggableLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.audio.view.BizAudioPlayerDraggableLayout bizAudioPlayerDraggableLayout = this.f22798d;
        bizAudioPlayerDraggableLayout.i(bizAudioPlayerDraggableLayout.getTranslation(), "settle");
    }
}
