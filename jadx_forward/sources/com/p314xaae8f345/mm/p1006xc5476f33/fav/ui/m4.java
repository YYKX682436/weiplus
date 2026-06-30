package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class m4 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13569x56faec8b f182803a;

    public m4(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13569x56faec8b activityC13569x56faec8b) {
        this.f182803a = activityC13569x56faec8b;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f182803a.f181916r.post(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.l4(this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
