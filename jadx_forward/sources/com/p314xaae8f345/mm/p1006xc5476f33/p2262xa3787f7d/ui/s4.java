package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public class s4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 f254666d;

    public s4(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 activityC18580x3cc47ed9) {
        this.f254666d = activityC18580x3cc47ed9;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20917, 4, 1, 2, "", "", "", "");
            ((uh4.c0) i95.n0.c(uh4.c0.class)).C5();
            com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 activityC18580x3cc47ed9 = this.f254666d;
            db5.t7.h(activityC18580x3cc47ed9, activityC18580x3cc47ed9.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jrl));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_TIME_LONG_SYNC, 0L);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LAST_SHOW_TEENAGER_REST_TIME_LONG_SYNC, 0L);
            java.lang.String str = "default";
            if (((uh4.c0) i95.n0.c(uh4.c0.class)).Yd()) {
                if (gm0.j1.a()) {
                    str = gm0.j1.b().j();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getUinString(...)");
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MicroMsg.TeenModeStatusManager_".concat(str));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
                M.putBoolean("MMKVKey_ManuallyClose", true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeStatusManager", "resetManuallyClose:true");
            } else {
                if (gm0.j1.a()) {
                    str = gm0.j1.b().j();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getUinString(...)");
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MicroMsg.TeenModeStatusManager_".concat(str));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M2, "getMMKV(...)");
                M2.putBoolean("MMKVKey_ManuallyClose", false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeStatusManager", "resetManuallyClose:false");
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.r4(this), 2000L);
        }
    }
}
