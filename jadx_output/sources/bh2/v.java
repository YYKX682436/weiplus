package bh2;

/* loaded from: classes10.dex */
public final class v implements bh2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ah2.e f20893a;

    /* renamed from: b, reason: collision with root package name */
    public om2.s f20894b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f20895c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f20896d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.trtc.TXChorusMusicPlayer f20897e;

    /* renamed from: f, reason: collision with root package name */
    public bh2.b f20898f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.trtc.TRTCCloudDef.TRTCParams f20899g;

    /* renamed from: h, reason: collision with root package name */
    public long f20900h;

    /* renamed from: i, reason: collision with root package name */
    public long f20901i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f20902j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20903k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole f20904l;

    public v(com.tencent.trtc.TRTCCloud trtcCloud, ah2.e service, com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole chorusRole) {
        r45.ka4 ka4Var;
        r45.o30 o30Var;
        com.tencent.mm.protobuf.g gVar;
        r45.o30 o30Var2;
        com.tencent.mm.protobuf.g gVar2;
        r45.o30 o30Var3;
        r45.o30 o30Var4;
        kotlin.jvm.internal.o.g(trtcCloud, "trtcCloud");
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(chorusRole, "chorusRole");
        this.f20893a = service;
        android.view.View.generateViewId();
        this.f20895c = "LiveKTVSongChorusPlayerHelper";
        this.f20896d = new android.os.Handler(android.os.Looper.getMainLooper());
        com.tencent.trtc.TRTCCloudDef.TRTCParams tRTCParams = new com.tencent.trtc.TRTCCloudDef.TRTCParams();
        this.f20899g = tRTCParams;
        this.f20904l = chorusRole;
        dh2.x xVar = ((dh2.w) service).f232466a;
        com.tencent.mm.protobuf.g gVar3 = ((mm2.e1) xVar.f232468e.a(mm2.e1.class)).f328987q.f380300m;
        java.lang.String str = null;
        if (gVar3 != null) {
            r45.na4 na4Var = new r45.na4();
            na4Var.parseFrom(gVar3.g());
            ka4Var = na4Var.f381197f;
        } else {
            ka4Var = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("chorus_bgm_usr_info: ");
        sb6.append((ka4Var == null || (o30Var4 = ka4Var.G1) == null) ? null : pm0.b0.g(o30Var4));
        com.tencent.mars.xlog.Log.i("LiveKTVSongChorusPlayerHelper", sb6.toString());
        tRTCParams.sdkAppId = ((mm2.e1) xVar.f232468e.a(mm2.e1.class)).f328987q.f380294d;
        tRTCParams.userId = (ka4Var == null || (o30Var3 = ka4Var.G1) == null) ? null : o30Var3.f381863d;
        tRTCParams.roomId = ((mm2.e1) xVar.f232468e.a(mm2.e1.class)).f328987q.f380296f;
        tRTCParams.userSig = (ka4Var == null || (o30Var2 = ka4Var.G1) == null || (gVar2 = o30Var2.f381864e) == null) ? null : gVar2.i();
        if (ka4Var != null && (o30Var = ka4Var.G1) != null && (gVar = o30Var.f381865f) != null) {
            str = gVar.i();
        }
        tRTCParams.privateMapKey = str;
        tRTCParams.role = 20;
        com.tencent.trtc.TXChorusMusicPlayer create = com.tencent.liteav.trtc.TXChorusMusicPlayerImpl.create(trtcCloud, java.lang.String.valueOf(tRTCParams.roomId), new bh2.t(this));
        this.f20897e = create;
        com.tencent.mars.xlog.Log.i("LiveKTVSongChorusPlayerHelper", "setChorusRole chorusRole: " + chorusRole + " musicPlayer: " + create);
        if (create != null) {
            create.setChorusRole(chorusRole, tRTCParams);
        }
    }

    @Override // bh2.c
    public void a(float f17) {
        com.tencent.trtc.TXChorusMusicPlayer tXChorusMusicPlayer = this.f20897e;
        if (tXChorusMusicPlayer != null) {
            tXChorusMusicPlayer.setMusicPitch(f17);
        }
    }

    @Override // bh2.c
    public void b(bh2.w channel, om2.s songData) {
        r45.yx1 yx1Var;
        kotlin.jvm.internal.o.g(channel, "channel");
        kotlin.jvm.internal.o.g(songData, "songData");
        this.f20894b = songData;
        if (this.f20904l == com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleLeadSinger) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPlay ktvSongInfo: ");
            om2.s sVar = this.f20894b;
            sb6.append((sVar == null || (yx1Var = sVar.f346378a) == null) ? null : pm0.b0.g(yx1Var));
            com.tencent.mars.xlog.Log.i(this.f20895c, sb6.toString());
            com.tencent.trtc.TXChorusMusicPlayer.TXChorusExternalMusicParams tXChorusExternalMusicParams = new com.tencent.trtc.TXChorusMusicPlayer.TXChorusExternalMusicParams();
            om2.q qVar = songData.f346380c;
            tXChorusExternalMusicParams.musicUrl = qVar.f346374c;
            tXChorusExternalMusicParams.accompanyUrl = qVar.f346373b;
            tXChorusExternalMusicParams.musicId = songData.a();
            tXChorusExternalMusicParams.isEncrypted = false;
            com.tencent.trtc.TXChorusMusicPlayer tXChorusMusicPlayer = this.f20897e;
            if (tXChorusMusicPlayer != null) {
                tXChorusMusicPlayer.loadExternalMusic(tXChorusExternalMusicParams);
            }
            if (tXChorusMusicPlayer != null) {
                tXChorusMusicPlayer.start();
            }
            e(channel);
        }
    }

    @Override // bh2.c
    public boolean c() {
        return this.f20902j;
    }

    @Override // bh2.c
    public void d(int i17, int i18) {
        com.tencent.trtc.TXChorusMusicPlayer tXChorusMusicPlayer = this.f20897e;
        if (tXChorusMusicPlayer != null) {
            tXChorusMusicPlayer.setPlayoutVolume(i17);
        }
        if (this.f20904l != com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleLeadSinger || tXChorusMusicPlayer == null) {
            return;
        }
        tXChorusMusicPlayer.setPublishVolume(i18);
    }

    @Override // bh2.c
    public void destroy() {
        com.tencent.mars.xlog.Log.i(this.f20895c, "destroy, currentRole: " + this.f20904l);
        com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole = this.f20904l;
        com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole2 = com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleLeadSinger;
        com.tencent.trtc.TXChorusMusicPlayer tXChorusMusicPlayer = this.f20897e;
        if (tXChorusRole == tXChorusRole2 && tXChorusMusicPlayer != null) {
            tXChorusMusicPlayer.stop();
        }
        if (tXChorusMusicPlayer != null) {
            tXChorusMusicPlayer.destroy();
        }
    }

    @Override // bh2.c
    public void e(bh2.w channel) {
        kotlin.jvm.internal.o.g(channel, "channel");
        int i17 = bh2.u.f20892a[channel.ordinal()];
        com.tencent.trtc.TXChorusMusicPlayer tXChorusMusicPlayer = this.f20897e;
        if (i17 == 1) {
            if (tXChorusMusicPlayer != null) {
                tXChorusMusicPlayer.switchMusicTrack(com.tencent.trtc.TXChorusMusicPlayer.TXChorusMusicTrack.TXChorusOriginalSong);
            }
        } else if (tXChorusMusicPlayer != null) {
            tXChorusMusicPlayer.switchMusicTrack(com.tencent.trtc.TXChorusMusicPlayer.TXChorusMusicTrack.TXChorusAccompaniment);
        }
    }

    @Override // bh2.c
    public long f() {
        long j17 = 0;
        if (this.f20901i > 0 && this.f20903k) {
            j17 = java.lang.System.currentTimeMillis() - this.f20901i;
        }
        com.tencent.mars.xlog.Log.i(this.f20895c, "getCurPlayProgress 当前进度：" + this.f20900h + ", 偏移量：" + j17);
        return this.f20900h + j17;
    }

    @Override // bh2.c
    public void g(bh2.b listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f20898f = listener;
    }

    @Override // bh2.c
    public boolean isPlaying() {
        return this.f20903k;
    }

    @Override // bh2.c
    public void pause() {
        com.tencent.mars.xlog.Log.i(this.f20895c, "pause");
        com.tencent.trtc.TXChorusMusicPlayer tXChorusMusicPlayer = this.f20897e;
        if (tXChorusMusicPlayer != null) {
            tXChorusMusicPlayer.pause();
        }
    }

    @Override // bh2.c
    public void resume() {
        com.tencent.mars.xlog.Log.i(this.f20895c, "resume");
        com.tencent.trtc.TXChorusMusicPlayer tXChorusMusicPlayer = this.f20897e;
        if (tXChorusMusicPlayer != null) {
            tXChorusMusicPlayer.resume();
        }
    }

    @Override // bh2.c
    public void seek(long j17) {
        long f17 = f();
        if (j17 > f17) {
            com.tencent.trtc.TXChorusMusicPlayer tXChorusMusicPlayer = this.f20897e;
            if (tXChorusMusicPlayer != null) {
                tXChorusMusicPlayer.seek(j17);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f20895c, "ignore seek: " + j17 + ", currPos: " + f17);
    }
}
