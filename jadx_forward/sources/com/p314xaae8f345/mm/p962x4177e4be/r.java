package com.p314xaae8f345.mm.p962x4177e4be;

/* loaded from: classes10.dex */
public class r implements com.p314xaae8f345.mm.p962x4177e4be.a {

    /* renamed from: x, reason: collision with root package name */
    public static int f153256x = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f153259c;

    /* renamed from: d, reason: collision with root package name */
    public int f153260d;

    /* renamed from: e, reason: collision with root package name */
    public int f153261e;

    /* renamed from: f, reason: collision with root package name */
    public int f153262f;

    /* renamed from: g, reason: collision with root package name */
    public int f153263g;

    /* renamed from: h, reason: collision with root package name */
    public int f153264h;

    /* renamed from: i, reason: collision with root package name */
    public int f153265i;

    /* renamed from: j, reason: collision with root package name */
    public int f153266j;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.p962x4177e4be.q f153268l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p962x4177e4be.e f153269m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p962x4177e4be.p f153270n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f153271o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f153272p;

    /* renamed from: q, reason: collision with root package name */
    public gp.c f153273q;

    /* renamed from: r, reason: collision with root package name */
    public int f153274r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p962x4177e4be.b f153275s;

    /* renamed from: u, reason: collision with root package name */
    public android.media.MediaFormat f153277u;

    /* renamed from: w, reason: collision with root package name */
    public final int f153279w;

    /* renamed from: a, reason: collision with root package name */
    public long f153257a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f153258b = -1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f153267k = false;

    /* renamed from: t, reason: collision with root package name */
    public int f153276t = -1;

    /* renamed from: v, reason: collision with root package name */
    public boolean f153278v = false;

    public r(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTranscoder", "create VideoTranscoder: %s", java.lang.Integer.valueOf(i17));
        this.f153279w = i17;
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p962x4177e4be.r.a():void");
    }

    public int b(android.media.MediaFormat mediaFormat, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTranscoder", "initDecoder, format: %s, filePath: %s, scaleFrame: %s", mediaFormat, this.f153272p, java.lang.Boolean.valueOf(z17));
        this.f153277u = mediaFormat;
        this.f153278v = z17;
        com.p314xaae8f345.mm.p962x4177e4be.g gVar = new com.p314xaae8f345.mm.p962x4177e4be.g(this.f153273q, mediaFormat, this.f153274r);
        this.f153275s = gVar;
        int b17 = gVar.b(this.f153272p, this.f153257a, this.f153258b);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTranscoder", "init decoder ret: %s", java.lang.Integer.valueOf(b17));
        if (b17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTranscoder", "init mediaCodecDecoder failed, try ffmepg");
            try {
                ((com.p314xaae8f345.mm.p962x4177e4be.g) this.f153275s).d();
                this.f153275s = null;
            } catch (java.lang.Exception unused) {
            }
            com.p314xaae8f345.mm.p962x4177e4be.g gVar2 = new com.p314xaae8f345.mm.p962x4177e4be.g(this.f153273q, mediaFormat, this.f153274r);
            this.f153275s = gVar2;
            b17 = gVar2.b(this.f153272p, this.f153257a, this.f153258b);
        }
        ((com.p314xaae8f345.mm.p962x4177e4be.g) this.f153275s).f153212b = this;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTranscoder", "init finish, ret: %d, decoderType: %d", java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(f153256x));
        return b17;
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTranscoder", "release, decoderType: %d", java.lang.Integer.valueOf(f153256x));
        try {
            try {
                com.p314xaae8f345.mm.p962x4177e4be.b bVar = this.f153275s;
                if (bVar != null) {
                    ((com.p314xaae8f345.mm.p962x4177e4be.g) bVar).d();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoTranscoder", "release error: %s", e17.getMessage());
            }
        } finally {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66900xd4bce0ad(0);
            f153256x = -1;
        }
    }

    public final android.graphics.Point d(int i17, int i18, int i19, int i27) {
        int i28;
        int i29;
        if (i17 <= i19 && i18 <= i27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTranscoder", "calc scale, small or equal to spec size");
            return null;
        }
        int max = java.lang.Math.max(i17, i18);
        int min = java.lang.Math.min(i17, i18);
        int max2 = java.lang.Math.max(i19, i27);
        int min2 = java.lang.Math.min(i19, i27);
        if (max % 16 == 0 && java.lang.Math.abs(max - max2) < 16 && min % 16 == 0 && java.lang.Math.abs(min - min2) < 16) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTranscoder", "calc scale, same len divide by 16, no need scale");
            return null;
        }
        int i37 = max / 2;
        if (i37 == max2 && min / 2 == min2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTranscoder", "calc scale, double ratio");
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTranscoder", "calc scale, double ratio divide by 16");
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTranscoder", "calc scale, outputsize: %s %s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
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
