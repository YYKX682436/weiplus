package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class hb implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya f285632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f285633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f285634f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f285635g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab f285636h;

    public hb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab abVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar, android.content.Context context, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f285636h = abVar;
        this.f285632d = yaVar;
        this.f285633e = context;
        this.f285634f = dVar;
        this.f285635g = f9Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.jq0 jq0Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar2;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab abVar = this.f285636h;
        abVar.f284829w = i17;
        abVar.f284828v = menuItem.getItemId();
        int itemId = menuItem.getItemId();
        r15.g gVar = null;
        final android.content.Context context = this.f285633e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar = this.f285632d;
        if (itemId == 0) {
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.CharSequence charSequence = abVar.f284826t;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(context2, charSequence, charSequence, null);
            wl5.x xVar = yaVar.f287592j;
            if (xVar != null) {
                xVar.k();
                wl5.x xVar2 = yaVar.f287592j;
                xVar2.M = true;
                xVar2.N = true;
                xVar2.i();
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.g(context);
            return;
        }
        if (itemId == 1) {
            wl5.x xVar3 = yaVar.f287592j;
            if (xVar3 != null) {
                wl5.v vVar = xVar3.f528699k;
                if (vVar != null) {
                    vVar.d();
                }
                wl5.x xVar4 = yaVar.f287592j;
                xVar4.M = true;
                xVar4.i();
                yaVar.f287592j.l(0, yaVar.f287584b.a().length());
                yaVar.f287592j.o();
                yaVar.f287592j.r();
                wl5.v vVar2 = yaVar.f287592j.f528699k;
                if (vVar2 != null) {
                    vVar2.e();
                    return;
                }
                return;
            }
            return;
        }
        if (itemId == 2) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar3 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) yaVar.f287584b.getTag();
            if (erVar3 != null) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.t.a(erVar3.c(), context, new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.viewitems.hb$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.content.Context context3 = context;
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.hb hbVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.hb.this;
                        hbVar.getClass();
                        android.content.Intent intent = new android.content.Intent(context3, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
                        intent.putExtra("Retr_Msg_content", hbVar.f285636h.f284826t);
                        intent.putExtra("Retr_Msg_Type", 4);
                        intent.putExtra("scene_from", 17);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(context3, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$6", "lambda$onMMMenuItemSelected$0", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context3.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(context3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$6", "lambda$onMMMenuItemSelected$0", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                });
                return;
            }
            return;
        }
        if (itemId == 3) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.m(c5303xc75d2f73, abVar.f284826t.toString(), 1);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = abVar.f284825s.f542250l;
            am.c4 c4Var = c5303xc75d2f73.f135623g;
            c4Var.f87857j = abstractC21611x7536149b;
            c4Var.f87860m = 43;
            r45.bq0 bq0Var = c4Var.f87848a;
            if (bq0Var != null && (jq0Var = bq0Var.f452495d) != null && (erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) yaVar.f287584b.getTag()) != null) {
                jq0Var.e(erVar.c().Q0());
                jq0Var.j(c01.z1.r());
                c5303xc75d2f73.e();
            }
            wl5.x xVar5 = yaVar.f287592j;
            if (xVar5 != null) {
                xVar5.k();
                wl5.x xVar6 = yaVar.f287592j;
                xVar6.M = true;
                xVar6.N = true;
                xVar6.i();
                return;
            }
            return;
        }
        if (itemId != 4) {
            if (itemId == 136 && (erVar2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) yaVar.f287584b.getTag()) != null) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(abVar.f284826t)) {
                    gVar = r15.h.a(yaVar.f287584b.a().toString(), abVar.f284826t, ((java.lang.Integer) yaVar.f287592j.e().first).intValue(), ((java.lang.Integer) yaVar.f287592j.e().second).intValue());
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.hc.a(yaVar);
                }
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) this.f285634f.f542241c.a(sb5.s0.class))).o0(erVar2.c(), gVar);
                return;
            }
            return;
        }
        java.lang.String str = "65_" + c01.id.c();
        java.lang.String charSequence2 = abVar.f284826t.toString();
        this.f285636h.D(this.f285634f, this.f285635g, 2, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Ai(charSequence2)), charSequence2, true, str, 3);
        su4.j2 j2Var = new su4.j2();
        j2Var.f494471a = context;
        j2Var.f494472b = 65;
        j2Var.f494474d = charSequence2;
        j2Var.f494475e = str;
        j2Var.f494476f = true;
        j2Var.f494479i = false;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
    }
}
