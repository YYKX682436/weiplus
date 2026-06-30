package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class zd implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.od f287660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f287661e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f287662f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ae f287663g;

    public zd(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ae aeVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.od odVar, android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f287663g = aeVar;
        this.f287660d = odVar;
        this.f287661e = context;
        this.f287662f = f9Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.jq0 jq0Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar;
        int itemId = menuItem.getItemId();
        r15.g gVar = null;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ae aeVar = this.f287663g;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.od odVar = this.f287660d;
        if (itemId == 0) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.CharSequence charSequence = aeVar.f284882t;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(context, charSequence, charSequence, null);
            wl5.x xVar = odVar.f286717g;
            if (xVar != null) {
                xVar.k();
                wl5.x xVar2 = odVar.f286717g;
                xVar2.M = true;
                xVar2.N = true;
                xVar2.i();
            }
            android.app.Activity g17 = aeVar.f284881s.g();
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(g17);
            e4Var.f293309c = aeVar.f284881s.g().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st);
            e4Var.c();
            try {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) odVar.f286712b.getTag();
                if (erVar2 != null) {
                    java.lang.String q07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) aeVar.f284881s.f542241c.a(sb5.l2.class))).q0(erVar2.c(), false);
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6869x36ad427 c6869x36ad427 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6869x36ad427();
                    c6869x36ad427.f141875d = erVar2.c().I0();
                    c6869x36ad427.f141877f = q07.length();
                    c6869x36ad427.f141876e = aeVar.f284882t.length();
                    c6869x36ad427.f141878g = c01.ia.i(erVar2.c());
                    c6869x36ad427.k();
                    return;
                }
                return;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgTextTo", "report occur exception! %s", e17.getMessage());
                return;
            }
        }
        if (itemId == 1) {
            wl5.x xVar3 = odVar.f286717g;
            if (xVar3 != null) {
                wl5.v vVar = xVar3.f528699k;
                if (vVar != null) {
                    vVar.d();
                }
                wl5.x xVar4 = odVar.f286717g;
                xVar4.M = true;
                xVar4.i();
                odVar.f286717g.l(0, odVar.f286712b.a().length());
                odVar.f286717g.o();
                wl5.x xVar5 = odVar.f286717g;
                if (xVar5.f528701m) {
                    xVar5.f528701m = false;
                    xVar5.n(java.lang.Boolean.TRUE);
                }
                odVar.f286717g.r();
                wl5.v vVar2 = odVar.f286717g.f528699k;
                if (vVar2 != null) {
                    vVar2.e();
                    return;
                }
                return;
            }
            return;
        }
        android.content.Context context2 = this.f287661e;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f287662f;
        if (itemId == 2) {
            android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
            intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
            intent.putExtra("Retr_MsgTalker", f9Var.Q0());
            intent.putExtra("Retr_Msg_content", aeVar.f284882t);
            intent.putExtra("Retr_Msg_Type", 4);
            intent.putExtra("scene_from", 17);
            android.content.Context context3 = this.f287661e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context3, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgText$ChattingItemAppMsgTextTo$5", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgText$ChattingItemAppMsgTextTo$5", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (itemId == 3) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.m(c5303xc75d2f73, aeVar.f284882t.toString(), 1);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = aeVar.f284881s.f542250l;
            am.c4 c4Var = c5303xc75d2f73.f135623g;
            c4Var.f87857j = abstractC21611x7536149b;
            c4Var.f87860m = 43;
            r45.bq0 bq0Var = c4Var.f87848a;
            if (bq0Var != null && (jq0Var = bq0Var.f452495d) != null && (erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) odVar.f286712b.getTag()) != null) {
                jq0Var.e(c01.z1.r());
                jq0Var.j(erVar.c().Q0());
                c5303xc75d2f73.e();
            }
            wl5.x xVar6 = odVar.f286717g;
            if (xVar6 != null) {
                xVar6.k();
                wl5.x xVar7 = odVar.f286717g;
                xVar7.M = true;
                xVar7.N = true;
                xVar7.i();
                return;
            }
            return;
        }
        if (itemId != 4) {
            if (itemId == 136 && ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) odVar.f286712b.getTag()) != null) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(aeVar.f284882t)) {
                    gVar = r15.h.a(odVar.f286712b.a().toString(), aeVar.f284882t, ((java.lang.Integer) odVar.f286717g.e().first).intValue(), ((java.lang.Integer) odVar.f286717g.e().second).intValue());
                    wl5.x xVar8 = odVar.f286717g;
                    if (xVar8 != null) {
                        xVar8.k();
                        wl5.x xVar9 = odVar.f286717g;
                        xVar9.M = true;
                        xVar9.N = true;
                        xVar9.i();
                    }
                }
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) aeVar.f284881s.f542241c.a(sb5.s0.class))).o0(f9Var, gVar);
                return;
            }
            return;
        }
        java.lang.String str = "65_" + c01.id.c();
        java.lang.String charSequence2 = aeVar.f284882t.toString();
        aeVar.D(aeVar.f284881s, this.f287662f, 2, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Ai(charSequence2)), charSequence2, true, str, 3);
        su4.j2 j2Var = new su4.j2();
        j2Var.f494471a = context2;
        j2Var.f494472b = 65;
        j2Var.f494474d = charSequence2;
        j2Var.f494475e = str;
        j2Var.f494476f = true;
        j2Var.f494479i = false;
        j2Var.f494486p = true;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
    }
}
