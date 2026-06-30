package com.p314xaae8f345.mm.rfx.p2589x5fb4e56;

/* loaded from: classes14.dex */
public class c implements com.p314xaae8f345.mm.rfx.p2589x5fb4e56.i {

    /* renamed from: d, reason: collision with root package name */
    public android.media.MediaCodec f273765d;

    /* renamed from: e, reason: collision with root package name */
    public long f273766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaFormat f273767f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20960x26a13e76 f273768g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaCodec[] f273769h;

    public c(android.media.MediaFormat mediaFormat, com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20960x26a13e76 c20960x26a13e76, android.media.MediaCodec[] mediaCodecArr) {
        this.f273767f = mediaFormat;
        this.f273768g = c20960x26a13e76;
        this.f273769h = mediaCodecArr;
    }

    public void b(boolean z17) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        if (z17 && this.f273765d != null) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis() - this.f273766e;
            try {
                this.f273765d.stop();
            } catch (java.lang.Exception unused) {
            }
            try {
                this.f273765d.release();
            } catch (java.lang.Exception unused2) {
            }
            this.f273765d = null;
            this.f273768g.m77651x41012807();
            new java.lang.RuntimeException("init decoder timeout. cost: " + uptimeMillis + "ms");
        }
        if (!z17) {
            this.f273769h[0] = this.f273765d;
        }
        atomicInteger = com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20958x70e103f8.f39149x63f2f241;
        atomicInteger.getAndDecrement();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20960x26a13e76 c20960x26a13e76 = this.f273768g;
        android.media.MediaFormat mediaFormat = this.f273767f;
        this.f273766e = android.os.SystemClock.uptimeMillis();
        try {
            android.media.MediaCodec createDecoderByType = android.media.MediaCodec.createDecoderByType(mediaFormat.getString("mime"));
            this.f273765d = createDecoderByType;
            createDecoderByType.configure(mediaFormat, c20960x26a13e76.m77650xce3434b6(), (android.media.MediaCrypto) null, 0);
            this.f273765d.start();
        } catch (java.lang.Exception unused) {
            android.media.MediaCodec mediaCodec = this.f273765d;
            if (mediaCodec != null) {
                mediaCodec.release();
                this.f273765d = null;
                c20960x26a13e76.m77651x41012807();
            }
        }
    }
}
