package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class ad implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 f291811d;

    public ad(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72) {
        this.f291811d = activityC22543x95896a72;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72 = this.f291811d;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(activityC22543x95896a72.mo55332x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
        loadAnimation.setAnimationListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.zc(this));
        activityC22543x95896a72.f291770y.startAnimation(loadAnimation);
        return java.lang.Boolean.TRUE;
    }
}
