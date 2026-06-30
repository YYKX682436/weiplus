package ap0;

/* loaded from: classes10.dex */
public class i implements zo0.j {

    /* renamed from: a, reason: collision with root package name */
    public final hp0.f f12597a = new hp0.f(10);

    public synchronized boolean a(ip0.a aVar) {
        boolean k17;
        hp0.f fVar = this.f12597a;
        java.lang.String aVar2 = aVar.toString();
        synchronized (fVar) {
            kk.j jVar = fVar.f282912a;
            if (jVar == null) {
                throw new java.lang.NullPointerException("mData == null");
            }
            k17 = ((lt0.f) jVar).k(aVar2);
        }
        if (k17) {
            hp0.f fVar2 = this.f12597a;
            java.lang.String aVar3 = aVar.toString();
            kk.j jVar2 = fVar2.f282912a;
            if (jVar2 == null) {
                throw new java.lang.NullPointerException("mData == null");
            }
            int intValue = ((java.lang.Integer) ((lt0.f) jVar2).get(aVar3)).intValue();
            this.f12597a.a(aVar.toString(), java.lang.Integer.valueOf(intValue + 1));
            if (intValue >= 50) {
                if (intValue == 50 || intValue % 500 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Loader.DefaultImageRetryDownloadListener", "Url %s retry over time %d current time:%d, then stop retry download", aVar, 50, java.lang.Integer.valueOf(intValue));
                }
                return false;
            }
        } else {
            this.f12597a.a(aVar.toString(), 1);
        }
        return true;
    }
}
