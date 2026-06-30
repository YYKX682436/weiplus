package com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3;

@j95.b
@java.lang.Deprecated
/* loaded from: classes8.dex */
public class z extends i95.w {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f151943f;

    /* renamed from: g, reason: collision with root package name */
    public static final l75.q0 f151944g;

    /* renamed from: h, reason: collision with root package name */
    public static final en1.j f151945h;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.e f151946d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.b f151947e;

    static {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f151943f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47>(a0Var) { // from class: com.tencent.mm.model.newabtest.SubCoreNewABTest$1
            {
                this.f39173x3fe91575 = -1435144905;
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
            
                if (r4 > r8) goto L26;
             */
            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47 r12) {
                /*
                    r11 = this;
                    com.tencent.mm.autogen.events.ActivateEvent r12 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47) r12
                    am.d r12 = r12.f135497g
                    boolean r12 = r12.f87945a
                    r0 = 1
                    if (r12 == 0) goto Lbe
                    boolean r12 = gm0.j1.a()
                    java.lang.String r1 = "MicroMsg.ABTestUpdater"
                    if (r12 != 0) goto L18
                    java.lang.String r12 = "Update aborted, Account not ready."
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r12)
                    goto Lbe
                L18:
                    gm0.b0 r12 = gm0.j1.u()
                    com.tencent.mm.storage.n3 r12 = r12.c()
                    com.tencent.mm.storage.u3 r2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ABTEST_LAST_UPDATE_TIME_LONG
                    r3 = 0
                    java.lang.Object r12 = r12.m(r2, r3)
                    java.lang.Long r12 = (java.lang.Long) r12
                    r4 = 0
                    if (r12 != 0) goto L2f
                    r6 = r4
                    goto L33
                L2f:
                    long r6 = r12.longValue()
                L33:
                    int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                    r2 = 86400(0x15180, float:1.21072E-40)
                    if (r12 != 0) goto L5a
                    java.util.Random r12 = new java.util.Random
                    r12.<init>()
                    int r12 = r12.nextInt(r2)
                    com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.d.b(r12)
                    com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.d.c()
                    com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.d.a()
                    java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                    java.lang.Object[] r12 = new java.lang.Object[]{r12}
                    java.lang.String r2 = "First update ignored. Next update: %d"
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r12)
                    goto Lad
                L5a:
                    gm0.b0 r12 = gm0.j1.u()
                    com.tencent.mm.storage.n3 r12 = r12.c()
                    com.tencent.mm.storage.u3 r4 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ABTEST_UPDATE_TIME_INTERVAL_INT
                    java.lang.Object r12 = r12.m(r4, r3)
                    java.lang.Integer r12 = (java.lang.Integer) r12
                    if (r12 == 0) goto L77
                    int r3 = r12.intValue()
                    if (r3 != 0) goto L73
                    goto L77
                L73:
                    int r2 = r12.intValue()
                L77:
                    long r2 = (long) r2
                    long r4 = java.lang.System.currentTimeMillis()
                    r8 = 1000(0x3e8, double:4.94E-321)
                    long r4 = r4 / r8
                    r12 = 4
                    java.lang.Object[] r12 = new java.lang.Object[r12]
                    long r8 = r6 + r2
                    int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                    r9 = 0
                    if (r8 <= 0) goto L8b
                    r10 = r0
                    goto L8c
                L8b:
                    r10 = r9
                L8c:
                    java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
                    r12[r9] = r10
                    java.lang.Long r6 = java.lang.Long.valueOf(r6)
                    r12[r0] = r6
                    r6 = 2
                    java.lang.Long r2 = java.lang.Long.valueOf(r2)
                    r12[r6] = r2
                    r2 = 3
                    java.lang.Long r3 = java.lang.Long.valueOf(r4)
                    r12[r2] = r3
                    java.lang.String r2 = "Need Update: %b, Last Update Time: %d, Update Interval: %d, Current Time: %d"
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r12)
                    if (r8 <= 0) goto Lae
                Lad:
                    r9 = r0
                Lae:
                    if (r9 != 0) goto Lb1
                    goto Lbe
                Lb1:
                    boolean r12 = com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.d.f151927a
                    if (r12 == 0) goto Lbb
                    java.lang.String r12 = "Updating"
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r12)
                    goto Lbe
                Lbb:
                    com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.d.d()
                Lbe:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.C11104xe8e7ca61.mo1xf5bc2045(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        f151944g = new com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.v();
        f151945h = new com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.w();
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.e Ai() {
        gm0.j1.b().c();
        if (Bi().f151946d == null) {
            Bi().f151946d = new com.p314xaae8f345.mm.p2621x8fb0427b.e(gm0.j1.u().f354686f);
        }
        return Bi().f151946d;
    }

    public static synchronized com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.z Bi() {
        com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.z zVar;
        synchronized (com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.z.class) {
            zVar = (com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.z) i95.n0.c(com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.z.class);
        }
        return zVar;
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.b wi() {
        gm0.j1.b().c();
        if (Bi().f151947e == null) {
            Bi().f151947e = new com.p314xaae8f345.mm.p2621x8fb0427b.b(gm0.j1.u().f354686f);
        }
        return Bi().f151947e;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
    }
}
