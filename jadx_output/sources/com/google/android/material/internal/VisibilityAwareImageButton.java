package com.google.android.material.internal;

/* loaded from: classes15.dex */
public class VisibilityAwareImageButton extends android.widget.ImageButton {

    /* renamed from: d, reason: collision with root package name */
    public int f44523d;

    public VisibilityAwareImageButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(int i17, boolean z17) {
        super.setVisibility(i17);
        if (z17) {
            this.f44523d = i17;
        }
    }

    public final int getUserSetVisibility() {
        return this.f44523d;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i17) {
        a(i17, true);
    }

    public VisibilityAwareImageButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f44523d = getVisibility();
    }
}
