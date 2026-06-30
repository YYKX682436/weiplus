package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class i0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiCustomUI f98059a;

    public i0(com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI) {
        this.f98059a = emojiCustomUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI = this.f98059a;
        switch (i17) {
            case 1001:
                pr.r0 r0Var = emojiCustomUI.f97704m;
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "dz[updateSyncView status:%s]", r0Var.toString());
                if (emojiCustomUI.f97698d == com.tencent.mm.plugin.emoji.ui.q0.EDIT) {
                    return;
                }
                int ordinal = r0Var.ordinal();
                com.tencent.mm.sdk.platformtools.n3 n3Var = emojiCustomUI.S;
                if (ordinal == 0 || ordinal == 5) {
                    emojiCustomUI.f97709q = false;
                    if (n3Var != null) {
                        n3Var.sendEmptyMessageDelayed(1003, 0);
                    }
                    emojiCustomUI.d7(com.tencent.mm.plugin.emoji.ui.q0.NORMAL);
                    return;
                }
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return;
                    }
                    emojiCustomUI.f97709q = false;
                    if (n3Var != null) {
                        n3Var.removeMessages(1003);
                    }
                    android.view.View view = emojiCustomUI.f97705n;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "handleLoaderStateChange", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "handleLoaderStateChange", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    emojiCustomUI.a7(com.tencent.mm.plugin.emoji.ui.o0.START);
                    emojiCustomUI.d7(com.tencent.mm.plugin.emoji.ui.q0.WITH_OUT_ADD);
                    return;
                }
                if (!com.tencent.mars.comm.NetStatusUtil.isWifi(emojiCustomUI)) {
                    emojiCustomUI.f97709q = false;
                    android.view.View view2 = emojiCustomUI.f97705n;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "handleLoaderStateChange", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "handleLoaderStateChange", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    emojiCustomUI.a7(com.tencent.mm.plugin.emoji.ui.o0.PAUSE);
                } else if (com.tencent.mars.comm.NetStatusUtil.isWifi(emojiCustomUI) && !emojiCustomUI.f97709q) {
                    emojiCustomUI.f97709q = true;
                    if (n3Var != null) {
                        n3Var.sendEmptyMessageDelayed(1003, 0);
                    }
                    emojiCustomUI.a7(com.tencent.mm.plugin.emoji.ui.o0.EMPTY);
                }
                com.tencent.mm.plugin.emoji.ui.q0 q0Var = emojiCustomUI.f97698d;
                com.tencent.mm.plugin.emoji.ui.q0 q0Var2 = com.tencent.mm.plugin.emoji.ui.q0.SYNCING;
                if (q0Var != q0Var2) {
                    emojiCustomUI.d7(q0Var2);
                    return;
                }
                return;
            case 1002:
                emojiCustomUI.f97702h.e();
                com.tencent.mars.comm.NetStatusUtil.isWifi(emojiCustomUI);
                return;
            case 1003:
                android.view.View view3 = emojiCustomUI.f97705n;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI$4", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI$4", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            default:
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiCustomUI", "unknow Msg");
                return;
        }
    }
}
