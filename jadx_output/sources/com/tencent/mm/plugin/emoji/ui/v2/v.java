package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes5.dex */
public class v extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI f98406a;

    public v(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI) {
        this.f98406a = emojiStoreV2SingleProductUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = this.f98406a;
        if (i17 == 1001) {
            android.view.View view = emojiStoreV2SingleProductUI.A;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        if (i17 != 1002) {
            if (i17 != 1004) {
                return;
            }
            int i18 = com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI.U;
            emojiStoreV2SingleProductUI.T6();
            return;
        }
        android.view.View view2 = emojiStoreV2SingleProductUI.A;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleProductUI$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        sendEmptyMessage(1003);
    }
}
