package gs0;

/* loaded from: classes10.dex */
public final class m extends android.media.MediaCodec.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gs0.p f356535a;

    public m(gs0.p pVar) {
        this.f356535a = pVar;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(android.media.MediaCodec codec, android.media.MediaCodec.CodecException e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        gs0.p pVar = this.f356535a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(pVar.f356538j, "codec Error, e:" + e17);
        if (pVar.f356509f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxEncodeFrameFailedAsyncOnError");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 81L, 1L);
        }
        pVar.f();
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(android.media.MediaCodec codec, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f356535a.f356538j, "onInputBufferAvailable, index:" + i17);
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(android.media.MediaCodec codec, int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferInfo, "bufferInfo");
        gs0.p pVar = this.f356535a;
        java.lang.String str = pVar.f356538j;
        try {
            if (i17 < 0) {
                pVar.f356539k.s(i17, false);
                return;
            }
            java.nio.ByteBuffer m17 = pVar.f356539k.m(i17);
            if ((bufferInfo.flags & 2) != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pVar.f356538j, "codec config!");
            }
            if ((bufferInfo.flags & 4) != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pVar.f356538j, "encode end of stream");
                pVar.f();
            } else if (bufferInfo.size != 0) {
                m17.position(bufferInfo.offset);
                m17.limit(bufferInfo.offset + bufferInfo.size);
                pVar.e(m17, bufferInfo);
                pVar.f356539k.r(i17, bufferInfo.presentationTimeUs);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(pVar.f356538j, e17, "onOutputBufferAvailable error", new java.lang.Object[0]);
            if (pVar.f356509f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxEncodeFrameFailed");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 77L, 1L);
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(android.media.MediaCodec codec, android.media.MediaFormat format) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        gs0.p pVar = this.f356535a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pVar.f356538j, "encoder output format changed " + pVar.f356539k.o());
    }
}
