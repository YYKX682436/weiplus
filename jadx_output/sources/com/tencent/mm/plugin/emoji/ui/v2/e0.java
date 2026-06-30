package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes12.dex */
public class e0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleRecommendView f98358a;

    public e0(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleRecommendView emojiStoreV2SingleRecommendView) {
        this.f98358a = emojiStoreV2SingleRecommendView;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleRecommendView emojiStoreV2SingleRecommendView = this.f98358a;
        switch (i17) {
            case 131075:
                int i18 = message.getData().getInt("progress");
                if (com.tencent.mm.sdk.platformtools.t8.K0(message.getData().getString("product_id"))) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "product id is null");
                    return;
                }
                android.widget.Button button = emojiStoreV2SingleRecommendView.f98309i;
                if (button != null) {
                    button.setVisibility(8);
                }
                android.widget.ProgressBar progressBar = emojiStoreV2SingleRecommendView.f98310m;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                    emojiStoreV2SingleRecommendView.f98310m.setProgress(i18);
                    return;
                }
                return;
            case 131076:
                message.getData().getInt("status");
                if (com.tencent.mm.sdk.platformtools.t8.K0(message.getData().getString("product_id"))) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "product id is null");
                    return;
                }
                android.widget.Button button2 = emojiStoreV2SingleRecommendView.f98309i;
                if (button2 != null) {
                    button2.setVisibility(0);
                    emojiStoreV2SingleRecommendView.getClass();
                }
                android.widget.ProgressBar progressBar2 = emojiStoreV2SingleRecommendView.f98310m;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                    emojiStoreV2SingleRecommendView.f98310m.setProgress(0);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
