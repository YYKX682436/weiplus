package i32;

/* loaded from: classes8.dex */
public final class j extends i32.k {
    public j(byte[] bArr, int i17, long j17) {
        o32.h hVar = new o32.h();
        hVar.f424243d = new o32.c();
        hVar.f424244e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, bArr.length);
        hVar.f424245f = i17;
        this.f369655d = hVar;
        this.f369652a = j17;
        this.f369653b = (short) 30001;
    }

    @Override // i32.d
    public byte[] c() {
        iz5.a.d(null, this.f369655d);
        try {
            return this.f369655d.mo14344x5f01b1f6();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExDevicePushManufacturerSvrSendData", "mResp.toByteArray() Failed!!! %s", e17.getMessage());
            return null;
        }
    }
}
