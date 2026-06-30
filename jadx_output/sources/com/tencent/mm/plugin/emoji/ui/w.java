package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public class w implements ck5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f98528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiCustomUI f98529c;

    public w(com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI, int i17, java.lang.String str) {
        this.f98529c = emojiCustomUI;
        this.f98527a = i17;
        this.f98528b = str;
    }

    @Override // ck5.b
    public void a() {
        com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI = this.f98529c;
        db5.e1.E(emojiCustomUI.getContext(), emojiCustomUI.getContext().getString(com.tencent.mm.R.string.bvl), "", emojiCustomUI.getContext().getString(com.tencent.mm.R.string.f492294fz1), false, null);
    }

    @Override // ck5.b
    public void b(ck5.c cVar) {
        com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI = this.f98529c;
        if (emojiCustomUI.V == null) {
            if (this.f98527a == 0) {
                ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                emojiCustomUI.V = com.tencent.mm.storage.n5.f().c().P0(this.f98528b, "", 65, 1, cVar.f42553e, "");
            } else {
                ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                emojiCustomUI.V = com.tencent.mm.storage.n5.f().c().P0(this.f98528b, "", 65, 2, cVar.f42553e, "");
            }
        }
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ni().U(emojiCustomUI.getContext(), emojiCustomUI.V, 1, c01.z1.r());
    }
}
