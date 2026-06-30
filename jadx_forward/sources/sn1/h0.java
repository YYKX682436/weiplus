package sn1;

/* loaded from: classes12.dex */
public class h0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sn1.i0 f491544d;

    public h0(sn1.i0 i0Var) {
        this.f491544d = i0Var;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "BackupSendBackupHeartBeat";
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            sn1.i0 i0Var = this.f491544d;
            if (i0Var.f491563e.booleanValue()) {
                return;
            }
            try {
                java.lang.Thread.sleep(1000L);
            } catch (java.lang.Exception unused) {
            }
            if (i0Var.f491563e.booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupHeartBeatHandler", "start BackupSendBackupHeartBeat thread stopped.");
                return;
            }
            long j17 = i0Var.f491560b;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
            if (i0Var.f491562d) {
                if (currentTimeMillis >= 5000) {
                    if (i0Var.f491559a != 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupHeartBeatHandler", "start weak connect Timeout Now! heartBeatTimeStamp[%d], timeDiff[%d]", java.lang.Long.valueOf(i0Var.f491560b), java.lang.Long.valueOf(currentTimeMillis));
                        i0Var.f491559a = 1;
                        return;
                    }
                    return;
                }
            } else if (currentTimeMillis < 10000) {
                i0Var.f491559a = 0;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupHeartBeatHandler", "start send heartbeat req, heartBeatTimeStamp[%d], timeDiff[%d]", java.lang.Long.valueOf(i0Var.f491560b), java.lang.Long.valueOf(currentTimeMillis));
                i0Var.a();
                i0Var.c();
                i0Var.f491562d = true;
            }
        }
    }
}
