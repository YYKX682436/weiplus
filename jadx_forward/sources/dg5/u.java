package dg5;

/* loaded from: classes9.dex */
public class u implements dg5.v, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 f313934d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f313935e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f313936f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f313937g = false;

    /* renamed from: h, reason: collision with root package name */
    public final dg5.t f313938h = new dg5.t(this);

    public u(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8, java.lang.String str) {
        this.f313934d = activityC22359x66709fa8;
        this.f313935e = str;
    }

    @Override // dg5.v
    public boolean a(android.view.View view, android.graphics.Point point, int i17, long j17, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p7 p7Var) {
        dg5.t tVar = this.f313938h;
        tVar.f313930d = new rl5.r(tVar.f313933g.f313934d);
        tVar.f313931e = new dg5.s(tVar);
        int i18 = point.x;
        int i19 = point.y;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = p7Var.f289498c;
        tVar.getClass();
        if (l4Var == null) {
            return true;
        }
        tVar.f313932f = l4Var.h1();
        tVar.f313930d.g(view, i17, j17, tVar, tVar.f313931e, i18, i19);
        return true;
    }

    @Override // dg5.v
    public void b(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p7 p7Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = p7Var.f289498c;
        if (l4Var == null) {
            return;
        }
        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
        java.lang.String h17 = l4Var.h1();
        ((qv.o) u2Var).getClass();
        boolean g17 = r01.z.g(h17);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8 = this.f313934d;
        if (g17) {
            android.content.Intent intent = new android.content.Intent(activityC22359x66709fa8, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.class);
            intent.putExtra("Contact_User", l4Var.h1());
            intent.putExtra("biz_chat_from_scene", 7);
            intent.addFlags(67108864);
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa82 = this.f313934d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC22359x66709fa82, arrayList.toArray(), "com/tencent/mm/ui/conversation/presenter/EnterpriseConversationPresenter", "onItemClick", "(Lcom/tencent/mm/ui/conversation/MergeBizChatConversationAdapter$BizChatConversationHolder;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC22359x66709fa82.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC22359x66709fa82, "com/tencent/mm/ui/conversation/presenter/EnterpriseConversationPresenter", "onItemClick", "(Lcom/tencent/mm/ui/conversation/MergeBizChatConversationAdapter$BizChatConversationHolder;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (!r01.z.l(l4Var.h1())) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("key_is_biz_chat", false);
            activityC22359x66709fa8.m80491x5d4f20c8(l4Var.h1(), bundle, true);
            c(r01.z.b(l4Var.h1()), 1, l4Var.d1());
            return;
        }
        qk.o b17 = r01.z.b(l4Var.h1());
        java.lang.String z07 = b17 == null ? null : b17.z0();
        if (z07 == null) {
            z07 = "";
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("rawUrl", z07);
        intent2.putExtra("useJs", true);
        intent2.putExtra("srcUsername", l4Var.h1());
        intent2.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
        intent2.putExtra("geta8key_scene", 51);
        intent2.addFlags(67108864);
        j45.l.j(activityC22359x66709fa8, "webview", ".ui.tools.WebViewUI", intent2, null);
        c(b17, 2, l4Var.d1());
    }

    public final void c(qk.o oVar, int i17, int i18) {
        r01.m y07 = r01.q3.bj().y0(this.f313935e);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14507, java.lang.Long.valueOf(y07 != null ? y07.f66046x771ad30a : 0L), java.lang.Long.valueOf(oVar != null ? oVar.w0() : 0L), java.lang.Long.valueOf(y07 != null ? y07.f66050x2a8d0441 : 0L), 1, java.lang.Integer.valueOf(i18 > 0 ? 1 : 2), java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.gi5 gi5Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f313936f;
        if (u3Var != null && u3Var.isShowing()) {
            this.f313936f.dismiss();
        }
        if (i17 == 0 && i18 == 0 && m1Var.mo808xfb85f7b0() == 1394) {
            r45.mi6 mi6Var = null;
            com.p314xaae8f345.mm.p944x882e457a.o oVar = ((er3.f) m1Var).f337564e;
            r45.li6 li6Var = (oVar == null || (fVar2 = oVar.f152243a.f152217a) == null) ? null : (r45.li6) fVar2;
            if (oVar != null && (fVar = oVar.f152244b.f152233a) != null) {
                mi6Var = (r45.mi6) fVar;
            }
            if (mi6Var == null || (gi5Var = mi6Var.f462084d) == null || gi5Var.f456821d != 0) {
                if (mi6Var == null || mi6Var.f462084d == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("EnterpriseConversationPresenter", "chuangchen onSceneEnd type:%s, err:resp == null", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("EnterpriseConversationPresenter", "chuangchen onSceneEnd type:%s, err:code:%s", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()), java.lang.Integer.valueOf(mi6Var.f462084d.f456821d));
                    return;
                }
            }
            if (li6Var.f461039e) {
                qk.o b17 = r01.z.b(li6Var.f461038d);
                b17.f66733x6baace8e |= 1;
                r45.ln4 ln4Var = new r45.ln4();
                ln4Var.f461192d = b17.f66733x6baace8e;
                ln4Var.f461193e = li6Var.f461038d;
                ((e21.z0) c01.d9.b().w()).c(new xg3.p0(47, ln4Var));
                r01.q3.cj().mo9952xce0038c9(b17, new java.lang.String[0]);
                ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).k(b17.f66748xdec927b);
                if (((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).u(b17.f66739xdfb76cc2) <= 0) {
                    ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).k(b17.f66739xdfb76cc2);
                } else {
                    c01.d9.b().k().b(b17.f66739xdfb76cc2);
                }
            }
        }
    }
}
