package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.RoomGrantPreference */
/* loaded from: classes.dex */
public class C10356xe69f749c extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.widget.TextView L;
    public final java.lang.String M;

    public C10356xe69f749c(android.content.Context context) {
        super(context);
        this.L = null;
        this.M = "";
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        if (this.L == null) {
            this.L = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2);
        }
        this.L.setText(this.M + "");
        super.t(view);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f279303d, com.p314xaae8f345.mm.R.C30864xbddafb2a.bzy, viewGroup2);
        return u17;
    }

    public C10356xe69f749c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = null;
        this.M = "";
    }

    public C10356xe69f749c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = null;
        this.M = "";
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
        this.H = com.p314xaae8f345.mm.R.C30864xbddafb2a.f570827c10;
    }
}
