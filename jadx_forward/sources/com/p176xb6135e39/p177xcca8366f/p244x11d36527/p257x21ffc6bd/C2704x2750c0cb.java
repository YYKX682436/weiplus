package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd;

/* renamed from: com.google.android.material.internal.CheckableImageButton */
/* loaded from: classes14.dex */
public class C2704x2750c0cb extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0084x6ce1fb8a implements android.widget.Checkable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f126042g = {android.R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public boolean f126043f;

    public C2704x2750c0cb(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559827fy);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f126043f;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i17) {
        return this.f126043f ? android.view.View.mergeDrawableStates(super.onCreateDrawableState(i17 + 1), f126042g) : super.onCreateDrawableState(i17);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z17) {
        if (this.f126043f != z17) {
            this.f126043f = z17;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f126043f);
    }

    public C2704x2750c0cb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        n3.l1.l(this, new fa.a(this));
    }
}
