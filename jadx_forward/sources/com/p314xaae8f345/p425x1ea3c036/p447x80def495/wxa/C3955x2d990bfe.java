package com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/luggage/skyline/wxa/AppServiceSkylineExtensionImpl;", "Lcom/tencent/luggage/sdk/jsapi/component/service/z;", "Lcom/tencent/mm/plugin/appbrand/page/jb;", "luggage-skyline-ext_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl */
/* loaded from: classes7.dex */
public final class C3955x2d990bfe implements com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.z, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.jb {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y f129238a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f129239b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f129240c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p2936x80def495.C25587x226dda3 f129241d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f129242e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f129243f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f129244g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f129245h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f129246i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f129247j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f129248k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f129249l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f129250m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f129251n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Object f129252o;

    public C3955x2d990bfe(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y appService) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appService, "appService");
        this.f129238a = appService;
        this.f129239b = new java.util.LinkedList();
        this.f129242e = new android.util.SparseArray();
        this.f129246i = new java.util.LinkedList();
        this.f129251n = new java.util.ArrayList();
        this.f129252o = new java.lang.Object();
    }

    public final synchronized void a(java.lang.Runnable runnable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runnable, "runnable");
        com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = this.f129241d;
        if (c25587x226dda3 == null) {
            this.f129239b.add(runnable);
        } else {
            c25587x226dda3.m95869x115111ba(new gf.a(runnable));
        }
    }

    public final com.p314xaae8f345.p2936x80def495.C25587x226dda3 b() {
        com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3;
        df.c1 c1Var = df.c1.f310968a;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y appService = this.f129238a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appService, "appService");
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylinePreloader", "useForAppService appService:" + appService + " useForAppService:" + df.c1.f310971d + " appService.componentId:" + appService.mo50260x9f1221c2());
        if (df.c1.f310971d) {
            c25587x226dda3 = null;
        } else {
            df.c1.f310971d = true;
            df.c1.f310972e = appService.mo50260x9f1221c2();
            if (df.c1.f310970c == null) {
                com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i("SkylinePreloader", "preloadSkylineRuntime");
                df.c1.f310970c = c1Var.a();
            }
            c25587x226dda3 = df.c1.f310970c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c25587x226dda3);
        }
        return c25587x226dda3 == null ? c1Var.a() : c25587x226dda3;
    }

    public final android.util.Pair c() {
        ze.n t37 = this.f129238a.t3();
        if (t37 == null) {
            return new android.util.Pair(java.lang.Boolean.FALSE, com.p314xaae8f345.p2936x80def495.EnumC25558x9d00a2c8.None);
        }
        return new android.util.Pair(java.lang.Boolean.valueOf(t37.m0().f()), (t37.f156328d.getResources().getConfiguration().uiMode & 48) == 32 ? com.p314xaae8f345.p2936x80def495.EnumC25558x9d00a2c8.Dark : com.p314xaae8f345.p2936x80def495.EnumC25558x9d00a2c8.Light);
    }

    public final void d(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar, boolean z17) {
        if (z17 && !this.f129248k) {
            synchronized (this) {
                if (!this.f129248k) {
                    int hashCode = hashCode();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppServiceSkylineExtensionImpl", "injectSkylineBindings " + hashCode + " stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
                    if (yVar.x() != null && gf.l0.f352648a.a(yVar.x())) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t mo50357xcd94f799 = yVar.mo50357xcd94f799();
                        if (mo50357xcd94f799 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0) mo50357xcd94f799.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) mo50357xcd94f799.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class);
                            if (l0Var != null && f0Var != null) {
                                this.f129247j = true;
                                com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = this.f129241d;
                                if (c25587x226dda3 == null) {
                                    c25587x226dda3 = b();
                                    this.f129241d = c25587x226dda3;
                                }
                                df.a1.f310954a.a(c25587x226dda3.m95854xceabf3ec());
                                c25587x226dda3.m95858x3ab432f1(new gf.x0(yVar));
                                c25587x226dda3.m95855xa23e73fb(new gf.o0(yVar));
                                c25587x226dda3.m95857x55b92c03(new gf.b(f0Var));
                                c25587x226dda3.m95856x66cef77e(new gf.c(yVar));
                                c25587x226dda3.m95872x9bcaa3df(new gf.d(hashCode, this, yVar));
                                c25587x226dda3.m95870xf01ecb36(new gf.f(hashCode, this, c25587x226dda3));
                                c25587x226dda3.m95869x115111ba(new gf.h(this, yVar, hashCode, f0Var));
                                c25587x226dda3.m95869x115111ba(new gf.i(this));
                                c25587x226dda3.mo95664xe300e21b(new gf.k(this));
                                f0Var.mo51545x3498a0(new gf.l(hashCode, mo50357xcd94f799, c25587x226dda3, l0Var));
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u h07 = mo50357xcd94f799.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y.class);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h07, "getAddon(...)");
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y) h07).r(new gf.n(hashCode, this, c25587x226dda3));
                                this.f129248k = true;
                            }
                        }
                    }
                }
            }
        }
        if (this.f129249l) {
            return;
        }
        e(new gf.s(yVar));
        this.f129249l = true;
    }

    public final void e(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (this.f129243f) {
            runnable.run();
            return;
        }
        synchronized (this.f129246i) {
            this.f129246i.addLast(runnable);
        }
    }

    public void f(long j17, java.lang.String url, boolean z17, int i17, int i18, boolean z18, int i19, int i27, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd type, org.json.JSONObject jSONObject, java.lang.Runnable runnable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("AppServiceSkylineExtensionImpl", "skylineRoute " + type + ' ' + url + " ,isFromSkyline:[" + z17 + "] [" + i17 + "]-[" + i18 + "] to isToSkyline:[" + z18 + "] [" + i19 + "]-[" + i27 + ']', new java.lang.Object[0]);
        ze.n t37 = this.f129238a.t3();
        if (t37 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.a("AppServiceSkylineExtensionImpl", "skylineRoute error because of runtime ", new java.lang.Object[0]);
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        android.util.SparseArray sparseArray = this.f129242e;
        if (!z18) {
            if (type == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.REDIRECT_TO) {
                java.util.LinkedList linkedList = (java.util.LinkedList) sparseArray.get(i17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("AppServiceSkylineExtensionImpl", "RedirectTo form skyline to webview ,cur window page is " + linkedList, new java.lang.Object[0]);
                if (linkedList != null && linkedList.size() > 1) {
                    g(j17, i19, i27, false, false, null);
                }
            }
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        java.lang.String a17 = nf.z.a(url);
        k91.f c17 = t37.m0().c(a17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getPageConfig(...)");
        boolean g17 = t37.m0().g();
        k91.z3 r17 = t37.u0().r();
        we.a x07 = t37.x0();
        int K = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a.K(c17, g17, r17, (x07 != null && !x07.f0(url, type)) && i19 != i27);
        k91.l d17 = t37.m0().d(a17);
        com.p314xaae8f345.p2936x80def495.C25573xa7f446d1 c25573xa7f446d1 = new com.p314xaae8f345.p2936x80def495.C25573xa7f446d1(K, url, d17 != null, d17 != null ? d17.f387200a : 0, d17 != null ? d17.f387201b : -1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("AppServiceSkylineExtensionImpl", "before route ," + i19 + " pageData " + sparseArray.get(i19), new java.lang.Object[0]);
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = this.f129241d;
            if (c25587x226dda3 != null) {
                c25587x226dda3.mo95665x4c69ad34(i19, i27, c25573xa7f446d1);
            }
            if (runnable != null) {
                runnable.run();
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.addLast(java.lang.Integer.valueOf(i27));
            sparseArray.put(i19, linkedList2);
        } else if (ordinal == 1) {
            com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda32 = this.f129241d;
            if (c25587x226dda32 != null) {
                c25587x226dda32.mo95674x6f05f7cc(i19, i27, c25573xa7f446d1, new gf.t(runnable));
            }
            java.util.LinkedList linkedList3 = (java.util.LinkedList) sparseArray.get(i19);
            if (linkedList3 == null) {
                linkedList3 = new java.util.LinkedList();
                sparseArray.put(i19, linkedList3);
            }
            linkedList3.addLast(java.lang.Integer.valueOf(i27));
        } else if (ordinal == 3) {
            boolean z19 = i19 == i27;
            gf.u uVar = new gf.u(runnable);
            if (z19) {
                com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda33 = this.f129241d;
                if (c25587x226dda33 != null) {
                    c25587x226dda33.mo95674x6f05f7cc(i19, i27, c25573xa7f446d1, uVar);
                }
            } else {
                com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda34 = this.f129241d;
                if (c25587x226dda34 != null) {
                    c25587x226dda34.mo95676x565e7b77(i19, i27, c25573xa7f446d1, uVar);
                }
            }
            java.util.LinkedList linkedList4 = (java.util.LinkedList) sparseArray.get(i19);
            if (linkedList4 == null) {
                linkedList4 = new java.util.LinkedList();
                sparseArray.put(i19, linkedList4);
            }
            if (linkedList4.size() > 0) {
                linkedList4.removeLast();
            }
            linkedList4.addLast(java.lang.Integer.valueOf(i27));
        } else if (ordinal == 5) {
            com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda35 = this.f129241d;
            if (c25587x226dda35 != null) {
                c25587x226dda35.mo95675xa8596bc6(i19, i27, c25573xa7f446d1);
            }
            java.util.LinkedList linkedList5 = new java.util.LinkedList();
            linkedList5.addLast(java.lang.Integer.valueOf(i27));
            sparseArray.put(i19, linkedList5);
            if (runnable != null) {
                runnable.run();
            }
        } else if (ordinal == 6) {
            com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda36 = this.f129241d;
            if (c25587x226dda36 != null) {
                c25587x226dda36.mo95666x9dfc8e95(i19, i27, c25573xa7f446d1);
            }
            java.util.LinkedList linkedList6 = new java.util.LinkedList();
            linkedList6.addLast(java.lang.Integer.valueOf(i27));
            sparseArray.put(i19, linkedList6);
            if (runnable != null) {
                runnable.run();
            }
        } else {
            if (ordinal != 7) {
                throw new java.lang.UnsupportedOperationException();
            }
            com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda37 = this.f129241d;
            if (c25587x226dda37 != null) {
                c25587x226dda37.mo95678x626dd3c1(i19, i27, c25573xa7f446d1);
            }
            if (runnable != null) {
                runnable.run();
            }
            java.util.LinkedList linkedList7 = new java.util.LinkedList();
            linkedList7.addLast(java.lang.Integer.valueOf(i27));
            sparseArray.put(i19, linkedList7);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("AppServiceSkylineExtensionImpl", "after route ," + i19 + " pageData " + sparseArray.get(i19), new java.lang.Object[0]);
    }

    public void g(long j17, int i17, int i18, boolean z17, boolean z18, java.lang.Runnable runnable) {
        java.util.LinkedList linkedList = (java.util.LinkedList) this.f129242e.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("AppServiceSkylineExtensionImpl", "routeBack to [" + i17 + "]-[" + i18 + "]; pages: " + linkedList, new java.lang.Object[0]);
        if (linkedList == null || linkedList.size() <= 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("AppServiceSkylineExtensionImpl", "routeBack stop ,because of pages.size ", new java.lang.Object[0]);
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (!linkedList.contains(java.lang.Integer.valueOf(i18))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.a("AppServiceSkylineExtensionImpl", "routeBack stop ,because of pages don't contains ", new java.lang.Object[0]);
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        java.lang.Integer num = (java.lang.Integer) linkedList.peekLast();
        if (num != null && num.intValue() == i18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("AppServiceSkylineExtensionImpl", "routeBack stop ,because of isTopPage ", new java.lang.Object[0]);
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        java.lang.Object peekLast = linkedList.peekLast();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(peekLast);
        int intValue = ((java.lang.Number) peekLast).intValue();
        int i19 = 0;
        while (true) {
            java.lang.Integer num2 = (java.lang.Integer) linkedList.peekLast();
            if (num2 != null && num2.intValue() == i18) {
                break;
            }
            linkedList.pollLast();
            i19++;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("AppServiceSkylineExtensionImpl", "routeBack stop ,because of navigateBackFromSkyline ", new java.lang.Object[0]);
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = this.f129241d;
        if (c25587x226dda3 != null) {
            c25587x226dda3.mo95673xc55eddf8(i17, intValue, i19, z18, new gf.v(runnable));
        }
    }
}
