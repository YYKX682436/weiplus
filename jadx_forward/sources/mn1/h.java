package mn1;

/* loaded from: classes12.dex */
public class h implements sn1.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mn1.e f411399a;

    public h(mn1.e eVar) {
        this.f411399a = eVar;
    }

    @Override // sn1.r0
    public void a() {
        kn1.g e17 = mn1.d.i().e();
        e17.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f411399a.a(e17.f391142a);
    }

    @Override // sn1.r0
    public void b(int i17) {
        kn1.g e17 = mn1.d.i().e();
        e17.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        int i18 = e17.f391142a;
        mn1.e eVar = this.f411399a;
        if (i17 == 1) {
            if (i18 == 23) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveRecoverServer", "speedCallback is weak connect now.");
                mn1.d.i().e().f391142a = 4;
                eVar.a(4);
                eVar.e(11789, 8);
                return;
            }
            return;
        }
        if (i17 == 0 && i18 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveRecoverServer", "speedCallback is normal speed now.");
            mn1.d.i().e().f391142a = 23;
            eVar.a(23);
            eVar.e(11789, 9);
        }
    }

    @Override // sn1.r0
    public void c() {
        kn1.g e17 = mn1.d.i().e();
        e17.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        int i17 = e17.f391142a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupMoveRecoverServer", "speedOverTime callback, backupState[%d]", java.lang.Integer.valueOf(i17));
        if (i17 == 23 || i17 == 4) {
            mn1.e eVar = this.f411399a;
            eVar.g(true, false, -4);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(485L, 43L, 1L, false);
            eVar.e(11789, 4);
            mn1.d.i().h().e();
        }
    }
}
