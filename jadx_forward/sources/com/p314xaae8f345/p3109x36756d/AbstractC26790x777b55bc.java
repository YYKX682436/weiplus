package com.p314xaae8f345.p3109x36756d;

/* renamed from: com.tencent.trtc.TXChorusMusicPlayer */
/* loaded from: classes10.dex */
public abstract class AbstractC26790x777b55bc {

    /* renamed from: com.tencent.trtc.TXChorusMusicPlayer$ITXChorusPlayerListener */
    /* loaded from: classes10.dex */
    public interface ITXChorusPlayerListener {
        /* renamed from: onChorusError */
        void mo10555x704000a3(com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusError tXChorusError, java.lang.String str);

        /* renamed from: onChorusMusicLoadProgress */
        void mo10556x4751f613(java.lang.String str, float f17);

        /* renamed from: onChorusMusicLoadSucceed */
        void mo10557x94eef59c(java.lang.String str, java.util.List<com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXLyricLine> list, java.util.List<com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXReferencePitch> list2);

        /* renamed from: onChorusPaused */
        void mo10558xa9973df3();

        /* renamed from: onChorusRequireLoadMusic */
        void mo10559x9a2f6b7f(java.lang.String str);

        /* renamed from: onChorusResumed */
        void mo10560xf9d531b2();

        /* renamed from: onChorusStarted */
        void mo10561x4755345c();

        /* renamed from: onChorusStopped */
        void mo10562x481985a8();

        /* renamed from: onMusicProgressUpdated */
        void mo10563x7c731168(long j17, long j18);

        /* renamed from: onNetworkQualityUpdated */
        void mo10564xc26b1beb(int i17, int i18, int i19);

        /* renamed from: onVoicePitchUpdated */
        void mo10565xe21d538e(int i17, boolean z17, long j17);

        /* renamed from: onVoiceScoreUpdated */
        void mo10566x2ec5d7fc(int i17, int i18, int i19);

        /* renamed from: shouldDecryptAudioData */
        void mo10567x5283ed66(java.nio.ByteBuffer byteBuffer);
    }

    /* renamed from: com.tencent.trtc.TXChorusMusicPlayer$TXChorusCopyrightedMusicParams */
    /* loaded from: classes10.dex */
    public static class TXChorusCopyrightedMusicParams {

        /* renamed from: musicId */
        public java.lang.String f57231x54340220 = null;

        /* renamed from: playToken */
        public java.lang.String f57232x8f7a1f25 = null;

        /* renamed from: copyrightedLicenseKey */
        public java.lang.String f57229xf4789da4 = null;

        /* renamed from: copyrightedLicenseUrl */
        public java.lang.String f57230xf478c4b4 = null;
    }

    /* renamed from: com.tencent.trtc.TXChorusMusicPlayer$TXChorusError */
    /* loaded from: classes10.dex */
    public enum TXChorusError {
        TXChorusErrorInvalidParameters,
        TXChorusErrorTrtcCloudNotFound,
        TXChorusErrorRestrictedToLeadSinger,
        TXChorusErrorMusicPreloadRequired,
        TXChorusErrorMusicLoadFailed,
        TXChorusErrorMusicDecodeFailed,
        TXChorusErrorEnterRoomFailed,
        TXChorusErrorRoomDisconnected,
        TXChorusErrorTrtcError
    }

    /* renamed from: com.tencent.trtc.TXChorusMusicPlayer$TXChorusExternalMusicParams */
    /* loaded from: classes10.dex */
    public static class TXChorusExternalMusicParams {

        /* renamed from: musicId */
        public java.lang.String f57246x54340220 = null;

        /* renamed from: musicUrl */
        public java.lang.String f57247x324c710a = null;

        /* renamed from: accompanyUrl */
        public java.lang.String f57243x4c3a2d54 = null;

        /* renamed from: isEncrypted */
        public boolean f57245xa66d7bba = false;

        /* renamed from: encryptBlockLength */
        public int f57244x98b0022e = 0;
    }

    /* renamed from: com.tencent.trtc.TXChorusMusicPlayer$TXChorusLyricCharacter */
    /* loaded from: classes10.dex */
    public static class TXChorusLyricCharacter {

        /* renamed from: startTimeMs */
        public long f57249x91dc3c55 = 0;

        /* renamed from: durationMs */
        public long f57248x4967425a = 0;

        /* renamed from: utf8Character */
        public java.lang.String f57250x163ebab8 = null;
    }

    /* renamed from: com.tencent.trtc.TXChorusMusicPlayer$TXChorusMusicTrack */
    /* loaded from: classes10.dex */
    public enum TXChorusMusicTrack {
        TXChorusAccompaniment,
        TXChorusOriginalSong
    }

    /* renamed from: com.tencent.trtc.TXChorusMusicPlayer$TXChorusRole */
    /* loaded from: classes10.dex */
    public enum TXChorusRole {
        TXChorusRoleLeadSinger,
        TXChorusRoleBackSinger,
        TXChorusRoleAnchor,
        TXChorusRoleAudience
    }

    /* renamed from: com.tencent.trtc.TXChorusMusicPlayer$TXLyricLine */
    /* loaded from: classes10.dex */
    public static class TXLyricLine {

        /* renamed from: startTimeMs */
        public long f57261x91dc3c55 = 0;

        /* renamed from: durationMs */
        public long f57260x4967425a = 0;

        /* renamed from: characterArray */
        public java.util.List<com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusLyricCharacter> f57259x13a158b0 = null;
    }

    /* renamed from: com.tencent.trtc.TXChorusMusicPlayer$TXReferencePitch */
    /* loaded from: classes10.dex */
    public static class TXReferencePitch {

        /* renamed from: startTimeMs */
        public long f57264x91dc3c55 = 0;

        /* renamed from: durationMs */
        public long f57262x4967425a = 0;

        /* renamed from: referencePitch */
        public int f57263x8de86ab5 = 0;
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc m105627xaf65a0fc(com.p314xaae8f345.p3109x36756d.AbstractC26786xbe57dcc8 abstractC26786xbe57dcc8, java.lang.String str, com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener iTXChorusPlayerListener) {
        return com.p314xaae8f345.p373xbe494963.p396x36756d.C3807xfa44edfc.m30429xaf65a0fc(abstractC26786xbe57dcc8, str, iTXChorusPlayerListener);
    }

    /* renamed from: callExperimentalAPI */
    public abstract void mo30448xd33a8dd4(java.lang.String str);

    /* renamed from: destroy */
    public abstract void mo30449x5cd39ffa();

    /* renamed from: loadExternalMusic */
    public abstract void mo30451x4b1651d4(com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusExternalMusicParams tXChorusExternalMusicParams);

    /* renamed from: loadMusic */
    public abstract void mo30452x51d658df(com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusCopyrightedMusicParams tXChorusCopyrightedMusicParams);

    /* renamed from: pause */
    public abstract void mo30453x65825f6();

    /* renamed from: resume */
    public abstract void mo30454xc84dc82d();

    /* renamed from: seek */
    public abstract void mo30455x35ce78(long j17);

    /* renamed from: setChorusRole */
    public abstract void mo30456x37e4393e(com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole tXChorusRole, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams tRTCParams);

    /* renamed from: setListener */
    public abstract void mo30457xc6cf6336(com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.ITXChorusPlayerListener iTXChorusPlayerListener);

    /* renamed from: setMusicPitch */
    public abstract void mo30458xed0efa1d(float f17);

    /* renamed from: setPlayoutVolume */
    public abstract void mo30459x1ed14212(int i17);

    /* renamed from: setPublishVolume */
    public abstract void mo30460xcd124bc7(int i17);

    /* renamed from: start */
    public abstract void mo30461x68ac462();

    /* renamed from: stop */
    public abstract void mo30462x360802();

    /* renamed from: switchMusicTrack */
    public abstract void mo30463x8f2f447a(com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusMusicTrack tXChorusMusicTrack);
}
