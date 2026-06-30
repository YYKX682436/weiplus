package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes14.dex */
public final class b7 implements com.tencent.mm.app.a3, c01.yc {

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f76394f;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f76392d = java.lang.String.valueOf(hashCode());

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f76393e = true;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f76395g = new java.util.concurrent.atomic.AtomicBoolean(true);

    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 addMsgInfo) {
        kotlin.jvm.internal.o.g(addMsgInfo, "addMsgInfo");
        if (gm0.j1.a()) {
            java.lang.String g17 = x51.j1.g(addMsgInfo.f70726a.f377561h);
            if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                return;
            }
            pm0.v.O(this.f76392d, new com.tencent.mm.plugin.appbrand.appusage.y6(this, g17));
        }
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaStarAndHistoryPushingReceiver", "fetchStartAndHistory");
        com.tencent.mm.plugin.appbrand.appusage.c1 z07 = com.tencent.mm.plugin.appbrand.appusage.c1.z0();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        z07.s0(java.lang.System.currentTimeMillis(), true, null, 4, 0);
    }

    public final java.util.List c(java.util.Map map, java.lang.String str) {
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".DeleteCount"), 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (P > 0) {
            int i17 = 0;
            while (i17 < P) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append(".DeleteList.DeleteAppInfo");
                sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                java.lang.String sb7 = sb6.toString();
                java.lang.String str2 = (java.lang.String) map.get(sb7 + ".UserName");
                java.lang.String str3 = (java.lang.String) map.get(sb7 + ".AppID");
                int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(sb7 + ".AppType"), 0);
                boolean z17 = true;
                if (!(str2 == null || str2.length() == 0)) {
                    if (str3 != null && str3.length() != 0) {
                        z17 = false;
                    }
                    if (!z17) {
                        arrayList.add(new com.tencent.mm.plugin.appbrand.appusage.w6(str2, str3, P2));
                    }
                }
                i17++;
            }
        }
        return arrayList;
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }

    @Override // com.tencent.mm.app.a3
    public android.os.Handler getHandler() {
        return null;
    }

    @Override // com.tencent.mm.app.a3
    public void onAppBackground(java.lang.String str) {
        if (gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaStarAndHistoryPushingReceiver", "onAppBackground");
            this.f76393e = true;
        }
    }

    @Override // com.tencent.mm.app.a3
    public void onAppForeground(java.lang.String str) {
        if (gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaStarAndHistoryPushingReceiver", "onAppForeground");
            this.f76393e = false;
            if (this.f76394f) {
                this.f76394f = false;
                pm0.v.O(this.f76392d, new com.tencent.mm.plugin.appbrand.appusage.a7(this));
            }
        }
    }
}
