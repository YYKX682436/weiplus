package p012xc85e97e9.p100xa8fcbcdb;

/* renamed from: androidx.preference.CheckBoxPreference */
/* loaded from: classes13.dex */
public class C1137x1c1b08fe extends p012xc85e97e9.p100xa8fcbcdb.AbstractC1155x1e3ec80 {
    public final p012xc85e97e9.p100xa8fcbcdb.a W;

    public C1137x1c1b08fe(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.W = new p012xc85e97e9.p100xa8fcbcdb.a(this);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p012xc85e97e9.p100xa8fcbcdb.g0.f93349b, i17, 0);
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

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void D(android.view.View view) {
        super.D(view);
        if (((android.view.accessibility.AccessibilityManager) this.f93280d.getSystemService("accessibility")).isEnabled()) {
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

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void s(p012xc85e97e9.p100xa8fcbcdb.f0 f0Var) {
        super.s(f0Var);
        O(f0Var.i(android.R.id.checkbox));
        N(f0Var.i(android.R.id.summary));
    }

    public C1137x1c1b08fe(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, d3.r.a(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559675bq, android.R.attr.checkBoxPreferenceStyle));
    }
}
