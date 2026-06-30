package w32;

/* loaded from: classes13.dex */
public class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o3 {

    /* renamed from: d, reason: collision with root package name */
    public final i32.f f524209d;

    /* renamed from: e, reason: collision with root package name */
    public final int f524210e;

    public f(int i17, long j17, int i18, int i19, byte[] bArr) {
        this.f524209d = new i32.f(j17, i18, i19, bArr);
        this.f524210e = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o3
    public boolean a(u32.n0 n0Var, w32.d dVar) {
        u32.w a17 = u32.h1.a();
        i32.f fVar = this.f524209d;
        if (!a17.g(fVar.f369652a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.MMInitTaskExcuter", "This device send other cmd before do auth, device id = %d", java.lang.Long.valueOf(fVar.f369652a));
            this.f524209d.e(-2, "", new byte[0], new byte[0], 0, 0);
            boolean b17 = new w32.a(fVar, dVar).b(n0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.MMInitTaskExcuter", "init start task : %b", java.lang.Boolean.valueOf(b17));
            return b17;
        }
        int i17 = this.f524210e;
        if (-5 == i17 || -3 == i17 || -4 == i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.MMInitTaskExcuter", "Error Code = %d, reply errorcode to device and close channel", java.lang.Integer.valueOf(i17));
            this.f524209d.e(-1, "", new byte[0], new byte[0], 0, 0);
            boolean b18 = new w32.a(fVar, dVar).b(n0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.MMInitTaskExcuter", "init start task : %b", java.lang.Boolean.valueOf(b18));
            return b18;
        }
        o32.f fVar2 = (o32.f) fVar.f369656e;
        if (fVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.MMInitTaskExcuter", "Init Request parse failed, Tell device before stop this task");
            this.f524209d.e(-4, "", new byte[0], new byte[0], 0, 0);
            boolean b19 = new w32.a(fVar, dVar).b(n0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.MMInitTaskExcuter", "init start task : %b", java.lang.Boolean.valueOf(b19));
            return b19;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = fVar2.f424230f;
        byte[] g17 = gVar != null ? gVar.g() : null;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = fVar2.f424229e;
        byte[] g18 = gVar2 != null ? gVar2.g() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Bi().getClass();
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d0.f180397g;
        if (i18 != 1 && i18 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.MMInitTaskExcuter", "initScene = %d, Cannot start init response", java.lang.Integer.valueOf(i18));
        }
        this.f524209d.e(0, null, g18, g17, i18, (int) (a42.i.e() / 1000));
        return new w32.a(fVar, dVar).b(n0Var);
    }
}
