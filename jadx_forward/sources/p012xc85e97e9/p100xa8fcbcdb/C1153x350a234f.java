package p012xc85e97e9.p100xa8fcbcdb;

/* renamed from: androidx.preference.SwitchPreference */
/* loaded from: classes13.dex */
public class C1153x350a234f extends p012xc85e97e9.p100xa8fcbcdb.AbstractC1155x1e3ec80 {
    public final p012xc85e97e9.p100xa8fcbcdb.k0 W;
    public java.lang.CharSequence X;
    public java.lang.CharSequence Y;

    public C1153x350a234f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.W = new p012xc85e97e9.p100xa8fcbcdb.k0(this);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p012xc85e97e9.p100xa8fcbcdb.g0.f93358k, i17, 0);
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

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void D(android.view.View view) {
        super.D(view);
        if (((android.view.accessibility.AccessibilityManager) this.f93280d.getSystemService("accessibility")).isEnabled()) {
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

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void s(p012xc85e97e9.p100xa8fcbcdb.f0 f0Var) {
        super.s(f0Var);
        O(f0Var.i(android.R.id.switch_widget));
        N(f0Var.i(android.R.id.summary));
    }

    public C1153x350a234f(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, d3.r.a(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559950ja, android.R.attr.switchPreferenceStyle));
    }
}
