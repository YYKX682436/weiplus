package w8;

/* loaded from: classes15.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f525179e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f525180a;

    /* renamed from: b, reason: collision with root package name */
    public int f525181b;

    /* renamed from: c, reason: collision with root package name */
    public int f525182c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f525183d;

    public i(int i17) {
        this.f525183d = new byte[i17];
    }

    public void a(byte[] bArr, int i17, int i18) {
        if (this.f525180a) {
            int i19 = i18 - i17;
            byte[] bArr2 = this.f525183d;
            int length = bArr2.length;
            int i27 = this.f525181b;
            if (length < i27 + i19) {
                this.f525183d = java.util.Arrays.copyOf(bArr2, (i27 + i19) * 2);
            }
            java.lang.System.arraycopy(bArr, i17, this.f525183d, this.f525181b, i19);
            this.f525181b += i19;
        }
    }
}
