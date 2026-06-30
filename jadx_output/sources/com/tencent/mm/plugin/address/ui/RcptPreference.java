package com.tencent.mm.plugin.address.ui;

/* loaded from: classes.dex */
public class RcptPreference extends com.tencent.mm.ui.base.preference.Preference {
    public com.tencent.mm.plugin.address.model.RcptItem L;

    public RcptPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        if (this.L == null) {
            return;
        }
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.pte)).setText(this.L.f74371d);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f197770d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.tencent.mm.R.layout.bzv, viewGroup2);
        return u17;
    }

    public RcptPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.tencent.mm.R.layout.byv;
    }
}
