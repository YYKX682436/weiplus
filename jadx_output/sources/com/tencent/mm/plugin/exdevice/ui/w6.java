package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class w6 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView f99715a;

    public w6(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView exdeviceRankListHeaderView) {
        this.f99715a = exdeviceRankListHeaderView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView exdeviceRankListHeaderView = this.f99715a;
        exdeviceRankListHeaderView.f99357h.reset();
        com.tencent.mm.sdk.platformtools.u3.i(exdeviceRankListHeaderView.f99358i, 4000L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        this.f99715a.f99354e.setVisibility(0);
    }
}
