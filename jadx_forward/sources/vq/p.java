package vq;

/* loaded from: classes12.dex */
public final class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f520739b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f520740c;

    public p(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, java.lang.String str, yz5.l lVar) {
        this.f520738a = emojiDebugUI;
        this.f520739b = str;
        this.f520740c = lVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f520738a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(emojiDebugUI.d, "addEmoji: " + i17 + ", " + i18);
        yz5.l lVar = this.f520740c;
        if (i17 == 0 && i18 == 0) {
            z85.l c17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c();
            java.lang.String str = this.f520739b;
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = c17.u1(str);
            int i19 = u17.f68653x95b20dd4;
            l75.e0 e0Var = com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.L2;
            if (i19 != 81) {
                u17.f68653x95b20dd4 = 81;
                u17.f68677x13320506 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().z1() + 1;
                com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().G2(u17);
                com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().y2(0, kz5.b0.c(str));
            }
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        } else {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            pm0.v.X(new vq.o(emojiDebugUI, i17, i18));
        }
        return jz5.f0.f384359a;
    }
}
