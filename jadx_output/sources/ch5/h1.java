package ch5;

/* loaded from: classes14.dex */
public final class h1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f41575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout f41576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f41577f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f41578g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f41579h;

    public h1(yz5.a aVar, com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout, yz5.a aVar2, android.animation.ValueAnimator valueAnimator, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f41575d = aVar;
        this.f41576e = wSHalfScreenDraggableLayout;
        this.f41577f = aVar2;
        this.f41578g = valueAnimator;
        this.f41579h = animatorUpdateListener;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout = this.f41576e;
        yz5.p dragStatusBlock = wSHalfScreenDraggableLayout.getDragStatusBlock();
        if (dragStatusBlock != null) {
            dragStatusBlock.invoke("onHalfScreenHeightDidChange", com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout.a(wSHalfScreenDraggableLayout));
        }
        yz5.a aVar = this.f41577f;
        if (aVar != null) {
        }
        android.animation.ValueAnimator valueAnimator = this.f41578g;
        valueAnimator.removeListener(this);
        valueAnimator.removeUpdateListener(this.f41579h);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
        yz5.a aVar = this.f41575d;
        if (aVar != null) {
        }
    }
}
