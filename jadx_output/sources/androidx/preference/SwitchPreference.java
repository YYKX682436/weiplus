package androidx.preference;

/* loaded from: classes13.dex */
public class SwitchPreference extends androidx.preference.TwoStatePreference {
    public final androidx.preference.k0 W;
    public java.lang.CharSequence X;
    public java.lang.CharSequence Y;

    public SwitchPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.W = new androidx.preference.k0(this);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.g0.f11825k, i17, 0);
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
            O(view.findViewById(android.R.id.switch_widget));
            N(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(android.view.View view) {
        boolean z17 = view instanceof android.widget.Switch;
        if (z17) {
            ((android.widget.Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof android.widget.Checkable) {
            ((android.widget.Checkable) view).setChecked(this.T);
        }
        if (z17) {
            android.widget.Switch r47 = (android.widget.Switch) view;
            r47.setTextOn(this.X);
            r47.setTextOff(this.Y);
            r47.setOnCheckedChangeListener(this.W);
        }
    }

    @Override // androidx.preference.Preference
    public void s(androidx.preference.f0 f0Var) {
        super.s(f0Var);
        O(f0Var.i(android.R.id.switch_widget));
        N(f0Var.i(android.R.id.summary));
    }

    public SwitchPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, d3.r.a(context, com.tencent.mm.R.attr.f478417ja, android.R.attr.switchPreferenceStyle));
    }
}
