package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.PreferenceFooterCategory */
/* loaded from: classes4.dex */
public class C21563x29f29d94 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.widget.TextView L;
    public boolean M;

    public C21563x29f29d94(android.content.Context context) {
        super(context);
        this.M = false;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.c0g;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
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
        if (this.M) {
            this.L.setTextSize(0, 38.0f);
            return;
        }
        this.L.setTextSize(0, i65.a.f(r2, com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3) * i65.a.m(this.f279303d));
    }

    public C21563x29f29d94(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = false;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.c0g;
    }

    public C21563x29f29d94(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.M = false;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.c0g;
    }
}
