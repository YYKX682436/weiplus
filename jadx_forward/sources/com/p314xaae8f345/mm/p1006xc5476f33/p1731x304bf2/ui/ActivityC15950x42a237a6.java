package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b²\u0006\u0016\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\n@\nX\u008a\u008e\u0002²\u0006\u0016\u0010\n\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/tencent/mm/plugin/game/ui/GameDebugView;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "com/tencent/mm/plugin/game/ui/v0", "com/tencent/mm/plugin/game/ui/e1", "com/tencent/mm/plugin/game/ui/l1", "", "kotlin.jvm.PlatformType", "url", "content", "plugin-game_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.game.ui.GameDebugView */
/* loaded from: classes14.dex */
public final class ActivityC15950x42a237a6 extends p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f222261d = 0;

    public final void N6(android.content.Context context, java.lang.String text, yz5.a onBtnClick, n0.o oVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onBtnClick, "onBtnClick");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1798208702);
        java.lang.Object obj = n0.e1.f415025a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.s0 s0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.s0(onBtnClick, context);
        int i18 = z0.t.f550455q1;
        float f17 = 5;
        l0.h.a(s0Var, d0.a3.g(d0.a3.f(d0.a2.g(z0.p.f550454d, f17, f17), 0.0f, 1, null), 50), false, null, null, null, null, null, null, u0.j.b(y0Var, -506656594, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.t0(text)), y0Var, 805306416, 508);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.u0(this, context, text, onBtnClick, i17);
        }
    }

    public final void O6(yz5.l onItemClick, n0.o oVar, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClick, "onItemClick");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1675878424);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(onItemClick) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i18 & 11) == 2 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f415025a;
            java.util.List i19 = kz5.c0.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.v0("reddot_switch", "红点配置开关"), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.v0("reddot_mock", "红点内容Mock"), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.v0("reddot_control", "红点控制中心"));
            int i27 = z0.t.f550455q1;
            z0.t e17 = d0.a3.e(z0.p.f550454d, 0.0f, 1, null);
            int i28 = e1.y.f327854l;
            e0.f.a(a0.b.c(e17, e1.y.f327848f, null, 2, null), null, null, false, null, null, null, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b1(i19, onItemClick), y0Var, 0, 254);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.c1(this, onItemClick, i17);
        }
    }

    public final void P6(java.lang.String title, boolean z17, yz5.a onBack, n0.o oVar, int i17) {
        int i18;
        boolean z18;
        z0.p pVar;
        n0.y0 y0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onBack, "onBack");
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.V(-832097380);
        if ((i17 & 14) == 0) {
            i18 = (y0Var2.e(title) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var2.f(z17) ? 32 : 16;
        }
        if ((i17 & ce1.h.f4368x366c91de) == 0) {
            i18 |= y0Var2.e(onBack) ? 256 : 128;
        }
        int i19 = i18;
        if ((i19 & 731) == 146 && y0Var2.v()) {
            y0Var2.O();
            y0Var = y0Var2;
        } else {
            java.lang.Object obj = n0.e1.f415025a;
            int i27 = z0.t.f550455q1;
            z0.p pVar2 = z0.p.f550454d;
            z0.t h17 = d0.a2.h(a0.b.c(d0.a3.g(d0.a3.f(pVar2, 0.0f, 1, null), 56), e1.a0.b(1535619839), null, 2, null), 16, 0.0f, 2, null);
            int i28 = z0.d.f550436a;
            z0.c cVar = z0.a.f550432k;
            y0Var2.U(693286680);
            d0.p pVar3 = d0.p.f306716a;
            s1.t0 a17 = d0.n2.a(d0.p.f306717b, cVar, y0Var2, 48);
            y0Var2.U(-1323940314);
            p2.f fVar = (p2.f) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e);
            p2.s sVar = (p2.s) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k);
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o);
            u1.f fVar2 = u1.g.f505127i1;
            fVar2.getClass();
            yz5.a aVar = u1.f.f505120b;
            yz5.q a18 = s1.g0.a(h17);
            if (!(y0Var2.f415294b instanceof n0.e)) {
                n0.l.a();
                throw null;
            }
            y0Var2.X();
            if (y0Var2.L) {
                y0Var2.j(aVar);
            } else {
                y0Var2.i0();
            }
            y0Var2.f415317y = false;
            fVar2.getClass();
            n0.i5.a(y0Var2, a17, u1.f.f505123e);
            fVar2.getClass();
            n0.i5.a(y0Var2, fVar, u1.f.f505122d);
            fVar2.getClass();
            n0.i5.a(y0Var2, sVar, u1.f.f505124f);
            fVar2.getClass();
            n0.i5.a(y0Var2, k4Var, u1.f.f505125g);
            y0Var2.n();
            ((u0.i) a18).mo147xb9724478(new n0.i4(y0Var2), y0Var2, 0);
            y0Var2.U(2058660585);
            y0Var2.U(-678309503);
            d0.q2 q2Var = d0.q2.f306731a;
            y0Var2.U(679325774);
            if (z17) {
                z0.t j17 = d0.a2.j(a0.d0.d(pVar2, false, null, null, onBack, 7, null), 0.0f, 0.0f, 8, 0.0f, 11, null);
                long b17 = p2.u.b(24);
                f2.r rVar = f2.r.f340351e;
                f2.r rVar2 = f2.r.f340357n;
                int i29 = e1.y.f327854l;
                z18 = false;
                pVar = pVar2;
                l0.e5.c("< ", j17, e1.y.f327844b, b17, null, rVar2, null, 0L, null, null, 0L, 0, false, 0, null, null, y0Var2, 200070, 0, 65488);
            } else {
                z18 = false;
                pVar = pVar2;
            }
            y0Var2.o(z18);
            long b18 = p2.u.b(18);
            f2.r rVar3 = f2.r.f340351e;
            f2.r rVar4 = f2.r.f340357n;
            int i37 = e1.y.f327854l;
            l0.e5.c(title, d0.o2.a(q2Var, pVar, 1.0f, false, 2, null), e1.y.f327844b, b18, null, rVar4, null, 0L, null, new l2.f(z17 ? 5 : 3), 0L, 0, false, 0, null, null, y0Var2, (i19 & 14) | 200064, 0, 64976);
            y0Var = y0Var2;
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.d1(this, title, z17, onBack, i17);
        }
    }

    public final void Q6(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.e1 navController, yz5.p content, n0.o oVar, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(navController, "navController");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-420185492);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(navController) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var.e(content) ? 32 : 16;
        }
        if ((i17 & ce1.h.f4368x366c91de) == 0) {
            i18 |= y0Var.e(this) ? 256 : 128;
        }
        int i19 = i18;
        if ((i19 & 731) == 146 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f415025a;
            z0.p pVar = z0.p.f550454d;
            z0.t e17 = d0.a3.e(pVar, 0.0f, 1, null);
            y0Var.U(-483455358);
            s1.t0 a17 = d0.j0.a(d0.p.f306719d, z0.a.f550433l, y0Var, 0);
            y0Var.U(-1323940314);
            n0.h3 h3Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e;
            p2.f fVar = (p2.f) y0Var.i(h3Var);
            n0.h3 h3Var2 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k;
            p2.s sVar = (p2.s) y0Var.i(h3Var2);
            n0.h3 h3Var3 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o;
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var.i(h3Var3);
            u1.g.f505127i1.getClass();
            yz5.a aVar = u1.f.f505120b;
            yz5.q a18 = s1.g0.a(e17);
            boolean z17 = y0Var.f415294b instanceof n0.e;
            if (!z17) {
                n0.l.a();
                throw null;
            }
            y0Var.X();
            if (y0Var.L) {
                y0Var.j(aVar);
            } else {
                y0Var.i0();
            }
            y0Var.f415317y = false;
            yz5.p pVar2 = u1.f.f505123e;
            n0.i5.a(y0Var, a17, pVar2);
            yz5.p pVar3 = u1.f.f505122d;
            n0.i5.a(y0Var, fVar, pVar3);
            yz5.p pVar4 = u1.f.f505124f;
            n0.i5.a(y0Var, sVar, pVar4);
            yz5.p pVar5 = u1.f.f505125g;
            n0.i5.a(y0Var, k4Var, pVar5);
            y0Var.n();
            ((u0.i) a18).mo147xb9724478(new n0.i4(y0Var), y0Var, 0);
            y0Var.U(2058660585);
            y0Var.U(-1163856341);
            d0.m0 m0Var = d0.m0.f306704a;
            x0.i0 i0Var = navController.f222904a;
            java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.l1) kz5.n0.i0(i0Var)).f222988a;
            boolean z18 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.l1) kz5.n0.i0(i0Var), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.h1.f222936b);
            y0Var.U(-865002006);
            boolean e18 = y0Var.e(navController);
            java.lang.Object y17 = y0Var.y();
            if (e18 || y17 == n0.n.f415153a) {
                y17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.f1(navController);
                y0Var.g0(y17);
            }
            y0Var.o(false);
            P6(str, z18, (yz5.a) y17, y0Var, (i19 << 3) & 7168);
            z0.t a19 = d0.k0.a(m0Var, pVar, 1.0f, false, 2, null);
            y0Var.U(733328855);
            s1.t0 c17 = d0.y.c(z0.a.f550422a, false, y0Var, 0);
            y0Var.U(-1323940314);
            p2.f fVar2 = (p2.f) y0Var.i(h3Var);
            p2.s sVar2 = (p2.s) y0Var.i(h3Var2);
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var2 = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var.i(h3Var3);
            yz5.q a27 = s1.g0.a(a19);
            if (!z17) {
                n0.l.a();
                throw null;
            }
            y0Var.X();
            if (y0Var.L) {
                y0Var.j(aVar);
            } else {
                y0Var.i0();
            }
            y0Var.f415317y = false;
            n0.i5.a(y0Var, c17, pVar2);
            n0.i5.a(y0Var, fVar2, pVar3);
            n0.i5.a(y0Var, sVar2, pVar4);
            n0.i5.a(y0Var, k4Var2, pVar5);
            y0Var.n();
            ((u0.i) a27).mo147xb9724478(new n0.i4(y0Var), y0Var, 0);
            y0Var.U(2058660585);
            y0Var.U(-2137368960);
            content.mo149xb9724478(y0Var, java.lang.Integer.valueOf((i19 >> 3) & 14));
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.g1(this, navController, content, i17);
        }
    }

    public final void R6(yz5.l onClick, n0.o oVar, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClick, "onClick");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(676216731);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(onClick) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var.e(this) ? 32 : 16;
        }
        if ((i18 & 91) == 18 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f415025a;
            O6(onClick, y0Var, (i18 & 112) | (i18 & 14));
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.m1(this, onClick, i17);
        }
    }

    public final void S6(n0.o oVar, int i17) {
        int i18;
        n0.y0 y0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15950x42a237a6 activityC15950x42a237a6;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.V(-492373598);
        if ((i17 & 14) == 0) {
            i18 = (y0Var2.e(this) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i18 & 11) == 2 && y0Var2.v()) {
            y0Var2.O();
            y0Var = y0Var2;
            activityC15950x42a237a6 = this;
        } else {
            java.lang.Object obj = n0.e1.f415025a;
            int i19 = z0.t.f550455q1;
            z0.p pVar = z0.p.f550454d;
            z0.t e17 = d0.a3.e(pVar, 0.0f, 1, null);
            y0Var2.U(-483455358);
            d0.p pVar2 = d0.p.f306716a;
            d0.l lVar = d0.p.f306719d;
            int i27 = z0.d.f550436a;
            s1.t0 a17 = d0.j0.a(lVar, z0.a.f550433l, y0Var2, 0);
            y0Var2.U(-1323940314);
            n0.h3 h3Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e;
            p2.f fVar = (p2.f) y0Var2.i(h3Var);
            n0.h3 h3Var2 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92185k;
            p2.s sVar = (p2.s) y0Var2.i(h3Var2);
            n0.h3 h3Var3 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92189o;
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var2.i(h3Var3);
            u1.f fVar2 = u1.g.f505127i1;
            fVar2.getClass();
            yz5.a aVar = u1.f.f505120b;
            yz5.q a18 = s1.g0.a(e17);
            n0.e eVar = y0Var2.f415294b;
            if (!(eVar instanceof n0.e)) {
                n0.l.a();
                throw null;
            }
            y0Var2.X();
            if (y0Var2.L) {
                y0Var2.j(aVar);
            } else {
                y0Var2.i0();
            }
            y0Var2.f415317y = false;
            fVar2.getClass();
            yz5.p pVar3 = u1.f.f505123e;
            n0.i5.a(y0Var2, a17, pVar3);
            fVar2.getClass();
            yz5.p pVar4 = u1.f.f505122d;
            n0.i5.a(y0Var2, fVar, pVar4);
            fVar2.getClass();
            yz5.p pVar5 = u1.f.f505124f;
            n0.i5.a(y0Var2, sVar, pVar5);
            fVar2.getClass();
            yz5.p pVar6 = u1.f.f505125g;
            n0.i5.a(y0Var2, k4Var, pVar6);
            y0Var2.n();
            ((u0.i) a18).mo147xb9724478(new n0.i4(y0Var2), y0Var2, 0);
            y0Var2.U(2058660585);
            y0Var2.U(-1163856341);
            android.content.Context context = (android.content.Context) y0Var2.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.a1.f92036b);
            y0Var2.U(-412300447);
            java.lang.Object y17 = y0Var2.y();
            int i28 = n0.o.f415162a;
            java.lang.Object obj2 = n0.n.f415153a;
            if (y17 == obj2) {
                y17 = n0.s4.c(V6(), null, 2, null);
                y0Var2.g0(y17);
            }
            n0.v2 v2Var = (n0.v2) y17;
            y0Var2.o(false);
            z0.t g17 = d0.a3.g(pVar, 100);
            y0Var2.U(733328855);
            int i29 = i18;
            s1.t0 c17 = d0.y.c(z0.a.f550422a, false, y0Var2, 0);
            y0Var2.U(-1323940314);
            p2.f fVar3 = (p2.f) y0Var2.i(h3Var);
            p2.s sVar2 = (p2.s) y0Var2.i(h3Var2);
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 k4Var2 = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4) y0Var2.i(h3Var3);
            fVar2.getClass();
            yz5.q a19 = s1.g0.a(g17);
            if (!(eVar instanceof n0.e)) {
                n0.l.a();
                throw null;
            }
            y0Var2.X();
            if (y0Var2.L) {
                y0Var2.j(aVar);
            } else {
                y0Var2.i0();
            }
            y0Var2.f415317y = false;
            fVar2.getClass();
            n0.i5.a(y0Var2, c17, pVar3);
            fVar2.getClass();
            n0.i5.a(y0Var2, fVar3, pVar4);
            fVar2.getClass();
            n0.i5.a(y0Var2, sVar2, pVar5);
            fVar2.getClass();
            n0.i5.a(y0Var2, k4Var2, pVar6);
            y0Var2.n();
            ((u0.i) a19).mo147xb9724478(new n0.i4(y0Var2), y0Var2, 0);
            y0Var2.U(2058660585);
            y0Var2.U(-2137368960);
            java.lang.String str = (java.lang.String) v2Var.mo128745x754a37bb();
            y0Var2.U(-348136195);
            boolean e18 = y0Var2.e(v2Var);
            java.lang.Object y18 = y0Var2.y();
            if (e18 || y18 == obj2) {
                y18 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.n1(v2Var);
                y0Var2.g0(y18);
            }
            yz5.l lVar2 = (yz5.l) y18;
            y0Var2.o(false);
            float f17 = 8;
            l0.c1.a(str, lVar2, a0.b.b(d0.a3.f(d0.a2.g(pVar, f17, f17), 0.0f, 1, null), e1.a0.c(4292934069L), i0.h.a(10)), false, false, null, null, null, null, null, false, null, null, null, false, 0, null, null, null, y0Var2, 48, 0, 524280);
            y0Var2.o(false);
            y0Var2.o(false);
            y0Var2.o(true);
            y0Var2.o(false);
            y0Var2.o(false);
            int i37 = (i29 << 9) & 7168;
            y0Var = y0Var2;
            N6(context, "触发数据库清理", com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.o1.f223223d, y0Var2, i37 | com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.v.f33752x366c91de);
            y0Var.U(-412299716);
            activityC15950x42a237a6 = this;
            boolean e19 = y0Var.e(v2Var) | y0Var.e(activityC15950x42a237a6);
            java.lang.Object y19 = y0Var.y();
            if (e19 || y19 == obj2) {
                y19 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1(activityC15950x42a237a6, v2Var);
                y0Var.g0(y19);
            }
            y0Var.o(false);
            int i38 = i37 | 56;
            N6(context, "清除红点签名算法缓存", (yz5.a) y19, y0Var, i38);
            y0Var.U(-412299392);
            boolean e27 = y0Var.e(v2Var) | y0Var.e(activityC15950x42a237a6);
            java.lang.Object y27 = y0Var.y();
            if (e27 || y27 == obj2) {
                y27 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.q1(activityC15950x42a237a6, v2Var);
                y0Var.g0(y27);
            }
            y0Var.o(false);
            N6(context, "设置红点验证模式None", (yz5.a) y27, y0Var, i38);
            y0Var.U(-412299108);
            boolean e28 = y0Var.e(v2Var) | y0Var.e(activityC15950x42a237a6);
            java.lang.Object y28 = y0Var.y();
            if (e28 || y28 == obj2) {
                y28 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.r1(activityC15950x42a237a6, v2Var);
                y0Var.g0(y28);
            }
            y0Var.o(false);
            N6(context, "设置红点验证模式Test", (yz5.a) y28, y0Var, i38);
            y0Var.U(-412298825);
            boolean e29 = y0Var.e(v2Var) | y0Var.e(activityC15950x42a237a6);
            java.lang.Object y29 = y0Var.y();
            if (e29 || y29 == obj2) {
                y29 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.s1(activityC15950x42a237a6, v2Var);
                y0Var.g0(y29);
            }
            y0Var.o(false);
            N6(context, "设置红点验证模式Full", (yz5.a) y29, y0Var, i38);
            y0Var.o(false);
            y0Var.o(false);
            y0Var.o(true);
            y0Var.o(false);
            y0Var.o(false);
            java.lang.Object obj3 = n0.e1.f415025a;
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.t1(activityC15950x42a237a6, i17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x01f8, code lost:
    
        if (r12 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x030b, code lost:
    
        if (r5 == r10) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T6(n0.o r66, int r67) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15950x42a237a6.T6(n0.o, int):void");
    }

    public final void U6(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-427031971);
        if ((i17 & 1) == 0 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f415025a;
            y0Var.U(-910470019);
            java.lang.Object y17 = y0Var.y();
            java.lang.Object obj2 = n0.n.f415153a;
            if (y17 == obj2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i2[] i2VarArr = {new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i2("GameDebugID.DeleteDuplicatedID", "删除重复的消息ID", "可反复发送同一个红点", com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.w.b("GameDebugID.DeleteDuplicatedID")), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i2("GameDebugID.UnrestrictedExposure", "红点曝光时间不受限制", "不受时间间隔限制", com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.w.b("GameDebugID.UnrestrictedExposure")), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i2("GameDebugID.NoTimeExpired", "红点不会过期", null, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.w.b("GameDebugID.NoTimeExpired")), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i2("GameDebugID.NoExposureDayLimit", "红点曝光每天次数不受限制", null, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.w.b("GameDebugID.NoExposureDayLimit")), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i2("GameDebugID.EnableReddotMock", "启用红点Mock", null, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.w.b("GameDebugID.EnableReddotMock")), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i2("GameDebugID.ForceSinatureRequestFail", "强制红点签名请求失败", null, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.w.b("GameDebugID.ForceSinatureRequestFail")), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i2("GameDebugID.ForceSignatureVerifyFail", "强制红点签名校验失败", null, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.w.b("GameDebugID.ForceSignatureVerifyFail"))};
                x0.i0 i0Var = new x0.i0();
                i0Var.addAll(kz5.z.z0(i2VarArr));
                y0Var.g0(i0Var);
                y17 = i0Var;
            }
            x0.i0 i0Var2 = (x0.i0) y17;
            y0Var.o(false);
            z0.t c17 = a0.b.c(d0.a3.e(z0.p.f550454d, 0.0f, 1, null), e1.y.f327848f, null, 2, null);
            y0Var.U(-910467971);
            boolean e17 = y0Var.e(i0Var2);
            java.lang.Object y18 = y0Var.y();
            if (e17 || y18 == obj2) {
                y18 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.g2(i0Var2);
                y0Var.g0(y18);
            }
            y0Var.o(false);
            e0.f.a(c17, null, null, false, null, null, null, false, (yz5.l) y18, y0Var, 100663296, 254);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.h2(this, i17);
        }
    }

    public final java.lang.String V6() {
        m53.c4 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.n();
        int i17 = n17 != null ? n17.f405136d : 0;
        int n18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("game_redot").n("gamecenter.reddot.signatureConfigCount");
        return (i17 != 0 ? i17 != 1 ? i17 != 2 ? "" : "红点验证模式: 完全校验" : "红点验证模式: 仅上报" : "红点验证模式: 关闭").concat("\n") + "算法配置记录数: " + n18;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.egv);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.cg7);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1064x3122af37 c1064x3122af37 = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1064x3122af37(this, null, 0, 6, null);
        c1064x3122af37.m7061xe9f5bdb7(u0.j.c(-1318579466, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.l2(this)));
        viewGroup.addView(c1064x3122af37);
    }
}
