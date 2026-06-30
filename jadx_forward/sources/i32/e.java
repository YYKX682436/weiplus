package i32;

/* loaded from: classes13.dex */
public abstract class e extends i32.d {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f f369656e = null;

    /* renamed from: f, reason: collision with root package name */
    public final short f369657f;

    /* renamed from: g, reason: collision with root package name */
    public final short f369658g;

    public e(long j17, int i17, int i18, byte[] bArr) {
        this.f369657f = (short) -1;
        this.f369658g = (short) -1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceCmdBaseReqResp", "onDeviceRequest deviceId = " + j17 + " seq = " + i17 + " cmdId = " + i18);
        this.f369652a = j17;
        this.f369657f = (short) i18;
        this.f369658g = (short) i17;
        d(bArr);
    }

    @Override // i32.d
    public final short a() {
        return this.f369658g;
    }

    @Override // i32.d
    public final short b() {
        return this.f369657f;
    }

    @Override // i32.d
    public byte[] c() {
        try {
            return this.f369655d.mo14344x5f01b1f6();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExDeviceCmdBaseReqResp", "mResp.toByteArray() Failed!!! %s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.ExDeviceCmdBaseReqResp", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public abstract com.p314xaae8f345.mm.p2495xc50a8b8b.f d(byte[] bArr);
}
