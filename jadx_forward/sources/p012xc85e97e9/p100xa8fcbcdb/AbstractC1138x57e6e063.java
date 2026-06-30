package p012xc85e97e9.p100xa8fcbcdb;

/* renamed from: androidx.preference.DialogPreference */
/* loaded from: classes13.dex */
public abstract class AbstractC1138x57e6e063 extends p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb {
    public final java.lang.CharSequence R;
    public final java.lang.CharSequence S;
    public final android.graphics.drawable.Drawable T;
    public final java.lang.CharSequence U;
    public final java.lang.CharSequence V;
    public final int W;

    public AbstractC1138x57e6e063(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p012xc85e97e9.p100xa8fcbcdb.g0.f93350c, i17, i18);
        java.lang.String h17 = d3.r.h(obtainStyledAttributes, 9, 0);
        this.R = h17;
        if (h17 == null) {
            this.R = this.f93287n;
        }
        this.S = d3.r.h(obtainStyledAttributes, 8, 1);
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.T = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.U = d3.r.h(obtainStyledAttributes, 11, 3);
        this.V = d3.r.h(obtainStyledAttributes, 10, 4);
        this.W = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void t() {
        p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8 c1145xc0a22968;
        p012xc85e97e9.p100xa8fcbcdb.z zVar = this.f93281e.f93335i;
        if (zVar != null) {
            p012xc85e97e9.p100xa8fcbcdb.AbstractC1149x21d497cd abstractC1149x21d497cd = (p012xc85e97e9.p100xa8fcbcdb.AbstractC1149x21d497cd) zVar;
            abstractC1149x21d497cd.mo7430x19263085();
            if (abstractC1149x21d497cd.m7446xe17c5d07().m7665x7a44761a("androidx.preference.PreferenceFragment.DIALOG") != null) {
                return;
            }
            boolean z17 = this instanceof p012xc85e97e9.p100xa8fcbcdb.C1140x2319a6b2;
            java.lang.String str = this.f93291r;
            if (z17) {
                c1145xc0a22968 = new p012xc85e97e9.p100xa8fcbcdb.C1141x49ca7f2c();
                android.os.Bundle bundle = new android.os.Bundle(1);
                bundle.putString("key", str);
                c1145xc0a22968.mo7562xe26dab14(bundle);
            } else if (this instanceof p012xc85e97e9.p100xa8fcbcdb.C1142xedd26839) {
                c1145xc0a22968 = new p012xc85e97e9.p100xa8fcbcdb.C1143x7e423733();
                android.os.Bundle bundle2 = new android.os.Bundle(1);
                bundle2.putString("key", str);
                c1145xc0a22968.mo7562xe26dab14(bundle2);
            } else {
                if (!(this instanceof p012xc85e97e9.p100xa8fcbcdb.p101x21ffc6bd.AbstractC1157xa91160ec)) {
                    throw new java.lang.IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
                }
                c1145xc0a22968 = new p012xc85e97e9.p100xa8fcbcdb.C1145xc0a22968();
                android.os.Bundle bundle3 = new android.os.Bundle(1);
                bundle3.putString("key", str);
                c1145xc0a22968.mo7562xe26dab14(bundle3);
            }
            c1145xc0a22968.m7582xf54bcc03(abstractC1149x21d497cd, 0);
            c1145xc0a22968.mo7414x35dafd(abstractC1149x21d497cd.m7446xe17c5d07(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    public AbstractC1138x57e6e063(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0);
    }

    public AbstractC1138x57e6e063(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, d3.r.a(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559753dy, android.R.attr.dialogPreferenceStyle));
    }
}
