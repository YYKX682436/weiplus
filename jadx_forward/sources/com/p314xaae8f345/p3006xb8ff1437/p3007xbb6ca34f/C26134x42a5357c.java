package com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f;

/* renamed from: com.tencent.thumbplayer.adapter.TPPlayerAdapterProxy */
/* loaded from: classes16.dex */
public class C26134x42a5357c implements java.lang.reflect.InvocationHandler {

    /* renamed from: METHOD_NAME_PAUSE */
    private static final java.lang.String f49960x33711940 = "pause";

    /* renamed from: METHOD_NAME_PREPARE */
    private static final java.lang.String f49961x37af51d1 = "prepareAsync";

    /* renamed from: METHOD_NAME_RELEASE */
    private static final java.lang.String f49962x8baa6cd1 = "release";

    /* renamed from: METHOD_NAME_RESET */
    private static final java.lang.String f49963x338f1099 = "reset";

    /* renamed from: METHOD_NAME_SEEK_TO */
    private static final java.lang.String f49964xc0312e8c = "seekTo";

    /* renamed from: METHOD_NAME_SELECT_TRACK */
    private static final java.lang.String f49965x1c1c217e = "selectTrack";

    /* renamed from: METHOD_NAME_SET_ON_ERROR_LISTENER */
    private static final java.lang.String f49966xcd9d7038 = "setOnErrorListener";

    /* renamed from: METHOD_NAME_SET_ON_INFO_LISTENER */
    private static final java.lang.String f49967xeb579878 = "setOnInfoListener";

    /* renamed from: METHOD_NAME_SET_ON_PREPARED_LISTENER */
    private static final java.lang.String f49968xebfea049 = "setOnPreparedListener";

    /* renamed from: METHOD_NAME_SET_ON_SEEK_COMPLETION_LISTENER */
    private static final java.lang.String f49969x152fa83d = "setOnSeekCompleteListener";

    /* renamed from: METHOD_NAME_SET_PLAY_SPEED */
    private static final java.lang.String f49970x9b46bb4f = "setPlaySpeedRatio";

    /* renamed from: METHOD_NAME_START */
    private static final java.lang.String f49971x33a3b7ac = "start";

    /* renamed from: METHOD_NAME_STOP */
    private static final java.lang.String f49972xc7dbff58 = "stop";

    /* renamed from: REPORT_LISTENER_CLASS_MAP */
    private static final java.util.Map<java.lang.String, java.lang.Class> f49973xeab3e4f5;
    private static final java.lang.String TAG = "TPPlayerAdapterProxy";

    /* renamed from: mPlayerAdapter */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26132x9a7ae012 f49974xb49bd9c1;

    /* renamed from: mPlayerAdapterInterfaceProxy */
    private java.lang.Object f49975x4265c8d6;

    /* renamed from: mPlayerAdapterProxyListeners */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26134x42a5357c.TPPlayerAdapterProxyListeners f49976x573e0392;

    /* renamed from: mPlayerBaseListeners */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26135xc8cc64f1 f49977xe3f11f60 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26135xc8cc64f1(TAG);

    /* renamed from: mPlayerContext */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26518xb8c23f93 f49978x31e66c21;

    /* renamed from: com.tencent.thumbplayer.adapter.TPPlayerAdapterProxy$TPPlayerAdapterProxyListeners */
    /* loaded from: classes16.dex */
    public class TPPlayerAdapterProxyListeners implements com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSeekCompleteListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnEventRecordListener {
        private TPPlayerAdapterProxyListeners() {
        }

        /* renamed from: publishBufferingEndEvent */
        private void m100491x897a0af2(long j17, long j18, java.lang.Object obj) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26134x42a5357c.this.f49978x31e66c21.m103560xb9d3a239().m103222x8f7db6cb(new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BufferingEndEventInfo());
        }

        /* renamed from: publishBufferingStartEvent */
        private void m100492xf86d9b0b(long j17, long j18, java.lang.Object obj) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26134x42a5357c.this.f49978x31e66c21.m103560xb9d3a239().m103222x8f7db6cb(new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BufferingStartEventInfo());
        }

        /* renamed from: publishSelectTrackEndEvent */
        private void m100493x3d60b3bf(long j17, long j18, java.lang.Object obj) {
            com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SelectTrackEndEventInfo selectTrackEndEventInfo = new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SelectTrackEndEventInfo();
            selectTrackEndEventInfo.m103204x1c0e5b23(((java.lang.Long) obj).longValue());
            selectTrackEndEventInfo.m103203x6f5de1d3((int) j18);
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26134x42a5357c.this.f49978x31e66c21.m103560xb9d3a239().m103222x8f7db6cb(selectTrackEndEventInfo);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnEventRecordListener
        /* renamed from: onDrmInfo */
        public void mo100462xc240780e(com.p314xaae8f345.p3006xb8ff1437.api.C26174xf2a580d1 c26174xf2a580d1) {
            com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DrmEventInfo drmEventInfo = new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DrmEventInfo();
            drmEventInfo.m103178x23d9002b(c26174xf2a580d1);
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26134x42a5357c.this.f49978x31e66c21.m103560xb9d3a239().m103222x8f7db6cb(drmEventInfo);
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26134x42a5357c.this.f49977xe3f11f60.mo100462xc240780e(c26174xf2a580d1);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener
        /* renamed from: onError */
        public void mo100463xaf8aa769(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPErrorType int i17, int i18, long j17, long j18) {
            com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayErrorEventInfo playErrorEventInfo = new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayErrorEventInfo();
            playErrorEventInfo.m103184x6f5de1d3(i18);
            playErrorEventInfo.m103185x6f65c320(i17);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 mo100402xc0f8b3fa = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26134x42a5357c.this.f49974xb49bd9c1.mo100402xc0f8b3fa();
            if (mo100402xc0f8b3fa == null) {
                mo100402xc0f8b3fa = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94();
            }
            playErrorEventInfo.m103186x910b666e(mo100402xc0f8b3fa);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 mo100401x55ab8bad = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26134x42a5357c.this.f49974xb49bd9c1.mo100401x55ab8bad(false);
            if (mo100401x55ab8bad == null) {
                mo100401x55ab8bad = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653();
            }
            playErrorEventInfo.m103183x87ef27b9(mo100401x55ab8bad);
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26134x42a5357c.this.f49978x31e66c21.m103560xb9d3a239().m103222x8f7db6cb(playErrorEventInfo);
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26134x42a5357c.this.f49977xe3f11f60.mo100463xaf8aa769(i17, i18, j17, j18);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener
        /* renamed from: onInfo */
        public void mo100464xc39adf2d(int i17, long j17, long j18, java.lang.Object obj) {
            if (i17 == 4) {
                m100493x3d60b3bf(j17, j18, obj);
            } else if (i17 == 200) {
                m100492xf86d9b0b(j17, j18, obj);
            } else if (i17 == 201) {
                m100491x897a0af2(j17, j18, obj);
            }
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26134x42a5357c.this.f49977xe3f11f60.mo100464xc39adf2d(i17, j17, j18, obj);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener
        /* renamed from: onPrepared */
        public void mo100465x58d5b73c() {
            com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PrepareEndEventInfo prepareEndEventInfo = new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PrepareEndEventInfo();
            prepareEndEventInfo.m103198x99514bbd(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26134x42a5357c.this.f49974xb49bd9c1.mo100251x6b2cfdb1());
            prepareEndEventInfo.m103197x65cc485c(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26134x42a5357c.this.f49974xb49bd9c1.mo100400x37a7fa50());
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26134x42a5357c.this.f49978x31e66c21.m103560xb9d3a239().m103222x8f7db6cb(prepareEndEventInfo);
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26134x42a5357c.this.f49977xe3f11f60.mo100465x58d5b73c();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSeekCompleteListener
        /* renamed from: onSeekComplete */
        public void mo100467xe1fdf750() {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26134x42a5357c.this.f49978x31e66c21.m103560xb9d3a239().m103222x8f7db6cb(new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SeekEndEventInfo());
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26134x42a5357c.this.f49977xe3f11f60.mo100467xe1fdf750();
        }
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f49973xeab3e4f5 = hashMap;
        hashMap.put(f49968xebfea049, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener.class);
        hashMap.put(f49967xeb579878, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener.class);
        hashMap.put(f49966xcd9d7038, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener.class);
        hashMap.put(f49969x152fa83d, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSeekCompleteListener.class);
    }

    public C26134x42a5357c(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26132x9a7ae012 c26132x9a7ae012, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26518xb8c23f93 c26518xb8c23f93) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26134x42a5357c.TPPlayerAdapterProxyListeners tPPlayerAdapterProxyListeners = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26134x42a5357c.TPPlayerAdapterProxyListeners();
        this.f49976x573e0392 = tPPlayerAdapterProxyListeners;
        this.f49974xb49bd9c1 = c26132x9a7ae012;
        this.f49978x31e66c21 = c26518xb8c23f93;
        c26132x9a7ae012.mo100435x5e0339be(tPPlayerAdapterProxyListeners);
    }

    /* renamed from: dealReturn */
    private static java.lang.Object m100478x2ad624bc(java.lang.reflect.Method method) {
        java.lang.String name = method.getReturnType().getName();
        if (name.equals(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.f56125x52684c03)) {
            return java.lang.Boolean.FALSE;
        }
        if (name.equals("int")) {
            return 0;
        }
        if (name.equals("long")) {
            return 0L;
        }
        if (name.equals("float")) {
            return java.lang.Float.valueOf(0.0f);
        }
        return null;
    }

    /* renamed from: doHookListener */
    private void m100479x971c3322(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.util.Map<java.lang.String, java.lang.Class> map = f49973xeab3e4f5;
        if (map.containsKey(method.getName())) {
            try {
                this.f49977xe3f11f60.getClass().getMethod(method.getName(), map.get(method.getName())).invoke(this.f49977xe3f11f60, objArr[0]);
                objArr[0] = this.f49976x573e0392;
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: doPublishEventIfNeed */
    private void m100480x769e2de9(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.String name = method.getName();
        name.getClass();
        char c17 = 65535;
        switch (name.hashCode()) {
            case -2055859787:
                if (name.equals(f49961x37af51d1)) {
                    c17 = 0;
                    break;
                }
                break;
            case -906224877:
                if (name.equals(f49964xc0312e8c)) {
                    c17 = 1;
                    break;
                }
                break;
            case 3540994:
                if (name.equals(f49972xc7dbff58)) {
                    c17 = 2;
                    break;
                }
                break;
            case 106440182:
                if (name.equals(f49960x33711940)) {
                    c17 = 3;
                    break;
                }
                break;
            case 108404047:
                if (name.equals(f49963x338f1099)) {
                    c17 = 4;
                    break;
                }
                break;
            case 109757538:
                if (name.equals(f49971x33a3b7ac)) {
                    c17 = 5;
                    break;
                }
                break;
            case 205228463:
                if (name.equals(f49965x1c1c217e)) {
                    c17 = 6;
                    break;
                }
                break;
            case 218603354:
                if (name.equals(f49970x9b46bb4f)) {
                    c17 = 7;
                    break;
                }
                break;
            case 1090594823:
                if (name.equals("release")) {
                    c17 = '\b';
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                m100482xa21d5482(objArr);
                return;
            case 1:
                m100485xb711f6b8(objArr);
                return;
            case 2:
                m100489xf6e3ef69(objArr);
                return;
            case 3:
                m100481x499358b3(objArr);
                return;
            case 4:
                m100484xe87710fa(objArr);
                return;
            case 5:
                m100488xee9eddc7(objArr);
                return;
            case 6:
                m100486xe0c915a(objArr);
                return;
            case 7:
                m100487x8aa0ef4f(objArr);
                return;
            case '\b':
                m100483xa5db1982(objArr);
                return;
            default:
                return;
        }
    }

    /* renamed from: publishPauseEvent */
    private void m100481x499358b3(java.lang.Object[] objArr) {
        this.f49978x31e66c21.m103560xb9d3a239().m103222x8f7db6cb(new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayPauseEventInfo());
    }

    /* renamed from: publishPrepareEvent */
    private void m100482xa21d5482(java.lang.Object[] objArr) {
    }

    /* renamed from: publishReleaseEvent */
    private void m100483xa5db1982(java.lang.Object[] objArr) {
        this.f49978x31e66c21.m103560xb9d3a239().m103222x8f7db6cb(new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayReleaseEventInfo());
    }

    /* renamed from: publishResetEvent */
    private void m100484xe87710fa(java.lang.Object[] objArr) {
        com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayResetEventInfo playResetEventInfo = new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayResetEventInfo();
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 mo100402xc0f8b3fa = this.f49974xb49bd9c1.mo100402xc0f8b3fa();
        if (mo100402xc0f8b3fa == null) {
            mo100402xc0f8b3fa = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94();
        }
        playResetEventInfo.m103190x910b666e(mo100402xc0f8b3fa);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 mo100401x55ab8bad = this.f49974xb49bd9c1.mo100401x55ab8bad(false);
        if (mo100401x55ab8bad == null) {
            mo100401x55ab8bad = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653();
        }
        playResetEventInfo.m103189x87ef27b9(mo100401x55ab8bad);
        this.f49978x31e66c21.m103560xb9d3a239().m103222x8f7db6cb(playResetEventInfo);
    }

    /* renamed from: publishSeekToEvent */
    private void m100485xb711f6b8(java.lang.Object[] objArr) {
        this.f49978x31e66c21.m103560xb9d3a239().m103222x8f7db6cb(new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SeekStartEventInfo());
    }

    /* renamed from: publishSelectTrackEvent */
    private void m100486xe0c915a(java.lang.Object[] objArr) {
        com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SelectTrackStartEventInfo selectTrackStartEventInfo = new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SelectTrackStartEventInfo();
        selectTrackStartEventInfo.m103209x604f6449(((java.lang.Integer) objArr[0]).intValue());
        selectTrackStartEventInfo.m103208x1c0e5b23(((java.lang.Long) objArr[1]).longValue());
        selectTrackStartEventInfo.m103210x873c5e57(this.f49974xb49bd9c1.mo100407x2ae89de3()[((java.lang.Integer) objArr[0]).intValue()]);
        this.f49978x31e66c21.m103560xb9d3a239().m103222x8f7db6cb(selectTrackStartEventInfo);
    }

    /* renamed from: publishSetPlaySpeedRatioEvent */
    private void m100487x8aa0ef4f(java.lang.Object[] objArr) {
        com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SetPlaySpeedEventInfo setPlaySpeedEventInfo = new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SetPlaySpeedEventInfo();
        setPlaySpeedEventInfo.m103218xd079f5a(((java.lang.Float) objArr[0]).floatValue());
        this.f49978x31e66c21.m103560xb9d3a239().m103222x8f7db6cb(setPlaySpeedEventInfo);
    }

    /* renamed from: publishStartEvent */
    private void m100488xee9eddc7(java.lang.Object[] objArr) {
        this.f49978x31e66c21.m103560xb9d3a239().m103222x8f7db6cb(new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayStartEventInfo());
    }

    /* renamed from: publishStopEvent */
    private void m100489xf6e3ef69(java.lang.Object[] objArr) {
        com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayStopEventInfo playStopEventInfo = new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayStopEventInfo();
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 mo100402xc0f8b3fa = this.f49974xb49bd9c1.mo100402xc0f8b3fa();
        if (mo100402xc0f8b3fa == null) {
            mo100402xc0f8b3fa = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94();
        }
        playStopEventInfo.m103194x910b666e(mo100402xc0f8b3fa);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 mo100401x55ab8bad = this.f49974xb49bd9c1.mo100401x55ab8bad(false);
        if (mo100401x55ab8bad == null) {
            mo100401x55ab8bad = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653();
        }
        playStopEventInfo.m103193x87ef27b9(mo100401x55ab8bad);
        this.f49978x31e66c21.m103560xb9d3a239().m103222x8f7db6cb(playStopEventInfo);
    }

    /* renamed from: getProxyInstance */
    public synchronized java.lang.Object m100490xceae316d() {
        if (this.f49975x4265c8d6 == null) {
            this.f49975x4265c8d6 = java.lang.reflect.Proxy.newProxyInstance(this.f49974xb49bd9c1.getClass().getClassLoader(), this.f49974xb49bd9c1.getClass().getInterfaces(), this);
        }
        return this.f49975x4265c8d6;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        try {
            m100480x769e2de9(method, objArr);
            m100479x971c3322(method, objArr);
            return method.invoke(this.f49974xb49bd9c1, objArr);
        } catch (java.lang.reflect.InvocationTargetException e17) {
            if (e17.getTargetException() != null) {
                throw e17.getTargetException();
            }
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "invokeMethod " + method.getName() + " has excecption: " + e17.toString());
            return m100478x2ad624bc(method);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "invokeMethod " + method.getName() + " has excecption: " + th6.toString());
            return m100478x2ad624bc(method);
        }
    }
}
