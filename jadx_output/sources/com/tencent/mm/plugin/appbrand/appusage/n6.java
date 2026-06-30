package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class n6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f76527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f76528g;

    public n6(java.lang.String str, java.lang.String str2, int i17, java.lang.Runnable runnable) {
        this.f76525d = str;
        this.f76526e = str2;
        this.f76527f = i17;
        this.f76528g = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f76526e;
        java.lang.String str2 = this.f76525d;
        java.lang.Runnable runnable = this.f76528g;
        try {
            if (gm0.j1.b().m()) {
                try {
                    com.tencent.mm.plugin.appbrand.appusage.o6.d(str2, str, this.f76527f);
                    if (runnable == null) {
                        return;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.RemoveUsageTask", e17, "doRemove username(%s), appId(%s)", str2, str);
                    if (runnable == null) {
                        return;
                    }
                }
                runnable.run();
            }
        } catch (java.lang.Throwable th6) {
            if (runnable != null) {
                runnable.run();
            }
            throw th6;
        }
    }
}
