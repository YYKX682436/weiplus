package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class i3 implements com.tencent.mm.plugin.appbrand.f3, im5.a {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f78329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f78330e;

    public i3(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.m2 m2Var) {
        this.f78330e = appBrandRuntime;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime_$_RuntimePrepareAllDoneInitNotify", "<init> appId[%s] hash[%d]", appBrandRuntime.f74803n, java.lang.Integer.valueOf(hashCode()));
        appBrandRuntime.keep(this);
        this.f78329d = false;
    }

    @Override // com.tencent.mm.plugin.appbrand.f3
    public void a() {
        if (this.f78329d) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntime_$_RuntimePrepareAllDoneInitNotify", "PrepareAllDoneInitNotify.done() hash[%d] check1 dead appId[%s]", java.lang.Integer.valueOf(hashCode()), this.f78330e.f74803n);
            return;
        }
        this.f78330e.K("RuntimePrepareAllDoneInitNotify enqueue", new java.lang.Object[0]);
        sj1.l.i(this.f78330e.f74805p.f77278d, "internal:prepare", "小程序资源准备完成");
        com.tencent.mm.plugin.appbrand.h3 h3Var = new com.tencent.mm.plugin.appbrand.h3(this);
        try {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f78330e;
            appBrandRuntime.f74799h.dump(appBrandRuntime.f74800i, "AppBrandRuntimeProfile|dump mUiHandler");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntime_$_RuntimePrepareAllDoneInitNotify", "dumpUiThreadInQueueMessages get exception:%s", th6);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "AppBrandRuntimeProfile|dump main thread stacktrace tid  " + android.os.Looper.getMainLooper().getThread().getId());
        for (java.lang.StackTraceElement stackTraceElement : android.os.Looper.getMainLooper().getThread().getStackTrace()) {
            ((com.tencent.mm.plugin.appbrand.AppBrandRuntime$$h) this.f78330e.f74800i).println("AppBrandRuntimeProfile|dump main thread stacktrace    " + stackTraceElement.toString());
        }
        com.tencent.mm.plugin.appbrand.ff ffVar = this.f78330e.f74799h;
        android.os.Handler handler = ffVar.f78054b;
        if (handler != null) {
            handler.postAtFrontOfQueue(h3Var);
        } else {
            ffVar.f78053a.postAtFrontOfQueue(h3Var);
        }
        this.f78330e.n2(this);
    }

    @Override // im5.a
    public void dead() {
        this.f78329d = true;
    }
}
