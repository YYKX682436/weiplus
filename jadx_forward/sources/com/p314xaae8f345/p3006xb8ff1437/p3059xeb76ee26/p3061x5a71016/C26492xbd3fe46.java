package com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016;

/* renamed from: com.tencent.thumbplayer.tmediacodec.codec.DirectCodecWrapper */
/* loaded from: classes14.dex */
public final class C26492xbd3fe46 implements com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd {
    public static final java.lang.String TAG = "DirectCodecWrapper";

    /* renamed from: sCodecNum */
    private static java.util.concurrent.atomic.AtomicInteger f54079x6ae26523 = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: mCodec */
    private final android.media.MediaCodec f54080xbde45ba9;

    public C26492xbd3fe46(android.media.MediaCodec mediaCodec) {
        this.f54080xbde45ba9 = mediaCodec;
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.i(TAG, "DirectCodecWrapper sCodecNum:" + f54079x6ae26523.incrementAndGet());
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: attachThread */
    public void mo103363x800860af() {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: canReuseType */
    public com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType mo103364xccd939de(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c c26493xe13fc07c) {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(TAG, "setCanReuseType setCodecCallback ignore...");
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType.KEEP_CODEC_RESULT_NO;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: configure */
    public void mo103366xd00d62e6(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17) {
        this.f54080xbde45ba9.configure(mediaFormat, surface, mediaCrypto, i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: dequeueInputBuffer */
    public int mo103367x9a572d5a(long j17) {
        return this.f54080xbde45ba9.dequeueInputBuffer(j17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: dequeueOutputBuffer */
    public int mo103368x436dd5f1(android.media.MediaCodec.BufferInfo bufferInfo, long j17) {
        return this.f54080xbde45ba9.dequeueOutputBuffer(bufferInfo, j17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: flush */
    public void mo103369x5d03b04() {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.i(TAG, "DirectCodecWrapper flush start ...");
        this.f54080xbde45ba9.flush();
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.i(TAG, "DirectCodecWrapper flush end ...");
    }

    /* renamed from: getCodec */
    public final android.media.MediaCodec m103382x7444b660() {
        return this.f54080xbde45ba9;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: getMediaCodec */
    public android.media.MediaCodec mo103370x6053b688() {
        return this.f54080xbde45ba9;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: prepareToReUse */
    public void mo103371xe451a992() {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(TAG, "DirectCodecWrapper prepareToReUse ignore...");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: queueInputBuffer */
    public void mo103372xfe5642d9(int i17, int i18, int i19, long j17, int i27) {
        this.f54080xbde45ba9.queueInputBuffer(i17, i18, i19, j17, i27);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: release */
    public void mo103373x41012807() {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.i(TAG, "DirectCodecWrapper release start ...");
        this.f54080xbde45ba9.release();
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.i(TAG, "DirectCodecWrapper release end ... sCodecNum:" + f54079x6ae26523.decrementAndGet());
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: releaseOutputBuffer */
    public void mo103375xab26be48(int i17, boolean z17) {
        this.f54080xbde45ba9.releaseOutputBuffer(i17, z17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: reset */
    public void mo103376x6761d4f() {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.i(TAG, "DirectCodecWrapper reset start ...");
        this.f54080xbde45ba9.reset();
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.i(TAG, "DirectCodecWrapper reset end ...");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: setCodecCallback */
    public void mo103377xbd454139(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3060xf5bc2045.InterfaceC26486x9cae4e5b interfaceC26486x9cae4e5b) {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(TAG, "DirectCodecWrapper setCodecCallback ignore...");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: setOutputSurface */
    public void mo103378x610a9b2a(android.view.Surface surface) {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.i(TAG, "DirectCodecWrapper setOutputSurface start, surface:" + surface);
        this.f54080xbde45ba9.setOutputSurface(surface);
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.i(TAG, "DirectCodecWrapper setOutputSurface end ...");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: start */
    public void mo103379x68ac462() {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.i(TAG, "DirectCodecWrapper start ...");
        this.f54080xbde45ba9.start();
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.i(TAG, "DirectCodecWrapper start end...");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: stop */
    public void mo103380x360802() {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.i(TAG, "DirectCodecWrapper stop before ...");
        this.f54080xbde45ba9.stop();
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.i(TAG, "DirectCodecWrapper stop end ...");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: configure */
    public void mo103365xd00d62e6(android.media.MediaFormat mediaFormat, android.view.Surface surface, int i17, android.media.MediaDescrambler mediaDescrambler) {
        this.f54080xbde45ba9.configure(mediaFormat, surface, i17, mediaDescrambler);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.InterfaceC26491x6cbe3bbd
    /* renamed from: releaseOutputBuffer */
    public void mo103374xab26be48(int i17, long j17) {
        this.f54080xbde45ba9.releaseOutputBuffer(i17, j17);
    }
}
