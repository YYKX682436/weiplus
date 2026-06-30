package a52;

/* loaded from: classes15.dex */
public class d implements e42.h0 {
    public void a(java.lang.String str, java.lang.String str2, int i17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellhoundService", "setFragmentListener, onPause: %s, %s", str, str2);
        v52.c g17 = v52.c.g();
        g17.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HABBYGE-MALI.HellSessionMonitor", "HellSessionMonitor, notifyToBizExit: FALSE");
        } else if (!com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.k()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellBizSessionHandler", "whenChattingUIFragmentExit, NOT 104-Biz Session !!");
        } else if ("Biz".equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellBizSessionHandler", "whenChattingUIFragmentExit: %s", str2);
            if (str2.contains("BizTimeLineUI")) {
                y52.b.a(str2, i17, j17);
            } else if (str2.contains("BizConversationUI")) {
                y52.b.a(str2, i17, j17);
            }
        }
        r45.b2 a17 = f52.c.b().a(str);
        if (a17 == null) {
            return;
        }
        java.lang.String str3 = a17.f451971h;
        if (str3 == null || str3.isEmpty()) {
            a17.f451971h = str2;
        } else {
            java.lang.String g18 = b52.b.g(a17.f451971h);
            java.lang.String g19 = b52.b.g(str2);
            if (g18 == null || !g18.equals(g19)) {
                a17.f451971h = str2;
            }
        }
        a17.f451973m = j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellhoundService", "fragment, out: %s", a17.f451971h);
        r45.y43 a18 = i52.f.a();
        if (a18 == null) {
            a18 = new r45.y43();
        }
        a18.f472308d = str2;
        i52.f.b(a18);
        java.lang.String g27 = b52.b.g(a17.f451971h);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 e17 = b52.b.l(g27) ? b52.b.e(g27) : p52.h.a(g27) ? p52.k.a() : null;
        if (e17 != null) {
            java.lang.String canonicalName = e17.getClass().getCanonicalName();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellhoundService", "fragment, onPause: %s", canonicalName);
            t52.a.f497242a.c(canonicalName, j17, t52.h.f497248e);
            v52.c.g().b(e17, 2);
        }
        g17.j(null, a17, 5, null);
    }

    public void b(java.lang.String str, java.lang.String str2, int i17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellhoundService", "setFragmentListener, onResume: %s, %s", str, str2);
        java.lang.ref.WeakReference weakReference = b52.a.a().f99612c;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = null;
        java.lang.Object obj = weakReference == null ? null : weakReference.get();
        java.util.Map map = z52.a.f551772a;
        if (obj != null) {
            z52.a.f551773b = new java.lang.ref.WeakReference(obj);
        }
        v52.c g17 = v52.c.g();
        g17.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HABBYGE-MALI.HellSessionMonitor", "HellSessionMonitor, notifyToBizEnter: FALSE");
        } else if (!com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.k()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellBizSessionHandler", "whenChattingUIFragmentEnter, NOT 104-Biz Session !!");
        } else if ("Biz".equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellBizSessionHandler", "whenChattingUIFragmentEnter: %s -> %s", str2, "com.tencent.mm.ui.chatting.ChattingUIFragment");
            if (!str2.contains("BizTimeLineUI")) {
                str2.contains("BizConversationUI");
            }
            y52.b.a("com.tencent.mm.ui.chatting.ChattingUIFragment", i17, j17);
        }
        r45.b2 e17 = f52.c.b().e();
        if (e17 == null) {
            return;
        }
        java.lang.String str3 = e17.f451970g;
        if (str3 == null || str3.isEmpty()) {
            e17.f451970g = str2;
            e17.f451974n = i17;
        } else {
            java.lang.String g18 = b52.b.g(e17.f451970g);
            java.lang.String g19 = b52.b.g(str2);
            if (g18 == null || !g18.equals(g19)) {
                e17.f451970g = str2;
                e17.f451974n = i17;
            }
        }
        e17.f451973m = j17;
        r45.a2 a2Var = f52.b.a().f452770e;
        r45.b2 b2Var = a2Var == null ? null : a2Var.f451184f;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = e17.f451970g;
        objArr[1] = android.text.TextUtils.isEmpty(e17.f451971h) ? b2Var == null ? "Null" : b2Var.f451967d.f452433d : e17.f451971h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellhoundService", "fragment, in: %s, %s", objArr);
        r45.y43 a17 = i52.f.a();
        if (a17 == null) {
            a17 = new r45.y43();
        }
        a17.f472309e = str2;
        i52.f.b(a17);
        if (!android.text.TextUtils.isEmpty(e17.f451971h)) {
            b2Var = e17;
        }
        g17.j(null, e17, 4, b2Var);
        java.lang.String g27 = b52.b.g(e17.f451970g);
        if (b52.b.l(g27)) {
            componentCallbacksC1101xa17d4670 = b52.b.e(g27);
        } else if (p52.h.a(g27)) {
            componentCallbacksC1101xa17d4670 = p52.k.a();
        }
        if (componentCallbacksC1101xa17d4670 != null) {
            java.lang.String canonicalName = componentCallbacksC1101xa17d4670.getClass().getCanonicalName();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellhoundService", "fragment, onResume: %s", canonicalName);
            t52.a.f497242a.c(canonicalName, j17, t52.h.f497247d);
            v52.c.g().b(componentCallbacksC1101xa17d4670, 0);
        }
    }

    public void c(int i17, long j17) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 e17 = b52.b.e("MoreTabUI");
        if (e17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellhoundService", "onStoryGalleryViewPause: MoreTabUI");
            t52.a.f497242a.c("com.tencent.mm.ui.MoreTabUI", j17, t52.h.f497248e);
            v52.c.g().b(e17, 2);
        }
        v52.c.g().l(9, i17, j17);
    }

    public void d(int i17, long j17) {
        v52.c.g().l(8, i17, j17);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 e17 = b52.b.e("MoreTabUI");
        if (e17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellhoundService", "onStoryGalleryViewResume: MoreTabUI");
            t52.a.f497242a.c("com.tencent.mm.ui.MoreTabUI", j17, t52.h.f497247d);
            v52.c.g().b(e17, 0);
        }
    }
}
