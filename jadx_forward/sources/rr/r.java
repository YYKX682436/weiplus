package rr;

/* loaded from: classes9.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f480678a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f480679b;

    /* renamed from: c, reason: collision with root package name */
    public final rr.o f480680c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f480681d;

    public r(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo, java.lang.String str, rr.o callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f480678a = context;
        this.f480679b = emojiInfo;
        this.f480680c = callback;
        this.f480681d = "MicroMsg.EmojiExchangeCheck";
        if (!n22.m.k(emojiInfo) && !n22.m.j(emojiInfo) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(emojiInfo.f68663x861009b5)) {
            if (!((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).S(emojiInfo.f68663x861009b5) && !emojiInfo.k()) {
                java.lang.String field_groupId = emojiInfo.f68663x861009b5;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_groupId, "field_groupId");
                new hr.b(field_groupId, 1, str).l().K(new rr.p(this));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiExchangeCheck", "do exchange " + emojiInfo.f68671x4b6e68b9 + ' ' + emojiInfo.f68663x861009b5 + ", " + str);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiExchangeCheck", "no need exchange %s %s", emojiInfo.f68671x4b6e68b9, emojiInfo.f68663x861009b5);
        callback.a(true);
    }

    public final void a(java.lang.String msg, yz5.a dismissCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dismissCallback, "dismissCallback");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 F = db5.e1.F(this.f480678a, msg, "", true);
        if (F != null) {
            F.setOnDismissListener(new rr.q(dismissCallback));
        }
    }
}
