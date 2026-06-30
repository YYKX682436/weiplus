package com.tencent.mm.plugin.appbrand.backgroundrunning;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class})
/* loaded from: classes7.dex */
public class k extends i95.w implements com.tencent.mm.plugin.appbrand.backgroundrunning.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f76976d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f76977e = new java.util.HashSet();

    public void Ai(com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel mMBackgroundRunningOperationParcel) {
        if (mMBackgroundRunningOperationParcel == null || com.tencent.mm.sdk.platformtools.t8.K0(mMBackgroundRunningOperationParcel.f76945d)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBackgroundRunningManagerService", "receiveOperation in appbrand process, operation:%s", mMBackgroundRunningOperationParcel);
        synchronized (this.f76977e) {
            java.util.Iterator it = this.f76977e.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.appbrand.backgroundrunning.t0) it.next()).a(mMBackgroundRunningOperationParcel);
            }
        }
    }

    public void Bi(com.tencent.mm.plugin.appbrand.backgroundrunning.u0 u0Var) {
        if (u0Var == null) {
            return;
        }
        synchronized (this.f76976d) {
            this.f76976d.remove(u0Var);
        }
    }

    public void Di(com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel) {
        if (appBrandBackgroundRunningOperationParcel != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBackgroundRunningManagerService", "sendOperation from appbrand process, operation:%s", appBrandBackgroundRunningOperationParcel);
            synchronized (this.f76976d) {
                java.util.Iterator it = this.f76976d.iterator();
                while (it.hasNext()) {
                    ((com.tencent.mm.plugin.appbrand.backgroundrunning.u0) it.next()).a(appBrandBackgroundRunningOperationParcel);
                }
            }
            if (appBrandBackgroundRunningOperationParcel.f76943r) {
                return;
            }
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, appBrandBackgroundRunningOperationParcel, com.tencent.mm.plugin.appbrand.backgroundrunning.j.class, new com.tencent.mm.plugin.appbrand.backgroundrunning.i(this));
        }
    }

    public void wi(com.tencent.mm.plugin.appbrand.backgroundrunning.u0 u0Var) {
        if (u0Var == null) {
            return;
        }
        synchronized (this.f76976d) {
            this.f76976d.add(u0Var);
        }
    }
}
