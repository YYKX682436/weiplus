package v8;

/* loaded from: classes15.dex */
public final class j extends v8.n {

    /* renamed from: o, reason: collision with root package name */
    public static final int f515542o = t9.d0.f("Opus");

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f515543p = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n, reason: collision with root package name */
    public boolean f515544n;

    @Override // v8.n
    public long b(t9.p pVar) {
        int i17;
        byte[] bArr = pVar.f498073a;
        int i18 = bArr[0] & 255;
        int i19 = i18 & 3;
        if (i19 != 0) {
            i17 = 2;
            if (i19 != 1 && i19 != 2) {
                i17 = bArr[1] & 63;
            }
        } else {
            i17 = 1;
        }
        int i27 = i18 >> 3;
        return (this.f515555i * (i17 * (i27 >= 16 ? 2500 << r1 : i27 >= 12 ? 10000 << (r1 & 1) : (i27 & 3) == 3 ? com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8 : 10000 << r1))) / 1000000;
    }

    @Override // v8.n
    public boolean c(t9.p pVar, long j17, v8.l lVar) {
        if (this.f515544n) {
            boolean z17 = pVar.c() == f515542o;
            pVar.w(0);
            return z17;
        }
        byte[] copyOf = java.util.Arrays.copyOf(pVar.f498073a, pVar.f498075c);
        int i17 = copyOf[9] & 255;
        int i18 = ((copyOf[11] & 255) << 8) | (copyOf[10] & 255);
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        arrayList.add(copyOf);
        e(arrayList, i18);
        e(arrayList, 3840);
        lVar.f515545a = com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417.c(null, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54262x7b041728, null, -1, -1, i17, 48000, arrayList, null, 0, null);
        this.f515544n = true;
        return true;
    }

    @Override // v8.n
    public void d(boolean z17) {
        super.d(z17);
        if (z17) {
            this.f515544n = false;
        }
    }

    public final void e(java.util.List list, int i17) {
        list.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong((i17 * 1000000000) / 48000).array());
    }
}
