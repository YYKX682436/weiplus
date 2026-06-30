package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e;

@j95.b
/* loaded from: classes11.dex */
public class a extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f175443d;

    /* renamed from: e, reason: collision with root package name */
    public d95.b0 f175444e = null;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.s2 f175445f = new com.p314xaae8f345.mm.app.s2(this) { // from class: com.tencent.mm.plugin.brandservice.PluginBrandService$2
        @Override // com.p314xaae8f345.mm.app.t2
        /* renamed from: onAppBackground */
        public void mo8889x3be51a90(java.lang.String str) {
            yw.w1 w1Var = yw.w1.f548020a;
            if (yw.w1.f548021b && ((java.lang.Boolean) ((jz5.n) yw.w1.f548026g).mo141623x754a37bb()).booleanValue()) {
                ku5.u0 u0Var = ku5.t0.f394148d;
                yw.q1 q1Var = yw.q1.f547966d;
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.w(q1Var, 3000L, null);
            }
            vw.m2 m2Var = (vw.m2) ((rv.k3) i95.n0.c(rv.k3.class));
            m2Var.getClass();
            if (!z40.e.l4() || !((y40.i0) z40.e.get()).Ni()) {
                if (m2Var.aj()) {
                    ((ku5.t0) ku5.t0.f394148d).h(new vw.n1(m2Var), "onAppBackground");
                    return;
                }
                return;
            }
            y40.i0 i0Var = (y40.i0) z40.e.get();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.f540828d, "onAppBackground");
            if (i0Var.Ni()) {
                ((ku5.t0) ku5.t0.f394148d).h(new y40.m(i0Var), "onAppBackground");
            }
        }

        @Override // com.p314xaae8f345.mm.app.t2
        /* renamed from: onAppForeground */
        public void mo8890x1952ea5(java.lang.String str) {
            yw.w1.f548020a.a("onAppForeground");
            o25.q qVar = o25.q.f424107a;
            if (qVar.f()) {
                if (qVar.g() ? qVar.e().getBoolean("biz_time_preload_at_foreground", false) : false) {
                    qVar.i();
                }
            }
            vw.m2 m2Var = (vw.m2) ((rv.k3) i95.n0.c(rv.k3.class));
            m2Var.getClass();
            if (z40.e.l4() && ((y40.i0) z40.e.get()).Ni()) {
                y40.i0 i0Var = (y40.i0) z40.e.get();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.f540828d, "onAppForeground");
                if (i0Var.Ni()) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.p1006xc5476f33.biz.q.f175403d;
                    if (currentTimeMillis < i0Var.f540843v) {
                        ku5.u0 u0Var = ku5.t0.f394148d;
                        y40.n nVar = new y40.n(i0Var);
                        long j17 = i0Var.f540843v - currentTimeMillis;
                        ((ku5.t0) u0Var).l(nVar, j17 >= 5000 ? j17 : 5000L, "onAppForeground");
                    } else {
                        ((ku5.t0) ku5.t0.f394148d).h(new y40.o(i0Var), "onAppForeground");
                    }
                }
            } else if (m2Var.aj()) {
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.p1006xc5476f33.biz.q.f175403d;
                if (currentTimeMillis2 < m2Var.f522232v) {
                    ku5.u0 u0Var2 = ku5.t0.f394148d;
                    vw.o1 o1Var = new vw.o1(m2Var);
                    long j18 = m2Var.f522232v - currentTimeMillis2;
                    ((ku5.t0) u0Var2).l(o1Var, j18 >= 5000 ? j18 : 5000L, "onAppForeground");
                } else {
                    ((ku5.t0) ku5.t0.f394148d).h(new vw.p1(m2Var), "onAppForeground");
                }
            }
            lr1.b.f402173a.a();
        }
    };

    public static void c0(xg3.m0 m0Var, final xg3.l0 l0Var) {
        java.util.ArrayList arrayList;
        java.lang.String Q0;
        if (z65.c.f551991d || m0Var == null || l0Var == null) {
            return;
        }
        if (lr1.e.f402186c == 0 && c01.s0.d() && ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi() != null) {
            java.lang.String str = l0Var.f535944b;
            if ((p3321xbce91901.jvm.p3324x21ffc6bd.o.b("insert", str) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("update", str)) && (arrayList = l0Var.f535945c) != null) {
                int size = arrayList.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size) {
                        break;
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList.get(i17);
                    if (f9Var != null && (Q0 = f9Var.Q0()) != null) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(Q0, true);
                        er1.b Ai = yq1.u0.Ai();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Ai, "getBizContactConversationMassSendStorage(...)");
                        java.lang.String[] strArr = er1.b.f337539e;
                        int b17 = Ai.b1(Q0, 0L);
                        if (n17 != null && n17.n2() && b17 == 0) {
                            lr1.e.f402186c = f9Var.mo78012x3fdd41df();
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
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.C12963xc13f286e.run():void");
            }
        }, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005e, code lost:
    
        if (r11 > java.lang.Long.parseLong(r2, 16)) goto L13;
     */
    @Override // i95.w
    /* renamed from: onAccountInitialized */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo204xfac946a6(android.content.Context r15) {
        /*
            r14 = this;
            super.mo204xfac946a6(r15)
            com.tencent.mm.app.s2 r15 = r14.f175445f
            r15.m43071x58998cd()
            java.lang.String r15 = "MicroMsg.BizMassSendStorageUtil"
            java.lang.String r0 = "init"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r15, r0)
            java.lang.String r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g
            java.lang.String r2 = "CLIENT_VERSION"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            gm0.m r2 = gm0.j1.b()
            int r2 = r2.h()
            java.lang.String r3 = "brandService"
            r4 = 1
            com.tencent.mm.sdk.platformtools.o4 r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J(r3, r2, r4)
            java.lang.String r5 = "getAccountAwareMMKV(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r5)
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r15, r7)
            kotlinx.coroutines.i2 r8 = p3325xe03a0797.p3326xc267989b.i2.f392010d
            kotlinx.coroutines.p0 r9 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            r10 = 0
            lr1.c r11 = new lr1.c
            r11.<init>(r2)
            r12 = 2
            r13 = 0
            p3325xe03a0797.p3326xc267989b.l.d(r8, r9, r10, r11, r12, r13)
            gm0.m r15 = gm0.j1.b()
            int r15 = r15.h()
            com.tencent.mm.sdk.platformtools.o4 r15 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J(r3, r15, r4)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r15, r5)
            r15.putString(r6, r1)
        La3:
            lr1.b r15 = lr1.b.f402173a
            java.lang.String r1 = "MicroMsg.BizCommonStrategyManager"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            r15.a()
            com.tencent.mm.storage.a1 r15 = com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275249a
            java.lang.Class<vg3.x3> r15 = vg3.x3.class
            lm0.a r15 = gm0.j1.s(r15)
            vg3.x3 r15 = (vg3.x3) r15
            com.tencent.mm.plugin.messenger.foundation.h2 r15 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r15
            com.tencent.mm.storage.g9 r15 = r15.cj()
            com.tencent.mm.storage.i0 r0 = com.p314xaae8f345.mm.p2621x8fb0427b.a1.E
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.a.mo204xfac946a6(android.content.Context):void");
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        this.f175445f.m43072x2efc64();
        ur1.j jVar = ur1.j.f511887a;
        if (ur1.n.f511894a.a()) {
            jVar.a().j("biz_publish_personal_center_event");
        }
        lr1.e.f402186c = 0L;
        com.p314xaae8f345.mm.p2621x8fb0427b.a1 a1Var = com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275249a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(com.p314xaae8f345.mm.p2621x8fb0427b.a1.E);
        d95.b0 b0Var = this.f175444e;
        if (b0Var != null) {
            b0Var.M(null);
        }
    }

    public d95.b0 wi() {
        d95.b0 b0Var = this.f175444e;
        if (b0Var != null) {
            return b0Var;
        }
        this.f175443d = gm0.j1.u().h() + "BizFans.db";
        if (this.f175444e == null) {
            d95.b0 b0Var2 = new d95.b0();
            this.f175444e = b0Var2;
            java.lang.String str = this.f175443d;
            java.util.HashMap hashMap = new java.util.HashMap();
            final hr1.n nVar = hr1.o.f364890g;
            hashMap.put(-1124309231, new d95.c0(nVar) { // from class: yq1.q0$$a
                @Override // d95.c0
                public final java.lang.String[] a() {
                    hr1.n nVar2 = hr1.o.f364890g;
                    return hr1.o.f364891h;
                }
            });
            final hr1.b bVar = hr1.c.f364874e;
            hashMap.put(-76560051, new d95.c0(bVar) { // from class: yq1.q0$$b
                @Override // d95.c0
                public final java.lang.String[] a() {
                    hr1.b bVar2 = hr1.c.f364874e;
                    return hr1.c.f364875f;
                }
            });
            final hr1.g gVar = hr1.i.f364882e;
            hashMap.put(953052022, new d95.c0(gVar) { // from class: yq1.q0$$c
                @Override // d95.c0
                public final java.lang.String[] a() {
                    hr1.g gVar2 = hr1.i.f364882e;
                    return hr1.i.f364883f;
                }
            });
            final nr1.j jVar = nr1.k.f420685g;
            hashMap.put(1325132165, new d95.c0(jVar) { // from class: yq1.q0$$d
                @Override // d95.c0
                public final java.lang.String[] a() {
                    nr1.j jVar2 = nr1.k.f420685g;
                    return nr1.k.f420686h;
                }
            });
            final nr1.a aVar = nr1.b.f420668e;
            hashMap.put(-1344625215, new d95.c0(aVar) { // from class: yq1.q0$$e
                @Override // d95.c0
                public final java.lang.String[] a() {
                    nr1.a aVar2 = nr1.b.f420668e;
                    return nr1.b.f420669f;
                }
            });
            final nr1.d dVar = nr1.f.f420673e;
            hashMap.put(-423676030, new d95.c0(dVar) { // from class: yq1.q0$$f
                @Override // d95.c0
                public final java.lang.String[] a() {
                    nr1.d dVar2 = nr1.f.f420673e;
                    return nr1.f.f420674f;
                }
            });
            if (!b0Var2.S(str, hashMap, true, true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginBrandService", "Biz Fans db init failed!");
            }
        }
        return this.f175444e;
    }
}
