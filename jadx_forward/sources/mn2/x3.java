package mn2;

/* loaded from: classes4.dex */
public final class x3 implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final cw2.eb f411692d;

    /* renamed from: e, reason: collision with root package name */
    public final t21.h0 f411693e;

    /* renamed from: f, reason: collision with root package name */
    public final mn2.g4 f411694f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f411695g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f411696h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ mn2.e4 f411697i;

    public x3(mn2.e4 e4Var, cw2.eb ebVar, t21.h0 h0Var, mn2.g4 video, java.util.concurrent.atomic.AtomicBoolean isStopped, java.lang.Object lock) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(video, "video");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isStopped, "isStopped");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lock, "lock");
        this.f411697i = e4Var;
        this.f411692d = ebVar;
        this.f411693e = h0Var;
        this.f411694f = video;
        this.f411695g = isStopped;
        this.f411696h = lock;
    }

    @Override // dn.n
    public void f(java.lang.String mediaId, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.lang.Object obj = this.f411696h;
        mn2.e4 e4Var = this.f411697i;
        synchronized (obj) {
            if (!this.f411695g.get()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoDownloader", "[onProgress] mediaId=" + mediaId + " offset=" + j17 + " total=" + j18);
                cu2.x.f303982a.n(mediaId, j17, j18, 1);
                e4Var.a(new mn2.w3(this, mediaId, j17, j18));
            }
        }
    }

    @Override // dn.n
    public void g(java.lang.String mediaId, int i17, dn.h hVar) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.lang.Object obj = this.f411696h;
        mn2.e4 e4Var = this.f411697i;
        synchronized (obj) {
            if (!this.f411695g.get()) {
                if (hVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoDownloader", "[onFinish] mediaId=" + mediaId + " ret=" + i17 + " fileLength=" + hVar.f69523x17c343e7 + " sceneResult=" + hVar.f69553xb5f54fe9 + " videoFormat:" + hVar.f69571x9373c88d + " videoFlag=" + hVar.f69570xea0afd82);
                    if (!mn2.e4.f411481c.a(mediaId)) {
                        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    }
                    cu2.x xVar = cu2.x.f303982a;
                    java.lang.String profile = hVar.f323311m;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(profile, "profile");
                    xVar.l(mediaId, profile);
                    long j17 = hVar.f69523x17c343e7;
                    xVar.n(mediaId, j17, j17, 3);
                    e4Var.a(new mn2.t3(this, mediaId, i17, hVar));
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.VideoDownloader", "sceneResult is null! mediaId=" + mediaId + " ret=" + i17);
                    e4Var.a(new mn2.u3(this, mediaId, i17, hVar));
                }
            }
        }
    }

    @Override // dn.n
    /* renamed from: onDataAvailable */
    public void mo65706x9bb59ea0(java.lang.String mediaId, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.lang.Object obj = this.f411696h;
        mn2.e4 e4Var = this.f411697i;
        synchronized (obj) {
            if (!this.f411695g.get()) {
                e4Var.a(new mn2.s3(this, mediaId, j17, j18));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoDownloader", "[onDataAvailable] mediaId=" + mediaId + " offset=" + j17 + " total=" + j18);
    }

    @Override // dn.n
    /* renamed from: onM3U8Ready */
    public void mo65707xc5dd699b(java.lang.String mediaId, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
    }

    @Override // dn.n
    /* renamed from: onMoovReady */
    public void mo65708xe7d268fb(java.lang.String mediaId, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo info) {
        boolean a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.lang.Object obj = this.f411696h;
        mn2.e4 e4Var = this.f411697i;
        synchronized (obj) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoDownloader", "[onMoovReady] mediaId=" + mediaId + " offset=" + j17 + " total=" + j18 + " fileFormat=[" + this.f411694f.g() + "=>" + info.f18114x9330627b + "]} isHasStop=" + this.f411695g.get());
            if (!this.f411695g.get()) {
                p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
                t21.h0 h0Var = this.f411693e;
                if (h0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15198x17d381a) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15198x17d381a c15198x17d381a = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15198x17d381a) h0Var;
                    d61.f fVar = c15198x17d381a.f153185z1;
                    if (fVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c15198x17d381a.f271272e, "%s parser is null, thread is error.", c15198x17d381a.N());
                        a17 = false;
                    } else {
                        a17 = fVar.a(c15198x17d381a.f153178l1, j17);
                    }
                    c0Var.f391645d = a17;
                }
                cu2.x xVar = cu2.x.f303982a;
                boolean z17 = cu2.x.c(xVar, mediaId, false, false, false, 14, null).f68982x84465715 ? false : true;
                java.lang.String str = info.f18114x9330627b;
                if (str == null) {
                    str = "";
                }
                xVar.k(mediaId, str);
                e4Var.a(new mn2.v3(this, mediaId, j17, j18, c0Var, z17));
            }
        }
    }
}
