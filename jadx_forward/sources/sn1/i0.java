package sn1;

/* loaded from: classes12.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public int f491559a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f491560b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f491561c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f491562d = false;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f491563e = null;

    public void a() {
        long j17 = this.f491561c;
        this.f491561c = j17 == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 ? 0L : j17 + 1;
        wn1.h hVar = new wn1.h();
        long j18 = this.f491561c;
        hVar.f528964d = j18;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupHeartBeatHandler", "sendBackupHeartBeatRequest send heartbeat req, ack:%d", java.lang.Long.valueOf(j18));
            sn1.i.R(hVar.mo14344x5f01b1f6(), 9);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupHeartBeatHandler", e17, "buf to BackupHeartBeatRequest err.", new java.lang.Object[0]);
        }
    }

    public void b(boolean z17) {
        if (z17) {
            iz5.a.g("New BackupHeartBeatHandler EveryTime !", this.f491563e == null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupHeartBeatHandler", "start backup heart beat handler.");
        c();
        this.f491563e = java.lang.Boolean.FALSE;
        ((ku5.t0) ku5.t0.f394148d).q(new sn1.h0(this));
        a();
    }

    public void c() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f491560b = java.lang.System.currentTimeMillis();
        this.f491562d = false;
        if (this.f491559a != 0) {
            this.f491559a = 0;
            b(false);
        }
    }
}
