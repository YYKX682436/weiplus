package ap0;

/* loaded from: classes10.dex */
public class i implements zo0.j {

    /* renamed from: a, reason: collision with root package name */
    public final hp0.f f94130a = new hp0.f(10);

    public synchronized boolean a(ip0.a aVar) {
        boolean k17;
        hp0.f fVar = this.f94130a;
        java.lang.String m139674x9616526c = aVar.m139674x9616526c();
        synchronized (fVar) {
            kk.j jVar = fVar.f364445a;
            if (jVar == null) {
                throw new java.lang.NullPointerException("mData == null");
            }
            k17 = ((lt0.f) jVar).k(m139674x9616526c);
        }
        if (k17) {
            hp0.f fVar2 = this.f94130a;
            java.lang.String m139674x9616526c2 = aVar.m139674x9616526c();
            kk.j jVar2 = fVar2.f364445a;
            if (jVar2 == null) {
                throw new java.lang.NullPointerException("mData == null");
            }
            int intValue = ((java.lang.Integer) ((lt0.f) jVar2).get(m139674x9616526c2)).intValue();
            this.f94130a.a(aVar.m139674x9616526c(), java.lang.Integer.valueOf(intValue + 1));
            if (intValue >= 50) {
                if (intValue == 50 || intValue % 500 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Loader.DefaultImageRetryDownloadListener", "Url %s retry over time %d current time:%d, then stop retry download", aVar, 50, java.lang.Integer.valueOf(intValue));
                }
                return false;
            }
        } else {
            this.f94130a.a(aVar.m139674x9616526c(), 1);
        }
        return true;
    }
}
