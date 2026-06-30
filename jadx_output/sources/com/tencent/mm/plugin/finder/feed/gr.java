package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class gr extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f106859d;

    public gr(com.tencent.mm.plugin.finder.feed.kr krVar) {
        this.f106859d = krVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.feed.kr krVar = this.f106859d;
        if (krVar.Q == animation) {
            krVar.Q = null;
        }
    }
}
