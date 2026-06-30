package f53;

/* loaded from: classes5.dex */
public final class j0 implements al5.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b f341194d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b) {
        this.f341194d = activityC15905x15a0ec7b;
    }

    @Override // al5.e0
    public final void J2(boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b = this.f341194d;
        activityC15905x15a0ec7b.A = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PostCommentDialogUI", "isKeyboardShow  = " + z17 + "   keyboardHeight = " + i17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC15905x15a0ec7b.f221545e;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameCommentInputTxt");
            throw null;
        }
        c22621x7603e017.m(z17);
        if (activityC15905x15a0ec7b.B) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15697x4d5ad03a c15697x4d5ad03a = activityC15905x15a0ec7b.f221556s;
            java.lang.String str = c15697x4d5ad03a != null ? c15697x4d5ad03a.f36429x9f88aca9 : null;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = activityC15905x15a0ec7b.f221545e;
            if (c22621x7603e0172 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameCommentInputTxt");
                throw null;
            }
            java.lang.String obj = c22621x7603e0172.getText().toString();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049 = activityC15905x15a0ec7b.f221547g;
            if (c22607x763d2049 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("linearRoot");
                throw null;
            }
            int height = c22607x763d2049.getHeight();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d20492 = activityC15905x15a0ec7b.f221547g;
            if (c22607x763d20492 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("linearRoot");
                throw null;
            }
            int paddingBottom = height - c22607x763d20492.getPaddingBottom();
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274588c;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ParamKey.f15121xc2d3420e, str);
            bundle.putBoolean("isKeyboardShow", z17);
            bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, obj);
            bundle.putInt("inputHeight", paddingBottom);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d20493 = activityC15905x15a0ec7b.f221547g;
            if (c22607x763d20493 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("linearRoot");
                throw null;
            }
            bundle.putInt("inputTop", c22607x763d20493.getHeight());
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str2, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b.d.class, null);
        } else {
            m33.y0 y0Var = m33.x0.f404877a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15697x4d5ad03a c15697x4d5ad03a2 = activityC15905x15a0ec7b.f221556s;
            java.lang.String str3 = c15697x4d5ad03a2 != null ? c15697x4d5ad03a2.f36429x9f88aca9 : null;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0173 = activityC15905x15a0ec7b.f221545e;
            if (c22621x7603e0173 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameCommentInputTxt");
                throw null;
            }
            java.lang.String obj2 = c22621x7603e0173.getText().toString();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d20494 = activityC15905x15a0ec7b.f221547g;
            if (c22607x763d20494 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("linearRoot");
                throw null;
            }
            int height2 = c22607x763d20494.getHeight();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d20495 = activityC15905x15a0ec7b.f221547g;
            if (c22607x763d20495 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("linearRoot");
                throw null;
            }
            m33.u0 u0Var = new m33.u0(obj2, 0, height2 - c22607x763d20495.getPaddingBottom(), z17);
            m33.w0 w0Var = (m33.w0) y0Var.f404878a.get(str3);
            if (w0Var != null) {
                w0Var.b(u0Var);
            }
        }
        if (z17) {
            activityC15905x15a0ec7b.X6().setVisibility(0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d20496 = activityC15905x15a0ec7b.f221547g;
            if (c22607x763d20496 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("linearRoot");
                throw null;
            }
            c22607x763d20496.setPadding(0, 0, 0, i17);
        } else {
            activityC15905x15a0ec7b.Y6();
            activityC15905x15a0ec7b.X6().setVisibility(8);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d20497 = activityC15905x15a0ec7b.f221547g;
            if (c22607x763d20497 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("linearRoot");
                throw null;
            }
            c22607x763d20497.setPadding(0, 0, 0, 0);
        }
        if (activityC15905x15a0ec7b.f221563z) {
            activityC15905x15a0ec7b.b7();
            activityC15905x15a0ec7b.f221563z = false;
        }
    }
}
