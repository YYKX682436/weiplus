package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class b2 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Configuration f76758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f76759e;

    public b2(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, android.content.res.Configuration configuration) {
        this.f76759e = appBrandRuntime;
        this.f76758d = configuration;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime.M(this.f76759e, this.f76758d);
        return false;
    }
}
