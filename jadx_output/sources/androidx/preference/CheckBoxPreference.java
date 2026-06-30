package androidx.preference;

/* loaded from: classes13.dex */
public class CheckBoxPreference extends androidx.preference.TwoStatePreference {
    public final androidx.preference.a W;

    public CheckBoxPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.W = new androidx.preference.a(this);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.g0.f11816b, i17, 0);
        this.R = d3.r.h(obtainStyledAttributes, 5, 0);
        if (this.T) {
            n();
        }
        this.S = d3.r.h(obtainStyledAttributes, 4, 1);
        if (!this.T) {
            n();
        }
        this.V = obtainStyledAttributes.getBoolean(3, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void D(android.view.View view) {
        super.D(view);
        if (((android.view.accessibility.AccessibilityManager) this.f11747d.getSystemService("accessibility")).isEnabled()) {
            O(view.findViewById(android.R.id.checkbox));
            N(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(android.view.View view) {
        boolean z17 = view instanceof android.widget.CompoundButton;
        if (z17) {
            ((android.widget.CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof android.widget.Checkable) {
            ((android.widget.Checkable) view).setChecked(this.T);
        }
        if (z17) {
            ((android.widget.CompoundButton) view).setOnCheckedChangeListener(this.W);
        }
    }

    @Override // androidx.preference.Preference
    public void s(androidx.preference.f0 f0Var) {
        super.s(f0Var);
        O(f0Var.i(android.R.id.checkbox));
        N(f0Var.i(android.R.id.summary));
    }

    public CheckBoxPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, d3.r.a(context, com.tencent.mm.R.attr.f478142bq, android.R.attr.checkBoxPreferenceStyle));
    }
}
