package b52;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile b52.a f18076d;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f18079c = null;

    /* renamed from: a, reason: collision with root package name */
    public final b52.c f18077a = new g52.b();

    /* renamed from: b, reason: collision with root package name */
    public final b52.e f18078b = new i52.k();

    public a() {
        c52.a aVar = c52.b.f38643a;
        if (b52.b.m()) {
            aVar.a(0, -1L);
            aVar.a(1, -1L);
        }
        f52.c.b();
        h52.c.a();
        v52.c.g();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.ActivityBundleDao", "ActivityBundleDao reset");
        if (b52.b.m()) {
            c52.c.d("hell_ac_ble_mmkv_key", new byte[0]);
        }
        try {
            c52.c.d("mmkv_key_page_se_dao", new byte[0]);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.PageStateDao", e17, "PageStateDao writeBack", new java.lang.Object[0]);
        }
    }

    public static b52.a a() {
        if (f18076d == null) {
            synchronized (b52.a.class) {
                if (f18076d == null) {
                    f18076d = new b52.a();
                }
            }
        }
        return f18076d;
    }

    public void b(r45.z43 z43Var) {
        i52.k kVar = (i52.k) this.f18078b;
        kVar.getClass();
        r45.bn6 bn6Var = z43Var.f391687d;
        java.lang.String str = z43Var.f391688e;
        int i17 = z43Var.f391690g;
        long j17 = z43Var.f391689f;
        if (bn6Var == null || android.text.TextUtils.isEmpty(bn6Var.f370900d)) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentMonitor", "_onFragmentPause, Biz");
            e42.h0 h0Var = kVar.f288490b;
            if (h0Var != null) {
                ((a52.d) h0Var).a("Biz", str, i17, j17);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentMonitor", "_onPause: %s, %s", bn6Var.f370900d, str);
        f52.c.b().f(bn6Var.f370900d, str, i17);
        if (str.equals("com.tencent.mm.ui.MoreTabUI")) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, _onPause-1");
            j52.c c17 = j52.c.c();
            int i18 = c17.f297800b;
            if (i18 == 1 || i18 == -1) {
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, _onPause-2");
            } else if (i18 == 0) {
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentMonitor", "StoryGalleryView, _onPause");
                c17.f297800b = -1;
                e42.h0 h0Var2 = kVar.f288490b;
                if (h0Var2 != null) {
                    ((a52.d) h0Var2).c(3, j17);
                    return;
                }
                return;
            }
        }
        e42.h0 h0Var3 = kVar.f288490b;
        if (h0Var3 != null) {
            ((a52.d) h0Var3).a(bn6Var.f370900d, str, i17, j17);
        }
    }

    public void c(r45.a53 a53Var) {
        e42.h0 h0Var;
        i52.k kVar = (i52.k) this.f18078b;
        kVar.getClass();
        java.lang.String str = a53Var.f369733e;
        if (!android.text.TextUtils.isEmpty(str)) {
            i52.e.b("Chat_User", str);
        }
        r45.bn6 bn6Var = a53Var.f369732d;
        java.lang.String str2 = a53Var.f369735g;
        int i17 = a53Var.f369738m;
        boolean z17 = a53Var.f369736h;
        long j17 = a53Var.f369737i;
        if (bn6Var == null) {
            e42.h0 h0Var2 = kVar.f288490b;
            if (h0Var2 != null) {
                ((a52.d) h0Var2).b("Biz", str2, i17, j17);
                return;
            }
            return;
        }
        if (android.text.TextUtils.isEmpty(bn6Var.f370900d)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentMonitor", "_onResume: %s, %s", bn6Var.f370900d, str2);
        f52.c.b().g(bn6Var.f370900d, str2, i17);
        if ("com.tencent.mm.ui.MoreTabUI".equals(str2)) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, onResume-1");
            int i18 = j52.c.c().f297800b;
            if (i18 == 1 || i18 == -1) {
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, _onResume-2");
            } else if (i18 == 0) {
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentMonitor", "StoryGalleryView, _onResume: %b", java.lang.Boolean.valueOf(z17));
                if (!z17 || (h0Var = kVar.f288490b) == null) {
                    return;
                }
                ((a52.d) h0Var).d(2, j17);
                return;
            }
        }
        e42.h0 h0Var3 = kVar.f288490b;
        if (h0Var3 != null) {
            ((a52.d) h0Var3).b(bn6Var.f370900d, str2, i17, j17);
        }
    }
}
