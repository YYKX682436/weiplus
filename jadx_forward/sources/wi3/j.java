package wi3;

/* loaded from: classes14.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final wi3.j f527757d = new wi3.j();

    @Override // java.lang.Runnable
    public final void run() {
        wi3.l lVar = wi3.l.f527759a;
        if (wi3.l.f527760b == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMFGWrapper", "MMFG release " + wi3.l.f527760b + ", but no need to release");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMFGWrapper", "MMFG release " + wi3.l.f527760b + ", synchronized start waiting");
        synchronized (lVar) {
            if (wi3.l.f527762d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMFGWrapper", "MMFG release " + wi3.l.f527760b + ", but isProcessing, so skip");
                lVar.c();
                return;
            }
            if (wi3.l.f527760b != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMFGWrapper", "MMFG release " + wi3.l.f527760b);
                long j17 = wi3.l.f527760b;
                wi3.l.f527760b = 0L;
                com.p314xaae8f345.mm.p936x333261.C11099x242a61.m47826x46fb07b9(j17);
            }
        }
    }
}
