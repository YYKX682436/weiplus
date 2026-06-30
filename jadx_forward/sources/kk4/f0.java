package kk4;

/* loaded from: classes15.dex */
public class f0 implements com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6, kk4.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 f390058a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f390059b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f390060c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f390061d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f390062e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener f390063f;

    /* renamed from: g, reason: collision with root package name */
    public long f390064g;

    /* renamed from: h, reason: collision with root package name */
    public long f390065h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390066i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f390067j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c f390068k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.Surface f390069l;

    /* renamed from: m, reason: collision with root package name */
    public int f390070m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener f390071n;

    /* renamed from: o, reason: collision with root package name */
    public lk4.a f390072o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener f390073p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener f390074q;

    public f0(android.content.Context context, android.os.Looper looper) {
        new p012xc85e97e9.p093xedfae76a.v() { // from class: com.tencent.mm.plugin.thumbplayer.player.MMTPPlayer$lifecycleEventObserver$1
            @Override // p012xc85e97e9.p093xedfae76a.v
            /* renamed from: onStateChanged */
            public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (event == p012xc85e97e9.p093xedfae76a.m.ON_DESTROY) {
                    source.mo273xed6858b4().c(this);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(source);
                    sb6.append(" ON_DESTROY  state:");
                    kk4.f0 f0Var = kk4.f0.this;
                    sb6.append(f0Var.mo100916xb7d72d0e());
                    sb6.append(" null");
                    f0Var.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMTPPlayer#" + this, sb6.toString());
                    f0Var.getClass();
                }
            }
        };
        kk4.e0 e0Var = new kk4.e0(this);
        this.f390073p = e0Var;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = context instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f ? (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) context : null;
        if (activityC1102x9ee2d9f != null && activityC1102x9ee2d9f.mo273xed6858b4().b() == p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(e(), "can't create player in invalid state:" + activityC1102x9ee2d9f.mo273xed6858b4().b());
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 m101084x5f9ba979 = com.p314xaae8f345.p3006xb8ff1437.api.C26184x9df96dcd.m101084x5f9ba979(context, looper, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m101084x5f9ba979, "createTPPlayer(...)");
        this.f390058a = m101084x5f9ba979;
        m101084x5f9ba979.mo100956xa23b7bf3(e0Var);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(e(), "create tp player instance", new java.lang.Object[0]);
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "resetData setDataSource false");
        this.f390066i = "";
        this.f390060c = false;
        this.f390061d = false;
        this.f390064g = 0L;
        this.f390065h = 0L;
        this.f390062e = false;
        this.f390071n = null;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: addAudioTrackSource */
    public void mo100898xa28fa651(java.lang.String str, java.lang.String str2) {
        this.f390058a.mo100898xa28fa651(str, str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "addAudioTrackSource url:" + str + " name:" + str2);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: addSubtitleSource */
    public void mo100900x14654554(java.lang.String url, java.lang.String str, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f390058a.mo100900x14654554(url, str, name);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "addSubtitleSource url:" + url + " mimeType:" + str + " name:" + name);
    }

    public void b(lk4.a filter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filter, "filter");
        this.f390072o = filter;
        mo100950xbd4f3f08(new kk4.w(this));
    }

    public final void c(java.lang.String str, yz5.a aVar) {
        if (this.f390060c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(e(), "already setDataSource " + str);
            return;
        }
        this.f390060c = true;
        this.f390064g = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(e(), "setDataSource with " + str, new java.lang.Object[0]);
        aVar.mo152xb9724478();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: captureVideo */
    public void mo100902x2d34f8d5(com.p314xaae8f345.p3006xb8ff1437.api.C26171xafafaf50 c26171xafafaf50, com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26170x325bffaf interfaceC26170x325bffaf) {
        this.f390058a.mo100902x2d34f8d5(c26171xafafaf50, interfaceC26170x325bffaf);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: configBufferDurationAsync */
    public int mo100903x59e24e46(int i17, long j17, long j18, long j19) {
        return this.f390058a.mo100903x59e24e46(i17, j17, j18, j19);
    }

    public void d(java.lang.String mediaId, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        this.f390066i = mediaId;
        this.f390067j = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "setMediaId " + mediaId + " downloadFlag:" + str);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: deselectTrack */
    public void mo100904x4080528e(int i17, long j17) {
        this.f390058a.mo100904x4080528e(i17, j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "deselectTrack index:" + i17 + " opaque:" + j17);
    }

    public final java.lang.String e() {
        return "MicroMsg.TP.MMTPPlayer@" + hashCode();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: enableTPAssetResourceLoader */
    public void mo100905x969bf12(com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26242xd2a9d8e0 interfaceC26242xd2a9d8e0, android.os.Looper looper) {
        this.f390058a.mo100905x969bf12(interfaceC26242xd2a9d8e0, looper);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getAutoExpendBufferCount */
    public int mo100907xa42b888c() {
        return this.f390058a.mo100907xa42b888c();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getBufferIOMaxReadDurationPosMs */
    public long mo100908xdc51b7e8() {
        return this.f390058a.mo100908xdc51b7e8();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getBufferIOMaxReadFileOffset */
    public long mo100909x69f9266d() {
        return this.f390058a.mo100909x69f9266d();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getBufferIOMaxWriteDurationPosMs */
    public long mo100910xed03e74f() {
        return this.f390058a.mo100910xed03e74f();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getBufferIOMaxWriteFileOffset */
    public long mo100911x1e708866() {
        return this.f390058a.mo100911x1e708866();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getBufferPercent */
    public int mo100912x3421dc2f() {
        return this.f390058a.mo100912x3421dc2f();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getBufferedDurationMs */
    public long mo100913x23e0c68f() {
        return this.f390058a.mo100913x23e0c68f();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getBufferedSize */
    public long mo100914x45feff6() {
        return this.f390058a.mo100914x45feff6();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getCurrentPositionMs */
    public long mo100915xddd35a52() {
        return this.f390058a.mo100915xddd35a52();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getCurrentState */
    public int mo100916xb7d72d0e() {
        return this.f390058a.mo100916xb7d72d0e();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getDurationMs */
    public long mo100917x37a7fa50() {
        return this.f390058a.mo100917x37a7fa50();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getExtendReportController */
    public com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26238x3fcd9a0f mo100918xe88aaa20() {
        return this.f390058a.mo100918xe88aaa20();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getPlayableDurationMs */
    public long mo100919xac6a8d7e() {
        return this.f390058a.mo100919xac6a8d7e();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getPlayerBufferedDurationMs */
    public long mo100920x21a0b6d0() {
        return this.f390058a.mo100920x21a0b6d0();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getPlayerProxy */
    public com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26228x968ada48 mo100921xfa372ad7() {
        com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26228x968ada48 mo100921xfa372ad7 = this.f390058a.mo100921xfa372ad7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo100921xfa372ad7, "getPlayerProxy(...)");
        return mo100921xfa372ad7;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getPlayerType */
    public int mo100922x6b2cfdb1() {
        return this.f390058a.mo100922x6b2cfdb1();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getProgramInfo */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36[] mo100923x160d5c1c() {
        com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36[] mo100923x160d5c1c = this.f390058a.mo100923x160d5c1c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo100923x160d5c1c, "getProgramInfo(...)");
        return mo100923x160d5c1c;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getPropertyLong */
    public long mo100924x2d67b867(int i17) {
        return this.f390058a.mo100924x2d67b867(i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getPropertyString */
    public java.lang.String mo100925x7e95833c(int i17) {
        java.lang.String mo100925x7e95833c = this.f390058a.mo100925x7e95833c(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo100925x7e95833c, "getPropertyString(...)");
        return mo100925x7e95833c;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getReportManager */
    public com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.InterfaceC26234x67c8074 mo100926xba388c23() {
        return this.f390058a.mo100926xba388c23();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getTrackInfo */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d[] mo100927x2ae89de3() {
        com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d[] mo100927x2ae89de3 = this.f390058a.mo100927x2ae89de3();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo100927x2ae89de3, "getTrackInfo(...)");
        return mo100927x2ae89de3;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getVideoHeight */
    public int mo100928x463504c() {
        return this.f390058a.mo100928x463504c();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getVideoWidth */
    public int mo100929x8d5c7601() {
        return this.f390058a.mo100929x8d5c7601();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: pause */
    public void mo100930x65825f6() {
        this.f390058a.mo100930x65825f6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "pause");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: pauseDownload */
    public void mo100931xe51afc9e() {
        this.f390058a.mo100931xe51afc9e();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: prepareAsync */
    public void mo100932x857611b5() {
        if (this.f390061d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "already prepareAsync");
            return;
        }
        this.f390061d = true;
        if (this.f390072o != null) {
            mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(505, 1L));
            mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(305, 20));
        }
        this.f390058a.mo100932x857611b5();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "prepareAsync mediaId:" + this.f390066i);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: release */
    public void mo100933x41012807() {
        this.f390058a.mo100933x41012807();
        lk4.a aVar = this.f390072o;
        if (aVar != null) {
            lk4.b bVar = (lk4.b) aVar;
            if (bVar.f400550d != 0) {
                ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Bi(bVar.f400550d);
                bVar.f400550d = 0L;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.f400549c, "release");
            }
        }
        this.f390072o = null;
        a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "release");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: reset */
    public void mo100934x6761d4f() {
        this.f390058a.mo100934x6761d4f();
        a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "reset");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: resumeDownload */
    public void mo100935xb0277d5() {
        this.f390058a.mo100935xb0277d5();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: seekTo */
    public void mo100936xc9fc1b13(int i17) {
        this.f390058a.mo100936xc9fc1b13(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "seekTo:" + i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: selectProgram */
    public void mo100938x18ae2de8(int i17, long j17) {
        this.f390058a.mo100938x18ae2de8(i17, j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "selectProgram index:" + i17 + " opaque:" + j17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: selectTrack */
    public void mo100939xc3b89af(int i17, long j17) {
        this.f390058a.mo100939xc3b89af(i17, j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "selectTrack index:" + i17 + " opaque:" + j17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setAudioGainRatio */
    public void mo100940x3aa51598(float f17) {
        this.f390058a.mo100940x3aa51598(f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "setAudioGainRatio " + this.f390059b);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setAudioNormalizeVolumeParams */
    public void mo100941x1e3370b9(java.lang.String str) {
        this.f390058a.mo100941x1e3370b9(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "setAudioNormalizeVolumeParams " + str);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setDataSource */
    public void mo100945x683d6267(java.lang.String str) {
        c("url", new kk4.x(this, str));
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setLoopback */
    public void mo100947xfd27780d(boolean z17) {
        this.f390058a.mo100947xfd27780d(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "setLoopback:" + z17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnAudioFrameOutputListener */
    public void mo100949x47402aed(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnAudioFrameOutputListener iOnAudioFrameOutputListener) {
        this.f390058a.mo100949x47402aed(iOnAudioFrameOutputListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnAudioProcessFrameOutputListener */
    public void mo100950xbd4f3f08(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnAudioProcessFrameOutputListener iOnAudioProcessFrameOutputListener) {
        this.f390058a.mo100950xbd4f3f08(iOnAudioProcessFrameOutputListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnCompletionListener */
    public void mo100951xa4560c71(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener iOnCompletionListener) {
        this.f390058a.mo100951xa4560c71(iOnCompletionListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnDemuxerListener */
    public void mo100952xa8a04d4f(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnDemuxerListener iOnDemuxerListener) {
        this.f390058a.mo100952xa8a04d4f(iOnDemuxerListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnDetailInfoListener */
    public void mo100953xa4b31634(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnDetailInfoListener iOnDetailInfoListener) {
        this.f390058a.mo100953xa4b31634(iOnDetailInfoListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnErrorListener */
    public void mo100954x6954c27b(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener iOnErrorListener) {
        this.f390058a.mo100954x6954c27b(iOnErrorListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnInfoListener */
    public void mo100955x40f8c003(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener iOnInfoListener) {
        this.f390063f = iOnInfoListener;
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f390058a;
        if (iOnInfoListener == null) {
            interfaceC26164x73fc6bc6.mo100955x40f8c003(null);
        } else {
            interfaceC26164x73fc6bc6.mo100955x40f8c003(new kk4.c0(this));
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnPlayerStateChangeListener */
    public void mo100956xa23b7bf3(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener iOnStateChangeListener) {
        this.f390074q = iOnStateChangeListener;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnPreparedListener */
    public void mo100957x5dd7c812(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener iOnPreparedListener) {
        this.f390058a.mo100957x5dd7c812(new kk4.d0(this, iOnPreparedListener));
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnSeekCompleteListener */
    public void mo100958xe1a2e326(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener iOnSeekCompleteListener) {
        this.f390058a.mo100958xe1a2e326(iOnSeekCompleteListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnStopAsyncCompleteListener */
    public void mo100959x6aa275e6(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStopAsyncCompleteListener iOnStopAsyncCompleteListener) {
        this.f390058a.mo100959x6aa275e6(iOnStopAsyncCompleteListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnSubtitleDataListener */
    public void mo100960x8796ba37(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSubtitleDataListener iOnSubtitleDataListener) {
        this.f390058a.mo100960x8796ba37(iOnSubtitleDataListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnSubtitleFrameOutListener */
    public void mo100961xa679d9ae(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        this.f390058a.mo100961xa679d9ae(iOnSubtitleFrameOutListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnVideoFrameOutListener */
    public void mo100962xf26db5af(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        this.f390058a.mo100962xf26db5af(iOnVideoFrameOutListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnVideoProcessFrameOutputListener */
    public void mo100963xa90b836d(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoProcessFrameOutputListener iOnVideoProcessFrameOutputListener) {
        this.f390058a.mo100963xa90b836d(iOnVideoProcessFrameOutputListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnVideoSizeChangedListener */
    public void mo100964x2d6d87cd(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        this.f390058a.mo100964x2d6d87cd(iOnVideoSizeChangedListener);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOutputMute */
    public void mo100965xd0747cbc(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(e(), "setOutputMute " + z17, new java.lang.Object[0]);
        this.f390058a.mo100965xd0747cbc(z17);
        this.f390059b = z17;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setPlaySharpenSwitch */
    public void mo100966x41b4a011() {
        this.f390058a.mo100966x41b4a011();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "setPlaySharpenSwitch");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setPlaySpeedRatio */
    public void mo100967xd079f5a(float f17) {
        this.f390058a.mo100967xd079f5a(f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "setPlaySpeedRatio " + f17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setPlayerOptionalParam */
    public void mo100968x1ba09fea(com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 c26182x67c007f1) {
        this.f390058a.mo100968x1ba09fea(c26182x67c007f1);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setRichMediaSynchronizer */
    public void mo100969xeebc4268(com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26248xbe616625 interfaceC26248xbe616625) {
        this.f390058a.mo100969xeebc4268(interfaceC26248xbe616625);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setSurface */
    public void mo100970x42c875eb(android.view.Surface surface) {
        this.f390058a.mo100970x42c875eb(surface);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setSurfaceHolder */
    public void mo100972x5660d377(android.view.SurfaceHolder surfaceHolder) {
        this.f390058a.mo100972x5660d377(surfaceHolder);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setTPSurface */
    public void mo100973xf5e4086f(com.p314xaae8f345.p3006xb8ff1437.api.C26196x1194f691 c26196x1194f691) {
        this.f390058a.mo100973xf5e4086f(c26196x1194f691);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setVideoInfo */
    public void mo100974xab2f6987(com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad) {
        this.f390058a.mo100974xab2f6987(c26204xf8de58ad);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "setVideoInfo:" + c26204xf8de58ad);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: start */
    public void mo100975x68ac462() {
        this.f390058a.mo100975x68ac462();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "start");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: stop */
    public void mo100976x360802() {
        this.f390058a.mo100976x360802();
        a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "stop");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: stopAsync */
    public void mo100977x5f82bb9a() {
        this.f390058a.mo100977x5f82bb9a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "stopAsync");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: switchDefinition */
    public void mo100980x81d257a7(java.lang.String defUrl, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defUrl, "defUrl");
        this.f390058a.mo100980x81d257a7(defUrl, j17, c26204xf8de58ad);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "switchDefinition:" + defUrl + " id:" + j17 + " info:" + c26204xf8de58ad);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: switchHdrModeWithSurface */
    public void mo100984x40944be2(android.view.Surface surface, int i17) {
        this.f390058a.mo100984x40944be2(surface, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "switchHdrModeWithSurface surface:" + surface + " hdrMode:" + i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: updateLoggerContext */
    public void mo100985x80f0bbb6(com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e3) {
        this.f390058a.mo100985x80f0bbb6(c26478xc50084e3);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: enableTPAssetResourceLoader */
    public void mo100906x969bf12(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c interfaceC26468xe997c0c) {
        this.f390068k = interfaceC26468xe997c0c;
        this.f390058a.mo100906x969bf12(interfaceC26468xe997c0c);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setDataSource */
    public void mo100946x683d6267(java.lang.String str, java.util.Map map) {
        c("url with header", new kk4.y(this, str, map));
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setSurface */
    public void mo100971x42c875eb(android.view.Surface surface, int i17) {
        this.f390058a.mo100971x42c875eb(surface, i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: addAudioTrackSource */
    public void mo100899xa28fa651(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 c26231xafaedb13) {
        this.f390058a.mo100899xa28fa651(str, str2, c26231xafaedb13);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "addAudioTrackSource url:" + str + " name:" + str2 + " data:" + c26231xafaedb13);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: addSubtitleSource */
    public void mo100901x14654554(java.lang.String url, java.lang.String str, java.lang.String name, com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 c26231xafaedb13) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f390058a.mo100901x14654554(url, str, name, c26231xafaedb13);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "addSubtitleSource url:" + url + " mimeType:" + str + " name:" + name + " data:" + c26231xafaedb13);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: seekTo */
    public void mo100937xc9fc1b13(int i17, int i18) {
        this.f390058a.mo100937xc9fc1b13(i17, i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "seekTo:" + i17 + " mode:" + i18);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setDataSource */
    public void mo100943x683d6267(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        c("pfd", new kk4.z(this, parcelFileDescriptor));
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setLoopback */
    public void mo100948xfd27780d(boolean z17, long j17, long j18) {
        this.f390058a.mo100948xfd27780d(z17, j17, j18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "setLoopback:" + z17 + " start:" + j17 + " end:" + j18);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: switchDefinition */
    public void mo100982x81d257a7(java.lang.String defUrl, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad, java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defUrl, "defUrl");
        this.f390058a.mo100982x81d257a7(defUrl, j17, c26204xf8de58ad, (java.util.Map<java.lang.String, java.lang.String>) map);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "header switchDefinition:" + defUrl + " id:" + j17 + " info:" + c26204xf8de58ad);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setDataSource */
    public void mo100942x683d6267(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        c("afd", new kk4.a0(this, assetFileDescriptor));
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setDataSource */
    public void mo100944x683d6267(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1) {
        c("mat", new kk4.b0(this, interfaceC26214xf9e9afd1));
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: switchDefinition */
    public void mo100978x81d257a7(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 mediaAsset, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaAsset, "mediaAsset");
        this.f390058a.mo100978x81d257a7(mediaAsset, j17, c26204xf8de58ad);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "header switchDefinition asset id:" + j17 + " info:" + c26204xf8de58ad);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: switchDefinition */
    public void mo100981x81d257a7(java.lang.String defUrl, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defUrl, "defUrl");
        this.f390058a.mo100981x81d257a7(defUrl, j17, c26204xf8de58ad, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "switchDefinition:" + defUrl + " id:" + j17 + " info:" + c26204xf8de58ad + " mode:" + i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: switchDefinition */
    public void mo100983x81d257a7(java.lang.String defUrl, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad, java.util.Map map, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defUrl, "defUrl");
        this.f390058a.mo100983x81d257a7(defUrl, j17, c26204xf8de58ad, map, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "header switchDefinition:" + defUrl + " id:" + j17 + " info:" + c26204xf8de58ad + " mode:" + i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: switchDefinition */
    public void mo100979x81d257a7(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 mediaAsset, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaAsset, "mediaAsset");
        this.f390058a.mo100979x81d257a7(mediaAsset, j17, c26204xf8de58ad, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "switchDefinition asset id:" + j17 + " info:" + c26204xf8de58ad + " mode:" + i17);
    }
}
