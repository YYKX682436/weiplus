package rl3;

/* loaded from: classes15.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f478808d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rl3.t f478809e;

    public s(rl3.t tVar, rl3.r rVar) {
        this.f478809e = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        rl3.t tVar = this.f478809e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.QQMusicPlayer", "start run play progress task");
        while (!this.f478808d) {
            try {
                if (tVar.f478811l != null && tVar.i() && !tVar.D() && tVar.A(tVar.f478810k) && tVar.f478811l != null && tVar.i()) {
                    int mo93635x9746038c = (int) tVar.f478811l.mo93635x9746038c();
                    int mo93638x51e8b0a = tVar.f478811l.mo93638x51e8b0a();
                    if (mo93635x9746038c > 0 && mo93638x51e8b0a > 0) {
                        java.util.Iterator it = tVar.f478768j.iterator();
                        while (it.hasNext()) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.k) it.next()).a(mo93635x9746038c, mo93638x51e8b0a);
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.QQMusicPlayer", "PlayProgressTask run exception:" + e17.getMessage());
            }
            try {
                java.lang.Thread.sleep(200L);
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }
}
