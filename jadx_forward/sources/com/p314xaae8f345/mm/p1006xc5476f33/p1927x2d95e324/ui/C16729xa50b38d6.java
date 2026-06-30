package com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui;

/* renamed from: com.tencent.mm.plugin.nearlife.ui.LoadingMoreView */
/* loaded from: classes3.dex */
public class C16729xa50b38d6 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f233792d;

    public C16729xa50b38d6(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bpu, (android.view.ViewGroup) this, true);
        this.f233792d = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.i17);
        ((android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.im9)).setVisibility(0);
        android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(1000L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
        this.f233792d.startAnimation(rotateAnimation);
    }
}
