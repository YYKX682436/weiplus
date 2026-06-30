package fz4;

/* loaded from: classes12.dex */
public final class m implements com.p314xaae8f345.mm.p944x882e457a.x0, com.p314xaae8f345.mm.p944x882e457a.y0, com.p314xaae8f345.mm.p944x882e457a.z0, com.p314xaae8f345.mm.p944x882e457a.b1, com.p314xaae8f345.mm.sdk.p2603x2137b148.q7 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f348851d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f348853f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f348854g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 f348855h;

    /* renamed from: m, reason: collision with root package name */
    public int f348857m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 f348858n;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.c1 f348860p;

    /* renamed from: e, reason: collision with root package name */
    public boolean f348852e = true;

    /* renamed from: i, reason: collision with root package name */
    public long f348856i = -1;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f348859o = new java.util.ArrayList();

    public m() {
        if (this.f348858n == null) {
            this.f348858n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        if (this.f348855h == null) {
            this.f348855h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.s7(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.y0
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeNoteVoicePlayerControl", "on error, do stop play");
        j();
    }

    public final void b() {
        j();
        this.f348858n = null;
        this.f348855h = null;
        ((java.util.ArrayList) this.f348859o).clear();
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f348860p;
        if (c1Var != null) {
            sl.j jVar = (sl.j) c1Var;
            jVar.f490576p = null;
            jVar.f490575o = null;
            jVar.i();
        }
        this.f348860p = null;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.z0
    public void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteVoicePlayerControl", "on pause!!");
    }

    public final double d() {
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f348860p;
        if (c1Var != null) {
            return ((sl.j) c1Var).a();
        }
        return 0.0d;
    }

    public final com.p314xaae8f345.mm.p944x882e457a.c1 e() {
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f348860p;
        if (c1Var == null) {
            jz5.f0 f0Var = null;
            sl.j jVar = ((com.p314xaae8f345.mm.p944x882e457a.d1) i95.n0.c(com.p314xaae8f345.mm.p944x882e457a.d1.class)) != null ? new sl.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0) : null;
            this.f348860p = jVar;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(jVar != null ? jVar.hashCode() : 0);
            objArr[1] = this.f348851d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteVoicePlayerControl", "getPlayer: created new player instance, hashCode=%d, path=%s", objArr);
            java.lang.Object l17 = c01.d9.b().p().l(26, java.lang.Boolean.FALSE);
            java.lang.Boolean bool = l17 instanceof java.lang.Boolean ? (java.lang.Boolean) l17 : null;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            this.f348853f = booleanValue;
            boolean z17 = !booleanValue;
            this.f348852e = z17;
            com.p314xaae8f345.mm.p944x882e457a.c1 c1Var2 = this.f348860p;
            if (c1Var2 != null) {
                sl.j jVar2 = (sl.j) c1Var2;
                jVar2.f490576p = this;
                jVar2.f490575o = this;
                jVar2.f490565e = this;
                jVar2.f490566f = this;
                jVar2.f(z17);
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeNoteVoicePlayerControl", "get voice player fail, it is null");
            }
        } else {
            if (c1Var != null) {
                ((sl.j) c1Var).c();
            }
            com.p314xaae8f345.mm.p944x882e457a.c1 c1Var3 = this.f348860p;
            if (c1Var3 != null) {
                ((sl.j) c1Var3).b();
            }
        }
        return this.f348860p;
    }

    public final boolean f() {
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f348860p;
        if (c1Var != null) {
            return ((sl.j) c1Var).b();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.q7
    public void f1(boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f348851d)) {
            return;
        }
        if (this.f348854g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteVoicePlayerControl", "onSensorEvent: hasSkip");
            this.f348854g = !z17;
            return;
        }
        if (!z17) {
            long j17 = this.f348856i;
            if (j17 != -1 && android.os.SystemClock.elapsedRealtime() - j17 > 400) {
                this.f348854g = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteVoicePlayerControl", "onSensorEvent: skip");
                return;
            }
        }
        this.f348854g = false;
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f348860p;
        e();
        if (this.f348853f) {
            com.p314xaae8f345.mm.p944x882e457a.c1 e17 = e();
            if (e17 != null) {
                ((sl.j) e17).f(false);
            }
            this.f348852e = false;
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.c1 e18 = e();
        if (!(e18 != null && ((sl.j) e18).c())) {
            com.p314xaae8f345.mm.p944x882e457a.c1 e19 = e();
            if (e19 != null) {
                ((sl.j) e19).f(true);
            }
            this.f348852e = true;
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.c1 e27 = e();
        if (e27 != null) {
            ((sl.j) e27).f(z17);
        }
        this.f348852e = z17;
        if (z17) {
            return;
        }
        i(this.f348851d, this.f348857m, 0);
    }

    public final boolean g() {
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f348860p;
        if (c1Var != null) {
            return ((sl.j) c1Var).c();
        }
        return false;
    }

    public final boolean h() {
        double d17 = d();
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = this.f348851d;
        objArr[1] = java.lang.Boolean.valueOf(g());
        objArr[2] = java.lang.Boolean.valueOf(f());
        objArr[3] = java.lang.Double.valueOf(d17);
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f348860p;
        objArr[4] = java.lang.Integer.valueOf(c1Var != null ? c1Var.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteVoicePlayerControl", "pausePlay: path=%s, isPlaying=%b, isPaused=%b, progressBeforePause=%.3f, playerHashCode=%d", objArr);
        if (!g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeNoteVoicePlayerControl", "pausePlay: player is not playing! isPaused=%b", java.lang.Boolean.valueOf(f()));
        }
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var2 = this.f348860p;
        if (c1Var2 != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(c1Var2.hashCode());
            sl.j jVar = (sl.j) c1Var2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteVoicePlayerControl", "pausePlay: BEFORE pause - SceneVoicePlayer.hashCode=%d, SceneVoicePlayer.getNowProgress()=%.3f, SceneVoicePlayer.isPlaying()=%b, SceneVoicePlayer.isPause()=%b", valueOf, java.lang.Double.valueOf(jVar.a()), java.lang.Boolean.valueOf(jVar.c()), java.lang.Boolean.valueOf(jVar.b()));
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.b("keep_app_silent");
        com.p314xaae8f345.mm.p944x882e457a.c1 e17 = e();
        boolean d18 = e17 != null ? ((sl.j) e17).d(true) : false;
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var3 = this.f348860p;
        if (c1Var3 != null) {
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(c1Var3.hashCode());
            sl.j jVar2 = (sl.j) c1Var3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteVoicePlayerControl", "pausePlay: AFTER pause - SceneVoicePlayer.hashCode=%d, SceneVoicePlayer.getNowProgress()=%.3f, SceneVoicePlayer.isPlaying()=%b, SceneVoicePlayer.isPause()=%b", valueOf2, java.lang.Double.valueOf(jVar2.a()), java.lang.Boolean.valueOf(jVar2.c()), java.lang.Boolean.valueOf(jVar2.b()));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteVoicePlayerControl", "pausePlay: player.pause result=%b, after pause: isPlaying=%b, isPaused=%b, progressAfterPause=%.3f", java.lang.Boolean.valueOf(d18), java.lang.Boolean.valueOf(g()), java.lang.Boolean.valueOf(f()), java.lang.Double.valueOf(d()));
        if (d18) {
            java.util.Iterator it = this.f348859o.iterator();
            if (it.hasNext()) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
                throw null;
            }
        }
        return d18;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(java.lang.String r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fz4.m.i(java.lang.String, int, int):boolean");
    }

    public final void j() {
        com.p314xaae8f345.mm.p944x882e457a.c1 e17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteVoicePlayerControl", "stop play");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.b("keep_app_silent");
        if (this.f348860p != null && (e17 = e()) != null) {
            ((sl.j) e17).h(false);
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f348859o).iterator();
        if (it.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
            throw null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 c21000x8b2f716 = this.f348858n;
        if (c21000x8b2f716 != null) {
            c21000x8b2f716.a();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 s7Var = this.f348855h;
        if (s7Var != null) {
            s7Var.b();
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.x0
    /* renamed from: onCompletion */
    public void mo11229xa6db431b() {
        double d17 = d();
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = this.f348851d;
        objArr[1] = java.lang.Double.valueOf(d17);
        objArr[2] = java.lang.Boolean.valueOf(g());
        objArr[3] = java.lang.Boolean.valueOf(f());
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f348860p;
        objArr[4] = java.lang.Integer.valueOf(c1Var != null ? c1Var.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteVoicePlayerControl", "on completion, stop play, path=%s, currentProgress=%.3f, isPlaying=%b, isPaused=%b, playerHashCode=%d", objArr);
        if (d17 < 0.95d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeNoteVoicePlayerControl", "onCompletion: ABNORMAL! completion triggered < 0.95, progress=%.3f", java.lang.Double.valueOf(d17));
        }
        if (this.f348860p != null) {
            j();
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.b1
    /* renamed from: onStop */
    public void mo47945xc39f8281() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteVoicePlayerControl", "on stop!!");
        java.util.Iterator it = ((java.util.ArrayList) this.f348859o).iterator();
        if (it.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
            throw null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 c21000x8b2f716 = this.f348858n;
        if (c21000x8b2f716 != null) {
            c21000x8b2f716.a();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 s7Var = this.f348855h;
        if (s7Var != null) {
            s7Var.b();
        }
    }
}
