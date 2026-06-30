package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public final class c1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 implements android.view.View.OnCreateContextMenuListener, db5.t4, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f171578d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f171579e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f171580f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f171581g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f171582h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f171583i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f171584m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f171585n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f171586o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 f171587p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90, android.view.View view) {
        super(view);
        this.f171587p = c12723x5ab2de90;
        this.f171578d = view.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        this.f171579e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.l5_);
        this.f171580f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.mgb);
        this.f171581g = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.nx7);
        this.f171582h = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cjl);
        this.f171583i = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h5n);
        this.f171584m = view.findViewById(com.p314xaae8f345.mm.R.id.f568620ng4);
        this.f171585n = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.oim);
        this.f171586o = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.f568315mg5);
        view.setOnClickListener(this);
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.w0(this, this.f3639x46306858.getContext()).j(this.f3639x46306858, this, this);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 i() {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90 = this.f171587p;
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) c12723x5ab2de90.f171549y.x(c12723x5ab2de90.f171546w.g1(this));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandLauncherRecentsList", e17, "getAppInfo", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.o2 o2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 i17 = i();
        if (i17 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90 = this.f171587p;
        if (c12723x5ab2de90.mo7430x19263085() == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        c12559xbdae8559.f169323f = 1001;
        c12559xbdae8559.f169324g = "" + (ne.s.b(i17.D, 6) ? 1 : 0) + ":" + (ne.s.a(i17.F, 6) ? 1 : 0);
        int i18 = c12723x5ab2de90.f170900e;
        if (i18 == 10) {
            c12559xbdae8559.f169321d = 11;
        } else if (i18 == 11) {
            c12559xbdae8559.f169321d = 12;
        } else if (i18 == 13) {
            c12559xbdae8559.f169321d = 13;
        }
        int g17 = c12723x5ab2de90.f171546w.g1(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c2 c2Var = c12723x5ab2de90.C;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7036xbdc787dd c7036xbdc787dd = c2Var.f171591d;
        java.lang.String str = i17.f157895e;
        if (c7036xbdc787dd != null) {
            c7036xbdc787dd.f143510f = 2L;
            c7036xbdc787dd.f143511g = g17;
            str = str;
            c7036xbdc787dd.f143512h = c7036xbdc787dd.b("ClickAppid", str, true);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7036xbdc787dd c7036xbdc787dd2 = c2Var.f171591d;
            c7036xbdc787dd2.f143513i = c7036xbdc787dd2.b("ClickAppidName", i17.f157898h, true);
            c2Var.f171591d.f143514j = i17.B ? 1L : 0L;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12557xaff9f077 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.n0.f169655d.a(c12723x5ab2de90.mo7430x19263085());
        int g18 = c12723x5ab2de90.f171546w.g1(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = 6;
        objArr[1] = "";
        objArr[2] = "";
        objArr[3] = java.lang.Integer.valueOf(g18);
        if (str == null) {
            str = "";
        }
        objArr[4] = str;
        objArr[5] = "";
        objArr[6] = java.lang.Long.valueOf(a17.f169306d);
        g0Var.d(19468, objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9.e7(c12723x5ab2de90.mo7430x19263085(), i17.f157888w, i17.f157895e, null, i17.A, -1, c12559xbdae8559, null, null);
        if (c12723x5ab2de90.mo7430x19263085() != null && (c12723x5ab2de90.mo7430x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da) && (o2Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da) c12723x5ab2de90.mo7430x19263085()).f170896h) != null) {
            o2Var.f158067a[7] = "1";
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 i17 = i();
        if (i17 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90 = this.f171587p;
        if (c12723x5ab2de90.f171534i) {
            if (i17.B) {
                contextMenu.add(0, 1, 0, this.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571865s1));
            } else {
                if (!c12723x5ab2de90.P || c12723x5ab2de90.Q == 1) {
                    contextMenu.add(0, 1, 0, this.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571861rx));
                }
            }
        }
        contextMenu.add(0, 2, 0, this.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571721nd));
        if (dj1.a.a()) {
            contextMenu.add(0, 3, 0, this.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573890g70));
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            contextMenu.add(0, 4, 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571867s3));
            contextMenu.add(0, 5, 0, "半屏 & 普通胶囊模式启动小程序 (测试)");
        }
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 i18 = i();
        if (i18 == null || menuItem == null || this.f171587p.mo7430x19263085() == null) {
            return;
        }
        int i19 = this.f171587p.mo7430x19263085().getIntent().getIntExtra("extra_get_usage_reason", 3) != 9 ? 1 : 7;
        if (i19 == 7) {
            str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.y0.f169963b;
        } else {
            if (android.text.TextUtils.isEmpty(this.f171587p.N)) {
                this.f171587p.N = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.y0.a();
            }
            str = this.f171587p.N;
        }
        if (1 == menuItem.getItemId()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90 = this.f171587p;
            if (!c12723x5ab2de90.f171535m) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.o1 o1Var = c12723x5ab2de90.f171550z;
                synchronized (o1Var) {
                    arrayList = o1Var.f171667d;
                }
                int size = arrayList.size();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de902 = this.f171587p;
                if (size >= c12723x5ab2de902.f171533h && !i18.B) {
                    if (c12723x5ab2de902.mo7430x19263085() != null) {
                        db5.e1.E(this.f171587p.mo7430x19263085(), this.f171587p.m7460x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571635ky, java.lang.Integer.valueOf(this.f171587p.f171533h)), "", this.f171587p.m7460x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), false, null);
                        return;
                    }
                    return;
                }
            }
            this.f171587p.A.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.a1(this, i18, i19, str));
            this.f171587p.I.f171562u = true;
            return;
        }
        if (2 == menuItem.getItemId()) {
            if (i18.B) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de903 = this.f171587p;
                if (!c12723x5ab2de903.f171535m) {
                    c12723x5ab2de903.A.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.b1(this, i18, i19, str));
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de904 = this.f171587p;
            c12723x5ab2de904.f171550z.remove(c12723x5ab2de904.f171546w.g1(this));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de905 = this.f171587p;
            c12723x5ab2de905.I.f171562u = true;
            c12723x5ab2de905.T.f171682a.I.f171561t = true;
            c12723x5ab2de905.f171549y.m8155x27702c4(c12723x5ab2de905.f171546w.g1(this));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90.s0(this.f171587p);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.o6.a(i18.f157888w, i18.f157895e, i18.A, null);
        }
        if (3 == menuItem.getItemId()) {
            java.lang.String str2 = i18.f157891z == 4 ? "game" : "mp";
            java.lang.String[] strArr = {i18.f157895e, i18.f157894d};
            java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.b0.f165662a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (int i27 = 0; i27 < 2; i27++) {
                sb6.append(strArr[i27]);
                if (i27 != 1) {
                    sb6.append("|");
                }
            }
            sb6.append(".*");
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile(sb6.toString());
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.ActivityC12308x8b10b259.class);
            intent.addFlags(268435456);
            intent.putExtra("process", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.class);
            intent.putExtra("category", str2);
            intent.putExtra("session_id_prefix", compile);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyser", "analyse", "(Ljava/lang/Class;Ljava/lang/String;Ljava/util/regex/Pattern;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyser", "analyse", "(Ljava/lang/Class;Ljava/lang/String;Ljava/util/regex/Pattern;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (4 == menuItem.getItemId()) {
            android.content.Context mo7438x76847179 = this.f171587p.mo7438x76847179();
            java.lang.String str3 = i18.f157888w;
            k91.z5 z5Var = new k91.z5();
            z5Var.f387396a = i18.f157895e;
            z5Var.f387405j = 3;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12663x79416297.V6(mo7438x76847179, str3, 3, "", true, z5Var.a(), null, null);
            return;
        }
        if (5 == menuItem.getItemId()) {
            l81.b1 b1Var = new l81.b1();
            b1Var.f398545a = i18.f157894d;
            b1Var.f398547b = i18.f157895e;
            b1Var.f398549c = i18.f157896f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l();
            lVar.f159075v = true;
            lVar.G = false;
            lVar.f159064k = k91.t2.f387299d;
            lVar.f159060g = true;
            lVar.K = k91.v2.f387323d;
            lVar.f159054a = true;
            lVar.f159053J = true;
            lVar.C = true;
            lVar.H = true;
            lVar.E = false;
            lVar.f159066m = false;
            lVar.f159079z = false;
            lVar.B = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1);
            lVar.f159055b = com.p314xaae8f345.mm.ui.bk.n(0.75f);
            lVar.f159069p = k91.y2.f387360d;
            lVar.f159065l = true;
            lVar.I = false;
            b1Var.G = lVar.a();
            b1Var.f398565k = 1001;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(this.f171587p.mo7430x19263085(), b1Var);
        }
    }
}
