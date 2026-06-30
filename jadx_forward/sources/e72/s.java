package e72;

/* loaded from: classes14.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e72.v f331458d;

    public s(e72.v vVar) {
        this.f331458d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f331458d.f331477q) {
            if (this.f331458d.f331472l) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NumberFaceMotion", "hy: user already start. do nothing");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NumberFaceMotion", "hy: not triggered symbol. auto start");
                e72.v vVar = this.f331458d;
                vVar.f331472l = true;
                long j17 = vVar.f331470j;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NumberFaceMotion", "hy: delta after request");
                if (elapsedRealtime < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NumberFaceMotion", "hy: too fast. regard as fake");
                } else if (elapsedRealtime < 1000) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NumberFaceMotion", "hy: too fast. wait until normal");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new e72.t(vVar), 1000 - elapsedRealtime);
                } else {
                    vVar.f331482v.start();
                }
            }
        }
    }
}
