package gq1;

/* loaded from: classes13.dex */
public class p extends gq1.s {
    @Override // gq1.s
    public boolean b(byte[] bArr) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.IBeaconTLVSectionA", "valueByte is null or nil");
            return false;
        }
        if (2 != this.f356074a) {
            return false;
        }
        byte b17 = bArr[0];
        return true;
    }
}
