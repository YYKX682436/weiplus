package com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0;

/* renamed from: com.tencent.thumbplayer.tplayer.reportv2.TPLiveReporter */
/* loaded from: classes16.dex */
public class C26537x382d289 extends com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26535x3290736e {

    /* renamed from: BUFFERING_DURATION_THRESHOLD_MS */
    private static final int f54977x611e6de8 = 1200;

    /* renamed from: PERIOD_REPORT_TIME_MS */
    private static final int f54978xbfa6ba8b = 60000;

    /* renamed from: PLAYER_END_NO_ERROR */
    private static final int f54979x9461498c = 0;
    private static final java.lang.String TAG = "TPLiveReporter";

    /* renamed from: mIsPlayDone */
    private boolean f54981x1cde086d = true;

    /* renamed from: mIsBuffering */
    private boolean f54980xf3f4eeeb = false;

    /* renamed from: mReportParamRecord */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26536xd3b1ccc2 f54985xadd647d = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26536xd3b1ccc2();

    /* renamed from: mPeriodReportTimerLock */
    private final java.lang.Object f54983xf3ca28ce = new java.lang.Object();

    /* renamed from: mPeriodReportTimer */
    private java.util.concurrent.Future<?> f54982x4db82903 = null;

    /* renamed from: mPeriodTimerRunnable */
    private java.lang.Runnable f54984x80ec1394 = new java.lang.Runnable() { // from class: com.tencent.thumbplayer.tplayer.reportv2.TPLiveReporter.1
        @Override // java.lang.Runnable
        public void run() {
            if (!com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26537x382d289.this.f54981x1cde086d) {
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26537x382d289.this.m103809xb0090d45();
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26537x382d289.TAG, "Period Timer Exit because play done.");
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26537x382d289.this.f54982x4db82903.cancel(true);
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26537x382d289.this.f54982x4db82903 = null;
        }
    };

    /* renamed from: destroyPeriodReportTimer */
    private synchronized void m103792xb10ff516() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "destroyPeriodReportTimer");
        synchronized (this.f54983xf3ca28ce) {
            java.util.concurrent.Future<?> future = this.f54982x4db82903;
            if (future != null) {
                future.cancel(true);
                this.f54982x4db82903 = null;
            }
        }
    }

    /* renamed from: fillGeneralPlayFlowParams */
    private void m103793x3767dbed(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.p3074x32b0ec.C26556x2bcad250 c26556x2bcad250, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 c26405x843ecc94) {
        c26556x2bcad250.m104039xf754e681(c26405x843ecc94.f53262xeac80517.f53309x381bb70c);
        c26556x2bcad250.m104041x7dfcb97b(c26405x843ecc94.f53262xeac80517.f53311x63462d0);
        c26556x2bcad250.m104053x92368716(c26405x843ecc94.f53262xeac80517.f53315x6fa38361);
        c26556x2bcad250.m104051x4ae398a6(c26405x843ecc94.f53262xeac80517.f53313x75387271);
        c26556x2bcad250.m104050x9ce772d8(c26405x843ecc94.f53262xeac80517.f53309x381bb70c);
        c26556x2bcad250.m104058x765afd21(c26405x843ecc94.f53262xeac80517.f53320xac7a12ac);
        c26556x2bcad250.m104057x24bb73cd(c26405x843ecc94.f53262xeac80517.f53319xf4ee00e2);
        c26556x2bcad250.m104055xe9982dd2(c26405x843ecc94.f53262xeac80517.f53317xb9cabae7);
        c26556x2bcad250.m104052xf10db453(c26405x843ecc94.f53262xeac80517.f53314x7ed15028);
        c26556x2bcad250.m104040x3e702bce(c26405x843ecc94.f53262xeac80517.f53310x3d28659);
        c26556x2bcad250.m104062xdb532787(c26405x843ecc94.f53262xeac80517.f53321xc3d8ba92);
        c26556x2bcad250.m104056xa7dbbbc2(c26405x843ecc94.f53262xeac80517.f53318xddfad14d);
        c26556x2bcad250.m104037xdbe9744c(c26405x843ecc94.f53262xeac80517.f53308xc46f0757);
        c26556x2bcad250.m104054x7e96425d(c26405x843ecc94.f53262xeac80517.f53316xb4b557e8);
    }

    /* renamed from: fillPeriodExtReportInfoToCommonParams */
    private void m103794x4bc34d8b(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26534xafaa5d7d c26534xafaa5d7d) {
        com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26240x603a7652 interfaceC26240x603a7652 = this.f54966x5e048a3a;
        if (interfaceC26240x603a7652 == null) {
            return;
        }
        java.util.Map<java.lang.String, java.lang.String> m101486x3a2a0593 = interfaceC26240x603a7652.m101486x3a2a0593();
        if (m101486x3a2a0593 == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "fillPeriodExtReportInfoToCommonParams fail, period ExtendReportInfo is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26535x3290736e.m103771x61ab3cba(m101486x3a2a0593, hashMap, hashMap2);
        c26534xafaa5d7d.f54945x9879cc5e.m103944xf6e561c8(hashMap);
        c26534xafaa5d7d.f54945x9879cc5e.m103943xff8316b7(hashMap2);
    }

    /* renamed from: fillPlayerEndConfigParams */
    private void m103795x59efb4ff(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.p3074x32b0ec.C26553xdba6e599 c26553xdba6e599, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 c26405x843ecc94) {
        c26553xdba6e599.m103975x75f472a5(c26405x843ecc94.f53259x4233636b.f53271x503740b0);
        c26553xdba6e599.m103970xe552546a(c26405x843ecc94.f53259x4233636b.f53263xbf952275);
        c26553xdba6e599.m103976xabbfc809(c26405x843ecc94.f53259x4233636b.f53275x60358c9e);
        c26553xdba6e599.m103971x1ec19a4(c26405x843ecc94.f53259x4233636b.f53265xb661de39);
        c26553xdba6e599.m103972x144bac34(c26405x843ecc94.f53259x4233636b.f53266x4e1d0349);
    }

    /* renamed from: getLiveEndParams */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.p3074x32b0ec.C26553xdba6e599 m103796x581992ff(long j17, int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 c26405x843ecc94) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.p3074x32b0ec.C26553xdba6e599 c26553xdba6e599 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.p3074x32b0ec.C26553xdba6e599();
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26536xd3b1ccc2 c26536xd3b1ccc2 = this.f54985xadd647d;
        long j18 = c26536xd3b1ccc2.f54976x72983e6b + (j17 - c26536xd3b1ccc2.f54973x66c5d963);
        c26536xd3b1ccc2.f54976x72983e6b = j18;
        c26553xdba6e599.m103974x2e70cc56(j18);
        c26553xdba6e599.m103973x6f5de1d3(i17);
        m103795x59efb4ff(c26553xdba6e599, c26405x843ecc94);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.C26551xb06837ed c26551xb06837ed = this.f54985xadd647d.f54945x9879cc5e;
        int i18 = this.f54965xae2ee286;
        this.f54965xae2ee286 = i18 + 1;
        c26551xb06837ed.m103952xca02949d(i18);
        this.f54967x9acdfd30.m103849xc6fc5aba(this.f54985xadd647d.f54945x9879cc5e);
        c26553xdba6e599.m103885xc9322f66(this.f54985xadd647d.f54945x9879cc5e);
        return c26553xdba6e599;
    }

    /* renamed from: getLiveFlowParams */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.p3074x32b0ec.C26556x2bcad250 m103797xdeaeef56(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 c26405x843ecc94, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 c26404xfb288653) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.p3074x32b0ec.C26556x2bcad250 c26556x2bcad250 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.p3074x32b0ec.C26556x2bcad250();
        c26556x2bcad250.m104061xc5740b5c(this.f54968x806675c4.f55076x9d874c31);
        c26556x2bcad250.m104038x202d302(this.f54968x806675c4.f55068xea88660d);
        c26556x2bcad250.m104060xe0b8777c(this.f54968x806675c4.f55074x1526a67);
        c26556x2bcad250.m104059xf434222d(this.f54985xadd647d.f54975x301d09e4);
        m103793x3767dbed(c26556x2bcad250, c26405x843ecc94);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.C26551xb06837ed c26551xb06837ed = this.f54985xadd647d.f54945x9879cc5e;
        int i17 = this.f54965xae2ee286;
        this.f54965xae2ee286 = i17 + 1;
        c26551xb06837ed.m103952xca02949d(i17);
        this.f54967x9acdfd30.m103849xc6fc5aba(this.f54985xadd647d.f54945x9879cc5e);
        c26556x2bcad250.m103885xc9322f66(this.f54985xadd647d.f54945x9879cc5e);
        return c26556x2bcad250;
    }

    /* renamed from: onAppBackground */
    private void m103798x3be51a90() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onAppBackground");
        if (this.f54981x1cde086d) {
            return;
        }
        m103776x1ebcc756(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55028x42e86134, m103797xdeaeef56(m103782xa70cd483(), m103780x8ed24936(false)));
        m103776x1ebcc756(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55026x86498bf5, m103796x581992ff(android.os.SystemClock.elapsedRealtime(), 0, m103782xa70cd483()));
    }

    /* renamed from: onAppForeground */
    private void m103799x1952ea5() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onAppForeground");
        m103785xb1f1ac19(this.f54985xadd647d.f54945x9879cc5e.m103900x194b99df());
    }

    /* renamed from: onBufferingEnd */
    private void m103800x2018c558(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BufferingEndEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onBufferingEnd fail:params is not match");
            return;
        }
        this.f54980xf3f4eeeb = false;
        long m103165xb0301981 = ((com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BufferingEndEventInfo) baseEventInfo).m103165xb0301981();
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26536xd3b1ccc2 c26536xd3b1ccc2 = this.f54985xadd647d;
        long j17 = m103165xb0301981 - c26536xd3b1ccc2.f54969xfb598bf0;
        c26536xd3b1ccc2.f54974x46ce47d7 = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Live onBufferingEnd bufferingCostTimeMs:" + j17);
        if (j17 <= 1200) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26536xd3b1ccc2 c26536xd3b1ccc22 = this.f54985xadd647d;
        c26536xd3b1ccc22.f54970x7cde12bb++;
        c26536xd3b1ccc22.f54971x151b4f6a += j17;
        c26536xd3b1ccc22.f54969xfb598bf0 = 0L;
    }

    /* renamed from: onBufferingStart */
    private void m103801x7dc4d59f(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BufferingStartEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onBufferingStart fail:params is not match");
            return;
        }
        this.f54980xf3f4eeeb = true;
        this.f54985xadd647d.f54969xfb598bf0 = ((com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BufferingStartEventInfo) baseEventInfo).m103165xb0301981();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Live onBufferingStart timeMs:" + this.f54985xadd647d.f54969xfb598bf0);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26536xd3b1ccc2 c26536xd3b1ccc2 = this.f54985xadd647d;
        c26536xd3b1ccc2.f54972x8193923b = c26536xd3b1ccc2.f54972x8193923b + (c26536xd3b1ccc2.f54969xfb598bf0 - c26536xd3b1ccc2.f54974x46ce47d7);
    }

    /* renamed from: onDTCdnUrlUpdate */
    private void m103802x36563dba(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTCdnUrlUpdataEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onDTCdnUrlUpdate fail:params is not match");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTCdnUrlUpdataEventInfo dTCdnUrlUpdataEventInfo = (com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTCdnUrlUpdataEventInfo) baseEventInfo;
        java.lang.String m103167x743fd87e = dTCdnUrlUpdataEventInfo.m103167x743fd87e();
        java.lang.String m103168x33425148 = dTCdnUrlUpdataEventInfo.m103168x33425148();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Vod onDTCdnUrlUpdate cdnIp:" + m103167x743fd87e + " uIp:" + m103168x33425148);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26536xd3b1ccc2 c26536xd3b1ccc2 = this.f54985xadd647d;
        c26536xd3b1ccc2.f54946xdb3e2e77 = m103167x743fd87e;
        c26536xd3b1ccc2.f54949xac0eba6f = m103168x33425148;
    }

    /* renamed from: onDTProcessUpdate */
    private void m103803x62f99da9(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTDownloadProgressUpdataEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onDTProcessUpdate fail:params is not match");
            return;
        }
        int m103171x58461223 = ((com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTDownloadProgressUpdataEventInfo) baseEventInfo).m103171x58461223();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Vod onDTProcessUpdate speedKbps:" + m103171x58461223);
        this.f54985xadd647d.f54948x11033d44 = m103171x58461223;
    }

    /* renamed from: onDTProtocolUpdate */
    private void m103804x19c36a10(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTProtocalUpdateEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onDTProtocolUpdate fail:params is not match");
            return;
        }
        java.lang.String m103174xc15f60b5 = ((com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTProtocalUpdateEventInfo) baseEventInfo).m103174xc15f60b5();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Vod onDTProtocolUpdate protocolVer:" + m103174xc15f60b5);
        this.f54985xadd647d.f54947x577997ee = m103174xc15f60b5;
    }

    /* renamed from: onPlayerEnd */
    private void m103805x8e94bb1b(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (this.f54981x1cde086d) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "Player has been called End");
            return;
        }
        this.f54981x1cde086d = true;
        m103812xbddcced4(baseEventInfo.m103165xb0301981(), 0, m103783xe943b804(baseEventInfo), m103781x383a3b31(baseEventInfo));
        m103785xb1f1ac19(this.f54985xadd647d.f54945x9879cc5e.m103900x194b99df());
    }

    /* renamed from: onPlayerError */
    private void m103806x3c547448(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (this.f54981x1cde086d) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "Player has been called End");
            return;
        }
        this.f54981x1cde086d = true;
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayErrorEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onPlayerError fail:params is not match");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayErrorEventInfo playErrorEventInfo = (com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayErrorEventInfo) baseEventInfo;
        m103812xbddcced4(playErrorEventInfo.m103165xb0301981(), playErrorEventInfo.m103180x130a215f(), m103783xe943b804(playErrorEventInfo), m103781x383a3b31(playErrorEventInfo));
        m103785xb1f1ac19(this.f54985xadd647d.f54945x9879cc5e.m103900x194b99df());
    }

    /* renamed from: onPlayerStart */
    private void m103807x3d1a66a2(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayStartEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onPlayerStart fail:params is not match");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayStartEventInfo playStartEventInfo = (com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayStartEventInfo) baseEventInfo;
        this.f54981x1cde086d = false;
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26536xd3b1ccc2 c26536xd3b1ccc2 = this.f54985xadd647d;
        if (c26536xd3b1ccc2.f54973x66c5d963 == 0) {
            c26536xd3b1ccc2.f54973x66c5d963 = playStartEventInfo.m103165xb0301981();
        }
        this.f54985xadd647d.f54974x46ce47d7 = playStartEventInfo.m103165xb0301981();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Live onPlayerStart FirstStartTimeMs:" + this.f54985xadd647d.f54973x66c5d963 + " mPlayerStartOccurElapsedTimeMs:" + this.f54985xadd647d.f54974x46ce47d7);
        m103813x2b492dae();
    }

    /* renamed from: onPrepareDone */
    private void m103808xce4951ca(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PrepareEndEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onPrepareDone fail:params is not match");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PrepareEndEventInfo prepareEndEventInfo = (com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PrepareEndEventInfo) baseEventInfo;
        long m103165xb0301981 = prepareEndEventInfo.m103165xb0301981() - this.f54968x806675c4.f55074x1526a67;
        this.f54985xadd647d.f54975x301d09e4 = prepareEndEventInfo.m103165xb0301981();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Live onPrepareDone timeMs:" + m103165xb0301981);
        m103779xa97549fd(this.f54985xadd647d);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.C26551xb06837ed c26551xb06837ed = this.f54985xadd647d.f54945x9879cc5e;
        int i17 = this.f54965xae2ee286;
        this.f54965xae2ee286 = i17 + 1;
        c26551xb06837ed.m103952xca02949d(i17);
        this.f54967x9acdfd30.m103849xc6fc5aba(this.f54985xadd647d.f54945x9879cc5e);
        m103778xe4b5d01c(this.f54985xadd647d);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.p3074x32b0ec.C26554x1c8fde34 c26554x1c8fde34 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.p3074x32b0ec.C26554x1c8fde34();
        c26554x1c8fde34.m103978x1643b182(m103165xb0301981);
        c26554x1c8fde34.m103885xc9322f66(this.f54985xadd647d.f54945x9879cc5e);
        java.util.Map<java.lang.String, java.lang.String> m103886x18cb9578 = c26554x1c8fde34.m103886x18cb9578();
        m103777xf7a07396("onPrepareDone", m103886x18cb9578);
        m103787xeb62bb48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55027xac1280bb, m103886x18cb9578);
        m103786xddf12126(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55027xac1280bb, m103886x18cb9578);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: periodReportEvent */
    public void m103809xb0090d45() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "periodReportEvent enter.");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26536xd3b1ccc2 c26536xd3b1ccc2 = this.f54985xadd647d;
        c26536xd3b1ccc2.f54972x8193923b += elapsedRealtime - c26536xd3b1ccc2.f54974x46ce47d7;
        c26536xd3b1ccc2.f54974x46ce47d7 = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.p3074x32b0ec.C26555xbe52204f c26555xbe52204f = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.p3074x32b0ec.C26555xbe52204f();
        c26555xbe52204f.m103999x4a1ef8f(this.f54985xadd647d.f54970x7cde12bb);
        c26555xbe52204f.m104000xecbb3da(this.f54985xadd647d.f54971x151b4f6a);
        c26555xbe52204f.m104007x27d38a0f(this.f54985xadd647d.f54972x8193923b);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 mo101567x55ab8bad = this.f54963x97315ba7.mo101567x55ab8bad(true);
        c26555xbe52204f.m104001x88c3bd4b(mo101567x55ab8bad.f53246x213fe529);
        c26555xbe52204f.m103996x5532aa9d(mo101567x55ab8bad.f53243xe20a7b17);
        c26555xbe52204f.m104004x84f52f1d(mo101567x55ab8bad.f53249x55a6c697);
        c26555xbe52204f.m104002xc4b91627(mo101567x55ab8bad.f53244xad3ea932);
        c26555xbe52204f.m103997x1bd69179(mo101567x55ab8bad.f53241x45c2484);
        c26555xbe52204f.m104005xd50c95f9(mo101567x55ab8bad.f53247xbd922904);
        c26555xbe52204f.m104003xcd7c6270(mo101567x55ab8bad.f53245x81f22705);
        c26555xbe52204f.m103998x47b182de(mo101567x55ab8bad.f53242xfc274773);
        c26555xbe52204f.m104006x8b4c6e5e(mo101567x55ab8bad.f53248x3fc232f3);
        c26555xbe52204f.m104009xd00d7789(mo101567x55ab8bad.f53251xa820b85e);
        c26555xbe52204f.m104010x323cb531(mo101567x55ab8bad.f53252xa4ff606);
        c26555xbe52204f.m104008x3fa879b2(mo101567x55ab8bad.f53250x5feed947);
        c26555xbe52204f.m103995x1663004d(mo101567x55ab8bad.f53240x36a95fe2);
        m103794x4bc34d8b(this.f54985xadd647d);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.C26551xb06837ed c26551xb06837ed = this.f54985xadd647d.f54945x9879cc5e;
        int i17 = this.f54965xae2ee286;
        this.f54965xae2ee286 = i17 + 1;
        c26551xb06837ed.m103952xca02949d(i17);
        this.f54967x9acdfd30.m103849xc6fc5aba(this.f54985xadd647d.f54945x9879cc5e);
        c26555xbe52204f.m103885xc9322f66(this.f54985xadd647d.f54945x9879cc5e);
        java.util.Map<java.lang.String, java.lang.String> m103886x18cb9578 = c26555xbe52204f.m103886x18cb9578();
        m103777xf7a07396("periodReportEvent", m103886x18cb9578);
        m103787xeb62bb48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55029x3b03e847, m103886x18cb9578);
        m103786xddf12126(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55029x3b03e847, m103886x18cb9578);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26536xd3b1ccc2 c26536xd3b1ccc22 = this.f54985xadd647d;
        c26536xd3b1ccc22.f54970x7cde12bb = 0;
        c26536xd3b1ccc22.f54971x151b4f6a = 0L;
        c26536xd3b1ccc22.f54972x8193923b = 0L;
        c26536xd3b1ccc22.f54945x9879cc5e.m103944xf6e561c8(null);
        this.f54985xadd647d.f54945x9879cc5e.m103943xff8316b7(null);
    }

    /* renamed from: reportLiveEndEvent */
    private void m103810x86bd2edf(long j17, int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 c26405x843ecc94) {
        java.util.Map<java.lang.String, java.lang.String> m103886x18cb9578 = m103796x581992ff(j17, i17, c26405x843ecc94).m103886x18cb9578();
        m103777xf7a07396("reportLiveEndEvent", m103886x18cb9578);
        m103787xeb62bb48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55026x86498bf5, m103886x18cb9578);
        m103786xddf12126(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55026x86498bf5, m103886x18cb9578);
    }

    /* renamed from: reportLiveEndFlowEvent */
    private void m103811x18301fd1(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 c26405x843ecc94, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 c26404xfb288653) {
        java.util.Map<java.lang.String, java.lang.String> m103886x18cb9578 = m103797xdeaeef56(c26405x843ecc94, c26404xfb288653).m103886x18cb9578();
        m103777xf7a07396("reportLiveEndFlowEvent", m103886x18cb9578);
        m103787xeb62bb48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55028x42e86134, m103886x18cb9578);
        m103786xddf12126(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55028x42e86134, m103886x18cb9578);
    }

    /* renamed from: reportPlayerEndEvent */
    private void m103812xbddcced4(long j17, int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 c26405x843ecc94, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 c26404xfb288653) {
        if (this.f54980xf3f4eeeb) {
            m103800x2018c558(new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BufferingEndEventInfo());
            this.f54980xf3f4eeeb = false;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26536xd3b1ccc2 c26536xd3b1ccc2 = this.f54985xadd647d;
        c26536xd3b1ccc2.f54972x8193923b += elapsedRealtime - c26536xd3b1ccc2.f54974x46ce47d7;
        m103792xb10ff516();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "reportPlayerEndEvent playerStopTimeMs:" + j17 + " errorCode:" + i17);
        m103811x18301fd1(c26405x843ecc94, c26404xfb288653);
        m103810x86bd2edf(j17, i17, c26405x843ecc94);
    }

    /* renamed from: startPeriodReportTimer */
    private void m103813x2b492dae() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "startPeriodReportTimer");
        synchronized (this.f54983xf3ca28ce) {
            if (this.f54982x4db82903 == null) {
                this.f54982x4db82903 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104410x2b7e2fba().scheduleAtFixedRate(this.f54984x80ec1394, 0L, 60000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26535x3290736e, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.InterfaceC26533xdd191086
    /* renamed from: init */
    public void mo103765x316510(android.content.Context context, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26546x3533ba13 c26546x3533ba13) {
        super.mo103765x316510(context, c26546x3533ba13);
        this.f54967x9acdfd30.m103848xa4c20cac(this.f54985xadd647d.f54945x9879cc5e);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26535x3290736e, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.InterfaceC26533xdd191086
    /* renamed from: onEvent */
    public void mo103766xaf8c47fb(int i17, com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (i17 == 2) {
            m103808xce4951ca(baseEventInfo);
            return;
        }
        if (i17 == 3) {
            m103807x3d1a66a2(baseEventInfo);
            return;
        }
        if (i17 == 5) {
            m103805x8e94bb1b(baseEventInfo);
            return;
        }
        if (i17 == 6) {
            m103806x3c547448(baseEventInfo);
            return;
        }
        if (i17 == 9) {
            m103801x7dc4d59f(baseEventInfo);
            return;
        }
        if (i17 == 10) {
            m103800x2018c558(baseEventInfo);
            return;
        }
        if (i17 == 1001) {
            m103799x1952ea5();
            return;
        }
        if (i17 == 1002) {
            m103798x3be51a90();
            return;
        }
        switch (i17) {
            case 100:
                m103803x62f99da9(baseEventInfo);
                return;
            case 101:
                m103802x36563dba(baseEventInfo);
                return;
            case 102:
                m103804x19c36a10(baseEventInfo);
                return;
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26535x3290736e, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.InterfaceC26533xdd191086
    /* renamed from: reset */
    public void mo103767x6761d4f() {
        super.mo103767x6761d4f();
        m103792xb10ff516();
    }
}
