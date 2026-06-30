package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class d0 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11342x8f12a65a f154131a;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11342x8f12a65a activityC11342x8f12a65a) {
        this.f154131a = activityC11342x8f12a65a;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAQueryListUI", "getNexPage failed: %s", obj);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11342x8f12a65a activityC11342x8f12a65a = this.f154131a;
        android.app.Dialog dialog = activityC11342x8f12a65a.f153979m;
        if (dialog != null) {
            dialog.dismiss();
            activityC11342x8f12a65a.f153979m = null;
        }
        activityC11342x8f12a65a.f153980n = false;
        if (activityC11342x8f12a65a.f153977h.getFooterViewsCount() > 0) {
            activityC11342x8f12a65a.f153977h.removeFooterView(activityC11342x8f12a65a.f153982p);
        }
        if (obj instanceof java.lang.String) {
            dp.a.m125854x26a183b(activityC11342x8f12a65a, obj.toString(), 1).show();
        } else {
            dp.a.m125853x26a183b(activityC11342x8f12a65a, com.p314xaae8f345.mm.R.C30867xcad56011.frv, 1).show();
        }
    }
}
