package com.tencent.mm.feature.emoji;

/* loaded from: classes12.dex */
public final class z2 implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.c4 f66579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f66580b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.emotion.EmojiInfo f66581c;

    public z2(com.tencent.mm.feature.emoji.c4 c4Var, yz5.l lVar, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        this.f66579a = c4Var;
        this.f66580b = lVar;
        this.f66581c = emojiInfo;
    }

    @Override // dr.q
    public void a(boolean z17) {
        com.tencent.mm.pluginsdk.ui.chat.v9 v9Var;
        yz5.l lVar = this.f66580b;
        com.tencent.mm.feature.emoji.c4 c4Var = this.f66579a;
        if (!z17) {
            com.tencent.mars.xlog.Log.i(c4Var.f66207d, "Emoticon loadFile failed.");
            lVar.invoke(-1);
            return;
        }
        y75.d dVar = y75.a.f459786a;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f66581c;
        if (dVar != null && (v9Var = dVar.f320568d) != null) {
            v9Var.b(emojiInfo);
        }
        lVar.invoke(0);
        new qr.x(emojiInfo, new com.tencent.mm.feature.emoji.y2(c4Var, emojiInfo));
    }
}
