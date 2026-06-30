package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes12.dex */
public class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8 f179613d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8 activityC13272x96cd1be8) {
        this.f179613d = activityC13272x96cd1be8;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        n22.c.a(3);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this.f179613d.f179207p, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.class);
        intent.putExtra("key_emoji_panel_type", 0);
        intent.putExtra("key_from_scene", 2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8 activityC13272x96cd1be8 = this.f179613d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC13272x96cd1be8, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiAddCustomDialogUI$4", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC13272x96cd1be8.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC13272x96cd1be8, "com/tencent/mm/plugin/emoji/ui/EmojiAddCustomDialogUI$4", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
