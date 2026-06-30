package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class RoomGrantPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.TextView L;
    public final java.lang.String M;

    public RoomGrantPreference(android.content.Context context) {
        super(context);
        this.L = null;
        this.M = "";
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        if (this.L == null) {
            this.L = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483931ci2);
        }
        this.L.setText(this.M + "");
        super.t(view);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f197770d, com.tencent.mm.R.layout.bzy, viewGroup2);
        return u17;
    }

    public RoomGrantPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = null;
        this.M = "";
    }

    public RoomGrantPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = null;
        this.M = "";
        this.G = com.tencent.mm.R.layout.byv;
        this.H = com.tencent.mm.R.layout.f489294c10;
    }
}
