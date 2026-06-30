package bn1;

/* loaded from: classes14.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.audio.view.BizAudioPlayerDraggableLayout f22785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f22786e;

    public b(com.tencent.mm.plugin.audio.view.BizAudioPlayerDraggableLayout bizAudioPlayerDraggableLayout, float f17) {
        this.f22785d = bizAudioPlayerDraggableLayout;
        this.f22786e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f22785d.i(this.f22786e, "settle");
    }
}
