package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes14.dex */
public final class tm extends android.media.MediaCodec.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xm f214669a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f214670b;

    public tm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xm xmVar, yz5.l lVar) {
        this.f214669a = xmVar;
        this.f214670b = lVar;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(android.media.MediaCodec codec, android.media.MediaCodec.CodecException e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(android.media.MediaCodec decoder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(decoder, "decoder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f214669a.f214875c, "lxl onInputBufferAvailable");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xm xmVar = this.f214669a;
        synchronized (xmVar.f214876d) {
            if (i17 >= 0) {
                try {
                    java.nio.ByteBuffer inputBuffer = decoder.getInputBuffer(i17);
                    gp.c a17 = xmVar.a();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inputBuffer);
                    int f17 = a17.f(inputBuffer, 0);
                    if (f17 < 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xmVar.f214875c, "lxl queueInputBuffer BUFFER_FLAG_END_OF_STREAM");
                        decoder.queueInputBuffer(i17, 0, 0, 0L, 4);
                    } else {
                        decoder.queueInputBuffer(i17, 0, f17, xmVar.a().b(), 0);
                        xmVar.a().a();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xmVar.f214875c, "lxl queueInputBuffer " + (xmVar.a().b() / 1000));
                    }
                    if (xmVar.f214887o) {
                        xmVar.f214876d.wait();
                        xmVar.f214887o = false;
                    }
                } finally {
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(android.media.MediaCodec decoder, int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(decoder, "decoder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferInfo, "bufferInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f214669a.f214875c, "lxl onOutputBufferAvailable");
        try {
            if (i17 == -3 || i17 == -2 || i17 == -1) {
                decoder.releaseOutputBuffer(i17, false);
                return;
            }
            if (i17 >= 0 && (bufferInfo.flags & 4) == 0) {
                long j17 = bufferInfo.presentationTimeUs;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xm xmVar = this.f214669a;
                long j18 = 1000;
                if (j17 >= xmVar.f214884l * j18) {
                    decoder.releaseOutputBuffer(i17, true);
                    this.f214670b.mo146xb9724478(java.lang.Long.valueOf(bufferInfo.presentationTimeUs));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f214669a.f214875c, "lxl releaseOutputBuffer " + (bufferInfo.presentationTimeUs / j18) + ", render!");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xm xmVar2 = this.f214669a;
                    synchronized (xmVar2.f214876d) {
                        xmVar2.f214887o = true;
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xmVar.f214875c, "lxl releaseOutputBuffer " + (bufferInfo.presentationTimeUs / j18) + ", no");
                    decoder.releaseOutputBuffer(i17, false);
                }
                this.f214669a.f214886n = bufferInfo.presentationTimeUs;
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f214669a.f214875c, "lxl releaseOutputBuffer BUFFER_FLAG_END_OF_STREAM");
            decoder.releaseOutputBuffer(i17, false);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f214669a.f214875c, th6, "lxl onOutputBufferAvailable exception", new java.lang.Object[0]);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(android.media.MediaCodec codec, android.media.MediaFormat format) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
    }
}
