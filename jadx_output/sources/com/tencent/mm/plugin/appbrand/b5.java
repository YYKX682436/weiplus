package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class b5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f76762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer f76763e;

    public b5(com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer appBrandRuntimeContainer, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f76763e = appBrandRuntimeContainer;
        this.f76762d = appBrandRuntime;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainer", "dl: removeImpl, cleanupOut.run(), appId[%s]", this.f76762d.f74803n);
        this.f76762d.B1(this.f76763e.f74847z);
        int size = this.f76762d.f74797f.size();
        this.f76762d.A1(this.f76763e, com.tencent.mm.plugin.appbrand.PopPageStackType.Remove_from_Stack);
        if (size == 1) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f76762d;
            if (appBrandRuntime.f74796e == this.f76763e) {
                appBrandRuntime.d0();
            }
        }
        this.f76763e.f74838q.removeView(this.f76762d.f74810s);
        this.f76763e.f74840s.remove(this.f76762d.f74803n);
        this.f76763e.f74839r.remove(this.f76762d);
    }
}
