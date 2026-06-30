package ne0;

/* loaded from: classes7.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ne0.n f418029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f418030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f418031f;

    public m(ne0.n nVar, java.lang.String str, double d17) {
        this.f418029d = nVar;
        this.f418030e = str;
        this.f418031f = d17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ne0.n nVar = this.f418029d;
        java.util.HashMap hashMap = nVar.f418034f;
        java.lang.String str = this.f418030e;
        double d17 = this.f418031f;
        synchronized (hashMap) {
            nVar.f418034f.put(str, java.lang.Double.valueOf(d17));
        }
    }
}
