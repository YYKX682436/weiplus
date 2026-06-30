package w32;

/* loaded from: classes13.dex */
public class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o3 {

    /* renamed from: d, reason: collision with root package name */
    public final i32.d f524211d;

    public g(byte[] bArr, int i17, long j17) {
        this.f524211d = new i32.j(bArr, i17, j17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o3
    public boolean a(u32.n0 n0Var, w32.d dVar) {
        u32.w a17 = u32.h1.a();
        i32.d dVar2 = this.f524211d;
        if (a17.g(dVar2.f369652a)) {
            return new w32.a(dVar2, dVar).b(n0Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.MMPushManufacturerSvrSendDataLogic", "Service push data to device before it do auth, device id = %d", java.lang.Long.valueOf(dVar2.f369652a));
        return true;
    }
}
