package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes12.dex */
public class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI f98080d;

    public l(com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI) {
        this.f98080d = emojiAddCustomDialogUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        n22.c.a(3);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this.f98080d.f97674p, com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.class);
        intent.putExtra("key_emoji_panel_type", 0);
        intent.putExtra("key_from_scene", 2);
        com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI = this.f98080d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(emojiAddCustomDialogUI, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiAddCustomDialogUI$4", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        emojiAddCustomDialogUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(emojiAddCustomDialogUI, "com/tencent/mm/plugin/emoji/ui/EmojiAddCustomDialogUI$4", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
