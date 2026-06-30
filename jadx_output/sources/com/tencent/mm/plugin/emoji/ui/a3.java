package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public final class a3 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiRecommendPrivacySettingsUI f97893a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMSwitchBtn f97894b;

    public a3(com.tencent.mm.plugin.emoji.ui.EmojiRecommendPrivacySettingsUI emojiRecommendPrivacySettingsUI, com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn) {
        this.f97893a = emojiRecommendPrivacySettingsUI;
        this.f97894b = mMSwitchBtn;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.emoji.ui.EmojiRecommendPrivacySettingsUI emojiRecommendPrivacySettingsUI = this.f97893a;
        java.lang.String obj = ((android.widget.TextView) emojiRecommendPrivacySettingsUI.findViewById(com.tencent.mm.R.id.t2f)).getText().toString();
        android.view.View findViewById = emojiRecommendPrivacySettingsUI.findViewById(com.tencent.mm.R.id.t2g);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.widget.MMSwitchBtn recommendUnSaved = this.f97894b;
        kotlin.jvm.internal.o.f(recommendUnSaved, "$recommendUnSaved");
        emojiRecommendPrivacySettingsUI.T6(obj, findViewById, recommendUnSaved);
        com.tencent.mm.storage.h5.f195006d.Ni(z17);
    }
}
