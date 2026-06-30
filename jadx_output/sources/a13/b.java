package a13;

/* loaded from: classes11.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a13.t f534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535e;

    public b(a13.t tVar, java.lang.String str) {
        this.f534d = tVar;
        this.f535e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("executing clear engine: activity=");
        a13.t tVar = this.f534d;
        sb6.append(tVar.f573f);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", sb6.toString());
        if (tVar.f573f == null) {
            ((e50.a) ((f50.x) i95.n0.c(f50.x.class))).wi(this.f535e);
        }
    }
}
