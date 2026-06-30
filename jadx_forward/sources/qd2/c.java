package qd2;

/* loaded from: classes2.dex */
public final class c implements c50.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qd2.g f443241b;

    public c(java.lang.String str, qd2.g gVar) {
        this.f443240a = str;
        this.f443241b = gVar;
    }

    @Override // c50.z0
    public void a(long j17, int i17, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAudioExtractor", "[onDownloadFinished] feedId:" + this.f443240a + " ret:" + i17 + " path:" + path + " isFileLegal:" + this.f443241b.b(path));
        qd2.g gVar = this.f443241b;
        boolean z17 = false;
        if (i17 != 0) {
            gVar.c(false);
            return;
        }
        gVar.getClass();
        i95.m c17 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String aj6 = ((qs2.q) ((w40.e) c17)).aj(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAudioExtractor", "[extractAudioTrack] feedId:" + pm0.v.u(j17) + " destPath:" + aj6);
        if (gVar.b(aj6)) {
            gVar.f443266g = aj6;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAudioExtractor", "[extractAudioTrack] audio existed, length = " + ((((float) o35.a.g(aj6)) / 1024.0f) / 1024.0f) + 'M');
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAudioExtractor", "[extractAudioTrack] audio not exist, try extract");
            i95.m c18 = i95.n0.c(bg0.v.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            if (((b92.u2) ((bg0.v) c18)).Ri(path, aj6)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAudioExtractor", "[extractAudioTrack] audio length = " + ((((float) o35.a.g(aj6)) / 1024.0f) / 1024.0f) + 'M');
                i95.m c19 = i95.n0.c(qc0.e1.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                qc0.d1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p2015x36f002.C17096x4dad80a5.f237984a.a(aj6);
                long j18 = a17 != null ? a17.f442899d : 0L;
                if (a17 == null || j18 == 0 || !gVar.b(aj6)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAudioExtractor", "[extractAudioTrack] no audio track");
                } else {
                    gVar.f443266g = aj6;
                }
            }
        }
        gVar.f443263d = true;
        java.lang.String str = gVar.f443266g;
        if (str != null) {
            if (!(str.length() == 0)) {
                z17 = true;
            }
        }
        gVar.c(z17);
    }

    @Override // c50.z0
    public void b(long j17, long j18, long j19) {
    }
}
