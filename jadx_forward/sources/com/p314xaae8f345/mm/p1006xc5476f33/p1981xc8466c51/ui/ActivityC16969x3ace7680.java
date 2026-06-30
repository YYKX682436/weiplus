package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgFileUI */
/* loaded from: classes9.dex */
public class ActivityC16969x3ace7680 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements zs3.t {
    public static final long G = ip.c.k();
    public static final /* synthetic */ int H = 0;
    public boolean E;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f236818d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f236819e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f236820f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.C21405x85fc1ce0 f236821g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f236822h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f236823i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ProgressBar f236824m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f236825n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f236826o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f236827p;

    /* renamed from: s, reason: collision with root package name */
    public long f236830s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f236831t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f236832u;

    /* renamed from: v, reason: collision with root package name */
    public r45.gp0 f236833v;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f236835x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16084xdca2b46a f236836y;

    /* renamed from: z, reason: collision with root package name */
    public bt3.b2 f236837z;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f236828q = null;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f236829r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();

    /* renamed from: w, reason: collision with root package name */
    public boolean f236834w = false;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public final com.p314xaae8f345.mm.p947xba6de98f.c1 F = new com.p314xaae8f345.mm.p947xba6de98f.c1() { // from class: com.tencent.mm.plugin.record.ui.RecordMsgFileUI$$a
        @Override // com.p314xaae8f345.mm.p947xba6de98f.c1
        public final void a(int i17, com.p314xaae8f345.mm.p947xba6de98f.d1 d1Var) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680.H;
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 activityC16969x3ace7680 = com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680.this;
            activityC16969x3ace7680.getClass();
            if (d1Var.f152441d.equals(activityC16969x3ace7680.f236832u)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgFileUI", "CdnMediaListener %s %s %s", java.lang.Long.valueOf(activityC16969x3ace7680.f236830s), java.lang.Integer.valueOf(i17), d1Var.f152441d);
                zs3.y z17 = bt3.g2.z(d1Var);
                z17.f68328x10a0fed7 = i17 != 1 ? i17 != 2 ? i17 != 3 ? 1 : 4 : 3 : 2;
                activityC16969x3ace7680.B0(0, z17);
            }
        }
    };

    @Override // zs3.t
    public void B0(int i17, zs3.y yVar) {
        if (yVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgFileUI", "on cdn info changed, but cdn info is null");
            return;
        }
        if (this.f236832u.equals(yVar.f68324xaca5bdda)) {
            int i18 = yVar.f68328x10a0fed7;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f236829r;
            if (i18 == 2) {
                n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.y0(this));
                Z6(yVar, true);
                b7(0, 2);
                jx3.f.INSTANCE.mo68477x336bdfd8(1203L, 5L, this.f236833v.R, false);
                return;
            }
            if (i18 == 3) {
                n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.a1(this));
                Z6(yVar, false);
                b7(1, 4);
            } else {
                if (i18 != 4) {
                    c7(yVar);
                    return;
                }
                Z6(yVar, false);
                n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.z0(this));
                b7(1, 3);
            }
        }
    }

    public final int T6() {
        int i17 = this.f236833v.I;
        if (i17 == 15) {
            return 4;
        }
        if (i17 == 10130) {
            return 8;
        }
        return i17;
    }

    public final java.lang.String U6() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(bt3.g2.H(this.f236833v, this.f236831t, this.f236830s, 1));
        if (r6Var.m()) {
            return r6Var.o();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(c01.d9.b().e());
        sb6.append("web/");
        java.lang.String str = this.f236833v.G;
        if (str == null) {
            str = "";
        }
        sb6.append(kk.k.g(str.getBytes()));
        return sb6.toString();
    }

    public final void V6() {
        this.f236820f.setVisibility(8);
        this.f236818d.setVisibility(8);
        this.f236819e.setVisibility(8);
        this.f236823i.setVisibility(8);
        android.view.View view = this.f236826o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initDownloadingStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initDownloadingStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c7(((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).D0(this.f236832u));
    }

    public final void W6() {
        r45.jp0 jp0Var;
        if (this.f236836y.getFileStatus() != 1) {
            this.f236836y.mo65014x87c0aa90(1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16084xdca2b46a abstractC16084xdca2b46a = this.f236836y;
            java.lang.String t17 = bt3.g2.t(this.f236833v, this.f236831t, this.f236830s, 1);
            if (t17 == null) {
                t17 = "";
            }
            abstractC16084xdca2b46a.mo65015xc5e6b9d6(t17);
            ((d73.i) i95.n0.c(d73.i.class)).Ja(this.f236836y);
            ((d73.i) i95.n0.c(d73.i.class)).Jc(this.f236836y);
        }
        if (T6() == 15 && (jp0Var = this.f236833v.O1) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jp0Var.f459531d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f236833v.O1.f459534g)) {
            this.B = true;
            this.f236821g.setVisibility(8);
            android.view.View view = this.f236826o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f236820f.setVisibility(8);
            this.f236818d.setVisibility(8);
            this.f236819e.setVisibility(8);
            this.f236823i.setVisibility(8);
            java.lang.String t18 = bt3.g2.t(this.f236833v, this.f236831t, this.f236830s, 1);
            fp.k.b();
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.oy7);
            this.f236828q = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n8.a(mo55332x76847179());
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            viewGroup.addView((android.view.View) this.f236828q, 0, layoutParams);
            this.f236828q.mo69326x360a109e(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.k1(this));
            fp.k.b();
            if (t18 != null) {
                this.f236828q.mo69303x360802();
                this.f236828q.mo69327xab3268fe(t18);
            }
            fp.k.b();
            if (c01.d9.c() != null) {
                ((com.p314xaae8f345.mm.p642xad8b531f.b) c01.d9.c()).a();
            }
        }
        if (T6() == 15 || T6() == 4) {
            if (this.B) {
                return;
            }
            android.view.View view2 = this.f236826o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f236820f.setVisibility(8);
            this.f236818d.setVisibility(8);
            this.f236819e.setVisibility(0);
            this.f236819e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cb9);
            this.f236823i.setVisibility(8);
            a7();
            return;
        }
        if (!this.f236834w) {
            android.view.View view3 = this.f236826o;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f236820f.setVisibility(4);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f236833v.A)) {
                this.f236818d.setVisibility(8);
            } else {
                this.f236818d.setVisibility(0);
            }
            this.f236819e.setVisibility(0);
            this.f236823i.setVisibility(0);
            return;
        }
        this.f236819e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572041x2);
        this.f236823i.setVisibility(8);
        android.view.View view4 = this.f236826o;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f236820f.setVisibility(8);
        this.f236819e.setVisibility(0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f236833v.A)) {
            this.f236818d.setVisibility(8);
        }
    }

    public final void X6() {
        this.f236820f.setVisibility(8);
        this.f236818d.setVisibility(8);
        this.f236819e.setVisibility(8);
        android.view.View view = this.f236826o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOutOfDateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOutOfDateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f236823i.setVisibility(0);
        if (this.f236833v.I == 4) {
            this.f236823i.setGravity(17);
            this.f236823i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cbv);
            return;
        }
        this.f236823i.setGravity(17);
        this.f236823i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cbu);
        if (this.E) {
            return;
        }
        this.E = true;
        b7(8, 6);
    }

    public final void Y6() {
        android.view.View view = this.f236826o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initWaitDownloadStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initWaitDownloadStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f236819e.setVisibility(8);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f236833v.A)) {
            this.f236818d.setVisibility(8);
        } else {
            this.f236818d.setVisibility(0);
        }
        this.f236820f.setVisibility(0);
        this.f236820f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cb7);
        this.f236823i.setVisibility(8);
    }

    public final void Z6(zs3.y yVar, boolean z17) {
        if (1 == yVar.f68334x2262335f) {
            int i17 = yVar.f68321xf1ebe47b;
            if ((i17 == 7 || i17 == 5) && this.D) {
                try {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.f236831t, java.lang.Long.valueOf(yVar.f68324xaca5bdda.split("@")[2]).longValue());
                    ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).wi(false, yVar.f68319xf604e54a, Li.I0(), z17, false, Li.Q0());
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    public final void a7() {
        if (this.C) {
            return;
        }
        this.C = true;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_detail_fav_path", bt3.g2.t(this.f236833v, this.f236831t, this.f236830s, 1));
        intent.putExtra("key_detail_fav_thumb_path", bt3.g2.H(this.f236833v, this.f236831t, this.f236830s, 1));
        intent.putExtra("key_detail_fav_video_duration", this.f236833v.f456981y);
        intent.putExtra("key_detail_statExtStr", this.f236833v.R1);
        intent.putExtra("key_detail_fav_video_scene_from", 1);
        intent.putExtra("key_detail_msg_uuid", this.f236833v.f456964q2);
        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
        o72.x1.L0(this, ".ui.detail.FavoriteVideoPlayUI", intent, null);
        finish();
    }

    public final void b7(int i17, int i18) {
        if (8 == T6()) {
            int i19 = this.f236833v.R > 26214400 ? 7 : 5;
            jx3.f.INSTANCE.mo68477x336bdfd8(1203L, i18, 1L, false);
            ct3.d.f303836a.c(this.f236835x, this.f236833v, 4, i19);
        }
    }

    public final void c7(zs3.y yVar) {
        long j17;
        int i17;
        long j18;
        if (yVar != null) {
            i17 = (int) ((((float) yVar.f68325x90a9378) / ((float) java.lang.Math.max(1L, yVar.f68330xeb1a61d6))) * 100.0f);
            j18 = yVar.f68325x90a9378;
            j17 = yVar.f68330xeb1a61d6;
        } else {
            j17 = (int) this.f236833v.R;
            i17 = 0;
            j18 = 0;
        }
        this.f236829r.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.x0(this, i17, j18, j17));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.acx;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.f(this, i17, i18, intent, true, com.p314xaae8f345.mm.R.C30867xcad56011.brq, com.p314xaae8f345.mm.R.C30867xcad56011.brr, 5);
        if (i18 == -1 && i17 == 1001) {
            java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("custom_send_text") : null;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(mo55332x76847179(), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.cax), true, false, null);
            T6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l1 l1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l1(this, Q);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                return;
            }
            java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","));
            if (T6() == 4 || T6() == 15) {
                gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.m1(this, P1, stringExtra2, l1Var));
            } else {
                gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.w0(this, P1, stringExtra2, l1Var));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013d  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f236828q;
        if (f4Var != null) {
            f4Var.mo69326x360a109e(null);
            this.f236828q.mo69303x360802();
            this.f236828q.mo69312x3f5eee52();
            if (c01.d9.c() != null) {
                ((com.p314xaae8f345.mm.p642xad8b531f.b) c01.d9.c()).b();
            }
        }
        super.onDestroy();
        ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).P0(this);
        ((rx.j) ((sx.c0) i95.n0.c(sx.c0.class))).Bi(this.F);
        if (this.f236836y != null) {
            ((d73.i) i95.n0.c(d73.i.class)).a9(this.f236836y);
        }
        this.f236837z.g();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f236828q;
        if (f4Var != null) {
            f4Var.mo69303x360802();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f236828q;
        if (f4Var != null) {
            f4Var.mo69330x68ac462();
        }
    }
}
