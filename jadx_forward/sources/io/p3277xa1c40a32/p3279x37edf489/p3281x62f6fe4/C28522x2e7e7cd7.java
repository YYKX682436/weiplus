package io.p3277xa1c40a32.p3279x37edf489.p3281x62f6fe4;

/* renamed from: io.clipworks.androidplus.media.WrappedMediaCodec */
/* loaded from: classes14.dex */
public class C28522x2e7e7cd7 {
    private static final java.lang.String TAG = "WrappedMediaCodec";

    /* renamed from: kHandlerThreadIndexCounter */
    private static final java.util.concurrent.atomic.AtomicInteger f70370x77e7eab3 = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: _backingMediaCodec */
    private final android.media.MediaCodec f70371x65f7d40e;

    /* renamed from: _handlerThread */
    private android.os.HandlerThread f70372xb44f03f5;

    private C28522x2e7e7cd7(android.media.MediaCodec mediaCodec) {
        this.f70371x65f7d40e = mediaCodec;
    }

    /* renamed from: createByCodecName */
    public static io.p3277xa1c40a32.p3279x37edf489.p3281x62f6fe4.C28522x2e7e7cd7 m136856xd7cdda8e(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            return new io.p3277xa1c40a32.p3279x37edf489.p3281x62f6fe4.C28522x2e7e7cd7(android.media.MediaCodec.createByCodecName(str));
        } catch (java.io.IOException | java.lang.IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: createDecoderByType */
    public static io.p3277xa1c40a32.p3279x37edf489.p3281x62f6fe4.C28522x2e7e7cd7 m136857x1c769f9(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            return new io.p3277xa1c40a32.p3279x37edf489.p3281x62f6fe4.C28522x2e7e7cd7(android.media.MediaCodec.createDecoderByType(str));
        } catch (java.io.IOException | java.lang.IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: createEncoderByType */
    public static io.p3277xa1c40a32.p3279x37edf489.p3281x62f6fe4.C28522x2e7e7cd7 m136858x358940d1(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            return new io.p3277xa1c40a32.p3279x37edf489.p3281x62f6fe4.C28522x2e7e7cd7(android.media.MediaCodec.createEncoderByType(str));
        } catch (java.io.IOException | java.lang.IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: createPersistentInputSurface */
    public static android.view.Surface m136859xf69895d6() {
        return android.media.MediaCodec.createPersistentInputSurface();
    }

    /* renamed from: configure */
    public void m136861xd00d62e6(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17) {
        this.f70371x65f7d40e.configure(mediaFormat, surface, mediaCrypto, i17);
    }

    /* renamed from: createInputSurface */
    public android.view.Surface m136862x4310109f() {
        return this.f70371x65f7d40e.createInputSurface();
    }

    /* renamed from: dequeueInputBuffer */
    public int m136863x9a572d5a(long j17) {
        return this.f70371x65f7d40e.dequeueInputBuffer(j17);
    }

    /* renamed from: dequeueOutputBuffer */
    public int m136864x436dd5f1(android.media.MediaCodec.BufferInfo bufferInfo, long j17) {
        return this.f70371x65f7d40e.dequeueOutputBuffer(bufferInfo, j17);
    }

    /* renamed from: flush */
    public void m136865x5d03b04() {
        this.f70371x65f7d40e.flush();
    }

    /* renamed from: getCanonicalName */
    public java.lang.String m136866x3be0b5e9() {
        return this.f70371x65f7d40e.getCanonicalName();
    }

    /* renamed from: getCodecInfo */
    public android.media.MediaCodecInfo m136867xbc655f2e() {
        return this.f70371x65f7d40e.getCodecInfo();
    }

    /* renamed from: getInputBuffer */
    public java.nio.ByteBuffer m136868xaa9f9f74(int i17) {
        try {
            return this.f70371x65f7d40e.getInputBuffer(i17);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: getInputFormat */
    public android.media.MediaFormat m136869xb124032b() {
        return this.f70371x65f7d40e.getInputFormat();
    }

    /* renamed from: getInputImage */
    public android.media.Image m136870x3fae67a7(int i17) {
        return this.f70371x65f7d40e.getInputImage(i17);
    }

    /* renamed from: getMetrics */
    public android.os.PersistableBundle m136871x76c5fc8d() {
        return this.f70371x65f7d40e.getMetrics();
    }

    /* renamed from: getName */
    public java.lang.String m136872xfb82e301() {
        return this.f70371x65f7d40e.getName();
    }

    /* renamed from: getOutputBuffer */
    public java.nio.ByteBuffer m136873x3c33a717(int i17) {
        return this.f70371x65f7d40e.getOutputBuffer(i17);
    }

    /* renamed from: getOutputFormat */
    public android.media.MediaFormat m136874x42b80ace() {
        return this.f70371x65f7d40e.getOutputFormat();
    }

    /* renamed from: getOutputImage */
    public android.media.Image m136876xa7795fa4(int i17) {
        return this.f70371x65f7d40e.getOutputImage(i17);
    }

    /* renamed from: queueInputBuffer */
    public void m136877xfe5642d9(int i17, int i18, int i19, long j17, int i27) {
        this.f70371x65f7d40e.queueInputBuffer(i17, i18, i19, j17, i27);
    }

    /* renamed from: queueSecureInputBuffer */
    public void m136878xa5aeefa2(int i17, int i18, android.media.MediaCodec.CryptoInfo cryptoInfo, long j17, int i19) {
        this.f70371x65f7d40e.queueSecureInputBuffer(i17, i18, cryptoInfo, j17, i19);
    }

    /* renamed from: release */
    public void m136879x41012807() {
        this.f70372xb44f03f5.quitSafely();
        this.f70372xb44f03f5 = null;
        this.f70371x65f7d40e.release();
    }

    /* renamed from: releaseOutputBuffer */
    public void m136881xab26be48(int i17, boolean z17) {
        this.f70371x65f7d40e.releaseOutputBuffer(i17, z17);
    }

    /* renamed from: reset */
    public void m136882x6761d4f() {
        this.f70371x65f7d40e.reset();
    }

    /* renamed from: setAudioPresentation */
    public void m136883x32a571ce(android.media.AudioPresentation audioPresentation) {
        this.f70371x65f7d40e.setAudioPresentation(audioPresentation);
    }

    /* renamed from: setCallback */
    public void m136885x6c4ebec7(android.media.MediaCodec.Callback callback, android.os.Handler handler) {
        this.f70371x65f7d40e.setCallback(callback, handler);
    }

    /* renamed from: setCallbackOnHandlerThread */
    public void m136886x23a3c88e(android.media.MediaCodec.Callback callback) {
        if (this.f70372xb44f03f5 == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("AMC_HTCB_" + f70370x77e7eab3.getAndAdd(1));
            this.f70372xb44f03f5 = handlerThread;
            handlerThread.start();
        }
        this.f70371x65f7d40e.setCallback(callback, new android.os.Handler(this.f70372xb44f03f5.getLooper()));
    }

    /* renamed from: setInputSurface */
    public void m136887x63904305(android.view.Surface surface) {
        this.f70371x65f7d40e.setInputSurface(surface);
    }

    /* renamed from: setOnFrameRenderedListener */
    public void m136888xcd3c98b5(android.media.MediaCodec.OnFrameRenderedListener onFrameRenderedListener, android.os.Handler handler) {
        this.f70371x65f7d40e.setOnFrameRenderedListener(onFrameRenderedListener, handler);
    }

    /* renamed from: setOutputSurface */
    public void m136889x610a9b2a(android.view.Surface surface) {
        this.f70371x65f7d40e.setOutputSurface(surface);
    }

    /* renamed from: setParameters */
    public void m136890x37bcc7ec(android.os.Bundle bundle) {
        this.f70371x65f7d40e.setParameters(bundle);
    }

    /* renamed from: setVideoScalingMode */
    public void m136891xfdd812d1(int i17) {
        this.f70371x65f7d40e.setVideoScalingMode(i17);
    }

    /* renamed from: signalEndOfInputStream */
    public void m136892x4cb1f740() {
        this.f70371x65f7d40e.signalEndOfInputStream();
    }

    /* renamed from: start */
    public void m136893x68ac462() {
        this.f70371x65f7d40e.start();
    }

    /* renamed from: stop */
    public void m136894x360802() {
        this.f70371x65f7d40e.stop();
    }

    /* renamed from: configure */
    public void m136860xd00d62e6(android.media.MediaFormat mediaFormat, android.view.Surface surface, int i17, android.media.MediaDescrambler mediaDescrambler) {
        this.f70371x65f7d40e.configure(mediaFormat, surface, i17, mediaDescrambler);
    }

    /* renamed from: getOutputFormat */
    public android.media.MediaFormat m136875x42b80ace(int i17) {
        return this.f70371x65f7d40e.getOutputFormat(i17);
    }

    /* renamed from: releaseOutputBuffer */
    public void m136880xab26be48(int i17, long j17) {
        this.f70371x65f7d40e.releaseOutputBuffer(i17, j17);
    }

    /* renamed from: setCallback */
    public void m136884x6c4ebec7(android.media.MediaCodec.Callback callback) {
        this.f70371x65f7d40e.setCallback(callback);
    }
}
