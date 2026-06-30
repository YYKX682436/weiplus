package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class g0 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiCustomUI f98027d;

    public g0(com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI) {
        this.f98027d = emojiCustomUI;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (str.length() == 32 || str.equals("event_update_emoji") || str.equals("delete_emoji_info_notify")) {
            this.f98027d.f97702h.e();
        }
    }
}
