package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: l, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.a f257336l = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f257337a;

    /* renamed from: b, reason: collision with root package name */
    public final int f257338b;

    /* renamed from: c, reason: collision with root package name */
    public final android.media.MediaFormat f257339c;

    /* renamed from: d, reason: collision with root package name */
    public int f257340d;

    /* renamed from: e, reason: collision with root package name */
    public int f257341e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f257342f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f257343g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f257344h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f257345i;

    /* renamed from: j, reason: collision with root package name */
    public java.nio.channels.WritableByteChannel f257346j;

    /* renamed from: k, reason: collision with root package name */
    public int f257347k;

    public b(boolean z17, int i17, android.media.MediaFormat mediaFormat, int i18, int i19, java.lang.String localSavePath, java.util.ArrayList pendingMediaDts, java.util.ArrayList pendingMediaPts, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i18 = (i27 & 8) != 0 ? 0 : i18;
        i19 = (i27 & 16) != 0 ? 0 : i19;
        pendingMediaDts = (i27 & 64) != 0 ? new java.util.ArrayList() : pendingMediaDts;
        pendingMediaPts = (i27 & 128) != 0 ? new java.util.ArrayList() : pendingMediaPts;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaFormat, "mediaFormat");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localSavePath, "localSavePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pendingMediaDts, "pendingMediaDts");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pendingMediaPts, "pendingMediaPts");
        this.f257337a = z17;
        this.f257338b = i17;
        this.f257339c = mediaFormat;
        this.f257340d = i18;
        this.f257341e = i19;
        this.f257342f = localSavePath;
        this.f257343g = pendingMediaDts;
        this.f257344h = pendingMediaPts;
        this.f257345i = "MicroMsg.ParallelMuxTrackInfo";
    }

    public final void a(java.nio.ByteBuffer byteBuf, android.media.MediaCodec.BufferInfo bufferInfo) {
        android.media.MediaFormat mediaFormat = this.f257339c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(byteBuf, "byteBuf");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferInfo, "bufferInfo");
        this.f257340d++;
        int b17 = a06.d.b(((float) bufferInfo.presentationTimeUs) / 1000.0f);
        if (b17 > this.f257341e) {
            this.f257341e = b17;
        }
        java.nio.channels.WritableByteChannel writableByteChannel = this.f257346j;
        java.lang.String str = this.f257345i;
        if (writableByteChannel == null) {
            java.lang.String str2 = this.f257342f;
            this.f257346j = com.p314xaae8f345.mm.vfs.w6.L(com.p314xaae8f345.mm.vfs.z7.a(str2), null, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "create localSavePath:".concat(str2));
        }
        try {
            boolean z17 = byteBuf.remaining() <= 0 || byteBuf.get(byteBuf.position()) != -1;
            boolean z18 = this.f257337a;
            if (!z18 && z17) {
                byte[] m69171x1b3f01a6 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69171x1b3f01a6(byteBuf.limit(), bufferInfo.presentationTimeUs, mediaFormat.containsKey("aac-profile") ? mediaFormat.getInteger("aac-profile") : 2, mediaFormat.containsKey("sample-rate") ? mediaFormat.getInteger("sample-rate") : 4, mediaFormat.containsKey("channel-count") ? mediaFormat.getInteger("channel-count") : 1);
                java.nio.channels.WritableByteChannel writableByteChannel2 = this.f257346j;
                if (writableByteChannel2 != null) {
                    writableByteChannel2.write(java.nio.ByteBuffer.wrap(m69171x1b3f01a6));
                }
            }
            if (z18 && bufferInfo.presentationTimeUs < ((java.lang.Number) kz5.n0.i0(this.f257343g)).longValue()) {
                this.f257347k++;
            }
            java.nio.channels.WritableByteChannel writableByteChannel3 = this.f257346j;
            if (writableByteChannel3 != null) {
                writableByteChannel3.write(byteBuf);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "", new java.lang.Object[0]);
        }
        long j17 = bufferInfo.presentationTimeUs;
        java.util.ArrayList arrayList = this.f257344h;
        if (j17 != 0 || arrayList.size() <= 0) {
            arrayList.add(java.lang.Long.valueOf(bufferInfo.presentationTimeUs));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "happen error ,bufferInfo size:" + bufferInfo.size);
    }

    /* renamed from: equals */
    public boolean m72524xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b) obj;
        return this.f257337a == bVar.f257337a && this.f257338b == bVar.f257338b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f257339c, bVar.f257339c) && this.f257340d == bVar.f257340d && this.f257341e == bVar.f257341e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f257342f, bVar.f257342f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f257343g, bVar.f257343g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f257344h, bVar.f257344h);
    }

    /* renamed from: hashCode */
    public int m72525x8cdac1b() {
        return (((((((((((((java.lang.Boolean.hashCode(this.f257337a) * 31) + java.lang.Integer.hashCode(this.f257338b)) * 31) + this.f257339c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f257340d)) * 31) + java.lang.Integer.hashCode(this.f257341e)) * 31) + this.f257342f.hashCode()) * 31) + this.f257343g.hashCode()) * 31) + this.f257344h.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m72526x9616526c() {
        return "ParallelMuxTrackInfo(isVideoTrack=" + this.f257337a + ", trackId=" + this.f257338b + ", mediaFormat=" + this.f257339c + ", frameCount=" + this.f257340d + ", trackDuration=" + this.f257341e + ", localSavePath=" + this.f257342f + ", pendingMediaDts=" + this.f257343g + ", pendingMediaPts=" + this.f257344h + ')';
    }
}
