package com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a;

/* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo */
/* loaded from: classes16.dex */
public class C26474x564c866b {

    /* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo$BaseEventInfo */
    /* loaded from: classes16.dex */
    public static class BaseEventInfo {

        /* renamed from: mEventTimeSinceBootMs */
        private long f53948x6b4a1918 = android.os.SystemClock.elapsedRealtime();

        /* renamed from: mEventTimeSince1970Ms */
        private long f53947x4b344d47 = java.lang.System.currentTimeMillis();

        /* renamed from: mEventId */
        private int f53946x4c0cf028 = -1;

        /* renamed from: getEventId */
        public int m103163xebc1791f() {
            return this.f53946x4c0cf028;
        }

        /* renamed from: getEventTimeSince1970Ms */
        public long m103164x901a4db0() {
            return this.f53947x4b344d47;
        }

        /* renamed from: getEventTimeSinceBootMs */
        public long m103165xb0301981() {
            return this.f53948x6b4a1918;
        }

        /* renamed from: setEventId */
        public void m103166x5f32c693(int i17) {
            this.f53946x4c0cf028 = i17;
        }
    }

    /* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo$BufferingEndEventInfo */
    /* loaded from: classes16.dex */
    public static class BufferingEndEventInfo extends com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo {
        public BufferingEndEventInfo() {
            m103166x5f32c693(112);
        }
    }

    /* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo$BufferingStartEventInfo */
    /* loaded from: classes16.dex */
    public static class BufferingStartEventInfo extends com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo {
        public BufferingStartEventInfo() {
            m103166x5f32c693(111);
        }
    }

    /* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo$DTCdnUrlUpdataEventInfo */
    /* loaded from: classes16.dex */
    public static class DTCdnUrlUpdataEventInfo extends com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo {

        /* renamed from: mCdnIp */
        private java.lang.String f53949xbddf7dc7;

        /* renamed from: mUserIp */
        private java.lang.String f53950x1d97551f;

        public DTCdnUrlUpdataEventInfo() {
            m103166x5f32c693(202);
        }

        /* renamed from: getCdnIp */
        public java.lang.String m103167x743fd87e() {
            return this.f53949xbddf7dc7;
        }

        /* renamed from: getUserIp */
        public java.lang.String m103168x33425148() {
            return this.f53950x1d97551f;
        }

        /* renamed from: setCdnIp */
        public void m103169x52cdf2f2(java.lang.String str) {
            this.f53949xbddf7dc7 = str;
        }

        /* renamed from: setUserIp */
        public void m103170x26778554(java.lang.String str) {
            this.f53950x1d97551f = str;
        }
    }

    /* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo$DTDownloadProgressUpdataEventInfo */
    /* loaded from: classes16.dex */
    public static class DTDownloadProgressUpdataEventInfo extends com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo {

        /* renamed from: mDownloadSpeedKbps */
        private int f53951xa1f311ec;

        public DTDownloadProgressUpdataEventInfo() {
            m103166x5f32c693(201);
        }

        /* renamed from: getDownloadSpeedKbps */
        public int m103171x58461223() {
            return this.f53951xa1f311ec;
        }

        /* renamed from: setDownloadSpeedKbps */
        public void m103172x33dc1e97(int i17) {
            this.f53951xa1f311ec = i17;
        }
    }

    /* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo$DTProtocalUpdateEventInfo */
    /* loaded from: classes16.dex */
    public static class DTProtocalUpdateEventInfo extends com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo {

        /* renamed from: mProtocol */
        private java.lang.String f53952xea083625;

        /* renamed from: mProtocolVer */
        private java.lang.String f53953x91962b3e;

        public DTProtocalUpdateEventInfo() {
            m103166x5f32c693(203);
        }

        /* renamed from: getProtocol */
        public java.lang.String m103173x40e4cc0e() {
            return this.f53952xea083625;
        }

        /* renamed from: getProtocolVer */
        public java.lang.String m103174xc15f60b5() {
            return this.f53953x91962b3e;
        }

        /* renamed from: setProtocol */
        public void m103175x3b9d2d1a(java.lang.String str) {
            this.f53952xea083625 = str;
        }

        /* renamed from: setProtocolVer */
        public void m103176x57c4d429(java.lang.String str) {
            this.f53953x91962b3e = str;
        }
    }

    /* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo$DTReturnConvertedUrlEventInfo */
    /* loaded from: classes16.dex */
    public static class DTReturnConvertedUrlEventInfo extends com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo {
        public DTReturnConvertedUrlEventInfo() {
            m103166x5f32c693(204);
        }
    }

    /* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo$DrmEventInfo */
    /* loaded from: classes16.dex */
    public static class DrmEventInfo extends com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo {

        /* renamed from: mDrmInfo */
        private com.p314xaae8f345.p3006xb8ff1437.api.C26174xf2a580d1 f53954x10b329c0;

        public DrmEventInfo() {
            m103166x5f32c693(116);
        }

        /* renamed from: getDrmInfo */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26174xf2a580d1 m103177xb067b2b7() {
            return this.f53954x10b329c0;
        }

        /* renamed from: setDrmInfo */
        public void m103178x23d9002b(com.p314xaae8f345.p3006xb8ff1437.api.C26174xf2a580d1 c26174xf2a580d1) {
            this.f53954x10b329c0 = c26174xf2a580d1;
        }
    }

    /* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo$PlayErrorEventInfo */
    /* loaded from: classes16.dex */
    public static class PlayErrorEventInfo extends com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo {

        /* renamed from: mDynamicStatisticParams */
        private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 f53955xb2440184;

        /* renamed from: mErrorCode */
        private int f53956x8e53fa28;

        /* renamed from: mErrorType */
        private int f53957x8e5bdb75;

        /* renamed from: mGeneralPlayFlowParams */
        private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 f53958x691ea743;

        public PlayErrorEventInfo() {
            m103166x5f32c693(106);
        }

        /* renamed from: getDynamicStatisticParams */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 m103179x55ab8bad() {
            return this.f53955xb2440184;
        }

        /* renamed from: getErrorCode */
        public int m103180x130a215f() {
            return this.f53956x8e53fa28;
        }

        /* renamed from: getErrorType */
        public int m103181x131202ac() {
            return this.f53957x8e5bdb75;
        }

        /* renamed from: getGeneralPlayFlowParams */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 m103182xc0f8b3fa() {
            return this.f53958x691ea743;
        }

        /* renamed from: setDynamicStatisticParams */
        public void m103183x87ef27b9(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 c26404xfb288653) {
            this.f53955xb2440184 = c26404xfb288653;
        }

        /* renamed from: setErrorCode */
        public void m103184x6f5de1d3(int i17) {
            this.f53956x8e53fa28 = i17;
        }

        /* renamed from: setErrorType */
        public void m103185x6f65c320(int i17) {
            this.f53957x8e5bdb75 = i17;
        }

        /* renamed from: setGeneralPlayFlowParams */
        public void m103186x910b666e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 c26405x843ecc94) {
            this.f53958x691ea743 = c26405x843ecc94;
        }
    }

    /* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo$PlayPauseEventInfo */
    /* loaded from: classes16.dex */
    public static class PlayPauseEventInfo extends com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo {
        public PlayPauseEventInfo() {
            m103166x5f32c693(104);
        }
    }

    /* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo$PlayReleaseEventInfo */
    /* loaded from: classes16.dex */
    public static class PlayReleaseEventInfo extends com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo {
        public PlayReleaseEventInfo() {
            m103166x5f32c693(108);
        }
    }

    /* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo$PlayResetEventInfo */
    /* loaded from: classes16.dex */
    public static class PlayResetEventInfo extends com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo {

        /* renamed from: mDynamicStatisticParams */
        private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 f53959xb2440184;

        /* renamed from: mGeneralPlayFlowParams */
        private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 f53960x691ea743;

        public PlayResetEventInfo() {
            m103166x5f32c693(107);
        }

        /* renamed from: getDynamicStatisticParams */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 m103187x55ab8bad() {
            return this.f53959xb2440184;
        }

        /* renamed from: getGeneralPlayFlowParams */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 m103188xc0f8b3fa() {
            return this.f53960x691ea743;
        }

        /* renamed from: setDynamicStatisticParams */
        public void m103189x87ef27b9(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 c26404xfb288653) {
            this.f53959xb2440184 = c26404xfb288653;
        }

        /* renamed from: setGeneralPlayFlowParams */
        public void m103190x910b666e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 c26405x843ecc94) {
            this.f53960x691ea743 = c26405x843ecc94;
        }
    }

    /* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo$PlayStartEventInfo */
    /* loaded from: classes16.dex */
    public static class PlayStartEventInfo extends com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo {
        public PlayStartEventInfo() {
            m103166x5f32c693(103);
        }
    }

    /* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo$PlayStopEventInfo */
    /* loaded from: classes16.dex */
    public static class PlayStopEventInfo extends com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo {

        /* renamed from: mDynamicStatisticParams */
        private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 f53961xb2440184;

        /* renamed from: mGeneralPlayFlowParams */
        private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 f53962x691ea743;

        public PlayStopEventInfo() {
            m103166x5f32c693(105);
        }

        /* renamed from: getDynamicStatisticParams */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 m103191x55ab8bad() {
            return this.f53961xb2440184;
        }

        /* renamed from: getGeneralPlayFlowParams */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 m103192xc0f8b3fa() {
            return this.f53962x691ea743;
        }

        /* renamed from: setDynamicStatisticParams */
        public void m103193x87ef27b9(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 c26404xfb288653) {
            this.f53961xb2440184 = c26404xfb288653;
        }

        /* renamed from: setGeneralPlayFlowParams */
        public void m103194x910b666e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 c26405x843ecc94) {
            this.f53962x691ea743 = c26405x843ecc94;
        }
    }

    /* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo$PrepareEndEventInfo */
    /* loaded from: classes16.dex */
    public static class PrepareEndEventInfo extends com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo {

        /* renamed from: mDurationMs */
        private long f53963x25993aa7;

        /* renamed from: mPlayerType */
        private int f53964x591e3e08;

        public PrepareEndEventInfo() {
            m103166x5f32c693(102);
        }

        /* renamed from: getDurationMs */
        public long m103195x37a7fa50() {
            return this.f53963x25993aa7;
        }

        /* renamed from: getPlayerType */
        public int m103196x6b2cfdb1() {
            return this.f53964x591e3e08;
        }

        /* renamed from: setDurationMs */
        public void m103197x65cc485c(long j17) {
            this.f53963x25993aa7 = j17;
        }

        /* renamed from: setPlayerType */
        public void m103198x99514bbd(int i17) {
            this.f53964x591e3e08 = i17;
        }
    }

    /* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo$PrepareStartEventInfo */
    /* loaded from: classes16.dex */
    public static class PrepareStartEventInfo extends com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo {

        /* renamed from: mFlowId */
        private java.lang.String f53965x3a09db6 = "";

        public PrepareStartEventInfo() {
            m103166x5f32c693(101);
        }

        /* renamed from: getFlowId */
        public java.lang.String m103199x194b99df() {
            return this.f53965x3a09db6;
        }

        /* renamed from: setFlowId */
        public void m103200xc80cdeb(java.lang.String str) {
            this.f53965x3a09db6 = str;
        }
    }

    /* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo$SeekEndEventInfo */
    /* loaded from: classes16.dex */
    public static class SeekEndEventInfo extends com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo {
        public SeekEndEventInfo() {
            m103166x5f32c693(110);
        }
    }

    /* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo$SeekStartEventInfo */
    /* loaded from: classes16.dex */
    public static class SeekStartEventInfo extends com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo {
        public SeekStartEventInfo() {
            m103166x5f32c693(109);
        }
    }

    /* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo$SelectTrackEndEventInfo */
    /* loaded from: classes16.dex */
    public static class SelectTrackEndEventInfo extends com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo {

        /* renamed from: mErrorCode */
        private int f53966x8e53fa28;

        /* renamed from: mOpaque */
        private long f53967x132e2aee;

        public SelectTrackEndEventInfo() {
            m103166x5f32c693(115);
        }

        /* renamed from: getErrorCode */
        public int m103201x130a215f() {
            return this.f53966x8e53fa28;
        }

        /* renamed from: getOpaque */
        public long m103202x28d92717() {
            return this.f53967x132e2aee;
        }

        /* renamed from: setErrorCode */
        public void m103203x6f5de1d3(int i17) {
            this.f53966x8e53fa28 = i17;
        }

        /* renamed from: setOpaque */
        public void m103204x1c0e5b23(long j17) {
            this.f53967x132e2aee = j17;
        }
    }

    /* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo$SelectTrackStartEventInfo */
    /* loaded from: classes16.dex */
    public static class SelectTrackStartEventInfo extends com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo {

        /* renamed from: mOpaque */
        private long f53968x132e2aee;

        /* renamed from: mTrackIndex */
        private int f53969x201c5694;

        /* renamed from: mTrackInfo */
        private com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d f53970xa63276ac;

        public SelectTrackStartEventInfo() {
            m103166x5f32c693(114);
        }

        /* renamed from: getOpaque */
        public long m103205x28d92717() {
            return this.f53968x132e2aee;
        }

        /* renamed from: getTrackIndex */
        public int m103206x322b163d() {
            return this.f53969x201c5694;
        }

        /* renamed from: getTrackInfo */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d m103207x2ae89de3() {
            return this.f53970xa63276ac;
        }

        /* renamed from: setOpaque */
        public void m103208x1c0e5b23(long j17) {
            this.f53968x132e2aee = j17;
        }

        /* renamed from: setTrackIndex */
        public void m103209x604f6449(int i17) {
            this.f53969x201c5694 = i17;
        }

        /* renamed from: setTrackInfo */
        public void m103210x873c5e57(com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d c26201xd4eb4d7d) {
            this.f53970xa63276ac = c26201xd4eb4d7d;
        }
    }

    /* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo$SetDataSourceEventInfo */
    /* loaded from: classes16.dex */
    public static class SetDataSourceEventInfo extends com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo {

        /* renamed from: mIsUseProxy */
        private boolean f53971x9b3610be;

        /* renamed from: mUrl */
        private java.lang.String f53972x32d9c2;

        /* renamed from: mUrlProtocol */
        private int f53973xd50aea7a;

        public SetDataSourceEventInfo() {
            m103166x5f32c693(117);
        }

        /* renamed from: getUrl */
        public java.lang.String m103211xb5887639() {
            return this.f53972x32d9c2;
        }

        /* renamed from: getUrlProtocol */
        public int m103212x4d41ff1() {
            return this.f53973xd50aea7a;
        }

        /* renamed from: isIsUseProxy */
        public boolean m103213x406f153b() {
            return this.f53971x9b3610be;
        }

        /* renamed from: setIsUseProxy */
        public void m103214xdb691e73(boolean z17) {
            this.f53971x9b3610be = z17;
        }

        /* renamed from: setUrl */
        public void m103215xca029dad(java.lang.String str) {
            this.f53972x32d9c2 = str;
        }

        /* renamed from: setUrlProtocol */
        public void m103216x9b399365(int i17) {
            this.f53973xd50aea7a = i17;
        }
    }

    /* renamed from: com.tencent.thumbplayer.event.TPPlayerEventInfo$SetPlaySpeedEventInfo */
    /* loaded from: classes16.dex */
    public static class SetPlaySpeedEventInfo extends com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo {

        /* renamed from: mPlaySpeedRatio */
        private float f53974x5d2c7425;

        public SetPlaySpeedEventInfo() {
            m103166x5f32c693(113);
        }

        /* renamed from: getPlaySpeedRatio */
        public float m103217x4511374e() {
            return this.f53974x5d2c7425;
        }

        /* renamed from: setPlaySpeedRatio */
        public void m103218xd079f5a(float f17) {
            this.f53974x5d2c7425 = f17;
        }
    }

    private C26474x564c866b() {
    }
}
