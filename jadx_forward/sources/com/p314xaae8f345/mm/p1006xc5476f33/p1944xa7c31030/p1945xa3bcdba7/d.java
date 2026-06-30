package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7;

/* loaded from: classes12.dex */
public abstract class d implements tp3.c, com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.x, com.p314xaae8f345.mm.app.h4 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f234446e = "MicroMsg.BaseHookLogic";

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.g f234447f;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.i f234448d;

    static {
        f234446e += p();
        f234447f = null;
    }

    public d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.y.f234487e.a(j(), this);
        com.p314xaae8f345.mm.app.i4.a(this);
        ((java.util.List) com.p314xaae8f345.mm.app.C5000x71a2fa35.R.c(true)).add(new java.util.concurrent.Callable() { // from class: com.tencent.mm.plugin.performance.diagnostic.d$$a
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d.this.i();
            }
        });
        com.p314xaae8f345.mm.app.C4999x403c3a42.f134764l.f135105l.f(new java.util.concurrent.Callable() { // from class: com.tencent.mm.plugin.performance.diagnostic.d$$b
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d.this.i();
            }
        });
        this.f234448d = new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.i(this);
    }

    public static java.lang.String p() {
        java.lang.String a17 = bm5.f1.a();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return "_MM_";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s()) {
            return "_tools_";
        }
        if (a17.contains(":appbrand0")) {
            return "_appbrand0_";
        }
        if (a17.contains(":appbrand1")) {
            return "_appbrand1_";
        }
        if (a17.contains(":appbrand2")) {
            return "_appbrand2_";
        }
        if (a17.contains(":appbrand3")) {
            return "_appbrand3_";
        }
        if (a17.contains(":appbrand4")) {
            return "_appbrand4_";
        }
        java.lang.String[] split = a17.split(":");
        if (split == null || split.length < 2) {
            return "_others_";
        }
        return "_" + split[1] + "_";
    }

    public static void t(xh.b... bVarArr) {
        com.p314xaae8f345.p552xbf8d97c1.p561x30f523.C4648x15f5dcea c4648x15f5dcea = com.p314xaae8f345.p552xbf8d97c1.p561x30f523.C4648x15f5dcea.f134165e;
        boolean z17 = true;
        for (xh.b bVar : bVarArr) {
            if (bVar != null) {
                z17 = false;
            }
            c4648x15f5dcea.a(bVar);
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.g gVar = f234447f;
        if (gVar != null) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.a.b(true);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BacktraceLogic", th6, "", new java.lang.Object[0]);
            }
        }
        c4648x15f5dcea.b();
        if (gVar == null || !com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.a.f234443c) {
            return;
        }
        com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p565xf09afa7a.C4657x40d13e9d.f134210h.e(true);
    }

    @Override // com.p314xaae8f345.mm.app.h4
    public void a(java.lang.Thread thread, java.lang.String str, java.lang.Throwable th6) {
        l();
    }

    @Override // tp3.c
    public final java.lang.String b() {
        return ".cmd.diagnostic." + j();
    }

    @Override // tp3.c
    public final void c(java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(f234446e, "[%s] onReceiveCmd", j());
        java.lang.String str = (java.lang.String) map.get(h().f234455b);
        if (android.text.TextUtils.isEmpty(str) || "PUSH".equalsIgnoreCase(str)) {
            n(map, com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.j.PUSH);
            return;
        }
        if (!h().e() && "AUTO".equalsIgnoreCase(str)) {
            o(map, com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.j.AUTO);
        } else {
            if (h().e() || !"EXPT".equalsIgnoreCase(str)) {
                return;
            }
            o(map, com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.j.EXPT);
        }
    }

    @Override // com.p314xaae8f345.mm.app.h4
    public void e(int i17, java.lang.String str) {
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final xh.b f() {
        /*
            r12 = this;
            java.lang.String r0 = r12.j()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "[%s] boot"
            java.lang.String r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d.f234446e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1, r0)
            boolean r0 = r12.g()
            r1 = 1
            r3 = 0
            if (r0 == 0) goto Le1
            com.tencent.mm.plugin.performance.diagnostic.f r0 = r12.h()
            boolean r0 = r0.e()
            if (r0 == 0) goto Le1
            com.tencent.mm.plugin.performance.diagnostic.f r0 = r12.h()
            boolean r0 = r0.b()
            if (r0 == 0) goto Le1
            com.tencent.mm.plugin.performance.diagnostic.f r0 = r12.h()
            com.tencent.mm.sdk.platformtools.o4 r4 = r0.f234454a
            java.lang.String r0 = r0.f234457d
            int r0 = r4.o(r0, r3)
            long r4 = (long) r0
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            long r4 = r4 * r6
            com.tencent.mm.plugin.performance.diagnostic.f r0 = r12.h()
            java.lang.String r6 = r0.f234458e
            com.tencent.mm.sdk.platformtools.o4 r0 = r0.f234454a
            r7 = 0
            long r9 = r0.q(r6, r7)
            java.lang.String r0 = r12.j()
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
            java.lang.String r11 = sp3.d.f(r9)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r6, r11}
            java.lang.String r6 = "[%s] hook duration = %s, hook begin time = %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6, r0)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 >= 0) goto L84
            long r4 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.performance.diagnostic.f r0 = r12.h()
            com.tencent.mm.sdk.platformtools.o4 r6 = r0.f234454a
            java.lang.String r0 = r0.f234458e
            r6.B(r0, r4)
            java.lang.String r0 = r12.j()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r4}
            java.lang.String r4 = "[%s] update hookBeginTime = %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r4, r0)
            goto L9f
        L84:
            com.tencent.mm.plugin.performance.diagnostic.f r0 = r12.h()
            java.lang.String r6 = r0.f234461h
            r7 = -1
            com.tencent.mm.sdk.platformtools.o4 r0 = r0.f234454a
            int r0 = r0.o(r6, r7)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r9
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 > 0) goto La1
            int r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h
            if (r0 == r8) goto L9f
            goto La1
        L9f:
            r0 = r1
            goto Lcc
        La1:
            com.tencent.mm.plugin.performance.diagnostic.f r8 = r12.h()
            java.lang.String r9 = r8.f234456c
            com.tencent.mm.sdk.platformtools.o4 r8 = r8.f234454a
            r8.G(r9, r3)
            java.lang.String r8 = r12.j()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r6, r4, r0, r5}
            java.lang.String r4 = "[%s] time out, disable hook: (%s > %s || 0x%x != 0x%x)"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r4, r0)
            r0 = r3
        Lcc:
            if (r0 == 0) goto Le1
            byte[] r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.f181284a
            java.lang.String r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            xh.b r0 = r12.q()
            if (r0 == 0) goto Le2
            r12.r()
            com.tencent.mm.plugin.performance.diagnostic.i r4 = r12.f234448d
            r4.a()
            goto Le2
        Le1:
            r0 = 0
        Le2:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = r12.j()
            r4[r3] = r5
            if (r0 == 0) goto Lee
            r3 = r1
        Lee:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4[r1] = r3
            java.lang.String r1 = "[%s] boot enable=%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d.f():xh.b");
    }

    public final boolean g() {
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.f h17 = h();
        if (i17 != h17.f234454a.o(h17.f234461h, -1)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.f h18 = h();
            h18.f234454a.A(h18.f234462i, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.f h19 = h();
        boolean z17 = h19.f234454a.o(h19.f234462i, 0) >= 3 && !z65.c.a();
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(f234446e, "[%s] crash too many times, disable hook", j());
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.f h27 = h();
            h27.f234454a.G(h27.f234456c, false);
        }
        return !z17;
    }

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.f h();

    public final java.lang.String i() {
        java.lang.Object[] objArr = {j()};
        java.lang.String str = f234446e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "[%s] crash happened", objArr);
        boolean e17 = h().e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.f h17 = h();
        int o17 = h17.f234454a.o(h17.f234462i, 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(j());
        sb6.append(":\nenable=");
        sb6.append(e17);
        if (e17) {
            try {
                s(true);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, th6, "error onCrash", new java.lang.Object[0]);
            }
            java.lang.String k17 = k();
            sb6.append(",");
            sb6.append(k17);
            sb6.append(",begin:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.f h18 = h();
            sb6.append(sp3.d.f(h18.f234454a.q(h18.f234458e, 0L)));
            sb6.append(",crash times:");
            o17++;
            sb6.append(o17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.f h19 = h();
            h19.f234454a.A(h19.f234462i, o17);
        }
        if (e17 && o17 >= 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.f h27 = h();
            h27.f234454a.G(h27.f234456c, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "[%s] crash happens 3 times, disable hook: %s", j(), j());
            jx3.f.INSTANCE.w(1376L, 1L, 1L);
        }
        return sb6.toString();
    }

    public abstract java.lang.String j();

    public abstract java.lang.String k();

    public final void l() {
        java.lang.Object[] objArr = {j()};
        java.lang.String str = f234446e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "[%s] crash happened", objArr);
        boolean e17 = h().e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.f h17 = h();
        int o17 = h17.f234454a.o(h17.f234462i, 0);
        if (e17) {
            try {
                s(true);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, th6, "error onCrash", new java.lang.Object[0]);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.f h18 = h();
            o17++;
            h18.f234454a.A(h18.f234462i, o17);
        }
        if (!e17 || o17 < 3) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.f h19 = h();
        h19.f234454a.G(h19.f234456c, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "[%s] crash happens 3 times, disable hook: %s", j(), j());
        jx3.f.INSTANCE.w(1376L, 1L, 1L);
    }

    public abstract void m(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.j jVar);

    public final void n(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.j jVar) {
        java.lang.Object[] objArr = {j(), map};
        java.lang.String str = f234446e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[%s] processCmd: [%s]", objArr);
        boolean e17 = h().e();
        h().a(map);
        boolean e18 = h().e();
        boolean b17 = h().b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "alreadyEnabled=" + e17 + ", enableHook=" + e18 + ", filterProcess=" + b17);
        if (!e17 && e18 && b17) {
            byte[] bArr = com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.f181284a;
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[%s] hook immediately", j());
            try {
                t(q());
                m(jVar);
                r();
                this.f234448d.a();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, th6, "[%s] do hook error", j());
            }
        }
    }

    public final void o(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.j jVar) {
        if (g()) {
            n(map, jVar);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(f234446e, "[%s] crash too many times, disable the hook", j());
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.f h17 = h();
        h17.f234454a.G(h17.f234456c, false);
    }

    public abstract xh.b q();

    public final void r() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = f234446e;
        sb6.append(str);
        sb6.append("-repeat");
        java.lang.String sb7 = sb6.toString();
        long c17 = h().c();
        ((ku5.t0) ku5.t0.f394148d).A(sb7);
        if (c17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[%s] dump cycle is negative. just disable repeating dump", j());
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).l(new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.e(this, c17, sb7), c17, sb7);
    }

    public abstract void s(boolean z17);
}
