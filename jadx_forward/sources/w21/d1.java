package w21;

/* loaded from: classes14.dex */
public class d1 implements tl.h {

    /* renamed from: a, reason: collision with root package name */
    public android.media.MediaPlayer f523868a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f523869b;

    /* renamed from: c, reason: collision with root package name */
    public tl.e f523870c;

    /* renamed from: d, reason: collision with root package name */
    public tl.f f523871d;

    /* renamed from: e, reason: collision with root package name */
    public final fp.e f523872e;

    /* renamed from: f, reason: collision with root package name */
    public int f523873f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f523874g;

    public d1() {
        this.f523869b = "";
        this.f523870c = null;
        this.f523871d = null;
        this.f523873f = 0;
        this.f523874g = true;
        to.g gVar = new to.g();
        this.f523868a = gVar;
        gVar.setOnCompletionListener(new w21.b1(this));
        this.f523868a.setOnErrorListener(new w21.c1(this));
    }

    @Override // tl.h
    public void a(tl.f fVar) {
        this.f523871d = fVar;
    }

    @Override // tl.h
    public void b(tl.e eVar) {
        this.f523870c = eVar;
    }

    @Override // tl.h
    public double c() {
        int i17 = this.f523873f;
        if (i17 != 1 && i17 != 2) {
            return 0.0d;
        }
        try {
            int currentPosition = this.f523868a.getCurrentPosition();
            int duration = this.f523868a.getDuration();
            if (duration != 0) {
                return currentPosition / duration;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoicePlayer", "getDuration File[" + this.f523869b + "] Failed");
            return 0.0d;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoicePlayer", "getNowProgress File[" + this.f523869b + "] ErrMsg[" + e17.getStackTrace() + "]");
            mo166733x360802();
            return 0.0d;
        }
    }

    @Override // tl.h
    public void d(tl.g gVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoicePlayer", "seek not support");
    }

    @Override // tl.h
    public boolean e(java.lang.String str, boolean z17, int i17) {
        return l(str, z17, i17);
    }

    @Override // tl.h
    public boolean f(boolean z17) {
        fp.e eVar = this.f523872e;
        try {
            if (this.f523873f != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoicePlayer", "pause not STATUS_PLAYING error status:" + this.f523873f);
                return false;
            }
            try {
                this.f523868a.pause();
                if (eVar != null && z17 && this.f523874g) {
                    eVar.a();
                }
                this.f523873f = 2;
                return true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoicePlayer", "pause File[" + this.f523869b + "] ErrMsg[" + e17.getStackTrace() + "]");
                this.f523873f = -1;
                if (eVar != null && z17 && this.f523874g) {
                    eVar.a();
                }
                return false;
            }
        } catch (java.lang.Throwable th6) {
            if (eVar != null && z17 && this.f523874g) {
                eVar.a();
            }
            throw th6;
        }
    }

    @Override // tl.h
    public void g(boolean z17) {
        if (this.f523868a == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.Bi()) {
            return;
        }
        int currentPosition = this.f523868a.getCurrentPosition();
        mo166733x360802();
        to.g gVar = new to.g();
        this.f523868a = gVar;
        gVar.setOnCompletionListener(new w21.b1(this));
        this.f523868a.setOnErrorListener(new w21.c1(this));
        l(this.f523869b, z17, currentPosition);
    }

    @Override // tl.h
    /* renamed from: getStatus */
    public int mo166727x2fe4f2e8() {
        return this.f523873f;
    }

    @Override // tl.h
    public boolean h(float f17) {
        return false;
    }

    @Override // tl.h
    public void i(boolean z17) {
        this.f523874g = z17;
    }

    @Override // tl.h
    /* renamed from: isPlaying */
    public boolean mo166728xc00617a4() {
        return this.f523873f == 1;
    }

    @Override // tl.h
    public boolean j(java.lang.String str, boolean z17) {
        return l(str, z17, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d A[Catch: Exception -> 0x0048, TryCatch #0 {Exception -> 0x0048, blocks: (B:9:0x0011, B:11:0x0017, B:15:0x0023, B:17:0x0027, B:18:0x002a, B:20:0x003d, B:21:0x0042), top: B:8:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(boolean r5, int r6) {
        /*
            r4 = this;
            fp.e r0 = r4.f523872e
            java.lang.String r1 = r4.f523869b
            boolean r1 = com.p314xaae8f345.mm.vfs.w6.j(r1)
            if (r1 != 0) goto Lb
            return
        Lb:
            r1 = 3
            if (r5 == 0) goto L10
            r5 = r1
            goto L11
        L10:
            r5 = 0
        L11:
            wo.c r2 = wo.v1.f529356c     // Catch: java.lang.Exception -> L48
            boolean r3 = r2.f529122a     // Catch: java.lang.Exception -> L48
            if (r3 == 0) goto L20
            r2.c()     // Catch: java.lang.Exception -> L48
            int r2 = r2.f529136h     // Catch: java.lang.Exception -> L48
            r3 = 1
            if (r2 != r3) goto L20
            goto L21
        L20:
            r1 = r5
        L21:
            if (r0 == 0) goto L2a
            boolean r5 = r4.f523874g     // Catch: java.lang.Exception -> L48
            if (r5 == 0) goto L2a
            r0.b()     // Catch: java.lang.Exception -> L48
        L2a:
            android.media.MediaPlayer r5 = r4.f523868a     // Catch: java.lang.Exception -> L48
            r5.setAudioStreamType(r1)     // Catch: java.lang.Exception -> L48
            android.media.MediaPlayer r5 = r4.f523868a     // Catch: java.lang.Exception -> L48
            java.lang.String r1 = r4.f523869b     // Catch: java.lang.Exception -> L48
            r5.setDataSource(r1)     // Catch: java.lang.Exception -> L48
            android.media.MediaPlayer r5 = r4.f523868a     // Catch: java.lang.Exception -> L48
            r5.prepare()     // Catch: java.lang.Exception -> L48
            if (r6 <= 0) goto L42
            android.media.MediaPlayer r5 = r4.f523868a     // Catch: java.lang.Exception -> L48
            r5.seekTo(r6)     // Catch: java.lang.Exception -> L48
        L42:
            android.media.MediaPlayer r5 = r4.f523868a     // Catch: java.lang.Exception -> L48
            r5.start()     // Catch: java.lang.Exception -> L48
            goto L78
        L48:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "playImp : fail, exception = "
            r6.<init>(r1)
            java.lang.String r1 = r5.getMessage()
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r1 = "MicroMsg.VoicePlayer"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r6)
            boolean r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            java.lang.String r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r6 = "exception:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r6, r5)
            if (r0 == 0) goto L78
            boolean r5 = r4.f523874g
            if (r5 == 0) goto L78
            r0.a()
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w21.d1.k(boolean, int):void");
    }

    public final boolean l(java.lang.String str, boolean z17, int i17) {
        if (this.f523873f != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoicePlayer", "startPlay error status:" + this.f523873f);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoicePlayer", "startPlay speakerOn:%s,seekTo:%s,", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        this.f523869b = str;
        try {
            k(z17, i17);
        } catch (java.lang.Exception e17) {
            try {
                k(true, i17);
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoicePlayer", "startPlay File[" + this.f523869b + "] failed");
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoicePlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                this.f523873f = -1;
                return false;
            }
        }
        this.f523873f = 1;
        return true;
    }

    @Override // tl.h
    /* renamed from: pause */
    public boolean mo166729x65825f6() {
        return f(true);
    }

    @Override // tl.h
    /* renamed from: resume */
    public boolean mo166730xc84dc82d() {
        fp.e eVar = this.f523872e;
        try {
            if (this.f523873f != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoicePlayer", "resume not STATUS_PAUSE error status:" + this.f523873f);
                return false;
            }
            try {
                this.f523868a.start();
                if (eVar != null && this.f523874g) {
                    eVar.b();
                }
                this.f523873f = 1;
                return true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoicePlayer", "resume File[" + this.f523869b + "] ErrMsg[" + e17.getStackTrace() + "]");
                this.f523873f = -1;
                if (eVar != null && this.f523874g) {
                    eVar.b();
                }
                return false;
            }
        } catch (java.lang.Throwable th6) {
            if (eVar != null && this.f523874g) {
                eVar.b();
            }
            throw th6;
        }
    }

    @Override // tl.h
    /* renamed from: seek */
    public boolean mo166731x35ce78(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoicePlayer", "seek not support");
        return false;
    }

    @Override // tl.h
    /* renamed from: setMute */
    public void mo166732x764d819b(boolean z17) {
        if (!j65.e.b() || !j65.e.g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoicePlayer", "is not mute mode, don't set mute!!");
            return;
        }
        android.media.MediaPlayer mediaPlayer = this.f523868a;
        if (mediaPlayer == null) {
            return;
        }
        if (z17) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // tl.h
    /* renamed from: stop */
    public boolean mo166733x360802() {
        fp.e eVar = this.f523872e;
        int i17 = this.f523873f;
        if (i17 != 1 && i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoicePlayer", "stop not STATUS_PLAYING or STATUS_PAUSE error status:" + this.f523873f);
            return false;
        }
        try {
            try {
                this.f523868a.stop();
                this.f523868a.release();
                if (eVar != null && this.f523874g) {
                    eVar.a();
                }
                this.f523873f = 0;
                return true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoicePlayer", "stop File[" + this.f523869b + "] ErrMsg[" + e17.getStackTrace() + "]");
                this.f523873f = -1;
                if (eVar != null && this.f523874g) {
                    eVar.a();
                }
                return false;
            }
        } catch (java.lang.Throwable th6) {
            if (eVar != null && this.f523874g) {
                eVar.a();
            }
            throw th6;
        }
    }

    public d1(android.content.Context context) {
        this();
        this.f523872e = new fp.e(context);
    }
}
