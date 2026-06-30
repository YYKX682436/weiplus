package androidx.preference;

/* loaded from: classes13.dex */
public class SwitchPreferenceCompat extends androidx.preference.TwoStatePreference {
    public final androidx.preference.l0 W;
    public java.lang.CharSequence X;
    public java.lang.CharSequence Y;

    public SwitchPreferenceCompat(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.W = new androidx.preference.l0(this);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.g0.f11826l, i17, 0);
        this.R = d3.r.h(obtainStyledAttributes, 7, 0);
        if (this.T) {
            n();
        }
        this.S = d3.r.h(obtainStyledAttributes, 6, 1);
        if (!this.T) {
            n();
        }
        this.X = d3.r.h(obtainStyledAttributes, 9, 3);
        n();
        this.Y = d3.r.h(obtainStyledAttributes, 8, 4);
        n();
        this.V = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void D(android.view.View view) {
        super.D(view);
        if (((android.view.accessibility.AccessibilityManager) this.f11747d.getSystemService("accessibility")).isEnabled()) {
            O(view.findViewById(com.tencent.mm.R.id.f487185nt0));
            N(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(android.view.View view) {
        boolean z17 = view instanceof androidx.appcompat.widget.SwitchCompat;
        if (z17) {
            ((androidx.appcompat.widget.SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof android.widget.Checkable) {
            ((android.widget.Checkable) view).setChecked(this.T);
        }
        if (z17) {
            androidx.appcompat.widget.SwitchCompat switchCompat = (androidx.appcompat.widget.SwitchCompat) view;
            switchCompat.setTextOn(this.X);
            switchCompat.setTextOff(this.Y);
            switchCompat.setOnCheckedChangeListener(this.W);
        }
    }

    @Override // androidx.preference.Preference
    public void s(androidx.preference.f0 f0Var) {
        super.s(f0Var);
        O(f0Var.i(com.tencent.mm.R.id.f487185nt0));
        N(f0Var.i(android.R.id.summary));
    }

    public SwitchPreferenceCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.j_);
    }
}
