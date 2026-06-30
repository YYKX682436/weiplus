package cj;

/* loaded from: classes12.dex */
public class b implements xi.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cj.c f41820a;

    public b(cj.c cVar) {
        this.f41820a = cVar;
    }

    public void a(ti.w0 w0Var) {
        android.content.Context context = this.f41820a.f41825a.f395858d;
        int i17 = com.tencent.matrix.resource.CanaryWorkerService.f52925n;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.matrix.resource.CanaryWorkerService.class);
        intent.setAction("com.tencent.matrix.resource.worker.action.SHRINK_HPROF");
        intent.putExtra("com.tencent.matrix.resource.worker.param.HEAPDUMP", w0Var);
        com.tencent.matrix.resource.MatrixJobIntentService.a(context, com.tencent.matrix.resource.CanaryWorkerService.class, -84148995, intent);
    }
}
