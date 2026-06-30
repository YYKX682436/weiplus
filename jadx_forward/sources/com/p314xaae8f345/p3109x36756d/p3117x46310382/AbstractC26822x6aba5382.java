package com.p314xaae8f345.p3109x36756d.p3117x46310382;

/* renamed from: com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia */
/* loaded from: classes16.dex */
public abstract class AbstractC26822x6aba5382 {

    /* renamed from: impl */
    public static com.p314xaae8f345.p3109x36756d.p3117x46310382.C26823x16a398c2 f57512x316220 = new com.p314xaae8f345.p3109x36756d.p3117x46310382.C26823x16a398c2();

    /* renamed from: com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia$ITXMusicPreloadCallback */
    /* loaded from: classes16.dex */
    public interface ITXMusicPreloadCallback {
        /* renamed from: onPreloadComplete */
        void m105913xd2253a83(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3);

        /* renamed from: onPreloadProgress */
        void m105914xba34cb77(java.lang.String str, java.lang.String str2, float f17);

        /* renamed from: onPreloadStart */
        void m105915xd3f64f58(java.lang.String str, java.lang.String str2);
    }

    /* renamed from: com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia$ITXSongScore */
    /* loaded from: classes16.dex */
    public interface ITXSongScore {
        /* renamed from: calculateTotalScore */
        int mo105916x888a35b4();

        /* renamed from: destroy */
        void mo105917x5cd39ffa();

        /* renamed from: finish */
        void mo105918xb4098c93();

        /* renamed from: getAllGrove */
        com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.TXSongScoreNoteItem[] mo105919xe5b6a6e8();

        /* renamed from: prepare */
        void mo105920xed060d07();

        /* renamed from: process */
        void mo105921xed8d1e6f(byte[] bArr, int i17, float f17);

        /* renamed from: setKeyShift */
        void mo105922x93c29fe5(int i17);

        /* renamed from: setSongScoreCallback */
        void mo105923xd47e89a0(com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXSongScoreCallback iTXSongScoreCallback);
    }

    /* renamed from: com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia$ITXSongScoreCallback */
    /* loaded from: classes16.dex */
    public interface ITXSongScoreCallback {
        /* renamed from: onMIDIGroveAndHint */
        void m105924x3e19e48b(java.lang.String str, boolean z17, float f17, float f18, int i17);

        /* renamed from: onMIDISCoreUpdate */
        void m105925x1993207b(java.lang.String str, int i17, int i18, int i19);

        /* renamed from: onMIDIScoreError */
        void m105926xb1cb0c36(java.lang.String str, int i17, java.lang.String str2);

        /* renamed from: onMIDIScoreFinish */
        void m105927x88ca9825(java.lang.String str, int[] iArr, int i17);

        /* renamed from: onMIDIScorePrepared */
        void m105928x5c68034f(java.lang.String str);
    }

    /* renamed from: com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia$TXCopyrightedError */
    /* loaded from: classes6.dex */
    public static class TXCopyrightedError {

        /* renamed from: ERR_ACCOMPANIMENT_NOT_EXIST */
        public static int f57513x2874ae5b = -7;

        /* renamed from: ERR_CANCEL */
        public static int f57514xb3548ab4 = -1;

        /* renamed from: ERR_INNER_ERROR */
        public static int f57515x7a033ea5 = -4;

        /* renamed from: ERR_LICENSE_FAILED */
        public static int f57516x3e12cc55 = -5;

        /* renamed from: ERR_LYRIC_NOT_EXIST */
        public static int f57517x981fcf51 = -9;

        /* renamed from: ERR_MIDI_NOT_EXIST */
        public static int f57518xc28ee0e7 = -10;

        /* renamed from: ERR_MUSIC_IS_DOWNLOADING */
        public static int f57519x5646b6d9 = -6;

        /* renamed from: ERR_NET_FAILED */
        public static int f57520x95d35c79 = -3;

        /* renamed from: ERR_NONE */
        public static int f57521x82bcd5f2 = 0;

        /* renamed from: ERR_NOT_PREPARE */
        public static int f57522xdd40b761 = -12;

        /* renamed from: ERR_ORIGIN_NOT_EXIST */
        public static int f57523x9b62402c = -8;

        /* renamed from: ERR_PREPARE_FAILED */
        public static int f57524xa15cf8cf = -11;

        /* renamed from: ERR_TOKEN_OVERDUE */
        public static int f57525x54dcf6a0 = -2;
    }

    /* renamed from: com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia$TXSongScoreNoteItem */
    /* loaded from: classes16.dex */
    public static class TXSongScoreNoteItem {

        /* renamed from: INVALID_GROVE_VALUE */
        public static final int f57526x4efaea1d = -1;

        /* renamed from: MAX_GROVE_VALUE */
        public static final int f57527x5301da0a = 100;

        /* renamed from: MAX_VOICE_PITCH_VALUE */
        public static final int f57528x633ff58a = 90;

        /* renamed from: duration */
        public int f57529x89444d94;

        /* renamed from: endTime */
        public int f57530xa0336a48;

        /* renamed from: noteHeight */
        public int f57531xb2b5efb9;

        /* renamed from: startTime */
        public int f57532x81158a4f;

        /* renamed from: getEndTime */
        public int m105929xde00a612() {
            return this.f57532x81158a4f + this.f57529x89444d94;
        }

        /* renamed from: isSame */
        public boolean m105930xb9a89cb0(int i17) {
            return java.lang.Math.abs(this.f57531xb2b5efb9 - i17) < 11 && this.f57531xb2b5efb9 > 0 && i17 > 0;
        }

        /* renamed from: toString */
        public java.lang.String m105931x9616526c() {
            return java.lang.String.format("startTime = %d ; endTime = %d ; duration = %d ; height = %d;", java.lang.Integer.valueOf(this.f57532x81158a4f), java.lang.Integer.valueOf(this.f57530xa0336a48), java.lang.Integer.valueOf(this.f57529x89444d94), java.lang.Integer.valueOf(this.f57531xb2b5efb9));
        }
    }

    /* renamed from: instance */
    public static com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382 m105901x21169495() {
        return f57512x316220;
    }

    /* renamed from: cancelPreloadMusic */
    public abstract void mo105902x65418936(java.lang.String str, java.lang.String str2);

    /* renamed from: clearMusicCache */
    public abstract void mo105903xa204b68a();

    /* renamed from: createSongScore */
    public abstract com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXSongScore mo105904xbd7d18e1(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    /* renamed from: destroy */
    public abstract void mo105905x5cd39ffa();

    /* renamed from: genMusicURI */
    public abstract java.lang.String mo105906x348c1077(java.lang.String str, int i17, java.lang.String str2);

    /* renamed from: init */
    public abstract void mo105907x316510();

    /* renamed from: isMusicPreloaded */
    public abstract boolean mo105908x810ef8d(java.lang.String str, java.lang.String str2);

    /* renamed from: preloadMusic */
    public abstract void mo105909x5e5fed9c(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: setLicense */
    public abstract void mo105910xbb2f0d7f(android.content.Context context, java.lang.String str, java.lang.String str2);

    /* renamed from: setMusicCacheMaxCount */
    public abstract void mo105911x8513f58a(int i17);

    /* renamed from: setMusicPreloadCallback */
    public abstract void mo105912x6acae00b(com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXMusicPreloadCallback iTXMusicPreloadCallback);
}
