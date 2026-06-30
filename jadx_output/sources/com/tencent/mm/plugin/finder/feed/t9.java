package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class t9 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.v9 f109048d;

    public t9(com.tencent.mm.plugin.finder.feed.v9 v9Var) {
        this.f109048d = v9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.feed.v9 v9Var = this.f109048d;
        v9Var.f110889r = null;
        v9Var.f110891t = null;
    }
}
