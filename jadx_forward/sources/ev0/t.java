package ev0;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public ev0.b f338412b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f338413c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f338414d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Float f338416f;

    /* renamed from: a, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f338411a = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.J(1).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));

    /* renamed from: e, reason: collision with root package name */
    public final ev0.i f338415e = new ev0.i(this);

    public static final void a(ev0.t tVar, java.lang.String str, int i17) {
        tVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MovieComposingMusicPlayer", "onAllComplete " + str + ' ' + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = tVar.f338413c;
        if (c16997xb0aa383a == null) {
            return;
        }
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MovieComposingMusicPlayer", "onAllComplete, ret:" + i17);
        } else {
            i95.m c17 = i95.n0.c(m40.k0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((c61.p7) ((m40.k0) c17)).fj(c16997xb0aa383a.f237248i);
            c16997xb0aa383a.f237249m = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(ev0.t r20, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a r21, yz5.a r22) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ev0.t.b(ev0.t, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo, yz5.a):void");
    }

    public static p3325xe03a0797.p3326xc267989b.r2 c(ev0.t tVar, boolean z17, yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        return p3325xe03a0797.p3326xc267989b.l.d(tVar.f338411a, null, null, new ev0.j(tVar, z17, aVar, null), 3, null);
    }

    public final p3325xe03a0797.p3326xc267989b.r2 d() {
        return p3325xe03a0797.p3326xc267989b.l.d(this.f338411a, null, null, new ev0.n(this, null), 3, null);
    }

    public final void e(float f17) {
        float e17 = e06.p.e(f17, 0.0f, 1.0f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MovieComposingMusicPlayer", "setVolume " + e17);
        this.f338416f = java.lang.Float.valueOf(e17);
        ev0.b bVar = this.f338412b;
        if (bVar != null) {
            bVar.K(e17);
        }
    }
}
