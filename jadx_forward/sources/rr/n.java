package rr;

/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f480668a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f480669b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f480670c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f480671d;

    /* renamed from: e, reason: collision with root package name */
    public long f480672e;

    /* renamed from: f, reason: collision with root package name */
    public al5.u4 f480673f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f480674g;

    /* renamed from: h, reason: collision with root package name */
    public z12.g f480675h;

    public n(android.app.Activity context, android.view.ViewGroup container, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        this.f480668a = context;
        this.f480669b = str;
        this.f480670c = emojiInfo;
        this.f480671d = "MicroMsg.EmojiCustomHelper";
        this.f480674g = new rr.i(this);
    }

    public static final void a(rr.n nVar, boolean z17) {
        pm0.v.C(nVar.f480674g);
        long j17 = nVar.f480672e;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        pm0.v.V(700 - (android.os.SystemClock.elapsedRealtime() - j17), new rr.m(nVar, z17));
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11596, 4);
        db5.e1.j(this.f480668a, com.p314xaae8f345.mm.R.C30867xcad56011.c0g, com.p314xaae8f345.mm.R.C30867xcad56011.f571919tj, com.p314xaae8f345.mm.R.C30867xcad56011.byz, com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg, new rr.j(this), rr.k.f480664d);
    }
}
