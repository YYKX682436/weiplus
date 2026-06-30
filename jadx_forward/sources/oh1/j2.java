package oh1;

/* loaded from: classes4.dex */
public enum j2 {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f426774d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f426775e = new java.util.concurrent.atomic.AtomicBoolean(true);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f426776f = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    public int f426777g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f426778h = 0;

    j2() {
    }

    public static void a(oh1.j2 j2Var, java.util.LinkedList linkedList) {
        j2Var.getClass();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.zr6 zr6Var = (r45.zr6) it.next();
            oh1.e2 e2Var = (oh1.e2) ((java.util.concurrent.ConcurrentHashMap) j2Var.f426774d).get(java.lang.Integer.valueOf(zr6Var.f473872d.hashCode()));
            if (e2Var == null) {
                return;
            }
            e2Var.f426739c = zr6Var.f473876h;
            e2Var.f426740d = java.lang.System.currentTimeMillis();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(oh1.j2 r10, java.util.LinkedList r11, int r12) {
        /*
            r10.getClass()
            java.util.Iterator r11 = r11.iterator()
        L7:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r0 = r11.next()
            r45.zr6 r0 = (r45.zr6) r0
            r1 = 1
            if (r12 != r1) goto L2f
            java.lang.String r1 = r0.f473872d
            java.util.Map r2 = r10.f426774d
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            java.lang.Object r1 = r2.get(r1)
            oh1.e2 r1 = (oh1.e2) r1
            if (r1 == 0) goto L2f
            java.lang.String r1 = r1.f426742f
            goto L31
        L2f:
            java.lang.String r1 = ""
        L31:
            java.lang.Class<k01.x0> r2 = k01.x0.class
            i95.m r2 = i95.n0.c(r2)
            k01.x0 r2 = (k01.x0) r2
            java.lang.String r3 = r0.f473872d
            java.lang.String r4 = r0.f473874f
            java.lang.String r5 = r0.f473875g
            int r6 = r0.f473876h
            int r0 = r0.f473877i
            oh1.k2 r2 = (oh1.k2) r2
            r2.getClass()
            java.lang.Class<tt0.f> r2 = tt0.f.class
            java.lang.Object r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(r2)
            tt0.f r2 = (tt0.f) r2
            if (r2 != 0) goto L5b
            java.lang.String r0 = "MicroMsg.WxaUpdateableMsgService"
            java.lang.String r1 = "wxaUpdateableMsgStorage is null, err"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
            goto L7
        L5b:
            boolean r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)
            if (r7 == 0) goto L6a
            java.lang.String r0 = "MicroMsg.WxaUpdateableMsgStorage"
            java.lang.String r1 = "shareKey is null, err"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
            goto L93
        L6a:
            tt0.e r7 = new tt0.e
            r7.<init>()
            int r8 = r3.hashCode()
            r7.f66304xc29dba53 = r8
            r8 = 0
            java.lang.String[] r9 = new java.lang.String[r8]
            boolean r9 = r2.get(r7, r9)
            r7.f66305xce2ee4db = r6
            r7.f66302xd09abf35 = r0
            r7.f66300xad49e234 = r4
            r7.f66301x3c339d8f = r5
            r7.f66303xc4aab016 = r12
            r7.f66306xf47bcabf = r1
            if (r9 == 0) goto L90
            java.lang.String[] r0 = new java.lang.String[r8]
            r2.mo9952xce0038c9(r7, r0)
            goto L93
        L90:
            r2.mo880xb970c2b9(r7)
        L93:
            r3.getClass()
            goto L7
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oh1.j2.b(oh1.j2, java.util.LinkedList, int):void");
    }

    public static void d(oh1.j2 j2Var, java.util.LinkedList linkedList) {
        j2Var.getClass();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.zr6 zr6Var = (r45.zr6) it.next();
            oh1.e2 e2Var = (oh1.e2) ((java.util.concurrent.ConcurrentHashMap) j2Var.f426774d).get(java.lang.Integer.valueOf(zr6Var.f473872d.hashCode()));
            if (e2Var == null) {
                return;
            }
            k01.w0 w0Var = e2Var.f426743g;
            if (w0Var != null) {
                w0Var.a(zr6Var.f473872d, zr6Var);
            }
        }
    }

    public static void e(oh1.j2 j2Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        java.util.Map map;
        j2Var.getClass();
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            map = j2Var.f426774d;
            if (!hasNext) {
                break;
            }
            oh1.e2 e2Var = (oh1.e2) ((java.util.concurrent.ConcurrentHashMap) map).get(java.lang.Integer.valueOf(((r45.l46) it.next()).f460661e.hashCode()));
            if (e2Var == null) {
                break;
            } else {
                e2Var.f426740d = java.lang.System.currentTimeMillis();
            }
        }
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            oh1.e2 e2Var2 = (oh1.e2) ((java.util.concurrent.ConcurrentHashMap) map).get(java.lang.Integer.valueOf(((r45.l46) it6.next()).f460661e.hashCode()));
            if (e2Var2 == null) {
                return;
            } else {
                e2Var2.f426740d = java.lang.System.currentTimeMillis();
            }
        }
    }

    public static void f(oh1.j2 j2Var) {
        synchronized (j2Var) {
            if (java.lang.System.currentTimeMillis() - j2Var.f426778h > 300000) {
                j2Var.f426777g = 0;
            }
            if (j2Var.f426777g <= 1) {
                j2Var.f426778h = java.lang.System.currentTimeMillis();
                j2Var.f426777g++;
                j2Var.h();
            }
        }
    }

    public final void h() {
        ((ku5.t0) ku5.t0.f394148d).b(new oh1.f2(this), "MicroMsg.WxaUpdateableMsgService");
    }
}
