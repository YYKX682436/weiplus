package com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0;

/* renamed from: com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle */
/* loaded from: classes16.dex */
public class C26146xe7089215 implements com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c {

    /* renamed from: SUB_POLL_INTV_MS */
    private static final int f50062xc640c5bd = 200;
    private static final java.lang.String TAG = "TPSysPlayerExternalSubtitle";

    /* renamed from: mLastSubText */
    private java.lang.String f50063xaafb796a;

    /* renamed from: mNativeSubtitleRenderParams */
    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.C26448xe1fd3147 f50064x5b95abf8;

    /* renamed from: mPlayPosLis */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IPlayPositionListener f50065x352ba043;

    /* renamed from: mSubLis */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IOnSubTitleListener f50067x1a47eb03;

    /* renamed from: mSubtitleErrorLis */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IOnSubtitleErrorListener f50070x9ab69e33;

    /* renamed from: mTpSubParser */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.C26449x5fe0cff3 f50072x5c1be4b6;

    /* renamed from: mTrackSelectLis */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IOnTrackSelectListener f50073x402880bc;

    /* renamed from: mSubtitleType */
    int f50071x1db89c7f = 0;

    /* renamed from: mSubPoll */
    private java.util.concurrent.Future<?> f50068x2eb75cf2 = null;

    /* renamed from: mSubPollLock */
    private final java.lang.Object f50069x191fcd3d = new java.lang.Object();

    /* renamed from: mState */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.SubtitleState f50066xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.SubtitleState.IDLE;

    /* renamed from: com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle$SubtitleState */
    /* loaded from: classes16.dex */
    public enum SubtitleState {
        IDLE,
        INITED,
        PREPARED,
        STOPED,
        ERROR
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleSubtitleLoadResult */
    public void m100601xd9448f23(long j17) {
        if (this.f50066xbec81024 != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.SubtitleState.INITED) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "prepare, illegalState, state:" + this.f50066xbec81024);
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26311x67c84ab1[] m102914x2ae89de3 = this.f50072x5c1be4b6.m102914x2ae89de3();
        if (m102914x2ae89de3 == null || m102914x2ae89de3.length <= 0) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "prepare, err, trackInfos is empty.");
            this.f50066xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.SubtitleState.ERROR;
            return;
        }
        if (m102914x2ae89de3[0].f52218x2b805725 != 3) {
            this.f50066xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.SubtitleState.ERROR;
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "prepare, err, track type not match.");
            return;
        }
        this.f50072x5c1be4b6.m102918x56fc3e0d(0, j17);
        this.f50066xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.SubtitleState.PREPARED;
        if (this.f50071x1db89c7f == 0) {
            synchronized (this.f50069x191fcd3d) {
                java.util.concurrent.Future<?> future = this.f50068x2eb75cf2;
                if (future != null) {
                    future.cancel(true);
                    this.f50068x2eb75cf2 = null;
                }
                this.f50068x2eb75cf2 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104410x2b7e2fba().scheduleAtFixedRate(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.this.m100602x6f101983(0);
                    }
                }, 0L, 200L, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: subPollFunc */
    public void m100602x6f101983(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IPlayPositionListener iPlayPositionListener = this.f50065x352ba043;
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IOnSubTitleListener iOnSubTitleListener = this.f50067x1a47eb03;
        if (iPlayPositionListener == null || iOnSubTitleListener == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "subPollFunc, posLis:" + iPlayPositionListener + ", subLis:" + iOnSubTitleListener);
            return;
        }
        long mo100582x9746038c = iPlayPositionListener.mo100582x9746038c();
        if (mo100582x9746038c < 0) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "subPollFunc, cur position:" + mo100582x9746038c);
        } else {
            java.lang.String m102913xe715cbdb = this.f50072x5c1be4b6.m102913xe715cbdb(mo100582x9746038c, i17);
            if (android.text.TextUtils.equals(this.f50063xaafb796a, m102913xe715cbdb)) {
                return;
            }
            this.f50063xaafb796a = m102913xe715cbdb;
            iOnSubTitleListener.mo100577xfb60e465(new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.SubtitleData(m102913xe715cbdb));
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c
    /* renamed from: pauseAsync */
    public void mo100561xfb893626() {
        if (this.f50066xbec81024 == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.SubtitleState.PREPARED) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "pauseAsync");
            this.f50072x5c1be4b6.m102917xfb893626();
        } else {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "pauseAsync, illegalState, state:" + this.f50066xbec81024);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c
    /* renamed from: prepare */
    public void mo100562xed060d07() {
        if (this.f50066xbec81024 != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.SubtitleState.INITED) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "prepare, illegalState, state:" + this.f50066xbec81024);
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "prepare.");
        this.f50072x5c1be4b6.m102915x316510();
        this.f50072x5c1be4b6.m102916x512c6d36();
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.C26448xe1fd3147 c26448xe1fd3147 = this.f50064x5b95abf8;
        if (c26448xe1fd3147 != null) {
            this.f50072x5c1be4b6.m102920xbd48ac3e(c26448xe1fd3147);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c
    /* renamed from: release */
    public void mo100563x41012807() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "release.");
        this.f50065x352ba043 = null;
        this.f50067x1a47eb03 = null;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c
    /* renamed from: reset */
    public void mo100564x6761d4f() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "reset.");
        if (this.f50066xbec81024 != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.SubtitleState.IDLE) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.C26449x5fe0cff3 c26449x5fe0cff3 = this.f50072x5c1be4b6;
            if (c26449x5fe0cff3 != null) {
                try {
                    c26449x5fe0cff3.m102922x360802();
                    this.f50072x5c1be4b6.m102923xcdd7f349();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
                }
            }
            this.f50072x5c1be4b6 = null;
        }
        synchronized (this.f50069x191fcd3d) {
            java.util.concurrent.Future<?> future = this.f50068x2eb75cf2;
            if (future != null) {
                future.cancel(true);
                this.f50068x2eb75cf2 = null;
            }
        }
        this.f50066xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.SubtitleState.IDLE;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c
    /* renamed from: setDataSource */
    public void mo100565x683d6267(java.lang.String str, long j17) {
        mo100566x683d6267(str, null, j17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c
    /* renamed from: setOnSubTitleListener */
    public void mo100567xfdcea4cd(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IOnSubTitleListener iOnSubTitleListener) {
        this.f50067x1a47eb03 = iOnSubTitleListener;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c
    /* renamed from: setPlayerPositionListener */
    public void mo100568x7be39900(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IPlayPositionListener iPlayPositionListener) {
        this.f50065x352ba043 = iPlayPositionListener;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c
    /* renamed from: setSubtitleErrorListener */
    public void mo100569xca424262(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IOnSubtitleErrorListener iOnSubtitleErrorListener) {
        this.f50070x9ab69e33 = iOnSubtitleErrorListener;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c
    /* renamed from: setSubtitleRenderModel */
    public void mo100570xd50c5039(com.p314xaae8f345.p3006xb8ff1437.api.C26195xfe0f07df c26195xfe0f07df) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.C26448xe1fd3147 m100788x1e0cd5a6 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.m100788x1e0cd5a6(c26195xfe0f07df);
        this.f50064x5b95abf8 = m100788x1e0cd5a6;
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.C26449x5fe0cff3 c26449x5fe0cff3 = this.f50072x5c1be4b6;
        if (c26449x5fe0cff3 != null) {
            c26449x5fe0cff3.m102920xbd48ac3e(m100788x1e0cd5a6);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c
    /* renamed from: setSubtitleType */
    public void mo100571x1d5f10f4(int i17) {
        this.f50071x1db89c7f = i17;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c
    /* renamed from: setTrackSelectListener */
    public void mo100572x8615c39(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c.IOnTrackSelectListener iOnTrackSelectListener) {
        this.f50073x402880bc = iOnTrackSelectListener;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c
    /* renamed from: startAsync */
    public void mo100573xa094bb3a() {
        if (this.f50066xbec81024 == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.SubtitleState.PREPARED) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "startAsync");
            this.f50072x5c1be4b6.m102921xa094bb3a();
        } else {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "startAsync, illegalState, state:" + this.f50066xbec81024);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c
    /* renamed from: stop */
    public void mo100574x360802() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "stop.");
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.SubtitleState subtitleState = this.f50066xbec81024;
        if (subtitleState == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.SubtitleState.INITED || subtitleState == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.SubtitleState.PREPARED || subtitleState == com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.SubtitleState.ERROR) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.C26449x5fe0cff3 c26449x5fe0cff3 = this.f50072x5c1be4b6;
            if (c26449x5fe0cff3 != null) {
                try {
                    c26449x5fe0cff3.m102922x360802();
                    this.f50072x5c1be4b6.m102923xcdd7f349();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
                }
            }
            this.f50072x5c1be4b6 = null;
        }
        if (this.f50071x1db89c7f == 0) {
            synchronized (this.f50069x191fcd3d) {
                java.util.concurrent.Future<?> future = this.f50068x2eb75cf2;
                if (future != null) {
                    future.cancel(true);
                    this.f50068x2eb75cf2 = null;
                }
            }
        }
        this.f50066xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.SubtitleState.STOPED;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.InterfaceC26143x92a3ac2c
    /* renamed from: setDataSource */
    public void mo100566x683d6267(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, final long j17) {
        if (this.f50066xbec81024 != com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.SubtitleState.IDLE) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "setDataSource, illegalState, state:" + this.f50066xbec81024);
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "setDataSource, illegal argument, url:" + str);
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "setDataSource, url: " + str);
        if (this.f50072x5c1be4b6 != null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "setDataSource, mTpSubParser != null.");
            try {
                this.f50072x5c1be4b6.m102922x360802();
                this.f50072x5c1be4b6.m102923xcdd7f349();
            } catch (java.lang.Exception unused) {
            }
            this.f50072x5c1be4b6 = null;
        }
        this.f50072x5c1be4b6 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.C26449x5fe0cff3(str, map, new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.InterfaceC26446x3df3a6a1() { // from class: com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle.1
            @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.InterfaceC26446x3df3a6a1
            /* renamed from: onGetCurrentPlayPositionMs */
            public long mo100603xbfa90c25() {
                if (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.this.f50065x352ba043 != null) {
                    return com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.this.f50065x352ba043.mo100582x9746038c();
                }
                return 0L;
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.InterfaceC26446x3df3a6a1
            /* renamed from: onLoadResult */
            public void mo100604xb7b913e2(int i17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.TAG, "onLoadResult, index:" + i17);
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.this.m100601xd9448f23(j17);
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.InterfaceC26446x3df3a6a1
            /* renamed from: onSelectResult */
            public void mo100605xec5fc7b8(int i17, long j18) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.TAG, "onSelectResult, errCode:" + i17 + ", selectOpaque:" + j18 + ", opaque =" + j17);
                if (i17 == 0 && com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.this.f50073x402880bc != null) {
                    com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.this.f50073x402880bc.mo100581xc52af01b(j17);
                } else {
                    if (i17 == 0 || com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.this.f50073x402880bc == null) {
                        return;
                    }
                    com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.this.f50073x402880bc.mo100580xf3b1e1a2(i17, j17);
                }
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.InterfaceC26446x3df3a6a1
            /* renamed from: onSubtitleError */
            public void mo100606x70854931(int i17, int i18) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.TAG, "onSubtitleError, index:" + i17 + ", errorCode:" + i18);
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.this.f50070x9ab69e33.mo100579x70854931(i17, i18);
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.InterfaceC26446x3df3a6a1
            /* renamed from: onSubtitleFrame */
            public void mo100607x70932096(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26327x7e714b19 c26327x7e714b19) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.TAG, "onSubtitleFrame");
                if (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.this.f50067x1a47eb03 != null) {
                    com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.this.f50067x1a47eb03.mo100576xba654960(c26327x7e714b19);
                }
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.InterfaceC26446x3df3a6a1
            /* renamed from: onSubtitleNote */
            public void mo100608xfb632fa9(java.lang.String str2) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.TAG, "onSubtitleNote");
                if (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.this.f50067x1a47eb03 != null) {
                    com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.this.f50067x1a47eb03.mo100578xfb632fa9(str2);
                }
            }
        }, this.f50071x1db89c7f);
        this.f50066xbec81024 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3009x8026dd0.C26146xe7089215.SubtitleState.INITED;
    }
}
