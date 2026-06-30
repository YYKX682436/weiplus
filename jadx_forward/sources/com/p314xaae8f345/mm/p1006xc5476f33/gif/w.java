package com.p314xaae8f345.mm.p1006xc5476f33.gif;

/* loaded from: classes10.dex */
public class w implements com.p314xaae8f345.mm.p1006xc5476f33.gif.a {

    /* renamed from: a, reason: collision with root package name */
    public long f223743a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f223744b;

    /* renamed from: c, reason: collision with root package name */
    public final int f223745c;

    /* renamed from: d, reason: collision with root package name */
    public final int f223746d;

    /* renamed from: e, reason: collision with root package name */
    public final long f223747e;

    /* renamed from: f, reason: collision with root package name */
    public int f223748f;

    /* renamed from: g, reason: collision with root package name */
    public final int f223749g;

    public w(java.lang.String str, int i17, int i18, long j17) {
        this.f223743a = 0L;
        this.f223749g = -1;
        this.f223744b = str;
        this.f223745c = i17;
        this.f223746d = i18;
        this.f223747e = j17;
        this.f223748f = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxAMEncoder", "create MMWxAMEncoder, width: %s, height: %s, frameDurationMs: %s, outputPath: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.gif.a
    public boolean a(byte[] bArr, long j17) {
        if (this.f223743a != 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            int length = bArr.length;
            int i17 = this.f223745c;
            int i18 = this.f223746d;
            if (length == i17 * i18 * 4) {
                if (j17 < 0) {
                    j17 = this.f223747e;
                }
                int m64967x3000772c = com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64967x3000772c(this.f223743a, i17, i18, bArr, j17);
                if (m64967x3000772c < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWxAMEncoder", "add rgba frame failed: %s", java.lang.Integer.valueOf(m64967x3000772c));
                    return false;
                }
                this.f223748f++;
                return true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxAMEncoder", "add rgba frame failed, frame size or encoder ptr is not match");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.gif.a
    public boolean b() {
        if (this.f223743a != 0) {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_enc_report_a, 0);
            long[] jArr = new long[26];
            byte[] m64972x483a8e01 = Ni == 1 ? com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64972x483a8e01(this.f223743a, jArr) : com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64971xf7f7926d(this.f223743a);
            if (m64972x483a8e01 == null || m64972x483a8e01.length <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxAMEncoder", "finish encode error, buf: %s", java.util.Arrays.toString(m64972x483a8e01));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxAMEncoder", "encoder buffer size: %s", java.lang.Integer.valueOf(m64972x483a8e01.length));
                if (Ni == 1) {
                    jx3.f fVar = jx3.f.INSTANCE;
                    int i17 = this.f223745c;
                    int i18 = this.f223746d;
                    fVar.mo68478xbd3cda5f(com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.f37011xf9c45774, fVar.s(6, 7, java.lang.Integer.valueOf(i17 * i18 * 4 * this.f223748f), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(jArr[6]), java.lang.Long.valueOf(jArr[7]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[9]), java.lang.Long.valueOf(jArr[10]), java.lang.Long.valueOf(jArr[11]), java.lang.Long.valueOf(jArr[12]), java.lang.Long.valueOf(jArr[13]), java.lang.Long.valueOf(jArr[14]), java.lang.Long.valueOf(jArr[15]), java.lang.Long.valueOf(jArr[16]), java.lang.Long.valueOf(jArr[17]), java.lang.Long.valueOf(jArr[18]), java.lang.Long.valueOf(jArr[19]), java.lang.Long.valueOf(jArr[20]), java.lang.Long.valueOf(jArr[21]), java.lang.Long.valueOf(jArr[22]), java.lang.Long.valueOf(jArr[23]), java.lang.Long.valueOf(jArr[24]), java.lang.Long.valueOf(jArr[25])));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxAMEncoder", "MMWxAMEncoder finishEncode report:scene[%d], type[%d], srcSize[%d], dstSize[%d], ver[%d], time[%d]", 6, java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[8]), java.lang.Long.valueOf(jArr[17]), java.lang.Long.valueOf(jArr[18]));
                }
                java.lang.String str = this.f223744b;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.mm.vfs.w6.S(str, m64972x483a8e01, 0, m64972x483a8e01.length);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.gif.a
    /* renamed from: init */
    public boolean mo65002x316510() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_fasthb_a, 0);
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wxam_other_roi_a, 0);
        int i17 = Ni != 0 ? 1 : 0;
        long m64979x2cb3b948 = com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64979x2cb3b948(this.f223745c, this.f223746d, this.f223747e, this.f223749g, (i17 << 8) + (Ni2 != 0 ? 1 : 0), 0, 0, 0);
        this.f223743a = m64979x2cb3b948;
        if (m64979x2cb3b948 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxAMEncoder", "successfully init wxam encoder: %s", java.lang.Long.valueOf(m64979x2cb3b948));
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(852, 12);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWxAMEncoder", "init wxam encoder failed! %s", java.lang.Long.valueOf(this.f223743a));
        return false;
    }

    public w(java.lang.String str, int i17, int i18, long j17, int i19) {
        this.f223743a = 0L;
        this.f223749g = -1;
        this.f223744b = str;
        this.f223745c = i17;
        this.f223746d = i18;
        this.f223747e = j17;
        this.f223748f = 0;
        this.f223749g = i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxAMEncoder", "create MMWxAMEncoder, width: %s, height: %s, frameDurationMs: %s, qp: %s, outputPath: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i19), str);
    }
}
