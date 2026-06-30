package a50;

/* loaded from: classes11.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f1536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f1537e;

    public t(long j17, a50.a0 a0Var) {
        this.f1536d = j17;
        this.f1537e = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Timeout release ProcLife taskId=");
        long j17 = this.f1536d;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("Finder.BoxAffBizCppToNativeManagerImpl", sb6.toString());
        java.util.Map map = this.f1537e.f1452b;
        a50.b bVar = (a50.b) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(j17));
        if (bVar != null) {
            bVar.f1455b = false;
            map.remove(java.lang.Long.valueOf(j17));
            mm.d0 d0Var = mm.d0.f328475a;
            synchronized (d0Var.a()) {
                d0Var.a().remove(bVar);
            }
        }
    }
}
