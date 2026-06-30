package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.RadioCheckPreference */
/* loaded from: classes.dex */
public class C21569x819dd6a8 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.widget.CheckBox L;
    public android.widget.TextView M;
    public int N;
    public java.lang.String P;
    public int Q;
    public final int R;

    public C21569x819dd6a8(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        E(8);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.lhx);
        this.L = checkBox;
        checkBox.setChecked(false);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o_v);
        this.M = textView;
        java.lang.String str = this.P;
        int i17 = this.N;
        this.N = i17;
        this.P = str;
        if (textView != null) {
            if (i17 > 0) {
                textView.setBackgroundResource(i17);
            }
            if (!android.text.TextUtils.isEmpty(this.P)) {
                this.M.setText(this.P);
            }
        }
        int i18 = this.Q;
        this.Q = i18;
        android.widget.TextView textView2 = this.M;
        if (textView2 != null) {
            textView2.setVisibility(i18);
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.L.getLayoutParams();
        int i19 = this.R;
        if (-1 != i19) {
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, i19, layoutParams.bottomMargin);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f279303d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c17, viewGroup2);
        return u17;
    }

    public C21569x819dd6a8(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.N = -1;
        this.P = "";
        this.Q = 8;
        this.R = -1;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}
