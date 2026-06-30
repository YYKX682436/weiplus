package com.tencent.mm.chatroom.ui.preference;

/* loaded from: classes.dex */
public class SignaturePreference extends com.tencent.mm.ui.base.preference.Preference {
    public SignaturePreference(android.content.Context context) {
        super(context);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        viewGroup2.setPadding(0, 0, 0, 0);
        android.view.View.inflate(this.f197770d, com.tencent.mm.R.layout.bzz, viewGroup2);
        return u17;
    }

    public SignaturePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SignaturePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.tencent.mm.R.layout.byv;
    }
}
