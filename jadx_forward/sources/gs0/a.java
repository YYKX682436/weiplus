package gs0;

/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.q f356496a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f356497b;

    /* renamed from: c, reason: collision with root package name */
    public final wo.i1 f356498c;

    /* renamed from: d, reason: collision with root package name */
    public android.media.MediaFormat f356499d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f356500e;

    /* renamed from: f, reason: collision with root package name */
    public long f356501f;

    /* renamed from: g, reason: collision with root package name */
    public long f356502g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f356503h;

    public a(android.media.MediaFormat mediaFormat, yz5.q frameEncodeCallback, yz5.a frameEncodeEndCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaFormat, "mediaFormat");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameEncodeCallback, "frameEncodeCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameEncodeEndCallback, "frameEncodeEndCallback");
        this.f356496a = frameEncodeCallback;
        this.f356497b = frameEncodeEndCallback;
        this.f356503h = new java.lang.Object();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IAudioEncoder", "init audio encoder");
        mediaFormat.getString("mime");
        try {
            android.media.MediaFormat mediaFormat2 = new android.media.MediaFormat();
            this.f356499d = mediaFormat2;
            mediaFormat2.setString("mime", "audio/mp4a-latm");
            this.f356499d.setInteger("aac-profile", 2);
            this.f356499d.setInteger("sample-rate", 44100);
            int integer = mediaFormat.containsKey("channel-count") ? mediaFormat.getInteger("channel-count") : 0;
            integer = integer <= 0 ? 1 : integer;
            this.f356499d.setInteger("channel-count", integer);
            this.f356499d.setInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, mediaFormat.getInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63));
            this.f356499d.setInteger("max-input-size", integer * 2048);
            wo.i1 d17 = wo.i1.d("audio/mp4a-latm", false);
            this.f356498c = d17;
            d17.a(this.f356499d, null, null, 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IAudioEncoder", "finish init audio encoder, dstMediaFormat:" + this.f356499d);
        } catch (java.lang.Exception unused) {
            throw new java.lang.IllegalStateException("init encoder error");
        }
    }

    public final void a(java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferInfo, "bufferInfo");
        if (byteBuffer == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IAudioEncoder", "ERROR, retrieve encoderOutputBuffer is null!!");
            return;
        }
        if (bufferInfo.size > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IAudioEncoder", "encoder output buffer:" + bufferInfo.size + ", pts:" + bufferInfo.presentationTimeUs);
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            long j17 = this.f356501f;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
            this.f356502g += elapsedRealtime;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IAudioEncoder", hashCode() + " encode frame used " + elapsedRealtime);
            this.f356496a.mo147xb9724478(byteBuffer, bufferInfo, this.f356499d);
        }
    }

    public final synchronized void b() {
        try {
            synchronized (this.f356503h) {
                if (!this.f356500e) {
                    this.f356500e = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IAudioEncoder", "releaseEncoder");
                    this.f356498c.y();
                    this.f356498c.q();
                    this.f356497b.mo152xb9724478();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IAudioEncoder", "total encode used " + this.f356502g);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IAudioEncoder", "releaseEncoder error: %s", e17.getMessage());
        }
    }

    public abstract void c(byte[] bArr, long j17, boolean z17);
}
