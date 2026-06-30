package k50;

/* loaded from: classes9.dex */
public final class d1 extends m50.x {

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f385735s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f385735s = "";
    }

    @Override // m50.x
    public co.a V6() {
        return new jd5.c();
    }

    @Override // m50.x
    public int b7() {
        return 43;
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        if (!com.p314xaae8f345.mm.vfs.w6.j(((jd5.c) c7()).k())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ForwardVideoUIC", "file not exist");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(m158354x19263085());
            u1Var.g(m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nch));
            u1Var.a(true);
            u1Var.l(null);
            u1Var.q(false);
            return false;
        }
        rd0.k1 k1Var = (rd0.k1) i95.n0.c(rd0.k1.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        java.lang.String filePath = ((jd5.c) c7()).k();
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).getClass();
        com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType d17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.d(action.f536274b);
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.fd) k1Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.s(context, filePath, d17);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x015b, code lost:
    
        if (com.p314xaae8f345.mm.vfs.w6.j(tg3.u0.e8((tg3.u0) r3, r0, bm5.f0.f104104s, r12.d(), false, 8, null)) == false) goto L31;
     */
    @Override // m50.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o7(java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.d1.o7(java.lang.String):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        gp.d dVar;
        super.mo739xfd763ae1(bundle);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 e76 = e7();
        int i17 = 0;
        if (e76 != null) {
            jd5.c cVar = (jd5.c) c7();
            java.lang.String Q0 = e76.Q0();
            if (Q0 == null) {
                Q0 = "";
            }
            cVar.set(cVar.f125235d + 1, Q0);
            jd5.c cVar2 = (jd5.c) c7();
            cVar2.set(cVar2.f125235d + 0, java.lang.Long.valueOf(e76.m124847x74d37ac6()));
            jd5.c cVar3 = (jd5.c) c7();
            i95.m c17 = i95.n0.c(tg3.u0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            java.lang.String L4 = tg3.u0.L4((tg3.u0) c17, e76, e76.z0(), false, 4, null);
            if (L4 == null) {
                L4 = "";
            }
            cVar3.o(L4);
            jd5.c cVar4 = (jd5.c) c7();
            i95.m c18 = i95.n0.c(tg3.u0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            java.lang.String e86 = tg3.u0.e8((tg3.u0) c18, e76, bm5.f0.f104104s, ((jd5.c) c7()).k(), false, 8, null);
            cVar4.r(e86 != null ? e86 : "");
        } else {
            if (d61.c.a(((jd5.c) c7()).m140766x4eae2065())) {
                ((jd5.c) c7()).o("");
            }
            if (!com.p314xaae8f345.mm.vfs.w6.j(((jd5.c) c7()).k())) {
                jd5.c cVar5 = (jd5.c) c7();
                i95.m c19 = i95.n0.c(tg3.u0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                java.lang.String e87 = tg3.u0.e8((tg3.u0) c19, null, bm5.f0.f104104s, ((jd5.c) c7()).k(), false, 8, null);
                if (e87 == null) {
                    e87 = "";
                }
                cVar5.r(e87);
                if (!com.p314xaae8f345.mm.vfs.w6.j(((jd5.c) c7()).k())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ForwardVideoUIC", "file not exist, ");
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((jd5.c) c7()).m140766x4eae2065())) {
                r90.l lVar = (r90.l) i95.n0.c(r90.l.class);
                java.lang.String k17 = ((jd5.c) c7()).k();
                ((q90.i) lVar).getClass();
                android.graphics.Bitmap p17 = ai3.d.p(k17);
                if (p17 != null) {
                    java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(m80379x76847179().getCacheDir(), "tempthumb_" + java.lang.System.currentTimeMillis()).o();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                    this.f385735s = o17;
                    try {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(p17, 60, android.graphics.Bitmap.CompressFormat.JPEG, o17, true);
                        ((jd5.c) c7()).o(this.f385735s);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ForwardVideoUIC", e17, "", new java.lang.Object[0]);
                    }
                }
            }
            if (((jd5.c) c7()).m140767x36bbd779() <= 0) {
                jd5.c cVar6 = (jd5.c) c7();
                java.lang.String k18 = ((jd5.c) c7()).k();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k18)) {
                    gp.d dVar2 = null;
                    try {
                        try {
                            try {
                                dVar = new gp.d();
                            } catch (java.lang.Exception e18) {
                                e = e18;
                            }
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            dVar = dVar2;
                        }
                    } catch (java.lang.Exception unused) {
                    }
                    try {
                        dVar.setDataSource(k18);
                        i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(9), 0) / 1000;
                        dVar.release();
                    } catch (java.lang.Exception e19) {
                        e = e19;
                        dVar2 = dVar;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ForwardVideoUIC", e, "", new java.lang.Object[0]);
                        if (dVar2 != null) {
                            dVar2.release();
                        }
                        cVar6.q(i17);
                        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
                        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.r0(((jd5.c) c7()).m140766x4eae2065(), c19767x257d7f, c19767x257d7f2);
                        ((jd5.c) c7()).p(c19767x257d7f.f38864x6ac9171);
                        ((jd5.c) c7()).n(c19767x257d7f2.f38864x6ac9171);
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        if (dVar != null) {
                            try {
                                dVar.release();
                            } catch (java.lang.Exception unused2) {
                            }
                        }
                        throw th;
                    }
                }
                cVar6.q(i17);
            }
        }
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f3 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f22 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.r0(((jd5.c) c7()).m140766x4eae2065(), c19767x257d7f3, c19767x257d7f22);
        ((jd5.c) c7()).p(c19767x257d7f3.f38864x6ac9171);
        ((jd5.c) c7()).n(c19767x257d7f22.f38864x6ac9171);
    }

    @Override // m50.x, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        super.mo451xac79a11b();
        com.p314xaae8f345.mm.vfs.w6.h(this.f385735s);
    }

    @Override // m50.x
    public java.lang.String p7() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 e76 = e7();
        if (e76 != null) {
            i95.m c17 = i95.n0.c(tg3.u0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            java.lang.String e86 = tg3.u0.e8((tg3.u0) c17, e76, bm5.f0.f104104s, e76.z0(), false, 8, null);
            if (!(e86 == null || r26.n0.N(e86)) && com.p314xaae8f345.mm.vfs.w6.j(e86)) {
                return e86;
            }
        }
        java.lang.String k17 = ((jd5.c) c7()).k();
        if ((k17 == null || r26.n0.N(k17)) || !com.p314xaae8f345.mm.vfs.w6.j(k17)) {
            return null;
        }
        return k17;
    }
}
