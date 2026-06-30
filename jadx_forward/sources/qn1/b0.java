package qn1;

/* loaded from: classes12.dex */
public class b0 implements kn1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qn1.c0 f446470a;

    public b0(qn1.c0 c0Var) {
        this.f446470a = c0Var;
    }

    @Override // kn1.c
    public void a(int i17) {
        qn1.c0 c0Var = this.f446470a;
        java.util.HashSet hashSet = new java.util.HashSet(c0Var.f446485d);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new qn1.z(this, hashSet, i17));
        if (c0Var.f446483b != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new qn1.a0(this, i17));
        }
    }

    @Override // kn1.c
    public void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcServer", "onBackupPackAndSendCallback onCancel, isSelf[%b]", java.lang.Boolean.valueOf(z17));
        this.f446470a.d(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(400L, 120L, 1L, false);
    }

    @Override // kn1.c
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcServer", "onBackupFinish");
        on1.e.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(400L, 11L, 1L, false);
        qn1.c0 c0Var = this.f446470a;
        ln1.s sVar = c0Var.f446484c;
        g0Var.mo68477x336bdfd8(400L, 12L, sVar == null ? 0L : (java.lang.System.currentTimeMillis() - sVar.f401345m) / 1000, false);
        ln1.s sVar2 = c0Var.f446484c;
        g0Var.mo68477x336bdfd8(400L, 13L, sVar2 == null ? 0L : sVar2.f401344l / 1024, false);
        c0Var.c(13737, 0);
        sn1.i.X(11);
        if (c0Var.f446486e) {
            return;
        }
        c0Var.c(13737, 21);
    }
}
