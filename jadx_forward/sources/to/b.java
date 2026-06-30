package to;

/* loaded from: classes14.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f502413a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f502414b = 0;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f502415c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f502416d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f502417e = 0;

    public int a() {
        int i17 = this.f502416d;
        int i18 = this.f502417e;
        if (i17 == i18) {
            return 0;
        }
        if (i17 < i18) {
            this.f502414b = i18 - i17;
        } else if (i17 > i18) {
            this.f502414b = (i18 + this.f502413a) - i17;
        }
        return this.f502414b;
    }

    public int b(byte[] bArr, int i17) {
        int i18 = -1;
        if (i17 > 0 && i17 <= a() && bArr != null) {
            int i19 = this.f502416d;
            int i27 = this.f502417e;
            if (i19 == i27) {
                return -1;
            }
            i18 = 0;
            if (i19 < i27) {
                java.lang.System.arraycopy(this.f502415c, i19, bArr, 0, i17);
                this.f502416d += i17;
            } else {
                int i28 = this.f502413a;
                if (i17 <= i28 - i19) {
                    java.lang.System.arraycopy(this.f502415c, i19, bArr, 0, i17);
                    this.f502416d += i17;
                } else {
                    java.lang.System.arraycopy(this.f502415c, i19, bArr, 0, i28 - i19);
                    byte[] bArr2 = this.f502415c;
                    int i29 = this.f502413a;
                    int i37 = this.f502416d;
                    java.lang.System.arraycopy(bArr2, 0, bArr, i29 - i37, i17 - (i29 - i37));
                    this.f502416d = i17 - (this.f502413a - this.f502416d);
                }
            }
        }
        return i18;
    }
}
