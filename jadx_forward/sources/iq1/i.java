package iq1;

/* loaded from: classes13.dex */
public class i extends iq1.a {

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f375229m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f375230n;

    /* renamed from: g, reason: collision with root package name */
    public int f375231g;

    /* renamed from: h, reason: collision with root package name */
    public int f375232h;

    /* renamed from: i, reason: collision with root package name */
    public int f375233i;

    static {
        int i17 = hq1.n0.f364706a;
        f375229m = "0000fea1-0000-1000-8000-00805f9b34fb";
        f375230n = "0000fea2-0000-1000-8000-00805f9b34fb";
    }

    public i() {
        this.f375201e = null;
        this.f375202f = 8;
        this.f375200d = 1L;
        this.f375231g = -1;
        this.f375232h = -1;
        this.f375233i = -1;
    }

    @Override // iq1.a
    public byte[] a() {
        if (this.f375231g < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("iq1.i", "stepCount is invalid");
            return null;
        }
        int i17 = this.f375232h >= 0 ? 7 : 4;
        if (this.f375233i >= 0) {
            i17 += 3;
        }
        byte[] bArr = new byte[i17];
        bArr[0] = 1;
        int i18 = 1;
        for (int i19 = 0; i19 < 3; i19++) {
            bArr[i18] = (byte) ((this.f375231g >> (i19 * 8)) & 255);
            i18++;
        }
        if (this.f375232h >= 0) {
            bArr[0] = (byte) (bArr[0] | 2);
            for (int i27 = 0; i27 < 3; i27++) {
                bArr[i18] = (byte) ((this.f375232h >> (i27 * 8)) & 255);
                i18++;
            }
        }
        if (this.f375233i >= 0) {
            bArr[0] = 4;
            for (int i28 = 0; i28 < 3; i28++) {
                bArr[i18] = (byte) ((this.f375233i >> (i28 * 8)) & 255);
                i18++;
            }
        }
        return bArr;
    }
}
