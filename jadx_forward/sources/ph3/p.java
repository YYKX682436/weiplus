package ph3;

/* loaded from: classes14.dex */
public class p extends ph3.i {
    public boolean A;
    public long B;
    public float C;
    public long D;

    /* renamed from: w, reason: collision with root package name */
    public android.view.Surface f435989w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f435990x;

    /* renamed from: y, reason: collision with root package name */
    public int f435991y;

    /* renamed from: z, reason: collision with root package name */
    public int f435992z;

    public p(ph3.h hVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        super(hVar, n3Var);
        this.f435990x = false;
        this.A = false;
        this.B = 0L;
        this.C = 1.0f;
        this.D = -1L;
    }

    @Override // ph3.i
    public ph3.g b(java.lang.String str) {
        return null;
    }

    @Override // ph3.i
    public void g(android.media.MediaFormat mediaFormat, java.lang.String str, int i17) {
        int mo10218x9787f6ed;
        boolean z17;
        super.g(mediaFormat, str, i17);
        this.f435992z = mediaFormat.getInteger("height");
        this.f435991y = mediaFormat.getInteger("width");
        if (mediaFormat.containsKey("rotation-degrees")) {
            mo10218x9787f6ed = mediaFormat.getInteger("rotation-degrees");
            z17 = true;
        } else {
            mo10218x9787f6ed = ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10218x9787f6ed(this.f435937d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoTrackDataSource", "%s it don't contains rotation key. degrees [%d]", i(), java.lang.Integer.valueOf(mo10218x9787f6ed));
            z17 = false;
        }
        if (java.lang.Math.abs(mo10218x9787f6ed) == 90 || java.lang.Math.abs(mo10218x9787f6ed) == 270) {
            int i18 = this.f435991y;
            this.f435991y = this.f435992z;
            this.f435992z = i18;
        }
        int i19 = z17 ? 0 : mo10218x9787f6ed;
        this.f435936c.mo50291x733c63a2(4, this.f435991y, this.f435992z, java.lang.Integer.valueOf(i19)).sendToTarget();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTrackDataSource", "%s video size[%d, %d] degrees[%d]", i(), java.lang.Integer.valueOf(this.f435991y), java.lang.Integer.valueOf(this.f435992z), java.lang.Integer.valueOf(i19));
    }

    @Override // ph3.i
    public boolean h(wo.i1 i1Var) {
        int i17;
        if (i1Var == null) {
            return false;
        }
        if (this.f435989w == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoTrackDataSource", "%s decoder configure surface but surface is null.", i());
            this.f435990x = false;
        } else {
            this.f435990x = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTrackDataSource", "%s handleDecoderBeforeStart", i());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTrackDataSource", "%s before prepare init decoder, surface valid: %s", i(), java.lang.Boolean.valueOf(this.f435989w.isValid()));
        gp.c cVar = this.f435947n;
        i1Var.a((cVar == null || (i17 = this.f435945l) <= -1) ? this.f435942i : cVar.e(i17), this.f435989w, null, 0);
        this.B = 0L;
        return false;
    }

    @Override // ph3.i
    public boolean n(long j17, long j18, wo.i1 i1Var, java.nio.ByteBuffer byteBuffer, int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
        i();
        long j19 = bufferInfo.presentationTimeUs;
        if (this.f435934a == 10) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTrackDataSource", "%s video track flush surface", i());
            i1Var.s(i17, true);
            t(4);
            return true;
        }
        if (this.f435934a == 6) {
            long j27 = j17 - (bufferInfo.presentationTimeUs / 1000);
            i();
            if (j27 <= 30) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTrackDataSource", "%s precision seek done to surface", i());
                i1Var.s(i17, true);
                if (this.A) {
                    t(7);
                    this.A = false;
                }
                this.A = true;
            } else {
                i1Var.s(i17, false);
            }
            return true;
        }
        int i18 = this.f435934a;
        if (!(i18 == 3 || i18 == 5 || i18 == 7)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTrackDataSource", "%s it no need process buffer now state %d", i(), java.lang.Integer.valueOf(this.f435934a));
            return false;
        }
        long j28 = bufferInfo.presentationTimeUs / 1000;
        long elapsedRealtime = ((((float) j28) / this.C) - ((float) j17)) - ((float) (android.os.SystemClock.elapsedRealtime() - j18));
        i();
        if (elapsedRealtime < -30) {
            i();
            i1Var.s(i17, false);
            this.f435935b.f435926h = 0L;
            return true;
        }
        if (elapsedRealtime >= 30) {
            i();
            return false;
        }
        this.f435935b.f435923e = bufferInfo.presentationTimeUs;
        if (elapsedRealtime > 11) {
            try {
                java.lang.Thread.sleep(elapsedRealtime - 10);
            } catch (java.lang.Exception unused) {
            }
        }
        int i19 = this.f435934a;
        if (!(i19 == 3 || i19 == 5 || i19 == 7)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTrackDataSource", "%s it no need process buffer now state %d", i(), java.lang.Integer.valueOf(this.f435934a));
            return false;
        }
        if (java.lang.Math.abs(j28 - this.B) > 1000 || this.B <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTrackDataSource", "%s finish to process index[%d] time[%d] to surface", i(), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j28));
            this.B = j28;
        }
        i1Var.s(i17, true);
        return true;
    }

    @Override // ph3.i
    public boolean r(int i17, long j17) {
        i();
        ph3.h hVar = this.f435935b;
        boolean z17 = hVar.f435927i;
        if (!hVar.f435927i || i17 != 1 || this.D == j17) {
            return false;
        }
        boolean a17 = a(j17, -1L);
        this.D = j17;
        return a17;
    }

    @Override // ph3.i
    public java.lang.String u() {
        return "video";
    }

    public final void v() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTrackDataSource", "%s change surface below 23", i());
        if (this.f435948o != null) {
            p();
            ph3.h hVar = this.f435935b;
            a(hVar.f435923e, -1L);
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrackDataSource", "%s start to prepare decoder mime[%s]", i(), this.f435943j);
                wo.i1 c17 = wo.i1.c(this.f435943j);
                this.f435948o = c17;
                h(c17);
                this.f435948o.x();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TrackDataSource", e17, "%s prepare decoder init decoder error ", i());
                hVar.d("video");
            }
        }
    }
}
