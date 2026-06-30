package com.tencent.mm.feature.appbrand.support;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class})
/* loaded from: classes7.dex */
public final class t extends i95.w implements ft.e {
    @Override // ft.e
    public java.util.List R6() {
        com.tencent.mm.plugin.appbrand.task.u0 wi6 = wi();
        if (wi6 == null) {
            return kz5.p0.f313996d;
        }
        if (!(wi6 instanceof com.tencent.mm.plugin.appbrand.task.z0)) {
            java.util.List k17 = wi6.k();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(k17, 10));
            java.util.Iterator it = k17.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.tencent.mm.feature.appbrand.support.l((com.tencent.mm.plugin.appbrand.task.k) it.next(), this));
            }
            return arrayList;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (com.tencent.mm.plugin.appbrand.task.k kVar : ((com.tencent.mm.plugin.appbrand.task.z0) wi6).k()) {
            java.lang.String i17 = kVar.i();
            if (i17 != null) {
                com.tencent.mm.feature.appbrand.support.m mVar = (com.tencent.mm.feature.appbrand.support.m) linkedHashMap.get(i17);
                if (mVar == null) {
                    mVar = new com.tencent.mm.feature.appbrand.support.m();
                    linkedHashMap.put(i17, mVar);
                }
                mVar.f65090d.add(kVar);
                for (com.tencent.luggage.sdk.processes.s sVar : kVar.h()) {
                    java.util.LinkedList linkedList = mVar.f65091e;
                    kotlin.jvm.internal.o.e(sVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.task.AppBrandMiniProgramRecord");
                    linkedList.add(new com.tencent.mm.feature.appbrand.support.s((com.tencent.mm.plugin.appbrand.task.o) sVar));
                }
            }
        }
        return new java.util.LinkedList(linkedHashMap.values());
    }

    @Override // ft.e
    public void Rc(com.tencent.mm.plugin.appbrand.event.StartActivityFromAppBrandEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a), null, null, new com.tencent.mm.feature.appbrand.support.r(this, event, null), 3, null);
    }

    @Override // ft.e
    public void V4() {
        com.tencent.mm.plugin.appbrand.task.u0 wi6 = wi();
        if (wi6 != null) {
            wi6.q(com.tencent.luggage.sdk.processes.c.f47634h);
        }
    }

    @Override // ft.e
    public void g5(java.lang.String appId) {
        com.tencent.mm.plugin.appbrand.task.k kVar;
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mm.plugin.appbrand.task.u0 wi6 = wi();
        if (wi6 == null || (kVar = (com.tencent.mm.plugin.appbrand.task.k) wi6.g(appId)) == null) {
            return;
        }
        kVar.r(new com.tencent.mm.plugin.appbrand.task.ipc.AppBrandNotifyNeedShowWvaDownloadSheet(appId));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ft.e
    public void m7(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (iEvent == 0) {
            return;
        }
        for (ft.b bVar : R6()) {
            if (kotlin.jvm.internal.o.b(bVar.getF65038d(), com.tencent.mm.sdk.platformtools.x2.f193072b)) {
                iEvent.e();
            } else if (bVar.a()) {
                java.lang.String f65038d = bVar.getF65038d();
                kotlin.jvm.internal.o.f(f65038d, "processName(...)");
                com.tencent.mm.ipcinvoker.f.a(f65038d, new com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper.SafeParcelableWrapper((android.os.Parcelable) iEvent), com.tencent.mm.feature.appbrand.support.n.f65092d, null);
            }
        }
    }

    @Override // ft.e
    public void v6() {
    }

    public final com.tencent.mm.plugin.appbrand.task.u0 wi() {
        try {
            return com.tencent.mm.plugin.appbrand.task.u0.f89199h.a();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProcessManagerServiceImpl", "safeGetProcessManager failed " + th6);
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                return null;
            }
            throw new java.lang.UnsupportedOperationException("Only supported in main process", th6);
        }
    }
}
