package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes15.dex */
public class b extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment f98351a;

    public b(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment emojiStoreV2BaseFragment) {
        this.f98351a = emojiStoreV2BaseFragment;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        java.lang.String string;
        java.lang.String string2;
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment emojiStoreV2BaseFragment = this.f98351a;
        emojiStoreV2BaseFragment.getClass();
        switch (message.what) {
            case 131074:
                j12.b bVar = emojiStoreV2BaseFragment.f98246u;
                if (bVar == null) {
                    return;
                }
                bVar.notifyDataSetChanged();
                return;
            case 131075:
                if (emojiStoreV2BaseFragment.f98246u == null || message.getData() == null || (string = message.getData().getString("product_id")) == null) {
                    return;
                }
                emojiStoreV2BaseFragment.f98246u.r(string, message.getData().getInt("progress"));
                return;
            case 131076:
                if (emojiStoreV2BaseFragment.f98246u == null || message.getData() == null || (string2 = message.getData().getString("product_id")) == null) {
                    return;
                }
                emojiStoreV2BaseFragment.f98246u.s(string2, message.getData().getInt("status"));
                return;
            case 131077:
                com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerView emojiStoreV3BannerView = emojiStoreV2BaseFragment.f98236h;
                if (emojiStoreV3BannerView != null) {
                    emojiStoreV3BannerView.c();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
