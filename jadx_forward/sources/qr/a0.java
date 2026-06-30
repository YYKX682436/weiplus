package qr;

/* loaded from: classes10.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final qr.a0 f447532a = new qr.a0();

    /* renamed from: b, reason: collision with root package name */
    public static final fp0.o f447533b;

    static {
        fp0.o oVar = new fp0.o(new gp0.g(new gp0.b(20, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "EmojiUpload"));
        f447533b = oVar;
        oVar.g(new qr.z());
    }

    public final void a(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiUploadManager", "addUploadTask: " + emojiInfo.mo42933xb5885648());
        f447533b.a(new qr.h(emojiInfo));
    }
}
