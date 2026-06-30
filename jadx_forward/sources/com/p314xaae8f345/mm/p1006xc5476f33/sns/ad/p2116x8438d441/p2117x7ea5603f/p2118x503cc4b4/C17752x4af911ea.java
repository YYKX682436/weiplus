package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2117x7ea5603f.p2118x503cc4b4;

/* renamed from: com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager */
/* loaded from: classes4.dex */
public class C17752x4af911ea implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f244721e = new android.util.ArrayMap();

    /* renamed from: d, reason: collision with root package name */
    public final g74.b f244722d = new g74.b();

    private C17752x4af911ea() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2117x7ea5603f.p2118x503cc4b4.C17752x4af911ea a(android.app.Activity r6) {
        /*
            java.lang.String r0 = "getInstance"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            boolean r2 = r6 instanceof p012xc85e97e9.p093xedfae76a.y
            r3 = 0
            if (r2 == 0) goto L55
            java.util.Map r2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2117x7ea5603f.p2118x503cc4b4.C17752x4af911ea.f244721e
            int r4 = r6.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = r2
            android.util.ArrayMap r5 = (android.util.ArrayMap) r5
            java.lang.Object r4 = r5.get(r4)
            com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager r4 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2117x7ea5603f.p2118x503cc4b4.C17752x4af911ea) r4
            if (r4 != 0) goto L51
            java.lang.String r4 = "newInstance"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r4, r1)
            boolean r5 = r6 instanceof p012xc85e97e9.p093xedfae76a.y     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L36
            r5 = r6
            androidx.lifecycle.y r5 = (p012xc85e97e9.p093xedfae76a.y) r5     // Catch: java.lang.Throwable -> L36
            com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager r3 = b(r5)     // Catch: java.lang.Throwable -> L36
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r1)
            goto L39
        L36:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r1)
        L39:
            if (r3 == 0) goto L50
            java.lang.String r4 = "RequestListenerManager"
            java.lang.String r5 = "new one RequestListenerManager instance!!!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5)
            int r6 = r6.hashCode()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            android.util.ArrayMap r2 = (android.util.ArrayMap) r2
            r2.put(r6, r3)
        L50:
            r4 = r3
        L51:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r4
        L55:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2117x7ea5603f.p2118x503cc4b4.C17752x4af911ea.a(android.app.Activity):com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2117x7ea5603f.p2118x503cc4b4.C17752x4af911ea b(p012xc85e97e9.p093xedfae76a.y yVar) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("newInstanceInner", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
        try {
            if (yVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("RequestListenerManager", "the input life cycle owner is null!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newInstanceInner", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
                return null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2117x7ea5603f.p2118x503cc4b4.C17752x4af911ea c17752x4af911ea = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2117x7ea5603f.p2118x503cc4b4.C17752x4af911ea();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("attachToOwner", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
            try {
                yVar.mo273xed6858b4().a(c17752x4af911ea);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("attachToOwner", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
                z17 = true;
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RequestListenerManager", "RequestListenerManager attachToOwner failed!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("attachToOwner", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newInstanceInner", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
                return c17752x4af911ea;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newInstanceInner", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
            return null;
        } catch (java.lang.Throwable unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RequestListenerManager", "new one instance of RequestListenerManager failed!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newInstanceInner", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
            return null;
        }
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: doDestroy */
    public final void m69483xb56a08ef(p012xc85e97e9.p093xedfae76a.y yVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doDestroy", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
            g74.b bVar = this.f244722d;
            if (bVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                ((java.util.HashMap) bVar.f350878a).clear();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doDestroy", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
    }
}
