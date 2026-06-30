package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class mn implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao f286120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f286121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f286122f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gn f286123g;

    public mn(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gn gnVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar, android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f286123g = gnVar;
        this.f286120d = aoVar;
        this.f286121e = context;
        this.f286122f = f9Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.jq0 jq0Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar2;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gn gnVar = this.f286123g;
        gnVar.f285591v = itemId;
        gnVar.f285592w = i17;
        int itemId2 = menuItem.getItemId();
        r15.g gVar = null;
        final android.content.Context context = this.f286121e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar = this.f286120d;
        if (itemId2 == 0) {
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.CharSequence charSequence = gnVar.f285590u;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(context2, charSequence, charSequence, null);
            wl5.x xVar = aoVar.f284919i;
            if (xVar != null) {
                xVar.k();
                wl5.x xVar2 = aoVar.f284919i;
                xVar2.M = true;
                xVar2.N = true;
                xVar2.i();
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.g(context);
            try {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar3 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) aoVar.f284912b.getTag();
                if (erVar3 != null) {
                    java.lang.String q07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) gnVar.f285588s.f542241c.a(sb5.l2.class))).q0(erVar3.c(), false);
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6869x36ad427 c6869x36ad427 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6869x36ad427();
                    c6869x36ad427.f141875d = erVar3.c().I0();
                    c6869x36ad427.f141877f = q07.length();
                    c6869x36ad427.f141876e = gnVar.f285590u.length();
                    c6869x36ad427.f141878g = c01.ia.i(erVar3.c());
                    c6869x36ad427.k();
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.a(erVar3.c(), 3, gnVar.f285590u.length());
                    return;
                }
                return;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemTextFromBase", "report occur exception! %s", e17.getMessage());
                return;
            }
        }
        if (itemId2 == 1) {
            wl5.x xVar3 = aoVar.f284919i;
            if (xVar3 != null) {
                wl5.v vVar = xVar3.f528699k;
                if (vVar != null) {
                    vVar.d();
                }
                wl5.x xVar4 = aoVar.f284919i;
                xVar4.M = true;
                xVar4.i();
                aoVar.f284919i.l(0, aoVar.f284912b.a().length());
                aoVar.f284919i.o();
                wl5.x xVar5 = aoVar.f284919i;
                if (xVar5.f528701m) {
                    xVar5.f528701m = false;
                    xVar5.n(java.lang.Boolean.TRUE);
                }
                aoVar.f284919i.r();
                wl5.v vVar2 = aoVar.f284919i.f528699k;
                if (vVar2 != null) {
                    vVar2.e();
                    return;
                }
                return;
            }
            return;
        }
        if (itemId2 == 2) {
            final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar4 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) aoVar.f284912b.getTag();
            if (erVar4 != null) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.a(erVar4.c(), 4, 0);
                final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f286122f;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.t.a(erVar4.c(), context, new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.viewitems.mn$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.content.Context context3 = context;
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mn mnVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mn.this;
                        mnVar.getClass();
                        android.content.Intent intent = new android.content.Intent(context3, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
                        intent.putExtra("Retr_Msg_Id", erVar4.c().m124847x74d37ac6());
                        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
                        intent.putExtra("Retr_Msg_content", mnVar.f286123g.f285590u);
                        intent.putExtra("Retr_Msg_Type", 4);
                        intent.putExtra("Retr_Is_Partial_Text_Select", true);
                        intent.putExtra("scene_from", 17);
                        intent.putExtra("ForwardParams_ForwardMsgType", 5);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(context3, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$ChattingItemTextFromBase$6", "lambda$onMMMenuItemSelected$0", "(Landroid/content/Context;Lcom/tencent/mm/ui/chatting/viewitems/ItemDataTag;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context3.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(context3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$ChattingItemTextFromBase$6", "lambda$onMMMenuItemSelected$0", "(Landroid/content/Context;Lcom/tencent/mm/ui/chatting/viewitems/ItemDataTag;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                });
                return;
            }
            return;
        }
        if (itemId2 == 3) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.m(c5303xc75d2f73, gnVar.f285590u.toString(), 1);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = gnVar.f285588s.f542250l;
            am.c4 c4Var = c5303xc75d2f73.f135623g;
            c4Var.f87857j = abstractC21611x7536149b;
            c4Var.f87860m = 43;
            r45.bq0 bq0Var = c4Var.f87848a;
            if (bq0Var != null && (jq0Var = bq0Var.f452495d) != null && (erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) aoVar.f284912b.getTag()) != null) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.a(erVar.c(), 5, 0);
                jq0Var.e(erVar.c().Q0());
                jq0Var.j(c01.z1.r());
                c5303xc75d2f73.e();
            }
            wl5.x xVar6 = aoVar.f284919i;
            if (xVar6 != null) {
                xVar6.k();
                wl5.x xVar7 = aoVar.f284919i;
                xVar7.M = true;
                xVar7.N = true;
                xVar7.i();
                return;
            }
            return;
        }
        if (itemId2 != 4) {
            if (itemId2 == 136 && (erVar2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) aoVar.f284912b.getTag()) != null) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(gnVar.f285590u)) {
                    gVar = r15.h.a(aoVar.f284912b.a().toString(), gnVar.f285590u, ((java.lang.Integer) aoVar.f284919i.e().first).intValue(), ((java.lang.Integer) aoVar.f284919i.e().second).intValue());
                    wl5.x xVar8 = aoVar.f284919i;
                    if (xVar8 != null) {
                        xVar8.k();
                        wl5.x xVar9 = aoVar.f284919i;
                        xVar9.M = true;
                        xVar9.N = true;
                        xVar9.i();
                    }
                }
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) gnVar.f285588s.f542241c.a(sb5.s0.class))).o0(erVar2.c(), gVar);
                return;
            }
            return;
        }
        java.lang.String str = "65_" + c01.id.c();
        java.lang.String charSequence2 = gnVar.f285590u.toString();
        su4.j2 j2Var = new su4.j2();
        j2Var.f494471a = context;
        j2Var.f494472b = 65;
        j2Var.f494474d = charSequence2;
        j2Var.f494475e = str;
        j2Var.f494476f = true;
        j2Var.f494479i = false;
        j2Var.f494486p = false;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
    }
}
