package com.p314xaae8f345.mm.p1006xc5476f33.gif;

/* loaded from: classes8.dex */
public class p implements com.p314xaae8f345.mm.p1006xc5476f33.gif.a {

    /* renamed from: a, reason: collision with root package name */
    public long f223713a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f223714b;

    /* renamed from: c, reason: collision with root package name */
    public final int f223715c;

    /* renamed from: d, reason: collision with root package name */
    public final int f223716d;

    /* renamed from: e, reason: collision with root package name */
    public final long f223717e;

    public p(java.lang.String str, int i17, int i18, long j17) {
        this.f223714b = str;
        this.f223715c = i17;
        this.f223716d = i18;
        this.f223717e = j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMGifEncoder", "create MMGifEncoder, width: %s, height: %s, frameDurationMs: %s, outputPath: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.gif.a
    public boolean a(byte[] bArr, long j17) {
        if (this.f223713a != 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            int length = bArr.length;
            int i17 = this.f223715c;
            int i18 = this.f223716d;
            if (length == i17 * i18 * 4) {
                if (j17 < 0) {
                    j17 = this.f223717e;
                }
                int m64966xf0deed69 = com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64966xf0deed69(this.f223713a, i17, i18, bArr, j17);
                if (m64966xf0deed69 >= 0) {
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMGifEncoder", "add rgba frame failed: %s", java.lang.Integer.valueOf(m64966xf0deed69));
                return false;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMGifEncoder", "add rgba frame failed, frame size or encoder ptr is not match");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.gif.a
    public boolean b() {
        long j17 = this.f223713a;
        if (j17 != 0) {
            byte[] m64970x70ae3690 = com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64970x70ae3690(j17);
            if (m64970x70ae3690 == null || m64970x70ae3690.length <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMGifEncoder", "finish encode error, buf: %s", java.util.Arrays.toString(m64970x70ae3690));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMGifEncoder", "encoder buffer size: %s", java.lang.Integer.valueOf(m64970x70ae3690.length));
                java.lang.String str = this.f223714b;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.mm.vfs.w6.S(str, m64970x70ae3690, 0, m64970x70ae3690.length);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.gif.a
    /* renamed from: init */
    public boolean mo65002x316510() {
        long m64977xd2c040f3 = com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64977xd2c040f3(this.f223715c, this.f223716d, this.f223717e);
        this.f223713a = m64977xd2c040f3;
        if (m64977xd2c040f3 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMGifEncoder", "successfully init wxam encoder: %s", java.lang.Long.valueOf(m64977xd2c040f3));
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(852, 11);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMGifEncoder", "init gif encoder failed! %s", java.lang.Long.valueOf(this.f223713a));
        return false;
    }
}
