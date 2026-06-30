package w8;

/* loaded from: classes15.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f525291a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f525292b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f525293c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f525294d;

    /* renamed from: e, reason: collision with root package name */
    public int f525295e;

    public s(int i17, int i18) {
        this.f525291a = i17;
        byte[] bArr = new byte[i18 + 3];
        this.f525294d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i17, int i18) {
        if (this.f525292b) {
            int i19 = i18 - i17;
            byte[] bArr2 = this.f525294d;
            int length = bArr2.length;
            int i27 = this.f525295e;
            if (length < i27 + i19) {
                this.f525294d = java.util.Arrays.copyOf(bArr2, (i27 + i19) * 2);
            }
            java.lang.System.arraycopy(bArr, i17, this.f525294d, this.f525295e, i19);
            this.f525295e += i19;
        }
    }

    public boolean b(int i17) {
        if (!this.f525292b) {
            return false;
        }
        this.f525295e -= i17;
        this.f525292b = false;
        this.f525293c = true;
        return true;
    }

    public void c() {
        this.f525292b = false;
        this.f525293c = false;
    }

    public void d(int i17) {
        t9.a.d(!this.f525292b);
        boolean z17 = i17 == this.f525291a;
        this.f525292b = z17;
        if (z17) {
            this.f525295e = 3;
            this.f525293c = false;
        }
    }
}
