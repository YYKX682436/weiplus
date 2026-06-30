package hk4;

/* loaded from: classes10.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk4.n f363488d;

    public m(hk4.n nVar) {
        this.f363488d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        hk4.n nVar = this.f363488d;
        long j18 = nVar.f363500v;
        if (this.f363488d.F > 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            j17 = android.os.SystemClock.elapsedRealtime() - this.f363488d.F;
        } else {
            j17 = 33;
        }
        nVar.f363500v = j18 + j17;
        hk4.n nVar2 = this.f363488d;
        yz5.p pVar = nVar2.f363461g;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Long.valueOf(nVar2.f363500v), this.f363488d);
        }
        long j19 = this.f363488d.f363500v;
        hk4.n nVar3 = this.f363488d;
        if (j19 >= nVar3.f363490l) {
            if (!nVar3.f363501w || !nVar3.f363502x) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363488d.f363489k, "updateProgressTask play to end");
                hk4.n nVar4 = this.f363488d;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = nVar4.f363498t;
                if (n3Var != null) {
                    n3Var.mo50302x6b17ad39(null);
                }
                android.os.HandlerThread handlerThread = nVar4.f363499u;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                nVar4.f363499u = null;
                nVar4.f363498t = null;
                synchronized (nVar4) {
                    if (!nVar4.A) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar4.f363489k, "invokeOnPlayFinished");
                        pm0.v.X(new hk4.e(nVar4));
                        nVar4.A = true;
                    }
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363488d.f363489k, "updateProgressTask loop to first");
            this.f363488d.f363500v = 0L;
        }
        if (this.f363488d.f363502x) {
            hk4.n nVar5 = this.f363488d;
            nVar5.getClass();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            nVar5.F = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = nVar5.f363498t;
            java.lang.Runnable runnable = nVar5.E;
            if (n3Var2 != null) {
                n3Var2.mo50300x3fa464aa(runnable);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var3 = nVar5.f363498t;
            if (n3Var3 != null) {
                n3Var3.mo50297x7c4d7ca2(runnable, 33L);
            }
        }
    }
}
