package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes9.dex */
public abstract class f7 {
    public static int a(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 v3Var) {
        if (v3Var == null) {
            return 0;
        }
        int m75886x3d79f549 = v3Var.m75886x3d79f549();
        int m75888x1c4fb41d = v3Var.m75888x1c4fb41d() - v3Var.m75890xc96f6de6();
        android.view.View m75885x6a486239 = v3Var.m75885x6a486239(m75886x3d79f549 - 1);
        return (m75885x6a486239 != null ? m75885x6a486239.getBottom() : 0) - m75888x1c4fb41d;
    }

    public static void b(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 v3Var, int i17, int i18, boolean z17, boolean z18) {
        int i19;
        if (v3Var == null) {
            return;
        }
        if ((v3Var.mo75757x2ce24761() < i17 && i17 < v3Var.mo75762xe81a1f0f()) && z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ScrollController", "setSelectionFromTop position22 %s smooth %s, y %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18));
        v3Var.mo75768x7ca79b52(i17, true);
        if (!z17 || !fp.h.c(24) || c(v3Var, i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
            v3Var.mo75771x46dba6a1(i17, i18);
            return;
        }
        int mo75762xe81a1f0f = v3Var.mo75762xe81a1f0f();
        int mo75757x2ce24761 = v3Var.mo75757x2ce24761();
        int c17 = v3Var.m75888x1c4fb41d() > 0 ? (int) ((i65.a.c(v3Var.m75887x76847179(), r0) / 712.0f) * 1800.0f) : 1800;
        if (i17 < mo75757x2ce24761) {
            c17 /= mo75757x2ce24761 - i17;
        } else if (i17 > mo75762xe81a1f0f) {
            c17 /= ((i17 - mo75762xe81a1f0f) + 1) * 2;
        } else if (i17 == v3Var.s().mo8143x7444f759() - 1) {
            int c18 = i65.a.c(v3Var.m75887x76847179(), a(v3Var));
            boolean z19 = v3Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19741x32830a33;
            if (z19) {
                i19 = i65.a.c(v3Var.m75887x76847179(), ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19741x32830a33) v3Var).getF272973h());
                if (i19 != 0) {
                    c18 -= i19;
                }
            } else {
                i19 = 0;
            }
            float f17 = c18;
            if (f17 >= 52.0f) {
                c17 = (int) ((52.0f / f17) * c17);
            }
            if (z19 && i19 < 15) {
                v3Var.m75886x3d79f549();
                long j17 = 0;
                if (j17 > 0) {
                    c17 = (int) (c17 + j17);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
        v3Var.mo75774x42b5b70c(i17, i18, c17);
    }

    public static boolean c(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 v3Var, int i17) {
        int mo75762xe81a1f0f = v3Var.mo75762xe81a1f0f();
        int mo75757x2ce24761 = v3Var.mo75757x2ce24761();
        if (i17 < mo75757x2ce24761 && mo75757x2ce24761 - i17 >= 20) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
            return true;
        }
        if (i17 <= mo75762xe81a1f0f || i17 - mo75762xe81a1f0f < 20) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
        return true;
    }
}
