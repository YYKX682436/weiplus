package com.tencent.mm.plugin.appbrand.backgroundrunning.preference;

/* loaded from: classes3.dex */
public class AppBrandAuthPreference extends com.tencent.mm.ui.base.preference.Preference {
    public boolean L;
    public java.lang.String M;
    public android.widget.TextView N;
    public android.widget.CheckBox P;

    public AppBrandAuthPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void M(boolean z17) {
        this.L = z17;
        android.widget.CheckBox checkBox = this.P;
        if (checkBox != null) {
            checkBox.setChecked(z17);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.btf);
        this.P = checkBox;
        if (checkBox != null) {
            checkBox.setChecked(this.L);
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.a7v);
        this.N = textView;
        if (textView != null && !com.tencent.mm.sdk.platformtools.t8.K0(this.M)) {
            this.N.setText(this.M);
        }
        E(8);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        ((android.view.LayoutInflater) this.f197770d.getSystemService("layout_inflater")).inflate(com.tencent.mm.R.layout.f488068fz, viewGroup2);
        return u17;
    }

    public AppBrandAuthPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = false;
        this.G = com.tencent.mm.R.layout.byv;
    }
}
