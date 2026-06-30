package w32;

/* loaded from: classes13.dex */
public class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o3 {

    /* renamed from: d, reason: collision with root package name */
    public final i32.i f524214d;

    public j(int i17, int i18, long j17) {
        this.f524214d = new i32.i(i17, i18, j17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o3
    public boolean a(u32.n0 n0Var, w32.d dVar) {
        u32.w a17 = u32.h1.a();
        i32.i iVar = this.f524214d;
        if (a17.g(iVar.f369652a)) {
            return new w32.b(iVar, dVar).b(n0Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.MMSwitchViewPushTaskExcuter", "push switchview event to device before it do auth, device id = %d", java.lang.Long.valueOf(iVar.f369652a));
        return true;
    }
}
