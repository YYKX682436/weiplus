package com.tencent.mm.modelvideoh265toh264;

/* loaded from: classes10.dex */
public class g implements com.tencent.mm.modelvideoh265toh264.b {

    /* renamed from: a, reason: collision with root package name */
    public final gp.c f71678a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.modelvideoh265toh264.a f71679b;

    /* renamed from: c, reason: collision with root package name */
    public long f71680c;

    /* renamed from: d, reason: collision with root package name */
    public long f71681d;

    /* renamed from: e, reason: collision with root package name */
    public android.media.MediaFormat f71682e;

    /* renamed from: f, reason: collision with root package name */
    public wo.i1 f71683f;

    /* renamed from: h, reason: collision with root package name */
    public final int f71685h;

    /* renamed from: i, reason: collision with root package name */
    public int f71686i;

    /* renamed from: j, reason: collision with root package name */
    public int f71687j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f71688k;

    /* renamed from: g, reason: collision with root package name */
    public final android.media.MediaCodec.BufferInfo f71684g = new android.media.MediaCodec.BufferInfo();

    /* renamed from: l, reason: collision with root package name */
    public int f71689l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f71690m = -1;

    public g(gp.c cVar, android.media.MediaFormat mediaFormat, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "create MediaCodecTranscodeDecoder: %s, %s, %s", cVar, mediaFormat, java.lang.Integer.valueOf(i17));
        this.f71678a = cVar;
        this.f71682e = mediaFormat;
        this.f71685h = i17;
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelvideoh265toh264.g.a():boolean");
    }

    public int b(java.lang.String str, long j17, long j18) {
        android.media.MediaCodecInfo mediaCodecInfo;
        this.f71680c = j17;
        this.f71681d = j18;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "initDecoder() called with: format = [" + this.f71682e + "]");
        try {
            java.lang.String string = this.f71682e.getString("mime");
            if ("video/dolby-vision".equalsIgnoreCase(string) && !ph3.f.f()) {
                string = "video/hevc";
            }
            this.f71683f = wo.i1.c(string);
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
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "found codec: %s", mediaCodecInfo);
            if (mediaCodecInfo != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "codec name: %s", mediaCodecInfo.getName());
                int c17 = c(mediaCodecInfo, string);
                this.f71690m = c17;
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "found colorFormat: %s", java.lang.Integer.valueOf(c17));
                this.f71682e.setInteger("color-format", this.f71690m);
            }
            this.f71683f.a(this.f71682e, null, null, 0);
            this.f71683f.x();
            return 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecTranscodeDecoder", e17, "Init decoder failed : %s", e17.getMessage());
            return -1;
        }
    }

    public int c(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "selectColorFormat, mimeType: %s, codecInfo: %s", str, mediaCodecInfo);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "getCapabilitiesForType used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "color format length: %s", java.lang.Integer.valueOf(capabilitiesForType.colorFormats.length));
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int[] iArr = capabilitiesForType.colorFormats;
            if (i17 >= iArr.length) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "codec: %s, colorFormat: %s", mediaCodecInfo.getName(), java.lang.Integer.valueOf(i18));
                return i18;
            }
            int i19 = iArr[i17];
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "capabilities colorFormat: %s", java.lang.Integer.valueOf(i19));
            if ((i19 == 19 || i19 == 21) && (i19 > i18 || i19 == 21)) {
                i18 = i19;
            }
            i17++;
        }
    }

    public void d() {
        if (this.f71683f != null) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTranscodeDecoder", "stop decoder");
                this.f71683f.y();
                this.f71683f.q();
                this.f71683f = null;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecTranscodeDecoder", e17, "stop decoder error: %s", e17.getMessage());
            }
        }
    }
}
