package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class vo implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp f287415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f287416e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f287417f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f287418g;

    public vo(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp lpVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar, android.content.Context context) {
        this.f287415d = lpVar;
        this.f287416e = f9Var;
        this.f287417f = dVar;
        this.f287418g = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp lpVar = this.f287415d;
        java.lang.String charSequence = lpVar.f286049n.toString();
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f287416e;
        if (itemId == 0) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(charSequence);
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.e(8, f9Var);
            wl5.x xVar = lpVar.f286046k;
            if (xVar != null) {
                xVar.k();
                lpVar.f286046k.f();
                wl5.x xVar2 = lpVar.f286046k;
                xVar2.M = true;
                xVar2.N = true;
                xVar2.i();
                return;
            }
            return;
        }
        if (itemId == 1) {
            wl5.x xVar3 = lpVar.f286046k;
            if (xVar3 != null) {
                wl5.v vVar = xVar3.f528699k;
                if (vVar != null) {
                    vVar.d();
                }
                wl5.x xVar4 = lpVar.f286046k;
                xVar4.M = true;
                xVar4.i();
                lpVar.f286046k.l(0, lpVar.f286043h.m80028xc2a54588().a().length());
                lpVar.f286046k.o();
                wl5.x xVar5 = lpVar.f286046k;
                if (xVar5.f528701m) {
                    xVar5.f528701m = false;
                    xVar5.n(java.lang.Boolean.TRUE);
                }
                lpVar.f286046k.r();
                wl5.v vVar2 = lpVar.f286046k.f528699k;
                if (vVar2 != null) {
                    vVar2.e();
                    return;
                }
                return;
            }
            return;
        }
        yb5.d dVar = this.f287417f;
        if (itemId == 2) {
            android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
            if (f9Var.X2()) {
                intent.putExtra("Retr_Msg_content", charSequence);
                intent.putExtra("Retr_Msg_Type", 6);
            } else {
                intent.putExtra("Retr_Msg_content", charSequence);
                intent.putExtra("Retr_Msg_Type", 4);
            }
            intent.putExtra("scene_from", 17);
            yb5.d dVar2 = this.f287417f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(dVar2, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$8", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            dVar2.a0((android.content.Intent) arrayList.get(0));
            yj0.a.f(dVar2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$8", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.e(9, f9Var);
            wl5.x xVar6 = lpVar.f286046k;
            if (xVar6 != null) {
                xVar6.k();
                lpVar.f286046k.f();
                return;
            }
            return;
        }
        if (itemId == 3) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.m(c5303xc75d2f73, charSequence, 1);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = dVar.f542250l;
            am.c4 c4Var = c5303xc75d2f73.f135623g;
            c4Var.f87857j = abstractC21611x7536149b;
            c4Var.f87860m = 43;
            r45.bq0 bq0Var = c4Var.f87848a;
            if (bq0Var != null) {
                r45.jq0 jq0Var = bq0Var.f452495d;
                if (jq0Var != null) {
                    jq0Var.e(c01.z1.r());
                    jq0Var.j(f9Var.Q0());
                    c5303xc75d2f73.e();
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemVoice", "transform text fav failed");
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.e(10, f9Var);
            wl5.x xVar7 = lpVar.f286046k;
            if (xVar7 != null) {
                xVar7.k();
                lpVar.f286046k.f();
                return;
            }
            return;
        }
        if (itemId != 4) {
            return;
        }
        java.lang.String str = "65_" + c01.id.c();
        java.lang.String charSequence2 = lpVar.f286049n.toString();
        ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Ai(charSequence2);
        su4.j2 j2Var = new su4.j2();
        j2Var.f494471a = this.f287418g;
        j2Var.f494472b = 65;
        j2Var.f494474d = charSequence2;
        j2Var.f494475e = str;
        j2Var.f494476f = true;
        j2Var.f494479i = false;
        j2Var.f494486p = true;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
        wl5.x xVar8 = lpVar.f286046k;
        if (xVar8 != null) {
            xVar8.k();
            lpVar.f286046k.f();
        }
    }
}
