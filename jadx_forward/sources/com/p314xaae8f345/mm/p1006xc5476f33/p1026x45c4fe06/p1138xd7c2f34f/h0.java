package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class h0 {
    public h0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(java.lang.String instanceId, ne1.j state, java.lang.String pluginAppId, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceId, "instanceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAppId, "pluginAppId");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            throw new java.lang.IllegalStateException("Must be invoked in mm process!".toString());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage", "dispatch onPluginUpdateStatusChange(state:" + state + ", pluginAppId:" + pluginAppId + "), instanceId:" + instanceId + ", invoke");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2 j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2.j(instanceId);
        if (j17 == null) {
            return b(instanceId, state, pluginAppId, i17, str);
        }
        if (!u46.l.e(pluginAppId)) {
            synchronized (j17.Z) {
                j17.Z.addLast(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.wa(state, pluginAppId, i17, str));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage", "dispatch onPluginUpdateStatusChange(state:" + state + ", pluginAppId:" + pluginAppId + "), instanceId:" + instanceId + ", stash in AppLaunchPrepareProcess");
        return true;
    }

    public final boolean b(java.lang.String instanceId, ne1.j state, java.lang.String pluginAppId, int i17, java.lang.String str) {
        java.lang.String str2;
        java.lang.Object obj;
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceId, "instanceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAppId, "pluginAppId");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            throw new java.lang.IllegalStateException("Must be invoked in mm process!".toString());
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a();
            try {
                java.util.Iterator it = a17.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(instanceId, ((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) obj).f129224h)) {
                        break;
                    }
                }
                sVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) obj;
            } catch (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.y e17) {
                e = e17;
                str2 = "MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage";
            }
            if (sVar == null) {
                str2 = "MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "dispatch onPluginUpdateStatusChange(state:" + state + ", pluginAppId:" + pluginAppId + "), instanceId:" + instanceId + ", no app records found");
                return false;
            }
            try {
                com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h.q(a17.f(sVar), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12329x5651dcf(sVar.f129217a, instanceId, state, pluginAppId, i17, str), null, 2, null);
                str2 = "MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage";
            } catch (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.y e18) {
                e = e18;
                str2 = "MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage";
            }
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "dispatch onPluginUpdateStatusChange(state:" + state + ", pluginAppId:" + pluginAppId + "), instanceId:" + instanceId + ", by ProcessesManager");
                return true;
            } catch (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.y e19) {
                e = e19;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str2, e, "caught exception", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "dispatch onPluginUpdateStatusChange(state:" + state + ", pluginAppId:" + pluginAppId + "), instanceId:" + instanceId + ", no app records found");
                return false;
            }
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPluginUpdateStatusChangeIPCMessage", "dispatch onPluginUpdateStatusChange(state:" + state + ", pluginAppId:" + pluginAppId + "), instanceId:" + instanceId + ", get exception:" + e27);
            return false;
        }
    }
}
