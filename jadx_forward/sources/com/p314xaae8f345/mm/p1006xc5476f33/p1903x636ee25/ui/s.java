package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

/* loaded from: classes12.dex */
public class s extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final int f232309d;

    /* renamed from: e, reason: collision with root package name */
    public final int f232310e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f232311f;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.t tVar, android.view.View view, int i17) {
        this.f232311f = view;
        this.f232310e = i17;
        this.f232309d = view.getHeight();
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        int i17 = (int) (this.f232309d + ((this.f232310e - r4) * f17));
        android.view.View view = this.f232311f;
        view.getLayoutParams().height = i17;
        view.requestLayout();
    }

    @Override // android.view.animation.Animation
    public void initialize(int i17, int i18, int i19, int i27) {
        super.initialize(i17, i18, i19, i27);
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
