package qr;

/* loaded from: classes12.dex */
public final class h extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f447547f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f447548g;

    /* renamed from: h, reason: collision with root package name */
    public final long f447549h;

    /* renamed from: i, reason: collision with root package name */
    public long f447550i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f447551m;

    public h(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        this.f447547f = emojiInfo;
        this.f447548g = "MicroMsg.EmojiCaptureUploadTask";
        this.f447549h = emojiInfo.f68648x46085dc4;
        this.f447551m = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(emojiInfo.f68691xdde7652c);
    }

    @Override // fp0.d
    public void a() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        new gr.y(this.f447547f, new qr.f(this, java.lang.System.currentTimeMillis()));
    }

    @Override // fp0.d
    public java.lang.String d() {
        return java.lang.String.valueOf(this.f447549h);
    }
}
