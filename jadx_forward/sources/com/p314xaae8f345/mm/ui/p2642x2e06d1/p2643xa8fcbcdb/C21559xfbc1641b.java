package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.PluginTextPreference */
/* loaded from: classes11.dex */
public final class C21559xfbc1641b extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.widget.ImageView L;
    public android.widget.TextView M;
    public int N;
    public java.lang.String P;
    public final int Q;
    public int R;

    public C21559xfbc1641b(android.content.Context context) {
        this(context, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9o);
        this.L = imageView;
        imageView.setImageResource(this.N);
        this.L.setVisibility(this.R);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o57);
        this.M = textView;
        textView.setText(this.P);
        this.M.setTextColor(this.Q);
    }

    public C21559xfbc1641b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C21559xfbc1641b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = null;
        this.M = null;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.A);
        this.G = obtainStyledAttributes.getResourceId(1, com.p314xaae8f345.mm.R.C30864xbddafb2a.bzt);
        this.N = obtainStyledAttributes.getResourceId(0, 0);
        this.P = obtainStyledAttributes.getString(2);
        this.Q = obtainStyledAttributes.getColor(3, -7039852);
        obtainStyledAttributes.recycle();
    }
}
