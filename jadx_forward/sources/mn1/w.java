package mn1;

/* loaded from: classes12.dex */
public class w implements kn1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mn1.y f411424a;

    public w(mn1.y yVar) {
        this.f411424a = yVar;
    }

    @Override // kn1.c
    public void a(int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new mn1.v(this, new java.util.HashSet(this.f411424a.f411427b), i17));
    }

    @Override // kn1.c
    public void b(boolean z17) {
        this.f411424a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupMoveServer", "cancel BackupMoveServer CANCEL, Caller:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.a());
        if (!z17) {
            wn1.d dVar = new wn1.d();
            dVar.f528947d = mn1.d.i().f391137b;
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveServer", "backupSendCancelRequest.");
                sn1.i.R(dVar.mo14344x5f01b1f6(), 5);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupMoveServer", e17, "buf to BackupCancelRequest err.", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveServer", "cancel , notifyall.");
        sn1.i.Z();
        sn1.i.a0();
        mn1.d.i().g();
    }

    @Override // kn1.c
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveServer", "onBackupFinish");
        on1.e.a();
        mn1.d.i();
        kn1.f.d().edit().putStringSet("BACKUP_SELECT_SESSION_LIST", null);
        sn1.i.X(21);
    }
}
