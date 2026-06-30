package w21;

/* loaded from: classes14.dex */
public class a0 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w21.d0 f523829e;

    public a0(w21.d0 d0Var, w21.y yVar) {
        this.f523829e = d0Var;
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "SilkPlayer_play_" + this.f523829e.f523854m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int minBufferSize;
        w21.d0 d0Var;
        int i18;
        int write;
        yl.d dVar;
        try {
            android.os.Process.setThreadPriority(-16);
            int minBufferSize2 = android.media.AudioTrack.getMinBufferSize(this.f523829e.f523849h, 2, 2) * 2;
            byte[] bArr = new byte[minBufferSize2];
            int i19 = (short) ((this.f523829e.f523849h * 20) / 1000);
            short[] sArr = new short[i19];
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "Thread start");
            while (true) {
                if (this.f523829e.f523851j != 1 && this.f523829e.f523851j != 2) {
                    break;
                }
                synchronized (w21.d0.I) {
                    try {
                        int i27 = w21.d0.K;
                        int i28 = this.f523829e.f523854m;
                        if (i27 != i28) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "[%d] diff id, useDeocder: %d", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(w21.d0.K));
                            w21.d0.k(this.f523829e);
                            if (this.f523829e.f523852k > 3) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(161L, 17L, 1L, false);
                            }
                            w21.d0 d0Var2 = this.f523829e;
                            d0Var2.q(d0Var2.f523850i);
                        }
                    } finally {
                    }
                }
                while (this.f523829e.f523853l) {
                    java.lang.Thread.sleep(20L);
                }
                w21.d0 d0Var3 = this.f523829e;
                if (d0Var3.f523861t != null) {
                    vl.a aVar = d0Var3.f523857p;
                    if (aVar != null) {
                        aVar.a(i19, bArr);
                    }
                    int i29 = 0;
                    while (true) {
                        long j17 = this.f523829e.f523864w;
                        d0Var = this.f523829e;
                        if (j17 < d0Var.f523855n || i29 < 0 || d0Var.f523866y) {
                            break;
                        }
                        i29 = d0Var.f523861t.b(bArr, i19);
                        if (i29 > 0) {
                            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(minBufferSize2);
                            allocate.put(bArr);
                            allocate.position(0);
                            w21.d0.m(this.f523829e);
                            ((java.util.ArrayList) this.f523829e.f523867z).add(allocate);
                        } else if (i29 == 0) {
                            this.f523829e.f523866y = true;
                        }
                    }
                    long j18 = d0Var.f523864w;
                    w21.d0 d0Var4 = this.f523829e;
                    if (j18 >= d0Var4.f523855n || i29 < 0 || ((java.util.ArrayList) d0Var4.f523867z).size() <= this.f523829e.f523864w) {
                        i18 = i29;
                    } else {
                        w21.d0 d0Var5 = this.f523829e;
                        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) ((java.util.ArrayList) d0Var5.f523867z).get((int) d0Var5.f523864w);
                        byteBuffer.position(0);
                        byteBuffer.get(bArr);
                        i18 = 1;
                    }
                    if (i18 < 0) {
                        this.f523829e.f523851j = 0;
                        w21.e0 e0Var = this.f523829e.D;
                        if (e0Var != null) {
                            e0Var.d();
                            w21.e0 e0Var2 = this.f523829e.D;
                            if (e0Var2.f523885i > 0) {
                                int write2 = this.f523829e.f523842a.write(sArr, 0, e0Var2.g(sArr, i19));
                                if (write2 <= 0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SilkPlayer", "playing done: write ret %d", java.lang.Integer.valueOf(write2));
                                } else {
                                    this.f523829e.H += write2 * 2;
                                }
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        g0Var.mo68477x336bdfd8(161L, 0L, 1L, false);
                        g0Var.mo68477x336bdfd8(161L, 4L, 1L, false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "[%d] SilkDoDec failed: %d", java.lang.Integer.valueOf(this.f523829e.f523854m), java.lang.Integer.valueOf(i18));
                        yl.d dVar2 = this.f523829e.f523856o;
                        if (dVar2 != null && x51.o1.H) {
                            dVar2.a();
                        }
                    } else {
                        if (x51.o1.H && (dVar = this.f523829e.f523856o) != null) {
                            dVar.b(bArr, i19 * 2);
                        }
                        try {
                            w21.d0 d0Var6 = this.f523829e;
                            android.media.AudioTrack audioTrack = d0Var6.f523842a;
                            if (audioTrack != null) {
                                if (d0Var6.f523865x) {
                                    audioTrack.pause();
                                    audioTrack.flush();
                                    audioTrack.play();
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "seek flush audioTrack");
                                }
                                w21.e0 e0Var3 = this.f523829e.D;
                                if (e0Var3 != null) {
                                    e0Var3.h(bArr, i19 * 2);
                                    write = audioTrack.write(sArr, 0, this.f523829e.D.g(sArr, i19)) * 2;
                                } else {
                                    write = audioTrack.write(bArr, 0, i19 * 2);
                                }
                                if (write <= 0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SilkPlayer", "playing: write ret %d", java.lang.Integer.valueOf(write));
                                } else {
                                    this.f523829e.H += write;
                                }
                            }
                            w21.d0 d0Var7 = this.f523829e;
                            tl.g gVar = d0Var7.f523862u;
                            if (gVar != null && !d0Var7.f523865x) {
                                ((sl.b) gVar).a(this.f523829e.f523864w * 20);
                            }
                            this.f523829e.getClass();
                            synchronized (this.f523829e.f523863v) {
                                w21.d0.l(this.f523829e);
                                this.f523829e.f523865x = false;
                            }
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "write audio track failed: %s", e17.getMessage());
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                            g0Var2.mo68477x336bdfd8(161L, 0L, 1L, false);
                            g0Var2.mo68477x336bdfd8(161L, 5L, 1L, false);
                        }
                        if (i18 == 0) {
                            this.f523829e.f523851j = 4;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "[%d] play completed", java.lang.Integer.valueOf(this.f523829e.f523854m));
                            yl.d dVar3 = this.f523829e.f523856o;
                            if (dVar3 != null && x51.o1.H) {
                                dVar3.a();
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new w21.b0(this));
                            }
                        } else if (this.f523829e.f523851j == 2) {
                            this.f523829e.getClass();
                            synchronized ("") {
                                try {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "before mOk.notify");
                                    this.f523829e.getClass();
                                    "".notifyAll();
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "after mOk.notify");
                                } catch (java.lang.Exception e18) {
                                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
                                }
                            }
                            this.f523829e.getClass();
                            synchronized ("") {
                                try {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "before mpause.wait");
                                    this.f523829e.getClass();
                                    "".wait();
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "after mpause.wait");
                                } catch (java.lang.Exception e19) {
                                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e19));
                                }
                            }
                        } else {
                            this.f523829e.getClass();
                            synchronized ("") {
                                try {
                                    this.f523829e.getClass();
                                    "".notifyAll();
                                } catch (java.lang.Exception e27) {
                                    boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e27));
                                }
                            }
                        }
                    }
                } else {
                    d0Var3.f523851j = 0;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "[%d] SilkDoDec failed. data == null ", java.lang.Integer.valueOf(this.f523829e.f523854m));
                    yl.d dVar4 = this.f523829e.f523856o;
                    if (dVar4 != null && x51.o1.H) {
                        dVar4.a();
                    }
                }
            }
        } catch (java.lang.Exception e28) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(161L, 0L, 1L, false);
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e28));
            android.media.MediaPlayer.OnErrorListener onErrorListener = this.f523829e.F;
            if (onErrorListener != null) {
                ((w21.z) onErrorListener).onError(null, 0, 0);
            }
            this.f523829e.f523851j = 0;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: w21.a0$$a
            @Override // java.lang.Runnable
            public final void run() {
                w21.t0 t0Var;
                w21.a0 a0Var = w21.a0.this;
                a0Var.getClass();
                synchronized (w21.d0.I) {
                    int i37 = w21.d0.K;
                    w21.d0 d0Var8 = a0Var.f523829e;
                    if (i37 == d0Var8.f523854m && (t0Var = d0Var8.f523861t) != null) {
                        t0Var.a();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "[%d] SilkDecUnInit", java.lang.Integer.valueOf(a0Var.f523829e.f523854m));
                        w21.d0.K = -1;
                        a0Var.f523829e.f523852k = 0;
                    }
                }
                if (a0Var.f523829e.f523851j != 3) {
                    tl.e eVar = a0Var.f523829e.f523846e;
                    if (eVar != null) {
                        eVar.mo66237xa6db431b();
                    }
                    android.media.MediaPlayer.OnCompletionListener onCompletionListener = a0Var.f523829e.E;
                    if (onCompletionListener != null) {
                        ((w21.y) onCompletionListener).onCompletion(null);
                        return;
                    }
                    return;
                }
                if (a0Var.f523829e.f523842a != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "mAudioTrack.stop()");
                    try {
                        a0Var.f523829e.v();
                    } catch (java.lang.Exception e29) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "mAudioTrack.stop() error: %s", e29.getMessage());
                    }
                }
            }
        };
        w21.d0 d0Var8 = this.f523829e;
        android.media.AudioTrack audioTrack2 = d0Var8.f523842a;
        if (!d0Var8.A || d0Var8.f523851j == 3 || audioTrack2 == null || audioTrack2.getPlayState() != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "complete");
            runnable.run();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "delay complete");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_silk_player_use_sleep, 0) == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "stop use old sleep 1000");
            java.util.concurrent.Future future = this.f523829e.G;
            if (future != null && !future.isDone()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "has uncomplete task");
            }
            this.f523829e.G = ((ku5.t0) ku5.t0.f394148d).k(runnable, 1000L);
            return;
        }
        if (audioTrack2.getPlaybackHeadPosition() >= this.f523829e.H / 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "audioTrackHeadPosition %d writtenBytes %d, just invoke oncomp", java.lang.Integer.valueOf(audioTrack2.getPlaybackHeadPosition()), java.lang.Integer.valueOf(this.f523829e.H));
            java.util.concurrent.Future future2 = this.f523829e.G;
            if (future2 != null && !future2.isDone()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "has uncomplete task");
            }
            w21.d0 d0Var9 = this.f523829e;
            ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
            t0Var.getClass();
            d0Var9.G = t0Var.k(runnable, 0L);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "set setNotificationMarkerPosition %d", java.lang.Integer.valueOf(this.f523829e.H / 2));
        try {
            i17 = audioTrack2.setNotificationMarkerPosition(this.f523829e.H / 2);
        } catch (java.lang.Exception e29) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "run: setNotificationMarkerPosition error", e29);
            i17 = -1;
        }
        if (i17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "run: setNotificationMarkerPosition error %d", java.lang.Integer.valueOf(i17));
            java.util.concurrent.Future future3 = this.f523829e.G;
            if (future3 != null && !future3.isDone()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "has uncompleted task");
            }
            w21.d0 d0Var10 = this.f523829e;
            ku5.t0 t0Var2 = (ku5.t0) ku5.t0.f394148d;
            t0Var2.getClass();
            d0Var10.G = t0Var2.k(runnable, 0L);
            return;
        }
        this.f523829e.B = true;
        this.f523829e.C = runnable;
        try {
            audioTrack2.setPlaybackPositionUpdateListener(new w21.c0(this, ((ku5.t0) ku5.t0.f394148d).k(runnable, 5000L), runnable), new android.os.Handler(android.os.Looper.getMainLooper()));
        } catch (java.lang.Exception e37) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "run: setPlaybackPositionUpdateListener error", e37);
        }
        try {
            minBufferSize = audioTrack2.getBufferSizeInFrames() * 2;
        } catch (java.lang.IllegalStateException e38) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SilkPlayer", e38, "get buffer size error", new java.lang.Object[0]);
            minBufferSize = this.f523829e.f523858q * android.media.AudioTrack.getMinBufferSize(this.f523829e.f523849h, 2, 2);
        }
        int i37 = this.f523829e.H % minBufferSize;
        if (i37 == 0 || i37 >= minBufferSize) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SilkPlayer", "run: need write empty data %d, %d", java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(minBufferSize));
        int i38 = minBufferSize - i37;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilkPlayer", "run: write ret %d", java.lang.Integer.valueOf(audioTrack2.write(new byte[i38], 0, i38)));
        } catch (java.lang.Exception e39) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SilkPlayer", "run: write error", e39);
        }
    }
}
