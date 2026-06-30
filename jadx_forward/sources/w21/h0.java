package w21;

/* loaded from: classes14.dex */
public class h0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w21.i0 f523910d;

    public h0(w21.i0 i0Var) {
        this.f523910d = i0Var;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "SpeexPlayer_play";
    }

    @Override // java.lang.Runnable
    public void run() {
        android.media.AudioTrack audioTrack;
        try {
            android.os.Process.setThreadPriority(-16);
            w21.i0 i0Var = this.f523910d;
            i0Var.f523929q = com.p314xaae8f345.mm.vfs.w6.E(i0Var.f523914b);
            while (true) {
                if (this.f523910d.f523917e != 1 && this.f523910d.f523917e != 2) {
                    break;
                }
                w21.i0 i0Var2 = this.f523910d;
                i0Var2.f523928p = i0Var2.f523929q.read(i0Var2.f523927o);
                w21.i0 i0Var3 = this.f523910d;
                int i17 = i0Var3.f523928p;
                if (i17 != -1) {
                    byte[] a17 = i0Var3.f523920h.a(i0Var3.f523927o, 0, i17);
                    if (a17 != null && a17.length != 0) {
                        int length = a17.length;
                        int i18 = 0;
                        while (true) {
                            w21.i0 i0Var4 = this.f523910d;
                            if (length < i0Var4.f523930r || i0Var4.f523917e != 1) {
                                break;
                            }
                            w21.i0 i0Var5 = this.f523910d;
                            boolean z17 = i0Var5.f523925m;
                            if (z17) {
                                java.lang.Thread.sleep(20L);
                            } else {
                                android.media.AudioTrack audioTrack2 = i0Var5.f523913a;
                                if (audioTrack2 != null && !z17) {
                                    audioTrack2.write(a17, i18, i0Var5.f523930r);
                                    int i19 = this.f523910d.f523930r;
                                    i18 += i19;
                                    length -= i19;
                                }
                            }
                        }
                        w21.i0 i0Var6 = this.f523910d;
                        if (length < i0Var6.f523930r && length > 0 && (audioTrack = i0Var6.f523913a) != null) {
                            audioTrack.write(a17, i18, length);
                        }
                    }
                    this.f523910d.f523917e = 0;
                } else {
                    i0Var3.f523917e = 0;
                }
                if (this.f523910d.f523917e == 2) {
                    this.f523910d.getClass();
                    synchronized ("") {
                        try {
                            this.f523910d.getClass();
                            "".notify();
                        } catch (java.lang.Exception e17) {
                            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexPlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                        }
                    }
                    this.f523910d.getClass();
                    synchronized ("") {
                        try {
                            this.f523910d.getClass();
                            "".wait();
                        } catch (java.lang.Exception e18) {
                            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexPlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
                        }
                    }
                } else {
                    this.f523910d.getClass();
                    synchronized ("") {
                        try {
                            this.f523910d.getClass();
                            "".notify();
                        } catch (java.lang.Exception e19) {
                            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexPlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e19));
                        }
                    }
                }
            }
            if (this.f523910d.f523917e != 3) {
                java.lang.Thread.sleep(1000L);
            }
        } catch (java.lang.Exception e27) {
            boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexPlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e27));
            android.media.MediaPlayer.OnErrorListener onErrorListener = this.f523910d.f523922j;
            if (onErrorListener != null) {
                ((w21.g0) onErrorListener).onError(null, 0, 0);
            }
            this.f523910d.f523917e = 0;
        }
        java.io.InputStream inputStream = this.f523910d.f523929q;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.io.IOException e28) {
                boolean z29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexPlayer", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e28));
            }
            this.f523910d.f523929q = null;
        }
        int c17 = this.f523910d.f523920h.c();
        if (this.f523910d.f523917e != 3) {
            tl.e eVar = this.f523910d.f523915c;
            if (eVar != null) {
                eVar.mo66237xa6db431b();
            }
            android.media.MediaPlayer.OnCompletionListener onCompletionListener = this.f523910d.f523921i;
            if (onCompletionListener != null) {
                ((w21.f0) onCompletionListener).onCompletion(null);
            }
        } else {
            try {
                this.f523910d.n();
            } catch (java.lang.Exception unused) {
            }
        }
        if (c17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeexPlayer", "res: " + c17);
        }
    }
}
