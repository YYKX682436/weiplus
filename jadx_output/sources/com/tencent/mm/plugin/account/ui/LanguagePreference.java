package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class LanguagePreference extends com.tencent.mm.ui.base.preference.Preference {
    public com.tencent.mm.plugin.account.ui.f3 L;

    public LanguagePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void M(com.tencent.mm.plugin.account.ui.f3 f3Var) {
        if (f3Var != null) {
            java.lang.String str = f3Var.f73840c;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                this.L = f3Var;
                C(str);
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LanguagePreference", "setInfo info error");
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.hsx);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.nh8);
        if ((weImageView != null) & (textView != null)) {
            textView.setText(this.L.f73838a);
            weImageView.setVisibility(this.L.f73841d ? 0 : 8);
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.qqs);
            if (textView2 != null) {
                java.lang.String str = this.L.f73839b;
                if (android.text.TextUtils.isEmpty(str)) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    textView2.setText(str);
                }
            }
        }
        E(8);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f197770d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.tencent.mm.R.layout.bzn, viewGroup2);
        return u17;
    }

    public LanguagePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.tencent.mm.R.layout.byv;
    }
}
