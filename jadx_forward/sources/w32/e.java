package w32;

/* loaded from: classes13.dex */
public class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o3 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final i32.c f524204d;

    /* renamed from: e, reason: collision with root package name */
    public w32.a f524205e;

    /* renamed from: f, reason: collision with root package name */
    public u32.n0 f524206f;

    /* renamed from: g, reason: collision with root package name */
    public w32.d f524207g;

    /* renamed from: h, reason: collision with root package name */
    public final int f524208h;

    public e(int i17, long j17, int i18, int i19, byte[] bArr) {
        this.f524204d = null;
        this.f524204d = new i32.c(j17, i18, i19, bArr);
        this.f524208h = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        if (r18 != r8.f369652a) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011d, code lost:
    
        if (a42.i.c(r9.f273689a, 0, kk.k.h((r10.f66607xe7b73b15 + r10.f66606x5fdff396).getBytes())) == false) goto L73;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.o3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(u32.n0 r24, w32.d r25) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w32.e.a(u32.n0, w32.d):boolean");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        gm0.j1.n().f354821b.q(541, this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.MMAuthTaskExcuter", "onscen end, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.k2 k2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.k2) m1Var;
        v32.c Ui = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        i32.c cVar = this.f524204d;
        sb6.append(cVar.f369652a);
        sb6.append("");
        if (Ui.b1(sb6.toString()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.MMAuthTaskExcuter", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!");
            return;
        }
        if (java.lang.System.currentTimeMillis() / 1000 >= r11.f318636v) {
            cVar.e(i18, str, k2Var.H());
            w32.a aVar = new w32.a(cVar, this.f524207g);
            this.f524205e = aVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", java.lang.Boolean.valueOf(aVar.b(this.f524206f)));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.MMAuthTaskExcuter", "device has been blocked");
        cVar.e(-5, "", new byte[0]);
        w32.a aVar2 = new w32.a(cVar, this.f524207g);
        this.f524205e = aVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", java.lang.Boolean.valueOf(aVar2.b(this.f524206f)));
    }
}
