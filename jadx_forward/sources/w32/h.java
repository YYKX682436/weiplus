package w32;

/* loaded from: classes13.dex */
public class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o3 {

    /* renamed from: d, reason: collision with root package name */
    public final i32.g f524212d;

    public h(i32.g gVar) {
        this.f524212d = gVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o3
    public boolean a(u32.n0 n0Var, w32.d dVar) {
        boolean b17 = new w32.a(this.f524212d, dVar).b(n0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.MMSendDataToDeviceExcuter", "send data to devide : %b", java.lang.Boolean.valueOf(b17));
        return b17;
    }
}
