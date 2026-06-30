package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class RoomContributePreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.ImageView L;

    public RoomContributePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        if (this.L == null || com.tencent.mm.sdk.platformtools.t8.K0(null)) {
            return;
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.L, null, null);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        this.L = (android.widget.ImageView) u17.findViewById(com.tencent.mm.R.id.h88);
        return u17;
    }

    public RoomContributePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.tencent.mm.R.layout.byv;
        this.H = com.tencent.mm.R.layout.c0c;
    }
}
