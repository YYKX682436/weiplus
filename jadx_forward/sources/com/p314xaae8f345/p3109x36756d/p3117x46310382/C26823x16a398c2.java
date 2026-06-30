package com.p314xaae8f345.p3109x36756d.p3117x46310382;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::extensions")
/* renamed from: com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMediaImpl */
/* loaded from: classes16.dex */
public class C26823x16a398c2 extends com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382 {

    /* renamed from: mNativeTXCopyrightedMediaImpl */
    private long f57533x41a20ca6;

    /* renamed from: com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMediaImpl$TXSongScoreImpl */
    /* loaded from: classes16.dex */
    public class TXSongScoreImpl implements com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXSongScore {

        /* renamed from: mNativeTXCopyrightedSongScore */
        private long f57534xd6e396ff;

        public TXSongScoreImpl(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            this.f57534xd6e396ff = 0L;
            this.f57534xd6e396ff = com.p314xaae8f345.p3109x36756d.p3117x46310382.C26823x16a398c2.m105947xadfe6fca(com.p314xaae8f345.p3109x36756d.p3117x46310382.C26823x16a398c2.this.f57533x41a20ca6, this, str, i17, i18, str2, str3, str4);
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXSongScore
        /* renamed from: calculateTotalScore */
        public int mo105916x888a35b4() {
            return com.p314xaae8f345.p3109x36756d.p3117x46310382.C26823x16a398c2.m105943x1943f01d(this.f57534xd6e396ff);
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXSongScore
        /* renamed from: destroy */
        public void mo105917x5cd39ffa() {
            com.p314xaae8f345.p3109x36756d.p3117x46310382.C26823x16a398c2.m105949x39749dda(this.f57534xd6e396ff);
            this.f57534xd6e396ff = 0L;
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXSongScore
        /* renamed from: finish */
        public void mo105918xb4098c93() {
            com.p314xaae8f345.p3109x36756d.p3117x46310382.C26823x16a398c2.m105950x78641b8a(this.f57534xd6e396ff);
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXSongScore
        /* renamed from: getAllGrove */
        public com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.TXSongScoreNoteItem[] mo105919xe5b6a6e8() {
            return com.p314xaae8f345.p3109x36756d.p3117x46310382.C26823x16a398c2.m105952xbf41da51(this.f57534xd6e396ff);
        }

        /* renamed from: onMIDIGroveAndHint */
        public void m105965x3e19e48b(java.lang.String str, boolean z17, float f17, float f18, int i17, java.lang.Object obj) {
            ((com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXSongScoreCallback) obj).m105924x3e19e48b(str, z17, f17, f18, i17);
        }

        /* renamed from: onMIDISCoreUpdate */
        public void m105966x1993207b(java.lang.String str, int i17, int i18, int i19, java.lang.Object obj) {
            ((com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXSongScoreCallback) obj).m105925x1993207b(str, i17, i18, i19);
        }

        /* renamed from: onMIDIScoreError */
        public void m105967xb1cb0c36(java.lang.String str, int i17, java.lang.String str2, java.lang.Object obj) {
            ((com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXSongScoreCallback) obj).m105926xb1cb0c36(str, i17, str2);
        }

        /* renamed from: onMIDIScoreFinish */
        public void m105968x88ca9825(java.lang.String str, int[] iArr, int i17, java.lang.Object obj) {
            ((com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXSongScoreCallback) obj).m105927x88ca9825(str, iArr, i17);
        }

        /* renamed from: onMIDIScorePrepared */
        public void m105969x5c68034f(java.lang.String str, java.lang.Object obj) {
            ((com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXSongScoreCallback) obj).m105928x5c68034f(str);
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXSongScore
        /* renamed from: prepare */
        public void mo105920xed060d07() {
            com.p314xaae8f345.p3109x36756d.p3117x46310382.C26823x16a398c2.m105955xb3fd5cf0(this.f57534xd6e396ff);
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXSongScore
        /* renamed from: process */
        public void mo105921xed8d1e6f(byte[] bArr, int i17, float f17) {
            com.p314xaae8f345.p3109x36756d.p3117x46310382.C26823x16a398c2.m105956xb4846e58(this.f57534xd6e396ff, bArr, i17, f17);
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXSongScore
        /* renamed from: setKeyShift */
        public void mo105922x93c29fe5(int i17) {
            com.p314xaae8f345.p3109x36756d.p3117x46310382.C26823x16a398c2.m105957x6d4dd34e(this.f57534xd6e396ff, i17);
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXSongScore
        /* renamed from: setSongScoreCallback */
        public void mo105923xd47e89a0(com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXSongScoreCallback iTXSongScoreCallback) {
            com.p314xaae8f345.p3109x36756d.p3117x46310382.C26823x16a398c2.m105961x5afc1c57(this.f57534xd6e396ff, iTXSongScoreCallback);
        }
    }

    public C26823x16a398c2() {
        this.f57533x41a20ca6 = 0L;
        this.f57533x41a20ca6 = m105946xef030f11(this);
    }

    /* renamed from: createSongScoreNoteItem */
    public static java.lang.Object m105942xd1e6226(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.TXSongScoreNoteItem tXSongScoreNoteItem = new com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.TXSongScoreNoteItem();
        tXSongScoreNoteItem.f57532x81158a4f = i17;
        tXSongScoreNoteItem.f57529x89444d94 = i18;
        tXSongScoreNoteItem.f57531xb2b5efb9 = i19;
        tXSongScoreNoteItem.f57530xa0336a48 = i27;
        return tXSongScoreNoteItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeCalculateTotalScore */
    public static native int m105943x1943f01d(long j17);

    /* renamed from: nativeCancelPreloadMusic */
    private static native void m105944x40a25dad(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: nativeClearMusicCache */
    private static native void m105945x92860d73(long j17);

    /* renamed from: nativeCreateCopyRightedMedia */
    private static native long m105946xef030f11(com.p314xaae8f345.p3109x36756d.p3117x46310382.C26823x16a398c2 c26823x16a398c2);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeCreateSongScore */
    public static native long m105947xadfe6fca(long j17, com.p314xaae8f345.p3109x36756d.p3117x46310382.C26823x16a398c2.TXSongScoreImpl tXSongScoreImpl, java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    /* renamed from: nativeDestroyCopyRightedMedia */
    private static native void m105948xa6efef01(com.p314xaae8f345.p3109x36756d.p3117x46310382.C26823x16a398c2 c26823x16a398c2, long j17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeDestroySongScore */
    public static native void m105949x39749dda(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeFinish */
    public static native void m105950x78641b8a(long j17);

    /* renamed from: nativeGenMusicURI */
    private static native java.lang.String m105951xe1743e0(long j17, java.lang.String str, int i17, java.lang.String str2);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeGetAllGrove */
    public static native com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.TXSongScoreNoteItem[] m105952xbf41da51(long j17);

    /* renamed from: nativeIsMusicPreloaded */
    private static native boolean m105953x27ba75c4(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: nativePreloadMusic */
    private static native void m105954xb63b2753(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativePrepare */
    public static native void m105955xb3fd5cf0(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeProcess */
    public static native void m105956xb4846e58(long j17, byte[] bArr, int i17, float f17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeSetKeyShift */
    public static native void m105957x6d4dd34e(long j17, int i17);

    /* renamed from: nativeSetLicense */
    private static native void m105958xa12b48f6(long j17, android.content.Context context, java.lang.String str, java.lang.String str2);

    /* renamed from: nativeSetMusicCacheMaxCount */
    private static native void m105959xce48b9b3(long j17, int i17);

    /* renamed from: nativeSetMusicPreloadCallback */
    private static native void m105960x39df3df4(long j17, java.lang.Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeSetSongScoreCallback */
    public static native void m105961x5afc1c57(long j17, java.lang.Object obj);

    @Override // com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382
    /* renamed from: cancelPreloadMusic */
    public void mo105902x65418936(java.lang.String str, java.lang.String str2) {
        m105944x40a25dad(this.f57533x41a20ca6, str, str2);
    }

    @Override // com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382
    /* renamed from: clearMusicCache */
    public void mo105903xa204b68a() {
        m105945x92860d73(this.f57533x41a20ca6);
    }

    @Override // com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382
    /* renamed from: createSongScore */
    public com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXSongScore mo105904xbd7d18e1(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return new com.p314xaae8f345.p3109x36756d.p3117x46310382.C26823x16a398c2.TXSongScoreImpl(str, i17, i18, str2, str3, str4);
    }

    @Override // com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382
    /* renamed from: destroy */
    public void mo105905x5cd39ffa() {
        m105948xa6efef01(this, this.f57533x41a20ca6);
        this.f57533x41a20ca6 = 0L;
    }

    @Override // com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382
    /* renamed from: genMusicURI */
    public java.lang.String mo105906x348c1077(java.lang.String str, int i17, java.lang.String str2) {
        return m105951xe1743e0(this.f57533x41a20ca6, str, i17, str2);
    }

    @Override // com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382
    /* renamed from: init */
    public void mo105907x316510() {
    }

    @Override // com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382
    /* renamed from: isMusicPreloaded */
    public boolean mo105908x810ef8d(java.lang.String str, java.lang.String str2) {
        return m105953x27ba75c4(this.f57533x41a20ca6, str, str2);
    }

    /* renamed from: onPreloadComplete */
    public void m105962xd2253a83(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.Object obj) {
        ((com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXMusicPreloadCallback) obj).m105913xd2253a83(str, str2, i17, str3);
    }

    /* renamed from: onPreloadProgress */
    public void m105963xba34cb77(java.lang.String str, java.lang.String str2, float f17, java.lang.Object obj) {
        ((com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXMusicPreloadCallback) obj).m105914xba34cb77(str, str2, f17);
    }

    /* renamed from: onPreloadStart */
    public void m105964xd3f64f58(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        ((com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXMusicPreloadCallback) obj).m105915xd3f64f58(str, str2);
    }

    @Override // com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382
    /* renamed from: preloadMusic */
    public void mo105909x5e5fed9c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        m105954xb63b2753(this.f57533x41a20ca6, str, str2, str3);
    }

    @Override // com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382
    /* renamed from: setLicense */
    public void mo105910xbb2f0d7f(android.content.Context context, java.lang.String str, java.lang.String str2) {
        m105958xa12b48f6(this.f57533x41a20ca6, context, str, str2);
    }

    @Override // com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382
    /* renamed from: setMusicCacheMaxCount */
    public void mo105911x8513f58a(int i17) {
        m105959xce48b9b3(this.f57533x41a20ca6, i17);
    }

    @Override // com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382
    /* renamed from: setMusicPreloadCallback */
    public void mo105912x6acae00b(com.p314xaae8f345.p3109x36756d.p3117x46310382.AbstractC26822x6aba5382.ITXMusicPreloadCallback iTXMusicPreloadCallback) {
        m105960x39df3df4(this.f57533x41a20ca6, iTXMusicPreloadCallback);
    }
}
