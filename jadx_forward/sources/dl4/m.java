package dl4;

/* loaded from: classes11.dex */
public class m implements p11.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f316966a;

    /* renamed from: b, reason: collision with root package name */
    public final int f316967b;

    public m(int i17, int i18) {
        this.f316966a = 0;
        this.f316967b = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.imageload.TingImageDownloader", "TingImageDownloader#%s connectTimeout:%s, readTimeout:%s", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f316967b = i17;
        this.f316966a = i18;
    }

    @Override // p11.c
    public q11.b b(java.lang.String str) {
        try {
            return dl4.l.a(str, this.f316967b, this.f316966a);
        } catch (java.net.ConnectException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.imageload.TingImageDownloader", e17, "getImageData exception", new java.lang.Object[0]);
            return new q11.b(null, null);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.imageload.TingImageDownloader", e18, "getImageData exception", new java.lang.Object[0]);
            return new q11.b(null, null);
        }
    }
}
