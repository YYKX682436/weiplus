package com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui;

/* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailFooterPreference */
/* loaded from: classes.dex */
public class ViewOnClickListenerC19554x3dc48b7a extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb implements android.view.View.OnClickListener {
    public final android.view.LayoutInflater L;
    public android.widget.TextView M;
    public android.widget.TextView N;
    public android.view.View.OnClickListener P;

    public ViewOnClickListenerC19554x3dc48b7a(android.content.Context context) {
        this(context, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditDetailFooterPreference", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View.OnClickListener onClickListener = this.P;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditDetailFooterPreference", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        this.M = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.pfm);
        this.N = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.pfk);
        this.M.setOnClickListener(this);
        this.N.setOnClickListener(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        this.L.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d8r, viewGroup2);
        return u17;
    }

    public ViewOnClickListenerC19554x3dc48b7a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewOnClickListenerC19554x3dc48b7a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}
