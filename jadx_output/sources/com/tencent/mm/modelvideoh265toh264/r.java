package com.tencent.mm.modelvideoh265toh264;

/* loaded from: classes10.dex */
public class r implements com.tencent.mm.modelvideoh265toh264.a {

    /* renamed from: x, reason: collision with root package name */
    public static int f71723x = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f71726c;

    /* renamed from: d, reason: collision with root package name */
    public int f71727d;

    /* renamed from: e, reason: collision with root package name */
    public int f71728e;

    /* renamed from: f, reason: collision with root package name */
    public int f71729f;

    /* renamed from: g, reason: collision with root package name */
    public int f71730g;

    /* renamed from: h, reason: collision with root package name */
    public int f71731h;

    /* renamed from: i, reason: collision with root package name */
    public int f71732i;

    /* renamed from: j, reason: collision with root package name */
    public int f71733j;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.modelvideoh265toh264.q f71735l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.modelvideoh265toh264.e f71736m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.modelvideoh265toh264.p f71737n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.modelcontrol.VideoTransPara f71738o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f71739p;

    /* renamed from: q, reason: collision with root package name */
    public gp.c f71740q;

    /* renamed from: r, reason: collision with root package name */
    public int f71741r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.modelvideoh265toh264.b f71742s;

    /* renamed from: u, reason: collision with root package name */
    public android.media.MediaFormat f71744u;

    /* renamed from: w, reason: collision with root package name */
    public final int f71746w;

    /* renamed from: a, reason: collision with root package name */
    public long f71724a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f71725b = -1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f71734k = false;

    /* renamed from: t, reason: collision with root package name */
    public int f71743t = -1;

    /* renamed from: v, reason: collision with root package name */
    public boolean f71745v = false;

    public r(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTranscoder", "create VideoTranscoder: %s", java.lang.Integer.valueOf(i17));
        this.f71746w = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01a4, code lost:
    
        if (r0.a() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0164, code lost:
    
        if (r15 != false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017b A[EDGE_INSN: B:40:0x017b->B:26:0x017b BREAK  A[LOOP:0: B:17:0x0096->B:39:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelvideoh265toh264.r.a():void");
    }

    public int b(android.media.MediaFormat mediaFormat, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTranscoder", "initDecoder, format: %s, filePath: %s, scaleFrame: %s", mediaFormat, this.f71739p, java.lang.Boolean.valueOf(z17));
        this.f71744u = mediaFormat;
        this.f71745v = z17;
        com.tencent.mm.modelvideoh265toh264.g gVar = new com.tencent.mm.modelvideoh265toh264.g(this.f71740q, mediaFormat, this.f71741r);
        this.f71742s = gVar;
        int b17 = gVar.b(this.f71739p, this.f71724a, this.f71725b);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTranscoder", "init decoder ret: %s", java.lang.Integer.valueOf(b17));
        if (b17 < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoTranscoder", "init mediaCodecDecoder failed, try ffmepg");
            try {
                ((com.tencent.mm.modelvideoh265toh264.g) this.f71742s).d();
                this.f71742s = null;
            } catch (java.lang.Exception unused) {
            }
            com.tencent.mm.modelvideoh265toh264.g gVar2 = new com.tencent.mm.modelvideoh265toh264.g(this.f71740q, mediaFormat, this.f71741r);
            this.f71742s = gVar2;
            b17 = gVar2.b(this.f71739p, this.f71724a, this.f71725b);
        }
        ((com.tencent.mm.modelvideoh265toh264.g) this.f71742s).f71679b = this;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTranscoder", "init finish, ret: %d, decoderType: %d", java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(f71723x));
        return b17;
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTranscoder", "release, decoderType: %d", java.lang.Integer.valueOf(f71723x));
        try {
            try {
                com.tencent.mm.modelvideoh265toh264.b bVar = this.f71742s;
                if (bVar != null) {
                    ((com.tencent.mm.modelvideoh265toh264.g) bVar).d();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VideoTranscoder", "release error: %s", e17.getMessage());
            }
        } finally {
            com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.releaseDataBufLock(0);
            f71723x = -1;
        }
    }

    public final android.graphics.Point d(int i17, int i18, int i19, int i27) {
        int i28;
        int i29;
        if (i17 <= i19 && i18 <= i27) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoTranscoder", "calc scale, small or equal to spec size");
            return null;
        }
        int max = java.lang.Math.max(i17, i18);
        int min = java.lang.Math.min(i17, i18);
        int max2 = java.lang.Math.max(i19, i27);
        int min2 = java.lang.Math.min(i19, i27);
        if (max % 16 == 0 && java.lang.Math.abs(max - max2) < 16 && min % 16 == 0 && java.lang.Math.abs(min - min2) < 16) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoTranscoder", "calc scale, same len divide by 16, no need scale");
            return null;
        }
        int i37 = max / 2;
        if (i37 == max2 && min / 2 == min2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoTranscoder", "calc scale, double ratio");
            int i38 = i17 / 2;
            int i39 = i18 / 2;
            if (i38 % 2 != 0) {
                i38++;
            }
            if (i39 % 2 != 0) {
                i39++;
            }
            return new android.graphics.Point(i38, i39);
        }
        int i47 = min / 2;
        if (i37 % 16 == 0 && java.lang.Math.abs(i37 - max2) < 16 && i47 % 16 == 0 && java.lang.Math.abs(i47 - min2) < 16) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoTranscoder", "calc scale, double ratio divide by 16");
            int i48 = i17 / 2;
            int i49 = i18 / 2;
            if (i48 % 2 != 0) {
                i48++;
            }
            if (i49 % 2 != 0) {
                i49++;
            }
            return new android.graphics.Point(i48, i49);
        }
        android.graphics.Point point = new android.graphics.Point();
        if (i17 < i18) {
            i28 = java.lang.Math.min(i19, i27);
            i29 = (int) (i18 / ((i17 * 1.0d) / i28));
        } else {
            int min3 = java.lang.Math.min(i19, i27);
            i28 = (int) (i17 / ((i18 * 1.0d) / min3));
            i29 = min3;
        }
        if (i29 % 2 != 0) {
            i29++;
        }
        if (i28 % 2 != 0) {
            i28++;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTranscoder", "calc scale, outputsize: %s %s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
        point.x = i28;
        point.y = i29;
        int i57 = i28 % 16;
        if (i57 != 0) {
            int min4 = i28 - java.lang.Math.min(16, i57);
            i28 = min4 < Integer.MAX_VALUE ? min4 : i28 - i57;
        }
        point.x = i28;
        int i58 = point.y;
        int i59 = i58 % 16;
        if (i59 != 0) {
            int min5 = i58 - java.lang.Math.min(16, i59);
            i58 = min5 < Integer.MAX_VALUE ? min5 : i58 - i59;
        }
        point.y = i58;
        return point;
    }
}
