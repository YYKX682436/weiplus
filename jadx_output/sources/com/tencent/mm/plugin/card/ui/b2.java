package com.tencent.mm.plugin.card.ui;

/* loaded from: classes12.dex */
public class b2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftVideoUI f94957d;

    public b2(com.tencent.mm.plugin.card.ui.CardGiftVideoUI cardGiftVideoUI) {
        this.f94957d = cardGiftVideoUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int i17;
        com.tencent.mm.plugin.card.ui.CardGiftVideoUI cardGiftVideoUI = this.f94957d;
        if (!((com.tencent.mm.pluginsdk.ui.tools.VideoTextureView) cardGiftVideoUI.f94847i).isPlaying()) {
            return true;
        }
        int currentPosition = cardGiftVideoUI.f94847i.getCurrentPosition() / 1000;
        android.widget.TextView textView = cardGiftVideoUI.f94850o;
        if (textView == null || (i17 = cardGiftVideoUI.B) <= 0) {
            return true;
        }
        int i18 = i17 - currentPosition;
        if (i18 < 0) {
            i18 = 0;
        }
        textView.setText(i18 + "\"");
        return true;
    }
}
