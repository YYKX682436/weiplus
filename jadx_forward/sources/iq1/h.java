package iq1;

/* loaded from: classes13.dex */
public class h extends iq1.a {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String f375217r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String f375218s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String f375219t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String f375220u;

    /* renamed from: g, reason: collision with root package name */
    public byte f375221g;

    /* renamed from: h, reason: collision with root package name */
    public byte f375222h;

    /* renamed from: i, reason: collision with root package name */
    public byte f375223i;

    /* renamed from: m, reason: collision with root package name */
    public byte f375224m;

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f375225n;

    /* renamed from: o, reason: collision with root package name */
    public int f375226o;

    /* renamed from: p, reason: collision with root package name */
    public byte f375227p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f375228q;

    static {
        int i17 = hq1.n0.f364706a;
        f375217r = "0000feb1-0000-1000-8000-00805f9b34fb";
        f375218s = "0000feb2-0000-1000-8000-00805f9b34fb";
        f375219t = "0000feb3-0000-1000-8000-00805f9b34fb";
        f375220u = "0000feb4-0000-1000-8000-00805f9b34fb";
    }

    public h() {
        this.f375201e = null;
        this.f375202f = 8;
        this.f375200d = 16L;
        this.f375221g = (byte) 0;
        this.f375222h = (byte) 0;
        this.f375223i = (byte) 0;
        this.f375224m = (byte) 0;
        this.f375225n = new byte[]{0, 0};
        this.f375226o = -1;
        this.f375227p = (byte) 0;
        this.f375228q = null;
    }

    @Override // iq1.a
    public byte[] a() {
        if (this.f375201e.equalsIgnoreCase(f375217r)) {
            byte[] bArr = new byte[3];
            java.lang.System.arraycopy(java.lang.Byte.valueOf(this.f375221g), 0, bArr, 0, 1);
            java.lang.System.arraycopy(java.lang.Byte.valueOf(this.f375222h), 0, bArr, 1, 1);
            java.lang.System.arraycopy(java.lang.Byte.valueOf(this.f375223i), 0, bArr, 2, 1);
            return bArr;
        }
        if (this.f375201e.equalsIgnoreCase(f375218s)) {
            byte[] bArr2 = new byte[1];
            java.lang.System.arraycopy(java.lang.Byte.valueOf(this.f375224m), 0, bArr2, 0, 1);
            return bArr2;
        }
        if (!this.f375201e.equalsIgnoreCase(f375220u)) {
            return null;
        }
        int i17 = this.f375226o;
        byte[] bArr3 = new byte[i17];
        java.lang.System.arraycopy(java.lang.Byte.valueOf((byte) (i17 & 255)), 0, bArr3, 0, 1);
        java.lang.System.arraycopy(java.lang.Byte.valueOf((byte) ((i17 >> 8) & 255)), 0, bArr3, 1, 1);
        java.lang.System.arraycopy(java.lang.Byte.valueOf(this.f375227p), 0, bArr3, 2, 1);
        int i18 = this.f375226o;
        if (i18 > 3) {
            java.lang.System.arraycopy(this.f375228q, 0, bArr3, 3, i18 - 3);
        }
        return bArr3;
    }
}
