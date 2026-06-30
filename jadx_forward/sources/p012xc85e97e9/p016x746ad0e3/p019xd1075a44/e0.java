package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.CompoundButton f91094a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.res.ColorStateList f91095b = null;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f91096c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f91097d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f91098e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f91099f;

    public e0(android.widget.CompoundButton compoundButton) {
        this.f91094a = compoundButton;
    }

    public void a() {
        android.widget.CompoundButton compoundButton = this.f91094a;
        android.graphics.drawable.Drawable a17 = p012xc85e97e9.p075x2eaf9f.p079xd1075a44.f.a(compoundButton);
        if (a17 != null) {
            if (this.f91097d || this.f91098e) {
                android.graphics.drawable.Drawable mutate = a17.mutate();
                if (this.f91097d) {
                    f3.b.h(mutate, this.f91095b);
                }
                if (this.f91098e) {
                    f3.b.i(mutate, this.f91096c);
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
        android.widget.CompoundButton compoundButton = this.f91094a;
        android.content.res.TypedArray obtainStyledAttributes = compoundButton.getContext().obtainStyledAttributes(attributeSet, j.a.f377718m, i17, 0);
        try {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(k.a.a(compoundButton.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(1)) {
                p012xc85e97e9.p075x2eaf9f.p079xd1075a44.e.c(compoundButton, obtainStyledAttributes.getColorStateList(1));
            }
            if (obtainStyledAttributes.hasValue(2)) {
                p012xc85e97e9.p075x2eaf9f.p079xd1075a44.e.d(compoundButton, p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y0.c(obtainStyledAttributes.getInt(2, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
