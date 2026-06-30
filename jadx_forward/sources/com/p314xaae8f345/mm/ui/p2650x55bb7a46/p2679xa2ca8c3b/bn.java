package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class bn implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao f285030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f285031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f285032f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f285033g;

    public bn(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context) {
        this.f285030d = aoVar;
        this.f285031e = dVar;
        this.f285032f = f9Var;
        this.f285033g = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar = this.f285030d;
        java.lang.String charSequence = aoVar.f284925o.toString();
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(charSequence);
            }
            wl5.x xVar = aoVar.f284924n;
            if (xVar != null) {
                xVar.k();
                aoVar.f284924n.f();
                wl5.x xVar2 = aoVar.f284924n;
                xVar2.M = true;
                xVar2.N = true;
                xVar2.i();
                return;
            }
            return;
        }
        if (itemId == 1) {
            wl5.x xVar3 = aoVar.f284924n;
            if (xVar3 != null) {
                wl5.v vVar = xVar3.f528699k;
                if (vVar != null) {
                    vVar.d();
                }
                wl5.x xVar4 = aoVar.f284924n;
                xVar4.M = true;
                xVar4.i();
                aoVar.f284924n.l(0, aoVar.f284915e.m80028xc2a54588().a().length());
                aoVar.f284924n.o();
                wl5.x xVar5 = aoVar.f284924n;
                if (xVar5.f528701m) {
                    xVar5.f528701m = false;
                    xVar5.n(java.lang.Boolean.TRUE);
                }
                aoVar.f284924n.r();
                wl5.v vVar2 = aoVar.f284924n.f528699k;
                if (vVar2 != null) {
                    vVar2.e();
                    return;
                }
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f285032f;
        yb5.d dVar = this.f285031e;
        if (itemId == 2) {
            android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
            if (f9Var.X2()) {
                intent.putExtra("Retr_Msg_content", charSequence);
                intent.putExtra("Retr_Msg_Type", 6);
            } else {
                intent.putExtra("Retr_Msg_content", charSequence);
                intent.putExtra("Retr_Msg_Type", 4);
            }
            intent.putExtra("Retr_Is_Partial_Text_Select", true);
            intent.putExtra("scene_from", 17);
            intent.putExtra("ForwardParams_ForwardMsgType", 5);
            yb5.d dVar2 = this.f285031e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(dVar2, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            dVar2.a0((android.content.Intent) arrayList.get(0));
            yj0.a.f(dVar2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            wl5.x xVar6 = aoVar.f284924n;
            if (xVar6 != null) {
                xVar6.k();
                aoVar.f284924n.f();
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemTextBase", "transform text fav failed");
            }
            wl5.x xVar7 = aoVar.f284924n;
            if (xVar7 != null) {
                xVar7.k();
                aoVar.f284924n.f();
                return;
            }
            return;
        }
        if (itemId != 4) {
            return;
        }
        java.lang.String str = "65_" + c01.id.c();
        java.lang.String charSequence2 = aoVar.f284925o.toString();
        ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Ai(charSequence2);
        su4.j2 j2Var = new su4.j2();
        j2Var.f494471a = this.f285033g;
        j2Var.f494472b = 65;
        j2Var.f494474d = charSequence2;
        j2Var.f494475e = str;
        j2Var.f494476f = true;
        j2Var.f494479i = false;
        j2Var.f494486p = true;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
        wl5.x xVar8 = aoVar.f284924n;
        if (xVar8 != null) {
            xVar8.k();
            aoVar.f284924n.f();
        }
    }
}
