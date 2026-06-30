package tl;

/* loaded from: classes12.dex */
public final class o0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f501597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tl.p0 f501598e;

    public o0(tl.p0 p0Var) {
        this.f501598e = p0Var;
        this.f501597d = new tl.n0(this, p0Var);
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "SceneVoiceRecorder_record";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f501598e.f501622v);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoice.Recorder", "RecordStartRunnable begin run %s", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        oy.i iVar = (oy.i) i95.n0.c(oy.i.class);
        if (iVar != null && ((com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1) iVar).f146886p != oy.k.f431356d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoice.Recorder", "TTS is playing, wait shortly before recording");
            try {
                java.lang.Thread.sleep(300L);
            } catch (java.lang.Exception unused) {
            }
        }
        synchronized (this.f501598e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoice.Recorder", "lock[%s] of runnable[%s]!", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), this.f501598e);
            tl.d dVar = this.f501598e.f501601a;
            if (dVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoice.Recorder", "Stop Record Failed recorder == null");
                return;
            }
            if (dVar != null) {
                java.lang.String vj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).vj(bm5.y.f104290j, this.f501598e.f501605e, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoice.Recorder", "Thread Started Record, fullPath: %s, useSpeex: %s", vj6, java.lang.Boolean.valueOf(this.f501598e.f501615o));
                if (!dVar.mo166725x8e35cb53(vj6)) {
                    if (!this.f501598e.m() || this.f501598e.f501606f == null) {
                        w21.x0.b(this.f501598e.f501605e);
                    } else {
                        ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).aj(this.f501598e.f501606f);
                    }
                    tl.p0 p0Var = this.f501598e;
                    p0Var.f501605e = null;
                    p0Var.f501601a = null;
                    p0Var.f501606f = null;
                    p0Var.f501607g = null;
                    p0Var.l();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoice.Recorder", "Thread Start Record  Error fileName[" + this.f501598e.f501605e + "]");
                }
                tl.p0 p0Var2 = this.f501598e;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                p0Var2.f501612l = android.os.SystemClock.elapsedRealtime();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoice.Recorder", "Thread Started Record fileName[" + this.f501598e.f501605e + "] time:" + (android.os.SystemClock.elapsedRealtime() - this.f501598e.f501611k));
            }
            this.f501597d.mo50307xb9e94560(0, 1L);
        }
    }
}
