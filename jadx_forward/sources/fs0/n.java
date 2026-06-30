package fs0;

/* loaded from: classes10.dex */
public final class n extends android.media.MediaCodec.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fs0.o f347802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hs0.a f347803b;

    public n(fs0.o oVar, hs0.a aVar) {
        this.f347802a = oVar;
        this.f347803b = aVar;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(android.media.MediaCodec codec, android.media.MediaCodec.CodecException e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        fs0.o oVar = this.f347802a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(oVar.f347804x, "onError, codec:" + codec + ", " + e17.isRecoverable() + ' ' + e17.isTransient() + ' ' + e17.getDiagnosticInfo());
        if (oVar.f347782s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxDecodeFrameFailedAsyncOnError");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 80L, 1L);
        }
        if (e17.isRecoverable() || e17.isTransient()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxDecodeFrameFailedAsyncOnErrorStop");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 80L, 1L);
        oVar.c();
        yz5.a aVar = oVar.f347774k;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(android.media.MediaCodec codec, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347802a.f347804x, "onInputBufferAvailable, index:" + i17);
        if (i17 >= 0) {
            try {
                java.nio.ByteBuffer inputBuffer = codec.getInputBuffer(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inputBuffer, "null cannot be cast to non-null type java.nio.ByteBuffer");
                inputBuffer.clear();
                if (!hs0.a.c(this.f347803b, inputBuffer, 0, 2, null)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347802a.f347804x, "read sample end");
                    this.f347802a.A = true;
                    wo.i1 i1Var = this.f347802a.f347769f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var);
                    i1Var.p(i17, 0, 0, 0L, 4);
                    return;
                }
                long a17 = this.f347803b.a();
                int i18 = this.f347803b.f366088i;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347802a.f347804x, "input sampleTime:" + a17 + ", sampleSize:" + i18);
                inputBuffer.position(0);
                wo.i1 i1Var2 = this.f347802a.f347769f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var2);
                i1Var2.p(i17, 0, i18, a17, 0);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f347802a.f347804x, e17, "onInputBufferAvailable error", new java.lang.Object[0]);
                if (this.f347802a.f347782s) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxDecodeFrameFailed");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 76L, 1L);
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(android.media.MediaCodec codec, int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferInfo, "bufferInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347802a.f347804x, "onOutputBufferAvailable, index:" + i17 + ", bufferInfo:" + bufferInfo + " size:" + bufferInfo.size + ", isFinished:" + this.f347802a.f347778o);
        try {
            if (i17 < 0) {
                wo.i1 i1Var = this.f347802a.f347769f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var);
                i1Var.s(i17, false);
                return;
            }
            long j17 = bufferInfo.presentationTimeUs;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347802a.f347804x, "presentationTimeUs : " + j17);
            fs0.o oVar = this.f347802a;
            long j18 = (long) 1000;
            if (j17 < oVar.f347764a * j18 && (bufferInfo.flags & 4) == 0) {
                wo.i1 i1Var2 = oVar.f347769f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var2);
                i1Var2.s(i17, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347802a.f347804x, "decoder pts: " + j17 + ", not reach start: " + (this.f347802a.f347764a * j18));
                return;
            }
            oVar.b(i17, bufferInfo);
            fs0.o oVar2 = this.f347802a;
            long j19 = oVar2.f347765b * j18;
            if (j19 != 1 && j17 >= j19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(oVar2.f347804x, "exceed endTimeMs");
                fs0.o oVar3 = this.f347802a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar3.f347804x, "onDecodeEnd ");
                if (!oVar3.f347806z) {
                    yz5.a aVar = oVar3.f347772i;
                    if (aVar != null) {
                        aVar.mo152xb9724478();
                    }
                    oVar3.f347806z = true;
                }
                this.f347802a.c();
                return;
            }
            if ((bufferInfo.flags & 4) != 0 || oVar2.A) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347802a.f347804x, "receive eos!");
                fs0.o oVar4 = this.f347802a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar4.f347804x, "onDecodeEnd ");
                if (!oVar4.f347806z) {
                    yz5.a aVar2 = oVar4.f347772i;
                    if (aVar2 != null) {
                        aVar2.mo152xb9724478();
                    }
                    oVar4.f347806z = true;
                }
                this.f347802a.c();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f347802a.f347804x, e17, "onOutputBufferAvailable error", new java.lang.Object[0]);
            if (this.f347802a.f347782s) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxDecodeFrameFailed");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 76L, 1L);
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(android.media.MediaCodec codec, android.media.MediaFormat format) {
        yz5.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        fs0.o oVar = this.f347802a;
        oVar.f347770g = format;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f347804x, "decoder output format changed: " + oVar.f347770g);
        android.media.MediaFormat mediaFormat = oVar.f347770g;
        if (mediaFormat == null || (lVar = oVar.f347773j) == null) {
            return;
        }
        lVar.mo146xb9724478(mediaFormat);
    }
}
