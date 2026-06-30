package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.CheckPreference */
/* loaded from: classes.dex */
public class C21542xb5508be3 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public boolean L;
    public android.widget.CheckBox M;
    public android.widget.TextView N;
    public int P;
    public java.lang.String Q;
    public int R;
    public int S;

    public C21542xb5508be3(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.btf);
        this.M = checkBox;
        checkBox.setChecked(this.L);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o_v);
        this.N = textView;
        java.lang.String str = this.Q;
        int i17 = this.P;
        this.P = i17;
        this.Q = str;
        if (textView != null) {
            if (i17 > 0) {
                textView.setBackgroundResource(i17);
            }
            if (!android.text.TextUtils.isEmpty(this.Q)) {
                this.N.setText(this.Q);
            }
        }
        int i18 = this.R;
        this.R = i18;
        android.widget.TextView textView2 = this.N;
        if (textView2 != null) {
            textView2.setVisibility(i18);
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.M.getLayoutParams();
        int i19 = this.S;
        if (-1 != i19) {
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, i19, layoutParams.bottomMargin);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        return super.u(viewGroup);
    }

    public C21542xb5508be3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = false;
        this.P = -1;
        this.Q = "";
        this.R = 8;
        this.S = -1;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.f570829c12;
    }
}
