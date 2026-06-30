package mz4;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz4.d f414813d;

    public g(mz4.d dVar) {
        this.f414813d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f414813d) {
            if (this.f414813d.f414762a == null) {
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i17 = 0;
            for (iz4.c cVar : this.f414813d.f414762a) {
                if (cVar.d() != 1) {
                    i17++;
                } else {
                    sb6.append(((iz4.i) cVar).f377688t);
                }
            }
            this.f414813d.f414766e = qz4.c.e(sb6.toString());
            this.f414813d.f414767f = i17;
        }
    }
}
