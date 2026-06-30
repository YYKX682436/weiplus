package kl;

/* loaded from: classes13.dex */
public class n implements kl.l {

    /* renamed from: a, reason: collision with root package name */
    public int f390273a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f390274b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f390275c;

    @Override // kl.l
    public byte[] a(byte[] bArr) {
        short[] a17 = kl.a.a(bArr, bArr.length);
        int length = a17.length;
        int i17 = this.f390274b;
        int i18 = this.f390273a;
        int i19 = (length * i17) / i18;
        if (i17 % i18 != 0) {
            i19++;
        }
        short[] sArr = new short[i19];
        if (com.p314xaae8f345.mm.p630x58d9bd6.mix.jni.C5142xf133bb13.m43244xf12825fd(this.f390275c, i18, i17, a17, a17.length, sArr) != -1) {
            return kl.a.d(sArr);
        }
        java.lang.Object[] objArr = {this.f390275c};
        int i27 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.SilkResampleAlgorithm", "resamplePcm result is -1, fileName:%s", objArr);
        return null;
    }

    @Override // kl.l
    public boolean b(java.lang.String str, int i17, int i18, int i19, int i27) {
        this.f390273a = i17;
        this.f390274b = i19;
        this.f390275c = str;
        java.lang.Object[] objArr = {str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19)};
        int i28 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.SilkResampleAlgorithm", "initResample, fileName:%s, sSample:%d, dSample:%d", objArr);
        if (com.p314xaae8f345.mm.p630x58d9bd6.mix.jni.C5142xf133bb13.m43243x72008acd(str, i17, i19) != -1) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.SilkResampleAlgorithm", "initResample result is -1, fileName:%s", str);
        return false;
    }

    @Override // kl.l
    /* renamed from: release */
    public boolean mo143609x41012807() {
        if (com.p314xaae8f345.mm.p630x58d9bd6.mix.jni.C5142xf133bb13.m43241xbee24f0a(this.f390275c) == -1) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.SilkResampleAlgorithm", "clearResample result is -1", null);
            return false;
        }
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.SilkResampleAlgorithm", "release", null);
        return true;
    }
}
