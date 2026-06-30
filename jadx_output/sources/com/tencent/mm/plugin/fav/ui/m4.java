package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class m4 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavPostVoiceUI f101270a;

    public m4(com.tencent.mm.plugin.fav.ui.FavPostVoiceUI favPostVoiceUI) {
        this.f101270a = favPostVoiceUI;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f101270a.f100383r.post(new com.tencent.mm.plugin.fav.ui.l4(this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
