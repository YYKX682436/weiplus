package i32;

/* loaded from: classes13.dex */
public class c extends i32.e {
    public c(long j17, int i17, int i18, byte[] bArr) {
        super(j17, i17, i18, bArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceCmdAuth", "ExDeviceCmdAuth deviceId = " + j17 + " seq = " + i17 + " cmdId = " + i18);
    }

    @Override // i32.e
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExDeviceCmdAuth", "paras body is null");
            return null;
        }
        o32.a aVar = new o32.a();
        try {
            aVar.mo11468x92b714fd(bArr);
            this.f369656e = aVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceCmdAuth", "------AuthRequest------ ClientVersion = " + aVar.f424216f + " DeviceName = " + aVar.f424223p + " Language = " + aVar.f424222o + " TimeZone = " + aVar.f424221n);
            return aVar;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExDeviceCmdAuth", "AuthRequest.parseFrom Failed!!! %s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.ExDeviceCmdAuth", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public void e(int i17, java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceCmdAuth", "------setAuthResponse------ret = " + i17 + "errMsg = " + str);
        o32.b bVar = new o32.b();
        o32.e eVar = new o32.e();
        this.f369654c = eVar;
        eVar.f424227d = i17;
        eVar.f424228e = str;
        bVar.f424247d = eVar;
        bVar.f424224e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
        this.f369655d = bVar;
        this.f369653b = (short) 20001;
    }
}
