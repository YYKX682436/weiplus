package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes2.dex */
public final class c0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13667xc5da9466 f183372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.e21 f183373e;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13667xc5da9466 c13667xc5da9466, r45.e21 e21Var) {
        this.f183372d = c13667xc5da9466;
        this.f183373e = e21Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        ml2.y3 y3Var = null;
        r45.e21 e21Var = this.f183373e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13667xc5da9466 c13667xc5da9466 = this.f183372d;
        if (itemId == 10012) {
            c13667xc5da9466.f7(e21Var);
            ra0.x xVar = (ra0.x) i95.n0.c(ra0.x.class);
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("activity_enter_source", (java.lang.String) ((jz5.n) c13667xc5da9466.f183357u).mo141623x754a37bb());
            lVarArr[1] = new jz5.l("page_activityid", pm0.v.u(e21Var != null ? e21Var.m75942xfb822ef2(0) : 0L));
            lVarArr[2] = new jz5.l("view_id", "activity_post_finder");
            ((nn3.f) xVar).Ni("view_clk", null, kz5.c1.k(lVarArr), false);
            return;
        }
        if (itemId != 10013) {
            return;
        }
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).Ui(4, c13667xc5da9466.f183358v, c13667xc5da9466.f183359w, null);
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
        ml2.y4 y4Var = ml2.j0.f409116i;
        ml2.y3 y3Var2 = ml2.y3.f409812q;
        y4Var.getClass();
        y4Var.f409824c0 = y3Var2;
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = c13667xc5da9466.m158354x19263085();
        android.content.Intent intent = new android.content.Intent();
        if (e21Var != null) {
            intent.putExtra("KEY_FINDER_EVENT", e21Var.mo14344x5f01b1f6());
        }
        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", c13667xc5da9466.f183358v);
        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", c13667xc5da9466.f183359w);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "createFinderLive sourceScene:0");
        ml2.y3[] m147815xcee59d22 = ml2.y3.m147815xcee59d22();
        int length = m147815xcee59d22.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                break;
            }
            ml2.y3 y3Var3 = m147815xcee59d22[i18];
            if (y3Var3.f409817d == 0) {
                y3Var = y3Var3;
                break;
            }
            i18++;
        }
        if (y3Var != null) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).ck(y3Var);
        }
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb.H7((c61.yb) c17, context, intent, 0L, null, 0, 0, false, 124, null);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14021x37325479.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "createFinderLive", "(Landroid/content/Context;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "createFinderLive", "(Landroid/content/Context;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
