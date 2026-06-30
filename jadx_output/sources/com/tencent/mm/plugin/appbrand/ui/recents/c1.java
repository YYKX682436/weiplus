package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public final class c1 extends androidx.recyclerview.widget.k3 implements android.view.View.OnCreateContextMenuListener, db5.t4, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f90045d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f90046e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f90047f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f90048g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f90049h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f90050i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f90051m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f90052n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f90053o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList f90054p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList, android.view.View view) {
        super(view);
        this.f90054p = appBrandLauncherRecentsList;
        this.f90045d = view.findViewById(com.tencent.mm.R.id.d0v);
        this.f90046e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.l5_);
        this.f90047f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.mgb);
        this.f90048g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.nx7);
        this.f90049h = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cjl);
        this.f90050i = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h5n);
        this.f90051m = view.findViewById(com.tencent.mm.R.id.f487087ng4);
        this.f90052n = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.oim);
        this.f90053o = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.f486782mg5);
        view.setOnClickListener(this);
        new com.tencent.mm.plugin.appbrand.ui.recents.w0(this, this.itemView.getContext()).j(this.itemView, this, this);
    }

    public com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo i() {
        try {
            com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90054p;
            return (com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) appBrandLauncherRecentsList.f90016y.x(appBrandLauncherRecentsList.f90013w.g1(this));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandLauncherRecentsList", e17, "getAppInfo", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.appbrand.appusage.o2 o2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo i17 = i();
        if (i17 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90054p;
        if (appBrandLauncherRecentsList.getActivity() == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = 1001;
        appBrandStatObject.f87791g = "" + (ne.s.b(i17.D, 6) ? 1 : 0) + ":" + (ne.s.a(i17.F, 6) ? 1 : 0);
        int i18 = appBrandLauncherRecentsList.f89367e;
        if (i18 == 10) {
            appBrandStatObject.f87788d = 11;
        } else if (i18 == 11) {
            appBrandStatObject.f87788d = 12;
        } else if (i18 == 13) {
            appBrandStatObject.f87788d = 13;
        }
        int g17 = appBrandLauncherRecentsList.f90013w.g1(this);
        com.tencent.mm.plugin.appbrand.ui.recents.c2 c2Var = appBrandLauncherRecentsList.C;
        com.tencent.mm.autogen.mmdata.rpt.WAMainFrameEnterHistoryListExposeStruct wAMainFrameEnterHistoryListExposeStruct = c2Var.f90058d;
        java.lang.String str = i17.f76362e;
        if (wAMainFrameEnterHistoryListExposeStruct != null) {
            wAMainFrameEnterHistoryListExposeStruct.f61977f = 2L;
            wAMainFrameEnterHistoryListExposeStruct.f61978g = g17;
            str = str;
            wAMainFrameEnterHistoryListExposeStruct.f61979h = wAMainFrameEnterHistoryListExposeStruct.b("ClickAppid", str, true);
            com.tencent.mm.autogen.mmdata.rpt.WAMainFrameEnterHistoryListExposeStruct wAMainFrameEnterHistoryListExposeStruct2 = c2Var.f90058d;
            wAMainFrameEnterHistoryListExposeStruct2.f61980i = wAMainFrameEnterHistoryListExposeStruct2.b("ClickAppidName", i17.f76365h, true);
            c2Var.f90058d.f61981j = i17.B ? 1L : 0L;
        }
        com.tencent.mm.plugin.appbrand.report.AppBrandLauncherDesktopReporter a17 = com.tencent.mm.plugin.appbrand.report.n0.f88122d.a(appBrandLauncherRecentsList.getActivity());
        int g18 = appBrandLauncherRecentsList.f90013w.g1(this);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
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
        objArr[6] = java.lang.Long.valueOf(a17.f87773d);
        g0Var.d(19468, objArr);
        com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI.e7(appBrandLauncherRecentsList.getActivity(), i17.f76355w, i17.f76362e, null, i17.A, -1, appBrandStatObject, null, null);
        if (appBrandLauncherRecentsList.getActivity() != null && (appBrandLauncherRecentsList.getActivity() instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI) && (o2Var = ((com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI) appBrandLauncherRecentsList.getActivity()).f89363h) != null) {
            o2Var.f76534a[7] = "1";
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo i17 = i();
        if (i17 == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90054p;
        if (appBrandLauncherRecentsList.f90001i) {
            if (i17.B) {
                contextMenu.add(0, 1, 0, this.itemView.getContext().getString(com.tencent.mm.R.string.f490332s1));
            } else {
                if (!appBrandLauncherRecentsList.P || appBrandLauncherRecentsList.Q == 1) {
                    contextMenu.add(0, 1, 0, this.itemView.getContext().getString(com.tencent.mm.R.string.f490328rx));
                }
            }
        }
        contextMenu.add(0, 2, 0, this.itemView.getContext().getString(com.tencent.mm.R.string.f490188nd));
        if (dj1.a.a()) {
            contextMenu.add(0, 3, 0, this.itemView.getContext().getString(com.tencent.mm.R.string.f492357g70));
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            contextMenu.add(0, 4, 0, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490334s3));
            contextMenu.add(0, 5, 0, "半屏 & 普通胶囊模式启动小程序 (测试)");
        }
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo i18 = i();
        if (i18 == null || menuItem == null || this.f90054p.getActivity() == null) {
            return;
        }
        int i19 = this.f90054p.getActivity().getIntent().getIntExtra("extra_get_usage_reason", 3) != 9 ? 1 : 7;
        if (i19 == 7) {
            str = com.tencent.mm.plugin.appbrand.report.y0.f88430b;
        } else {
            if (android.text.TextUtils.isEmpty(this.f90054p.N)) {
                this.f90054p.N = com.tencent.mm.plugin.appbrand.report.y0.a();
            }
            str = this.f90054p.N;
        }
        if (1 == menuItem.getItemId()) {
            com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f90054p;
            if (!appBrandLauncherRecentsList.f90002m) {
                com.tencent.mm.plugin.appbrand.ui.recents.o1 o1Var = appBrandLauncherRecentsList.f90017z;
                synchronized (o1Var) {
                    arrayList = o1Var.f90134d;
                }
                int size = arrayList.size();
                com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList2 = this.f90054p;
                if (size >= appBrandLauncherRecentsList2.f90000h && !i18.B) {
                    if (appBrandLauncherRecentsList2.getActivity() != null) {
                        db5.e1.E(this.f90054p.getActivity(), this.f90054p.getResources().getString(com.tencent.mm.R.string.f490102ky, java.lang.Integer.valueOf(this.f90054p.f90000h)), "", this.f90054p.getResources().getString(com.tencent.mm.R.string.f490507x1), false, null);
                        return;
                    }
                    return;
                }
            }
            this.f90054p.A.post(new com.tencent.mm.plugin.appbrand.ui.recents.a1(this, i18, i19, str));
            this.f90054p.I.f90029u = true;
            return;
        }
        if (2 == menuItem.getItemId()) {
            if (i18.B) {
                com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList3 = this.f90054p;
                if (!appBrandLauncherRecentsList3.f90002m) {
                    appBrandLauncherRecentsList3.A.post(new com.tencent.mm.plugin.appbrand.ui.recents.b1(this, i18, i19, str));
                }
            }
            com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList4 = this.f90054p;
            appBrandLauncherRecentsList4.f90017z.remove(appBrandLauncherRecentsList4.f90013w.g1(this));
            com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList5 = this.f90054p;
            appBrandLauncherRecentsList5.I.f90029u = true;
            appBrandLauncherRecentsList5.T.f90149a.I.f90028t = true;
            appBrandLauncherRecentsList5.f90016y.notifyItemRemoved(appBrandLauncherRecentsList5.f90013w.g1(this));
            com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.s0(this.f90054p);
            com.tencent.mm.plugin.appbrand.appusage.o6.a(i18.f76355w, i18.f76362e, i18.A, null);
        }
        if (3 == menuItem.getItemId()) {
            java.lang.String str2 = i18.f76358z == 4 ? "game" : "mp";
            java.lang.String[] strArr = {i18.f76362e, i18.f76361d};
            java.util.Map map = com.tencent.mm.plugin.appbrand.keylogger.b0.f84129a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (int i27 = 0; i27 < 2; i27++) {
                sb6.append(strArr[i27]);
                if (i27 != 1) {
                    sb6.append("|");
                }
            }
            sb6.append(".*");
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile(sb6.toString());
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context, com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity.class);
            intent.addFlags(268435456);
            intent.putExtra("process", com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.class);
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
            android.content.Context context2 = this.f90054p.getContext();
            java.lang.String str3 = i18.f76355w;
            k91.z5 z5Var = new k91.z5();
            z5Var.f305863a = i18.f76362e;
            z5Var.f305872j = 3;
            com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.V6(context2, str3, 3, "", true, z5Var.a(), null, null);
            return;
        }
        if (5 == menuItem.getItemId()) {
            l81.b1 b1Var = new l81.b1();
            b1Var.f317012a = i18.f76361d;
            b1Var.f317014b = i18.f76362e;
            b1Var.f317016c = i18.f76363f;
            com.tencent.mm.plugin.appbrand.config.l lVar = new com.tencent.mm.plugin.appbrand.config.l();
            lVar.f77542v = true;
            lVar.G = false;
            lVar.f77531k = k91.t2.f305766d;
            lVar.f77527g = true;
            lVar.K = k91.v2.f305790d;
            lVar.f77521a = true;
            lVar.f77520J = true;
            lVar.C = true;
            lVar.H = true;
            lVar.E = false;
            lVar.f77533m = false;
            lVar.f77546z = false;
            lVar.B = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479706d1);
            lVar.f77522b = com.tencent.mm.ui.bk.n(0.75f);
            lVar.f77536p = k91.y2.f305827d;
            lVar.f77532l = true;
            lVar.I = false;
            b1Var.G = lVar.a();
            b1Var.f317032k = 1001;
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f90054p.getActivity(), b1Var);
        }
    }
}
