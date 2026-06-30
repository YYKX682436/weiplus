package a50;

/* loaded from: classes11.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f83069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f83070e;

    public t(long j17, a50.a0 a0Var) {
        this.f83069d = j17;
        this.f83070e = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Timeout release ProcLife taskId=");
        long j17 = this.f83069d;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxAffBizCppToNativeManagerImpl", sb6.toString());
        java.util.Map map = this.f83070e.f82985b;
        a50.b bVar = (a50.b) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(j17));
        if (bVar != null) {
            bVar.f82988b = false;
            map.remove(java.lang.Long.valueOf(j17));
            mm.d0 d0Var = mm.d0.f410008a;
            synchronized (d0Var.a()) {
                d0Var.a().remove(bVar);
            }
        }
    }
}
