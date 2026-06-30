package com.p314xaae8f345.mm.p648x55baa833.ui.p652xa8fcbcdb;

/* renamed from: com.tencent.mm.chatroom.ui.preference.RoomCardPreference */
/* loaded from: classes3.dex */
public class C10381x33fe6de6 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.widget.TextView L;
    public java.lang.CharSequence M;
    public java.lang.CharSequence N;
    public android.widget.LinearLayout P;
    public android.view.View Q;
    public boolean R;

    public C10381x33fe6de6(android.content.Context context) {
        super(context);
        this.R = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.cgi).findViewById(com.p314xaae8f345.mm.R.id.oct);
        if (this.P == null) {
            this.P = (android.widget.LinearLayout) viewGroup.getChildAt(1);
        }
        if (this.L == null) {
            this.L = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568238m71);
        }
        if (this.R) {
            this.P.setVisibility(0);
            this.L.setVisibility(0);
        } else {
            this.P.setVisibility(8);
            this.L.setVisibility(8);
        }
        java.lang.CharSequence charSequence = this.N;
        if (charSequence != null) {
            this.L.setText(charSequence);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.Q == null) {
            android.view.View u17 = super.u(viewGroup);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
            viewGroup2.removeAllViews();
            android.view.View.inflate(this.f279303d, com.p314xaae8f345.mm.R.C30864xbddafb2a.c0u, viewGroup2);
            this.Q = u17;
        }
        return this.Q;
    }

    public C10381x33fe6de6(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = false;
    }

    public C10381x33fe6de6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.R = false;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}
