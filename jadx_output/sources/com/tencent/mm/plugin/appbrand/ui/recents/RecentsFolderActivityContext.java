package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class RecentsFolderActivityContext extends com.tencent.mm.plugin.appbrand.ui.launcher.FolderActivityContextWithLifecycle {

    /* renamed from: d, reason: collision with root package name */
    public int f90018d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f90019e;

    /* renamed from: f, reason: collision with root package name */
    public int f90020f;

    public RecentsFolderActivityContext(com.tencent.mm.ui.MMActivity mMActivity) {
        super(mMActivity);
        this.f90020f = 0;
    }

    @Override // zj1.a
    public void H3(boolean z17) {
        com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment fragment;
        java.lang.Class cls = z17 ? com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.class : com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherBlankPage.class;
        androidx.fragment.app.Fragment findFragmentById = a().getSupportFragmentManager().findFragmentById(android.R.id.content);
        if ((findFragmentById != null && cls.isInstance(findFragmentById)) || a().isFinishing() || a().activityHasDestroyed() || a().isStopped()) {
            return;
        }
        androidx.fragment.app.i2 beginTransaction = a().getSupportFragmentManager().beginTransaction();
        if (z17) {
            fragment = new com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList(a() instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI);
        } else {
            java.lang.String string = getString(com.tencent.mm.R.string.f490115lc);
            java.lang.String string2 = getString(com.tencent.mm.R.string.f490186nb);
            com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherBlankPage appBrandLauncherBlankPage = new com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherBlankPage();
            android.os.Bundle bundle = new android.os.Bundle(2);
            bundle.putString("extra_title", string);
            bundle.putString("extra_tip", string2);
            appBrandLauncherBlankPage.setArguments(bundle);
            fragment = appBrandLauncherBlankPage;
        }
        fragment.o0(this.f90018d);
        fragment.f89368f = this.f90019e;
        beginTransaction.k(android.R.id.content, fragment, null);
        beginTransaction.d();
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.launcher.FolderActivityContextWithLifecycle
    public void b(android.content.Intent intent) {
        this.f90018d = intent.getIntExtra("extra_enter_scene", 1);
        this.f90019e = intent.getStringExtra("extra_enter_scene_note");
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.launcher.FolderActivityContextWithLifecycle
    public void onActivityDidResume() {
        boolean z17 = true;
        if (!(a() instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI)) {
            a().setMMTitle(com.tencent.mm.R.string.f490185na);
            int i17 = this.f90020f + 1;
            this.f90020f = i17;
            if (i17 == 1) {
                H3(true);
                return;
            }
            return;
        }
        if (!com.tencent.mm.plugin.appbrand.appusage.r0.c() && !com.tencent.mm.plugin.appbrand.appusage.r0.b()) {
            com.tencent.mm.plugin.appbrand.appusage.f2[] f2VarArr = com.tencent.mm.plugin.appbrand.appusage.f2.f76431d;
            int ordinal = (!gm0.j1.a() ? com.tencent.mm.plugin.appbrand.appusage.e2.FORCE_OFF : com.tencent.mm.plugin.appbrand.appusage.e2.FORCE_ON).ordinal();
            if (!(ordinal == 1 || (ordinal == 2 && gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_HAS_SEEN_NEARBY_SHOWCASE_BOOLEAN_SYNC, false)))) {
                if (com.tencent.mm.plugin.appbrand.appusage.e1.f76424a == null) {
                    synchronized (com.tencent.mm.plugin.appbrand.appusage.e1.class) {
                        if (com.tencent.mm.plugin.appbrand.appusage.e1.f76424a == null) {
                            com.tencent.mm.plugin.appbrand.appusage.e1.f76424a = new com.tencent.mm.plugin.appbrand.appusage.e1();
                        }
                    }
                }
                com.tencent.mm.plugin.appbrand.appusage.e1.f76424a.getClass();
                gm0.j1.a();
                z17 = false;
            }
        }
        H3(z17);
    }
}
