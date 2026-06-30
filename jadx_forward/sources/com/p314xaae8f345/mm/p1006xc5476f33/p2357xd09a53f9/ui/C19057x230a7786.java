package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.ui;

/* renamed from: com.tencent.mm.plugin.wallet.ui.CheckBoxWithTipIconPreference */
/* loaded from: classes.dex */
public class C19057x230a7786 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe {
    public android.widget.TextView X;
    public int Y;
    public java.lang.String Z;

    /* renamed from: p0, reason: collision with root package name */
    public int f260661p0;

    public C19057x230a7786(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe
    public void Q(java.lang.String str, int i17) {
        this.Y = i17;
        this.Z = str;
        android.widget.TextView textView = this.X;
        if (textView != null) {
            if (i17 > 0) {
                textView.setBackgroundResource(i17);
            }
            if (android.text.TextUtils.isEmpty(this.Z)) {
                return;
            }
            this.X.setText(this.Z);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe
    public void R(int i17) {
        this.f260661p0 = i17;
        android.widget.TextView textView = this.X;
        if (textView != null) {
            textView.setVisibility(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        this.X = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o_v);
        Q(this.Z, this.Y);
        R(this.f260661p0);
    }

    public C19057x230a7786(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.Y = -1;
        this.Z = "";
        this.f260661p0 = 8;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.f570833c16;
    }
}
