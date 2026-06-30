package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class z4 implements vp.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f218181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 f218182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f218183c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.a1 f218184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f218185e;

    public z4(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 c15442xfd56d647, so2.u1 u1Var, bb2.a1 a1Var, bb2.w1 w1Var) {
        this.f218181a = s0Var;
        this.f218182b = c15442xfd56d647;
        this.f218183c = u1Var;
        this.f218184d = a1Var;
        this.f218185e = w1Var;
    }

    @Override // vp.w
    public void a(boolean z17) {
    }

    @Override // vp.w
    public void b(wp.a danmaku, zp.m touchPoint, zp.d dVar) {
        java.lang.Class cls;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar;
        android.view.View p17;
        bb2.w1 bulletManager;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.C15413x7c45044c X6;
        bb2.w1 bulletManager2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(danmaku, "danmaku");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(touchPoint, "touchPoint");
        java.lang.Object obj = danmaku.f529887y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.bullet.FinderBulletInfo");
        bb2.o oVar = (bb2.o) obj;
        android.content.Context context = this.f218181a.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar2 != null ? nyVar2.V6() : null;
        float f17 = touchPoint.f556458d + (danmaku.f529883u / 2.0f);
        float f18 = touchPoint.f556459e + danmaku.f529884v;
        if (f17 <= 0.0f || f18 <= 0.0f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderBulletUIC", "danmakuClick: error xOffset=" + f17 + ", yOffset=" + f18);
            return;
        }
        bb2.m0 m0Var = bb2.m0.f100451a;
        android.app.Activity m80379x76847179 = this.f218182b.m80379x76847179();
        pf5.u uVar = pf5.u.f435469a;
        r45.qt2 V62 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) uVar.b(this.f218182b.m80379x76847179()).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        so2.u1 u1Var = this.f218183c;
        jSONObject.put("bs_id", pm0.v.u(oVar.f100459a.m75942xfb822ef2(0)));
        jSONObject.put("feedid", pm0.v.u(u1Var.mo2128x1ed62e84()));
        m0Var.a(m80379x76847179, V62, "bullet_screen", true, jSONObject, this.f218182b.a7(), oVar.f100459a.m75939xb282bd08(6));
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("bs_id", pm0.v.u(oVar.f100459a.m75942xfb822ef2(0)));
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u(this.f218183c.mo2128x1ed62e84()));
        java.lang.String m75945x2fec8307 = oVar.f100459a.m75945x2fec8307(2);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        lVarArr[2] = new jz5.l("bs_content", m75945x2fec8307);
        lVarArr[3] = new jz5.l("bs_createtime", java.lang.Long.valueOf(oVar.f100459a.m75939xb282bd08(4)));
        bb2.a1 a1Var = this.f218182b.f215037q;
        long j17 = 1000;
        lVarArr[4] = new jz5.l("post_play_sec", java.lang.Integer.valueOf((int) (((a1Var == null || (bulletManager2 = a1Var.getBulletManager()) == null) ? 0L : bulletManager2.f100572d) / j17)));
        lVarArr[5] = new jz5.l("screen_type", java.lang.Integer.valueOf(this.f218182b.m80379x76847179().getResources().getConfiguration().orientation == 2 ? 1 : 2));
        lVarArr[6] = new jz5.l("bs_type", 1);
        lVarArr[7] = new jz5.l("post_play_times", java.lang.Integer.valueOf(((ey2.v2) uVar.e(c61.l7.class).a(ey2.v2.class)).O6(this.f218183c.mo2128x1ed62e84()) + 1));
        java.lang.String a17 = hc2.k.a(kz5.c1.k(lVarArr));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0 l0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a;
        android.app.Activity context2 = this.f218182b.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        if (context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            cls = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class;
            nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(cls);
        } else {
            cls = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class;
            nyVar = null;
        }
        java.lang.Class cls2 = cls;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.h(l0Var, nyVar != null ? nyVar.V6() : null, this.f218183c.getFeedObject(), 49, hc2.k.a(kz5.c1.k(new jz5.l("feedActionType", 49), new jz5.l("strValue", a17))), 0, null, 48, null);
        bb2.v2 v2Var = danmaku instanceof bb2.v2 ? (bb2.v2) danmaku : null;
        if (v2Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 c15442xfd56d647 = this.f218182b;
            in5.s0 s0Var = this.f218181a;
            bb2.a1 a1Var2 = this.f218184d;
            r45.qt2 qt2Var = V6;
            so2.u1 feed = this.f218183c;
            bb2.w1 w1Var = this.f218185e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBulletUIC", "danmakuClick: xOffset=" + f17 + ", yOffset=" + f18 + ", info=" + oVar + ", touchPoint=" + touchPoint + ", feedId=" + pm0.v.u(c15442xfd56d647.f215039s));
            yp.o oVar2 = v2Var.H;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(oVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.bullet.BulletViewHolder");
            bb2.b bVar = (bb2.b) oVar2;
            oVar.f100459a.m75939xb282bd08(6);
            bVar.f100337d.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563097wq);
            danmaku.f529886x = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) s0Var.p(com.p314xaae8f345.mm.R.id.ghd);
            if (c15178x4303ff90 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15195x130b2a6d c15195x130b2a6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15195x130b2a6d) s0Var.p(com.p314xaae8f345.mm.R.id.frt);
                if (c15195x130b2a6d != null && !c15195x130b2a6d.f212235x1) {
                    cw2.ca.d(c15195x130b2a6d, "bulletClick", false, 2, null);
                }
            } else if (!c15178x4303ff90.isSeekMode) {
                cw2.ca.d(c15178x4303ff90, "bulletClick", false, 2, null);
                c15442xfd56d647.Y6(s0Var, true);
            }
            vp.x d17 = a1Var2.getBulletManager().d();
            d17.f(true);
            d17.f520385d.mo172410x31e85dfb();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt) uVar.c(c15442xfd56d647.m158354x19263085()).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt.class);
            boolean Z6 = ptVar != null ? ptVar.Z6() : false;
            if (!Z6) {
                p17 = s0Var.p(com.p314xaae8f345.mm.R.id.b1y);
            } else if (ptVar == null || (X6 = ptVar.X6()) == null || (p17 = X6.getBulletStubView()) == null) {
                return;
            }
            android.view.View view = p17;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = c15442xfd56d647.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) m158354x19263085;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            r45.oo bulletInfo = oVar.f100459a;
            boolean a76 = c15442xfd56d647.a7();
            bb2.a1 a1Var3 = c15442xfd56d647.f215037q;
            int i17 = (int) (((a1Var3 == null || (bulletManager = a1Var3.getBulletManager()) == null) ? 0L : bulletManager.f100572d) / j17);
            bb2.a1 a1Var4 = c15442xfd56d647.f215037q;
            bb2.w1 bulletManager3 = a1Var4 != null ? a1Var4.getBulletManager() : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.x4 x4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.x4(bVar, oVar, danmaku, s0Var, c15442xfd56d647, w1Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.y4 y4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.y4(a1Var2, danmaku);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bulletInfo, "bulletInfo");
            bb2.l0.f100443c = false;
            com.p314xaae8f345.mm.p944x882e457a.i iVar = bb2.l0.f100444d;
            if (iVar != null) {
                iVar.j();
            }
            az2.f fVar = bb2.l0.f100445e;
            if (fVar != null) {
                fVar.b();
            }
            bb2.l0.f100444d = null;
            bb2.l0.f100445e = null;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            r45.qt2 V63 = qt2Var == null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activityC21401x6ce6f73f).a(cls2)).V6() : qt2Var;
            view.getLocationInWindow(new int[2]);
            int i18 = (int) (r4[0] + f17);
            int i19 = (int) (r4[1] + f18);
            bb2.j0 j0Var = new bb2.j0(bulletInfo, activityC21401x6ce6f73f, arrayList, feed, V63, bulletManager3, a76, Z6);
            bb2.g0 g0Var = new bb2.g0(bulletInfo, view, activityC21401x6ce6f73f, feed, s0Var, V63, a76, bulletManager3, Z6, f17, f18, i17, x4Var, y4Var);
            bb2.k0 k0Var = new bb2.k0(x4Var);
            if (i18 <= 0 || i19 <= 0) {
                return;
            }
            rl5.r rVar = bb2.l0.f100442b;
            if (rVar != null) {
                rVar.a();
            }
            rl5.r rVar2 = new rl5.r(view.getContext());
            rVar2.C = true;
            rVar2.V = true;
            rVar2.L = k0Var;
            rVar2.Y = new bb2.i0(rVar2);
            bb2.l0.f100442b = rVar2;
            rVar2.f(view, j0Var, g0Var, i18, i19);
        }
    }

    @Override // vp.w
    public void c(java.util.List list) {
    }
}
