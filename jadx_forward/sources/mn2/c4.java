package mn2;

/* loaded from: classes10.dex */
public final class c4 implements t21.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final mn2.g4 f411461d;

    /* renamed from: e, reason: collision with root package name */
    public final cw2.eb f411462e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f411463f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f411464g;

    /* renamed from: h, reason: collision with root package name */
    public so2.i3 f411465h;

    /* renamed from: i, reason: collision with root package name */
    public t21.h0 f411466i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ mn2.e4 f411467m;

    public c4(mn2.e4 e4Var, mn2.g4 video, cw2.eb ebVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(video, "video");
        this.f411467m = e4Var;
        this.f411461d = video;
        this.f411462e = ebVar;
        this.f411463f = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f411464g = new java.lang.Object();
    }

    @Override // t21.i0
    public void a(java.lang.String mediaId, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        synchronized (this.f411464g) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[requestVideoData] mediaId=");
            sb6.append(mediaId);
            sb6.append(" offset=");
            sb6.append(i17);
            sb6.append(" length=");
            sb6.append(i18);
            sb6.append(" cacheSize=");
            so2.i3 i3Var = this.f411465h;
            sb6.append(i3Var != null ? java.lang.Long.valueOf(i3Var.f68968x799e9d9e) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoDownloader", sb6.toString());
            ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
            t21.o2.Di().p(mediaId, i17, i18, 0);
        }
    }

    @Override // t21.i0
    public void b(java.lang.String mediaId, java.lang.String filePath, java.lang.String url) {
        java.lang.Object obj;
        cs2.j d17;
        cs2.j d18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.lang.Object obj2 = this.f411464g;
        mn2.e4 e4Var = this.f411467m;
        synchronized (obj2) {
            try {
                this.f411463f.set(false);
                cu2.x xVar = cu2.x.f303982a;
                so2.i3 c17 = cu2.x.c(xVar, mediaId, false, false, false, 14, null);
                mn2.g4 g4Var = this.f411461d;
                c17.f68987x74535930 = g4Var.f411538h;
                java.lang.String str = c17.f68976xe1500f8;
                if (str == null) {
                    str = g4Var.g();
                }
                c17.f68976xe1500f8 = str;
                java.lang.String m75945x2fec8307 = this.f411461d.f411535e.m75945x2fec8307(9);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                java.lang.String str2 = m75945x2fec8307;
                int i17 = this.f411461d.f411538h;
                java.lang.String field_fileFormat = c17.f68976xe1500f8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fileFormat, "field_fileFormat");
                mn2.g4 g4Var2 = this.f411461d;
                obj = obj2;
                try {
                    cu2.x.h(xVar, -1L, mediaId, str2, url, i17, field_fileFormat, g4Var2.f411539i, c17.f68968x799e9d9e, c17.f68989x78351860, 1, g4Var2.f411535e.m75939xb282bd08(3), this.f411461d.i(), this.f411461d.h(), false, false, 24576, null);
                    java.lang.String m75945x2fec83072 = this.f411461d.f411535e.m75945x2fec8307(54);
                    if (m75945x2fec83072 == null) {
                        m75945x2fec83072 = "";
                    }
                    java.lang.String m75945x2fec83073 = this.f411461d.f411535e.m75945x2fec8307(55);
                    if (m75945x2fec83073 == null) {
                        m75945x2fec83073 = "";
                    }
                    yr2.f fVar = new yr2.f(m75945x2fec83072, m75945x2fec83073, this.f411461d.f411540m);
                    yr2.d dVar = yr2.d.f546196a;
                    so2.i3 i3Var = this.f411465h;
                    java.lang.String str3 = i3Var != null ? i3Var.f68984xbaadf794 : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    java.lang.String str4 = str3;
                    int i18 = c17.f68987x74535930;
                    java.lang.String field_fileFormat2 = c17.f68976xe1500f8;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fileFormat2, "field_fileFormat");
                    java.lang.String i19 = this.f411461d.i();
                    java.lang.String h17 = this.f411461d.h();
                    boolean z17 = this.f411461d.f411535e.m75939xb282bd08(39) == 1;
                    mn2.x3 x3Var = new mn2.x3(e4Var, this.f411462e, this.f411466i, this.f411461d, this.f411463f, this.f411464g);
                    int i27 = e4Var.f411483b;
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = this.f411461d.f411535e.m75934xbce7f2f(66);
                    dn.o a17 = dVar.a(0, 0L, str4, mediaId, url, filePath, i18, field_fileFormat2, i19, h17, z17, x3Var, i27, "Finder.VideoDownloader", fVar, m75934xbce7f2f != null ? m75934xbce7f2f.f273689a : null);
                    this.f411465h = c17;
                    cw2.w9 w9Var = e4Var.f411482a;
                    if (w9Var != null && (d18 = w9Var.d1()) != null) {
                        d18.u0(mediaId, true);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoDownloader", "[startHttpStream] fallback cancel mediaId=" + mediaId + " isPreLoadCompleted=" + c17.F0() + " isAllCompleted=" + c17.A0() + " file=" + filePath + ", " + url + " isMoovReady=" + c17.f68982x84465715);
                    if (!c17.A0()) {
                        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
                        t21.o2.Di().f(a17);
                        e4Var.a(new mn2.z3(this));
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoDownloader", "[finish] mediaId=" + mediaId + " cacheSize=" + c17.f68968x799e9d9e + " totalSize=" + c17.f68989x78351860 + '}');
                    dn.n nVar = a17.f323348c2;
                    long j17 = c17.f68968x799e9d9e;
                    long j18 = c17.f68989x78351860;
                    com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo();
                    videoInfo.f18114x9330627b = c17.f68976xe1500f8;
                    nVar.mo65708xe7d268fb(mediaId, j17, j18, videoInfo);
                    a17.f323348c2.f(mediaId, c17.f68968x799e9d9e, c17.f68989x78351860);
                    a17.f323348c2.g(mediaId, 0, null);
                    cw2.w9 w9Var2 = e4Var.f411482a;
                    if (w9Var2 != null && (d17 = w9Var2.d1()) != null) {
                        d17.u0(mediaId, false);
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                obj = obj2;
            }
        }
    }

    @Override // t21.i0
    public void c(java.lang.String str) {
        cs2.j d17;
        java.lang.Object obj = this.f411464g;
        mn2.e4 e4Var = this.f411467m;
        synchronized (obj) {
            this.f411463f.compareAndSet(false, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoDownloader", "[stop] mediaId=" + str);
            if (str != null) {
                ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
                t21.o2.Di().i(str, null, new mn2.b4(e4Var, this));
                cw2.w9 w9Var = e4Var.f411482a;
                if (w9Var != null && (d17 = w9Var.d1()) != null) {
                    d17.u0(str, false);
                }
            }
        }
    }

    @Override // t21.i0
    public void d(t21.h0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f411466i = callback;
    }

    @Override // t21.i0
    public boolean e(java.lang.String mediaId, int i17, int i18) {
        boolean o17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        synchronized (this.f411464g) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[isVideoDataAvailable] mediaId=");
            sb6.append(mediaId);
            sb6.append(" offset=");
            sb6.append(i17);
            sb6.append(" length=");
            sb6.append(i18);
            sb6.append(" cacheSize=");
            so2.i3 i3Var = this.f411465h;
            sb6.append(i3Var != null ? java.lang.Long.valueOf(i3Var.f68968x799e9d9e) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoDownloader", sb6.toString());
            cw2.eb ebVar = this.f411462e;
            if (ebVar != null) {
                ebVar.k(mediaId, i17, i18);
            }
            ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
            o17 = t21.o2.Di().o(mediaId, i17, i18);
        }
        return o17;
    }
}
