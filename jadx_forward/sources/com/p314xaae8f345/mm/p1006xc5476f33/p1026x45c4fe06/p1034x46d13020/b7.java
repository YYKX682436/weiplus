package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes14.dex */
public final class b7 implements com.p314xaae8f345.mm.app.a3, c01.yc {

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f157927f;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f157925d = java.lang.String.valueOf(hashCode());

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f157926e = true;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f157928g = new java.util.concurrent.atomic.AtomicBoolean(true);

    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 addMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addMsgInfo, "addMsgInfo");
        if (gm0.j1.a()) {
            java.lang.String g17 = x51.j1.g(addMsgInfo.f152259a.f459094h);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                return;
            }
            pm0.v.O(this.f157925d, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y6(this, g17));
        }
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaStarAndHistoryPushingReceiver", "fetchStartAndHistory");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1 z07 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1.z0();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        z07.s0(java.lang.System.currentTimeMillis(), true, null, 4, 0);
    }

    public final java.util.List c(java.util.Map map, java.lang.String str) {
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".DeleteCount"), 0);
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
                int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(sb7 + ".AppType"), 0);
                boolean z17 = true;
                if (!(str2 == null || str2.length() == 0)) {
                    if (str3 != null && str3.length() != 0) {
                        z17 = false;
                    }
                    if (!z17) {
                        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w6(str2, str3, P2));
                    }
                }
                i17++;
            }
        }
        return arrayList;
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }

    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: getHandler */
    public android.os.Handler mo14497x67189314() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: onAppBackground */
    public void mo510x3be51a90(java.lang.String str) {
        if (gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaStarAndHistoryPushingReceiver", "onAppBackground");
            this.f157926e = true;
        }
    }

    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: onAppForeground */
    public void mo511x1952ea5(java.lang.String str) {
        if (gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaStarAndHistoryPushingReceiver", "onAppForeground");
            this.f157926e = false;
            if (this.f157927f) {
                this.f157927f = false;
                pm0.v.O(this.f157925d, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.a7(this));
            }
        }
    }
}
