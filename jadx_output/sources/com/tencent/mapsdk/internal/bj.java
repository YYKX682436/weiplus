package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class bj {

    /* renamed from: a, reason: collision with root package name */
    private static volatile com.tencent.mapsdk.internal.bj f48973a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f48974b = false;

    private bj() {
    }

    public static com.tencent.mapsdk.internal.bj a() {
        if (f48973a == null) {
            synchronized (com.tencent.mapsdk.internal.bj.class) {
                if (f48973a == null) {
                    f48973a = new com.tencent.mapsdk.internal.bj();
                }
            }
        }
        return f48973a;
    }

    public final synchronized void a(com.tencent.mapsdk.internal.bn bnVar) {
        if (this.f48974b) {
            return;
        }
        if (bnVar != null && !bnVar.x().a()) {
            com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.bj.1
                private static java.lang.Boolean a() {
                    try {
                        com.tencent.mapsdk.internal.dx dxVar = (com.tencent.mapsdk.internal.dx) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.dx.class);
                        if (android.text.TextUtils.isEmpty(com.tencent.mapsdk.internal.hn.e())) {
                            com.tencent.mapsdk.internal.hn.e();
                        }
                        com.tencent.map.tools.net.NetResponse launchStat = ((com.tencent.mapsdk.internal.di) dxVar.i()).launchStat(com.tencent.mapsdk.internal.hs.a(), java.net.URLEncoder.encode(com.tencent.mapsdk.internal.hs.c(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding), com.tencent.mapsdk.internal.hn.d(), com.tencent.mapsdk.internal.hn.e(), com.tencent.mapsdk.internal.hn.j(), com.tencent.mapsdk.internal.hn.k(), com.tencent.mapsdk.internal.hn.n(), com.tencent.mapsdk.internal.hn.c(), com.tencent.mapsdk.internal.hn.g());
                        if (launchStat != null) {
                            com.tencent.mapsdk.core.utils.log.LogUtil.b("LaunchStat data with response:".concat(new java.lang.String(launchStat.data, launchStat.charset)));
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mapsdk.core.utils.log.LogUtil.d("err:" + e17.getMessage());
                    }
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("cm_model", com.tencent.mapsdk.internal.hs.c());
                    com.tencent.mapsdk.internal.u.a();
                    new com.tencent.mapsdk.shell.events.ReportEvent("cm_stat", hashMap);
                    return java.lang.Boolean.TRUE;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    return a();
                }
            }).a((com.tencent.mapsdk.internal.ko.b.a) java.lang.Boolean.FALSE);
            this.f48974b = true;
        }
    }
}
