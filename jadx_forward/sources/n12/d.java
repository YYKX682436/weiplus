package n12;

/* loaded from: classes10.dex */
public final class d implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n12.e f415601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415603f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f415604g;

    public d(n12.e eVar, java.lang.String str, java.lang.String str2, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f415601d = eVar;
        this.f415602e = str;
        this.f415603f = str2;
        this.f415604g = qVar;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmoticonCustomCreateDownloadLogic", "onProgress: " + j17 + " / " + j18);
        n12.a aVar = this.f415601d.f415605a;
        if (aVar != null) {
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((p12.l) aVar).f432570a).k(java.lang.Float.valueOf(((float) j17) / ((float) j18)));
        }
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmoticonCustomCreateDownloadLogic", "onFinish: " + str + ", result: " + i17);
        p3325xe03a0797.p3326xc267989b.q qVar = this.f415604g;
        if (i17 != 0) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("Invalid ret: " + i17))));
            return;
        }
        java.lang.String str2 = this.f415602e;
        java.lang.String str3 = this.f415603f;
        com.p314xaae8f345.mm.vfs.w6.w(str2, str3);
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(str3));
    }

    @Override // dn.n
    /* renamed from: onDataAvailable */
    public void mo65706x9bb59ea0(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmoticonCustomCreateDownloadLogic", "onDataAvailable: " + j17 + " / " + j18);
    }

    @Override // dn.n
    /* renamed from: onM3U8Ready */
    public void mo65707xc5dd699b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmoticonCustomCreateDownloadLogic", "onM3U8Ready");
    }

    @Override // dn.n
    /* renamed from: onMoovReady */
    public void mo65708xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmoticonCustomCreateDownloadLogic", "onMoovReady");
    }
}
