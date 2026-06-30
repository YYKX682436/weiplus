package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2900x5a71016;

/* renamed from: com.tencent.qqmusic.mediaplayer.codec.BaseDecoder */
/* loaded from: classes13.dex */
public abstract class AbstractC25371x4886c813 {

    /* renamed from: mNativeApeDecoderRef */
    public int f45828x38933be1 = 0;

    /* renamed from: mAudioType */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType f45826x85ef0e43 = null;

    /* renamed from: mHasLoadSoSuccess */
    private final boolean f45827x592399d4 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.m93810x14104adb(mo93992xa743473b());

    /* renamed from: throwIfSoNotLoadSuccess */
    private void m93983xc270a5a9() {
        if (!this.f45827x592399d4) {
            throw new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25348x546f251f("has't load so success , can't call native funcation");
        }
    }

    /* renamed from: decodeData */
    public int mo93984xb7ec4eb8(int i17, byte[] bArr) {
        m93983xc270a5a9();
        return -1;
    }

    /* renamed from: getAudioInformation */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 mo93985x6e8c46ec() {
        m93983xc270a5a9();
        return null;
    }

    /* renamed from: getAudioType */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType m93986xaa5357a() {
        return this.f45826x85ef0e43;
    }

    /* renamed from: getBytePositionOfTime */
    public abstract long mo93987x775e74eb(long j17);

    /* renamed from: getCurrentTime */
    public long mo93988xfdac66b0() {
        m93983xc270a5a9();
        return -1L;
    }

    /* renamed from: getDuration */
    public long mo93989x51e8b0a() {
        return -1L;
    }

    /* renamed from: getErrorCodeMask */
    public int mo93990x5470d4eb() {
        return -1;
    }

    /* renamed from: getMinBufferSize */
    public long mo93991x55bbc89d() {
        return 0L;
    }

    /* renamed from: getNativeLibs */
    public abstract java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65> mo93992xa743473b();

    /* renamed from: init */
    public int mo93995x316510(java.lang.String str, boolean z17) {
        m93983xc270a5a9();
        return -1;
    }

    /* renamed from: release */
    public int mo93996x41012807() {
        m93983xc270a5a9();
        return -1;
    }

    /* renamed from: seekTo */
    public int mo93997xc9fc1b13(int i17) {
        m93983xc270a5a9();
        return -1;
    }

    /* renamed from: setAudioTrack */
    public void mo93998x78226117(android.media.AudioTrack audioTrack) {
    }

    /* renamed from: setAudioType */
    public void m93999x66f8f5ee(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType audioType) {
        this.f45826x85ef0e43 = audioType;
    }

    /* renamed from: init */
    public int mo93993x316510(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e) {
        m93983xc270a5a9();
        return -1;
    }

    /* renamed from: init */
    public int mo93994x316510(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25441x92a45 interfaceC25441x92a45) {
        m93983xc270a5a9();
        return -1;
    }
}
