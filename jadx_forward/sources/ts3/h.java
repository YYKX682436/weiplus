package ts3;

/* loaded from: classes9.dex */
public class h implements t25.a, l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f503202d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f503203e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f503204f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f503205g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f503206h;

    /* renamed from: i, reason: collision with root package name */
    public long f503207i;

    public h(android.content.Context context) {
        this.f503203e = context;
    }

    public static void a(boolean z17) {
        int o17 = c01.z1.o();
        gm0.j1.u().c().w(40, java.lang.Integer.valueOf(z17 ? o17 & (-1025) : o17 | 1024));
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.o(26, z17 ? 2 : 1));
    }

    @Override // t25.a
    public boolean Q(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17) {
        iz5.a.g(null, rVar != null);
        iz5.a.g(null, z3Var != null);
        iz5.a.g(null, com.p314xaae8f345.mm.p2621x8fb0427b.z3.w4(z3Var.d1()));
        gm0.j1.u().c().a(this);
        this.f503204f = z3Var;
        this.f503202d = rVar;
        this.f503207i = c01.z1.i();
        android.content.Context context = this.f503203e;
        if (context instanceof android.app.Activity) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15413, 16, "", "", "", "", "", 0, 0, ((android.app.Activity) context).getIntent().getStringExtra("reportSessionId"));
        }
        c();
        return true;
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((str == null ? "" : str).length() <= 0) {
            return false;
        }
        boolean equals = str.equals("contact_info_readerappnews_view");
        android.content.Context context = this.f503203e;
        if (equals) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152.class);
            intent.putExtra("type", 20);
            intent.setFlags(67108864);
            android.content.Context context2 = this.f503203e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/readerapp/ui/ContactWidgetReaderAppNews", "gotoViewReaderapp", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/readerapp/ui/ContactWidgetReaderAppNews", "gotoViewReaderapp", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (context instanceof android.app.Activity) {
                ((android.app.Activity) context).overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559413e4, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
            }
            ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
            return true;
        }
        if (str.equals("contact_info_readerappnews_subscribe")) {
            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16955xfbe54440.class);
            android.content.Context context3 = this.f503203e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context3, arrayList2.toArray(), "com/tencent/mm/plugin/readerapp/ui/ContactWidgetReaderAppNews", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context3, "com/tencent/mm/plugin/readerapp/ui/ContactWidgetReaderAppNews", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (str.equals("contact_info_readerappnews_help")) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("rawUrl", "https://ifeedback.qq.com/platform/feedback?app_id=1078&uin=test");
            intent3.putExtra("geta8key_scene", 79);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent3, null);
        }
        if (str.equals("contact_info_readerappnews_clear_data")) {
            db5.e1.A(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcv), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new ts3.c(this), null);
            return true;
        }
        if (str.equals("contact_info_readerappnews_recv_remind")) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f503202d).h(str);
            boolean z18 = (c01.z1.o() & 1024) == 0;
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15413, 6, "", "");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15413, 7, "", "");
            }
            if (c21541x1c1b08fe != null) {
                c21541x1c1b08fe.O(!z18);
            }
            a(!z18);
            return true;
        }
        if (str.equals("contact_info_readerappnews_top")) {
            if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f503202d).h(str)).N()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15413, 13);
                c01.e2.t0("newsapp", true, true);
                this.f503206h = true;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15413, 14);
                c01.e2.B0("newsapp", true, true);
                this.f503206h = false;
            }
            if (this.f503206h) {
                this.f503207i |= 8192;
            } else {
                this.f503207i &= -8193;
            }
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(this.f503207i));
            bn0.g.f104312a.g("USERINFO_EXT_STATUS2_LONG_SYNC", this.f503207i);
            int i17 = this.f503206h ? 1 : 2;
            r45.p53 p53Var = new r45.p53();
            p53Var.f464294d = 82;
            p53Var.f464295e = i17;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetReaderAppNews", "switch ext change : isTop open = " + this.f503206h + " item value = " + p53Var.f464295e + " functionId = " + p53Var.f464294d);
            return true;
        }
        if (!str.equals("contact_info_readerappnews_mute")) {
            if (str.equals("contact_info_readerappnews_install")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15413, 5, "", "");
                b(context, true, null);
                return true;
            }
            if (str.equals("contact_info_readerappnews_uninstall")) {
                db5.e1.A(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iws), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new ts3.d(this), null);
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetReaderAppNews", "handleEvent : unExpected key = ".concat(str));
            return false;
        }
        if (c01.e2.P(this.f503204f)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15413, 11);
            c01.e2.z0(this.f503204f, true);
            this.f503205g = false;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15413, 12);
            c01.e2.p0(this.f503204f, true);
            this.f503205g = true;
        }
        if (this.f503205g) {
            this.f503207i |= 4096;
        } else {
            this.f503207i &= -4097;
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(this.f503207i));
        bn0.g.f104312a.g("USERINFO_EXT_STATUS2_LONG_SYNC", this.f503207i);
        int i18 = this.f503205g ? 1 : 2;
        r45.p53 p53Var2 = new r45.p53();
        p53Var2.f464294d = 81;
        p53Var2.f464295e = i18;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetReaderAppNews", "switch ext change : isMute open = " + this.f503205g + " item value = " + p53Var2.f464295e + " functionId = " + p53Var2.f464294d);
        return true;
    }

    public void b(android.content.Context context, boolean z17, com.p314xaae8f345.mm.ui.z9 z9Var) {
        ((ku5.t0) ku5.t0.f394148d).k(new ts3.g(this, db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.iwq : com.p314xaae8f345.mm.R.C30867xcad56011.iww), true, true, null), new ts3.f(this, z17, context, z9Var)), 5000L);
    }

    public final void c() {
        int i17 = (c01.z1.n() & 524288) == 0 ? 1 : 0;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f503202d).t();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f503202d).g(com.p314xaae8f345.mm.R.xml.f576387z);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 c19708x15855336 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f503202d).h("contact_info_header_helper");
        c19708x15855336.M(this.f503204f.d1(), this.f503204f.g2(), this.f503203e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bgc));
        c19708x15855336.N(i17);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f503202d).h("contact_info_readerappnews_recv_remind");
        boolean z17 = (c01.z1.o() & 1024) == 0;
        if (c21541x1c1b08fe != null) {
            c21541x1c1b08fe.O(z17);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f503202d).h("contact_info_readerappnews_mute")).O(c01.e2.P(this.f503204f));
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f503202d).h("contact_info_readerappnews_top")).O(this.f503204f.w2());
        if (i17 != 0) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f503202d).w("contact_info_readerappnews_install");
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f503202d).w("contact_info_readerappnews_subscribe");
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f503202d).w("contact_info_readerappnews_view");
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f503202d).w("contact_info_readerappnews_help");
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f503202d).w("contact_info_readerappnews_clear_data");
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f503202d).w("contact_info_readerappnews_uninstall");
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f503202d).w("contact_info_readerappnews_recv_remind");
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f503202d).w("contact_info_readerappnews_mute");
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f503202d).w("contact_info_readerappnews_top");
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(obj, 0);
        if (a1Var != gm0.j1.u().c() || o17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetReaderAppNews", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
        } else if (o17 == 40 || o17 == 34 || o17 == 7) {
            c();
        }
    }

    @Override // t25.a
    /* renamed from: onActivityResult */
    public void mo67449x9d4787cb(int i17, int i18, android.content.Intent intent) {
    }

    @Override // t25.a
    /* renamed from: onDetach */
    public boolean mo67450x3f5eee52() {
        gm0.j1.u().c().e(this);
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        return true;
    }
}
