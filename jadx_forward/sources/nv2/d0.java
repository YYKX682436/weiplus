package nv2;

/* loaded from: classes10.dex */
public final class d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final nv2.d0 f422003e = new nv2.d0();

    /* renamed from: a, reason: collision with root package name */
    public final fp0.o f422004a = new fp0.o(new gp0.g(new gp0.b(100, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "finder_action_follow_post_quene"));

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f422005b = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f422006c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f422007d = new nv2.c0(this);

    public static /* synthetic */ void b(nv2.d0 d0Var, java.lang.String str, int i17, long j17, java.lang.String str2, r45.qt2 qt2Var, boolean z17, int i18, java.lang.String str3, r45.o72 o72Var, java.lang.Integer num, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, int i19, r45.p31 p31Var, java.lang.String str4, java.lang.String str5, int i27, java.lang.Object obj) {
        d0Var.a(str, i17, j17, str2, qt2Var, z17, (i27 & 64) != 0 ? 0 : i18, (i27 & 128) != 0 ? "" : str3, (i27 & 256) != 0 ? null : o72Var, (i27 & 512) != 0 ? 0 : num, (i27 & 1024) != 0 ? null : gVar, (i27 & 2048) != 0 ? null : gVar2, (i27 & 4096) != 0 ? 0 : i19, (i27 & 8192) != 0 ? new r45.p31() : p31Var, (i27 & 16384) != 0 ? "" : str4, (i27 & 32768) != 0 ? "" : str5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r8.f421970i == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(nv2.d0 r8, java.lang.String r9, boolean r10, boolean r11, int r12, java.lang.Object r13) {
        /*
            r13 = r12 & 2
            r0 = 0
            if (r13 == 0) goto L7
            r4 = r0
            goto L8
        L7:
            r4 = r10
        L8:
            r10 = r12 & 4
            if (r10 == 0) goto Le
            r5 = r0
            goto Lf
        Le:
            r5 = r11
        Lf:
            r8.getClass()
            if (r9 == 0) goto L3f
            java.lang.String r10 = ""
            boolean r10 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r9, r10)
            if (r10 == 0) goto L1d
            goto L3f
        L1d:
            ya2.g r1 = ya2.h.f542017a
            r3 = 0
            r6 = 2
            r7 = 0
            r2 = r9
            boolean r10 = ya2.g.h(r1, r2, r3, r4, r5, r6, r7)
            java.util.concurrent.ConcurrentHashMap r8 = r8.f422006c
            java.lang.Object r8 = r8.get(r9)
            nv2.a0 r8 = (nv2.a0) r8
            if (r8 == 0) goto L3c
            int r9 = db2.m0.f309599v
            int r9 = r8.f421966e
            r10 = 1
            if (r9 != r10) goto L3d
            boolean r8 = r8.f421970i
            if (r8 != 0) goto L3d
        L3c:
            r0 = r10
        L3d:
            java.lang.String r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nv2.d0.c(nv2.d0, java.lang.String, boolean, boolean, int, java.lang.Object):boolean");
    }

    public final void a(java.lang.String finderUser, int i17, long j17, java.lang.String str, r45.qt2 qt2Var, boolean z17, int i18, java.lang.String participantFinderUsername, r45.o72 o72Var, java.lang.Integer num, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, int i19, r45.p31 newLifeReportInfo, java.lang.String nonceId, java.lang.String micId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUser, "finderUser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(participantFinderUsername, "participantFinderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newLifeReportInfo, "newLifeReportInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micId, "micId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FollowActionMgr", "doFollow finderUser = " + finderUser + " opType = " + i17 + ", feedId = " + j17 + ", scene = " + num);
        nv2.a0 a0Var = new nv2.a0(finderUser, i17, j17, str, qt2Var, z17, i18, participantFinderUsername, o72Var, num, gVar, gVar2, 0, 0L, i19, newLifeReportInfo, nonceId, micId, 12288, null);
        this.f422006c.put(finderUser, a0Var);
        this.f422004a.b(new nv2.f0(a0Var), new nv2.b0(this, a0Var));
        ((nv2.v) ((nv2.g0) i95.n0.c(nv2.g0.class))).Ai(1, finderUser, i17 == 2);
    }

    public final boolean d(java.lang.String str) {
        boolean z17 = false;
        if (str == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
            return false;
        }
        ya2.b2 b17 = ya2.h.f542017a.b(str);
        boolean z18 = b17 != null && b17.f69313xcad4ef95 == ya2.b2.P2;
        nv2.a0 a0Var = (nv2.a0) this.f422006c.get(str);
        if (a0Var != null) {
            int i17 = db2.m0.f309599v;
            if (a0Var.f421966e == 1 && a0Var.f421970i) {
                z17 = true;
            }
            z18 = z17;
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return z18;
    }

    public final void e(nv2.a0 action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f422006c;
        java.lang.String str = action.f421965d;
        nv2.a0 a0Var = (nv2.a0) concurrentHashMap.get(str);
        if (a0Var != null) {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (action.f422108c >= a0Var.f422108c) {
                concurrentHashMap.remove(str);
            }
        }
    }

    public final void f() {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f422005b;
        if (concurrentLinkedQueue.size() <= 0) {
            return;
        }
        nv2.r rVar = (nv2.r) concurrentLinkedQueue.poll();
        boolean b17 = rVar.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FollowActionMgr", "tryNext isValid:" + b17 + " action:" + rVar + " size:" + concurrentLinkedQueue.size());
        if (!b17) {
            f();
            return;
        }
        this.f422004a.b(new nv2.f0(rVar), new nv2.b0(this, rVar));
    }
}
