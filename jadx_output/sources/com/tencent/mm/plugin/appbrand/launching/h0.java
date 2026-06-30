package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class h0 {
    public h0(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(java.lang.String instanceId, ne1.j state, java.lang.String pluginAppId, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(pluginAppId, "pluginAppId");
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            throw new java.lang.IllegalStateException("Must be invoked in mm process!".toString());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage", "dispatch onPluginUpdateStatusChange(state:" + state + ", pluginAppId:" + pluginAppId + "), instanceId:" + instanceId + ", invoke");
        com.tencent.mm.plugin.appbrand.launching.x2 j17 = com.tencent.mm.plugin.appbrand.launching.x2.j(instanceId);
        if (j17 == null) {
            return b(instanceId, state, pluginAppId, i17, str);
        }
        if (!u46.l.e(pluginAppId)) {
            synchronized (j17.Z) {
                j17.Z.addLast(new com.tencent.mm.plugin.appbrand.launching.wa(state, pluginAppId, i17, str));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage", "dispatch onPluginUpdateStatusChange(state:" + state + ", pluginAppId:" + pluginAppId + "), instanceId:" + instanceId + ", stash in AppLaunchPrepareProcess");
        return true;
    }

    public final boolean b(java.lang.String instanceId, ne1.j state, java.lang.String pluginAppId, int i17, java.lang.String str) {
        java.lang.String str2;
        java.lang.Object obj;
        com.tencent.luggage.sdk.processes.s sVar;
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(pluginAppId, "pluginAppId");
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            throw new java.lang.IllegalStateException("Must be invoked in mm process!".toString());
        }
        try {
            com.tencent.mm.plugin.appbrand.task.u0 a17 = com.tencent.mm.plugin.appbrand.task.u0.f89199h.a();
            try {
                java.util.Iterator it = a17.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(instanceId, ((com.tencent.luggage.sdk.processes.s) obj).f47691h)) {
                        break;
                    }
                }
                sVar = (com.tencent.luggage.sdk.processes.s) obj;
            } catch (com.tencent.luggage.sdk.processes.y e17) {
                e = e17;
                str2 = "MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage";
            }
            if (sVar == null) {
                str2 = "MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage";
                com.tencent.mars.xlog.Log.e(str2, "dispatch onPluginUpdateStatusChange(state:" + state + ", pluginAppId:" + pluginAppId + "), instanceId:" + instanceId + ", no app records found");
                return false;
            }
            try {
                com.tencent.luggage.sdk.processes.h.q(a17.f(sVar), new com.tencent.mm.plugin.appbrand.launching.AppBrandPluginUpdateStatusChangeIPCMessage(sVar.f47684a, instanceId, state, pluginAppId, i17, str), null, 2, null);
                str2 = "MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage";
            } catch (com.tencent.luggage.sdk.processes.y e18) {
                e = e18;
                str2 = "MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage";
            }
            try {
                com.tencent.mars.xlog.Log.i(str2, "dispatch onPluginUpdateStatusChange(state:" + state + ", pluginAppId:" + pluginAppId + "), instanceId:" + instanceId + ", by ProcessesManager");
                return true;
            } catch (com.tencent.luggage.sdk.processes.y e19) {
                e = e19;
                com.tencent.mars.xlog.Log.printErrStackTrace(str2, e, "caught exception", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.e(str2, "dispatch onPluginUpdateStatusChange(state:" + state + ", pluginAppId:" + pluginAppId + "), instanceId:" + instanceId + ", no app records found");
                return false;
            }
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage", "dispatch onPluginUpdateStatusChange(state:" + state + ", pluginAppId:" + pluginAppId + "), instanceId:" + instanceId + ", get exception:" + e27);
            return false;
        }
    }
}
