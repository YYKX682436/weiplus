package cj;

/* loaded from: classes12.dex */
public class b implements xi.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cj.c f123353a;

    public b(cj.c cVar) {
        this.f123353a = cVar;
    }

    public void a(ti.w0 w0Var) {
        android.content.Context context = this.f123353a.f123358a.f477391d;
        int i17 = com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.ServiceC4703x9d84477f.f134458n;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.ServiceC4703x9d84477f.class);
        intent.setAction("com.tencent.matrix.resource.worker.action.SHRINK_HPROF");
        intent.putExtra("com.tencent.matrix.resource.worker.param.HEAPDUMP", w0Var);
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.AbstractServiceC4704xa345f5bd.a(context, com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.ServiceC4703x9d84477f.class, -84148995, intent);
    }
}
