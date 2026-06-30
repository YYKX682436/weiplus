package com.p314xaae8f345.mm.p962x4177e4be;

/* loaded from: classes10.dex */
public class g implements com.p314xaae8f345.mm.p962x4177e4be.b {

    /* renamed from: a, reason: collision with root package name */
    public final gp.c f153211a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p962x4177e4be.a f153212b;

    /* renamed from: c, reason: collision with root package name */
    public long f153213c;

    /* renamed from: d, reason: collision with root package name */
    public long f153214d;

    /* renamed from: e, reason: collision with root package name */
    public android.media.MediaFormat f153215e;

    /* renamed from: f, reason: collision with root package name */
    public wo.i1 f153216f;

    /* renamed from: h, reason: collision with root package name */
    public final int f153218h;

    /* renamed from: i, reason: collision with root package name */
    public int f153219i;

    /* renamed from: j, reason: collision with root package name */
    public int f153220j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f153221k;

    /* renamed from: g, reason: collision with root package name */
    public final android.media.MediaCodec.BufferInfo f153217g = new android.media.MediaCodec.BufferInfo();

    /* renamed from: l, reason: collision with root package name */
    public int f153222l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f153223m = -1;

    public g(gp.c cVar, android.media.MediaFormat mediaFormat, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "create MediaCodecTranscodeDecoder: %s, %s, %s", cVar, mediaFormat, java.lang.Integer.valueOf(i17));
        this.f153211a = cVar;
        this.f153215e = mediaFormat;
        this.f153218h = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x048d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            Method dump skipped, instructions count: 1184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p962x4177e4be.g.a():boolean");
    }

    public int b(java.lang.String str, long j17, long j18) {
        android.media.MediaCodecInfo mediaCodecInfo;
        this.f153213c = j17;
        this.f153214d = j18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "initDecoder() called with: format = [" + this.f153215e + "]");
        try {
            java.lang.String string = this.f153215e.getString("mime");
            if ("video/dolby-vision".equalsIgnoreCase(string) && !ph3.f.f()) {
                string = "video/hevc";
            }
            this.f153216f = wo.i1.c(string);
            int codecCount = android.media.MediaCodecList.getCodecCount();
            int i17 = 0;
            loop0: while (true) {
                if (i17 >= codecCount) {
                    mediaCodecInfo = null;
                    break;
                }
                mediaCodecInfo = android.media.MediaCodecList.getCodecInfoAt(i17);
                if (!mediaCodecInfo.isEncoder()) {
                    for (java.lang.String str2 : mediaCodecInfo.getSupportedTypes()) {
                        if (str2.equalsIgnoreCase(string)) {
                            break loop0;
                        }
                    }
                }
                i17++;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "found codec: %s", mediaCodecInfo);
            if (mediaCodecInfo != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "codec name: %s", mediaCodecInfo.getName());
                int c17 = c(mediaCodecInfo, string);
                this.f153223m = c17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "found colorFormat: %s", java.lang.Integer.valueOf(c17));
                this.f153215e.setInteger("color-format", this.f153223m);
            }
            this.f153216f.a(this.f153215e, null, null, 0);
            this.f153216f.x();
            return 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MediaCodecTranscodeDecoder", e17, "Init decoder failed : %s", e17.getMessage());
            return -1;
        }
    }

    public int c(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "selectColorFormat, mimeType: %s, codecInfo: %s", str, mediaCodecInfo);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "getCapabilitiesForType used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "color format length: %s", java.lang.Integer.valueOf(capabilitiesForType.colorFormats.length));
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int[] iArr = capabilitiesForType.colorFormats;
            if (i17 >= iArr.length) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "codec: %s, colorFormat: %s", mediaCodecInfo.getName(), java.lang.Integer.valueOf(i18));
                return i18;
            }
            int i19 = iArr[i17];
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "capabilities colorFormat: %s", java.lang.Integer.valueOf(i19));
            if ((i19 == 19 || i19 == 21) && (i19 > i18 || i19 == 21)) {
                i18 = i19;
            }
            i17++;
        }
    }

    public void d() {
        if (this.f153216f != null) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "stop decoder");
                this.f153216f.y();
                this.f153216f.q();
                this.f153216f = null;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MediaCodecTranscodeDecoder", e17, "stop decoder error: %s", e17.getMessage());
            }
        }
    }
}
