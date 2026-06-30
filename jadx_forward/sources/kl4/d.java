package kl4;

/* loaded from: classes13.dex */
public final class d implements com.p314xaae8f345.mm.p630x58d9bd6.mix.p631xb06291ee.InterfaceC5140x264f60fc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.io.ByteArrayOutputStream f390430a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f390431b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f390432c;

    public d(java.io.ByteArrayOutputStream byteArrayOutputStream, int i17, long j17) {
        this.f390430a = byteArrayOutputStream;
        this.f390431b = i17;
        this.f390432c = j17;
    }

    @Override // com.p314xaae8f345.mm.p630x58d9bd6.mix.p631xb06291ee.InterfaceC5140x264f60fc
    /* renamed from: onDecodeData */
    public final boolean mo43233x7f09adf7(byte[] bArr, int i17, boolean z17) {
        long j17 = this.f390432c;
        java.io.ByteArrayOutputStream byteArrayOutputStream = this.f390430a;
        if (z17) {
            if (bArr != null) {
                byteArrayOutputStream.write(bArr);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioDecoder", "onDecodeData decodeEnd cost:" + (java.lang.System.currentTimeMillis() - j17) + ", size:" + byteArrayOutputStream.size());
            return true;
        }
        if (bArr != null && i17 != 0) {
            byteArrayOutputStream.write(bArr);
            if (byteArrayOutputStream.size() >= this.f390431b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioDecoder", "onDecodeData end cost:" + (java.lang.System.currentTimeMillis() - j17) + ", size:" + byteArrayOutputStream.size());
                return true;
            }
        }
        return false;
    }
}
