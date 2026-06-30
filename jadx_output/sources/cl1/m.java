package cl1;

/* loaded from: classes8.dex */
public class m implements cl1.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView f42886a;

    public m(com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView appBrandDesktopView) {
        this.f42886a = appBrandDesktopView;
    }

    @Override // cl1.k0
    public void a(float f17, float f18) {
    }

    @Override // cl1.k0
    public void b(java.lang.Object obj, int i17) {
        cl1.n0 n0Var;
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo;
        if (obj == null || (localUsageInfo = (n0Var = (cl1.n0) obj).f42888a) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopView", "AppBrandDesktopView removeUsage username: %s, versionType: %d", localUsageInfo.f76361d, java.lang.Integer.valueOf(localUsageInfo.f76363f));
        com.tencent.mm.plugin.appbrand.widget.recent.j1 c17 = com.tencent.mm.plugin.appbrand.widget.recent.v.f92067a.c();
        if (c17 != null) {
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo2 = n0Var.f42888a;
            if (c17.x0(localUsageInfo2.f76361d, localUsageInfo2.f76363f)) {
                com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView appBrandDesktopView = this.f42886a;
                com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.g1(appBrandDesktopView, false);
                appBrandDesktopView.f91082f2.D(false, n0Var, i17, false, 2);
                appBrandDesktopView.f91099w2 = true;
            }
        }
    }

    @Override // cl1.k0
    public void c(int i17, int i18, java.lang.Object obj) {
        int i19 = com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.f91080h0;
        com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView appBrandDesktopView = this.f42886a;
        appBrandDesktopView.getClass();
        boolean z17 = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopView", "reorderCollection %d", 0);
        if (appBrandDesktopView.f91083g2.e() == 2) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i27 = 0;
            while (true) {
                java.util.ArrayList arrayList2 = appBrandDesktopView.f91084h2;
                if (i27 >= arrayList2.size()) {
                    break;
                }
                com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = ((cl1.n0) arrayList2.get(i27)).f42888a;
                if (localUsageInfo != null) {
                    arrayList.add(localUsageInfo);
                }
                i27++;
            }
            com.tencent.mm.plugin.appbrand.widget.recent.h a17 = com.tencent.mm.plugin.appbrand.widget.recent.v.f92067a.a();
            if (a17 != null && !(z17 = a17.Lg(arrayList, 0))) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandDesktopView", "reorederCollection failed, needProcessResult: %b");
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopView", "collection reorderCollection result: %b, startPos: %d, endPos: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        cl1.n0 n0Var = (cl1.n0) obj;
        if (i17 != i18) {
            appBrandDesktopView.f91082f2.b(n0Var.f42888a, i17 - 1, i18 - 1);
        }
        appBrandDesktopView.k1();
        appBrandDesktopView.f91099w2 = z17;
    }

    @Override // cl1.k0
    public void d(java.lang.Object obj, int i17) {
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo;
        if (obj != null && (obj instanceof cl1.n0)) {
            cl1.n0 n0Var = (cl1.n0) obj;
            if (n0Var.f42889b != 2 || (localUsageInfo = n0Var.f42888a) == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopView", "desktop removeCollection %s", localUsageInfo.f76365h);
            com.tencent.mm.plugin.appbrand.widget.recent.h a17 = com.tencent.mm.plugin.appbrand.widget.recent.v.f92067a.a();
            if (a17 == null) {
                return;
            }
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo2 = n0Var.f42888a;
            if (a17.nh(localUsageInfo2.f76361d, localUsageInfo2.f76363f)) {
                com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView appBrandDesktopView = this.f42886a;
                com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.g1(appBrandDesktopView, false);
                appBrandDesktopView.f91082f2.D(false, n0Var, i17, true, 3);
                appBrandDesktopView.k1();
                appBrandDesktopView.f91099w2 = true;
            }
        }
    }

    @Override // cl1.k0
    public void e(java.lang.Object obj) {
        if (obj instanceof cl1.n0) {
            com.tencent.mm.plugin.appbrand.widget.recent.h a17 = com.tencent.mm.plugin.appbrand.widget.recent.v.f92067a.a();
            cl1.n0 n0Var = (cl1.n0) obj;
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = n0Var.f42888a;
            if (a17 == null || localUsageInfo == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopView", "desktop addCollection %s", localUsageInfo.f76365h);
            int Dc = a17.Dc(localUsageInfo.f76361d, localUsageInfo.f76363f);
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView appBrandDesktopView = this.f42886a;
            if (Dc == 0) {
                com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.g1(appBrandDesktopView, true);
                appBrandDesktopView.f91082f2.D(true, n0Var, 0, true, 2);
                return;
            }
            if (Dc == -2) {
                com.tencent.mm.ui.widget.dialog.j0 y17 = db5.e1.y(appBrandDesktopView.getContext(), appBrandDesktopView.getContext().getResources().getString(com.tencent.mm.R.string.f490102ky, java.lang.Integer.valueOf(((com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class)).y7())), "", appBrandDesktopView.getContext().getResources().getString(com.tencent.mm.R.string.f490507x1), null);
                if (y17 != null) {
                    y17.o(true);
                    y17.setCanceledOnTouchOutside(false);
                    y17.show();
                    return;
                }
                return;
            }
            if (Dc != -3) {
                dp.a.makeText(appBrandDesktopView.getContext(), appBrandDesktopView.getContext().getString(com.tencent.mm.R.string.f490082ke), 0).show();
                return;
            }
            com.tencent.mm.ui.widget.dialog.j0 y18 = db5.e1.y(appBrandDesktopView.getContext(), appBrandDesktopView.getContext().getResources().getString(com.tencent.mm.R.string.f490038j6), "", appBrandDesktopView.getContext().getResources().getString(com.tencent.mm.R.string.f490507x1), null);
            if (y18 != null) {
                y18.o(true);
                y18.setCanceledOnTouchOutside(false);
                y18.show();
            }
        }
    }

    @Override // cl1.k0
    public void f(int i17, boolean z17, boolean z18) {
    }
}
