package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856;

/* renamed from: com.tencent.qqmusic.mediaplayer.seektable.ParsableInputStreamWrapper */
/* loaded from: classes13.dex */
public class C25409x5a03bad5 implements java.io.Closeable, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c {

    /* renamed from: dataSource */
    private final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e f45975x4bd85c65;

    /* renamed from: intBuffer */
    private final byte[] f45976xe266290f = new byte[4];

    /* renamed from: longBuffer */
    private final byte[] f45977xbb4b79dc = new byte[8];

    /* renamed from: position */
    private long f45978x2c929929 = 0;

    public C25409x5a03bad5(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e) {
        this.f45975x4bd85c65 = interfaceC25439x37e1318e;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c
    /* renamed from: available */
    public long mo94149xd4418ac9() {
        return this.f45975x4bd85c65.mo94260xfb854877() - this.f45978x2c929929;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f45975x4bd85c65.close();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c
    /* renamed from: readBytes */
    public void mo94150xbc0c0475(byte[] bArr, int i17, int i18) {
        this.f45978x2c929929 = this.f45978x2c929929 + this.f45975x4bd85c65.mo94264xc8455469(r6, bArr, i17, i18);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c
    /* renamed from: readInt */
    public int mo94151x40655679() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e = this.f45975x4bd85c65;
        long j17 = this.f45978x2c929929;
        byte[] bArr = this.f45976xe266290f;
        int mo94264xc8455469 = interfaceC25439x37e1318e.mo94264xc8455469(j17, bArr, 0, bArr.length);
        this.f45978x2c929929 += mo94264xc8455469;
        byte[] bArr2 = this.f45976xe266290f;
        if (mo94264xc8455469 != bArr2.length) {
            return -1;
        }
        return ((bArr2[0] & 255) << 24) | ((bArr2[1] & 255) << 16) | ((bArr2[2] & 255) << 8) | (bArr2[3] & 255);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c
    /* renamed from: readIntArray */
    public int[] mo94152xc9c44f60(int i17) {
        int[] iArr = new int[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            iArr[i18] = mo94151x40655679();
        }
        return iArr;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c
    /* renamed from: readIntArrayInterleaved */
    public void mo94153xcc8fd4e9(int i17, int[]... iArr) {
        for (int i18 = 0; i18 < i17; i18++) {
            for (int[] iArr2 : iArr) {
                iArr2[i18] = mo94151x40655679();
            }
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c
    /* renamed from: readLong */
    public long mo94154xcc46d932() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e = this.f45975x4bd85c65;
        long j17 = this.f45978x2c929929;
        byte[] bArr = this.f45977xbb4b79dc;
        int mo94264xc8455469 = interfaceC25439x37e1318e.mo94264xc8455469(j17, bArr, 0, bArr.length);
        this.f45978x2c929929 += mo94264xc8455469;
        if (mo94264xc8455469 != this.f45977xbb4b79dc.length) {
            return -1L;
        }
        return (r1[7] & 255) | ((r1[0] & 255) << 56) | ((r1[1] & 255) << 48) | ((r1[2] & 255) << 40) | ((r1[3] & 255) << 32) | ((r1[4] & 255) << 24) | ((r1[5] & 255) << 16) | ((r1[6] & 255) << 8);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c
    /* renamed from: readLongArray */
    public long[] mo94155x94349847(int i17) {
        long[] jArr = new long[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            jArr[i18] = mo94154xcc46d932();
        }
        return jArr;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c
    /* renamed from: readLongArrayInterleaved */
    public void mo94156x3eec5a2(int i17, long[]... jArr) {
        for (int i18 = 0; i18 < i17; i18++) {
            for (long[] jArr2 : jArr) {
                jArr2[i18] = mo94154xcc46d932();
            }
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c
    /* renamed from: readString */
    public java.lang.String mo94157xe22f9d47(int i17) {
        byte[] bArr = new byte[i17];
        mo94150xbc0c0475(bArr, 0, i17);
        return new java.lang.String(bArr, java.nio.charset.Charset.defaultCharset());
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c
    /* renamed from: skip */
    public long mo94158x35e57f(long j17) {
        long mo94149xd4418ac9 = mo94149xd4418ac9();
        if (mo94149xd4418ac9 > j17) {
            this.f45978x2c929929 += j17;
            return j17;
        }
        this.f45978x2c929929 += mo94149xd4418ac9;
        return mo94149xd4418ac9;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c
    /* renamed from: tell */
    public long mo94159x3643b1() {
        return this.f45978x2c929929;
    }
}
