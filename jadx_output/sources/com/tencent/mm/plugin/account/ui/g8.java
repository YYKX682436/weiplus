package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public final class g8 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f73880d;

    public g8(yz5.a aVar) {
        this.f73880d = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        yz5.a aVar = this.f73880d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
