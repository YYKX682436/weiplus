package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public final class z2 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiRecommendPrivacySettingsUI f98572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMSwitchBtn f98573b;

    public z2(com.tencent.mm.plugin.emoji.ui.EmojiRecommendPrivacySettingsUI emojiRecommendPrivacySettingsUI, com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn) {
        this.f98572a = emojiRecommendPrivacySettingsUI;
        this.f98573b = mMSwitchBtn;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.emoji.ui.EmojiRecommendPrivacySettingsUI emojiRecommendPrivacySettingsUI = this.f98572a;
        java.lang.String obj = ((android.widget.TextView) emojiRecommendPrivacySettingsUI.findViewById(com.tencent.mm.R.id.t2i)).getText().toString();
        android.view.View findViewById = emojiRecommendPrivacySettingsUI.findViewById(com.tencent.mm.R.id.t2j);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.widget.MMSwitchBtn personalSwitch = this.f98573b;
        kotlin.jvm.internal.o.f(personalSwitch, "$personalSwitch");
        emojiRecommendPrivacySettingsUI.T6(obj, findViewById, personalSwitch);
        if (z17) {
            com.tencent.mm.storage.h5.f195006d.Di(true);
            com.tencent.mm.smiley.c0.f193225a.d(true);
        } else {
            com.tencent.mm.storage.h5.f195006d.Di(false);
            com.tencent.mm.smiley.c0.f193225a.e(com.tencent.mm.smiley.z.f193415d);
        }
    }
}
