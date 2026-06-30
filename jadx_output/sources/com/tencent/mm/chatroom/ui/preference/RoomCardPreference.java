package com.tencent.mm.chatroom.ui.preference;

/* loaded from: classes3.dex */
public class RoomCardPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.TextView L;
    public java.lang.CharSequence M;
    public java.lang.CharSequence N;
    public android.widget.LinearLayout P;
    public android.view.View Q;
    public boolean R;

    public RoomCardPreference(android.content.Context context) {
        super(context);
        this.R = false;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.cgi).findViewById(com.tencent.mm.R.id.oct);
        if (this.P == null) {
            this.P = (android.widget.LinearLayout) viewGroup.getChildAt(1);
        }
        if (this.L == null) {
            this.L = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f486705m71);
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

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.Q == null) {
            android.view.View u17 = super.u(viewGroup);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
            viewGroup2.removeAllViews();
            android.view.View.inflate(this.f197770d, com.tencent.mm.R.layout.c0u, viewGroup2);
            this.Q = u17;
        }
        return this.Q;
    }

    public RoomCardPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = false;
    }

    public RoomCardPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.R = false;
        this.G = com.tencent.mm.R.layout.byv;
    }
}
