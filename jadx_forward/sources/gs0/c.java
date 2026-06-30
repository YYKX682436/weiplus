package gs0;

/* loaded from: classes10.dex */
public final class c extends gs0.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.media.MediaFormat mediaFormat, yz5.q frameEncodeCallback, yz5.a frameEncodeEndCallback) {
        super(mediaFormat, frameEncodeCallback, frameEncodeEndCallback);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaFormat, "mediaFormat");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameEncodeCallback, "frameEncodeCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameEncodeEndCallback, "frameEncodeEndCallback");
        this.f356498c.x();
    }

    @Override // gs0.a
    public void c(byte[] data, long j17, boolean z17) {
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        try {
            synchronized (this.f356503h) {
                if (this.f356500e) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACEncoder", "sendDataToEncoder end now");
                    return;
                }
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                this.f356501f = android.os.SystemClock.elapsedRealtime();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACEncoder", "sendDataToEncoder, pcmData size:" + data.length + ", pts:" + j17 + ", isLast:" + z17);
                int f17 = this.f356498c.f(100L);
                if (f17 < 0) {
                    d();
                }
                if (f17 >= 0) {
                    java.nio.ByteBuffer byteBuffer = this.f356498c.k()[f17];
                    if (byteBuffer != null) {
                        byteBuffer.clear();
                    }
                    if (byteBuffer != null) {
                        byteBuffer.position(0);
                    }
                    if (byteBuffer != null) {
                        byteBuffer.put(data);
                    }
                    if (z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACEncoder", "last, send EOS and try delay stop encoder");
                        b();
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACEncoder", "EOS received in sendAudioToEncoder");
                        this.f356498c.p(f17, 0, data.length, j17, 4);
                    } else {
                        this.f356498c.p(f17, 0, data.length, j17, 0);
                    }
                }
                d();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MediaCodecAACEncoder", e17, "", new java.lang.Object[0]);
        }
    }

    public final void d() {
        try {
            synchronized (this.f356503h) {
                if (this.f356500e) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACEncoder", "drainEncoder end now");
                    return;
                }
                android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                while (true) {
                    int g17 = this.f356498c.g(bufferInfo, 100L);
                    if (g17 == -1) {
                        return;
                    }
                    if (g17 == -2) {
                        android.media.MediaFormat o17 = this.f356498c.o();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getOutputFormat(...)");
                        this.f356499d = o17;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACEncoder", "dstMediaFormat change: %s", o17);
                    } else if (g17 < 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCodecAACEncoder", "unexpected encoderOutputBufferIndex: %s", java.lang.Integer.valueOf(g17));
                    } else {
                        if ((bufferInfo.flags & 2) != 0) {
                            bufferInfo.size = 0;
                        }
                        java.nio.ByteBuffer byteBuffer = this.f356498c.n()[g17];
                        if (byteBuffer == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCodecAACEncoder", "ERROR, retrieve encoderOutputBuffer is null!!");
                            return;
                        }
                        if (bufferInfo.size > 0) {
                            a(byteBuffer, bufferInfo);
                        }
                        this.f356498c.s(g17, false);
                        if ((bufferInfo.flags & 4) != 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACEncoder", "receive EOS!");
                            this.f356498c.y();
                            this.f356498c.q();
                            return;
                        }
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MediaCodecAACEncoder", e17, "drainEncoder error: %s", e17.getMessage());
        }
    }
}
