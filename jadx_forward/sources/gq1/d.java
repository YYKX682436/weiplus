package gq1;

/* loaded from: classes13.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final gq1.p f356032a = new gq1.p();

    /* renamed from: b, reason: collision with root package name */
    public final gq1.q f356033b = new gq1.q();

    public boolean a(byte[] bArr) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.IBeaconProtocal", "dataIn is null or nil");
            return false;
        }
        a42.a aVar = new a42.a(bArr.length);
        aVar.b(bArr, 0, bArr.length);
        boolean a17 = this.f356032a.a(aVar);
        return !a17 ? a17 : this.f356033b.a(aVar);
    }
}
