package yw;

/* loaded from: classes11.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f547977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yw.y f547978e;

    public r(long j17, yw.y yVar) {
        this.f547977d = j17;
        this.f547978e = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Timeout release ProcLife taskId=");
        long j17 = this.f547977d;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffBizCppToNativeManagerImpl", sb6.toString());
        java.util.Map map = this.f547978e.f548043b;
        yw.r2 r2Var = (yw.r2) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(j17));
        if (r2Var != null) {
            r2Var.f547982b = false;
            map.remove(java.lang.Long.valueOf(j17));
            mm.d0 d0Var = mm.d0.f410008a;
            synchronized (d0Var.a()) {
                d0Var.a().remove(r2Var);
            }
        }
    }
}
