package v8;

/* loaded from: classes15.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f515560a;

    /* renamed from: b, reason: collision with root package name */
    public final int f515561b;

    /* renamed from: c, reason: collision with root package name */
    public int f515562c;

    /* renamed from: d, reason: collision with root package name */
    public int f515563d;

    public o(byte[] bArr) {
        this.f515560a = bArr;
        this.f515561b = bArr.length;
    }

    public boolean a() {
        boolean z17 = (((this.f515560a[this.f515562c] & 255) >> this.f515563d) & 1) == 1;
        c(1);
        return z17;
    }

    public int b(int i17) {
        int i18 = this.f515562c;
        int min = java.lang.Math.min(i17, 8 - this.f515563d);
        int i19 = i18 + 1;
        byte[] bArr = this.f515560a;
        int i27 = ((bArr[i18] & 255) >> this.f515563d) & (255 >> (8 - min));
        while (min < i17) {
            i27 |= (bArr[i19] & 255) << min;
            min += 8;
            i19++;
        }
        int i28 = i27 & ((-1) >>> (32 - i17));
        c(i17);
        return i28;
    }

    public void c(int i17) {
        int i18;
        int i19 = i17 / 8;
        int i27 = this.f515562c + i19;
        this.f515562c = i27;
        int i28 = this.f515563d + (i17 - (i19 * 8));
        this.f515563d = i28;
        boolean z17 = true;
        if (i28 > 7) {
            this.f515562c = i27 + 1;
            this.f515563d = i28 - 8;
        }
        int i29 = this.f515562c;
        if (i29 < 0 || (i29 >= (i18 = this.f515561b) && (i29 != i18 || this.f515563d != 0))) {
            z17 = false;
        }
        t9.a.d(z17);
    }
}
