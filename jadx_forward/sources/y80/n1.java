package y80;

@j95.b
/* loaded from: classes8.dex */
public final class n1 extends i95.w implements z80.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f541420d = "MicroMsg.POIMoreActionSheetLogicService";

    public static final void Ai(y80.n1 n1Var, android.content.Context context, android.view.MenuItem menuItem, int i17, z80.s0 s0Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4 = n1Var.f541420d;
        if (menuItem == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "handleMenuSelect: menuItem null");
            return;
        }
        int itemId = menuItem.getItemId();
        z80.u0 u0Var = z80.u0.f552210d;
        if (itemId == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = s0Var.f552204c;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_content", va3.w.b(c16279x64cea23));
            intent.putExtra("Retr_Msg_Type", 9);
            o72.r3.a(intent, new com.p314xaae8f345.mm.p2610xe8058ca2.C21013x64a751f(c16279x64cea23.f226124m, c16279x64cea23.f226122h, java.lang.Double.valueOf(c16279x64cea23.f226120f), java.lang.Double.valueOf(c16279x64cea23.f226119e), java.lang.Double.valueOf(c16279x64cea23.f226121g)));
            j45.l.u(context, ".ui.transmit.MsgRetransmitUI", intent, null);
            yz5.l lVar = s0Var.f552206e;
            if (lVar != null) {
                lVar.mo146xb9724478(u0Var);
                return;
            }
            return;
        }
        z80.u0 u0Var2 = z80.u0.f552212f;
        if (itemId == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea232 = s0Var.f552204c;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str5 = c16279x64cea232.f226124m;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str5 == null) {
                str5 = "";
            }
            sb6.append(str5);
            sb6.append(' ');
            java.lang.String str6 = c16279x64cea232.f226122h;
            sb6.append(str6 != null ? str6 : "");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(sb6.toString());
            dp.a.m125853x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571894st, 0).show();
            yz5.l lVar2 = s0Var.f552206e;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(u0Var2);
                return;
            }
            return;
        }
        if (itemId == 3) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_poi_feedback_new_weapp, 0) == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
                l81.b1 b1Var = new l81.b1();
                b1Var.f398547b = "wx1cb063fc29603166";
                com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea233 = s0Var.f552204c;
                android.net.Uri.Builder buildUpon = android.net.Uri.parse("pages/homePage/homePage").buildUpon();
                buildUpon.appendQueryParameter("src", "wxlocation");
                if (c16279x64cea233 == null || (str2 = java.lang.Double.valueOf(c16279x64cea233.f226119e).toString()) == null) {
                    str2 = "";
                }
                buildUpon.appendQueryParameter("latitude", str2);
                if (c16279x64cea233 == null || (str3 = java.lang.Double.valueOf(c16279x64cea233.f226120f).toString()) == null) {
                    str3 = "";
                }
                buildUpon.appendQueryParameter("longitude", str3);
                java.lang.String str7 = c16279x64cea233 != null ? c16279x64cea233.f226124m : null;
                if (str7 == null) {
                    str7 = "";
                }
                buildUpon.appendQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, str7);
                java.lang.String str8 = c16279x64cea233 != null ? c16279x64cea233.f226122h : null;
                if (str8 == null) {
                    str8 = "";
                }
                buildUpon.appendQueryParameter("address", str8);
                str = c16279x64cea233 != null ? c16279x64cea233.f226127p : null;
                java.lang.String str9 = str != null ? str : "";
                if (r26.i0.y(str9, "qqmap_", false)) {
                    buildUpon.appendQueryParameter("poi_id", r26.n0.W(str9, "qqmap_"));
                    buildUpon.appendQueryParameter("poi_type", "1");
                } else if (r26.i0.y(str9, "nearby_", false)) {
                    buildUpon.appendQueryParameter("poi_id", r26.n0.W(str9, "nearby_"));
                    buildUpon.appendQueryParameter("poi_type", "2");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "createPOIFeedbackWeAppPageUrl: " + buildUpon.build());
                java.lang.String uri = buildUpon.build().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "toString(...)");
                b1Var.f398555f = uri;
                b1Var.f398565k = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.u1.f33827x366c91de;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).bj(context, b1Var);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea234 = s0Var.f552204c;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("showPOICorrectGuideView: ");
                sb7.append(c16279x64cea234 != null ? c16279x64cea234.f226124m : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, sb7.toString());
                java.lang.String str10 = c16279x64cea234 != null ? c16279x64cea234.f226127p : null;
                java.lang.String str11 = str10 == null ? "" : str10;
                java.lang.String str12 = c16279x64cea234 != null ? c16279x64cea234.f226124m : null;
                java.lang.String str13 = str12 == null ? "" : str12;
                str = c16279x64cea234 != null ? c16279x64cea234.f226122h : null;
                ((y80.e1) ((z80.m0) i95.n0.c(z80.m0.class))).wi(context, new z80.q0(str11, str13, str == null ? "" : str, c16279x64cea234 != null ? (float) c16279x64cea234.f226120f : 0.0f, c16279x64cea234 != null ? (float) c16279x64cea234.f226119e : 0.0f));
            }
            yz5.l lVar3 = s0Var.f552206e;
            if (lVar3 != null) {
                lVar3.mo146xb9724478(u0Var2);
            }
        }
    }

    public static final void wi(y80.n1 n1Var, db5.g4 g4Var, z80.v0 v0Var, z80.s0 s0Var) {
        n1Var.getClass();
        if (g4Var == null) {
            return;
        }
        int ordinal = v0Var.f552216a.ordinal();
        z80.u0 u0Var = v0Var.f552216a;
        if (ordinal == 0) {
            g4Var.j(u0Var.ordinal(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572092yh), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m), v0Var.f552217b);
            return;
        }
        if (ordinal == 1) {
            g4Var.clear();
            ((db5.h4) g4Var.j(u0Var.ordinal(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.guz), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m), v0Var.f552217b)).f309905p = android.text.TextUtils.TruncateAt.END;
            return;
        }
        boolean z17 = v0Var.f552217b;
        if (ordinal == 2) {
            g4Var.l(u0Var.ordinal(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.guw), com.p314xaae8f345.mm.R.raw.f80513x94e251bf, z17);
        } else {
            if (ordinal != 3) {
                return;
            }
            g4Var.l(u0Var.ordinal(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.p3o), com.p314xaae8f345.mm.R.raw.f80832xde18c21a, z17);
        }
    }
}
