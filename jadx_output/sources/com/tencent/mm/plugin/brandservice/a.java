package com.tencent.mm.plugin.brandservice;

@j95.b
/* loaded from: classes11.dex */
public class a extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f93910d;

    /* renamed from: e, reason: collision with root package name */
    public d95.b0 f93911e = null;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.app.s2 f93912f = new com.tencent.mm.app.s2(this) { // from class: com.tencent.mm.plugin.brandservice.PluginBrandService$2
        @Override // com.tencent.mm.app.t2
        public void onAppBackground(java.lang.String str) {
            yw.w1 w1Var = yw.w1.f466487a;
            if (yw.w1.f466488b && ((java.lang.Boolean) ((jz5.n) yw.w1.f466493g).getValue()).booleanValue()) {
                ku5.u0 u0Var = ku5.t0.f312615d;
                yw.q1 q1Var = yw.q1.f466433d;
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.w(q1Var, 3000L, null);
            }
            vw.m2 m2Var = (vw.m2) ((rv.k3) i95.n0.c(rv.k3.class));
            m2Var.getClass();
            if (!z40.e.l4() || !((y40.i0) z40.e.get()).Ni()) {
                if (m2Var.aj()) {
                    ((ku5.t0) ku5.t0.f312615d).h(new vw.n1(m2Var), "onAppBackground");
                    return;
                }
                return;
            }
            y40.i0 i0Var = (y40.i0) z40.e.get();
            com.tencent.mars.xlog.Log.i(i0Var.f459295d, "onAppBackground");
            if (i0Var.Ni()) {
                ((ku5.t0) ku5.t0.f312615d).h(new y40.m(i0Var), "onAppBackground");
            }
        }

        @Override // com.tencent.mm.app.t2
        public void onAppForeground(java.lang.String str) {
            yw.w1.f466487a.a("onAppForeground");
            o25.q qVar = o25.q.f342574a;
            if (qVar.f()) {
                if (qVar.g() ? qVar.e().getBoolean("biz_time_preload_at_foreground", false) : false) {
                    qVar.i();
                }
            }
            vw.m2 m2Var = (vw.m2) ((rv.k3) i95.n0.c(rv.k3.class));
            m2Var.getClass();
            if (z40.e.l4() && ((y40.i0) z40.e.get()).Ni()) {
                y40.i0 i0Var = (y40.i0) z40.e.get();
                com.tencent.mars.xlog.Log.i(i0Var.f459295d, "onAppForeground");
                if (i0Var.Ni()) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis() - com.tencent.mm.plugin.biz.q.f93870d;
                    if (currentTimeMillis < i0Var.f459310v) {
                        ku5.u0 u0Var = ku5.t0.f312615d;
                        y40.n nVar = new y40.n(i0Var);
                        long j17 = i0Var.f459310v - currentTimeMillis;
                        ((ku5.t0) u0Var).l(nVar, j17 >= 5000 ? j17 : 5000L, "onAppForeground");
                    } else {
                        ((ku5.t0) ku5.t0.f312615d).h(new y40.o(i0Var), "onAppForeground");
                    }
                }
            } else if (m2Var.aj()) {
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - com.tencent.mm.plugin.biz.q.f93870d;
                if (currentTimeMillis2 < m2Var.f440699v) {
                    ku5.u0 u0Var2 = ku5.t0.f312615d;
                    vw.o1 o1Var = new vw.o1(m2Var);
                    long j18 = m2Var.f440699v - currentTimeMillis2;
                    ((ku5.t0) u0Var2).l(o1Var, j18 >= 5000 ? j18 : 5000L, "onAppForeground");
                } else {
                    ((ku5.t0) ku5.t0.f312615d).h(new vw.p1(m2Var), "onAppForeground");
                }
            }
            lr1.b.f320640a.a();
        }
    };

    public static void c0(xg3.m0 m0Var, final xg3.l0 l0Var) {
        java.util.ArrayList arrayList;
        java.lang.String Q0;
        if (z65.c.f470458d || m0Var == null || l0Var == null) {
            return;
        }
        if (lr1.e.f320653c == 0 && c01.s0.d() && ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi() != null) {
            java.lang.String str = l0Var.f454411b;
            if ((kotlin.jvm.internal.o.b("insert", str) || kotlin.jvm.internal.o.b("update", str)) && (arrayList = l0Var.f454412c) != null) {
                int size = arrayList.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size) {
                        break;
                    }
                    com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) arrayList.get(i17);
                    if (f9Var != null && (Q0 = f9Var.Q0()) != null) {
                        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(Q0, true);
                        er1.b Ai = yq1.u0.Ai();
                        kotlin.jvm.internal.o.f(Ai, "getBizContactConversationMassSendStorage(...)");
                        java.lang.String[] strArr = er1.b.f256006e;
                        int b17 = Ai.b1(Q0, 0L);
                        if (n17 != null && n17.n2() && b17 == 0) {
                            lr1.e.f320653c = f9Var.getCreateTime();
                            break;
                        }
                    }
                    i17++;
                }
            }
        }
        yq1.n.a("BrandServiceWorkerThread", new wu5.n() { // from class: com.tencent.mm.plugin.brandservice.PluginBrandService$1
            /* JADX WARN: Removed duplicated region for block: B:130:0x0548  */
            /* JADX WARN: Removed duplicated region for block: B:134:0x054f  */
            /* JADX WARN: Removed duplicated region for block: B:202:0x024a  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 2074
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.brandservice.PluginBrandService$1.run():void");
            }
        }, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005e, code lost:
    
        if (r11 > java.lang.Long.parseLong(r2, 16)) goto L13;
     */
    @Override // i95.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAccountInitialized(android.content.Context r15) {
        /*
            r14 = this;
            super.onAccountInitialized(r15)
            com.tencent.mm.app.s2 r15 = r14.f93912f
            r15.alive()
            java.lang.String r15 = "MicroMsg.BizMassSendStorageUtil"
            java.lang.String r0 = "init"
            com.tencent.mars.xlog.Log.i(r15, r0)
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.z.f193111g
            java.lang.String r2 = "CLIENT_VERSION"
            kotlin.jvm.internal.o.f(r1, r2)
            gm0.m r2 = gm0.j1.b()
            int r2 = r2.h()
            java.lang.String r3 = "brandService"
            r4 = 1
            com.tencent.mm.sdk.platformtools.o4 r2 = com.tencent.mm.sdk.platformtools.o4.J(r3, r2, r4)
            java.lang.String r5 = "getAccountAwareMMKV(...)"
            kotlin.jvm.internal.o.f(r2, r5)
            java.lang.String r6 = "biz_mass_send_last_client_version"
            java.lang.String r7 = ""
            java.lang.String r2 = r2.getString(r6, r7)
            if (r2 != 0) goto L35
            goto L36
        L35:
            r7 = r2
        L36:
            int r2 = r7.length()
            r8 = 0
            if (r2 <= 0) goto L3f
            r2 = r4
            goto L40
        L3f:
            r2 = r8
        L40:
            if (r2 == 0) goto L60
            java.lang.String r2 = "0x"
            java.lang.String r9 = r26.n0.W(r1, r2)
            r10 = 16
            r26.a.a(r10)
            long r11 = java.lang.Long.parseLong(r9, r10)
            java.lang.String r2 = r26.n0.W(r7, r2)
            r26.a.a(r10)
            long r9 = java.lang.Long.parseLong(r2, r10)
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r2 <= 0) goto L61
        L60:
            r8 = r4
        L61:
            r2 = 0
            if (r8 == 0) goto La3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Version upgraded from "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = " to "
            r8.append(r7)
            r8.append(r1)
            java.lang.String r7 = ", clearing new table"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.tencent.mars.xlog.Log.i(r15, r7)
            kotlinx.coroutines.i2 r8 = kotlinx.coroutines.i2.f310477d
            kotlinx.coroutines.p0 r9 = kotlinx.coroutines.q1.f310570c
            r10 = 0
            lr1.c r11 = new lr1.c
            r11.<init>(r2)
            r12 = 2
            r13 = 0
            kotlinx.coroutines.l.d(r8, r9, r10, r11, r12, r13)
            gm0.m r15 = gm0.j1.b()
            int r15 = r15.h()
            com.tencent.mm.sdk.platformtools.o4 r15 = com.tencent.mm.sdk.platformtools.o4.J(r3, r15, r4)
            kotlin.jvm.internal.o.f(r15, r5)
            r15.putString(r6, r1)
        La3:
            lr1.b r15 = lr1.b.f320640a
            java.lang.String r1 = "MicroMsg.BizCommonStrategyManager"
            com.tencent.mars.xlog.Log.i(r1, r0)
            r15.a()
            com.tencent.mm.storage.a1 r15 = com.tencent.mm.storage.a1.f193716a
            java.lang.Class<vg3.x3> r15 = vg3.x3.class
            lm0.a r15 = gm0.j1.s(r15)
            vg3.x3 r15 = (vg3.x3) r15
            com.tencent.mm.plugin.messenger.foundation.h2 r15 = (com.tencent.mm.plugin.messenger.foundation.h2) r15
            com.tencent.mm.storage.g9 r15 = r15.cj()
            com.tencent.mm.storage.i0 r0 = com.tencent.mm.storage.a1.E
            r15.n0(r0, r2)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.j0 r15 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.j0
            r15.<init>()
            java.lang.String r0 = "//mpfast"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            q25.b.b(r15, r0)
            yq1.j r15 = new yq1.j
            r15.<init>()
            java.lang.String r0 = "//biz"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            q25.b.b(r15, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.brandservice.a.onAccountInitialized(android.content.Context):void");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        this.f93912f.dead();
        ur1.j jVar = ur1.j.f430354a;
        if (ur1.n.f430361a.a()) {
            jVar.a().j("biz_publish_personal_center_event");
        }
        lr1.e.f320653c = 0L;
        com.tencent.mm.storage.a1 a1Var = com.tencent.mm.storage.a1.f193716a;
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(com.tencent.mm.storage.a1.E);
        d95.b0 b0Var = this.f93911e;
        if (b0Var != null) {
            b0Var.M(null);
        }
    }

    public d95.b0 wi() {
        d95.b0 b0Var = this.f93911e;
        if (b0Var != null) {
            return b0Var;
        }
        this.f93910d = gm0.j1.u().h() + "BizFans.db";
        if (this.f93911e == null) {
            d95.b0 b0Var2 = new d95.b0();
            this.f93911e = b0Var2;
            java.lang.String str = this.f93910d;
            java.util.HashMap hashMap = new java.util.HashMap();
            final hr1.n nVar = hr1.o.f283357g;
            hashMap.put(-1124309231, new d95.c0(nVar) { // from class: yq1.q0$$a
                @Override // d95.c0
                public final java.lang.String[] a() {
                    hr1.n nVar2 = hr1.o.f283357g;
                    return hr1.o.f283358h;
                }
            });
            final hr1.b bVar = hr1.c.f283341e;
            hashMap.put(-76560051, new d95.c0(bVar) { // from class: yq1.q0$$b
                @Override // d95.c0
                public final java.lang.String[] a() {
                    hr1.b bVar2 = hr1.c.f283341e;
                    return hr1.c.f283342f;
                }
            });
            final hr1.g gVar = hr1.i.f283349e;
            hashMap.put(953052022, new d95.c0(gVar) { // from class: yq1.q0$$c
                @Override // d95.c0
                public final java.lang.String[] a() {
                    hr1.g gVar2 = hr1.i.f283349e;
                    return hr1.i.f283350f;
                }
            });
            final nr1.j jVar = nr1.k.f339152g;
            hashMap.put(1325132165, new d95.c0(jVar) { // from class: yq1.q0$$d
                @Override // d95.c0
                public final java.lang.String[] a() {
                    nr1.j jVar2 = nr1.k.f339152g;
                    return nr1.k.f339153h;
                }
            });
            final nr1.a aVar = nr1.b.f339135e;
            hashMap.put(-1344625215, new d95.c0(aVar) { // from class: yq1.q0$$e
                @Override // d95.c0
                public final java.lang.String[] a() {
                    nr1.a aVar2 = nr1.b.f339135e;
                    return nr1.b.f339136f;
                }
            });
            final nr1.d dVar = nr1.f.f339140e;
            hashMap.put(-423676030, new d95.c0(dVar) { // from class: yq1.q0$$f
                @Override // d95.c0
                public final java.lang.String[] a() {
                    nr1.d dVar2 = nr1.f.f339140e;
                    return nr1.f.f339141f;
                }
            });
            if (!b0Var2.S(str, hashMap, true, true)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.PluginBrandService", "Biz Fans db init failed!");
            }
        }
        return this.f93911e;
    }
}
