package sj3;

/* loaded from: classes14.dex */
public final class c2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f489981d;

    public c2(sj3.g3 g3Var) {
        this.f489981d = g3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$checkScreenProjector$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sj3.g3 g3Var = this.f489981d;
        g3Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "onScreenCastClicked: ");
        zj3.g gVar = zj3.g.f554835a;
        zj3.g.f554837c = java.lang.System.currentTimeMillis();
        gVar.b(1, 1);
        boolean a17 = zj3.j.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = g3Var.f490053a;
        if (a17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.f231679f++;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t != null) {
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t.f153139d;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProjectReportHelper", "markClickFileScreenProject");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1538L, 0L, 1L);
            serviceConnectionC16581x3d1d6bd2.U6();
        } else {
            if (g3Var.g().getVisibility() != 0) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(serviceConnectionC16581x3d1d6bd2, 2, 3, false);
                z2Var.y(serviceConnectionC16581x3d1d6bd2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
                z2Var.x(1);
                z2Var.z(android.graphics.Color.parseColor("#07C160"));
                z2Var.i(com.p314xaae8f345.mm.R.C30864xbddafb2a.cia);
                z2Var.F = new sj3.s2(z2Var, g3Var);
                z2Var.C();
            } else {
                android.view.View g17 = g3Var.g();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(g17, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "onScreenCastClicked", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                g17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(g17, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "onScreenCastClicked", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(serviceConnectionC16581x3d1d6bd2, 1, 3, false);
                z2Var2.m(serviceConnectionC16581x3d1d6bd2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), serviceConnectionC16581x3d1d6bd2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibn));
                z2Var2.v(android.graphics.Color.parseColor("#07C160"));
                z2Var2.o(0);
                z2Var2.i(com.p314xaae8f345.mm.R.C30864xbddafb2a.cia);
                sj3.t2 t2Var = new sj3.t2(z2Var2);
                sj3.u2 u2Var = new sj3.u2(z2Var2, g3Var);
                z2Var2.D = t2Var;
                z2Var2.E = u2Var;
                z2Var2.C();
            }
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().a(35);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_screen_project_info");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
            M.putBoolean("screen_project_has_been_educated", true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$checkScreenProjector$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
