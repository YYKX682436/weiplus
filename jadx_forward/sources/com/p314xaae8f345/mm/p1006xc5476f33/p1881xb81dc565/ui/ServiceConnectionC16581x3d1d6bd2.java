package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui;

@db5.a(m123858x6ac9171 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m9.f34451x366c91de)
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI */
/* loaded from: classes14.dex */
public class ServiceConnectionC16581x3d1d6bd2 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z, android.content.ServiceConnection, r90.j {
    public static final /* synthetic */ int D = 0;
    public di3.d C;

    /* renamed from: d, reason: collision with root package name */
    public sj3.m1 f231761d;

    /* renamed from: e, reason: collision with root package name */
    public sj3.a5 f231762e;

    /* renamed from: f, reason: collision with root package name */
    public sj3.o3 f231763f;

    /* renamed from: g, reason: collision with root package name */
    public sj3.g3 f231764g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f231765h;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f231768n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2.ScreenActionReceiver f231769o;

    /* renamed from: p, reason: collision with root package name */
    public iq4.d f231770p;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0 f231775u;

    /* renamed from: i, reason: collision with root package name */
    public boolean f231766i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f231767m = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f231771q = false;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f231772r = zj3.j.h();

    /* renamed from: s, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f231773s = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.k(this);

    /* renamed from: t, reason: collision with root package name */
    public boolean f231774t = false;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.Runnable f231776v = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.l(this);

    /* renamed from: w, reason: collision with root package name */
    public boolean f231777w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f231778x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f231779y = false;

    /* renamed from: z, reason: collision with root package name */
    public int f231780z = 0;
    public final android.content.BroadcastReceiver A = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p(this);
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 B = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.j(this);

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI$ScreenActionReceiver */
    /* loaded from: classes11.dex */
    public class ScreenActionReceiver extends android.content.BroadcastReceiver {
        public ScreenActionReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            java.lang.String action = intent.getAction();
            if (action == null || !action.equals("android.intent.action.SCREEN_OFF")) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkMainUI", "receive action screen off");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2.this.B;
            n3Var.mo50302x6b17ad39(null);
            n3Var.mo50305x3d8a09a2(0);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z
    public void C() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkMainUI", "onEnterMultiTalk");
        X6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Di().K();
        this.f231761d.a();
        if (this.f231772r) {
            this.f231764g.n();
        } else {
            this.f231762e.i(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t);
            this.f231762e.j();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z
    public void D2(java.lang.String path) {
        sj3.o3 o3Var = this.f231763f;
        if (o3Var != null) {
            o3Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(path);
            am.c4 c4Var = c5303xc75d2f73.f135623g;
            if (K0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTalkScreenProjectUILogic", "fill favorite event fail, event is null or image path is empty");
                c4Var.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cac;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkScreenProjectUILogic", "do fill event info(fav simple image), path %s sourceType %d", path, 2);
                r45.bq0 bq0Var = new r45.bq0();
                r45.jq0 jq0Var = new r45.jq0();
                r45.gp0 gp0Var = new r45.gp0();
                gp0Var.h0(2);
                gp0Var.A0(path);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(gp0Var);
                sb6.append('2');
                sb6.append(java.lang.System.currentTimeMillis());
                byte[] bytes = sb6.toString().getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                gp0Var.e0(kk.k.g(bytes));
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
                am.z9 z9Var = c5432x35bb364f.f135776g;
                z9Var.f90061a = 27;
                z9Var.f90066f = gp0Var;
                c5432x35bb364f.e();
                java.lang.String str = c5432x35bb364f.f135777h.f87670d;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.x(path, 150, 150, android.graphics.Bitmap.CompressFormat.JPEG, 90, str, true);
                gp0Var.B0(str);
                jq0Var.e(c01.z1.r());
                jq0Var.j(c01.z1.r());
                jq0Var.g(2);
                jq0Var.c(java.lang.System.currentTimeMillis());
                bq0Var.o(jq0Var);
                bq0Var.f452497f.add(gp0Var);
                c4Var.f87851d = gp0Var.f456937d;
                c4Var.f87848a = bq0Var;
                c4Var.f87850c = 2;
            }
            c4Var.f87856i = o3Var.f490200a;
            c4Var.f87860m = 6;
            c5303xc75d2f73.e();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z
    public void I5(sj3.e4 e4Var, sj3.e4 e4Var2) {
        if (e4Var2 != sj3.e4.Talking) {
            if (e4Var2 == sj3.e4.Starting && this.f231772r) {
                boolean m40085xe877826c = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40085xe877826c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2538xd14fac7c.C20336x7f6064ce()) == 1) {
                    m40085xe877826c = true;
                }
                if (m40085xe877826c) {
                    android.widget.Toast c17 = db5.t7.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oaa));
                    c17.setDuration(3000);
                    c17.show();
                    return;
                }
                return;
            }
            return;
        }
        if (!this.f231772r) {
            sj3.a5 a5Var = this.f231762e;
            if (a5Var.V > 0) {
                a5Var.V = java.lang.System.currentTimeMillis();
                return;
            }
            return;
        }
        if (!ym1.f.Ri()) {
            ym1.f.Ni();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0 b0Var = this.f231775u;
        b0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Di().f554707o.getClass();
        int i17 = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Bi().f304049a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkUIViewModel", "updateIconState: cameraEnable true, audioType " + i17);
        b0Var.f231806x.mo7808x76db6cb1(java.lang.Boolean.TRUE);
        b0Var.f231791f.mo7808x76db6cb1(java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z
    public void J5(java.lang.String imgPath) {
        sj3.o3 o3Var = this.f231763f;
        if (o3Var != null) {
            o3Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgPath, "imgPath");
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(o3Var.f490200a, "com.tencent.mm.ui.transmit.MsgRetransmitUI");
            intent.putExtra("Retr_File_Name", imgPath);
            intent.putExtra("Retr_Msg_Type", 0);
            intent.putExtra("Retr_Compress_Type", 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = o3Var.f490200a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(serviceConnectionC16581x3d1d6bd2, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkScreenProjectUILogic", "doSendTOFriend", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            serviceConnectionC16581x3d1d6bd2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(serviceConnectionC16581x3d1d6bd2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkScreenProjectUILogic", "doSendTOFriend", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z
    public void N0() {
        setRequestedOrientation(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProjectReportHelper", "markClickStopProject");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1538L, 5L, 1L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231701m = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231702n = false;
        getIntent().removeExtra("enterMainUIScreenProjectOnline");
        getIntent().removeExtra("enterMainUIScreenProjectParams");
        this.f231763f.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().Z(1, false);
        if (this.f231772r) {
            this.f231764g.n();
            return;
        }
        this.f231762e.m();
        sj3.a5 a5Var = this.f231762e;
        if (a5Var.L) {
            a5Var.H.setVisibility(0);
        }
        android.view.View view = this.f231762e.f489951e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showMiniUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showMiniUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f231762e.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri();
        Ri.getClass();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = Ri.f231707q.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!c01.z1.r().equals(str)) {
                hashSet.add(str);
            }
        }
        Ri.f231707q.clear();
        Ri.f231707q = hashSet;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z zVar = Ri.C;
        if (zVar != null) {
            zVar.x5();
        }
        this.f231762e.i(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t);
        sj3.a5 a5Var2 = this.f231762e;
        android.view.View view2 = a5Var2.f489960q;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = a5Var2.f489956m;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "showGradientView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f231762e.j();
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().y() || this.f231768n == null) {
            return;
        }
        sj3.a5 a5Var3 = this.f231762e;
        android.widget.FrameLayout frameLayout = a5Var3.Q;
        a5Var3.f489953g.k(a5Var3.f489952f, frameLayout, a5Var3.f489950d, a5Var3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r3) com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().r()).a(true);
    }

    public android.view.ViewGroup T6() {
        return (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.m7w);
    }

    public void U6() {
        if (this.f231778x || com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t == null) {
            return;
        }
        this.f231778x = true;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("kintent_talker", com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t.f153141f);
        intent.putExtra("key_media_type", 2);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 3);
        j45.l.v(this, "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI", intent, 3);
    }

    public boolean V6() {
        sj3.o3 o3Var = this.f231763f;
        if (o3Var != null) {
            return o3Var.d();
        }
        return false;
    }

    public void W6(int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(this, "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutCamera");
        intent.putExtra("activity_caller_params", 1);
        startActivityForResult(intent, 1);
        this.f231779y = true;
        this.f231780z = i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X6() {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2.X6():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z
    public void Z(boolean z17) {
        java.lang.Boolean bool;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().y()) {
            if (!this.f231772r) {
                sj3.a5 a5Var = this.f231762e;
                a5Var.getClass();
                ((ku5.t0) ku5.t0.f394148d).B(new sj3.n4(a5Var, z17));
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0 b0Var = this.f231775u;
            boolean z18 = true;
            if (b0Var != null && (bool = (java.lang.Boolean) b0Var.f231790e.mo3195x754a37bb()) != null) {
                if (bool.booleanValue() == z17) {
                    ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2.this.f231775u.P6(false);
                        }
                    });
                }
                z18 = false;
            }
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MT.MultiTalkMainUI", "onMuteStateChange mTalkingViewModel or micOn is null");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Z3() {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2.Z3():void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        sj3.g3 g3Var;
        super.finish();
        sj3.a5 a5Var = this.f231762e;
        if (a5Var != null) {
            a5Var.X = false;
        }
        if (this.f231772r && (g3Var = this.f231764g) != null) {
            sj3.a1 e17 = g3Var.e();
            e17.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ControlPanelLogic", "disableClick");
            e17.f489940u = false;
        }
        di3.d dVar = this.C;
        if (dVar != null) {
            dVar.disable();
            this.C.f314222g = null;
            this.C = null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z
    public boolean g4() {
        if (this.f231772r) {
            return java.lang.Boolean.TRUE.equals(this.f231775u.f231796n.mo3195x754a37bb());
        }
        if (this.f231762e != null) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi().c();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return !this.f231763f.d() ? 1 : 4;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c3c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z
    public void h0(boolean z17) {
        java.lang.Integer num;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().y()) {
            if (!this.f231772r) {
                sj3.a5 a5Var = this.f231762e;
                a5Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "onSpeakerStateChange: %s", java.lang.Boolean.valueOf(z17));
                ((ku5.t0) ku5.t0.f394148d).B(new sj3.o4(a5Var, z17));
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0 b0Var = this.f231775u;
            boolean z18 = true;
            if (b0Var != null && (num = (java.lang.Integer) b0Var.f231792g.mo3195x754a37bb()) != null) {
                z18 = false;
                if (num.equals(1) != z17) {
                    this.f231775u.Q6(false);
                }
            }
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MT.MultiTalkMainUI", "onSpeakerStateChange mTalkingViewModel or speakerOn is null");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z
    public void i1(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.n2 n2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.n2 n2Var2) {
        if (n2Var2 == com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.n2._4G) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.aj().a(this);
            return;
        }
        if (n2Var2 != com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.n2._3GOr_2G) {
            if (n2Var2 == com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.n2.None) {
                p21.i.b(this, com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu, null);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.l2 aj6 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.aj();
            if (aj6.f231570a) {
                return;
            }
            aj6.f231570a = true;
            p21.i.b(this, com.p314xaae8f345.mm.R.C30867xcad56011.h2k, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z
    public void i4() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkMainUI", "onVideoGroupMemberChange, SubCoreMultiTalk.getMultiTalkManager().getCurrentVideoUserSet().size(): " + com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231707q.size());
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().y()) {
            java.util.HashSet hashSet = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231707q;
            if (hashSet.size() <= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri();
                Ri.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkManager", "try to stopNetworkDataSource");
                if (Ri.n() != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 n17 = Ri.n();
                    n17.getClass();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MTR.MultiTalkRenderLogic", "stopDecodeVideo", new java.lang.Object[0]);
                    cj3.n nVar = n17.f231409b;
                    if (nVar != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.MultiTalkEngineOp", "stopDecodeVideo");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.R(null);
                        nVar.f123432c = false;
                    }
                }
            } else if (hashSet.size() == 1 && hashSet.contains(c01.z1.r())) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().W();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().T();
            }
            if (V6() || this.f231772r) {
                return;
            }
            sj3.a5 a5Var = this.f231762e;
            if (a5Var.f489953g.j()) {
                return;
            }
            java.util.HashSet hashSet2 = new java.util.HashSet(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231707q);
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231698h;
            if (i17 == 1 || i17 == 3) {
                a5Var.l(hashSet2);
            }
            int size = hashSet2.size();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(220L, 19L, 1L, false);
            g0Var.mo68477x336bdfd8(220L, 20L, size, false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z
    public void j(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkMainUI", "onError " + i17);
        if (i17 == -1700) {
            if (this.f231772r) {
                this.f231775u.O6(java.lang.Boolean.FALSE);
                return;
            }
            sj3.a5 a5Var = this.f231762e;
            a5Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "onSwitchVideoDisabled");
            a5Var.f489968y.m67074xdd7d58e5(false);
            a5Var.v(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().Z(1, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231701m);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.a(6);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.H();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Zi().getClass();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z
    public void k() {
        sj3.a5 a5Var = this.f231762e;
        if (a5Var != null) {
            if (this.f231772r) {
                this.f231764g.p(5);
            } else {
                a5Var.q(5);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z
    public void n3(boolean z17) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().y()) {
            if (!this.f231772r) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b c16586x7058535b = this.f231762e.A;
                if (c16586x7058535b != null) {
                    c16586x7058535b.setEnabled(z17);
                    c16586x7058535b.m67075xea2556c6(z17);
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0 b0Var = this.f231775u;
            b0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkUIViewModel", "setHandsFreeEnable: " + z17);
            b0Var.f231805w.mo7808x76db6cb1(java.lang.Boolean.valueOf(z17));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        sj3.a5 a5Var;
        boolean z17;
        int i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkMainUI", "onActivityResult " + i17 + " resultCode " + i18);
        super.onActivityResult(i17, i18, intent);
        this.f231777w = false;
        this.f231778x = false;
        if (i18 == -1 && i17 == 1) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkMainUI", "add member " + stringExtra);
            java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","));
            if (P1 == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri();
            if (Ri.x()) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ri.f231710t.f153139d)) {
                    java.lang.String str = Ri.f231710t.f153140e;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkManager", "addMemberList: %s, wifigateway:%s, groupid:%s", com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.o2.b(Ri.f231710t), com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.w(), Ri.f231710t.f153141f);
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
                i4Var.Z = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.u4() { // from class: com.tencent.mm.plugin.multitalk.model.v0$$b
                    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.u4
                    public final void a(int i27, java.lang.String str2) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().N(this);
                    }
                };
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.ArrayList a17 = i4Var.f231156f.a();
                java.util.Iterator it = P1.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    java.util.Iterator it6 = a17.iterator();
                    while (it6.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w) it6.next();
                        if (str2.equals(wVar.f231375c) && ((i19 = wVar.f231377e) == 1 || i19 == 2 || i19 == 3)) {
                            z17 = true;
                            break;
                        }
                    }
                    z17 = false;
                    if (!z17) {
                        linkedList.add(str2);
                    }
                }
                if (linkedList.size() != 0) {
                    i4Var.J(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.s2(i4Var, linkedList));
                }
            }
        }
        if (i17 == 1 && (a5Var = this.f231762e) != null && this.f231779y) {
            this.f231779y = false;
            int i27 = this.f231780z;
            boolean z18 = this.f231772r;
            if (i27 == 1) {
                if (z18) {
                    this.f231764g.o(5);
                    return;
                } else {
                    a5Var.p(5);
                    return;
                }
            }
            if (i27 == 2) {
                if (z18) {
                    this.f231764g.p(5);
                } else {
                    a5Var.q(5);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        android.view.ViewGroup T6;
        super.onConfigurationChanged(configuration);
        if (V6()) {
            this.f231763f.e();
            return;
        }
        getWindow().clearFlags(1024);
        getWindow().addFlags(134217728);
        if (!this.f231772r) {
            sj3.a5 a5Var = this.f231762e;
            a5Var.getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().z()) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = a5Var.f489952f;
                c1163xf1deaba4.requestLayout();
                if (c1163xf1deaba4.mo7946xf939df19() != null) {
                    c1163xf1deaba4.mo7946xf939df19().m8146xced61ae5();
                }
                a5Var.f489954h.m8087x46ac7299();
                return;
            }
            return;
        }
        sj3.g3 g3Var = this.f231764g;
        g3Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "refreshLayout: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = g3Var.f490053a;
        if (serviceConnectionC16581x3d1d6bd2 != null && (T6 = serviceConnectionC16581x3d1d6bd2.T6()) != null) {
            T6.requestLayout();
        }
        sj3.a1 e17 = g3Var.e();
        e17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ControlPanelLogic", "refreshLayout: ");
        e17.d().requestLayout();
        e17.c().requestLayout();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f231775u = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0.class);
        ((tf0.a) ((uf0.e) i95.n0.c(uf0.e.class))).getClass();
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) mo3.f.f411939a).f(41);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Di().L(this, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().L();
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        int intExtra = getIntent().getIntExtra("enterMainUiSource", 0);
        if (intExtra == 1 || intExtra == 2) {
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559376d1, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        } else {
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559424ef, com.p314xaae8f345.mm.R.C30854x2dc211.f559425eg);
        }
        m78531x8f8cf1fb();
        getWindow().addFlags(6815872);
        getWindow().addFlags(67108864);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().d(false);
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().x()) {
            finish();
            if (intExtra == 2) {
                getIntent().getStringExtra("enterMainUiWxGroupId");
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Di().L(this, false);
        this.f231761d = new sj3.m1(this);
        this.f231762e = new sj3.a5(this);
        this.f231763f = new sj3.o3(this);
        this.f231764g = new sj3.g3(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.m2 m2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().K;
        sj3.e4 e4Var = sj3.e4.Init;
        while (true) {
            sj3.e4 e4Var2 = (sj3.e4) ((java.util.ArrayDeque) m2Var.f231578a).poll();
            if (e4Var2 == null) {
                break;
            }
            I5(e4Var, e4Var2);
            e4Var = e4Var2;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        registerReceiver(this.A, intentFilter);
        this.f231767m = true;
        this.f231768n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (!j35.u.a(this, "android.permission.RECORD_AUDIO", 82, "", "")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkMainUI", "has not audio record permission!");
        }
        if (fp.h.c(26)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkMainUI", "initScreenObserver");
            this.f231769o = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2.ScreenActionReceiver();
            android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
            intentFilter2.addAction("android.intent.action.SCREEN_OFF");
            intentFilter2.addAction("android.intent.action.SCREEN_ON");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(this.f231769o, intentFilter2);
        }
        iq4.d dVar = new iq4.d(new dp1.u(this));
        this.f231770p = dVar;
        dVar.b(9, "VOIPFloatBall");
        di3.d dVar2 = new di3.d(this);
        this.C = dVar2;
        dVar2.enable();
        this.C.f314222g = this;
        this.f231774t = false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        sj3.g3 g3Var;
        if (this.f231772r && (g3Var = this.f231764g) != null) {
            g3Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "onDestroy");
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1890x17af21cb.C16589x63693fe8 d17 = g3Var.d();
            d17.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAvatarLayout", "close");
            java.util.Iterator it = d17.f231896d.entrySet().iterator();
            while (it.hasNext()) {
                ((tj3.p) ((java.util.Map.Entry) it.next()).getValue()).f501316b.c();
            }
        }
        if (this.f231777w || this.f231778x || this.f231779y) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().C(false);
        }
        if (this.f231767m) {
            unregisterReceiver(this.A);
        }
        sj3.o3 o3Var = this.f231763f;
        if (o3Var != null) {
            boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231719y1;
            uj3.p pVar = o3Var.f490201b;
            if (pVar != null) {
                pVar.t(z17);
            }
            uj3.i iVar = o3Var.f490202c;
            if (iVar != null) {
                iVar.t(z17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Di().L(null, false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.B;
        n3Var.mo50302x6b17ad39(null);
        n3Var.mo50305x3d8a09a2(1);
        if (fp.h.c(26)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkMainUI", "unInitScreenObserver");
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2.ScreenActionReceiver screenActionReceiver = this.f231769o;
            if (screenActionReceiver != null) {
                try {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(screenActionReceiver);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkMainUI", "unregisterBatteryChange err:%s", e17.getMessage());
                }
                this.f231769o = null;
            }
        }
        T6().getViewTreeObserver().removeOnGlobalLayoutListener(this.f231773s);
        super.onDestroy();
        iq4.d dVar = this.f231770p;
        if (dVar != null) {
            dVar.o0();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        int i18;
        boolean z17 = false;
        if (keyEvent.getKeyCode() == 4) {
            if (V6()) {
                sj3.o3 o3Var = this.f231763f;
                uj3.p pVar = o3Var.f490201b;
                if (pVar != null) {
                    pVar.o();
                }
                uj3.i iVar = o3Var.f490202c;
                if (iVar != null) {
                    iVar.o();
                }
            } else {
                sj3.a5 a5Var = this.f231762e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.j jVar = a5Var.f489953g;
                if (jVar != null && jVar.j()) {
                    a5Var.m();
                    a5Var.H.e();
                    jVar.f();
                    z17 = true;
                }
                if (!z17) {
                    db5.e1.j(this, com.p314xaae8f345.mm.R.C30867xcad56011.h1r, com.p314xaae8f345.mm.R.C30867xcad56011.h0y, com.p314xaae8f345.mm.R.C30867xcad56011.f571541ib, com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg, new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.m(this), null);
                }
            }
            return true;
        }
        sj3.e4 e4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231709s;
        if (e4Var == sj3.e4.Inviting) {
            if (i17 == 25 || i17 == 24) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().X();
                this.f231766i = false;
                return true;
            }
        } else if (e4Var == sj3.e4.Creating || e4Var == sj3.e4.Starting) {
            yx3.v Ai = ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Ai();
            if (Ai != null) {
                vx3.c cVar = Ai.f549478e;
                if (cVar != null) {
                    i18 = cVar.f522804b;
                } else {
                    yx3.k kVar = Ai.f549476c;
                    i18 = kVar != null ? kVar.c() : 3;
                }
            } else {
                i18 = 5;
            }
            if (i17 == 25) {
                i95.m c17 = i95.n0.c(ym1.f.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                xm1.h hVar = ((ym1.f) c17).f544669e;
                if (hVar == null) {
                    hVar = new xm1.j();
                    i95.m c18 = i95.n0.c(ym1.f.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                    ((ym1.f) c18).f544669e = hVar;
                    i95.m c19 = i95.n0.c(ym1.f.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                    ((ym1.f) c19).f544671g[0] = "music";
                }
                to.a.a(hVar.c(), i18, -1, 5);
                return true;
            }
            if (i17 == 24) {
                i95.m c27 = i95.n0.c(ym1.f.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
                xm1.h hVar2 = ((ym1.f) c27).f544669e;
                if (hVar2 == null) {
                    hVar2 = new xm1.j();
                    i95.m c28 = i95.n0.c(ym1.f.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c28, "getService(...)");
                    ((ym1.f) c28).f544669e = hVar2;
                    i95.m c29 = i95.n0.c(ym1.f.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c29, "getService(...)");
                    ((ym1.f) c29).f544671g[0] = "music";
                }
                to.a.a(hVar2.c(), i18, 1, 5);
                return true;
            }
        } else {
            if (i17 == 25) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J != null) {
                    ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).sj();
                }
                return true;
            }
            if (i17 == 24) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J != null) {
                    ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).tj();
                }
                return true;
            }
        }
        return super.onKeyDown(i17, keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (((java.util.HashSet) o35.a.f424284a).contains(r2.toLowerCase()) == false) goto L17;
     */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNewIntent(android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2.onNewIntent(android.content.Intent):void");
    }

    @Override // r90.j
    /* renamed from: onOrientationChange */
    public void mo47333x15072581(int i17) {
        if (!V6()) {
            this.f231762e.b(i17);
            return;
        }
        sj3.o3 o3Var = this.f231763f;
        o3Var.getClass();
        sj3.n3 n3Var = sj3.o3.f490199e;
        if (n3Var.a(this) != o3Var.f490203d) {
            o3Var.e();
            if (n3Var.a(this) == 90 || n3Var.a(this) == 270) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.f231681h++;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        iq4.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().W();
        super.onPause();
        android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("keyguard");
        android.os.PowerManager powerManager = (android.os.PowerManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("power");
        boolean z17 = (hasWindowFocus() || !keyguardManager.inKeyguardRestrictedInputMode()) && powerManager.isScreenOn();
        this.f231765h = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkMainUI", "onPause, screenOn: %b", java.lang.Boolean.valueOf(z17));
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().y() && !this.f231772r) {
            this.f231762e.getClass();
        }
        if (this.f231778x || this.f231777w || this.f231779y || V6()) {
            if (V6() && (dVar = this.f231770p) != null && !this.f231779y) {
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = dVar.f174665d;
                c12886x91aa2b6d.M.f174623m = 4;
                gp1.v vVar = dVar.f174669h;
                if (vVar != null) {
                    vVar.i(c12886x91aa2b6d);
                }
            }
            qp1.h0.a(true, true, true);
        } else {
            iq4.d dVar2 = this.f231770p;
            if (dVar2 != null) {
                dVar2.z();
                qp1.h0.b();
            }
        }
        if (V6()) {
            iq4.c cVar = iq4.b.f375331a;
            cVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipFloatBallHelper", "updateHideWhenAppBackground %b", java.lang.Boolean.TRUE);
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = cVar.f174665d;
            if (c12886x91aa2b6d2 != null) {
                c12886x91aa2b6d2.Q = true;
                cVar.g();
                return;
            }
            return;
        }
        iq4.c cVar2 = iq4.b.f375331a;
        cVar2.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipFloatBallHelper", "updateHideWhenAppBackground %b", java.lang.Boolean.FALSE);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d3 = cVar2.f174665d;
        if (c12886x91aa2b6d3 != null) {
            c12886x91aa2b6d3.Q = false;
            cVar2.g();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (strArr == null || strArr.length == 0 || iArr == null || iArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MT.MultiTalkMainUI", "[multitalk]onRequestPermissionsResult %d data is invalid", java.lang.Integer.valueOf(i17));
            return;
        }
        int i18 = iArr[0];
        java.lang.Thread.currentThread().getId();
        if (i17 == 22) {
            if (iArr[0] == 0) {
                return;
            }
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh8), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.s(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.i(this));
        } else if (i17 == 82 && iArr[0] != 0) {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhn), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.q(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.r(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkMainUI", "onResume");
        super.onResume();
        this.f231771q = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231719y1 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().C = this;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi().f231649h = this;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Di().K();
        T6().getViewTreeObserver().addOnGlobalLayoutListener(this.f231773s);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.k2 o17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().o();
        java.util.ArrayList arrayList = o17.f231563c;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                o17.d((java.lang.String) it.next());
            }
        }
        X6();
        iq4.d dVar = this.f231770p;
        if (dVar != null && !this.f231779y) {
            dVar.p0();
            qp1.h0.a(true, false, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0 x0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0.class);
        if (x0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.b1) x0Var;
            b1Var.Ai();
            b1Var.wi();
        }
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d(6, "MusicFloatBall", null);
            c12886x91aa2b6d.f174581f = 2;
            Bi.U(c12886x91aa2b6d);
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().y()) {
            this.f231768n.mo50297x7c4d7ca2(this.f231776v, 2000L);
        }
        boolean V6 = V6();
        boolean z17 = this.f231772r;
        if (V6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().a0(101);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231701m = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231702n = false;
        } else {
            boolean booleanExtra = getIntent().getBooleanExtra("enterMainUIScreenProjectOnline", false);
            android.os.Bundle bundleExtra = getIntent().getBundleExtra("enterMainUIScreenProjectParams");
            if (booleanExtra && bundleExtra != null) {
                this.f231763f.c(2);
                sj3.o3 o3Var = this.f231763f;
                o3Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231703o = bundleExtra;
                uj3.p pVar = o3Var.f490201b;
                if (pVar != null) {
                    pVar.x(bundleExtra, -1);
                }
                if (!this.f231763f.d()) {
                    this.f231761d.a();
                    if (z17) {
                        this.f231764g.n();
                        return;
                    } else {
                        this.f231762e.i(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t);
                        this.f231762e.j();
                        return;
                    }
                }
                if (z17) {
                    this.f231764g.b();
                    this.f231764g.c();
                } else {
                    this.f231762e.c();
                    this.f231761d.a();
                    this.f231762e.H.setVisibility(4);
                    this.f231762e.f(true);
                    this.f231762e.d();
                    this.f231762e.h();
                }
                this.f231778x = false;
                setRequestedOrientation(4);
                return;
            }
        }
        int ordinal = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231709s.ordinal();
        if (ordinal == 1) {
            this.f231762e.d();
            if (z17) {
                this.f231764g.c();
            }
            this.f231761d.b(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t);
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(this)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.aj().a(this);
            } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(this) || com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(this)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.l2 aj6 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.aj();
                if (!aj6.f231570a) {
                    aj6.f231570a = true;
                    p21.i.b(this, com.p314xaae8f345.mm.R.C30867xcad56011.h2k, null);
                }
            }
            if (this.f231766i) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().U(false);
            }
        } else if (ordinal == 2 || ordinal == 3) {
            this.f231761d.a();
            if (z17) {
                this.f231764g.n();
            } else {
                this.f231762e.i(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t);
            }
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(this)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.aj().a(this);
            } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(this) || com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(this)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.l2 aj7 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.aj();
                if (!aj7.f231570a) {
                    aj7.f231570a = true;
                    p21.i.b(this, com.p314xaae8f345.mm.R.C30867xcad56011.h2k, null);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().U(true);
        } else if (ordinal == 4) {
            if (this.f231763f.d()) {
                this.f231761d.a();
                if (z17) {
                    this.f231764g.c();
                } else {
                    this.f231762e.f(true);
                    this.f231762e.d();
                }
            } else {
                this.f231761d.a();
                if (z17) {
                    this.f231764g.n();
                } else {
                    this.f231762e.i(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t);
                    this.f231762e.j();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().I();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        if (V6() && this.f231765h) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().a0(102);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231701m = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231702n = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().Z(1, true);
        }
        if (!this.f231777w && !this.f231778x && !this.f231779y && this.f231765h && !this.f231771q && !this.f231774t) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().C(false);
        }
        super.onStop();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z
    public void p() {
        sj3.a5 a5Var = this.f231762e;
        if (a5Var != null) {
            if (this.f231772r) {
                this.f231764g.o(5);
            } else {
                a5Var.p(5);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z
    public void p0(int i17, int i18) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16587x33e31ed c16587x33e31ed;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().y()) {
            if (!this.f231772r) {
                sj3.a5 a5Var = this.f231762e;
                boolean g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.o2.g(i18);
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b c16586x7058535b = a5Var.f489968y;
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.j jVar = a5Var.f489953g;
                if (!g17) {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.o2.g(i17)) {
                        c16586x7058535b.m67074xdd7d58e5(false);
                        jVar.l(c01.z1.r(), 0);
                        android.view.View view = a5Var.f489966w;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "onVideoStateChange", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "onVideoStateChange", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    a5Var.v(false);
                } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.o2.g(i18) && !com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.o2.g(i17)) {
                    c16586x7058535b.m67074xdd7d58e5(true);
                    jVar.l(c01.z1.r(), 1);
                    android.view.View view2 = a5Var.f489966w;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "onVideoStateChange", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic", "onVideoStateChange", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    a5Var.x();
                }
                java.util.HashSet hashSet = new java.util.HashSet(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231707q);
                if (i18 == 1 || i18 == 3) {
                    if (i18 == 1 || i18 == 3) {
                        if (!(i17 == 1 || i17 == 3)) {
                            a5Var.l(hashSet);
                        }
                    }
                } else {
                    if (i17 == 1 || i17 == 3) {
                        jVar.getClass();
                        sj3.d dVar = jVar.f231542i;
                        if (dVar != null && (copyOnWriteArrayList = dVar.f489993e) != null) {
                            java.util.Iterator it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                java.lang.String usrName = ((aj3.c) it.next()).f86836a.f153145d;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(usrName, "usrName");
                                sj3.j g18 = jVar.g(usrName);
                                if (g18 != null && (c16587x33e31ed = g18.f490110d) != null) {
                                    if (!((c16587x33e31ed.getF231877m() == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c01.z1.r(), c16587x33e31ed.getF231877m())) ? false : true)) {
                                        c16587x33e31ed = null;
                                    }
                                    if (c16587x33e31ed != null) {
                                        if (hashSet.contains(c16587x33e31ed.getF231877m())) {
                                            if (c16587x33e31ed.status == sj3.c5.f489987d) {
                                                jVar.l(c16587x33e31ed.getF231877m(), 1);
                                            }
                                        } else {
                                            jVar.l(c16587x33e31ed.getF231877m(), 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            X6();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z
    public void p3() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkMainUI", "onExitMultiTalk");
        this.f231771q = true;
        zi3.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J;
        if (fVar != null) {
            fVar.I(false, 1);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5716x51d5635f c5716x51d5635f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5716x51d5635f();
        c5716x51d5635f.f136037g.f87792a = 0;
        c5716x51d5635f.e();
        this.f231768n.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.n(this));
        sj3.o3 o3Var = this.f231763f;
        if (o3Var != null) {
            o3Var.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Di().L(null, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().C = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi().f231649h = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().X();
        zi3.f fVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J;
        if (fVar2 != null) {
            fVar2.G();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri();
        zi3.f fVar3 = Ri.f231693J;
        if (fVar3 != null) {
            fVar3.R();
        }
        ((java.util.ArrayDeque) Ri.K.f231578a).clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi().f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Di().R();
        finish();
    }

    public void q2(java.util.List devices) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0 b0Var = this.f231775u;
        b0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(devices, "devices");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkUIViewModel", "onExternalDeviceChanged: " + devices);
        b0Var.f231793h.mo7808x76db6cb1(devices);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z
    public void r2() {
        if (!V6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkMainUI", "onMiniMultiTalk");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5716x51d5635f c5716x51d5635f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5716x51d5635f();
            c5716x51d5635f.f136037g.f87792a = 0;
            c5716x51d5635f.e();
            if (this.f231772r) {
                this.f231764g.c();
            } else {
                this.f231762e.k(true, false);
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231709s == sj3.e4.Inviting) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().X();
            }
            finish();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().C = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.wi().f231649h = null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(yi3.d.class);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z
    public void v4() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MT.MultiTalkMainUI", "onCameraError");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 b17 = p21.i.b(this, com.p314xaae8f345.mm.R.C30867xcad56011.kcm, new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.o(this));
        if (!b17.isShowing()) {
            b17.show();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().Z(1, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231701m);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z
    public void x5() {
        X6();
        int ordinal = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231709s.ordinal();
        if (ordinal == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().b();
            this.f231761d.b(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t);
        } else if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().b();
            if (this.f231772r) {
                return;
            }
            this.f231762e.i(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t);
        }
    }
}
