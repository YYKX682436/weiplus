package cw2;

/* loaded from: classes15.dex */
public final class r6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f305507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f305508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305509f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dn.h f305510g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cw2.s6 f305511h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd, int i17, java.lang.String str, dn.h hVar, cw2.s6 s6Var) {
        super(0);
        this.f305507d = c15188xd8bd4bd;
        this.f305508e = i17;
        this.f305509f = str;
        this.f305510g = hVar;
        this.f305511h = s6Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        java.util.HashSet hashSet = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.f212174g2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305507d;
        c15188xd8bd4bd.m0(null);
        cw2.s6 s6Var = this.f305511h;
        int i17 = this.f305508e;
        if (i17 != -10012) {
            dn.h hVar = this.f305510g;
            if (i17 != 0) {
                cu2.x xVar = cu2.x.f303982a;
                cw2.wa mediaSource = c15188xd8bd4bd.getMediaSource();
                long feedId = (mediaSource == null || (c14989xf862ae88 = mediaSource.f305632f) == null) ? -1L : c14989xf862ae88.getFeedId();
                java.lang.String str = this.f305509f;
                java.lang.String m75945x2fec8307 = s6Var.f305533e.f305631e.e().m75945x2fec8307(9);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                cw2.wa waVar = s6Var.f305533e;
                java.lang.String str2 = waVar.f305627a;
                java.lang.String str3 = str2 == null ? "" : str2;
                mn2.j4 j4Var = waVar.f305631e;
                cu2.x.h(xVar, feedId, str, m75945x2fec8307, str3, j4Var.b(), j4Var.g(), j4Var.c(), 0L, 0L, -1, j4Var.e().m75939xb282bd08(3), "", "", j4Var.d(), false, 16384, null);
                cw2.eb downloadCallback = c15188xd8bd4bd.getDownloadCallback();
                if (downloadCallback != null) {
                    downloadCallback.q(i17, j4Var, hVar);
                }
            } else {
                cu2.x xVar2 = cu2.x.f303982a;
                java.lang.String str4 = this.f305509f;
                long j17 = hVar.f69523x17c343e7;
                xVar2.n(str4, j17, j17, 3);
                cw2.eb downloadCallback2 = c15188xd8bd4bd.getDownloadCallback();
                if (downloadCallback2 != null) {
                    downloadCallback2.q(i17, s6Var.f305533e.f305631e, hVar);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15188xd8bd4bd.m61380xe56ce956(), "FTPP.onFinish mediaId=" + this.f305509f + " ret=" + i17 + " restart downloader.");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j0(c15188xd8bd4bd, null, 1, null);
        }
        s6Var.b();
        s6Var.c(false);
        return jz5.f0.f384359a;
    }
}
