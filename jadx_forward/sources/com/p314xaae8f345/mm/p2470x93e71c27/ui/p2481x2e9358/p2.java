package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class p2 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272086a;

    public p2(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f272086a = c19666xfd6e2f33;
    }

    public void a() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var;
        int c17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C19985x2dc94ef9());
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272086a;
        if (c17 == 1 && (y4Var = c19666xfd6e2f33.f271488a3) != null) {
            if (!(!((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8) ((sb5.i0) y4Var.a().f542241c.a(sb5.i0.class))).A0().i("show_dialog_guide", false))) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8) ((sb5.i0) c19666xfd6e2f33.f271488a3.a().f542241c.a(sb5.i0.class))).O0(5);
                return;
            }
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8) ((sb5.i0) c19666xfd6e2f33.f271488a3.a().f542241c.a(sb5.i0.class))).A0().G("show_dialog_guide", true);
            final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(c19666xfd6e2f33.Z2, 2, 0);
            z2Var.y(c19666xfd6e2f33.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
            z2Var.F = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3() { // from class: com.tencent.mm.pluginsdk.ui.chat.p2$$a
                @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
                public final void a() {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.p2 p2Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.p2.this;
                    p2Var.getClass();
                    z2Var.B();
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8) ((sb5.i0) p2Var.f272086a.f271488a3.a().f542241c.a(sb5.i0.class))).O0(5);
                }
            };
            android.view.View inflate = android.view.LayoutInflater.from(c19666xfd6e2f33.Z2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e47, (android.view.ViewGroup) null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.vgk);
            com.p314xaae8f345.mm.ui.dl.i(textView.getPaint());
            textView.setTextSize(0, i65.a.f(c19666xfd6e2f33.Z2, com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r));
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o_w);
            com.p314xaae8f345.mm.ui.dl.i(textView2.getPaint());
            textView2.setTextSize(0, i65.a.f(c19666xfd6e2f33.Z2, com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r));
            z2Var.j(inflate);
            z2Var.x(1);
            z2Var.C();
            return;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.app.Activity activity = c19666xfd6e2f33.Z2;
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(activity, "android.permission.RECORD_AUDIO", 80, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "summerper checkPermission checkmicrophone[%s], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), c19666xfd6e2f33.Z2);
        if (a17) {
            int n17 = c01.d9.e().n();
            if (n17 != 4 && n17 != 6) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = c19666xfd6e2f33.E;
                if (j0Var == null || !j0Var.isShowing()) {
                    c19666xfd6e2f33.E = db5.e1.i(c19666xfd6e2f33.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
                    return;
                }
                return;
            }
            if (iq.b.C(c19666xfd6e2f33.getContext()) || iq.b.v(c19666xfd6e2f33.getContext()) || iq.b.e(c19666xfd6e2f33.getContext()) || iq.b.z(c19666xfd6e2f33.getContext())) {
                return;
            }
            c19666xfd6e2f33.V1 = 1;
            c19666xfd6e2f33.f271572p.setVisibility(8);
            c19666xfd6e2f33.Q1(com.p314xaae8f345.mm.R.C30861xcebc809e.f562770o3);
            nr.b.f420563a.a();
            c19666xfd6e2f33.E(3, false, -1);
            c19666xfd6e2f33.U0(false);
            int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.i(c19666xfd6e2f33.getContext(), c19666xfd6e2f33.m75453x591f0b97(), c19666xfd6e2f33.f271575p2) + c19666xfd6e2f33.f271592s.getHeight() + c19666xfd6e2f33.f271616w.getHeight();
            if (c19666xfd6e2f33.f271520g == null) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib(c19666xfd6e2f33.getContext(), false, null);
                c19666xfd6e2f33.f271520g = ibVar;
                c19666xfd6e2f33.addView(ibVar, new android.view.ViewGroup.LayoutParams(-1, i17));
                c19666xfd6e2f33.f271520g.m75547x6c4ebec7(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s2(c19666xfd6e2f33));
            }
            android.view.ViewGroup.LayoutParams layoutParams = c19666xfd6e2f33.f271520g.getLayoutParams();
            if (layoutParams != null && layoutParams.height != i17) {
                layoutParams.height = i17;
                c19666xfd6e2f33.f271520g.setLayoutParams(layoutParams);
            }
            c19666xfd6e2f33.f271520g.k(true);
            c19666xfd6e2f33.f271520g.h();
            c19666xfd6e2f33.f271520g.m75552x24830fe8(c19666xfd6e2f33.f271550l3);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var2 = c19666xfd6e2f33.f271488a3;
            if (y4Var2 != null) {
                c19666xfd6e2f33.f271520g.m75548xc0b135d0(y4Var2.c());
            }
            c19666xfd6e2f33.f271520g.setVisibility(0);
            c19666xfd6e2f33.f271520g.setTranslationY(i17);
            c19666xfd6e2f33.f271520g.animate().cancel();
            c19666xfd6e2f33.f271520g.animate().translationY(0.0f).withEndAction(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u2(c19666xfd6e2f33)).start();
            c19666xfd6e2f33.Z1 = true;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var3 = c19666xfd6e2f33.f271488a3;
            if (y4Var3 == null || y4Var3.a() == null || c19666xfd6e2f33.f271488a3.a().f542241c.a(yn.i.class) == null) {
                return;
            }
            yn.i iVar = (yn.i) c19666xfd6e2f33.f271488a3.a().f542241c.a(yn.i.class);
            int i18 = c19666xfd6e2f33.f271503d2;
            boolean z18 = c19666xfd6e2f33.Z1;
            java.util.Iterator it = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w3) iVar).f281682d.iterator();
            while (it.hasNext()) {
                ((yn.h) it.next()).k(i18, z18);
            }
        }
    }
}
