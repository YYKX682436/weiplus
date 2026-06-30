package fs0;

/* loaded from: classes10.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final hs0.a f347744a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f347745b;

    /* renamed from: c, reason: collision with root package name */
    public final long f347746c;

    /* renamed from: d, reason: collision with root package name */
    public final long f347747d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f347748e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f347749f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f347750g;

    /* renamed from: h, reason: collision with root package name */
    public final wo.i1 f347751h;

    /* renamed from: i, reason: collision with root package name */
    public android.media.MediaFormat f347752i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f347753j;

    /* renamed from: k, reason: collision with root package name */
    public final int f347754k;

    /* renamed from: l, reason: collision with root package name */
    public int f347755l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f347756m;

    /* renamed from: n, reason: collision with root package name */
    public long f347757n;

    /* renamed from: o, reason: collision with root package name */
    public long f347758o;

    /* renamed from: p, reason: collision with root package name */
    public android.media.MediaCodec.BufferInfo f347759p;

    /* renamed from: q, reason: collision with root package name */
    public int f347760q;

    /* renamed from: r, reason: collision with root package name */
    public long f347761r;

    /* renamed from: s, reason: collision with root package name */
    public final int f347762s;

    /* renamed from: t, reason: collision with root package name */
    public long f347763t;

    public f(hs0.a aVar, java.lang.String audioId, long j17, long j18, yz5.p pVar, yz5.a aVar2) {
        android.media.MediaFormat mediaFormat;
        android.media.MediaFormat mediaFormat2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioId, "audioId");
        this.f347744a = aVar;
        this.f347745b = audioId;
        this.f347746c = j17;
        this.f347747d = j18;
        this.f347748e = pVar;
        this.f347749f = aVar2;
        java.lang.String concat = "MicroMsg.IAudioDecoder@".concat(audioId);
        this.f347750g = concat;
        this.f347756m = new java.lang.Object();
        this.f347759p = new android.media.MediaCodec.BufferInfo();
        this.f347762s = 1024;
        if (aVar != null) {
            this.f347752i = aVar.f366085f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(concat, "create MediaCodecAACDecoder, audioId:" + audioId + ", startTimeMs:" + j17 + ", endTimeMs:" + j18 + ", mediaFormat:" + this.f347752i);
            android.media.MediaFormat mediaFormat3 = this.f347752i;
            if (mediaFormat3 != null) {
                int integer = mediaFormat3.getInteger("channel-count");
                this.f347754k = integer;
                android.media.MediaFormat mediaFormat4 = this.f347752i;
                if (mediaFormat4 != null) {
                    mediaFormat4.setInteger("max-input-size", integer * 16384);
                }
                android.media.MediaFormat mediaFormat5 = this.f347752i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mediaFormat5);
                this.f347755l = mediaFormat5.getInteger("sample-rate");
                android.media.MediaFormat mediaFormat6 = this.f347752i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mediaFormat6);
                java.lang.String string = mediaFormat6.getString("mime");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                android.media.MediaFormat mediaFormat7 = this.f347752i;
                if ((mediaFormat7 != null && mediaFormat7.containsKey("encoder-delay")) && (mediaFormat2 = this.f347752i) != null) {
                    mediaFormat2.setInteger("encoder-delay", 0);
                }
                android.media.MediaFormat mediaFormat8 = this.f347752i;
                if ((mediaFormat8 != null && mediaFormat8.containsKey("encoder-padding")) && (mediaFormat = this.f347752i) != null) {
                    mediaFormat.setInteger("encoder-padding", 0);
                }
                aVar.f();
                if (j17 >= 0) {
                    aVar.e(j17 * 1000);
                }
                wo.i1 c17 = wo.i1.c(string);
                this.f347751h = c17;
                c17.a(this.f347752i, null, null, 0);
            }
        }
    }

    public int a() {
        return this.f347754k;
    }

    public int b() {
        return this.f347755l;
    }

    public final void c(java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) {
        android.media.MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferInfo2, "bufferInfo");
        long j17 = this.f347761r;
        java.lang.String str = this.f347750g;
        if (j17 <= 0) {
            this.f347761r = a06.d.c(((this.f347762s * 1.0d) / this.f347755l) * 1000000);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkFrameDuration, frameDuration:" + this.f347761r);
        }
        if (byteBuffer != null) {
            byteBuffer.position(bufferInfo2.offset);
            byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            int i17 = 0;
            byteBuffer.position(0);
            byteBuffer.get(bArr);
            int i18 = 1;
            if (!(remaining == 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "decoder pcmData size:" + remaining + ", pts:" + bufferInfo2.presentationTimeUs + ", diff:" + (bufferInfo2.presentationTimeUs - this.f347763t) + ", audioId:" + this.f347745b + ", frameCount:" + this.f347760q);
                long j18 = this.f347757n;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j18;
                this.f347758o = this.f347758o + elapsedRealtime;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(hashCode());
                sb6.append(" decode frame cost ");
                sb6.append(elapsedRealtime);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                int i19 = this.f347754k == 1 ? 2048 : 4096;
                if (remaining > i19) {
                    int i27 = remaining / i19;
                    int i28 = 0;
                    int i29 = 0;
                    while (remaining > 0) {
                        int i37 = remaining > i19 ? i19 : remaining;
                        byte[] bArr2 = new byte[i37];
                        java.lang.System.arraycopy(bArr, i28, bArr2, i17, i37);
                        remaining -= i37;
                        i28 += i37;
                        i29 += i18;
                        long j19 = this.f347761r * this.f347760q;
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("split ret pcmData, leftSize:");
                        sb7.append(remaining);
                        sb7.append(", sizeOffset:");
                        sb7.append(i28);
                        sb7.append(", maxBufferSize:");
                        sb7.append(i19);
                        sb7.append(", copySize:");
                        sb7.append(i37);
                        sb7.append(", data.size:");
                        sb7.append(i37);
                        sb7.append(", splitCount:");
                        sb7.append(i27);
                        sb7.append(", bufferInfo.pts:");
                        bufferInfo2 = bufferInfo;
                        int i38 = i19;
                        sb7.append(bufferInfo2.presentationTimeUs);
                        sb7.append(", pts:");
                        sb7.append(j19);
                        sb7.append(", count:");
                        sb7.append(i29);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
                        yz5.p pVar = this.f347748e;
                        if (pVar != null) {
                        }
                        this.f347760q++;
                        i19 = i38;
                        i18 = 1;
                        i17 = 0;
                    }
                } else {
                    yz5.p pVar2 = this.f347748e;
                    if (pVar2 != null) {
                    }
                    this.f347760q++;
                }
            }
            this.f347763t = bufferInfo2.presentationTimeUs;
        }
    }

    public abstract void d();

    public void e() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(this.f347750g, "stop decoder", new java.lang.Object[0]);
        synchronized (this.f347756m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347750g, "stopDecoder in lock");
            try {
                if (!this.f347753j) {
                    this.f347753j = true;
                    wo.i1 i1Var = this.f347751h;
                    if (i1Var != null) {
                        i1Var.y();
                    }
                    wo.i1 i1Var2 = this.f347751h;
                    if (i1Var2 != null) {
                        i1Var2.q();
                    }
                    yz5.a aVar = this.f347749f;
                    if (aVar != null) {
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f347750g, hashCode() + " total decode used " + this.f347758o);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f347750g, e17, "stopDecoder error", new java.lang.Object[0]);
            }
        }
    }
}
