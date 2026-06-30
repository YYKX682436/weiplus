package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class c0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC f101839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.e21 f101840e;

    public c0(com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC finderActivityParticipateUIC, r45.e21 e21Var) {
        this.f101839d = finderActivityParticipateUIC;
        this.f101840e = e21Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        ml2.y3 y3Var = null;
        r45.e21 e21Var = this.f101840e;
        com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC finderActivityParticipateUIC = this.f101839d;
        if (itemId == 10012) {
            finderActivityParticipateUIC.f7(e21Var);
            ra0.x xVar = (ra0.x) i95.n0.c(ra0.x.class);
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("activity_enter_source", (java.lang.String) ((jz5.n) finderActivityParticipateUIC.f101824u).getValue());
            lVarArr[1] = new jz5.l("page_activityid", pm0.v.u(e21Var != null ? e21Var.getLong(0) : 0L));
            lVarArr[2] = new jz5.l("view_id", "activity_post_finder");
            ((nn3.f) xVar).Ni("view_clk", null, kz5.c1.k(lVarArr), false);
            return;
        }
        if (itemId != 10013) {
            return;
        }
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).Ui(4, finderActivityParticipateUIC.f101825v, finderActivityParticipateUIC.f101826w, null);
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
        ml2.y4 y4Var = ml2.j0.f327583i;
        ml2.y3 y3Var2 = ml2.y3.f328279q;
        y4Var.getClass();
        y4Var.f328291c0 = y3Var2;
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        androidx.appcompat.app.AppCompatActivity context = finderActivityParticipateUIC.getActivity();
        android.content.Intent intent = new android.content.Intent();
        if (e21Var != null) {
            intent.putExtra("KEY_FINDER_EVENT", e21Var.toByteArray());
        }
        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", finderActivityParticipateUIC.f101825v);
        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", finderActivityParticipateUIC.f101826w);
        ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "createFinderLive sourceScene:0");
        ml2.y3[] values = ml2.y3.values();
        int length = values.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                break;
            }
            ml2.y3 y3Var3 = values[i18];
            if (y3Var3.f328284d == 0) {
                y3Var = y3Var3;
                break;
            }
            i18++;
        }
        if (y3Var != null) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).ck(y3Var);
        }
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb.H7((c61.yb) c17, context, intent, 0L, null, 0, 0, false, 124, null);
        intent.setClass(context, com.tencent.mm.plugin.finder.feed.ui.FinderLivePostPendingUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "createFinderLive", "(Landroid/content/Context;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "createFinderLive", "(Landroid/content/Context;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
