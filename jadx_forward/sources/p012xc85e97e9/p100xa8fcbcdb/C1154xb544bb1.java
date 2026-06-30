package p012xc85e97e9.p100xa8fcbcdb;

/* renamed from: androidx.preference.SwitchPreferenceCompat */
/* loaded from: classes13.dex */
public class C1154xb544bb1 extends p012xc85e97e9.p100xa8fcbcdb.AbstractC1155x1e3ec80 {
    public final p012xc85e97e9.p100xa8fcbcdb.l0 W;
    public java.lang.CharSequence X;
    public java.lang.CharSequence Y;

    public C1154xb544bb1(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.W = new p012xc85e97e9.p100xa8fcbcdb.l0(this);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p012xc85e97e9.p100xa8fcbcdb.g0.f93359l, i17, 0);
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
            O(view.findViewById(com.p314xaae8f345.mm.R.id.f568718nt0));
            N(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(android.view.View view) {
        boolean z17 = view instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0101x3849f3f6;
        if (z17) {
            ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0101x3849f3f6) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof android.widget.Checkable) {
            ((android.widget.Checkable) view).setChecked(this.T);
        }
        if (z17) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0101x3849f3f6 c0101x3849f3f6 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0101x3849f3f6) view;
            c0101x3849f3f6.m2792x24060eee(this.X);
            c0101x3849f3f6.m2791x5cbbce40(this.Y);
            c0101x3849f3f6.setOnCheckedChangeListener(this.W);
        }
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void s(p012xc85e97e9.p100xa8fcbcdb.f0 f0Var) {
        super.s(f0Var);
        O(f0Var.i(com.p314xaae8f345.mm.R.id.f568718nt0));
        N(f0Var.i(android.R.id.summary));
    }

    public C1154xb544bb1(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.j_);
    }
}
