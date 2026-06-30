package i32;

/* loaded from: classes8.dex */
public class i extends i32.k {
    public i(int i17, int i18, long j17) {
        o32.n nVar = new o32.n();
        nVar.f424253d = new o32.c();
        nVar.f424254e = i17;
        nVar.f424255f = i18;
        this.f369655d = nVar;
        this.f369652a = j17;
        this.f369653b = (short) 30002;
    }

    @Override // i32.d
    public byte[] c() {
        try {
            return this.f369655d.mo14344x5f01b1f6();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExDeviceCmdSwitchViewPush", "mResp.toByteArray() Failed!!! %s", e17.getMessage());
            return null;
        }
    }
}
