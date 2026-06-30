package i32;

/* loaded from: classes13.dex */
public class g extends i32.e {
    public g(long j17, int i17, int i18, byte[] bArr) {
        super(j17, i17, i18, bArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "ExDeviceCmdSendDataToManufacturer deviceId = " + j17 + " seq = " + i17 + " cmdId = " + i18);
    }

    @Override // i32.e
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "data is null");
            return null;
        }
        o32.k kVar = new o32.k();
        try {
            kVar.mo11468x92b714fd(bArr);
            this.f369656e = kVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "SendDataToManufacturerSvrRequest cmd has been received");
            return kVar;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "SendDataToManufacturerSvrRequest.parseFrom Failed!!! %s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public void e(int i17, java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "setSendDataToManufacturerResponse ret = " + i17 + str);
        o32.l lVar = new o32.l();
        o32.e eVar = new o32.e();
        this.f369654c = eVar;
        eVar.f424227d = i17;
        eVar.f424228e = str;
        lVar.f424247d = eVar;
        if (bArr == null) {
            bArr = new byte[0];
        }
        lVar.f424250e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, bArr.length);
        this.f369655d = lVar;
        this.f369653b = (short) 20002;
    }
}
