package gs0;

/* loaded from: classes10.dex */
public final class e extends android.media.MediaCodec.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gs0.h f356516a;

    public e(gs0.h hVar) {
        this.f356516a = hVar;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(android.media.MediaCodec codec, android.media.MediaCodec.CodecException e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCodecAACEncoderAsync", "onError, e:" + e17.getMessage() + ", " + e17);
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(android.media.MediaCodec codec, int i17) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACEncoderAsync", "has input buffer " + i17);
            if (this.f356516a.f356519i.size() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACEncoderAsync", "current data is null");
                this.f356516a.f356520j.add(java.lang.Integer.valueOf(i17));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACEncoderAsync", "has input buffer avaiable" + i17);
            if (this.f356516a.f356500e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACEncoderAsync", "sendDataToEncoder end now");
                return;
            }
            gs0.h hVar = this.f356516a;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            hVar.f356501f = android.os.SystemClock.elapsedRealtime();
            if (i17 < 0) {
                return;
            }
            java.util.List list = this.f356516a.f356519i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "access$getInputDataSource$p(...)");
            gs0.d dVar = (gs0.d) kz5.n0.X(list);
            byte[] bArr = dVar.f356513a;
            long j17 = dVar.f356514b;
            boolean z19 = dVar.f356515c;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("encode data, pts:");
            sb6.append(j17);
            sb6.append(", isLast:");
            sb6.append(z19);
            sb6.append(", pcmData:");
            sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : null);
            sb6.append(", inputDataSource.size:");
            sb6.append(this.f356516a.f356519i.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACEncoderAsync", sb6.toString());
            if (bArr != null && i17 >= 0) {
                java.nio.ByteBuffer j18 = this.f356516a.f356498c.j(i17);
                if (j18 != null) {
                    j18.clear();
                }
                if (j18 != null) {
                    j18.position(0);
                }
                if (j18 != null) {
                    j18.put(bArr);
                }
                if (z19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACEncoderAsync", "last, send EOS and try delay stop encoder");
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    this.f356516a.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACEncoderAsync", "EOS received in sendAudioToEncoder");
                    this.f356516a.f356498c.p(i17, 0, bArr.length, j17, 4);
                    final yz5.a aVar = this.f356516a.f356523m;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(new java.lang.Runnable(aVar) { // from class: gs0.f

                        /* renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ yz5.a f356517d;

                        {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "function");
                            this.f356517d = aVar;
                        }

                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f356517d.mo152xb9724478();
                        }
                    });
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new java.lang.Runnable(aVar) { // from class: gs0.f

                        /* renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ yz5.a f356517d;

                        {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "function");
                            this.f356517d = aVar;
                        }

                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f356517d.mo152xb9724478();
                        }
                    }, 2000L);
                } else {
                    this.f356516a.f356498c.p(i17, 0, bArr.length, j17, 0);
                }
                this.f356516a.f356519i.remove(dVar);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MediaCodecAACEncoderAsync", e17, "onInputBufferAvailable error", new java.lang.Object[0]);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(android.media.MediaCodec codec, int i17, android.media.MediaCodec.BufferInfo info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (i17 == -1) {
            return;
        }
        gs0.h hVar = this.f356516a;
        try {
            if (i17 == -2) {
                android.media.MediaFormat o17 = hVar.f356498c.o();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getOutputFormat(...)");
                hVar.getClass();
                hVar.f356499d = o17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACEncoderAsync", "dstMediaFormat change: %s", hVar.f356499d);
                return;
            }
            if (i17 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCodecAACEncoderAsync", "unexpected encoderOutputBufferIndex: %s", java.lang.Integer.valueOf(i17));
                return;
            }
            if ((info.flags & 2) != 0) {
                hVar.getClass();
                hVar.getClass();
                info.size = 0;
            }
            hVar.a(hVar.f356498c.m(i17), info);
            hVar.f356498c.s(i17, false);
            if ((info.flags & 4) != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACEncoderAsync", "receive EOS!");
                hVar.b();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MediaCodecAACEncoderAsync", e17, "drainEncoder error: %s", e17.getMessage());
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(android.media.MediaCodec codec, android.media.MediaFormat format) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACEncoderAsync", "onOutputFormatChanged: " + format);
    }
}
