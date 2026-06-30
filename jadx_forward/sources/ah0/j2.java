package ah0;

/* loaded from: classes8.dex */
public class j2 implements hh4.j {
    @Override // hh4.j
    public void k0(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        c16601x7ed0e40c.f66792x98981ec.m75945x2fec8307(1);
        r45.k97 k97Var = new r45.k97();
        try {
            k97Var.mo11468x92b714fd(c16601x7ed0e40c.f66790x225a93cf);
            int m75939xb282bd08 = k97Var.m75939xb282bd08(19);
            java.lang.String m75945x2fec8307 = k97Var.m75945x2fec8307(1);
            if (m75939xb282bd08 > -1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307)) {
                k97Var.m75945x2fec8307(9);
                int m75939xb282bd082 = k97Var.m75939xb282bd08(13);
                c16601x7ed0e40c.f66792x98981ec.m75945x2fec8307(1);
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).d(m75945x2fec8307, m75939xb282bd08, m75939xb282bd082, new java.lang.Object[0]);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.h0.f265734a.e(c16601x7ed0e40c);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WvTaskBarEventListener", "WebMultiTaskData parse fail", th6);
        }
    }

    @Override // hh4.j
    public void m6(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        int i17 = vx4.d.D;
        r45.k97 k97Var = new r45.k97();
        try {
            k97Var.mo11468x92b714fd(c16601x7ed0e40c.f66790x225a93cf);
            java.lang.String str = c16601x7ed0e40c.f66791xc8a07680;
            java.lang.String m75945x2fec8307 = k97Var.m75945x2fec8307(1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebMultiTaskHelper", "handleClicked, url:%s", m75945x2fec8307);
            int m75939xb282bd08 = k97Var.m75939xb282bd08(19);
            android.content.Intent intent = new android.content.Intent();
            try {
                r45.w60 w60Var = new r45.w60();
                w60Var.set(2, java.lang.Boolean.TRUE);
                intent.putExtra("key_multi_task_common_info", w60Var.mo14344x5f01b1f6());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebMultiTaskHelper", e17, "onTaskBarItemClicked", new java.lang.Object[0]);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).getClass();
            al3.d.b(intent, k97Var);
            intent.putExtra("rawUrl", m75945x2fec8307);
            intent.putExtra("minimize_secene", 0);
            intent.putExtra("float_ball_key", str);
            intent.putExtra("key_enable_teen_mode_check", true);
            intent.putExtra("key_enable_fts_quick", true);
            intent.putExtra("webpageTitle", k97Var.m75945x2fec8307(4));
            if (m75939xb282bd08 > -1) {
                boolean z17 = m75939xb282bd08 == 5 || m75939xb282bd08 == 16;
                int m75939xb282bd082 = k97Var.m75939xb282bd08(13);
                int m75939xb282bd083 = k97Var.m75939xb282bd08(14);
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(m75939xb282bd082)) {
                    if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(context == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context, m75945x2fec8307, m75939xb282bd08, z17, m75939xb282bd082, m75939xb282bd083, intent)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebMultiTaskHelper", "openWebPage, use fast Load");
                        return;
                    }
                }
            }
            if (context == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.h0.f265734a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.h0.f265737d.remove(c16601x7ed0e40c.f66791xc8a07680);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebMultiTaskHelper", "WebMultiTaskData parse fail", th6);
        }
    }

    @Override // hh4.j
    public void p0(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        c16601x7ed0e40c.f66792x98981ec.m75945x2fec8307(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.h0.f265734a.f(c16601x7ed0e40c);
    }
}
