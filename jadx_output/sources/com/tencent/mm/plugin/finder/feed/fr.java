package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class fr extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f106771d;

    public fr(com.tencent.mm.plugin.finder.feed.kr krVar) {
        this.f106771d = krVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.feed.kr krVar = this.f106771d;
        if (krVar.P == animation) {
            krVar.P = null;
            krVar.getClass();
            krVar.R = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.feed.kr krVar = this.f106771d;
        if (krVar.P == animation) {
            krVar.P = null;
            krVar.getClass();
            krVar.R = null;
        }
    }
}
