package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes11.dex */
public final class x7 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 f183133a;

    public x7(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var) {
        this.f183133a = z7Var;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            java.util.HashMap hashMap = new java.util.HashMap();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f183133a.f183188a;
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a = abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a ? (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a) abstractActivityC21394xb3d2c0cf : null;
            java.lang.String str = activityC13579xef51058a != null ? activityC13579xef51058a.Y : null;
            if (str == null) {
                str = "";
            }
            hashMap.put("fav_homepage_sessionid", str);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_quick_filter", "view_exp", hashMap, 32903);
        }
    }
}
