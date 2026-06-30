package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class x6 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView f99723a;

    public x6(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView exdeviceRankListHeaderView) {
        this.f99723a = exdeviceRankListHeaderView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f99723a.f99354e.setVisibility(4);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        this.f99723a.f99354e.setVisibility(0);
    }
}
