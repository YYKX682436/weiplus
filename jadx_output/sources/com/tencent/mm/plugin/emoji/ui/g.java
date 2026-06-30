package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes12.dex */
public class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f98025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI f98026e;

    public g(com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI, java.lang.String str) {
        this.f98026e = emojiAddCustomDialogUI;
        this.f98025d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str = this.f98025d;
        if (str == null) {
            str = "";
        }
        d22.d0 d0Var = new d22.d0(str, null, null);
        d0Var.f364198g = 20;
        d22.u uVar = d22.u.f225876a;
        com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI emojiAddCustomDialogUI = this.f98026e;
        uVar.a(emojiAddCustomDialogUI, d0Var);
        emojiAddCustomDialogUI.finish();
    }
}
