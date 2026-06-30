package zx5;

/* loaded from: classes13.dex */
public class j implements java.lang.Runnable {
    public j(zx5.k kVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if ("true".equalsIgnoreCase(com.p314xaae8f345.p3210x3857dc.b.m().g("dis_refresh_plugin_cmd", "tools"))) {
            by5.c4.f("XWebBroadcastListener", "onPluginCfgUpdated, dis_refresh_plugin_cmd false");
            return;
        }
        synchronized (com.p314xaae8f345.p3210x3857dc.c.class) {
            by5.c4.f("CommandCfgPlugin", "resetCommandCfg, module: " + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.m(""));
            com.p314xaae8f345.p3210x3857dc.c.f301750d = null;
            com.p314xaae8f345.p3210x3857dc.c.z();
        }
    }
}
