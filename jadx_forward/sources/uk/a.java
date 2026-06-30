package uk;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static final long f510012b = -1600969123;

    /* renamed from: a, reason: collision with root package name */
    public final int f510013a;

    public a(int i17) {
        this.f510013a = 0;
        this.f510013a = i17;
    }

    public static uk.a a(byte[] bArr) {
        if (bArr.length == 8) {
            long j17 = 0;
            for (int i17 = 0; i17 < bArr.length; i17++) {
                j17 |= (bArr[i17] & 255) << (i17 * 8);
            }
            if ((j17 >> 32) == f510012b) {
                return new uk.a((int) j17);
            }
        }
        return null;
    }
}
