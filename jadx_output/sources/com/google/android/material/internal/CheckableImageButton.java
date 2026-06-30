package com.google.android.material.internal;

/* loaded from: classes14.dex */
public class CheckableImageButton extends androidx.appcompat.widget.AppCompatImageButton implements android.widget.Checkable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f44509g = {android.R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public boolean f44510f;

    public CheckableImageButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478294fy);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f44510f;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i17) {
        return this.f44510f ? android.view.View.mergeDrawableStates(super.onCreateDrawableState(i17 + 1), f44509g) : super.onCreateDrawableState(i17);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z17) {
        if (this.f44510f != z17) {
            this.f44510f = z17;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f44510f);
    }

    public CheckableImageButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        n3.l1.l(this, new fa.a(this));
    }
}
