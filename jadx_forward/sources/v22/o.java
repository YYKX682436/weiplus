package v22;

/* loaded from: classes10.dex */
public final class o extends v22.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final android.view.Surface f514370c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f514371d;

    /* renamed from: e, reason: collision with root package name */
    public wo.i1 f514372e;

    /* renamed from: f, reason: collision with root package name */
    public android.media.MediaFormat f514373f;

    /* renamed from: g, reason: collision with root package name */
    public final gp.c f514374g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f514375h;

    /* renamed from: i, reason: collision with root package name */
    public final long f514376i;

    /* renamed from: j, reason: collision with root package name */
    public final long f514377j;

    /* renamed from: k, reason: collision with root package name */
    public final int f514378k;

    /* renamed from: l, reason: collision with root package name */
    public final android.media.MediaCodec.BufferInfo f514379l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f514380m;

    public o(java.lang.String videoPath, android.view.Surface surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        this.f514370c = surface;
        this.f514371d = "MicroMsg.MixVideoDecoder";
        gp.c cVar = new gp.c();
        this.f514374g = cVar;
        this.f514375h = "";
        this.f514376i = 60000L;
        this.f514377j = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
        this.f514378k = 10;
        this.f514379l = new android.media.MediaCodec.BufferInfo();
        this.f514380m = new java.lang.Object();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MixVideoDecoder", "create decoder with path: ".concat(videoPath));
            cVar.k(videoPath);
            int d17 = cVar.d();
            for (int i17 = 0; i17 < d17; i17++) {
                android.media.MediaFormat e17 = this.f514374g.e(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getTrackFormat(...)");
                java.lang.String string = e17.getString("mime");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                if (r26.n0.B(string, "video", false)) {
                    java.lang.String string2 = e17.getString("mime");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
                    this.f514375h = string2;
                    this.f514373f = e17;
                    java.lang.String str = this.f514371d;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append("find video format ");
                    android.media.MediaFormat mediaFormat = this.f514373f;
                    if (mediaFormat == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaFormat");
                        throw null;
                    }
                    sb6.append(mediaFormat);
                    sb6.append(", mime: ");
                    sb6.append(string2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                    this.f514374g.i(i17);
                    return;
                }
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f514371d, e18, "init create extractor error", new java.lang.Object[0]);
        }
    }

    @Override // v22.a0
    public int a() {
        if (this.f514373f != null) {
            java.lang.String str = this.f514375h;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                try {
                    wo.i1 c17 = wo.i1.c(str);
                    this.f514372e = c17;
                    android.media.MediaFormat mediaFormat = this.f514373f;
                    if (mediaFormat == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaFormat");
                        throw null;
                    }
                    c17.a(mediaFormat, this.f514370c, null, 0);
                    wo.i1 i1Var = this.f514372e;
                    if (i1Var != null) {
                        i1Var.x();
                        return 0;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("decoder");
                    throw null;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f514371d, "init decoder error " + e17.getMessage());
                }
            }
        }
        return -1;
    }

    @Override // v22.a0
    public void b(boolean z17) {
        if (z17) {
            return;
        }
        synchronized (this.f514380m) {
            try {
                this.f514380m.notifyAll();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f514371d, e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // v22.a0
    public void c() {
        pm0.v.m("EmojiMixVideoDecoder_decodeThread", true, new v22.n(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0167, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d() {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v22.o.d():boolean");
    }
}
