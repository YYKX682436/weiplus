package sh3;

/* loaded from: classes15.dex */
public final class a extends rh3.c implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener {

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 f489560v;

    /* renamed from: w, reason: collision with root package name */
    public zh3.a f489561w;

    public a(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.util.Objects.requireNonNull(interfaceC26164x73fc6bc6);
        this.f489560v = interfaceC26164x73fc6bc6;
        interfaceC26164x73fc6bc6.mo100947xfd27780d(true);
        interfaceC26164x73fc6bc6.mo100957x5dd7c812(this);
        interfaceC26164x73fc6bc6.mo100951xa4560c71(this);
        interfaceC26164x73fc6bc6.mo100954x6954c27b(this);
        interfaceC26164x73fc6bc6.mo100955x40f8c003(this);
        interfaceC26164x73fc6bc6.mo100958xe1a2e326(this);
        interfaceC26164x73fc6bc6.mo100956xa23b7bf3(this);
        interfaceC26164x73fc6bc6.mo100964x2d6d87cd(this);
    }

    @Override // rh3.o
    public void b(boolean z17) {
        this.f489560v.mo100947xfd27780d(z17);
    }

    @Override // rh3.o
    public void c(float f17, float f18) {
        this.f489560v.mo100965xd0747cbc(f17 == 0.0f);
    }

    @Override // rh3.o
    /* renamed from: getCurrentPositionMs */
    public long mo162433xddd35a52() {
        return this.f489560v.mo100915xddd35a52();
    }

    @Override // rh3.o
    /* renamed from: getDurationMs */
    public long mo162434x37a7fa50() {
        return this.f489560v.mo100917x37a7fa50();
    }

    @Override // rh3.o
    /* renamed from: getVideoHeight */
    public int mo162435x463504c() {
        return this.f489560v.mo100928x463504c();
    }

    @Override // rh3.o
    /* renamed from: getVideoWidth */
    public int mo162436x8d5c7601() {
        return this.f489560v.mo100929x8d5c7601();
    }

    @Override // rh3.o
    /* renamed from: isPlaying */
    public boolean mo162437xc00617a4() {
        boolean z17 = this.f477210u == 5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mo162424xb5887064(), "isPlaying:" + z17 + " state:" + this.f477210u);
        return z17;
    }

    @Override // rh3.o
    public java.lang.Object m() {
        return this.f489560v;
    }

    @Override // rh3.o
    public void n(wh3.b mediaSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
        boolean z17 = mediaSource instanceof wh3.a;
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f489560v;
        java.lang.String str = mediaSource.f527499b;
        if (z17) {
            interfaceC26164x73fc6bc6.mo100945x683d6267(str);
            return;
        }
        if (!(mediaSource instanceof wh3.d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMPlayerTPProxy", "setMediaSource unSupport mediaSource:" + mediaSource);
            return;
        }
        zh3.a aVar = this.f489561w;
        if (aVar != null) {
            aVar.b();
        }
        rh3.p pVar = this.f477196d;
        if (pVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("onePlayContext");
            throw null;
        }
        zh3.a aVar2 = new zh3.a(pVar, (wh3.d) mediaSource, this.f477207r);
        this.f489561w = aVar2;
        interfaceC26164x73fc6bc6.mo100906x969bf12(aVar2);
        com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder builder = new com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder();
        builder.m101226xb4088fb7(mediaSource.f527498a);
        builder.m101224x10a74e5(new com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13(11));
        interfaceC26164x73fc6bc6.mo100974xab2f6987(builder.m101222x59bc66e());
        interfaceC26164x73fc6bc6.mo100945x683d6267(str);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener
    /* renamed from: onCompletion */
    public void mo53280xa6db431b(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 player) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mo162424xb5887064(), "onCompletion");
        u();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener
    /* renamed from: onError */
    public void mo53281xaf8aa769(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 player, int i17, int i18, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        v(i17, i18);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener
    /* renamed from: onInfo */
    public void mo53278xc39adf2d(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 player, int i17, long j17, long j18, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        if (i17 == 106) {
            w();
            return;
        }
        if (i17 == 204) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mo162424xb5887064(), "video decoder tyep: ", java.lang.Long.valueOf(j17));
            x(this, i17, j17, j18, obj);
            return;
        }
        if (i17 == 1001) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mo162424xb5887064(), "play video download finish");
            return;
        }
        if (i17 == 1003) {
            if (obj == null || !(obj instanceof com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPCDNURLInfo)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mo162424xb5887064(), "play cdn info:" + obj);
                return;
            }
            java.lang.String mo162424xb5887064 = mo162424xb5887064();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlayCdnInfoUpdateInternal play cdn info, uip:");
            com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPCDNURLInfo tPCDNURLInfo = (com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPCDNURLInfo) obj;
            sb6.append(tPCDNURLInfo.uIp);
            sb6.append(",cdnIp:");
            sb6.append(tPCDNURLInfo.f50880x5a23234);
            sb6.append(",err:");
            sb6.append(tPCDNURLInfo.f50881x5336d709);
            sb6.append(",url:");
            sb6.append(tPCDNURLInfo.url);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mo162424xb5887064, sb6.toString());
            return;
        }
        if (i17 == 1006) {
            if (obj == null || !(obj instanceof com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPDownLoadProgressInfo)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mo162424xb5887064(), "play download process:" + obj);
                return;
            }
            java.lang.String mo162424xb58870642 = mo162424xb5887064();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("play download process:");
            com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPDownLoadProgressInfo tPDownLoadProgressInfo = (com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPDownLoadProgressInfo) obj;
            sb7.append(tPDownLoadProgressInfo.f50885x990e2b68);
            sb7.append("ms,");
            sb7.append(tPDownLoadProgressInfo.f50883x51112b9);
            sb7.append("KB/s,");
            sb7.append(tPDownLoadProgressInfo.f50882x9e4c3cc2);
            sb7.append(',');
            sb7.append(tPDownLoadProgressInfo.f50886xd5bbe701);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mo162424xb58870642, sb7.toString());
            return;
        }
        if (i17 == 200) {
            t();
            return;
        }
        if (i17 == 201) {
            s();
            return;
        }
        if (i17 == 1008) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mo162424xb5887064(), "play no more data");
            return;
        }
        if (i17 == 1009) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mo162424xb5887064(), "play use proxy:" + j17);
            return;
        }
        x(this, i17, j17, j18, obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mo162424xb5887064(), "onInfo what :" + i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener
    /* renamed from: onPrepared */
    public void mo53283x58d5b73c(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 player) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        rh3.s sVar = new rh3.s();
        player.mo100924x2d67b867(101);
        player.mo100924x2d67b867(202);
        player.mo100924x2d67b867(206);
        y(sVar);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener
    /* renamed from: onSeekComplete */
    public void mo53284xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 player) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        z();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener
    /* renamed from: onStateChange */
    public void mo53282x4799dc42(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mo162424xb5887064(), "onStateChange from:" + i17 + " to:" + i18);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener
    /* renamed from: onVideoSizeChanged */
    public void mo53285xdc9583f7(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 player, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        A((int) j17, (int) j18);
    }

    @Override // rh3.c, rh3.o
    /* renamed from: pause */
    public void mo162425x65825f6() {
        super.mo162425x65825f6();
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f489560v;
        interfaceC26164x73fc6bc6.mo100931xe51afc9e();
        interfaceC26164x73fc6bc6.mo100930x65825f6();
    }

    @Override // rh3.c, rh3.o
    /* renamed from: prepareAsync */
    public void mo162426x857611b5() {
        super.mo162426x857611b5();
        try {
            zh3.a aVar = this.f489561w;
            if (aVar != null) {
                aVar.f554497h.c();
            }
            this.f489560v.mo100932x857611b5();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(mo162424xb5887064(), "prepareAsync", e17);
        }
    }

    @Override // rh3.c, rh3.o
    /* renamed from: release */
    public void mo162427x41012807() {
        super.mo162427x41012807();
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f489560v;
        interfaceC26164x73fc6bc6.mo100931xe51afc9e();
        zh3.a aVar = this.f489561w;
        if (aVar != null) {
            aVar.b();
        }
        interfaceC26164x73fc6bc6.mo100933x41012807();
    }

    @Override // rh3.c, rh3.o
    /* renamed from: reset */
    public void mo162428x6761d4f() {
        super.mo162428x6761d4f();
        this.f489560v.mo100934x6761d4f();
    }

    @Override // rh3.c, rh3.o
    /* renamed from: seekTo */
    public void mo162429xc9fc1b13(long j17) {
        try {
            super.mo162429xc9fc1b13(j17);
            this.f489560v.mo100937xc9fc1b13((int) j17, 3);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mo162424xb5887064(), "seekTo error" + e17);
        }
    }

    @Override // rh3.o
    /* renamed from: setOutputMute */
    public void mo162438xd0747cbc(boolean z17) {
        this.f489560v.mo100965xd0747cbc(z17);
    }

    @Override // rh3.o
    /* renamed from: setPlaySpeedRatio */
    public void mo162439xd079f5a(float f17) {
        this.f489560v.mo100967xd079f5a(f17);
    }

    @Override // rh3.c, rh3.o
    /* renamed from: setSurface */
    public void mo162430x42c875eb(android.view.Surface surface) {
        super.mo162430x42c875eb(surface);
        this.f489560v.mo100970x42c875eb(surface);
    }

    @Override // rh3.c, rh3.o
    /* renamed from: start */
    public void mo162431x68ac462() {
        super.mo162431x68ac462();
        this.f489560v.mo100975x68ac462();
    }

    @Override // rh3.c, rh3.o
    /* renamed from: stop */
    public void mo162432x360802() {
        super.mo162432x360802();
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f489560v;
        interfaceC26164x73fc6bc6.mo100931xe51afc9e();
        zh3.a aVar = this.f489561w;
        if (aVar != null) {
            aVar.b();
        }
        interfaceC26164x73fc6bc6.mo100976x360802();
        a(9, this + "#stop");
    }
}
