package ug3;

/* loaded from: classes11.dex */
public class i extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f509069g = null;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f509070h = null;

    /* renamed from: i, reason: collision with root package name */
    public static java.util.ArrayList f509071i = null;

    /* renamed from: m, reason: collision with root package name */
    public static int f509072m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static int f509073n = -1;

    /* renamed from: o, reason: collision with root package name */
    public static int f509074o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static int f509075p = 0;

    /* renamed from: q, reason: collision with root package name */
    public static int f509076q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static volatile boolean f509077r = true;

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.List f509078s = new java.util.ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public static l90.j f509079t = null;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f509080d;

    /* renamed from: e, reason: collision with root package name */
    public final int f509081e;

    /* renamed from: f, reason: collision with root package name */
    public final ug3.j f509082f;

    public i(int i17) {
        this.f509081e = 0;
        this.f509082f = null;
        f509072m = i17;
    }

    public static void H(final ug3.k kVar, final com.p314xaae8f345.mm.p957x53236a1b.r1 r1Var) {
        if (kVar == null || r1Var == null) {
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(kVar.f474004n);
        int i17 = r1Var.f152939d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetOnlineInfo", "changeDeviceAutoLogin iconType:%s, setting:%s", valueOf, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = kVar.f473998e;
        int i18 = kVar.f474003m;
        com.p314xaae8f345.mm.p957x53236a1b.k[] kVarArr = com.p314xaae8f345.mm.p957x53236a1b.k.f152886d;
        new com.p314xaae8f345.mm.p957x53236a1b.g(gVar, i18, 1, i17).l().q(new gm5.a() { // from class: ug3.i$$a
            @Override // gm5.a
            /* renamed from: call */
            public final java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
                com.p314xaae8f345.mm.p957x53236a1b.r1 r1Var2 = com.p314xaae8f345.mm.p957x53236a1b.r1.this;
                ug3.k kVar2 = kVar;
                com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetOnlineInfo", "changeDeviceAutoLogin errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
                if (fVar.f152148a == 0 && fVar.f152149b == 0) {
                    return null;
                }
                dp.a.m125853x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.ghy, 0).show();
                if (r1Var2 == com.p314xaae8f345.mm.p957x53236a1b.r1.f152936e) {
                    kVar2.L = true;
                } else {
                    kVar2.L = false;
                }
                ((ku5.t0) ku5.t0.f394148d).B(new ug3.RunnableC30370x3046da());
                return null;
            }
        });
    }

    public static void I(final ug3.k kVar, final r45.l44 l44Var) {
        if (kVar == null || l44Var == null) {
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(kVar.f474004n);
        int i17 = l44Var.f460659d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetOnlineInfo", "changeKeepLoggedIn iconType:%s, setting:%s", valueOf, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = kVar.f473998e;
        int i18 = kVar.f474003m;
        com.p314xaae8f345.mm.p957x53236a1b.k[] kVarArr = com.p314xaae8f345.mm.p957x53236a1b.k.f152886d;
        new com.p314xaae8f345.mm.p957x53236a1b.g(gVar, i18, 2, i17).l().q(new gm5.a() { // from class: ug3.i$$b
            @Override // gm5.a
            /* renamed from: call */
            public final java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
                r45.l44 l44Var2 = r45.l44.this;
                ug3.k kVar2 = kVar;
                com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetOnlineInfo", "changeKeepLoggedIn errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
                if (fVar.f152148a == 0 && fVar.f152149b == 0) {
                    return null;
                }
                dp.a.m125853x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.mtf, 0).show();
                if (l44Var2 == r45.l44.kKeepLoggedInDisabled) {
                    kVar2.N = true;
                } else {
                    kVar2.N = false;
                }
                ((ku5.t0) ku5.t0.f394148d).B(new ug3.RunnableC30371x3046db());
                return null;
            }
        });
    }

    public static ug3.k J() {
        java.util.ArrayList arrayList = f509071i;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        return (ug3.k) f509071i.get(0);
    }

    public static java.util.ArrayList K() {
        java.util.ArrayList arrayList = f509071i;
        return arrayList != null ? arrayList : new java.util.ArrayList();
    }

    public static boolean L() {
        ug3.k kVar;
        java.util.Iterator it = K().iterator();
        while (true) {
            if (!it.hasNext()) {
                kVar = null;
                break;
            }
            kVar = (ug3.k) it.next();
            if (!kVar.G && kVar.f509087J) {
                break;
            }
        }
        return kVar != null;
    }

    public static void M(ug3.l lVar) {
        java.util.List list = f509078s;
        synchronized (list) {
            ((java.util.ArrayList) list).add(lVar);
        }
        if (f509077r) {
            N();
        }
    }

    public static void N() {
        java.util.ArrayList arrayList;
        java.util.List list = f509078s;
        synchronized (list) {
            arrayList = new java.util.ArrayList(list);
            ((java.util.ArrayList) list).clear();
        }
        boolean L = L();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iy4.b1 b1Var = (iy4.b1) ((ug3.l) it.next());
            b1Var.getClass();
            if (L) {
                android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19508xaed090d.class);
                intent.setFlags(872415232);
                intent.putExtra("deviceName", b1Var.f377465a);
                intent.putExtra("lockDevice", b1Var.f377466b);
                intent.putExtra("uuid", b1Var.f377467c);
                intent.putExtra("unlockTitle", iy4.c1.f377471d);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/webwx/model/StatusNotifyMsgExtension$2", "onOnlineInfoReady", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/webwx/model/StatusNotifyMsgExtension$2", "onOnlineInfoReady", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        f509077r = false;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.rj3 rj3Var = new r45.rj3();
        rj3Var.f466476d = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        rj3Var.f466479g = this.f509081e;
        lVar.f152197a = rj3Var;
        lVar.f152198b = new r45.sj3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getonlineinfo";
        lVar.f152200d = uc1.x1.f76938x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f509080d = u0Var;
        return mo9409x10f9447a(sVar, lVar.a(), this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return uc1.x1.f76938x366c91de;
    }

    /* JADX WARN: Removed duplicated region for block: B:208:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0540 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0472  */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r25, int r26, int r27, java.lang.String r28, com.p314xaae8f345.mm.p971x6de15a2e.v0 r29, byte[] r30) {
        /*
            Method dump skipped, instructions count: 1372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug3.i.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    public i(int i17, int i18, ug3.j jVar) {
        this.f509081e = 0;
        this.f509082f = null;
        f509072m = i17;
        this.f509081e = i18;
        this.f509082f = jVar;
    }
}
