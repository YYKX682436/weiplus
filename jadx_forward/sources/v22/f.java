package v22;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f514342a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f514343b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.gif.a f514344c;

    /* renamed from: d, reason: collision with root package name */
    public long f514345d;

    public f(java.lang.String outputPath, int i17, int i18, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputPath, "outputPath");
        this.f514342a = "MicroMsg.EmojiMixGifEncoder";
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("EmojiMixer_gifEncode");
        this.f514343b = n3Var;
        this.f514344c = z17 ? new com.p314xaae8f345.mm.p1006xc5476f33.gif.p(outputPath, i17, i18, j17) : new com.p314xaae8f345.mm.p1006xc5476f33.gif.w(outputPath, i17, i18, j17, 20);
        n3Var.mo50293x3498a0(new v22.c(this, z17));
    }
}
