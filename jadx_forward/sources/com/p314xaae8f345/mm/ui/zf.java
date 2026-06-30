package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class zf implements com.p314xaae8f345.mm.ui.p2740x696c9db.od {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ag f294153a;

    public zf(com.p314xaae8f345.mm.ui.ag agVar) {
        this.f294153a = agVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.od
    public void a() {
        com.p314xaae8f345.mm.ui.ag agVar = this.f294153a;
        boolean K0 = agVar.f278667a.f278560n.K0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "[onDrawed] isReadyToStartAnim:%s ", java.lang.Boolean.valueOf(K0));
        if (K0) {
            com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3 = agVar.f278667a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(c21427xe5bb8a3.f278559m);
            c21427xe5bb8a3.f278560n.T0();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = c21427xe5bb8a3.f278560n;
            abstractC21611x7536149b.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseChattingUIFragment", "onDrawReadyForAnimStart called");
            ((hd5.j) ((hd5.v) ((ke5.a) abstractC21611x7536149b.B0()).f388573a).f362187e).a();
            com.p314xaae8f345.mm.ui.n8 n8Var = c21427xe5bb8a3.f278548b;
            if (n8Var != null) {
                com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = (com.p314xaae8f345.mm.ui.C21374x812c2fd3) n8Var;
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_chatting_ui_anim_suspend_request_layout, 1) == 1) {
                    com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 h17 = c21374x812c2fd3.f278294t.h(0);
                    if (h17 instanceof com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) {
                        ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) h17).w0(0L);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "Suspend requestLayout() disabled.");
                }
                com.p314xaae8f345.mm.ui.cf.f279625d.c();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LauncherUI.NewChattingTabUI", "Unexpecte situation, notifyChattingUIAnimationStart() failed.");
            }
            if (c21427xe5bb8a3.f278560n.m78658x28280f95() != null) {
                c21427xe5bb8a3.f278560n.m78658x28280f95().m81453x79889b46(false);
                c21427xe5bb8a3.f278560n.m78658x28280f95().startAnimation(c21427xe5bb8a3.f278566t);
            } else {
                c21427xe5bb8a3.f278560n.m7474xfb86a31b().startAnimation(c21427xe5bb8a3.f278566t);
            }
            c21427xe5bb8a3.f278549c.m81107xd394853f(null);
        }
    }
}
