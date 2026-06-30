package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class pl {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.pl f286810a = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.pl();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f286811b;

    public static final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1 holder, ot0.q qVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.String str = qVar != null ? qVar.f430187f : null;
        if (str == null || r26.n0.N(str)) {
            holder.H.setText("");
            holder.H.setVisibility(8);
            return;
        }
        holder.H.setText(str);
        holder.H.setVisibility(0);
        android.widget.TextView textView = holder.H;
        if (android.text.TextUtils.isEmpty(str) || textView == null) {
            return;
        }
        textView.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ol(textView, str));
    }

    public static final boolean e(ot0.q qVar, k91.v5 v5Var, int i17) {
        boolean z17;
        boolean z18;
        int i18;
        if (qVar == null) {
            return false;
        }
        if (v5Var == null) {
            ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
            if (aVar != null && (i18 = aVar.f429895r) > 0) {
                int i19 = i18 & 1;
                int i27 = (i18 >> i17) & 1;
                if (i19 == 1 && i27 == 1) {
                    z17 = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[isShowFlagshipTag] attrs is null, get showFlagshipFlag from AppContentAppBrandPiece showFlagshipFlag:%b", java.lang.Boolean.valueOf(z17));
                }
            }
            z17 = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[isShowFlagshipTag] attrs is null, get showFlagshipFlag from AppContentAppBrandPiece showFlagshipFlag:%b", java.lang.Boolean.valueOf(z17));
        } else {
            ot0.a aVar2 = (ot0.a) qVar.y(ot0.a.class);
            if (v5Var.w0() == null || qVar.A2 <= v5Var.w0().f158977d || aVar2 == null) {
                int i28 = v5Var.u0() != null ? v5Var.u0().f387176r : 0;
                if (i28 > 0) {
                    int i29 = i28 & 1;
                    int i37 = (i28 >> i17) & 1;
                    if (i29 == 1 && i37 == 1) {
                        z17 = true;
                    }
                }
                z17 = false;
            } else {
                int i38 = aVar2.f429895r;
                if (i38 > 0) {
                    int i39 = (i38 >> i17) & 1;
                    if ((i38 & 1) == 1 && i39 == 1) {
                        z18 = true;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[isShowFlagshipTag] appbrandVersion:%d, appVersion:%d", java.lang.Integer.valueOf(qVar.A2), java.lang.Integer.valueOf(v5Var.w0().f158977d));
                        z17 = z18;
                    }
                }
                z18 = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[isShowFlagshipTag] appbrandVersion:%d, appVersion:%d", java.lang.Integer.valueOf(qVar.A2), java.lang.Integer.valueOf(v5Var.w0().f158977d));
                z17 = z18;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[isShowFlagshipTag] use attrs:%b", java.lang.Boolean.valueOf(z17));
        }
        if (z17) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.wxapp_flagship_store, 0) == 1;
        }
        return false;
    }

    public static final void f() {
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_fake_native_profile, 0) == 1) || f286811b) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6.class)).P4(null, "wx27a2b9eea2cf1a62", "pages/index/index.html", 16);
        f286811b = true;
    }

    public static final boolean g(ot0.q qVar, k91.v5 v5Var, int i17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.pl plVar = f286810a;
        return plVar.b(qVar, v5Var, 2) || plVar.b(qVar, v5Var, i17);
    }

    public static final boolean i(ot0.q qVar, k91.v5 v5Var, int i17) {
        ot0.a aVar = qVar != null ? (ot0.a) qVar.y(ot0.a.class) : null;
        boolean z17 = aVar != null && aVar.f429894q;
        return f286810a.h(qVar != null ? qVar.A2 : 0, aVar != null ? aVar.f429893p : 0, z17, v5Var, i17);
    }

    public final boolean b(ot0.q qVar, k91.v5 v5Var, int i17) {
        int i18;
        boolean z17 = false;
        if (qVar == null) {
            return false;
        }
        if (v5Var == null) {
            ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
            if (aVar != null && (i18 = aVar.f429896s) > 0) {
                int i19 = i18 & 1;
                int i27 = (i18 >> i17) & 1;
                if (i19 == 1 && i27 == 1) {
                    z17 = true;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[wantShowFinancialLicenseFlag] attrs is null, get showFinancialLicenseFlag flag from AppContentAppBrandPiece showFinancialLicenseFlag:%b", java.lang.Boolean.valueOf(z17));
        } else {
            ot0.a aVar2 = (ot0.a) qVar.y(ot0.a.class);
            if (v5Var.w0() == null || qVar.A2 <= v5Var.w0().f158977d || aVar2 == null) {
                int i28 = v5Var.u0() != null ? v5Var.u0().f387177s : 0;
                if (i28 > 0) {
                    int i29 = i28 & 1;
                    int i37 = (i28 >> i17) & 1;
                    if (i29 == 1 && i37 == 1) {
                        z17 = true;
                    }
                }
            } else {
                int i38 = aVar2.f429896s;
                if (i38 > 0) {
                    int i39 = (i38 >> i17) & 1;
                    if ((i38 & 1) == 1 && i39 == 1) {
                        z17 = true;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[wantShowFinancialLicenseFlag] appbrandVersion:%d, appVersion:%d", java.lang.Integer.valueOf(qVar.A2), java.lang.Integer.valueOf(v5Var.w0().f158977d));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[wantShowFinancialLicenseFlag] use attrs:%b", java.lang.Boolean.valueOf(z17));
        }
        return z17;
    }

    public final boolean c(s05.d dVar, k91.v5 v5Var, int i17) {
        boolean z17 = false;
        if (v5Var == null) {
            int u17 = dVar != null ? dVar.u() : 0;
            if (u17 > 0) {
                int i18 = u17 & 1;
                int i19 = (u17 >> i17) & 1;
                if (i18 == 1 && i19 == 1) {
                    z17 = true;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[wantShowFinancialLicenseFlag] attrs is null, get showFinancialLicenseFlag flag from AppContentAppBrandPiece showFinancialLicenseFlag:%b", java.lang.Boolean.valueOf(z17));
        } else {
            int m163515x52c258a2 = dVar != null ? dVar.m163515x52c258a2() : 0;
            if (v5Var.w0() == null || m163515x52c258a2 <= v5Var.w0().f158977d) {
                k91.j5 u07 = v5Var.u0();
                int i27 = u07 != null ? u07.f387177s : 0;
                if (i27 > 0) {
                    int i28 = i27 & 1;
                    int i29 = (i27 >> i17) & 1;
                    if (i28 == 1 && i29 == 1) {
                        z17 = true;
                    }
                }
            } else {
                int u18 = dVar != null ? dVar.u() : 0;
                if (u18 > 0) {
                    int i37 = u18 & 1;
                    int i38 = (u18 >> i17) & 1;
                    if (i37 == 1 && i38 == 1) {
                        z17 = true;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[wantShowFinancialLicenseFlag] appbrandVersion:%d, appVersion:%d", java.lang.Integer.valueOf(m163515x52c258a2), java.lang.Integer.valueOf(v5Var.w0().f158977d));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[wantShowFinancialLicenseFlag] use attrs:%b", java.lang.Boolean.valueOf(z17));
        }
        return z17;
    }

    public final boolean d(int i17, int i18, k91.v5 v5Var, int i19) {
        boolean z17;
        boolean z18;
        if (v5Var == null) {
            if (i18 > 0) {
                int i27 = i18 & 1;
                int i28 = (i18 >> i19) & 1;
                if (i27 == 1 && i28 == 1) {
                    z17 = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[wantShowRelievedBuyFlag] attrs is null, get showRelievedBuy flag from AppContentAppBrandPiece showRelievedBuy:%b", java.lang.Boolean.valueOf(z17));
                }
            }
            z17 = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[wantShowRelievedBuyFlag] attrs is null, get showRelievedBuy flag from AppContentAppBrandPiece showRelievedBuy:%b", java.lang.Boolean.valueOf(z17));
        } else {
            if (v5Var.w0() == null || i17 <= v5Var.w0().f158977d) {
                int i29 = v5Var.u0() != null ? v5Var.u0().f387175q : 0;
                if (i29 > 0) {
                    int i37 = i29 & 1;
                    int i38 = (i29 >> i19) & 1;
                    if (i37 == 1 && i38 == 1) {
                        z17 = true;
                    }
                }
                z17 = false;
            } else {
                if (i18 > 0) {
                    int i39 = i18 & 1;
                    int i47 = (i18 >> i19) & 1;
                    if (i39 == 1 && i47 == 1) {
                        z18 = true;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[wantShowRelievedBuyFlag] appbrandVersion:%d, appVersion:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(v5Var.w0().f158977d));
                        z17 = z18;
                    }
                }
                z18 = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[wantShowRelievedBuyFlag] appbrandVersion:%d, appVersion:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(v5Var.w0().f158977d));
                z17 = z18;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[wantShowRelievedBuyFlag] use attrs:%b", java.lang.Boolean.valueOf(z17));
        }
        return z17 & (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.relievedbuy, 0) == 1);
    }

    public final boolean h(int i17, int i18, boolean z17, k91.v5 v5Var, int i19) {
        boolean d17 = d(i17, i18, v5Var, 2);
        boolean d18 = d(i17, i18, v5Var, i19);
        boolean z18 = i19 == 16;
        if (d17) {
            return true;
        }
        return d18 && (!z18 || z17);
    }
}
