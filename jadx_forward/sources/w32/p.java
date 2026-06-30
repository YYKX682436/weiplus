package w32;

/* loaded from: classes13.dex */
public class p extends u32.s0 {

    /* renamed from: e, reason: collision with root package name */
    public final i32.d f524231e;

    public p(i32.d dVar) {
        this.f524231e = null;
        iz5.a.d(null, dVar);
        this.f524231e = dVar;
    }

    @Override // u32.t0
    public int Hf() {
        return this.f524231e.b();
    }

    @Override // u32.t0
    public int W4() {
        return this.f524231e.f369653b;
    }

    @Override // u32.t0
    public int W5() {
        return this.f524231e.a();
    }

    @Override // u32.t0
    /* renamed from: getDeviceId */
    public long mo167498xbdf72787() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getDeviceId : ");
        i32.d dVar = this.f524231e;
        sb6.append(dVar.f369652a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteExDeviceTaskRequest", sb6.toString());
        return dVar.f369652a;
    }

    @Override // u32.t0
    public byte[] z9() {
        return this.f524231e.c();
    }
}
