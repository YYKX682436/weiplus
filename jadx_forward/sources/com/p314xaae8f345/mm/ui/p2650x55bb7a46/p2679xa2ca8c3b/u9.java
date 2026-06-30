package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class u9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q9 f287201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f287202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f287203f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.y9 f287204g;

    public u9(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.y9 y9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q9 q9Var, android.content.Context context, yb5.d dVar) {
        this.f287204g = y9Var;
        this.f287201d = q9Var;
        this.f287202e = context;
        this.f287203f = dVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.jq0 jq0Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.y9 y9Var = this.f287204g;
        y9Var.f287583w = i17;
        y9Var.f287582v = menuItem.getItemId();
        int itemId = menuItem.getItemId();
        r15.g gVar = null;
        final android.content.Context context = this.f287202e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q9 q9Var = this.f287201d;
        if (itemId == 0) {
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.CharSequence charSequence = y9Var.f287580t;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(context2, charSequence, charSequence, null);
            wl5.x xVar = q9Var.f286866f;
            if (xVar != null) {
                xVar.k();
                wl5.x xVar2 = q9Var.f286866f;
                xVar2.M = true;
                xVar2.N = true;
                xVar2.i();
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bo.g(context);
            return;
        }
        if (itemId == 1) {
            wl5.x xVar3 = q9Var.f286866f;
            if (xVar3 != null) {
                wl5.v vVar = xVar3.f528699k;
                if (vVar != null) {
                    vVar.d();
                }
                wl5.x xVar4 = q9Var.f286866f;
                xVar4.M = true;
                xVar4.i();
                q9Var.f286866f.l(0, q9Var.f286862b.a().length());
                q9Var.f286866f.o();
                wl5.x xVar5 = q9Var.f286866f;
                if (xVar5.f528701m) {
                    xVar5.f528701m = false;
                    xVar5.n(java.lang.Boolean.TRUE);
                }
                q9Var.f286866f.r();
                wl5.v vVar2 = q9Var.f286866f.f528699k;
                if (vVar2 != null) {
                    vVar2.e();
                    return;
                }
                return;
            }
            return;
        }
        if (itemId == 2) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) q9Var.f286862b.getTag();
            if (erVar2 != null) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.t.a(erVar2.c(), context, new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.viewitems.u9$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.content.Context context3 = context;
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.u9 u9Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.u9.this;
                        u9Var.getClass();
                        android.content.Intent intent = new android.content.Intent(context3, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
                        intent.putExtra("Retr_Msg_content", u9Var.f287204g.f287580t);
                        intent.putExtra("Retr_Msg_Type", 4);
                        intent.putExtra("scene_from", 17);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(context3, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireFrom$4", "lambda$onMMMenuItemSelected$0", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context3.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(context3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireFrom$4", "lambda$onMMMenuItemSelected$0", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                });
                return;
            }
            return;
        }
        if (itemId != 3) {
            if (itemId == 136 && ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) q9Var.f286862b.getTag()) != null) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(y9Var.f287580t)) {
                    gVar = r15.h.a(q9Var.f286862b.a().toString(), y9Var.f287580t, ((java.lang.Integer) q9Var.f286866f.e().first).intValue(), ((java.lang.Integer) q9Var.f286866f.e().second).intValue());
                    wl5.x xVar6 = q9Var.f286866f;
                    if (xVar6 != null) {
                        xVar6.k();
                        wl5.x xVar7 = q9Var.f286866f;
                        xVar7.M = true;
                        xVar7.N = true;
                        xVar7.i();
                    }
                }
                yb5.d dVar = this.f287203f;
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) dVar.f542241c.a(sb5.s0.class))).o0(q9Var.m80051xdfe7150c(dVar), gVar);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.m(c5303xc75d2f73, y9Var.f287580t.toString(), 1);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = y9Var.f287579s.f542250l;
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87857j = abstractC21611x7536149b;
        c4Var.f87860m = 43;
        r45.bq0 bq0Var = c4Var.f87848a;
        if (bq0Var != null && (jq0Var = bq0Var.f452495d) != null && (erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) q9Var.f286862b.getTag()) != null) {
            jq0Var.e(erVar.c().Q0());
            jq0Var.j(c01.z1.r());
            c5303xc75d2f73.e();
        }
        wl5.x xVar8 = q9Var.f286866f;
        if (xVar8 != null) {
            xVar8.k();
            wl5.x xVar9 = q9Var.f286866f;
            xVar9.M = true;
            xVar9.N = true;
            xVar9.i();
        }
    }
}
