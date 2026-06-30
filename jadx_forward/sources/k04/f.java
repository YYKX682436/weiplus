package k04;

/* loaded from: classes11.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k04.h f384668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.PowerManager f384669e;

    public f(k04.h hVar, android.os.PowerManager powerManager) {
        this.f384668d = hVar;
        this.f384669e = powerManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long c17 = c01.id.c();
        int myPid = android.os.Process.myPid();
        boolean mo40965x320351f8 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4671xf410f8ca.f19953x4fbc8495.mo40965x320351f8();
        boolean mo40975xf7b3660d = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d();
        boolean m40080x23b734ff = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        boolean isInteractive = this.f384669e.isInteractive();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(c17);
        sb6.append(';');
        sb6.append(myPid);
        sb6.append(';');
        sb6.append(mo40965x320351f8 ? 1 : 0);
        sb6.append(';');
        sb6.append(mo40975xf7b3660d ? 1 : 0);
        sb6.append(';');
        sb6.append(m40080x23b734ff ? 1 : 0);
        sb6.append(';');
        sb6.append(isInteractive ? 1 : 0);
        java.lang.String sb7 = sb6.toString();
        k04.h hVar = this.f384668d;
        hVar.aj().A("lastTickIndex", hVar.f384673o);
        hVar.aj().D("index_" + hVar.f384673o, sb7);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessStatusFeatureService", "tick index_" + hVar.f384673o + ' ' + sb7);
        int i17 = hVar.f384673o + 1;
        hVar.f384673o = i17;
        if (i17 > 30) {
            hVar.f384673o = 0;
        }
    }
}
