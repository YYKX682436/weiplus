package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

@gm0.a2
/* renamed from: com.tencent.mm.plugin.profile.ui.ContactInfoUI */
/* loaded from: classes11.dex */
public class ActivityC16840x4302a3e2 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements l75.q0, xg3.u0, com.p314xaae8f345.mm.p944x882e457a.u0, ze4.h, bi4.l0, xg3.a0, l75.z0, lk5.a, com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 {
    public static final java.util.Map U = new java.util.concurrent.ConcurrentHashMap();
    public android.view.View K;
    public android.view.View L;
    public android.view.View R;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f235187d;

    /* renamed from: e, reason: collision with root package name */
    public t25.a f235188e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a f235189f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235190g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235191h;

    /* renamed from: i, reason: collision with root package name */
    public int f235192i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f235193m;

    /* renamed from: mStatusBarHeightCallback */
    private vj5.k f37748xb52fe880;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f235194n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f235195o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f235196p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f235197q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f235198r = "";

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a f235199s = null;

    /* renamed from: t, reason: collision with root package name */
    public boolean f235200t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f235201u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f235202v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f235203w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f235204x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f235205y = false;

    /* renamed from: z, reason: collision with root package name */
    public long f235206z = 0;
    public int A = 0;
    public boolean B = false;
    public final int C = 3;
    public int D = 0;
    public int E = 0;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 F = null;
    public boolean G = false;
    public int H = 0;
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback I = new hr3.g1(this);

    /* renamed from: J, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z f235186J = new hr3.h1(this);
    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 M = null;
    public int N = 1;
    public java.lang.String P = "";
    public long Q = 0;
    public final android.view.View.OnLayoutChangeListener S = new hr3.c1(this);
    public java.lang.Runnable T = null;

    @Override // ze4.h
    public void H2() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "story_cat storyUIHasStory");
        this.f235201u = true;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a = this.f235199s;
        if (c22702xa9a9ae2a == null || !c22702xa9a9ae2a.f293680J) {
            return;
        }
        h7();
    }

    @Override // bi4.l0
    public void K5(boolean z17) {
        android.view.View view = this.R;
        if (view == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "changeStatusBgVisibility: ");
            return;
        }
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactInfoUI", "changeStatusBgVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/ContactInfoUI", "changeStatusBgVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/ContactInfoUI", "changeStatusBgVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/ContactInfoUI", "changeStatusBgVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // bi4.l0
    public void M2() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "statusUIHasStatus");
        this.f235202v = true;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a = this.f235199s;
        if (c22702xa9a9ae2a == null || !c22702xa9a9ae2a.f293680J) {
            return;
        }
        h7();
    }

    public final void V6(int i17) {
        try {
            android.view.View view = this.R;
            if (view == null) {
                return;
            }
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams.topMargin != i17) {
                layoutParams.topMargin = i17;
                this.R.setLayoutParams(layoutParams);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ContactInfoUI", th6, "adjustStatusBgPosition", new java.lang.Object[0]);
        }
    }

    public final void W6() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f235194n;
        if (z3Var == null || !z3Var.l2()) {
            mo54450xbf7c1df6("");
        }
    }

    public final android.view.View X6(android.view.View view, hr3.o1 o1Var) {
        if (o1Var.mo133971x58b836e(view).booleanValue()) {
            return view;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View X6 = X6(viewGroup.getChildAt(i17), o1Var);
            if (X6 != null) {
                return X6;
            }
        }
        return null;
    }

    @Override // ze4.h
    public void Y0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "story_cat storyUIBackPressed");
        this.f235199s.n();
    }

    public final void Y6() {
        if (this.K == null || !vj5.n.f519251k) {
            return;
        }
        vj5.n b17 = vj5.n.b(this);
        b17.f(this.f37748xb52fe880);
        hr3.j1 j1Var = new hr3.j1(this);
        this.f37748xb52fe880 = j1Var;
        b17.d(j1Var);
        getWindow().getDecorView().requestApplyInsets();
        vj5.o.e(getWindow());
    }

    public final bi4.i0 Z6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = this.f235187d;
        if (rVar == null || (viewOnClickListenerC16860xc669c20a = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("contact_profile_header_normal")) == null) {
            return null;
        }
        return viewOnClickListenerC16860xc669c20a.R();
    }

    @Override // bi4.l0
    public void a6() {
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.jlw);
        if (relativeLayout == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "addStatusBackPreview: ");
        ((uj4.e) pf5.z.f435481a.a(this).a(uj4.e.class)).Z6();
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_User");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((uj4.e) pf5.z.f435481a.a(activity).a(uj4.e.class)).O6(mo7595x9cdc264(), relativeLayout, stringExtra, "SCENE_CONTACT_PROFILE", true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        if (r3.Q0() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        if (r12.f235194n.l2() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0112, code lost:
    
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.F3(r5) != false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2.a7(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x02f3, code lost:
    
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.F3(r7) != false) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b7(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 1373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2.b7(java.lang.String):void");
    }

    @Override // ze4.h
    public void c2() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "story_cat storyUINoStory");
        this.f235201u = false;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a = this.f235199s;
        if (c22702xa9a9ae2a != null && !c22702xa9a9ae2a.f293680J) {
            m78602x5a7a36a0();
            f7();
            this.f235199s.n();
        }
        h7();
    }

    public final void c7() {
        boolean z17;
        if (this.f235203w) {
            if (((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).aj(getIntent().getStringExtra("Contact_User"))) {
                z17 = true;
                this.f235202v = z17;
            }
        }
        z17 = false;
        this.f235202v = z17;
    }

    public final void d7() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a;
        if (this.f235204x) {
            db5.t7.m123883x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574828jn0), 0).show();
        } else {
            if (!this.f235201u || (c22702xa9a9ae2a = this.f235199s) == null) {
                return;
            }
            c22702xa9a9ae2a.o();
        }
    }

    public final void e7() {
        android.widget.RelativeLayout relativeLayout;
        if (this.f235200t || !this.f235203w || (this.f235188e instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90)) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f235194n;
        if (z3Var == null || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(z3Var.d1())) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = this.f235194n;
            if ((z3Var2 == null || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var2.d1())) && (relativeLayout = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.jlw)) != null) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "setupStory %s stack %s", this, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
                this.f235200t = true;
                this.f235199s = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a) m79335xcc101dd9();
                ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).cj(mo55332x76847179(), this.f235199s);
                this.f235199s.setBackground(com.p314xaae8f345.mm.ui.zk.d(mo55332x76847179(), com.p314xaae8f345.mm.R.C30857x2dd9f1.f559881hf));
                c7();
                if (this.f235203w) {
                    this.f235199s.setBackground(null);
                    this.f235199s.f293706z = this.I;
                    android.view.View view = new android.view.View(this);
                    this.R = view;
                    view.setId(com.p314xaae8f345.mm.R.id.s1d);
                    relativeLayout.addView(view, 0);
                    android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    layoutParams.topMargin = com.p314xaae8f345.mm.ui.bl.b(mo55332x76847179()).x;
                    view.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
                    java.lang.String stringExtra = getIntent().getStringExtra("Contact_User");
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                    pf5.z zVar = pf5.z.f435481a;
                    ((uj4.e) zVar.a(activity).a(uj4.e.class)).f509961r = this;
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = mo55332x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                    uj4.e eVar = (uj4.e) zVar.a(activity2).a(uj4.e.class);
                    eVar.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f509950d, "addDBNotifyListener: " + stringExtra);
                    if (stringExtra != null) {
                        new ej4.s(stringExtra, eVar);
                    }
                    if (this.f235202v) {
                        a6();
                        M2();
                    } else {
                        j1();
                    }
                }
                this.f235199s.m82043x577127a4(com.p314xaae8f345.mm.ui.bl.c(mo55332x76847179()));
                mf4.d.f407696d.f142452e = 3L;
            }
        }
    }

    public final void f7() {
        if (fp.h.c(19)) {
            getWindow().clearFlags(201327616);
        } else {
            getWindow().clearFlags(1024);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        java.lang.Runnable runnable = this.T;
        if (runnable != null) {
            runnable.run();
            return;
        }
        mf4.d dVar = mf4.d.f407693a;
        mf4.d.f407696d.f142452e = 0L;
        super.finish();
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "onNotifyChange obj not String event:%d stg:%s obj:%s", java.lang.Integer.valueOf(i17), a1Var, obj);
            return;
        }
        if ((a1Var instanceof com.p314xaae8f345.mm.p2621x8fb0427b.e8) && (obj instanceof java.lang.String)) {
            mo735xb0dfc7d8((java.lang.String) obj, null);
            return;
        }
        if ((a1Var instanceof com.p314xaae8f345.mm.p2621x8fb0427b.n3) && (obj instanceof com.p314xaae8f345.mm.p2621x8fb0427b.u3) && this.f235194n != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_REPORT_LAST_TIME_REPORT_DYNACFG_VER_LONG;
            if ("USERINFO_ADD_CONTACT_BY_WEWORK_USERNAME_STRING_SYNC".equals(obj.toString())) {
                mo735xb0dfc7d8(this.f235194n.d1(), null);
            }
        }
    }

    public final void g7(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235196p) || this.f235192i != 15) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(str);
        boolean z17 = !android.text.TextUtils.equals(z07.f66691xf9f876b1, this.f235196p);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "trySavePhoneToStranger isMobilePhoneChanged:%s cur:%s mobile:%s", java.lang.Boolean.valueOf(z17), z07.f66691xf9f876b1, this.f235196p);
        if (z17) {
            com.p314xaae8f345.mm.p2621x8fb0427b.ya yaVar = new com.p314xaae8f345.mm.p2621x8fb0427b.ya(str);
            yaVar.f66692x4854b29d = z07.f66692x4854b29d;
            yaVar.f66690xbe857eff = z07.f66690xbe857eff;
            yaVar.f66693x91130dba = z07.f66693x91130dba;
            yaVar.f66691xf9f876b1 = this.f235196p;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "trySavePhoneToStranger mobilePhone replace finish ret:%s", java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).mo11260x413cb2b4(yaVar)));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235196p) || this.f235192i != 15) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "set MM_ADDSCENE_SEARCH_PHONE source");
        this.f235194n.j3(15);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getBottomView */
    public android.view.View mo60898x89f7f366() {
        return super.mo60898x89f7f366();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        t25.a aVar = this.f235188e;
        if (aVar == null || !((aVar instanceof hr3.t6) || (aVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90))) {
            return super.mo44431x663c095b();
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2513x5e818e54.C19944x94d13ed9()) == 1) {
            return super.mo44431x663c095b();
        }
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getIdentString */
    public s75.b mo65195x6a200eb() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f235194n;
        if (z3Var == null || ((int) z3Var.E2) == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.d1())) {
            return new s75.b("");
        }
        if (this.f235194n.k2() || this.f235194n.l2()) {
            return new s75.b("_bizContact");
        }
        java.lang.String d17 = this.f235194n.d1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "getIdentityString %s", d17);
        ku5.u0 u0Var = ku5.t0.f394148d;
        hr3.l1 l1Var = new hr3.l1(this, d17);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        return new s75.b(t0Var.m(l1Var, 0L));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutView */
    public android.view.View mo44092x29ebce5() {
        return com.p314xaae8f345.mm.ui.td.f291426c.a("LayoutsForLauncherUI").a(android.view.LayoutInflater.from(mo55332x76847179()), com.p314xaae8f345.mm.R.C30864xbddafb2a.dpx, null, false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576398a9;
    }

    public final void h7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "updateUIByStory: %s %s %s %s", java.lang.Boolean.valueOf(this.f235200t), java.lang.Boolean.valueOf(this.f235201u), java.lang.Boolean.valueOf(this.f235203w), java.lang.Boolean.valueOf(this.f235202v));
        if (this.f235201u && !this.f235204x) {
            Y6();
            mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            W6();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a = this.f235199s;
            if (c22702xa9a9ae2a != null) {
                c22702xa9a9ae2a.setBackground(com.p314xaae8f345.mm.ui.zk.d(mo55332x76847179(), com.p314xaae8f345.mm.R.C30857x2dd9f1.f559881hf));
                this.f235199s.m82045x1ceed8e(true);
            }
            android.view.View view = this.L;
            if (view != null) {
                view.setOnClickListener(new hr3.e1(this));
            }
        } else if (!this.f235202v || this.f235204x) {
            mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            W6();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a2 = this.f235199s;
            if (c22702xa9a9ae2a2 != null) {
                c22702xa9a9ae2a2.setBackground(com.p314xaae8f345.mm.ui.zk.d(mo55332x76847179(), com.p314xaae8f345.mm.R.C30857x2dd9f1.f559882hg));
                this.f235199s.m82045x1ceed8e(false);
            }
            android.view.View view2 = this.K;
            if (view2 != null) {
                view2.setPadding(0, 0, 0, 0);
            }
            if (m78511x9f88d943() != null) {
                m78511x9f88d943().mo82163x4e0f6657(true);
            }
        } else {
            Y6();
            m78585xe3232baf(al5.r.f87537d);
            mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            W6();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a3 = this.f235199s;
            if (c22702xa9a9ae2a3 != null) {
                c22702xa9a9ae2a3.setBackground(null);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f235194n;
                if (z3Var != null) {
                    z3Var.getClass();
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                this.f235199s.m82045x1ceed8e(((uj4.e) pf5.z.f435481a.a(activity).a(uj4.e.class)).X6());
            }
            android.view.View view3 = this.L;
            if (view3 != null) {
                view3.setOnClickListener(new hr3.f1(this));
            }
            if (m78511x9f88d943() != null) {
                m78511x9f88d943().mo82163x4e0f6657(false);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a4 = this.f235199s;
        if (c22702xa9a9ae2a4 != null) {
            if (this.f235202v) {
                c22702xa9a9ae2a4.setSelector(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a);
            } else {
                c22702xa9a9ae2a4.setSelector(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
            }
        }
        android.view.View view4 = this.L;
        int height = view4 != null ? view4.getHeight() : 0;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = this.f235187d;
        if (rVar != null && (viewOnClickListenerC16860xc669c20a = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("contact_profile_header_normal")) != null) {
            viewOnClickListenerC16860xc669c20a.V(this.f235201u && !this.f235204x, height, this.f235202v && !this.f235204x);
        }
        mo78578x8b18f126(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.HashSet hashSet = new java.util.HashSet(super.mo43419xa59964ef());
        hashSet.add(hr3.q0.class);
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0981  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x098e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x09d4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0752  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo43517x10010bd5() {
        /*
            Method dump skipped, instructions count: 2785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2.mo43517x10010bd5():void");
    }

    @Override // bi4.l0
    public void j1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "statusUINoStatus");
        this.f235202v = false;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a = this.f235199s;
        if (c22702xa9a9ae2a != null && !c22702xa9a9ae2a.f293680J) {
            m78602x5a7a36a0();
            f7();
            this.f235199s.n();
        }
        h7();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent != null) {
            getIntent().putExtra("CONTACT_INFO_UI_SOURCE", intent.getIntExtra("CONTACT_INFO_UI_SOURCE", -1));
        }
        if (i18 == -1 && intent != null && intent.getBooleanExtra("_delete_ok_", false)) {
            setResult(-1, getIntent().putExtra("_delete_ok_", true));
            finish();
        } else {
            t25.a aVar = this.f235188e;
            if (aVar != null) {
                aVar.mo67449x9d4787cb(i17, i18, intent);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        gr3.e.c(this.f235194n.d1(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.t.f34133x366c91de, this.f235206z, getIntent(), 0, this.f235192i);
        t25.a aVar = this.f235188e;
        if (((aVar instanceof t25.b) && ((t25.b) aVar).mo67617x4ceae47d()) || mo7595x9cdc264().m7686xbca8d80f()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        android.widget.RelativeLayout relativeLayout;
        super.onConfigurationChanged(configuration);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "onConfigurationChanged: ");
        this.f235204x = !bi4.e.c(this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a = this.f235199s;
        if (c22702xa9a9ae2a != null && !c22702xa9a9ae2a.f293680J) {
            c22702xa9a9ae2a.n();
        }
        if (!(this.f235188e instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90) && (((z3Var = this.f235194n) == null || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(z3Var.d1())) && this.f235202v && (relativeLayout = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.jlw)) != null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "reSetupStory: ");
            ((uj4.e) pf5.z.f435481a.a(this).a(uj4.e.class)).Z6();
            android.view.View view = this.R;
            if (view != null) {
                relativeLayout.removeView(view);
            }
            this.f235200t = false;
            e7();
        }
        h7();
        bi4.i0 Z6 = Z6();
        if (Z6 != null) {
            Z6.b4(getIntent().getStringExtra("Contact_User"));
        }
        t25.a aVar = this.f235188e;
        if ((aVar instanceof hr3.t6) || (aVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90)) {
            setRequestedOrientation(1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f235203w = bi4.v1.g();
        c7();
        com.p314xaae8f345.mm.p2621x8fb0427b.e8 q17 = c01.d9.b().q();
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_User");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) q17).m(stringExtra);
        this.f235201u = false;
        if (this.f235203w) {
            this.f235201u = false;
        }
        if (this.f235201u || this.f235202v) {
            m78497xc03943d(true);
        }
        super.onCreate(bundle);
        this.H = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.wi(getIntent());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("SnsMMKV").G("SnsMMKVSnsUI", true);
        this.N = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_show_profile_with_contact, 1);
        this.f235204x = !bi4.e.c(this);
        this.f235206z = java.lang.System.currentTimeMillis();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f563968ei);
        this.K = findViewById;
        if (findViewById != null) {
            this.L = findViewById.findViewById(com.p314xaae8f345.mm.R.id.f563971el);
        }
        h7();
        android.view.View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
        this.f235196p = getIntent().getStringExtra("Contact_Search_Mobile");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "onCreate MMCore.accHasReady[%b] mobilePhone:%s", java.lang.Boolean.valueOf(gm0.j1.a()), this.f235196p);
        if (!gm0.j1.b().m()) {
            finish();
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        gm0.j1.u().c().a(this);
        ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).f275284e.a(this, null);
        ((com.p314xaae8f345.mm.p2621x8fb0427b.w7) c01.d9.b().t()).f277843e.a(this, null);
        mo43517x10010bd5();
        mo78530x8b45058f();
        t25.a aVar = this.f235188e;
        if (aVar instanceof t25.b) {
            ((t25.b) aVar).mo67618x3e5a77bb();
        }
        mf4.d dVar = mf4.d.f407693a;
        mf4.d.f407696d.f142453f = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.wi(getIntent());
        gm0.j1.i();
        gm0.j1.n().f354821b.a(bd1.f.f4202x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(291, this);
        t25.a aVar2 = this.f235188e;
        if ((aVar2 instanceof hr3.t6) || (aVar2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90)) {
            setRequestedOrientation(1);
        }
        cy1.a aVar3 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ContactInfoUI);
        aVar3.Rj(this, iy1.a.Profile);
        aVar3.Ai(this, new hr3.i1(this));
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(this.f235194n.d1())) {
            int b17 = vh0.l2.b(getIntent());
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("page_id", 50179);
            hashMap.put("page_name", "yuanbao_profile_page");
            hashMap.put("chat_name", this.f235194n.d1());
            hashMap.put("enter_type", java.lang.Integer.valueOf(b17));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("session_in", hashMap, 34004);
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.A4(this.f235194n.d1())) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            java.lang.String str = pj5.u.f436940a;
            hashMap2.put("reminder_sessionid", str != null ? str : "");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Gj(50312, "page_in", hashMap2, 35684);
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.t4(this.f235194n.d1())) {
            if (getIntent().getIntExtra("setting_from_source", 2) == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11288, 24, 6);
            } else if (getIntent().getIntExtra("chat_from_scene", -1) == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11288, 24, 1);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("SnsMMKV").G("SnsMMKVSnsUI", false);
        mf4.d.f407696d.f142453f = 0L;
        if (gm0.j1.b().m()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
            gm0.j1.u().c().e(this);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).f275284e.j(this);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.w7) c01.d9.b().t()).f277843e.j(this);
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(this.f235188e == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "onDestroy bodyWidget is null?%s", objArr);
        t25.a aVar = this.f235188e;
        if (aVar != null) {
            aVar.mo67450x3f5eee52();
        }
        t25.a aVar2 = this.f235188e;
        if (aVar2 instanceof t25.b) {
            ((t25.b) aVar2).mo67619xac79a11b();
        }
        if (p94.w0.d() != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1) p94.w0.d()).N(this);
        }
        super.onDestroy();
        gm0.j1.i();
        gm0.j1.n().f354821b.q(bd1.f.f4202x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(291, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(getIntent(), 18, 1, this.f235194n.d1());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17283, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.wi(getIntent())), this.f235194n.d1(), java.lang.Boolean.valueOf(this.f235201u), java.lang.Boolean.FALSE, java.lang.Integer.valueOf(this.f235194n.L), 0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.F;
        if (u3Var != null) {
            u3Var.dismiss();
            this.F = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s sVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s.class);
        sVar.f236071g.set(null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f236068d, "clearCurrentConfig");
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50293x3498a0(new hr3.p1(this, str));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (((uj4.e) pf5.z.f435481a.a(activity).a(uj4.e.class)).P6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "onPause: skip");
            super.onPause();
            return;
        }
        r01.q3.cj().mo49775xc84af884(this);
        super.onPause();
        gm0.j1.e().f(new hr3.k1(this));
        if (getIntent().getBooleanExtra("key_from_wesport_right_newtips", false)) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().m(3, mo78509x4b0ac5a2());
        } else if (getIntent().getBooleanExtra("key_from_wesport_plugin_newtips", false)) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().m(1, mo78509x4b0ac5a2());
        }
        f7();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a = this.f235199s;
        if (c22702xa9a9ae2a != null) {
            c22702xa9a9ae2a.n();
        }
        t25.a aVar = this.f235188e;
        if ((aVar instanceof hr3.t6) || (aVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90)) {
            aVar.mo67450x3f5eee52();
        }
        t25.a aVar2 = this.f235188e;
        if (aVar2 instanceof t25.b) {
            ((t25.b) aVar2).mo67620xb01dfb57();
        }
        ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).Ni(this.f235186J);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", str + " item has been clicked!");
        t25.a aVar = this.f235188e;
        if (aVar != null) {
            aVar.R(str);
        }
        if (c21560x1fce98fb.f279313q.equals("contact_info_sns")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(getIntent(), 3, 1, this.f235194n.d1());
        } else if (c21560x1fce98fb.f279313q.equals("contact_info_more")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(getIntent(), 6, 1, this.f235194n.d1());
        }
        int intExtra = getIntent().getIntExtra("contact_sns_page", 0);
        if (intExtra != 1 && intExtra != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "reportSns33050 page:%d", java.lang.Integer.valueOf(intExtra));
        } else if (c21560x1fce98fb.f279313q.equals("contact_profile_sns") || c21560x1fce98fb.f279313q.equals("contact_profile_send")) {
            java.util.HashMap hashMap = new java.util.HashMap();
            if (c21560x1fce98fb.f279313q.equals("contact_profile_sns")) {
                hashMap.put("jump_dst", 2);
            } else if (c21560x1fce98fb.f279313q.equals("contact_profile_send")) {
                hashMap.put("jump_dst", 1);
            }
            hashMap.put("sessionid_sns", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni());
            if (pc4.d.f434943a.F()) {
                hashMap.put("feed_fold_type", 2);
            } else {
                hashMap.put("feed_fold_type", 1);
            }
            hashMap.put("is_ws_block", 0);
            hashMap.put("is_ws", 0);
            if (intExtra == 1) {
                hashMap.put("jump_scene", 1);
                if (getIntent().getBooleanExtra("contact_sns_is_ws", false)) {
                    hashMap.put("is_ws_block", 1);
                    hashMap.put("is_ws", 1);
                }
            } else if (intExtra == 2) {
                hashMap.put("jump_scene", 2);
                hashMap.put("is_ws", 1);
            }
            hashMap.put("sns_objecttype", getIntent().getIntExtra("contact_sns_feed_type", 0) + "");
            hashMap.put("username_sns", getIntent().getStringExtra("contact_sns_publish_user"));
            hashMap.put("publishid_sns", getIntent().getStringExtra("contact_sns_feed_id"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "report 33050:%s", hashMap.toString());
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("sns_jump", hashMap, 33050);
        }
        if (c21560x1fce98fb instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a) {
            d7();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.o oVar;
        t25.a aVar = this.f235188e;
        if ((aVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90) && (oVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90) aVar).X) != null && oVar.f235091r) {
            oVar.g();
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        int i18 = com.p314xaae8f345.mm.R.C30867xcad56011.hhn;
        if (i17 != 19) {
            if (i17 != 82) {
                return;
            }
            if (iArr[0] != 0) {
                db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhn), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new hr3.b1(this), null);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235187d).h("contact_info_footer_normal");
            if (c16861xdcf09668 != null) {
                c16861xdcf09668.M();
                return;
            }
            return;
        }
        if (iArr[0] == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf096682 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f235187d).h("contact_info_footer_normal");
            if (c16861xdcf096682 != null) {
                c16861xdcf096682.N();
                return;
            }
            return;
        }
        if ("android.permission.CAMERA".equals(strArr[0])) {
            i18 = com.p314xaae8f345.mm.R.C30867xcad56011.hh8;
        }
        if (iArr[0] == 0) {
            return;
        }
        db5.e1.C(this, getString(i18), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new hr3.z0(this), new hr3.a1(this));
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (((uj4.e) pf5.z.f435481a.a(activity).a(uj4.e.class)).P6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "onResume: skip");
            super.onResume();
            return;
        }
        r01.q3.cj().add(this);
        super.onResume();
        if (this.f235194n != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("page_name", "wxprofilepage");
            hashMap.put("wxtype", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(this.f235194n.d1()) ? 2 : 1));
            hashMap.put("wx_username", this.f235194n.d1());
            hashMap.put("referpath", java.lang.Integer.valueOf(this.H));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "report 33629:%s", hashMap.toString());
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            iy1.c cVar = iy1.c.MainUI;
            ((cy1.a) rVar).Gj(50323, "page_in", hashMap, 33629);
        }
        android.view.View focusedChild = ((android.view.ViewGroup) m78513xc2a54588()).getFocusedChild();
        if (focusedChild != null) {
            focusedChild.clearFocus();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "try to clear focus. id:%s", java.lang.Integer.valueOf(focusedChild.getId()));
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar2 = this.f235187d;
        if (rVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar2).h("contact_profile_header_normal");
            this.f235189f = viewOnClickListenerC16860xc669c20a;
            if (viewOnClickListenerC16860xc669c20a != null) {
                android.view.View view = this.L;
                this.f235189f.V(this.f235201u, view != null ? view.getHeight() : 0, this.f235202v);
            }
        }
        t25.a aVar = this.f235188e;
        if ((aVar instanceof hr3.t6) || (aVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90)) {
            aVar.Q(this.f235187d, this.f235194n, this.f235190g, this.f235192i);
        }
        t25.a aVar2 = this.f235188e;
        if (aVar2 instanceof t25.b) {
            ((t25.b) aVar2).mo67621x57429eec();
        }
        ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).wi(this.f235186J);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        m1Var.mo808xfb85f7b0();
        if (273 == m1Var.mo808xfb85f7b0() && (z3Var = this.f235194n) != null && (this.f235188e instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0)) {
            z3Var.d1();
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(m1Var);
            throw null;
        }
        if (291 != m1Var.mo808xfb85f7b0() || this.f235194n == null) {
            return;
        }
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50293x3498a0(new hr3.p1(this, this.f235194n.d1()));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        ((bi4.z0) i95.n0.c(bi4.z0.class)).getClass();
        hashSet.add(qj4.u.class);
        ((bi4.z0) i95.n0.c(bi4.z0.class)).getClass();
        hashSet.add(qj4.i.class);
        ((xe0.l0) i95.n0.c(xe0.l0.class)).getClass();
        hashSet.add(uj4.e.class);
        hashSet.add(xn5.h1.class);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f235194n;
        if (z3Var == null || android.text.TextUtils.isEmpty(z3Var.d1())) {
            return;
        }
        w04.l.INSTANCE.F5(this.f235194n.d1());
    }
}
