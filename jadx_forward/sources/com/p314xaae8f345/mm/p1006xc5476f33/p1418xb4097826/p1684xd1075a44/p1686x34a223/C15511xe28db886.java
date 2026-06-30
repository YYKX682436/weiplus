package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223;

/* renamed from: com.tencent.mm.plugin.finder.widget.pref.PreferenceHeaderCategory */
/* loaded from: classes.dex */
public class C15511xe28db886 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.widget.TextView L;

    public C15511xe28db886(android.content.Context context) {
        super(context);
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.edh;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.title);
        this.L = textView;
        if (textView == null) {
            return;
        }
        java.lang.CharSequence charSequence = this.f279307h;
        if (charSequence == null || charSequence.length() <= 0) {
            this.L.setVisibility(8);
            return;
        }
        this.L.setVisibility(0);
        this.L.setText(this.f279307h);
        this.L.setTextSize(0, i65.a.f(r2, com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3) * i65.a.m(this.f279303d));
    }

    public C15511xe28db886(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.edh;
    }

    public C15511xe28db886(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.edh;
    }
}
