package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes15.dex */
public class c0 implements db5.t6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI f98354d;

    public c0(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI) {
        this.f98354d = emojiStoreV2SingleProductUI;
    }

    @Override // db5.t6
    public void a(java.lang.String str) {
    }

    @Override // db5.t6
    public void c() {
    }

    @Override // db5.t6
    public void d(java.lang.String str) {
    }

    @Override // db5.t6
    public void f(java.lang.String str) {
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = this.f98354d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(emojiStoreV2SingleProductUI.H) || com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.equals(emojiStoreV2SingleProductUI.H)) {
            return;
        }
        emojiStoreV2SingleProductUI.f98280J.s(emojiStoreV2SingleProductUI.H, true);
    }

    @Override // db5.t6
    public void g(java.lang.String str) {
    }

    @Override // db5.t6
    public void h(java.lang.String str) {
        int i17 = com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI.U;
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = this.f98354d;
        emojiStoreV2SingleProductUI.setMMTitle(com.tencent.mm.R.string.f491113bz4);
        emojiStoreV2SingleProductUI.showOptionMenu(1001, emojiStoreV2SingleProductUI.B);
        java.util.HashMap hashMap = emojiStoreV2SingleProductUI.K;
        if (hashMap == null || !hashMap.containsKey(str)) {
            emojiStoreV2SingleProductUI.E = null;
            emojiStoreV2SingleProductUI.F = -1;
            emojiStoreV2SingleProductUI.H = emojiStoreV2SingleProductUI.getString(com.tencent.mm.R.string.bzs);
            emojiStoreV2SingleProductUI.f98292r = 1;
            emojiStoreV2SingleProductUI.f98283f = 0;
            emojiStoreV2SingleProductUI.U6(emojiStoreV2SingleProductUI.E);
            emojiStoreV2SingleProductUI.Y6("");
        } else {
            emojiStoreV2SingleProductUI.F = -1;
            emojiStoreV2SingleProductUI.H = str;
            emojiStoreV2SingleProductUI.f98292r = 4;
            emojiStoreV2SingleProductUI.f98283f = ((java.lang.Integer) emojiStoreV2SingleProductUI.K.get(str)).intValue();
            emojiStoreV2SingleProductUI.U6(null);
            emojiStoreV2SingleProductUI.Y6(str);
        }
        com.tencent.mm.ui.contact.LabelContainerView labelContainerView = emojiStoreV2SingleProductUI.I;
        if (labelContainerView != null) {
            labelContainerView.setVisibility(8);
        }
    }

    @Override // db5.t6
    public void j(boolean z17, int i17) {
    }
}
