package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271838d;

    public f2(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f271838d = c19666xfd6e2f33;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer num;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.z4 z4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$38", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = 0;
        u35.b.f505963b = 0;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271838d;
        c19666xfd6e2f33.B.getClass();
        rn3.i.Di().a(59);
        android.widget.ImageButton imageButton = c19666xfd6e2f33.f271636z;
        int i18 = -1;
        if (c19666xfd6e2f33.m75436xd8c278af() != null && c19666xfd6e2f33.m75436xd8c278af().size() > 0) {
            int i19 = -1;
            for (int i27 = 0; i27 < c19666xfd6e2f33.m75436xd8c278af().size(); i27++) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.x xVar = c19666xfd6e2f33.m75436xd8c278af().get(i27);
                if (xVar.f272247h2 == 1) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("plus_uncertain_enter").getBoolean(xVar.f272246g2, false)) {
                        java.lang.String str = xVar.f272246g2;
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("plus_uncertain_enter");
                        M.getClass();
                        M.putBoolean(str, true);
                        if (i19 == -1) {
                            i19 = i27;
                        }
                    }
                }
            }
            i18 = i19;
        }
        c19666xfd6e2f33.r1(true);
        imageButton.setTag(java.lang.Integer.valueOf(i18));
        c19666xfd6e2f33.v(view);
        if (c01.z1.H().booleanValue() && (z4Var = c19666xfd6e2f33.Q2) != null) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hm) z4Var).f280709a.m0(bool, bool);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var = c19666xfd6e2f33.f271488a3;
        if (y4Var != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(y4Var.c())) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("chat_name", c19666xfd6e2f33.f271488a3.c());
            hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(c19666xfd6e2f33.f271488a3.d())));
            hashMap.put("enter_sessionid", c19666xfd6e2f33.f271488a3.b());
            hashMap.put("view_id", "yuanbao_plus_button");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var2 = c19666xfd6e2f33.f271488a3;
        if (y4Var2 != null && y4Var2.a() != null) {
            c00.m3 m3Var = (c00.m3) i95.n0.c(c00.m3.class);
            boolean D = c19666xfd6e2f33.f271488a3.a().D();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 u17 = c19666xfd6e2f33.f271488a3.a().u();
            j00.d2 d2Var = (j00.d2) m3Var;
            if (d2Var.Vi(D) && d2Var.Bi(D, u17)) {
                if (D) {
                    n00.g gVar = n00.g.f415354a;
                    gVar.getClass();
                    f06.v[] vVarArr = n00.g.f415355b;
                    n00.g.f415359f.c(gVar, vVarArr[3], java.lang.Boolean.TRUE);
                    bw5.s8 b17 = gVar.b().b();
                    if (b17 != null) {
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(b17.f114387r);
                        num = valueOf.intValue() > 0 ? valueOf : null;
                        if (num != null) {
                            i17 = num.intValue();
                        }
                    }
                    n00.g.f415365l.c(gVar, vVarArr[9], java.lang.Integer.valueOf(i17));
                } else {
                    n00.g gVar2 = n00.g.f415354a;
                    gVar2.getClass();
                    f06.v[] vVarArr2 = n00.g.f415355b;
                    n00.g.f415358e.c(gVar2, vVarArr2[2], java.lang.Boolean.TRUE);
                    bw5.s8 c17 = gVar2.b().c();
                    if (c17 != null) {
                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(c17.f114387r);
                        num = valueOf2.intValue() > 0 ? valueOf2 : null;
                        if (num != null) {
                            i17 = num.intValue();
                        }
                    }
                    n00.g.f415364k.c(gVar2, vVarArr2[8], java.lang.Integer.valueOf(i17));
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$38", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
