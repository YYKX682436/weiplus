package com.tencent.mm.plugin.appbrand.video.player.thumb;

/* loaded from: classes15.dex */
public class l extends ye1.a {
    public volatile boolean A;
    public java.lang.String B;
    public boolean C;
    public boolean D;
    public com.tencent.mm.plugin.appbrand.video.player.thumb.a E;
    public final com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener F;
    public final com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener G;
    public final com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener H;
    public final com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener I;

    /* renamed from: J */
    public final com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener f90887J;
    public final com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener K;
    public final com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener L;

    /* renamed from: q */
    public final boolean f90888q;

    /* renamed from: r */
    public final java.lang.String f90889r;

    /* renamed from: s */
    public final com.tencent.thumbplayer.api.ITPPlayer f90890s;

    /* renamed from: t */
    public long f90891t;

    /* renamed from: u */
    public final boolean f90892u;

    /* renamed from: v */
    public volatile boolean f90893v;

    /* renamed from: w */
    public java.lang.Integer f90894w;

    /* renamed from: x */
    public volatile boolean f90895x;

    /* renamed from: y */
    public boolean f90896y;

    /* renamed from: z */
    public final java.util.concurrent.atomic.AtomicBoolean f90897z;

    public /* synthetic */ l(android.content.Context context, android.os.Looper looper, boolean z17, boolean z18, boolean z19, int i17, kotlin.jvm.internal.i iVar) {
        this(context, (i17 & 2) != 0 ? null : looper, (i17 & 4) != 0 ? false : z17, (i17 & 8) != 0 ? true : z18, (i17 & 16) != 0 ? false : z19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void V(com.tencent.mm.plugin.appbrand.video.player.thumb.l lVar, java.lang.String str, java.lang.String str2, boolean z17, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDataSource");
        }
        int i19 = i17;
        if ((i18 & 8) != 0) {
            i19 = lVar.f90888q;
        }
        lVar.U(str, str2, z17, i19);
    }

    @Override // ye1.a
    public void D(int i17) {
        java.lang.Integer num = this.f90894w;
        if (num == null || i17 != num.intValue()) {
            super.D(i17);
            this.f90894w = java.lang.Integer.valueOf(i17);
        }
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar = this.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            com.tencent.mars.xlog.Log.i(rVar.f355486a, "updateDownloadPercent downloadPercent:%d", java.lang.Integer.valueOf(i17));
            rVar.f355501k = i17;
        }
    }

    @Override // ye1.a
    public void K() {
        this.f90895x = false;
        super.K();
        if (this.A) {
            com.tencent.mars.xlog.Log.i(this.f90889r, "notifyOnSeekComplete, isPassiveDownloading, pausePlayerDownload");
            S();
        }
    }

    public final boolean M() {
        switch (this.f90890s.getCurrentState()) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    public final void N() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.B) || !this.C) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f90889r, "checkSubtitleDone showSubtitleDone:%b", java.lang.Boolean.valueOf(this.D));
        j(true);
    }

    public final void O(java.lang.Exception e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        if (e17 instanceof java.lang.IllegalStateException) {
            G(-10001, -1);
        } else if ((e17 instanceof java.lang.IllegalArgumentException) && kotlin.jvm.internal.o.b("drm asset url is null or drm property is null", e17.getMessage())) {
            G(com.tencent.mm.hardcoder.HardCoderJNI.CLIENT_CONNECT, 10000);
        } else {
            G(-10999, -1);
        }
    }

    public final java.lang.String P() {
        java.lang.String Q = Q();
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b;
        kotlin.jvm.internal.o.f(str, "getApplicationId(...)");
        if (r26.n0.D(Q, str, false, 2, null)) {
            return Q;
        }
        return Q + ' ' + com.tencent.mm.sdk.platformtools.x2.f193072b;
    }

    public java.lang.String Q() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b;
        kotlin.jvm.internal.o.f(str, "getApplicationId(...)");
        return str;
    }

    public void R(com.tencent.thumbplayer.api.ITPPlayer player, int i17, long j17, long j18, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(player, "player");
    }

    public final void S() {
        if (this.f90897z.getAndSet(false)) {
            this.f90890s.pauseDownload();
        } else {
            com.tencent.mars.xlog.Log.i(this.f90889r, "pausePlayerDownload, not downloading");
        }
    }

    public final void T(boolean z17) {
        if (!this.f90897z.getAndSet(true)) {
            this.f90890s.resumeDownload();
            this.A = z17;
        } else {
            if (this.f90895x && !z17) {
                this.A = false;
            }
            com.tencent.mars.xlog.Log.i(this.f90889r, "resumePlayerDownload, already downloading");
        }
    }

    public final void U(java.lang.String path, java.lang.String str, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f90890s;
        if (!(!this.f90893v)) {
            com.tencent.mars.xlog.Log.w(this.f90889r, "setDataSource, player is not available");
            return;
        }
        try {
            if (r26.i0.y(path, "file://", false)) {
                path = path.substring(7);
                kotlin.jvm.internal.o.f(path, "substring(...)");
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("User-Agent", P());
            if (!(str == null || str.length() == 0)) {
                hashMap.put("Referrer", str);
            }
            if (this.f90892u) {
                com.tencent.mars.xlog.Log.i(this.f90889r, "play mMinBufferDuration:" + this.f90891t);
                iTPPlayer.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(102, this.f90891t));
                iTPPlayer.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(304, 131072L));
            } else {
                iTPPlayer.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(102, 1000L));
            }
            iTPPlayer.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(504, 1L));
            iTPPlayer.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildBoolean(206, z17));
            byte[] bytes = path.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            com.tencent.mars.xlog.Log.i(this.f90889r, "setDataSource, fileId: " + g17);
            com.tencent.thumbplayer.api.TPVideoInfo.Builder fileId = new com.tencent.thumbplayer.api.TPVideoInfo.Builder().fileId(g17);
            com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData = new com.tencent.thumbplayer.api.proxy.TPDownloadParamData(i17);
            try {
                tPDownloadParamData.setHeadersList(kz5.b0.c(hashMap));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.i(this.f90889r, "setDataSource, use custom api fail since " + th6);
            }
            fileId.downloadParam(tPDownloadParamData);
            iTPPlayer.setVideoInfo(fileId.build());
            com.tencent.mm.plugin.appbrand.video.player.thumb.m.c(iTPPlayer, path, hashMap);
            this.f461162a = 1;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f90889r, "setDataSource, fail since " + e17);
            O(e17);
        }
    }

    public final void W() {
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar = this.E;
        if (aVar != null) {
            long duration = getDuration();
            pk1.r rVar = (pk1.r) aVar;
            com.tencent.mars.xlog.Log.i(rVar.f355486a, "updateDurationMs duration:%d", java.lang.Long.valueOf(duration));
            rVar.f355496f = duration;
        }
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar2 = this.E;
        if (aVar2 != null) {
            long currentPosition = getCurrentPosition();
            pk1.r rVar2 = (pk1.r) aVar2;
            com.tencent.mars.xlog.Log.i(rVar2.f355486a, "updateCurrentPlayPositionMs currentPlayPositionMs:%d", java.lang.Long.valueOf(currentPosition));
            rVar2.f355494e = currentPosition;
        }
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar3 = this.E;
        if (aVar3 != null) {
            int videoWidth = getVideoWidth();
            int videoHeight = getVideoHeight();
            pk1.r rVar3 = (pk1.r) aVar3;
            com.tencent.mars.xlog.Log.i(rVar3.f355486a, "setResolution width:%d, height:%d", java.lang.Integer.valueOf(videoWidth), java.lang.Integer.valueOf(videoHeight));
            rVar3.F = videoWidth;
            rVar3.G = videoHeight;
        }
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar4 = this.E;
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f90890s;
        if (aVar4 != null) {
            long propertyLong = iTPPlayer.getPropertyLong(100);
            pk1.r rVar4 = (pk1.r) aVar4;
            rVar4.C = propertyLong;
            com.tencent.mars.xlog.Log.i(rVar4.f355486a, "updateAudioCodecId codecId:%d", java.lang.Long.valueOf(propertyLong));
        }
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar5 = this.E;
        if (aVar5 != null) {
            long propertyLong2 = iTPPlayer.getPropertyLong(201);
            pk1.r rVar5 = (pk1.r) aVar5;
            rVar5.D = propertyLong2;
            com.tencent.mars.xlog.Log.i(rVar5.f355486a, "updateVideoCodecId codecId:%d", java.lang.Long.valueOf(propertyLong2));
        }
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar6 = this.E;
        if (aVar6 != null) {
            long propertyLong3 = iTPPlayer.getPropertyLong(101);
            pk1.r rVar6 = (pk1.r) aVar6;
            com.tencent.mars.xlog.Log.i(rVar6.f355486a, "updatePlayAudioBitrate playAudioBitrate:%d", java.lang.Long.valueOf(propertyLong3));
            rVar6.f355515y = propertyLong3;
        }
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar7 = this.E;
        if (aVar7 != null) {
            long propertyLong4 = iTPPlayer.getPropertyLong(202);
            pk1.r rVar7 = (pk1.r) aVar7;
            com.tencent.mars.xlog.Log.i(rVar7.f355486a, "updatePlayVideoBitrate playVideoBitrate:%d", java.lang.Long.valueOf(propertyLong4));
            rVar7.f355514x = propertyLong4;
        }
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar8 = this.E;
        if (aVar8 != null) {
            long propertyLong5 = iTPPlayer.getPropertyLong(206);
            pk1.r rVar8 = (pk1.r) aVar8;
            rVar8.E = propertyLong5;
            com.tencent.mars.xlog.Log.i(rVar8.f355486a, "updateVideoFrameRate frameRate:%d", java.lang.Long.valueOf(propertyLong5));
        }
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar9 = this.E;
        if (aVar9 != null) {
            long playableDurationMs = iTPPlayer.getPlayableDurationMs();
            pk1.r rVar9 = (pk1.r) aVar9;
            com.tencent.mars.xlog.Log.i(rVar9.f355486a, "updatePlayableDurationMs playableDurationMs:%d", java.lang.Long.valueOf(playableDurationMs));
            rVar9.f355497g = playableDurationMs;
        }
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar10 = this.E;
        if (aVar10 != null) {
            long playerBufferedDurationMs = iTPPlayer.getPlayerBufferedDurationMs();
            pk1.r rVar10 = (pk1.r) aVar10;
            com.tencent.mars.xlog.Log.i(rVar10.f355486a, "updatePlayerBufferedDurationMs playerBufferedDurationMs:%d", java.lang.Long.valueOf(playerBufferedDurationMs));
            rVar10.f355498h = playerBufferedDurationMs;
        }
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar11 = this.E;
        if (aVar11 != null) {
            pk1.r rVar11 = (pk1.r) aVar11;
            int recentAverageSpeed = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).getRecentAverageSpeed(2);
            rVar11.X = recentAverageSpeed;
            com.tencent.mars.xlog.Log.i(rVar11.f355486a, "updateRecentDownloadAverageSpeed recentDownloadAverageSpeed:%d", java.lang.Integer.valueOf(recentAverageSpeed));
        }
    }

    @Override // ye1.e
    public void b(boolean z17) {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f90890s;
        if (!(!this.f90893v)) {
            com.tencent.mars.xlog.Log.w(this.f90889r, "setLooping, player is not available");
            return;
        }
        try {
            iTPPlayer.setLoopback(z17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f90889r, "setLooping, fail since " + e17);
            O(e17);
        }
    }

    @Override // ye1.e
    public void c(float f17, float f18) {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f90890s;
        if (!(!this.f90893v)) {
            com.tencent.mars.xlog.Log.w(this.f90889r, "setVolume, player is not available");
            return;
        }
        try {
            iTPPlayer.setAudioGainRatio(f17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f90889r, "setVolume, fail since " + e17);
            O(e17);
        }
    }

    @Override // ye1.e
    public boolean f(float f17) {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f90890s;
        boolean z17 = true;
        if (!(!this.f90893v)) {
            com.tencent.mars.xlog.Log.w(this.f90889r, "setSpeed, player is not available");
            return false;
        }
        try {
            iTPPlayer.setPlaySpeedRatio(f17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f90889r, "setSpeed, fail since " + e17);
            O(e17);
            z17 = false;
        }
        return z17;
    }

    @Override // ye1.e
    public int getCurrentPosition() {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f90890s;
        if (!(!this.f90893v)) {
            com.tencent.mars.xlog.Log.w(this.f90889r, "getCurrentPosition, player is not available");
            return 0;
        }
        try {
            return (int) iTPPlayer.getCurrentPositionMs();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f90889r, "getCurrentPosition, fail since " + e17);
            O(e17);
            return 0;
        }
    }

    @Override // ye1.e
    public int getDuration() {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f90890s;
        if (!(!this.f90893v)) {
            com.tencent.mars.xlog.Log.w(this.f90889r, "getDuration, player is not available");
            return 0;
        }
        try {
            return (int) iTPPlayer.getDurationMs();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f90889r, "getDuration, fail since " + e17);
            O(e17);
            return 0;
        }
    }

    @Override // ye1.e
    public int getPlayerType() {
        return 3;
    }

    @Override // ye1.e
    public int getVideoHeight() {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f90890s;
        if (!(!this.f90893v)) {
            com.tencent.mars.xlog.Log.w(this.f90889r, "getVideoHeight, player is not available");
            return 0;
        }
        try {
            return iTPPlayer.getVideoHeight();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f90889r, "getVideoHeight, fail since " + e17);
            O(e17);
            return 0;
        }
    }

    @Override // ye1.e
    public int getVideoWidth() {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f90890s;
        if (!(!this.f90893v)) {
            com.tencent.mars.xlog.Log.w(this.f90889r, "getVideoWidth, player is not available");
            return 0;
        }
        try {
            return iTPPlayer.getVideoWidth();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f90889r, "getVideoWidth, fail since " + e17);
            O(e17);
            return 0;
        }
    }

    @Override // ye1.e
    public boolean isPlaying() {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f90890s;
        if (!(!this.f90893v)) {
            com.tencent.mars.xlog.Log.w(this.f90889r, "isPlaying, player is not available");
            return false;
        }
        try {
            return 5 == iTPPlayer.getCurrentState();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f90889r, "isPlaying, fail since " + e17);
            O(e17);
            return false;
        }
    }

    @Override // ye1.a, ye1.e
    public void j(boolean z17) {
        java.lang.String str = this.f90889r;
        com.tencent.mars.xlog.Log.i(str, "showSubtitle, show: " + z17);
        this.C = z17;
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f90890s;
        com.tencent.thumbplayer.api.TPTrackInfo[] trackInfo = iTPPlayer.getTrackInfo();
        if (trackInfo != null) {
            if (trackInfo.length == 0) {
                return;
            }
            int length = trackInfo.length;
            for (int i17 = 0; i17 < length; i17++) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(trackInfo[i17].name) && trackInfo[i17].name.equals("thumb_media_player_subtitle")) {
                    if (z17) {
                        com.tencent.mars.xlog.Log.i(str, "selectTrack, i: " + i17);
                        iTPPlayer.selectTrack(i17, 0L);
                        this.D = true;
                    } else {
                        com.tencent.mars.xlog.Log.i(str, "deselectTrack, i: " + i17);
                        iTPPlayer.deselectTrack(i17, 0L);
                    }
                }
            }
        }
    }

    @Override // ye1.e
    public ye1.e l(java.lang.Class playerClass) {
        kotlin.jvm.internal.o.g(playerClass, "playerClass");
        com.tencent.mm.plugin.appbrand.video.player.thumb.l lVar = com.tencent.mm.plugin.appbrand.video.player.thumb.l.class.isAssignableFrom(playerClass) ? this : null;
        com.tencent.mars.xlog.Log.i(this.f90889r, "castTo, playerClass: " + playerClass + ", playerImpl: " + lVar);
        return lVar;
    }

    @Override // ye1.e
    public void m(java.lang.String path, java.lang.String str) {
        kotlin.jvm.internal.o.g(path, "path");
        V(this, path, str, true, 0, 8, null);
    }

    @Override // ye1.a, ye1.e
    public void n(double d17) {
    }

    @Override // ye1.e
    public void pause() {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f90890s;
        boolean z17 = true;
        if (!(!this.f90893v)) {
            com.tencent.mars.xlog.Log.w(this.f90889r, "pause, player is not available");
            return;
        }
        try {
            if (3 != this.f90890s.getCurrentState()) {
                z17 = false;
            }
            if (z17 || isPlaying()) {
                iTPPlayer.pause();
                S();
                this.f461162a = 4;
            } else {
                com.tencent.mars.xlog.Log.w(this.f90889r, "pause, is not preparing and not playing");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f90889r, "pause, fail since " + e17);
            O(e17);
        }
    }

    @Override // ye1.e
    public void prepareAsync() {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f90890s;
        boolean z17 = true;
        if (!(!this.f90893v)) {
            com.tencent.mars.xlog.Log.w(this.f90889r, "prepareAsync, player is not available");
            return;
        }
        try {
            java.lang.String str = this.f90889r;
            if (this.f461162a == 0) {
                com.tencent.mars.xlog.Log.w(str, "prepareAsync, idle");
            } else {
                if (3 == this.f90890s.getCurrentState()) {
                    com.tencent.mars.xlog.Log.w(this.f90889r, "prepareAsync, isPreparing");
                } else {
                    int currentState = this.f90890s.getCurrentState();
                    if (currentState != 4 && currentState != 5 && currentState != 6 && currentState != 7) {
                        z17 = false;
                    }
                    if (z17) {
                        com.tencent.mars.xlog.Log.w(this.f90889r, "prepareAsync, isPrepared");
                    } else {
                        iTPPlayer.prepareAsync();
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f90889r, "prepareAsync, fail since " + e17);
            O(e17);
        }
    }

    @Override // ye1.e
    public void release() {
        if (!this.f90893v) {
            try {
                this.f90890s.setOnPreparedListener(null);
                this.f90890s.setOnSeekCompleteListener(null);
                this.f90890s.setOnCompletionListener(null);
                this.f90890s.setOnVideoSizeChangedListener(null);
                this.f90890s.setOnErrorListener(null);
                this.f90890s.setOnPlayerStateChangeListener(null);
                this.f90890s.setOnInfoListener(null);
                this.f90890s.release();
                this.f461162a = -2;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(this.f90889r, "release, fail since " + e17);
                O(e17);
            }
        } else {
            com.tencent.mars.xlog.Log.w(this.f90889r, "release, player is not available");
        }
        this.f461163b = true;
        this.f90893v = true;
    }

    @Override // ye1.e
    public void reset() {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f90890s;
        if (!(!this.f90893v)) {
            com.tencent.mars.xlog.Log.w(this.f90889r, "reset, player is not available");
            return;
        }
        try {
            iTPPlayer.reset();
            this.f461162a = 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f90889r, "reset, fail since " + e17);
            O(e17);
        }
    }

    @Override // ye1.e
    public void seekTo(long j17) {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f90890s;
        if (!(!this.f90893v)) {
            com.tencent.mars.xlog.Log.w(this.f90889r, "seekTo, player is not available");
            return;
        }
        try {
            T(true);
            iTPPlayer.seekTo((int) j17, 3);
            this.f90895x = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f90889r, "seekTo, fail since " + e17);
            O(e17);
        }
    }

    @Override // ye1.e
    public void setDataSource(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        m(path, null);
    }

    @Override // ye1.e
    public void setMinBufferDuration(long j17) {
        this.f90891t = j17;
    }

    @Override // ye1.e
    public void setMute(boolean z17) {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f90890s;
        if (!(!this.f90893v)) {
            com.tencent.mars.xlog.Log.w(this.f90889r, "setMute, player is not available");
            return;
        }
        try {
            iTPPlayer.setOutputMute(z17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f90889r, "setMute, fail since " + e17);
            O(e17);
        }
    }

    @Override // ye1.e
    public void setSurface(android.view.Surface surface) {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f90890s;
        if (!(!this.f90893v)) {
            com.tencent.mars.xlog.Log.w(this.f90889r, "setSurface, player is not available");
            return;
        }
        try {
            iTPPlayer.setSurface(surface);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f90889r, "setSurface, fail since " + e17);
            O(e17);
        }
    }

    @Override // ye1.e
    public void start() {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f90890s;
        boolean z17 = true;
        if (!(!this.f90893v)) {
            com.tencent.mars.xlog.Log.w(this.f90889r, "start, player is not available");
            return;
        }
        try {
            if (!M()) {
                com.tencent.mars.xlog.Log.w(this.f90889r, "start, can not start");
                return;
            }
            if (isPlaying()) {
                com.tencent.mars.xlog.Log.w(this.f90889r, "start, isPlaying");
                return;
            }
            int currentState = this.f90890s.getCurrentState();
            if (currentState != 4 && currentState != 5 && currentState != 6 && currentState != 7) {
                z17 = false;
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.w(this.f90889r, "start, is not prepared");
                return;
            }
            if (7 == iTPPlayer.getCurrentState()) {
                seekTo(0L);
            }
            iTPPlayer.start();
            T(false);
            N();
            this.f461162a = 3;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f90889r, "start, fail since " + e17);
            O(e17);
        }
    }

    @Override // ye1.e
    public void stop() {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f90890s;
        if (!(!this.f90893v)) {
            com.tencent.mars.xlog.Log.w(this.f90889r, "stop, player is not available");
            return;
        }
        try {
            if (M()) {
                W();
                iTPPlayer.stop();
                S();
                this.f461162a = 5;
            } else {
                com.tencent.mars.xlog.Log.w(this.f90889r, "stop, can not start");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f90889r, "stop, fail since " + e17);
            O(e17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0159 A[Catch: Exception -> 0x018a, TryCatch #0 {Exception -> 0x018a, blocks: (B:27:0x0066, B:29:0x0097, B:30:0x00a5, B:32:0x00ab, B:33:0x00ec, B:36:0x013a, B:38:0x014d, B:43:0x0159, B:45:0x0160, B:48:0x0169, B:50:0x0170, B:51:0x01af, B:54:0x018c, B:58:0x00de), top: B:26:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0169 A[Catch: Exception -> 0x018a, TryCatch #0 {Exception -> 0x018a, blocks: (B:27:0x0066, B:29:0x0097, B:30:0x00a5, B:32:0x00ab, B:33:0x00ec, B:36:0x013a, B:38:0x014d, B:43:0x0159, B:45:0x0160, B:48:0x0169, B:50:0x0170, B:51:0x01af, B:54:0x018c, B:58:0x00de), top: B:26:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0170 A[Catch: Exception -> 0x018a, TryCatch #0 {Exception -> 0x018a, blocks: (B:27:0x0066, B:29:0x0097, B:30:0x00a5, B:32:0x00ab, B:33:0x00ec, B:36:0x013a, B:38:0x014d, B:43:0x0159, B:45:0x0160, B:48:0x0169, B:50:0x0170, B:51:0x01af, B:54:0x018c, B:58:0x00de), top: B:26:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018c A[Catch: Exception -> 0x018a, TryCatch #0 {Exception -> 0x018a, blocks: (B:27:0x0066, B:29:0x0097, B:30:0x00a5, B:32:0x00ab, B:33:0x00ec, B:36:0x013a, B:38:0x014d, B:43:0x0159, B:45:0x0160, B:48:0x0169, B:50:0x0170, B:51:0x01af, B:54:0x018c, B:58:0x00de), top: B:26:0x0066 }] */
    @Override // ye1.a, ye1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.video.player.thumb.l.t(java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    @Override // ye1.a, ye1.e
    public void w(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f90889r, "setSubtitleDataSource, src: " + str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        this.B = str;
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f90890s;
        if (!(!this.f90893v)) {
            com.tencent.mars.xlog.Log.w(this.f90889r, "addSubtitleSource, player is not available");
            return;
        }
        try {
            kotlin.jvm.internal.o.d(str);
            iTPPlayer.addSubtitleSource(str, "text/vtt", "thumb_media_player_subtitle");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f90889r, "addSubtitleSource, fail since " + e17);
            O(e17);
        }
    }

    @Override // ye1.e
    public void y(java.lang.String str, int i17) {
        if (str == null) {
            return;
        }
        setDataSource(str);
    }

    public l(android.content.Context context, android.os.Looper looper, boolean z17, boolean z18, boolean z19) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f90888q = z17;
        java.lang.String str = "MicroMsg.AppBrand.ThumbMediaPlayer#" + hashCode();
        this.f90889r = str;
        this.f90891t = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
        this.f90897z = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.A = true;
        com.tencent.mm.plugin.appbrand.video.player.thumb.i iVar = new com.tencent.mm.plugin.appbrand.video.player.thumb.i(this);
        this.F = iVar;
        com.tencent.mm.plugin.appbrand.video.player.thumb.j jVar = new com.tencent.mm.plugin.appbrand.video.player.thumb.j(this);
        this.G = jVar;
        com.tencent.mm.plugin.appbrand.video.player.thumb.f fVar = new com.tencent.mm.plugin.appbrand.video.player.thumb.f(this);
        this.H = fVar;
        com.tencent.mm.plugin.appbrand.video.player.thumb.k kVar = new com.tencent.mm.plugin.appbrand.video.player.thumb.k(this);
        this.I = kVar;
        com.tencent.mm.plugin.appbrand.video.player.thumb.g gVar = new com.tencent.mm.plugin.appbrand.video.player.thumb.g(this);
        this.f90887J = gVar;
        com.tencent.mm.plugin.appbrand.video.player.thumb.h hVar = new com.tencent.mm.plugin.appbrand.video.player.thumb.h(this);
        this.K = hVar;
        com.tencent.mars.xlog.Log.i(str, com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        this.f90892u = z19;
        com.tencent.mm.plugin.appbrand.video.player.thumb.p.f90900a.d(context, z18, z19);
        com.tencent.thumbplayer.api.ITPPlayer createTPPlayer = com.tencent.thumbplayer.api.TPPlayerFactory.createTPPlayer(context, looper);
        kotlin.jvm.internal.o.f(createTPPlayer, "createTPPlayer(...)");
        this.f90890s = createTPPlayer;
        createTPPlayer.setOnPreparedListener(iVar);
        createTPPlayer.setOnSeekCompleteListener(jVar);
        createTPPlayer.setOnCompletionListener(fVar);
        createTPPlayer.setOnVideoSizeChangedListener(kVar);
        createTPPlayer.setOnErrorListener(gVar);
        createTPPlayer.setOnPlayerStateChangeListener(hVar);
        com.tencent.mm.plugin.appbrand.video.player.thumb.d dVar = new com.tencent.mm.plugin.appbrand.video.player.thumb.d(this);
        this.L = dVar;
        createTPPlayer.setOnInfoListener(dVar);
        b(false);
        createTPPlayer.setOnSubtitleDataListener(new com.tencent.mm.plugin.appbrand.video.player.thumb.e(this));
        com.tencent.mars.xlog.Log.i(str, "init finish");
    }
}
