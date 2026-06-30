package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes2.dex */
public class n extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardDetailUI f98376a;

    public n(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardDetailUI emojiStoreV2RewardDetailUI) {
        this.f98376a = emojiStoreV2RewardDetailUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        android.view.View view;
        int i17 = message.what;
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardDetailUI emojiStoreV2RewardDetailUI = this.f98376a;
        if (i17 != 1001) {
            if (i17 == 1002 && (view = emojiStoreV2RewardDetailUI.f98272r) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        android.view.View view2 = emojiStoreV2RewardDetailUI.f98272r;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardDetailUI$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
