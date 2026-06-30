package g40;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public h40.b f350208a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p947xba6de98f.v2 f350209b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f350210c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d f350211d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f350212e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f350213f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f350214g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f350215h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f350216i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f350217j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f350218k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.p947xba6de98f.q0 f350219l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.ref.WeakReference f350220m;

    public g(h40.b downloadFromScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadFromScene, "downloadFromScene");
        this.f350208a = downloadFromScene;
        this.f350213f = "";
        this.f350214g = "";
        this.f350218k = new java.util.ArrayList();
        this.f350209b = new g40.c(this);
    }

    public final void a(i40.a aVar) {
        if (aVar != null) {
            java.util.ArrayList arrayList = this.f350218k;
            boolean z17 = false;
            if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((java.lang.ref.WeakReference) it.next()).get(), aVar)) {
                        z17 = true;
                        break;
                    }
                }
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileMsgDownloadHelper", "callback: isExist");
            } else {
                arrayList.add(new java.lang.ref.WeakReference(aVar));
            }
        }
    }

    public final void b(int i17, int i18, java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileMsgDownloadHelper", "callbackSceneEnd: errType:" + i17 + " errCode:" + i18 + " errMsg:" + str);
        if (this.f350211d == null) {
            return;
        }
        boolean z17 = true;
        if (!(i17 == 0 && i18 == 0)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f350212e;
            if (f9Var != null) {
                ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).wi(false, java.lang.String.valueOf(f9Var.m124847x74d37ac6()), f9Var.I0(), false, false, f9Var.Q0());
            }
            g(i17, i18, str, null);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = this.f350212e;
        if (f9Var2 != null) {
            ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).wi(false, java.lang.String.valueOf(f9Var2.m124847x74d37ac6()), f9Var2.I0(), true, false, f9Var2.Q0());
        }
        d();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = this.f350211d;
        if (dVar != null && (str2 = dVar.f68099xfeae815) != null) {
            if (!(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2))) {
                str2 = null;
            }
            if (str2 != null) {
                ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).getClass();
                ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(str2, com.p314xaae8f345.mm.vfs.w6.k(str2) >= ez.v0.f339310a.h() ? 130 : 6, null, null);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyDownloadSucceed, fileDownloadCallbacks.size: ");
        java.util.ArrayList arrayList = this.f350218k;
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileMsgDownloadHelper", sb6.toString());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i40.a aVar = (i40.a) ((java.lang.ref.WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.c();
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var3 = this.f350212e;
        if (f9Var3 != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar2 = this.f350211d;
            java.lang.String n17 = com.p314xaae8f345.mm.vfs.w6.n(dVar2 != null ? dVar2.f68099xfeae815 : null);
            if (n17 != null && n17.length() != 0) {
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileMsgDownloadHelper", "reportDownloadSucceed " + f9Var3.m124847x74d37ac6() + ", " + f9Var3.Q0() + ", " + f9Var3.I0() + ", ext is empty");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileMsgDownloadHelper", "reportDownloadSucceed " + f9Var3.m124847x74d37ac6() + ", " + f9Var3.Q0() + ", " + f9Var3.I0() + ", downloadFromScene: " + this.f350208a.f360258d);
                ct.w2 w2Var = (ct.w2) i95.n0.c(ct.w2.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n17);
                ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d3) w2Var).Ai(f9Var3, n17, this.f350208a.f360258d, "");
            }
        }
        kz5.h0.B(arrayList, g40.f.f350207d);
    }

    public final void c(i40.b bVar) {
        if (bVar != null) {
            this.f350220m = new java.lang.ref.WeakReference(bVar);
        }
        this.f350219l = new g40.a(this);
        sx.b0 b0Var = (sx.b0) i95.n0.c(sx.b0.class);
        java.lang.String str = this.f350210c;
        if (str == null) {
            str = "";
        }
        ((rx.f) b0Var).wi(str, new java.lang.ref.WeakReference(this.f350219l));
        d();
    }

    public final void d() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f350212e;
        if (f9Var != null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a3) ((ct.v2) i95.n0.c(ct.v2.class))).getClass();
            d35.h.f307877a.a(f9Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x039e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r27, java.lang.String r28, i40.a r29, boolean r30, boolean r31, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r32) {
        /*
            Method dump skipped, instructions count: 1345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g40.g.e(com.tencent.mm.storage.f9, java.lang.String, i40.a, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void f(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar) {
        dVar.f68112x10a0fed7 = 198L;
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).mo9952xce0038c9(dVar, new java.lang.String[0]);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(dVar.f68107xaaaa6883, dVar.f68106x315a5445);
        ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(n17, dVar, 4, false);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(n17.m124847x74d37ac6(), n17, true);
        b(3, -5103087, "filename too long");
    }

    public final void g(int i17, int i18, java.lang.String str, h40.d dVar) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var;
        dn.h hVar;
        com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var2;
        dn.h hVar2;
        com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var3;
        dn.h hVar3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyDownloadFailed, fileDownloadCallbacks.size: ");
        java.util.ArrayList arrayList = this.f350218k;
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileMsgDownloadHelper", sb6.toString());
        boolean z17 = true;
        if (!((dVar == null || (n1Var3 = dVar.f360268b) == null || (hVar3 = n1Var3.f152641f) == null || hVar3.f69553xb5f54fe9 != -5103059) ? false : true)) {
            if (!((dVar == null || (n1Var2 = dVar.f360268b) == null || (hVar2 = n1Var2.f152641f) == null || hVar2.f69553xb5f54fe9 != -5103017) ? false : true)) {
                z17 = false;
            }
        }
        if (dVar != null && (n1Var = dVar.f360268b) != null && (hVar = n1Var.f152641f) != null) {
            i18 = hVar.f69553xb5f54fe9;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i40.a aVar = (i40.a) ((java.lang.ref.WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.d(i17, i18, str, z17);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var != null) {
                arrayList2.add(f0Var);
            }
        }
        kz5.h0.B(arrayList, g40.f.f350207d);
    }

    public final void h(long j17, long j18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyProcessUpdate, fileDownloadCallbacks.size: ");
        java.util.ArrayList arrayList = this.f350218k;
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileMsgDownloadHelper", sb6.toString());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i40.a aVar = (i40.a) ((java.lang.ref.WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.a(j17, j18);
            }
        }
        kz5.h0.B(arrayList, g40.f.f350207d);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g40.d
            if (r0 == 0) goto L13
            r0 = r6
            g40.d r0 = (g40.d) r0
            int r1 = r0.f350205f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f350205f = r1
            goto L18
        L13:
            g40.d r0 = new g40.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f350203d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f350205f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L4c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            boolean r6 = r4.f350215h
            if (r6 == 0) goto L39
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L39:
            java.lang.Class<pt.j0> r6 = pt.j0.class
            i95.m r6 = i95.n0.c(r6)
            pt.j0 r6 = (pt.j0) r6
            r0.f350205f = r3
            ez.e r6 = (ez.e) r6
            java.lang.Object r6 = r6.oj(r5, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            cu.a r6 = (cu.a) r6
            boolean r5 = r6.f303838a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g40.g.i(com.tencent.mm.storage.f9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.String j(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            pt.j0 j0Var = (pt.j0) i95.n0.c(pt.j0.class);
            java.lang.String q17 = com.p314xaae8f345.mm.vfs.w6.q(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(q17, "getNameWithoutExt(...)");
            java.lang.String n17 = com.p314xaae8f345.mm.vfs.w6.n(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "getFileExt(...)");
            str = ((ez.e) j0Var).cj(f9Var, q17, n17, true);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = this.f350211d;
            if (dVar != null) {
                dVar.f68099xfeae815 = str;
            }
        }
        return str;
    }

    public final void k(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar, long j17) {
        dVar.f68112x10a0fed7 = 199L;
        dVar.f68109x90a9378 = j17;
        dVar.f68113xeb1a61d6 = j17;
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).mo9952xce0038c9(dVar, new java.lang.String[0]);
    }

    public final void l(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(dVar.f68107xaaaa6883, dVar.f68106x315a5445);
        if (n17.P0() == 5) {
            n17.r1(3);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(n17.m124847x74d37ac6(), n17, true);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m0(new xg3.l0(n17.Q0(), "update", n17, 0));
        }
        b(0, 0, "");
    }
}
