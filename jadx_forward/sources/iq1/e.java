package iq1;

/* loaded from: classes13.dex */
public class e extends iq1.a {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f375207i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f375208m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f375209n;

    /* renamed from: g, reason: collision with root package name */
    public iq1.c f375210g;

    /* renamed from: h, reason: collision with root package name */
    public iq1.b f375211h;

    static {
        int i17 = hq1.n0.f364706a;
        f375207i = "00002a35-0000-1000-8000-00805f9b34fb";
        f375208m = "00002a36-0000-1000-8000-00805f9b34fb";
        f375209n = "00002a49-0000-1000-8000-00805f9b34fb";
    }

    public e() {
        this.f375201e = null;
        this.f375202f = 2;
        this.f375200d = 8L;
        this.f375210g = null;
    }

    public static double d(byte[] bArr, int i17) {
        int i18 = (bArr[i17 + 1] << 8) & 65280;
        return ((bArr[i17] & 255) + (i18 & 3840 & 65280)) * java.lang.Math.pow(10.0d, (i18 >> 12) - 16);
    }

    @Override // iq1.a
    public byte[] a() {
        return null;
    }
}
