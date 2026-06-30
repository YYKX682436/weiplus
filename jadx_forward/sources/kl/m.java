package kl;

/* loaded from: classes13.dex */
public class m implements kl.l {

    /* renamed from: a, reason: collision with root package name */
    public int f390270a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f390271b = 0;

    /* renamed from: c, reason: collision with root package name */
    public short[] f390272c;

    @Override // kl.l
    public byte[] a(byte[] bArr) {
        int length = kl.a.a(bArr, bArr.length).length - 1;
        int length2 = (int) (r9.length * (this.f390271b / this.f390270a));
        short[] sArr = this.f390272c;
        if (sArr == null || sArr.length != length2) {
            this.f390272c = new short[length2];
        }
        java.util.Arrays.fill(this.f390272c, 0, length2, (short) 0);
        for (int i17 = 0; i17 < length2; i17++) {
            float f17 = (i17 * this.f390270a) / this.f390271b;
            int i18 = (int) f17;
            float f18 = f17 - i18;
            this.f390272c[i17] = (short) (((1.0f - f18) * r9[i18]) + (f18 * r9[i18 == length ? length : i18 + 1]));
        }
        return kl.a.d(this.f390272c);
    }

    @Override // kl.l
    public boolean b(java.lang.String str, int i17, int i18, int i19, int i27) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19)};
        int i28 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.LinearResampleAlgorithm", "linear resample algorithm  sSample:%d, dSample:%d", objArr);
        this.f390270a = i17;
        this.f390271b = i19;
        return true;
    }

    @Override // kl.l
    /* renamed from: release */
    public boolean mo143609x41012807() {
        return false;
    }
}
