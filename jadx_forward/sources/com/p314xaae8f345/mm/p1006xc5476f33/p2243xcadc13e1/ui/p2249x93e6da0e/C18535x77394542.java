package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e;

/* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.AddFriendSearchPreference */
/* loaded from: classes3.dex */
public class C18535x77394542 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public java.lang.String L;
    public android.view.View.OnClickListener M;
    public android.widget.TextView N;
    public android.view.View P;

    public C18535x77394542(android.content.Context context) {
        this(context, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        view.setOnTouchListener(new gg4.a(this));
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.mmz);
        this.N = textView;
        textView.setText(this.L);
        this.N.setContentDescription(this.L);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.mes);
        this.P = findViewById;
        if (this.M != null) {
            findViewById.setOnClickListener(new gg4.b(this));
        }
        E(8);
    }

    public C18535x77394542(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C18535x77394542(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = "";
        this.M = null;
        this.N = null;
        this.P = null;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.bz9;
    }
}
