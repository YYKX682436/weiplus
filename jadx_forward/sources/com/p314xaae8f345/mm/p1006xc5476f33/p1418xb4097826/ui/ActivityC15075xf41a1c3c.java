package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/c9;", "Lcom/tencent/mm/plugin/finder/ui/tl;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI */
/* loaded from: classes2.dex */
public final class ActivityC15075xf41a1c3c extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13937x4755f3c9<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c9, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.tl> {
    public static final /* synthetic */ int M = 0;
    public int A;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g G;
    public int H;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f210292J;
    public android.view.View K;
    public boolean L;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.tl f210294v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c9 f210295w;

    /* renamed from: x, reason: collision with root package name */
    public long f210296x;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f210293u = "Finder.FinderShareFeedDetailUI";

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f210297y = "";

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f210298z = "";
    public final int B = 2;
    public java.lang.String C = "";
    public final jz5.g D = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ki(this));
    public final jz5.g E = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.li(this));
    public boolean F = true;
    public final boolean I = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        return 25;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    public int Y6() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13937x4755f3c9
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0 c7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.tl tlVar = this.f210294v;
        if (tlVar != null) {
            return tlVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13937x4755f3c9
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c9 c9Var = this.f210295w;
        if (c9Var != null) {
            return c9Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13937x4755f3c9
    public void e7() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f8e);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.mss);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.K = findViewById;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13937x4755f3c9
    public void f7() {
        fc2.c n17;
        fc2.c n18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17;
        this.f210296x = getIntent().getLongExtra("feed_object_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("feed_encrypted_object_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f210297y = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("feed_object_nonceId");
        this.f210298z = stringExtra2 != null ? stringExtra2 : "";
        this.A = getIntent().getIntExtra("report_scene", 0);
        this.C = getIntent().getStringExtra("from_user");
        this.F = getIntent().getBooleanExtra("key_show_jump_entry", true);
        this.H = getIntent().getIntExtra("key_source_comment_scene", 0);
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_like_buffer");
        if (stringExtra3 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3)) {
            this.G = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(stringExtra3));
        }
        if (this.f210296x == 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f210297y)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f210293u, "objectId " + this.f210296x + ", encryptedObjectId " + this.f210297y + ", finish");
            finish();
        }
        boolean z17 = !this.I;
        int i17 = this.B;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.tl tlVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.tl(i17, this, z17);
        this.f210294v = tlVar;
        this.f210295w = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c9(this, tlVar, this.B, 25, z17);
        long j17 = this.f210296x;
        if (j17 != 0 && (h17 = bu2.j.f106067a.h(j17)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 p17 = cu2.u.f303974a.p(h17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.tl tlVar2 = this.f210294v;
            if (tlVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            java.util.ArrayList arrayList = tlVar2.f187897u;
            if (arrayList != null) {
                arrayList.add(p17);
            }
        }
        if (this.A != 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1278L, 14L, 1L, false);
        }
        g7().N0(i17, 25, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.mi(this));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = mo55332x76847179 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar != null && (n18 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            n18.a(g7());
        }
        jz5.g gVar = this.E;
        zy2.h8 h8Var = (zy2.h8) ((jz5.n) gVar).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ni niVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ni(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c9 c9Var = this.f210295w;
        if (c9Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3) h8Var).N0(niVar, c9Var.m56068x4905e9fa());
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = mo55332x768471792 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x768471792).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar2 == null || (n17 = zy2.ra.n1(nyVar2, 0, 1, null)) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3 s3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3) ((zy2.h8) ((jz5.n) gVar).mo141623x754a37bb());
        s3Var.getClass();
        n17.a(s3Var);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 g7() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0) ((jz5.n) this.D).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570626b91;
    }

    public final void h7(java.lang.Integer num, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c9 c9Var = this.f210295w;
        if (c9Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        c9Var.m56068x4905e9fa().setVisibility(8);
        android.view.View view = this.K;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI", "showErrorUi", "(Ljava/lang/Integer;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI", "showErrorUi", "(Ljava/lang/Integer;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.K;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsLayout");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.cti);
        if (num != null && num.intValue() == -4011) {
            if (str != null) {
                if (!(str.length() == 0)) {
                    textView.setText(str);
                    return;
                }
            }
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cv_);
            return;
        }
        if (num != null && num.intValue() == -4033) {
            if (str != null) {
                if (!(str.length() == 0)) {
                    textView.setText(str);
                    return;
                }
            }
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cwu);
            return;
        }
        if (num == null || num.intValue() != -4036) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cv_);
            return;
        }
        if (str != null) {
            if (!(str.length() == 0)) {
                textView.setText(str);
                return;
            }
        }
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573602f45);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13937x4755f3c9, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        fc2.c n17;
        fc2.c n18;
        if (this.A != 0 && !this.L) {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
            long j17 = this.f210296x;
            int i17 = this.A;
            java.lang.String str = this.C;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = str;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = mo55332x76847179 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            o3Var.Rj(j17, i17, str2, 0, (r27 & 16) != 0 ? 0 : 0, (r27 & 32) != 0 ? null : nyVar != null ? nyVar.V6().m75945x2fec8307(1) : null, (r27 & 64) != 0 ? 0 : this.H, (r27 & 128) != 0 ? 0L : 0L, (r27 & 256) != 0 ? null : null);
            this.L = true;
        }
        g7().m56485x3f5eee52();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = mo55332x768471792 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x768471792).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar2 != null && (n18 = zy2.ra.n1(nyVar2, 0, 1, null)) != null) {
            n18.d(g7());
        }
        jz5.g gVar = this.E;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3) ((zy2.h8) ((jz5.n) gVar).mo141623x754a37bb())).m56497x3f5eee52();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471793 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471793, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar3 = mo55332x768471793 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x768471793).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar3 != null && (n17 = zy2.ra.n1(nyVar3, 0, 1, null)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3 s3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3) ((zy2.h8) ((jz5.n) gVar).mo141623x754a37bb());
            s3Var.getClass();
            n17.d(s3Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.tl tlVar = this.f210294v;
        if (tlVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        tlVar.mo979x3f5eee52();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13937x4755f3c9, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).Ai() && ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.O().r()).intValue() == 1) {
            h7(-4036, mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f7n));
            return;
        }
        long j17 = this.f210296x;
        java.lang.String str = this.f210298z;
        java.lang.String str2 = this.f210297y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        new db2.g4(j17, str, 25, 2, "", true, null, null, 0L, null, false, false, str2, nyVar != null ? nyVar.V6() : null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536858560, null).l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.pi(this));
    }
}
