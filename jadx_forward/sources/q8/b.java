package q8;

/* loaded from: classes15.dex */
public final class b implements q8.f {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f442148g = new byte[4096];

    /* renamed from: a, reason: collision with root package name */
    public final r9.k f442149a;

    /* renamed from: b, reason: collision with root package name */
    public final long f442150b;

    /* renamed from: c, reason: collision with root package name */
    public long f442151c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f442152d = new byte[65536];

    /* renamed from: e, reason: collision with root package name */
    public int f442153e;

    /* renamed from: f, reason: collision with root package name */
    public int f442154f;

    public b(r9.k kVar, long j17, long j18) {
        this.f442149a = kVar;
        this.f442151c = j17;
        this.f442150b = j18;
    }

    public boolean a(int i17, boolean z17) {
        int i18 = this.f442153e + i17;
        byte[] bArr = this.f442152d;
        if (i18 > bArr.length) {
            int i19 = t9.d0.f498031a;
            this.f442152d = java.util.Arrays.copyOf(this.f442152d, java.lang.Math.max(65536 + i18, java.lang.Math.min(bArr.length * 2, i18 + 524288)));
        }
        int min = java.lang.Math.min(this.f442154f - this.f442153e, i17);
        while (min < i17) {
            min = d(this.f442152d, this.f442153e, i17, min, z17);
            if (min == -1) {
                return false;
            }
        }
        int i27 = this.f442153e + i17;
        this.f442153e = i27;
        this.f442154f = java.lang.Math.max(this.f442154f, i27);
        return true;
    }

    public boolean b(byte[] bArr, int i17, int i18, boolean z17) {
        if (!a(i18, z17)) {
            return false;
        }
        java.lang.System.arraycopy(this.f442152d, this.f442153e - i18, bArr, i17, i18);
        return true;
    }

    public int c(byte[] bArr, int i17, int i18) {
        int i19 = this.f442154f;
        int i27 = 0;
        if (i19 != 0) {
            int min = java.lang.Math.min(i19, i18);
            java.lang.System.arraycopy(this.f442152d, 0, bArr, i17, min);
            g(min);
            i27 = min;
        }
        if (i27 == 0) {
            i27 = d(bArr, i17, i18, 0, true);
        }
        if (i27 != -1) {
            this.f442151c += i27;
        }
        return i27;
    }

    public final int d(byte[] bArr, int i17, int i18, int i19, boolean z17) {
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        int a17 = this.f442149a.a(bArr, i17 + i19, i18 - i19);
        if (a17 != -1) {
            return i19 + a17;
        }
        if (i19 == 0 && z17) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    public boolean e(byte[] bArr, int i17, int i18, boolean z17) {
        int min;
        int i19 = this.f442154f;
        if (i19 == 0) {
            min = 0;
        } else {
            min = java.lang.Math.min(i19, i18);
            java.lang.System.arraycopy(this.f442152d, 0, bArr, i17, min);
            g(min);
        }
        int i27 = min;
        while (i27 < i18 && i27 != -1) {
            i27 = d(bArr, i17, i18, i27, z17);
        }
        if (i27 != -1) {
            this.f442151c += i27;
        }
        return i27 != -1;
    }

    public void f(int i17) {
        int min = java.lang.Math.min(this.f442154f, i17);
        g(min);
        int i18 = min;
        while (i18 < i17 && i18 != -1) {
            i18 = d(f442148g, -i18, java.lang.Math.min(i17, i18 + 4096), i18, false);
        }
        if (i18 != -1) {
            this.f442151c += i18;
        }
    }

    public final void g(int i17) {
        int i18 = this.f442154f - i17;
        this.f442154f = i18;
        this.f442153e = 0;
        byte[] bArr = this.f442152d;
        byte[] bArr2 = i18 < bArr.length - 524288 ? new byte[65536 + i18] : bArr;
        java.lang.System.arraycopy(bArr, i17, bArr2, 0, i18);
        this.f442152d = bArr2;
    }
}
