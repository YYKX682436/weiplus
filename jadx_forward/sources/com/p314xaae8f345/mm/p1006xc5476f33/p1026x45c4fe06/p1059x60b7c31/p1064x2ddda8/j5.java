package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class j5 implements rt1.b1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.xc {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f161133a;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w4 f161135c;

    /* renamed from: d, reason: collision with root package name */
    public rt1.z0 f161136d;

    /* renamed from: e, reason: collision with root package name */
    public ui1.z f161137e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.DialogInterface f161138f;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.i5 f161141i;

    /* renamed from: b, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f161134b = p3325xe03a0797.p3326xc267989b.z0.b();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f161139g = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7029xb9e95492 f161140h = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7029xb9e95492();

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.x4 f161142j = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.x4(this);

    public j5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v4 v4Var) {
        this.f161133a = yVar;
        this.f161141i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.i5(v4Var, this);
    }

    @Override // rt1.b1
    public p3325xe03a0797.p3326xc267989b.y0 a() {
        return this.f161134b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [ui1.z] */
    @Override // rt1.b1
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.api.p1308xb29de3e3.C13026x8642c3d7 c13026x8642c3d7) {
        ?? r152;
        r45.pw6 pw6Var;
        java.util.ArrayList arrayList;
        if (this.f161139g.get()) {
            return;
        }
        android.content.DialogInterface dialogInterface = this.f161138f;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        this.f161138f = null;
        int i17 = 0;
        boolean z17 = (c13026x8642c3d7 == null || (arrayList = c13026x8642c3d7.f176137d) == null || !(arrayList.isEmpty() ^ true)) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w4 w4Var = this.f161135c;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7029xb9e95492 c7029xb9e95492 = this.f161140h;
        if (w4Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w4 w4Var2 = z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w4.f161304d : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w4.f161305e;
            this.f161135c = w4Var2;
            int ordinal = w4Var2.ordinal();
            if (ordinal == 0) {
                c7029xb9e95492.f143453h = 1L;
                c7029xb9e95492.f143455j = 1L;
            } else if (ordinal == 1) {
                c7029xb9e95492.f143453h = 2L;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRenderData, isNotEmpty:");
        sb6.append(z17);
        sb6.append(", settled displayMode:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w4 w4Var3 = this.f161135c;
        if (w4Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("displayMode");
            throw null;
        }
        sb6.append(w4Var3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCarLicensePlateChooserViewController", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w4 w4Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w4.f161304d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w4 w4Var5 = this.f161135c;
        if (w4Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("displayMode");
            throw null;
        }
        if (w4Var4 != w4Var5) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w4 w4Var6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w4.f161305e;
            if (w4Var5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("displayMode");
                throw null;
            }
            if (w4Var6 != w4Var5 || !z17) {
                if (w4Var5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("displayMode");
                    throw null;
                }
                if (w4Var6 != w4Var5 || z17) {
                    return;
                }
                h().f176157e = true;
                i(h(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.c5(this));
                return;
            }
        }
        h().f176157e = false;
        if (2 == c7029xb9e95492.f143455j) {
            c7029xb9e95492.f143455j = 3L;
        }
        if (!z17) {
            this.f161141i.a();
            return;
        }
        if (this.f161137e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f161133a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar);
            ui1.z a17 = ui1.w.a(yVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.z4(this, yVar), null);
            this.f161137e = a17;
            a17.mo2026xce3d2713(yVar.t3().E0().f387374d);
            a17.mo2033x12ec1b74(yVar.t3().E0().f387376f);
            a17.mo2027xea2586cc(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.aqu));
            a17.mo2039xb4c13ffe(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.aqv));
            pt1.b bVar = pt1.b.f439762a;
            bVar.getClass();
            f06.v[] vVarArr = pt1.b.f439763b;
            a17.mo2042x364e0e56((java.lang.String) pt1.b.f439764c.b(bVar, vVarArr[0]));
            r45.i7 i7Var = (r45.i7) pt1.b.f439765d.b(bVar, vVarArr[1]);
            if (i7Var.f458306d) {
                java.lang.String str = i7Var.f458307e;
                if (!(str == null || str.length() == 0)) {
                    a17.o(true);
                    a17.mo2028x78fb63c8(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.a5(a17, yVar, i7Var));
                    a17.mo2030x8f8b3d79(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572311ar0));
                    a17.mo2031x5951856a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
                    a17.mo2029x3aaeeaf1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.b5(this));
                    a17.mo2038xd611ee5a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f573933gh3));
                    a17.mo2036xc499c596(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.gii));
                    pw6Var = pt1.b.f439767f;
                    if (pw6Var != null && pw6Var.f464973d && !android.text.TextUtils.isEmpty(pw6Var.f464974e)) {
                        java.lang.String wording = pw6Var.f464974e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wording, "wording");
                        a17.mo2015xf085c78(wording);
                        a17.mo2005x1f85dcf7((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1) yVar.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1.class));
                    }
                    a17.r(yVar);
                }
            }
            a17.o(false);
            a17.mo2030x8f8b3d79(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572311ar0));
            a17.mo2031x5951856a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
            a17.mo2029x3aaeeaf1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.b5(this));
            a17.mo2038xd611ee5a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f573933gh3));
            a17.mo2036xc499c596(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.gii));
            pw6Var = pt1.b.f439767f;
            if (pw6Var != null) {
                java.lang.String wording2 = pw6Var.f464974e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wording2, "wording");
                a17.mo2015xf085c78(wording2);
                a17.mo2005x1f85dcf7((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1) yVar.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1.class));
            }
            a17.r(yVar);
        }
        ?? r47 = this.f161137e;
        if (r47 == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listHalfScreenDialog");
            throw null;
        }
        if (z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c13026x8642c3d7);
            r152 = new java.util.ArrayList();
            int i18 = 0;
            for (java.lang.Object obj : c13026x8642c3d7.f176137d) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.String str2 = (java.lang.String) obj;
                r152.add(new fl1.h1(1, u46.l.t(str2, i17, 2) + (char) 183 + u46.l.t(str2, 2, str2.length()), "", "webapi_userplateinfo", null, p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c13026x8642c3d7.f176138e, str2), "", i18));
                i18 = i19;
                i17 = 0;
            }
        } else {
            r152 = kz5.p0.f395529d;
        }
        r47.mo2041x3f8132ef(r152);
    }

    @Override // rt1.b1
    public void c(qt1.f exception) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exception, "exception");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaCarLicensePlateChooserViewController", "onRenderError(" + exception + ')');
        st1.g.b(exception);
        if ((exception.f448056g instanceof qt1.i) && this.f161135c == null) {
            this.f161141i.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    @Override // rt1.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.app.Activity d() {
        /*
            r3 = this;
            com.tencent.mm.plugin.appbrand.y r0 = r3.f161133a
            r1 = 0
            if (r0 == 0) goto La
            xi1.g r0 = r0.mo50261xee5260a9()
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 != 0) goto Lf
        Ld:
            r0 = r1
            goto L24
        Lf:
            boolean r2 = r0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0
            if (r2 == 0) goto L16
            com.tencent.mm.plugin.appbrand.platform.window.activity.r0 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0) r0
            goto L24
        L16:
            boolean r2 = r0 instanceof xi1.q
            if (r2 == 0) goto Ld
            xi1.q r0 = (xi1.q) r0
            xi1.g r0 = r0.f536246d
            boolean r2 = r0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0
            if (r2 == 0) goto Ld
            com.tencent.mm.plugin.appbrand.platform.window.activity.r0 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0) r0
        L24:
            if (r0 == 0) goto L2c
            android.app.Activity r0 = r0.w()
            if (r0 != 0) goto L38
        L2c:
            com.tencent.mm.plugin.appbrand.y r0 = r3.f161133a
            if (r0 == 0) goto L34
            android.content.Context r1 = r0.mo50352x76847179()
        L34:
            android.app.Activity r0 = q75.a.a(r1)
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j5.d():android.app.Activity");
    }

    @Override // rt1.b1
    public void e(rt1.a1 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        if (rt1.a1.f480917d == request) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f161133a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = yVar != null ? yVar.t3() : null;
            if (t37 == null) {
                return;
            }
            ph1.l lVar = new ph1.l();
            lVar.f435870d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.d5(t37);
            lVar.b(t37, false);
            this.f161138f = lVar;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.xc
    public void f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 c11808xe47dc718) {
        if (c11510xdd90c2f2 != null) {
            c11510xdd90c2f2.I.remove(this);
        }
        g(false);
    }

    public final void g(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37;
        u81.h hVar;
        if (this.f161139g.getAndSet(true)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCarLicensePlateChooserViewController", "dismiss stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f161133a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) yVar : null;
        if (v5Var != null) {
            v5Var.K(this.f161142j);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar2 = this.f161133a;
        if (yVar2 != null && (t37 = yVar2.t3()) != null && (hVar = t37.N) != null) {
            hVar.c(this.f161142j);
        }
        this.f161139g.set(true);
        p3325xe03a0797.p3326xc267989b.z0.e(this.f161134b, null, 1, null);
        ui1.z zVar = this.f161137e;
        if (zVar != null) {
            if (zVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listHalfScreenDialog");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar3 = this.f161133a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar3);
            zVar.p(yVar3);
        }
        android.content.DialogInterface dialogInterface = this.f161138f;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        this.f161138f = null;
        this.f161133a = null;
        if (z17) {
            this.f161140h.k();
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.C13032x6313e41e h() {
        rt1.z0 z0Var = this.f161136d;
        if (z0Var != null) {
            return ((rt1.p1) z0Var).b();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPresenter");
        throw null;
    }

    public final void i(com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.C13032x6313e41e c13032x6313e41e, yz5.l lVar) {
        android.app.Activity d17 = d();
        if (d17 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(this.f161134b, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f5(d17, c13032x6313e41e, lVar, null), 3, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaCarLicensePlateChooserViewController", "startListUI get NULL activity");
        if (lVar != null) {
            lVar.mo146xb9724478(new android.app.Instrumentation.ActivityResult(0, null));
        }
    }
}
