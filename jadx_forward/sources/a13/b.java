package a13;

/* loaded from: classes11.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a13.t f82067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82068e;

    public b(a13.t tVar, java.lang.String str) {
        this.f82067d = tVar;
        this.f82068e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("executing clear engine: activity=");
        a13.t tVar = this.f82067d;
        sb6.append(tVar.f82106f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", sb6.toString());
        if (tVar.f82106f == null) {
            ((e50.a) ((f50.x) i95.n0.c(f50.x.class))).wi(this.f82068e);
        }
    }
}
