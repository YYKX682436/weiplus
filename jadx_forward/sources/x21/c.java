package x21;

/* loaded from: classes14.dex */
public final class c implements x21.f {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f533045a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f533046b;

    /* renamed from: c, reason: collision with root package name */
    public android.media.AudioTrack f533047c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f533048d;

    /* renamed from: e, reason: collision with root package name */
    public int f533049e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f533050f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f533051g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f533052h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f533053i;

    /* renamed from: j, reason: collision with root package name */
    public int f533054j;

    /* renamed from: k, reason: collision with root package name */
    public f25.m0 f533055k;

    /* renamed from: l, reason: collision with root package name */
    public final x21.a f533056l;

    public c(boolean z17, yz5.a onPlayInterrupt, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onPlayInterrupt, "onPlayInterrupt");
        this.f533045a = onPlayInterrupt;
        this.f533046b = z18;
        this.f533048d = z17;
        this.f533049e = 16000;
        this.f533051g = new java.lang.Object();
        this.f533052h = new java.lang.Object();
        this.f533056l = new x21.a(this);
    }

    public static void d(x21.c cVar, boolean z17, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            z17 = cVar.f533048d;
        }
        if ((i18 & 2) != 0) {
            i17 = cVar.f533049e;
        }
        cVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MSP.AudioTrackAudioPlayer", "setPlayParams " + z17 + ", sampleRate: " + i17 + "; curPR: " + cVar.f533048d + ", curSR: " + cVar.f533049e);
        synchronized (cVar.f533051g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MSP.AudioTrackAudioPlayer", "real do");
            android.media.AudioTrack audioTrack = cVar.f533047c;
            if (audioTrack != null) {
                if (audioTrack.getPlayState() == 3) {
                    cVar.b(z17, i17);
                }
            }
            cVar.f533048d = z17;
            cVar.f533049e = i17;
        }
    }

    public final void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MSP.AudioTrackAudioPlayer", "pausePlay " + z17 + ", curState " + this.f533053i);
        if (z17) {
            synchronized (this.f533052h) {
                this.f533053i = true;
            }
        } else {
            synchronized (this.f533052h) {
                this.f533053i = false;
                this.f533052h.notifyAll();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:12|13|(3:15|(1:17)|18)|19|(2:(1:48)(1:24)|(10:26|(2:28|(1:32))|34|35|(1:37)|38|39|(1:41)|42|43))|49|50|51|(1:53)(1:65)|54|55|(1:59)|60|(1:62)|63|43) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
    
        if (r1 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e4, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e5, code lost:
    
        r1 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(r8));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r7, int r8) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x21.c.b(boolean, int):void");
    }

    public final void c(boolean z17) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MSP.AudioTrackAudioPlayer", "release audioTrack forceStop: " + z17 + ' ' + this.f533047c, new java.lang.Object[0]);
        a(false);
        synchronized (this.f533051g) {
            this.f533050f = false;
            android.media.AudioTrack audioTrack = this.f533047c;
            if (audioTrack != null) {
                if (z17) {
                    try {
                        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        audioTrack.pause();
                        audioTrack.flush();
                        audioTrack.release();
                        if (this.f533046b) {
                            f25.m0 m0Var = this.f533055k;
                            if (m0Var != null) {
                                i95.m c17 = i95.n0.c(f25.n0.class);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                                ((f25.n0) c17).yg(m0Var);
                            }
                            this.f533055k = null;
                        }
                        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                    } catch (java.lang.Throwable th6) {
                        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                    }
                    java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
                    if (m143898xd4a2fc34 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MSP.AudioTrackAudioPlayer", "stop audio track error", m143898xd4a2fc34);
                    }
                    p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(m143895xf1229813);
                } else {
                    audioTrack.setNotificationMarkerPosition(this.f533054j / 2);
                    audioTrack.setPlaybackPositionUpdateListener(new x21.b(this));
                }
            }
            this.f533047c = null;
            this.f533054j = 0;
        }
    }

    public boolean e(x21.m rawAudioInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawAudioInfo, "rawAudioInfo");
        synchronized (this.f533052h) {
            if (this.f533053i) {
                this.f533052h.wait();
            }
        }
        synchronized (this.f533051g) {
            if (this.f533047c != null && this.f533050f) {
                if (rawAudioInfo.f533087d != this.f533049e) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MSP.AudioTrackAudioPlayer", "sample rate not match, new is " + rawAudioInfo.f533087d);
                    b(this.f533048d, rawAudioInfo.f533087d);
                }
                rawAudioInfo.f533086c.rewind();
                android.media.AudioTrack audioTrack = this.f533047c;
                if (audioTrack != null) {
                    audioTrack.write(rawAudioInfo.f533086c.array(), 0, rawAudioInfo.f533086c.limit());
                }
                this.f533054j += rawAudioInfo.f533086c.limit();
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MSP.AudioTrackAudioPlayer", "write error canWrite: " + this.f533050f + ' ' + this.f533047c);
            return false;
        }
    }
}
