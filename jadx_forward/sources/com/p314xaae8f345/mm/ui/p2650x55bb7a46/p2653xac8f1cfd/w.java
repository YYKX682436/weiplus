package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes15.dex */
public final class w {
    public w(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v m07;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v m08;
        if (dVar == null || f9Var == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m mVar = null;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = dVar.f542241c;
        if (z17) {
            sb5.d dVar2 = (sb5.d) cVar.a(sb5.d.class);
            if (dVar2 != null) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c0 c0Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c0) dVar2;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.l s07 = c0Var.s0(f9Var);
                if (s07 != null && (m08 = c0Var.m0(s07)) != null) {
                    mVar = m08.f281634a;
                }
                if (mVar == null) {
                    return;
                }
                mVar.f281000n = true;
                return;
            }
            return;
        }
        sb5.d dVar3 = (sb5.d) cVar.a(sb5.d.class);
        if (dVar3 != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c0 c0Var2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c0) dVar3;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.l s08 = c0Var2.s0(f9Var);
            if (s08 != null && (m07 = c0Var2.m0(s08)) != null) {
                mVar = m07.f281634a;
            }
            if (mVar == null) {
                return;
            }
            mVar.f281001o = true;
        }
    }

    public final void b(yb5.d dVar, android.view.View view, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        sb5.d dVar2;
        if (dVar == null || view == null || f9Var == null || (dVar2 = (sb5.d) dVar.f542241c.a(sb5.d.class)) == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c0 c0Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c0) dVar2;
        java.lang.String str = "onAppMsgWxaViewClick, msgInfo: " + c0Var.u0(f9Var);
        java.lang.String str2 = c0Var.f280390e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        android.util.LongSparseArray longSparseArray = c0Var.f280394i;
        if (longSparseArray == null) {
            longSparseArray = new android.util.LongSparseArray();
            c0Var.f280394i = longSparseArray;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v vVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v) longSparseArray.get(f9Var.I0());
        if (vVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onAppMsgWxaViewClick, appMsgWxaStatInfo is null");
            return;
        }
        boolean z17 = vVar.f281635b;
        vVar.f281635b = true;
        if (!z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doClickReport, msgId: ");
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m mVar = vVar.f281634a;
            sb6.append(mVar.f280988b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.s sVar = c0Var.f280393h;
            if (sVar != null) {
                java.lang.String str3 = sVar.f281420b;
                if (!(str3.length() == 0)) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6327x9460e539 c6327x9460e539 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6327x9460e539();
                    c6327x9460e539.f136844d = 1;
                    c6327x9460e539.f136845e = sVar.f281421c;
                    c6327x9460e539.f136846f = c6327x9460e539.b("ChatName", c0Var.v0(str3), true);
                    c6327x9460e539.f136847g = sVar.f281422d;
                    c6327x9460e539.f136848h = c6327x9460e539.b("SessionId", c0Var.v0(sVar.f281419a), true);
                    c6327x9460e539.f136849i = mVar.f280987a;
                    c6327x9460e539.f136850j = mVar.f280988b;
                    c6327x9460e539.f136851k = mVar.f280989c;
                    c6327x9460e539.f136852l = c6327x9460e539.b("SenderUsername", c0Var.v0(mVar.f280990d), true);
                    c6327x9460e539.f136853m = c6327x9460e539.b("AppId", c0Var.v0(mVar.f280991e), true);
                    c6327x9460e539.f136854n = c6327x9460e539.b("Username", c0Var.v0(mVar.f280992f), true);
                    c6327x9460e539.f136855o = c6327x9460e539.b("EnterPath", c0Var.v0(mVar.f280993g), true);
                    c6327x9460e539.f136856p = mVar.f280994h;
                    c6327x9460e539.f136857q = mVar.a();
                    c6327x9460e539.f136858r = mVar.f281000n ? 1 : 0;
                    c6327x9460e539.f136859s = mVar.f281001o ? 1 : 0;
                    c6327x9460e539.f136861u = mVar.f281002p ? 1 : 0;
                    c6327x9460e539.f136860t = c6327x9460e539.b("scoreNum", mVar.f281003q, true);
                    c6327x9460e539.k();
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "doClickReport, filter invalid statInfo");
        }
    }

    public final void c(yb5.d dVar, android.view.View view, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        sb5.d dVar2;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v m07;
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m mVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v m08;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m mVar2;
        if (dVar == null || view == null || f9Var == null || (dVar2 = (sb5.d) dVar.f542241c.a(sb5.d.class)) == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c0 c0Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c0) dVar2;
        boolean z17 = view instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg;
        java.lang.String str = c0Var.f280390e;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "maybeAppMsgWxaViewExpose, view: " + view + ", why?");
            return;
        }
        if (!c0Var.n0()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.l s07 = c0Var.s0(f9Var);
            if (s07 == null || (m08 = c0Var.m0(s07)) == null || (mVar2 = m08.f281634a) == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgWxaReportComponent", "markExpose, msgId: " + mVar2.f280987a);
            mVar2.f280998l = true;
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg xgVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg) view;
        android.util.SparseArray sparseArray = c0Var.f280395m;
        if (sparseArray == null) {
            sparseArray = new android.util.SparseArray();
            c0Var.f280395m = sparseArray;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) sparseArray.get(xgVar.hashCode());
        if (f9Var2 != null && f9Var.I0() == f9Var2.I0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "maybeAppMsgWxaViewExpose, msg is the same as originMsg, why?");
            return;
        }
        if (f9Var2 != null) {
            android.util.LongSparseArray longSparseArray = c0Var.f280394i;
            if (longSparseArray == null) {
                longSparseArray = new android.util.LongSparseArray();
                c0Var.f280394i = longSparseArray;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v vVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v) longSparseArray.get(f9Var2.I0());
            if (vVar == null || (mVar = vVar.f281634a) == null) {
                f0Var = null;
            } else {
                mVar.b(null);
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "maybeAppMsgWxaViewExpose, originMsg is not AppMsgWxa, originMsg: " + c0Var.u0(f9Var2) + ", why?");
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.l s08 = c0Var.s0(f9Var2);
            if (s08 != null) {
                android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = s08.f280920d;
                if (onAttachStateChangeListener != null) {
                    view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
                }
                s08.f280920d = null;
            }
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.l s09 = c0Var.s0(f9Var);
        if (s09 == null || (m07 = c0Var.m0(s09)) == null) {
            return;
        }
        android.util.SparseArray sparseArray2 = c0Var.f280395m;
        if (sparseArray2 == null) {
            sparseArray2 = new android.util.SparseArray();
            c0Var.f280395m = sparseArray2;
        }
        sparseArray2.put(xgVar.hashCode(), f9Var);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o oVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o(m07);
        s09.f280920d = oVar;
        view.addOnAttachStateChangeListener(oVar);
    }
}
