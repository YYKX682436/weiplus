package b52;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile b52.a f99609d;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f99612c = null;

    /* renamed from: a, reason: collision with root package name */
    public final b52.c f99610a = new g52.b();

    /* renamed from: b, reason: collision with root package name */
    public final b52.e f99611b = new i52.k();

    public a() {
        c52.a aVar = c52.b.f120176a;
        if (b52.b.m()) {
            aVar.a(0, -1L);
            aVar.a(1, -1L);
        }
        f52.c.b();
        h52.c.a();
        v52.c.g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.ActivityBundleDao", "ActivityBundleDao reset");
        if (b52.b.m()) {
            c52.c.d("hell_ac_ble_mmkv_key", new byte[0]);
        }
        try {
            c52.c.d("mmkv_key_page_se_dao", new byte[0]);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.PageStateDao", e17, "PageStateDao writeBack", new java.lang.Object[0]);
        }
    }

    public static b52.a a() {
        if (f99609d == null) {
            synchronized (b52.a.class) {
                if (f99609d == null) {
                    f99609d = new b52.a();
                }
            }
        }
        return f99609d;
    }

    public void b(r45.z43 z43Var) {
        i52.k kVar = (i52.k) this.f99611b;
        kVar.getClass();
        r45.bn6 bn6Var = z43Var.f473220d;
        java.lang.String str = z43Var.f473221e;
        int i17 = z43Var.f473223g;
        long j17 = z43Var.f473222f;
        if (bn6Var == null || android.text.TextUtils.isEmpty(bn6Var.f452433d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentMonitor", "_onFragmentPause, Biz");
            e42.h0 h0Var = kVar.f370023b;
            if (h0Var != null) {
                ((a52.d) h0Var).a("Biz", str, i17, j17);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentMonitor", "_onPause: %s, %s", bn6Var.f452433d, str);
        f52.c.b().f(bn6Var.f452433d, str, i17);
        if (str.equals("com.tencent.mm.ui.MoreTabUI")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, _onPause-1");
            j52.c c17 = j52.c.c();
            int i18 = c17.f379333b;
            if (i18 == 1 || i18 == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, _onPause-2");
            } else if (i18 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentMonitor", "StoryGalleryView, _onPause");
                c17.f379333b = -1;
                e42.h0 h0Var2 = kVar.f370023b;
                if (h0Var2 != null) {
                    ((a52.d) h0Var2).c(3, j17);
                    return;
                }
                return;
            }
        }
        e42.h0 h0Var3 = kVar.f370023b;
        if (h0Var3 != null) {
            ((a52.d) h0Var3).a(bn6Var.f452433d, str, i17, j17);
        }
    }

    public void c(r45.a53 a53Var) {
        e42.h0 h0Var;
        i52.k kVar = (i52.k) this.f99611b;
        kVar.getClass();
        java.lang.String str = a53Var.f451266e;
        if (!android.text.TextUtils.isEmpty(str)) {
            i52.e.b("Chat_User", str);
        }
        r45.bn6 bn6Var = a53Var.f451265d;
        java.lang.String str2 = a53Var.f451268g;
        int i17 = a53Var.f451271m;
        boolean z17 = a53Var.f451269h;
        long j17 = a53Var.f451270i;
        if (bn6Var == null) {
            e42.h0 h0Var2 = kVar.f370023b;
            if (h0Var2 != null) {
                ((a52.d) h0Var2).b("Biz", str2, i17, j17);
                return;
            }
            return;
        }
        if (android.text.TextUtils.isEmpty(bn6Var.f452433d)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentMonitor", "_onResume: %s, %s", bn6Var.f452433d, str2);
        f52.c.b().g(bn6Var.f452433d, str2, i17);
        if ("com.tencent.mm.ui.MoreTabUI".equals(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, onResume-1");
            int i18 = j52.c.c().f379333b;
            if (i18 == 1 || i18 == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, _onResume-2");
            } else if (i18 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentMonitor", "StoryGalleryView, _onResume: %b", java.lang.Boolean.valueOf(z17));
                if (!z17 || (h0Var = kVar.f370023b) == null) {
                    return;
                }
                ((a52.d) h0Var).d(2, j17);
                return;
            }
        }
        e42.h0 h0Var3 = kVar.f370023b;
        if (h0Var3 != null) {
            ((a52.d) h0Var3).b(bn6Var.f452433d, str2, i17, j17);
        }
    }
}
