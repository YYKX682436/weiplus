package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes12.dex */
public class v6 implements com.tencent.mm.plugin.appbrand.utils.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f76007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.w6 f76008c;

    public v6(com.tencent.mm.plugin.appbrand.appcache.w6 w6Var, int i17, long j17) {
        this.f76008c = w6Var;
        this.f76006a = i17;
        this.f76007b = j17;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.p4
    public void a(yz5.a aVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Thread onExecute ");
        int i17 = this.f76006a;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("AsyncTaskQueue", sb6.toString());
        com.tencent.mm.plugin.appbrand.appcache.w6 w6Var = this.f76008c;
        w6Var.f76023f.add(java.lang.Integer.valueOf(i17));
        w6Var.f76024g.schedule(new com.tencent.mm.plugin.appbrand.appcache.u6(this, aVar), this.f76007b, java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}
