package nl;

/* loaded from: classes13.dex */
public abstract class e implements nl.f {

    /* renamed from: a, reason: collision with root package name */
    public short[][] f419680a = (short[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Short.TYPE, 1, 1);

    /* renamed from: b, reason: collision with root package name */
    public int f419681b = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f419682c = 1;

    /* renamed from: d, reason: collision with root package name */
    public short[] f419683d = new short[1];

    /* renamed from: e, reason: collision with root package name */
    public int f419684e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final int f419685f = 32767;

    /* renamed from: g, reason: collision with root package name */
    public final int f419686g = -32768;

    /* renamed from: h, reason: collision with root package name */
    public hl.b f419687h;

    public byte[] a(int i17, int i18) {
        hl.b bVar = this.f419687h;
        byte[] bArr = bVar != null ? bVar.f363549c : null;
        if (bArr == null || bArr.length != i17) {
            bArr = new byte[i17];
        }
        for (int i19 = 0; i19 < i18; i19++) {
            int i27 = i19 * 2;
            short s17 = this.f419683d[i19];
            bArr[i27] = (byte) (s17 & 255);
            bArr[i27 + 1] = (byte) ((s17 & 65280) >> 8);
        }
        return bArr;
    }

    public abstract byte[] b(int i17, int i18, int i19);

    public short c(int i17) {
        int i18 = this.f419685f;
        if (i17 > i18) {
            return (short) i18;
        }
        int i19 = this.f419686g;
        return i17 < i19 ? (short) i19 : (short) i17;
    }
}
