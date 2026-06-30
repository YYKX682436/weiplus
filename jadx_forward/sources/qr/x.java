package qr;

/* loaded from: classes12.dex */
public final class x extends qr.l {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f447584g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo, qr.i iVar) {
        super(emojiInfo, false, iVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        this.f447584g = "MicroMsg.EmojiUploadCheck";
        if (cr.m.b(emojiInfo) || cr.m.a(emojiInfo)) {
            a(0);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(emojiInfo.mo42933xb5885648());
        if (!cr.m.b(u17) && !cr.m.a(u17)) {
            e(new qr.t(this));
        } else {
            n22.m.s(u17, emojiInfo);
            a(0);
        }
    }

    public final void e(yz5.l lVar) {
        new hr.a(1, 0, kz5.b0.c(this.f447552a.mo42933xb5885648()), null, null, 24, null).l().K(new qr.u(this, lVar));
    }
}
