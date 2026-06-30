package sn1;

/* loaded from: classes12.dex */
public class q0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sn1.s0 f491610d;

    public q0(sn1.s0 s0Var) {
        this.f491610d = s0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        long j17;
        sn1.s0 s0Var = this.f491610d;
        long j18 = s0Var.f491622f;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j18;
        if (currentTimeMillis != 0) {
            long j19 = (s0Var.f491619c / currentTimeMillis) * 1000;
            s0Var.f491618b = j19;
            ((java.util.LinkedList) s0Var.f491627k).offer(java.lang.Long.valueOf(j19));
            try {
                j17 = ((java.lang.Long) ((java.util.LinkedList) s0Var.f491627k).poll()).longValue();
            } catch (java.lang.Exception unused) {
                j17 = 0;
            }
            long j27 = (((s0Var.f491617a * 10) - j17) + s0Var.f491618b) / 10;
            s0Var.f491618b = j27;
            if (j27 <= 0) {
                j27 = 0;
            }
            s0Var.f491618b = j27;
            s0Var.f491617a = j27;
            s0Var.f491619c = 0L;
            s0Var.f491622f = java.lang.System.currentTimeMillis();
            s0Var.f491628l.a();
            long j28 = s0Var.f491618b;
            if (j28 >= 102400) {
                if (s0Var.f491624h != 0) {
                    s0Var.f491624h = 0;
                    s0Var.f491623g = 0L;
                    s0Var.f491628l.b(0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupSpeedCalculator", "backupGetSpeedTimeHandler is not low speed now.");
                }
            } else if (j28 < 2) {
                int i17 = s0Var.f491624h;
                if (i17 == 0) {
                    s0Var.f491624h = 1;
                    s0Var.f491628l.b(1);
                    s0Var.f491623g = java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupSpeedCalculator", "backupGetSpeedTimeHandler is too low speed! backupLowSpeedStartTime[%d]", java.lang.Long.valueOf(s0Var.f491623g));
                } else if (i17 == 1) {
                    long j29 = s0Var.f491623g;
                    if (j29 <= 0) {
                        s0Var.f491623g = java.lang.System.currentTimeMillis();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupSpeedCalculator", "backupGetSpeedTimeHandler is too low speed! backupLowSpeedStartTime[%d]", java.lang.Long.valueOf(s0Var.f491623g));
                    } else if (java.lang.System.currentTimeMillis() - j29 > 600000) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupSpeedCalculator", "backupGetSpeedTimeHandler low speed overtime, overtime[%d]", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - s0Var.f491623g));
                        s0Var.f491624h = 2;
                        s0Var.f491628l.c();
                        s0Var.f491623g = 0L;
                        return false;
                    }
                }
            } else if (s0Var.f491624h != 1) {
                s0Var.f491624h = 1;
                s0Var.f491628l.b(1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupSpeedCalculator", "backupGetSpeedTimeHandler is weak now.");
            }
        }
        return true;
    }
}
