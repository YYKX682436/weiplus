package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd;

/* renamed from: com.google.android.material.internal.VisibilityAwareImageButton */
/* loaded from: classes15.dex */
public class C2711x10f79281 extends android.widget.ImageButton {

    /* renamed from: d, reason: collision with root package name */
    public int f126056d;

    public C2711x10f79281(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(int i17, boolean z17) {
        super.setVisibility(i17);
        if (z17) {
            this.f126056d = i17;
        }
    }

    /* renamed from: getUserSetVisibility */
    public final int m20319x4d6cf653() {
        return this.f126056d;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i17) {
        a(i17, true);
    }

    public C2711x10f79281(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f126056d = getVisibility();
    }
}
