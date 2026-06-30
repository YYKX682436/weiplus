package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.CompoundButton f9561a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.res.ColorStateList f9562b = null;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f9563c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9564d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9565e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9566f;

    public e0(android.widget.CompoundButton compoundButton) {
        this.f9561a = compoundButton;
    }

    public void a() {
        android.widget.CompoundButton compoundButton = this.f9561a;
        android.graphics.drawable.Drawable a17 = androidx.core.widget.f.a(compoundButton);
        if (a17 != null) {
            if (this.f9564d || this.f9565e) {
                android.graphics.drawable.Drawable mutate = a17.mutate();
                if (this.f9564d) {
                    f3.b.h(mutate, this.f9562b);
                }
                if (this.f9565e) {
                    f3.b.i(mutate, this.f9563c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b(android.util.AttributeSet attributeSet, int i17) {
        int resourceId;
        android.widget.CompoundButton compoundButton = this.f9561a;
        android.content.res.TypedArray obtainStyledAttributes = compoundButton.getContext().obtainStyledAttributes(attributeSet, j.a.f296185m, i17, 0);
        try {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(k.a.a(compoundButton.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(1)) {
                androidx.core.widget.e.c(compoundButton, obtainStyledAttributes.getColorStateList(1));
            }
            if (obtainStyledAttributes.hasValue(2)) {
                androidx.core.widget.e.d(compoundButton, androidx.appcompat.widget.y0.c(obtainStyledAttributes.getInt(2, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
