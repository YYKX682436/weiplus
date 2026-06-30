package com.tencent.mm.model.newabtest;

@j95.b
@java.lang.Deprecated
/* loaded from: classes8.dex */
public class z extends i95.w {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f70410f;

    /* renamed from: g, reason: collision with root package name */
    public static final l75.q0 f70411g;

    /* renamed from: h, reason: collision with root package name */
    public static final en1.j f70412h;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.storage.e f70413d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.b f70414e;

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f70410f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ActivateEvent>(a0Var) { // from class: com.tencent.mm.model.newabtest.SubCoreNewABTest$1
            {
                this.__eventId = -1435144905;
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
            
                if (r4 > r8) goto L26;
             */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.ActivateEvent r12) {
                /*
                    r11 = this;
                    com.tencent.mm.autogen.events.ActivateEvent r12 = (com.tencent.mm.autogen.events.ActivateEvent) r12
                    am.d r12 = r12.f53964g
                    boolean r12 = r12.f6412a
                    r0 = 1
                    if (r12 == 0) goto Lbe
                    boolean r12 = gm0.j1.a()
                    java.lang.String r1 = "MicroMsg.ABTestUpdater"
                    if (r12 != 0) goto L18
                    java.lang.String r12 = "Update aborted, Account not ready."
                    com.tencent.mars.xlog.Log.i(r1, r12)
                    goto Lbe
                L18:
                    gm0.b0 r12 = gm0.j1.u()
                    com.tencent.mm.storage.n3 r12 = r12.c()
                    com.tencent.mm.storage.u3 r2 = com.tencent.mm.storage.u3.USERINFO_ABTEST_LAST_UPDATE_TIME_LONG
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
                    com.tencent.mm.model.newabtest.d.b(r12)
                    com.tencent.mm.model.newabtest.d.c()
                    com.tencent.mm.model.newabtest.d.a()
                    java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                    java.lang.Object[] r12 = new java.lang.Object[]{r12}
                    java.lang.String r2 = "First update ignored. Next update: %d"
                    com.tencent.mars.xlog.Log.i(r1, r2, r12)
                    goto Lad
                L5a:
                    gm0.b0 r12 = gm0.j1.u()
                    com.tencent.mm.storage.n3 r12 = r12.c()
                    com.tencent.mm.storage.u3 r4 = com.tencent.mm.storage.u3.USERINFO_ABTEST_UPDATE_TIME_INTERVAL_INT
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
                    com.tencent.mars.xlog.Log.i(r1, r2, r12)
                    if (r8 <= 0) goto Lae
                Lad:
                    r9 = r0
                Lae:
                    if (r9 != 0) goto Lb1
                    goto Lbe
                Lb1:
                    boolean r12 = com.tencent.mm.model.newabtest.d.f70394a
                    if (r12 == 0) goto Lbb
                    java.lang.String r12 = "Updating"
                    com.tencent.mars.xlog.Log.i(r1, r12)
                    goto Lbe
                Lbb:
                    com.tencent.mm.model.newabtest.d.d()
                Lbe:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.model.newabtest.SubCoreNewABTest$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        f70411g = new com.tencent.mm.model.newabtest.v();
        f70412h = new com.tencent.mm.model.newabtest.w();
    }

    public static com.tencent.mm.storage.e Ai() {
        gm0.j1.b().c();
        if (Bi().f70413d == null) {
            Bi().f70413d = new com.tencent.mm.storage.e(gm0.j1.u().f273153f);
        }
        return Bi().f70413d;
    }

    public static synchronized com.tencent.mm.model.newabtest.z Bi() {
        com.tencent.mm.model.newabtest.z zVar;
        synchronized (com.tencent.mm.model.newabtest.z.class) {
            zVar = (com.tencent.mm.model.newabtest.z) i95.n0.c(com.tencent.mm.model.newabtest.z.class);
        }
        return zVar;
    }

    public static com.tencent.mm.storage.b wi() {
        gm0.j1.b().c();
        if (Bi().f70414e == null) {
            Bi().f70414e = new com.tencent.mm.storage.b(gm0.j1.u().f273153f);
        }
        return Bi().f70414e;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
    }
}
