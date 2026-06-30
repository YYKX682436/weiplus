package df2;

/* loaded from: classes10.dex */
public final class k2 extends if2.b implements if2.e, mf2.c, mn0.c0, dk2.wf {

    /* renamed from: m, reason: collision with root package name */
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.m f312077m;

    /* renamed from: n, reason: collision with root package name */
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.r f312078n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f312079o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f312080p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f312081q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f312082r;

    /* renamed from: s, reason: collision with root package name */
    public final ml2.w f312083s;

    /* renamed from: t, reason: collision with root package name */
    public df2.e2 f312084t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312082r = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f312083s = new ml2.w();
    }

    @Override // mf2.c
    public void U0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "enterTRTCState - Enter TRTC mode, hide play/pause controls");
        this.f312080p = true;
        f7();
    }

    public final mn0.b0 Z6() {
        dk2.ef efVar = dk2.ef.f314905a;
        tn0.w0 w0Var = dk2.ef.f314911d;
        co0.s sVar = w0Var instanceof co0.s ? (co0.s) w0Var : null;
        if (sVar != null) {
            return sVar.R1.f363942a;
        }
        return null;
    }

    public final boolean a7() {
        ae2.in inVar = ae2.in.f85221a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85310i8).mo141623x754a37bb()).r()).intValue() > 0;
    }

    public final boolean b7() {
        if (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).U7() || pm0.v.z(((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410340g2, 524288)) {
            return false;
        }
        if (this.f312080p) {
            return true;
        }
        mn0.b0 Z6 = Z6();
        if (Z6 != null) {
            return ((mn0.y) Z6).b(false);
        }
        return false;
    }

    public final void c7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "notifyPaused - Send notify paused command to service");
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.r rVar = this.f312078n;
        if (rVar != null) {
            sn2.c cVar = sn2.c.f491653e;
            rVar.a("NOTIFY_PAUSED", null, null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlayerPause - isScreenOff: ");
        ml2.w wVar = this.f312083s;
        sb6.append(wVar.f409684a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserReporter", sb6.toString());
        if (!wVar.f409685b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserReporter", "onPlayerPause - is not playing, skip");
            return;
        }
        if (!wVar.f409684a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserReporter", "onPlayerPause - is not screen off, skip");
            return;
        }
        if (wVar.f409687d <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserReporter", "onPlayerPause - invalid playingSegmentStartTime: " + wVar.f409687d + ", ignore pause event");
            return;
        }
        wVar.f409688e += java.lang.System.currentTimeMillis() - wVar.f409687d;
        wVar.f409685b = false;
        wVar.f409687d = 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserReporter", "onPlayerPause - update accumulatedWatchTime: " + wVar.f409688e);
        ml2.w.c(wVar, ml2.v.f409651g, 0L, 0L, 6, null);
    }

    public final void d7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "notifyPlaying - Send notify playing command to service");
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.r rVar = this.f312078n;
        if (rVar != null) {
            sn2.c cVar = sn2.c.f491653e;
            rVar.a("NOTIFY_PLAYING", null, null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlayerPlay - isScreenOff: ");
        ml2.w wVar = this.f312083s;
        sb6.append(wVar.f409684a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserReporter", sb6.toString());
        if (wVar.f409685b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserReporter", "onPlayerPlay - is playing, skip");
            return;
        }
        if (!wVar.f409684a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserReporter", "onPlayerPlay - is not screen off, skip");
            return;
        }
        wVar.f409685b = true;
        wVar.f409687d = java.lang.System.currentTimeMillis();
        ml2.w.c(wVar, ml2.v.f409652h, 0L, 0L, 6, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserReporter", "onPlayerPlay - set playingSegmentStartTime: " + wVar.f409687d + ", accumulatedWatchTime: " + wVar.f409688e);
    }

    public final void e7() {
        mn0.b0 Z6 = Z6();
        if (Z6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveMediaBrowserController", "registerPlayerListener - CDN player not available");
            return;
        }
        mn0.y yVar = (mn0.y) Z6;
        if (yVar.f411341g.contains(this)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "registerPlayerListener - Skip, already registered");
            return;
        }
        yVar.a(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "registerPlayerListener - Listener registered, isPlaying=" + yVar.b(false));
        g7();
    }

    public final void f7() {
        boolean z17 = !this.f312080p;
        sn2.c cVar = z17 ? sn2.c.f491653e : sn2.c.f491654f;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.r rVar = this.f312078n;
        if (rVar != null) {
            rVar.a(cVar.f491656d, null, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "updateControlsVisibility - Controls enabled: " + z17);
    }

    public final void g7() {
        if (!a7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "updatePlaybackState - Skip, switch is closed");
            return;
        }
        boolean b76 = b7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "updatePlaybackState - Sync state to service, isPlaying=" + b76);
        if (b76) {
            d7();
        } else {
            c7();
        }
    }

    @Override // mn0.c0
    public void j6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "onPlayerPause - Player paused");
        c7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onFloatMode */
    public void mo14866x804e7f00() {
        super.mo14866x804e7f00();
        g7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        super.mo8997x8001c97e();
        if (!a7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "onLiveActivate - Skip, switch is closed");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "onLiveActivate - Start collecting live info");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new df2.h2(this, null), 3, null);
        dk2.ef efVar = dk2.ef.f314905a;
        java.util.ArrayList arrayList = (java.util.ArrayList) dk2.ef.f314935q;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "addAudioFocusChangeListener: " + this + ", total=" + arrayList.size());
        }
        if (this.f312084t == null) {
            this.f312084t = new df2.e2(this);
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        O6().registerReceiver(this.f312084t, intentFilter);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "registerScreenStateReceiver - Registered");
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "onLiveDeactivate - Cleanup resources");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "stopMediaBrowser - Stop requested");
        d75.b.g(new df2.j2(this));
        java.util.ArrayList arrayList = (java.util.ArrayList) dk2.ef.f314935q;
        arrayList.remove(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "removeAudioFocusChangeListener: " + this + ", total=" + arrayList.size());
        df2.e2 e2Var = this.f312084t;
        if (e2Var != null) {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(e2Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "unregisterScreenStateReceiver - Unregistered");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveMediaBrowserController", "unregisterScreenStateReceiver - Failed: " + e17.getMessage());
            }
        }
        this.f312084t = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveEnd */
    public void mo56792x5aa1a970() {
        super.mo56792x5aa1a970();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "onLiveEnd - Live ended");
        g7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "onLiveStart - Live started");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "startMediaBrowser - Start requested");
        d75.b.g(new df2.i2(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStartFromWindow */
    public void mo14864x95cdef51() {
        super.mo14864x95cdef51();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "onLiveStartFromWindow - Resumed from float window");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "startMediaBrowser - Start requested");
        d75.b.g(new df2.i2(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onNormalMode */
    public void mo14868x7c41fe69() {
        super.mo14868x7c41fe69();
        g7();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r4.f() == true) goto L15;
     */
    @Override // if2.e
    /* renamed from: onWindowFocusChanged */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo124217xa4ec7b0b(boolean r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onWindowFocusChanged - hasFocus="
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderLiveMediaBrowserController"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            r0 = 0
            if (r4 == 0) goto L60
            boolean r4 = r3.f312081q
            if (r4 != 0) goto L20
            java.lang.String r4 = "Skip, not paused by media session or notification"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r4)
            goto L62
        L20:
            tn0.w0 r4 = dk2.ef.f314911d
            if (r4 == 0) goto L30
            kn0.p r4 = r4.D
            if (r4 == 0) goto L30
            boolean r4 = r4.f()
            r2 = 1
            if (r4 != r2) goto L30
            goto L31
        L30:
            r2 = r0
        L31:
            if (r2 == 0) goto L39
            java.lang.String r4 = "Skip, in float mode"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r4)
            goto L62
        L39:
            mn0.b0 r4 = r3.Z6()
            if (r4 != 0) goto L45
            java.lang.String r4 = "Skip, CDN player not available"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r4)
            goto L62
        L45:
            mn0.y r4 = (mn0.y) r4
            boolean r2 = r4.b(r0)
            if (r2 == 0) goto L55
            java.lang.String r4 = "Skip, player is already playing"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r4)
            r3.f312081q = r0
            goto L62
        L55:
            java.lang.String r2 = "Auto resuming playback"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)
            r3.f312081q = r0
            r4.y()
            goto L62
        L60:
            r3.f312081q = r0
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.k2.mo124217xa4ec7b0b(boolean):void");
    }

    @Override // mn0.c0
    public void u() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "onPlayerResume - Player resumed");
        d7();
    }

    @Override // mf2.c
    public void w0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "exitTRTCState - Exit TRTC mode, show play/pause controls");
        this.f312080p = false;
        f7();
        e7();
    }
}
