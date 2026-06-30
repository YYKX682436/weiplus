package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class ld implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Animatable2 f171386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12699x37a66562 f171387e;

    public ld(android.graphics.drawable.Animatable2 animatable2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12699x37a66562 c12699x37a66562) {
        this.f171386d = animatable2;
        this.f171387e = c12699x37a66562;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        boolean verifyDrawable;
        android.graphics.drawable.Animatable2 animatable2 = this.f171386d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatable2, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12699x37a66562 c12699x37a66562 = this.f171387e;
        verifyDrawable = c12699x37a66562.verifyDrawable((android.graphics.drawable.Drawable) animatable2);
        if (verifyDrawable && animatable2.isRunning()) {
            ((android.graphics.drawable.Drawable) animatable2).invalidateSelf();
            c12699x37a66562.postOnAnimation(this);
        }
    }
}
