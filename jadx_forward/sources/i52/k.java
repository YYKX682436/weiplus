package i52;

/* loaded from: classes15.dex */
public final class k implements b52.e, b52.d {

    /* renamed from: b, reason: collision with root package name */
    public e42.h0 f370023b;

    /* renamed from: d, reason: collision with root package name */
    public final j52.a f370025d = new i52.j(this);

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f370024c = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final i52.i f370022a = new i52.i(this);

    public static boolean a(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, java.lang.String str) {
        try {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f17 = i52.l.f(activityC1102x9ee2d9f, str);
            int i17 = com.p314xaae8f345.mm.ui.C21417xe2e4fa74.B1;
            java.lang.reflect.Field declaredField = com.p314xaae8f345.mm.ui.C21417xe2e4fa74.class.getDeclaredField("storyGallery");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(f17);
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502.f253618l1;
            java.lang.reflect.Field declaredField2 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502.class.getDeclaredField("mIsActive");
            declaredField2.setAccessible(true);
            return ((java.lang.Boolean) declaredField2.get(obj)).booleanValue();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public void b(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, java.lang.String str, int i17, long j17, boolean z17) {
        if (z17) {
            r45.z43 z43Var = new r45.z43();
            r45.bn6 bn6Var = new r45.bn6();
            z43Var.f473220d = bn6Var;
            if (activityC1102x9ee2d9f != null) {
                bn6Var.f452433d = activityC1102x9ee2d9f.getClass().getCanonicalName();
                z43Var.f473220d.f452434e = activityC1102x9ee2d9f.hashCode();
                z43Var.f473220d.f452435f = j17;
            }
            z43Var.f473221e = str;
            z43Var.f473223g = i17;
            z43Var.f473222f = j17;
            if (activityC1102x9ee2d9f != null && "com.tencent.mm.ui.MoreTabUI".equals(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentMonitor", "stopStoryMonitor: %s", str);
                j52.c.c().b(activityC1102x9ee2d9f);
            }
            d52.d.a().d(6, z43Var);
        } else if (activityC1102x9ee2d9f == null && str == null) {
            r45.b2 e17 = f52.c.b().e();
            if (e17 != null) {
                java.lang.String str2 = e17.f451967d.f452433d;
                e42.h0 h0Var = this.f370023b;
                if (h0Var != null) {
                    ((a52.d) h0Var).a("Biz", str2, i17, j17);
                }
            }
        } else if (activityC1102x9ee2d9f != null) {
            java.lang.String canonicalName = activityC1102x9ee2d9f.getClass().getCanonicalName();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentMonitor", "_onPause: %s, %s", canonicalName, str);
            f52.c.b().f(canonicalName, str, i17);
            if (str.equals("com.tencent.mm.ui.MoreTabUI")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, _onPause-2");
                j52.c c17 = j52.c.c();
                c17.b(activityC1102x9ee2d9f);
                int i18 = c17.f379333b;
                if (i18 == 1 || i18 == -1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, _onPause-2");
                } else if (i18 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentMonitor", "StoryGalleryView, _onPause");
                    c17.f379333b = -1;
                    e42.h0 h0Var2 = this.f370023b;
                    if (h0Var2 != null) {
                        ((a52.d) h0Var2).c(3, j17);
                    }
                }
            }
            e42.h0 h0Var3 = this.f370023b;
            if (h0Var3 != null) {
                ((a52.d) h0Var3).a(canonicalName, str, i17, j17);
            }
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f370024c).iterator();
        while (it.hasNext()) {
            ((e42.j0) it.next()).G(i17);
        }
    }

    public void c(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, java.lang.String str, int i17, long j17, boolean z17) {
        e42.h0 h0Var;
        android.os.Bundle m7436x8619eaa0;
        android.os.Bundle m7436x8619eaa02;
        if (componentCallbacksC1101xa17d4670 != null) {
            b52.a a17 = b52.a.a();
            a17.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HABBYGE-MALI.HellhoundMonitor", "HellhoundMonitor-setPageObj: %s", componentCallbacksC1101xa17d4670.getClass().getSimpleName());
            a17.f99612c = new java.lang.ref.WeakReference(componentCallbacksC1101xa17d4670);
        }
        j52.a aVar = this.f370025d;
        if (z17) {
            r45.a53 a53Var = new r45.a53();
            if (componentCallbacksC1101xa17d4670 != null && (m7436x8619eaa02 = componentCallbacksC1101xa17d4670.m7436x8619eaa0()) != null) {
                a53Var.f451266e = m7436x8619eaa02.getString("Chat_User");
            }
            a53Var.f451268g = str;
            a53Var.f451271m = i17;
            a53Var.f451267f = true;
            a53Var.f451270i = j17;
            r45.bn6 bn6Var = new r45.bn6();
            a53Var.f451265d = bn6Var;
            if (activityC1102x9ee2d9f != null) {
                bn6Var.f452433d = activityC1102x9ee2d9f.getClass().getCanonicalName();
                a53Var.f451265d.f452434e = activityC1102x9ee2d9f.hashCode();
                a53Var.f451265d.f452435f = j17;
            }
            if (activityC1102x9ee2d9f != null) {
                a53Var.f451269h = a(activityC1102x9ee2d9f, str);
                if ("com.tencent.mm.ui.MoreTabUI".equals(str)) {
                    j52.c.c().e(activityC1102x9ee2d9f, aVar);
                }
            }
            d52.d.a().d(5, a53Var);
        } else {
            if (componentCallbacksC1101xa17d4670 != null && (m7436x8619eaa0 = componentCallbacksC1101xa17d4670.m7436x8619eaa0()) != null) {
                java.lang.String string = m7436x8619eaa0.getString("Chat_User");
                if (!android.text.TextUtils.isEmpty(string)) {
                    i52.e.b("Chat_User", string);
                }
            }
            if (activityC1102x9ee2d9f == null && componentCallbacksC1101xa17d4670 == null && str == null) {
                r45.b2 e17 = f52.c.b().e();
                if (e17 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentMonitor", "onFragmentResume -> _onResumeForBiz --2");
                    e42.h0 h0Var2 = this.f370023b;
                    if (h0Var2 != null) {
                        ((a52.d) h0Var2).b("Biz", e17.f451967d.f452433d, i17, j17);
                    }
                }
            } else if (activityC1102x9ee2d9f != null) {
                java.lang.String canonicalName = activityC1102x9ee2d9f.getClass().getCanonicalName();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentMonitor", "_onFragmentResume: %s, %s", canonicalName, str);
                f52.c.b().g(canonicalName, str, i17);
                if (str.equals("com.tencent.mm.ui.MoreTabUI")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, onResume-1");
                    j52.c c17 = j52.c.c();
                    c17.e(activityC1102x9ee2d9f, aVar);
                    int i18 = c17.f379333b;
                    if (i18 == 1 || i18 == -1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentMonitor", "MoreTabUI, _onResume-2");
                    } else if (i18 == 0) {
                        boolean a18 = a(activityC1102x9ee2d9f, str);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentMonitor", "StoryGalleryView, _onResume: %b", java.lang.Boolean.valueOf(a18));
                        if (a18 && (h0Var = this.f370023b) != null) {
                            ((a52.d) h0Var).d(2, j17);
                        }
                    }
                }
                e42.h0 h0Var3 = this.f370023b;
                if (h0Var3 != null) {
                    ((a52.d) h0Var3).b(canonicalName, str, i17, j17);
                }
            }
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f370024c).iterator();
        while (it.hasNext()) {
            ((e42.j0) it.next()).q(activityC1102x9ee2d9f, componentCallbacksC1101xa17d4670);
        }
    }
}
