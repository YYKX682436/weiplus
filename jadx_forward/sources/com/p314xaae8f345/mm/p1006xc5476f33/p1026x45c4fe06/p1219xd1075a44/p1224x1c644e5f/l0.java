package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f;

/* loaded from: classes7.dex */
public final class l0 {

    /* renamed from: l, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.n f172727l = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.n(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f172728a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f172729b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f172730c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f172731d;

    /* renamed from: e, reason: collision with root package name */
    public hl1.h f172732e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.k f172733f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f172734g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f172735h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f172736i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f172737j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Set f172738k;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f172728a = runtime;
        this.f172732e = hl1.f.f363626a;
        this.f172736i = jz5.h.a(jz5.i.f384364f, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.u(this));
        runtime.F.f169270a.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.m(this));
        this.f172738k = new java.util.LinkedHashSet();
    }

    public final boolean A() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f172728a;
        if (o6Var.u0().C1 != null) {
            return false;
        }
        return o6Var.u0().L1.f158897n || e().f158890d != -1;
    }

    public final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        if (wdVar == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.SWITCH_TAB) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1 = o6Var.u0().L1;
        return c11816x5915d2c1.c() && c11816x5915d2c1.f158898o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        if ((r0 == null || r0.length() == 0) == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r5) {
        /*
            r4 = this;
            r4.l()
            com.tencent.mm.plugin.appbrand.o6 r0 = r4.f172728a
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L30
            boolean r5 = r0.P0()
            if (r5 == 0) goto L75
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r5 = r0.u0()
            java.lang.String r5 = r5.f158821q
            if (r5 == 0) goto L20
            int r5 = r5.length()
            if (r5 != 0) goto L1e
            goto L20
        L1e:
            r5 = r2
            goto L21
        L20:
            r5 = r1
        L21:
            if (r5 != 0) goto L75
            com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar r5 = r4.c()
            if (r5 == 0) goto L75
            r5.a(r1)
            r5.g(r2)
            goto L75
        L30:
            com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar r5 = r4.c()
            if (r5 == 0) goto L75
            boolean r3 = r4.r()
            if (r3 != 0) goto L52
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r3 = r0.u0()
            java.lang.String r3 = r3.f158821q
            if (r3 == 0) goto L4d
            int r3 = r3.length()
            if (r3 != 0) goto L4b
            goto L4d
        L4b:
            r3 = r2
            goto L4e
        L4d:
            r3 = r1
        L4e:
            if (r3 == 0) goto L52
            r3 = r1
            goto L53
        L52:
            r3 = r2
        L53:
            r5.a(r3)
            boolean r3 = r0.P0()
            if (r3 == 0) goto L71
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r0.u0()
            java.lang.String r0 = r0.f158821q
            if (r0 == 0) goto L6d
            int r0 = r0.length()
            if (r0 != 0) goto L6b
            goto L6d
        L6b:
            r0 = r2
            goto L6e
        L6d:
            r0 = r1
        L6e:
            if (r0 != 0) goto L71
            goto L72
        L71:
            r1 = r2
        L72:
            r5.g(r1)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0.b(boolean):void");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.AbstractC12505x244799f c() {
        android.view.View a17;
        mi1.v vVar = this.f172728a.f156354z;
        if (vVar == null || (a17 = vVar.a(com.p314xaae8f345.mm.R.id.gwu)) == null || !(a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.AbstractC12505x244799f)) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.AbstractC12505x244799f) a17;
    }

    public final java.lang.String d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x68027553;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11823xd380b08f c11823xd380b08f;
        if (z65.c.a()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        boolean z18 = z17 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("appbrand_half_screen_debug_force_firstPageNavigationStyleCustom", false) : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenDebugger", "isForceFirstPageNavigationStyleCustom[" + z18 + ']');
        if (z18) {
            return "custom";
        }
        java.lang.String str2 = (c11809xbc286be4 == null || (c11829x68027553 = c11809xbc286be4.N) == null || (c11823xd380b08f = c11829x68027553.A) == null) ? null : c11823xd380b08f.f158935d;
        return str2 == null ? "default" : str2;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 halfScreenConfig = this.f172728a.u0().L1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(halfScreenConfig, "halfScreenConfig");
        return halfScreenConfig;
    }

    public final boolean f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 x07 = this.f172728a.x0();
        int i18 = 0;
        while (true) {
            java.util.LinkedList linkedList = x07.f168243p;
            i17 = -1;
            if (i18 >= linkedList.size()) {
                break;
            }
            if (w2Var == linkedList.get(i18)) {
                i17 = (linkedList.size() - 1) - i18;
                break;
            }
            i18++;
        }
        boolean z17 = i17 == 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenManger", "wantAnimateHeader backToStackBottomPage[" + z17 + ']');
        return z17;
    }

    public final boolean g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f0Var = this.f172731d;
        return (f0Var != null ? f0Var.mo53377x430e7715() : null) == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.o0.f173308f;
    }

    public final boolean h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 x07 = this.f172728a.x0();
        int i18 = 0;
        while (true) {
            java.util.LinkedList linkedList = x07.f168243p;
            i17 = -1;
            if (i18 >= linkedList.size()) {
                break;
            }
            if (w2Var == linkedList.get(i18)) {
                i17 = (linkedList.size() - 1) - i18;
                break;
            }
            i18++;
        }
        boolean z17 = i17 == 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenManger", "wantAnimateHeader navigateToNewPageFromStackBottomPage[" + z17 + ']');
        return z17;
    }

    public final void i(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0 animType) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animType, "animType");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 e17 = e();
        boolean c17 = e17.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f172728a;
        if (!c17 || !e17.f158897n) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N22 = o6Var.N2();
            if (N22 != null) {
                N22.e4(false);
                return;
            }
            return;
        }
        if (animType == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0.f172599f && ((java.lang.Boolean) this.f172736i.mo141623x754a37bb()).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N23 = o6Var.N2();
            if (N23 != null) {
                N23.f4(true, qi1.a.f445013e);
                return;
            }
            return;
        }
        if (animType == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0.f172600g || (N2 = o6Var.N2()) == null) {
            return;
        }
        N2.f4(true, qi1.a.f445012d);
    }

    public final void j(android.graphics.Canvas canvas, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.o scene) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 e17 = e();
        if (e17.c()) {
            if (e17.f158904u || e17.f158897n) {
                if (e17.M && g()) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 embedWxa = this.f172728a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(embedWxa, "embedWxa");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 halfScreenConfig = embedWxa.u0().L1;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(halfScreenConfig, "halfScreenConfig");
                if (halfScreenConfig.c()) {
                    if (halfScreenConfig.D == k91.x2.f387350e) {
                        z17 = true;
                        if ((!z17 && embedWxa.u0().L1.T) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f172732e.g(), view)) {
                            this.f172732e.f(canvas, view);
                        }
                        return;
                    }
                }
                z17 = false;
                if (!z17 && embedWxa.u0().L1.T) {
                    return;
                }
                this.f172732e.f(canvas, view);
            }
        }
    }

    public final void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.AbstractC12505x244799f c17;
        boolean z17 = e().f158890d == -1 && !e().f158897n && e().f158898o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f172728a;
        if (o6Var.f156354z != null) {
            if (((this.f172737j && e().c()) || z17) && (c17 = c()) != null) {
                int color = c17.getContext().getResources().getColor(c17.h(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
                mi1.v vVar = o6Var.f156354z;
                if (vVar.f408236b != null) {
                    vVar.c().setBackgroundColor(color);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            r7 = this;
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r7.e()
            boolean r1 = r0.c()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            boolean r1 = r0.f158897n
            if (r1 == 0) goto L12
            r1 = r2
            goto L13
        L12:
            r1 = r3
        L13:
            r4 = 0
            if (r1 == 0) goto L17
            goto L18
        L17:
            r0 = r4
        L18:
            r1 = 2131100275(0x7f060273, float:1.7812927E38)
            if (r0 == 0) goto Laf
            com.tencent.mm.plugin.appbrand.widget.halfscreen.y r0 = new com.tencent.mm.plugin.appbrand.widget.halfscreen.y
            r0.<init>(r7)
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(r0)
            com.tencent.mm.plugin.appbrand.o6 r0 = r7.f172728a
            k91.r r5 = r0.m0()
            if (r5 == 0) goto L41
            com.tencent.mm.plugin.appbrand.page.n7 r6 = r0.N2()
            if (r6 == 0) goto L38
            java.lang.String r6 = r6.X1()
            goto L39
        L38:
            r6 = r4
        L39:
            k91.f r5 = r5.c(r6)
            if (r5 == 0) goto L41
            java.lang.String r4 = r5.f387248d
        L41:
            int r4 = ik1.w.l(r4)     // Catch: java.lang.Exception -> L46
            goto L47
        L46:
            r4 = -1
        L47:
            boolean r5 = r0.V
            if (r5 == 0) goto L6e
            boolean r5 = r7.g()
            com.tencent.mm.plugin.appbrand.widget.halfscreen.n r6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0.f172727l
            if (r5 == 0) goto L65
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r5 = r7.e()
            boolean r5 = r5.M
            if (r5 == 0) goto L65
            hk1.e r5 = r6.a(r0)
            if (r5 == 0) goto L6e
            r5.setBackgroundColor(r4)
            goto L6e
        L65:
            hk1.e r5 = r6.a(r0)
            if (r5 == 0) goto L6e
            r5.setBackgroundColor(r3)
        L6e:
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r5 = r0.u0()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r5 = r5.L1
            java.lang.String r6 = "halfScreenConfig"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r6)
            boolean r6 = r5.c()
            if (r6 == 0) goto L87
            k91.x2 r6 = k91.x2.f387350e
            k91.x2 r5 = r5.D
            if (r5 != r6) goto L87
            r5 = r2
            goto L88
        L87:
            r5 = r3
        L88:
            if (r5 == 0) goto L95
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r0.u0()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r0.L1
            boolean r0 = r0.P
            if (r0 == 0) goto L95
            goto L96
        L95:
            r2 = r3
        L96:
            if (r2 == 0) goto Lad
            boolean r0 = r7.g()
            if (r0 == 0) goto La4
            hl1.h r0 = r7.f172732e
            r0.b(r4)
            goto Lad
        La4:
            hl1.h r0 = r7.f172732e
            int r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(r1)
            r0.b(r2)
        Lad:
            jz5.f0 r4 = jz5.f0.f384359a
        Laf:
            if (r4 != 0) goto Lba
            hl1.h r0 = r7.f172732e
            int r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(r1)
            r0.b(r1)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0.l():void");
    }

    public final void m() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f172728a;
        mi1.v vVar = o6Var.f156354z;
        if (vVar != null) {
            vVar.h(com.p314xaae8f345.mm.R.id.gwu);
            vVar.h(com.p314xaae8f345.mm.R.id.f564640wr);
        }
        hk1.e a17 = f172727l.a(o6Var);
        if (a17 != null) {
            android.view.ViewGroup viewGroup = a17.f363409f;
            if (viewGroup != null) {
                a17.removeView(viewGroup);
            }
            a17.f363410g = null;
        }
    }

    public final void n() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 e17 = e();
        boolean c17 = e17.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f172728a;
        if (c17 && e17.f158897n) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N2 = o6Var.N2();
            if (N2 != null) {
                N2.f4(true, qi1.a.f445012d);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N22 = o6Var.N2();
        if (N22 != null) {
            N22.e4(false);
        }
    }

    public final void o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.i iVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12751x125fa002 c12751x125fa002;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc hcVar;
        try {
            o6Var = this.f172728a;
            hcVar = o6Var.f156329e;
        } catch (java.lang.Throwable unused) {
        }
        if (hcVar != null) {
            c11510xdd90c2f2 = hcVar.i(o6Var);
            if ((c11510xdd90c2f2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) || (c12751x125fa002 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) c11510xdd90c2f2).C1) == null) {
            }
            c12751x125fa002.m53309xbffdbad9(iVar);
            return;
        }
        c11510xdd90c2f2 = null;
        if (c11510xdd90c2f2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) {
        }
    }

    public final void p() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.f.f35315x233c02ec;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f172728a;
        android.app.Activity r07 = o6Var.r0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 halfScreenConfig = o6Var.u0().L1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(halfScreenConfig, "halfScreenConfig");
        boolean a17 = aVar.a(r07, halfScreenConfig);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 halfScreenConfig2 = o6Var.u0().L1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(halfScreenConfig2, "halfScreenConfig");
        o6Var.f156343s.m53607x7b4800d2(a17 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.z(halfScreenConfig2) : (!halfScreenConfig2.c() || o6Var.H2.r()) ? null : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.a0(halfScreenConfig2));
    }

    public final boolean q() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368 c11820x84c5f368;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 halfScreenConfig = this.f172728a.u0().L1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(halfScreenConfig, "halfScreenConfig");
        return halfScreenConfig.c() && (c11820x84c5f368 = halfScreenConfig.f158899p) != null && c11820x84c5f368.f158929d;
    }

    public final boolean r() {
        return e().d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        if ((r0.c() == 0.0f) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0.mo52143xb5886c64(), "status not change, return");
        r3.a(r0.c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
    
        if ((r0.c() == 1.0f) != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0.s(boolean, boolean):void");
    }

    public final android.animation.ValueAnimator t(long j17) {
        hl1.h hVar = this.f172732e;
        return hVar.d(hVar.h(), this.f172732e.e(), j17);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            r2 = this;
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r2.e()
            boolean r1 = r0.c()
            if (r1 == 0) goto L12
            k91.x2 r1 = k91.x2.f387350e
            k91.x2 r0 = r0.D
            if (r0 != r1) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L1e
            com.tencent.mm.plugin.appbrand.widget.halfscreen.d0 r0 = new com.tencent.mm.plugin.appbrand.widget.halfscreen.d0
            r0.<init>(r2)
            r2.o(r0)
            goto L22
        L1e:
            r0 = 0
            r2.o(r0)
        L22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0.u():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01d3, code lost:
    
        if (r3.x0().m52166xdf2f9ab6() == 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01df, code lost:
    
        if (r3.x0().m52173x328fb10a() == 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c7, code lost:
    
        if (r3.x0().m52173x328fb10a() == 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e3, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 r24, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd r25) {
        /*
            Method dump skipped, instructions count: 1132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0.v(com.tencent.mm.plugin.appbrand.page.n7, com.tencent.mm.plugin.appbrand.page.wd):void");
    }

    public final void w() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.AbstractC12505x244799f c17 = c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = this.f172728a.u0();
        if (c17 != null) {
            if (((u07 == null || (c11816x5915d2c1 = u07.L1) == null || !c11816x5915d2c1.f158901r) ? false : true) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d(u07), "custom")) {
                s(false, true);
            }
        }
    }

    public final void x() {
        java.lang.String username = this.f172728a.u0().f128811x;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "username");
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.C12773xed7e2ec8(username, this.f172728a.f156338p.f158814g, false, 0, 5, null, false), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.r.class, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1.f172717a, r0) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(float r9, int r10) {
        /*
            r8 = this;
            com.tencent.mm.plugin.appbrand.o6 r0 = r8.f172728a
            com.tencent.mm.plugin.appbrand.widget.q r0 = r0.f156343s
            android.view.View r0 = r0.getRootView()
            r1 = 2131309836(0x7f09350c, float:1.8237967E38)
            android.view.View r0 = r0.findViewById(r1)
            if (r0 == 0) goto L27
            com.tencent.mm.plugin.appbrand.widget.halfscreen.k r1 = r8.f172733f
            if (r1 == 0) goto L20
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            android.view.View r1 = r1.f172717a
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r0)
            if (r1 != 0) goto L27
        L20:
            com.tencent.mm.plugin.appbrand.widget.halfscreen.k r1 = new com.tencent.mm.plugin.appbrand.widget.halfscreen.k
            r1.<init>(r0)
            r8.f172733f = r1
        L27:
            com.tencent.mm.plugin.appbrand.widget.halfscreen.k r0 = r8.f172733f
            if (r0 == 0) goto L44
            android.view.View r3 = r0.f172718b     // Catch: java.lang.Exception -> L44
            android.view.View r4 = r0.f172719c     // Catch: java.lang.Exception -> L44
            if (r3 == 0) goto L44
            if (r4 == 0) goto L44
            r4.getAlpha()     // Catch: java.lang.Exception -> L44
            r3.getLayoutParams()     // Catch: java.lang.Exception -> L44
            com.tencent.mm.plugin.appbrand.widget.halfscreen.j r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.k.f172713e
            android.view.View r2 = r0.f172717a     // Catch: java.lang.Exception -> L44
            int r7 = r0.f172720d     // Catch: java.lang.Exception -> L44
            r5 = r9
            r6 = r10
            r1.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L44
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0.y(float, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.l z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 r3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 r4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 r5) {
        /*
            r2 = this;
            boolean r3 = r2.h(r3)
            boolean r4 = r2.f(r4)
            if (r4 != 0) goto L14
            if (r3 != 0) goto L14
            jz5.l r3 = new jz5.l
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.<init>(r4, r4)
            return r3
        L14:
            java.lang.String r3 = r2.d(r5)
            java.lang.String r0 = "custom"
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r0)
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L38
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r3 = r5.L1
            boolean r3 = r3.f158901r
            if (r3 == 0) goto L38
            com.tencent.mm.plugin.appbrand.widget.f0 r3 = r2.f172731d
            if (r3 == 0) goto L31
            com.tencent.mm.plugin.appbrand.widget.o0 r3 = r3.mo53377x430e7715()
            goto L32
        L31:
            r3 = 0
        L32:
            com.tencent.mm.plugin.appbrand.widget.o0 r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.o0.f173308f
            if (r3 != r5) goto L38
            r3 = r0
            goto L39
        L38:
            r3 = r1
        L39:
            if (r4 == 0) goto L45
            if (r3 == 0) goto L45
            jz5.l r3 = new jz5.l
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.<init>(r4, r4)
            return r3
        L45:
            if (r4 != 0) goto L61
            if (r3 == 0) goto L61
            com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar r3 = r2.c()
            if (r3 == 0) goto L56
            boolean r3 = r3.b()
            if (r3 != r0) goto L56
            goto L57
        L56:
            r0 = r1
        L57:
            if (r0 == 0) goto L61
            jz5.l r3 = new jz5.l
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.<init>(r4, r4)
            return r3
        L61:
            jz5.l r3 = new jz5.l
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.<init>(r5, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0.z(com.tencent.mm.plugin.appbrand.page.w2, com.tencent.mm.plugin.appbrand.page.w2, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC):jz5.l");
    }
}
