package nx1;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx1.d f422813d;

    public c(nx1.d dVar) {
        this.f422813d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f422813d) {
            if (this.f422813d.f422815a == null) {
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = this.f422813d.f422815a.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                ix1.a aVar = (ix1.a) it.next();
                if (aVar.b() != 1) {
                    i17++;
                } else {
                    sb6.append(((ix1.l) aVar).f376871s);
                }
            }
            this.f422813d.f422819e = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.d(sb6.toString());
            this.f422813d.f422820f = i17;
        }
    }
}
