package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class n5 implements com.tencent.mm.plugin.appbrand.appcache.p5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f75684a;

    public n5(com.tencent.mm.plugin.appbrand.appcache.e5 e5Var, java.lang.Runnable runnable) {
        this.f75684a = runnable;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.p5
    public void a(boolean z17, int i17) {
        java.lang.Runnable runnable = this.f75684a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
