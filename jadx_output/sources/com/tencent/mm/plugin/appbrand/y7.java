package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class y7 extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f92418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f92419e;

    public y7(com.tencent.mm.plugin.appbrand.o6 o6Var, java.lang.String str) {
        this.f92419e = o6Var;
        this.f92418d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String wxaLaunchInstanceId = this.f92418d;
        if (wxaLaunchInstanceId == null || wxaLaunchInstanceId.length() == 0) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.appbrand.launching.c.f84530a;
        kotlin.jvm.internal.o.g(wxaLaunchInstanceId, "wxaLaunchInstanceId");
    }
}
