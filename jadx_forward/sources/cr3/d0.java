package cr3;

/* loaded from: classes11.dex */
public class d0 implements android.view.MenuItem.OnMenuItemClickListener, db5.o4, db5.t4, i35.e {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f303464d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f303465e;

    /* renamed from: f, reason: collision with root package name */
    public int f303466f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f303467g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f303469i;

    /* renamed from: h, reason: collision with root package name */
    public boolean f303468h = false;

    /* renamed from: m, reason: collision with root package name */
    public android.app.ProgressDialog f303470m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f303471n = true;

    public d0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        this.f303464d = abstractActivityC21394xb3d2c0cf;
        this.f303465e = z3Var;
        this.f303466f = abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("Contact_Scene", 9);
        this.f303467g = abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("Contact_FMessageCard", false);
    }

    public static void a(cr3.d0 d0Var) {
        al5.f3 f3Var = d0Var.f303464d;
        if (f3Var instanceof l75.z0) {
            ((l75.z0) f3Var).g(0, null, d0Var.f303465e.d1());
        }
    }

    public static void b(cr3.d0 d0Var, boolean z17) {
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17;
        d0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14553, 2, 2, d0Var.f303465e.d1());
        java.lang.String d17 = d0Var.f303465e.d1();
        boolean M = c01.e2.M(d17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileMenuManager", "dealDelContactEvent() called isClearRecord:%s ctName:%s isGroupCard:%s", java.lang.Boolean.valueOf(z17), d17, java.lang.Boolean.valueOf(M));
        d0Var.f303465e.n1("");
        d0Var.f303465e.d3("");
        d0Var.f303465e.O2(null);
        java.lang.String a17 = i21.q.h().a(d17);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(a17);
        if (r6Var.m() && r6Var.y() && (s17 = com.p314xaae8f345.mm.vfs.w6.s(a17, true)) != null) {
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : s17) {
                if (x1Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileMenuManager", "deleteUselessFiles: %s", x1Var.f294765b);
                    x1Var.a();
                }
            }
        }
        java.lang.String d18 = d0Var.f303465e.d1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileMenuManager", "removeNoSeeHimeBlackTag, userName: %s.", d18);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r2) p94.w0.f()).P0(d18, 5L)) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(d18);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5845xa0f7b469 c5845xa0f7b469 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5845xa0f7b469();
            am.oo ooVar = c5845xa0f7b469.f136154g;
            ooVar.f89103e = linkedList;
            ooVar.f89099a = 2;
            ooVar.f89100b = 5L;
            ooVar.f89101c = 1;
            c5845xa0f7b469.e();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileMenuManager", "removeNoSeeHimeBlackTag, is no InTagList, userName: %s.", d18);
        }
        if (M) {
            d0Var.f303465e.s3();
            ((e21.z0) c01.d9.b().w()).c(new e21.l(d17, true));
            ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).k(d17);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).y0(d17);
            return;
        }
        d0Var.f303469i = false;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = d0Var.f303464d;
        d0Var.f303470m = db5.e1.Q(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new cr3.i(d0Var));
        java.lang.String wi6 = d0Var.f303469i ? null : ((ng0.o) ((og0.n) i95.n0.c(og0.n.class))).wi(d0Var.f303465e.d1());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wi6)) {
            d0Var.f(d17, z17);
        } else {
            d0Var.f303470m.dismiss();
            db5.e1.L(abstractActivityC21394xb3d2c0cf, false, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575058kl3, wi6), null, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fs8), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.boj), new cr3.j(d0Var), new cr3.k(d0Var, d17, z17), -1, com.p314xaae8f345.mm.R.C30859x5a72f63.f560155ch);
        }
    }

    @Override // i35.e
    public void K0(java.lang.String str, int i17, r45.g25 g25Var) {
        r61.a h17;
        android.app.ProgressDialog progressDialog = this.f303470m;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f303470m = null;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f303464d;
        if (i17 == 0) {
            if (!str.equals(this.f303465e.d1())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ProfileMenuManager", "not current contact %s,%s", this.f303465e.d1(), str);
                return;
            }
            if (this.f303466f == 13 && (h17 = m61.k.wi().h(str)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.f474338u)) {
                h17.f474332o = 1;
                m61.k.wi().j(h17.e(), h17);
            }
            if (this.f303466f == 9) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileMenuManager", "add scene unkown, check the contact getsource: " + this.f303465e.m43619x2fa78b11());
                int m43619x2fa78b11 = this.f303465e.m43619x2fa78b11();
                if (m43619x2fa78b11 == 10 || m43619x2fa78b11 == 13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileMenuManager", "delete the system contact info added by wechat");
                }
            }
            int intExtra = abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("Kdel_from", -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileMenuManager", "deleteContact() called with: delFrom:%d mIsClearRecord:%s", java.lang.Integer.valueOf(intExtra), java.lang.Boolean.valueOf(this.f303471n));
            if (intExtra == 0 && this.f303471n) {
                android.content.Intent intent = new android.content.Intent();
                intent.addFlags(67108864);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.u(intent, abstractActivityC21394xb3d2c0cf);
            } else {
                abstractActivityC21394xb3d2c0cf.setResult(-1, abstractActivityC21394xb3d2c0cf.getIntent().putExtra("_delete_ok_", true));
                abstractActivityC21394xb3d2c0cf.finish();
            }
            if (this.f303468h) {
                i();
            }
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mf7);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            if (e4Var.f293307a == null) {
                e4Var.f293307a = e4Var.a();
            }
            android.view.Window window = e4Var.f293307a.getWindow();
            if (window != null) {
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    window.setType(2038);
                } else {
                    window.setType(2002);
                }
                window.addFlags(524288);
                com.p314xaae8f345.mm.ui.yk.a("dialog", "show top window not null!!", new java.lang.Object[0]);
            }
            e4Var.f293307a.show();
            int i19 = e4Var.f293313g;
            if (i19 == 0 || i19 == 1) {
                new android.os.Handler().postDelayed(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c4(e4Var), 2000);
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g25Var.f456374d)) {
            db5.e1.s(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571901t1), "");
        } else {
            db5.e1.s(abstractActivityC21394xb3d2c0cf, g25Var.f456374d, g25Var.f456375e);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518216i, vg3.b.f518179f, vg3.c.f518189h, i17, new java.util.ArrayList(java.util.Collections.singletonList(str))));
    }

    public void c() {
        ((br3.f) ((fc0.e) i95.n0.c(fc0.e.class))).Bi(this.f303465e, this.f303464d, false);
    }

    public void d() {
        c01.g8 g8Var;
        boolean o27 = this.f303465e.o2();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f303464d;
        if (!o27) {
            android.view.View inflate = android.view.View.inflate(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30864xbddafb2a.bxs, null);
            inflate.setPadding(0, 0, 0, 0);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jlf);
            textView.setPadding(0, 0, 0, 0);
            textView.setText(com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(this.f303465e.d1()) ? com.p314xaae8f345.mm.R.C30867xcad56011.bfe : com.p314xaae8f345.mm.R.C30867xcad56011.bfd);
            android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.jld);
            checkBox.setChecked(false);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jle);
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bff);
            if (this.f303465e.m43619x2fa78b11() == 18) {
                checkBox.setVisibility(0);
                textView2.setVisibility(0);
            } else {
                checkBox.setVisibility(8);
                textView2.setVisibility(8);
            }
            db5.e1.I(abstractActivityC21394xb3d2c0cf, false, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bfc), inflate, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new cr3.p(this, checkBox), new cr3.q(this));
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f303465e;
        iz5.a.g(null, z3Var != null);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
        if (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            n17 = z3Var;
        }
        n17.r3();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1())) {
            vg3.e4 e4Var = (vg3.e4) i95.n0.c(vg3.e4.class);
            java.lang.String d17 = z3Var.d1();
            ((np.h) e4Var).getClass();
            op.c cVar = new op.c(true);
            cVar.a(new p41.w(d17, 2));
            g8Var = cVar;
        } else {
            g8Var = np.b.c(n17);
        }
        if (g8Var != null) {
            ((java.util.ArrayList) ((op.a) g8Var).f428749a).add(new np.a(z3Var));
        }
        if (g8Var != null) {
            op.a aVar = (op.a) g8Var;
            ((java.util.ArrayList) aVar.f428751c).add(new cr3.u(this));
            ((op.c) aVar).b(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, false, null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518216i, vg3.b.f518178e, vg3.c.f518191m, 0, new java.util.ArrayList(java.util.Collections.singletonList(this.f303465e.d1()))));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(abstractActivityC21394xb3d2c0cf.getIntent(), 14, 2, this.f303465e.d1());
    }

    public void e() {
        java.lang.Class cls = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_set_default_chatonly, 0) == 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16863xc0e4ffb5.class : com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16864x5bbaf71d.class;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f303464d;
        android.content.Intent intent = new android.content.Intent(abstractActivityC21394xb3d2c0cf, (java.lang.Class<?>) cls);
        intent.putExtra("sns_permission_userName", this.f303465e.d1());
        if (abstractActivityC21394xb3d2c0cf.getIntent() != null) {
            android.content.Intent intent2 = abstractActivityC21394xb3d2c0cf.getIntent();
            gr3.l[] lVarArr = gr3.l.f356425d;
            intent.putExtra("entry_50321_path", intent2.getIntExtra("entry_50321_path", 2));
            intent.putExtra("CONTACT_INFO_UI_SOURCE", abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 0));
        }
        intent.putExtra("sns_permission_anim", true);
        intent.putExtra("sns_permission_block_scene", 1);
        intent.putExtra("INTENT_SOURCE_FROM_PROFILE_MENU", true);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f303464d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(abstractActivityC21394xb3d2c0cf2, arrayList.toArray(), "com/tencent/mm/plugin/profile/logic/ProfileMenuManager", "dealSnsPermission", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        abstractActivityC21394xb3d2c0cf2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(abstractActivityC21394xb3d2c0cf2, "com/tencent/mm/plugin/profile/logic/ProfileMenuManager", "dealSnsPermission", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(java.lang.String str, boolean z17) {
        r61.a h17;
        if ((str == null || r26.n0.N(str)) == false) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349();
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("delete_contact", kz5.c1.l(new jz5.l("chat_name", str), new jz5.l("is_include_chat_history", java.lang.Integer.valueOf(z17 ? 1 : 0)), new jz5.l("BeDeleteUinType", java.lang.Integer.valueOf((com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(str)) ? 2 : (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(str)) ? 0 : 1))), 35602);
            }
        }
        boolean m47 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileMenuManager", "deleteContact() called with: ctName:%s, isClearRecord:%s, isOpenIM:%s", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(m47));
        this.f303471n = z17;
        this.f303465e.s3();
        if (m47) {
            this.f303465e.j3(0);
            ((np.h) ((vg3.e4) i95.n0.c(vg3.e4.class))).wi(str);
            if (z17) {
                c01.w9.h(str, new cr3.l(this));
                ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).k(str);
            }
            ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
            com.p314xaae8f345.mm.p957x53236a1b.g1.I(str, 15);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).p0(str, this.f303465e);
            if (this.f303466f == 13 && (h17 = m61.k.wi().h(str)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.f474338u)) {
                h17.f474332o = 1;
                m61.k.wi().j(h17.e(), h17);
            }
            if (this.f303466f == 9) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileMenuManager", "add scene unkown, check the contact getsource: " + this.f303465e.m43619x2fa78b11());
                int m43619x2fa78b11 = this.f303465e.m43619x2fa78b11();
                if (m43619x2fa78b11 == 10 || m43619x2fa78b11 == 13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileMenuManager", "delete the system contact info added by wechat");
                }
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f303464d;
            if (abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("Kdel_from", -1) == 0 && this.f303471n) {
                android.content.Intent intent = new android.content.Intent();
                intent.addFlags(67108864);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.u(intent, abstractActivityC21394xb3d2c0cf);
            } else {
                abstractActivityC21394xb3d2c0cf.setResult(-1, abstractActivityC21394xb3d2c0cf.getIntent().putExtra("_delete_ok_", true));
                abstractActivityC21394xb3d2c0cf.finish();
            }
        } else {
            ((aq1.n) ((i35.g) gm0.j1.s(i35.g.class))).a(str, z17);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518216i, vg3.b.f518178e, vg3.c.f518189h, 0, new java.util.ArrayList(java.util.Collections.singletonList(str))));
    }

    public final void g(boolean z17) {
        this.f303468h = z17;
        boolean M = c01.e2.M(this.f303465e.d1());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileMenuManager", "deleteInner() called with: isNeedComplaint = [" + z17 + "] isGroupCard:%s", java.lang.Boolean.valueOf(M));
        if (M) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f303464d;
            android.view.View inflate = android.view.View.inflate(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30864xbddafb2a.bxs, null);
            inflate.setPadding(0, 0, 0, 0);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jlf);
            textView.setPadding(0, 0, 0, 0);
            textView.setText(c01.e2.M(this.f303465e.d1()) ? abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572575bo4, this.f303465e.g2()) : abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572572bo1, this.f303465e.g2()));
            android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.jld);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jle);
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bff);
            checkBox.setVisibility(8);
            textView2.setVisibility(8);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f303464d;
            db5.e1.J(abstractActivityC21394xb3d2c0cf2, true, abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572494bd5), inflate, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new cr3.b0(this), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f560155ch);
        } else {
            java.lang.String string = this.f303464d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ndj, this.f303465e.g2());
            java.lang.String string2 = this.f303464d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ndi);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(this.f303465e.d1())) {
                string2 = j62.e.g().j("clicfg_weclaw_delete_desc", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oag), true, true);
            }
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.s7(this.f303464d, this.f303465e.d1(), string, string2, this.f303464d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ayt), this.f303464d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ndm), new cr3.a0(this));
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(this.f303465e.d1())) {
            int intExtra = this.f303464d.getIntent().getIntExtra("chat_from_scene", 0);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("chat_name", this.f303465e.d1());
            hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(intExtra)));
            hashMap.put("view_id", "yuanbao_addrbook_delete");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cr3.d0.h():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cr3.d0.i():void");
    }

    public void j(int i17) {
        java.lang.String str = "";
        r61.a aVar = null;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f303464d;
        switch (i17) {
            case 1:
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(this.f303465e.d1())) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("FROM_CHATBOT", true);
                    intent.putExtra("CHATBOT_USERNAME", this.f303465e.d1());
                    intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17441xe7fa79c.class);
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f303464d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(abstractActivityC21394xb3d2c0cf, arrayList.toArray(), "com/tencent/mm/plugin/profile/logic/ProfileMenuManager", "onItemClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    abstractActivityC21394xb3d2c0cf.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(abstractActivityC21394xb3d2c0cf, "com/tencent/mm/plugin/profile/logic/ProfileMenuManager", "onItemClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (this.f303465e.r2()) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("Contact_Scene", this.f303466f);
                    intent2.putExtra("Contact_User", this.f303465e.d1());
                    intent2.putExtra("Contact_RoomNickname", context.getIntent().getStringExtra("Contact_RoomNickname"));
                    intent2.putExtra("key_label_click_source", context.getIntent().getIntExtra("key_label_click_source", 0));
                    intent2.putExtra("contact_phone_number_list", this.f303465e.E1);
                    if (!this.f303465e.p2()) {
                        java.lang.String stringExtra = context.getIntent().getStringExtra("Contact_Mobile_MD5");
                        java.lang.String stringExtra2 = context.getIntent().getStringExtra("Contact_full_Mobile_MD5");
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f303465e.d1())) {
                                aVar = m61.k.wi().h(this.f303465e.d1());
                            }
                        } else if ((!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) && ((aVar = m61.k.wi().i(stringExtra)) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.e()))) {
                            aVar = m61.k.wi().i(stringExtra2);
                        }
                        if (aVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.e())) {
                            java.lang.String f17 = aVar.f();
                            if (f17 == null) {
                                f17 = "";
                            }
                            str = f17.replace(" ", "");
                        }
                    }
                    intent2.putExtra("contact_phone_number_by_md5", str);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.m(intent2, context);
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f303465e.d1())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ProfileMenuManager", "mod stranger remark, username is null");
                } else {
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("Contact_Scene", this.f303466f);
                    intent3.putExtra("Contact_mode_name_type", 0);
                    intent3.putExtra("Contact_ModStrangerRemark", true);
                    intent3.putExtra("Contact_User", this.f303465e.d1());
                    intent3.putExtra("Contact_Nick", this.f303465e.P0());
                    intent3.putExtra("Contact_RemarkName", this.f303465e.w0());
                    intent3.putExtra("Contact_RoomNickname", context.getIntent().getStringExtra("Contact_RoomNickname"));
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.y(intent3, context);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(context.getIntent(), 8, 1, this.f303465e.d1());
                return;
            case 2:
                if (this.f303465e.t2()) {
                    c01.e2.y0(this.f303465e);
                    db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572540bj5));
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518216i, vg3.b.f518178e, vg3.c.f518193o, 0, new java.util.ArrayList(java.util.Collections.singletonList(this.f303465e.d1()))));
                } else {
                    c01.e2.o0(this.f303465e);
                    db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bdk));
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518216i, vg3.b.f518178e, vg3.c.f518192n, 0, new java.util.ArrayList(java.util.Collections.singletonList(this.f303465e.d1()))));
                }
                this.f303465e = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(this.f303465e.d1(), true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(context.getIntent(), 10, 1, this.f303465e.d1());
                return;
            case 3:
                e();
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(context.getIntent(), 11, 1, this.f303465e.d1());
                return;
            case 4:
                c();
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(context.getIntent(), 9, 1, this.f303465e.d1());
                return;
            case 5:
                d();
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(context.getIntent(), 32, this.f303465e.o2() ? 3 : 2, this.f303465e.d1());
                return;
            case 6:
                ((aq1.n) ((i35.g) gm0.j1.s(i35.g.class))).c(this);
                ((java.util.ArrayList) ((aq1.n) ((i35.g) gm0.j1.s(i35.g.class))).f94603d).add(this);
                boolean z17 = this.f303465e.m43619x2fa78b11() == 18;
                int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
                boolean z18 = ((i18 == 788529167 || i18 == 788529166) || z65.c.a()) && bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2533xb4860a9e.C20211xb9c8a6a7()) == 1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileMenuManager", "deleteContact() called isLBS:%s forceLBS:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
                if (!z17 && !z18) {
                    g(false);
                    return;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) context, false, 1);
                k0Var.f293405n = new cr3.y(this);
                k0Var.f293414s = new cr3.z(this);
                k0Var.v();
                return;
            case 7:
                this.f303465e.getClass();
                cr3.m mVar = new cr3.m(this);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutUtil", "addShortCut()");
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getBoolean("no_more_show_add_short_cut_dialog", false);
                android.util.Pair j17 = xp1.d.j(context, null, z19, false, new xp1.h(context));
                xp1.c.j(context, this.f303465e.d1());
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new xp1.i(mVar, context, j17, z19));
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(context.getIntent(), 15, 1, this.f303465e.d1());
                return;
            case 8:
            case 11:
            case 12:
            default:
                return;
            case 9:
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(this.f303465e.d1())) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    java.lang.String str2 = "{\"scene\":" + (this.f303465e.r2() ? com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5 : 152) + "}";
                    bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
                    bundle.putString("query", str2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileMenuManager", "doChatbotComplaint open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9");
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(this.f303464d, bundle, true, false, new cr3.n(this));
                } else {
                    i();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(context.getIntent(), 25, 1, this.f303465e.d1());
                return;
            case 10:
                q41.f.a(this.f303465e.d1(), 12, 0);
                c();
                return;
            case 13:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileMenuManager", "dealSendCardFromCard");
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f27 = pt0.f0.f2(context.getIntent().getStringExtra("key_msg_talker"), context.getIntent().getLongExtra("key_msg_id", -1L));
                if (f27 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ProfileMenuManager", "SendCardFromCard: msgInfo is null");
                    return;
                }
                if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.p(f27)) {
                    db5.e1.y(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fef), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), null);
                    return;
                }
                if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.q(f27)) {
                    db5.e1.y(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.feg), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), null);
                    return;
                }
                android.content.Intent intent4 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
                intent4.putExtra("Retr_Msg_content", f27.U1());
                intent4.putExtra("Retr_Msg_Type", 8);
                intent4.putExtra("Retr_Msg_Id", f27.m124847x74d37ac6());
                intent4.putExtra("Retr_MsgTalker", f27.Q0());
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f303464d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(abstractActivityC21394xb3d2c0cf2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/logic/ProfileMenuManager", "dealSendCardFromCard", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                abstractActivityC21394xb3d2c0cf2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(abstractActivityC21394xb3d2c0cf2, "com/tencent/mm/plugin/profile/logic/ProfileMenuManager", "dealSendCardFromCard", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            case 14:
                try {
                    android.content.Intent intent5 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17379xdc3f7e5f.class);
                    intent5.putExtra("USERNAME", this.f303465e.d1());
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf3 = this.f303464d;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(intent5);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(abstractActivityC21394xb3d2c0cf3, arrayList3.toArray(), "com/tencent/mm/plugin/profile/logic/ProfileMenuManager", "onItemClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    abstractActivityC21394xb3d2c0cf3.startActivity((android.content.Intent) arrayList3.get(0));
                    yj0.a.f(abstractActivityC21394xb3d2c0cf3, "com/tencent/mm/plugin/profile/logic/ProfileMenuManager", "onItemClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProfileMenuManager", "start PreviewHdHeadImg error");
                    return;
                }
            case 15:
                db5.e1.A(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcu), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new cr3.x(this, this.f303465e.d1()), null);
                return;
            case 16:
                java.lang.String username = this.f303465e.d1();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
                android.content.Intent intent6 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22353x5623e3da.class);
                intent6.putExtra("extra_username", username);
                pf5.j0.a(intent6, ry4.d1.class);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(intent6);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(context, arrayList4.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUI", "start", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList4.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUI", "start", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
    
        if ("3552365301".equals(r6.f303465e.Q0()) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ff, code lost:
    
        if (r6.f303465e.r2() != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012e  */
    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo887xc459429a(db5.g4 r7) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cr3.d0.mo887xc459429a(db5.g4):void");
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        j(menuItem.getItemId());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00cc, code lost:
    
        if (r12 == false) goto L14;
     */
    @Override // android.view.MenuItem.OnMenuItemClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onMenuItemClick(android.view.MenuItem r12) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cr3.d0.onMenuItemClick(android.view.MenuItem):boolean");
    }
}
