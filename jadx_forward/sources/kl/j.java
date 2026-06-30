package kl;

/* loaded from: classes13.dex */
public class j implements kl.l {

    /* renamed from: a, reason: collision with root package name */
    public int f390265a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f390266b = 0;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p630x58d9bd6.mix.jni.C5141x59f24b9c f390267c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390268d;

    /* renamed from: e, reason: collision with root package name */
    public java.nio.ByteBuffer f390269e;

    @Override // kl.l
    public byte[] a(byte[] bArr) {
        int ceil = ((int) java.lang.Math.ceil(((bArr.length / 2) / 2) * (this.f390266b / this.f390265a))) * 2 * 2;
        java.nio.ByteBuffer byteBuffer = this.f390269e;
        if (byteBuffer == null || byteBuffer.capacity() < ceil) {
            this.f390269e = java.nio.ByteBuffer.allocateDirect(ceil).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        }
        java.nio.ByteBuffer m43239xf12825fd = this.f390267c.m43239xf12825fd(this.f390268d, this.f390265a, this.f390266b, bArr, bArr.length, this.f390269e);
        this.f390269e = m43239xf12825fd;
        if (m43239xf12825fd != null) {
            byte[] bArr2 = new byte[m43239xf12825fd.remaining()];
            m43239xf12825fd.get(bArr2);
            return bArr2;
        }
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.FFmpegResampleAlgorithm", "Failed to resample", null);
        return bArr;
    }

    @Override // kl.l
    public boolean b(java.lang.String str, int i17, int i18, int i19, int i27) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19)};
        int i28 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.FFmpegResampleAlgorithm", "ffmpeg resample algorithm  sSample:%d, dSample:%d", objArr);
        this.f390265a = i17;
        this.f390266b = i19;
        this.f390268d = str;
        com.p314xaae8f345.mm.p630x58d9bd6.mix.jni.C5141x59f24b9c c5141x59f24b9c = new com.p314xaae8f345.mm.p630x58d9bd6.mix.jni.C5141x59f24b9c();
        this.f390267c = c5141x59f24b9c;
        c5141x59f24b9c.m43238x72008acd(str, i17, i19, 2, 2);
        return true;
    }

    @Override // kl.l
    /* renamed from: release */
    public boolean mo143609x41012807() {
        this.f390267c.m43237xbee24f0a(this.f390268d);
        return false;
    }
}
