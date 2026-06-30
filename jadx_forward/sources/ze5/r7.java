package ze5;

/* loaded from: classes9.dex */
public final class r7 {
    public r7(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final z01.s a(ze5.r7 r7Var, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        r7Var.getClass();
        z01.s sVar = new z01.s();
        sVar.f550689d = java.lang.Long.valueOf(f9Var.m124847x74d37ac6());
        sVar.f550690e = f9Var.Q0();
        o15.a aVar = new o15.a();
        java.lang.String j17 = f9Var.j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getContent(...)");
        aVar.m126728xdc93280d(j17);
        sVar.f550691f = aVar;
        return sVar;
    }

    public static final void b(ze5.r7 r7Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar) {
        int t17;
        r7Var.getClass();
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        java.lang.String j17 = f9Var.j();
        boolean z17 = f9Var.A0() == 0;
        java.lang.String Q0 = z17 ? f9Var.Q0() : "";
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0()) && z17 && !((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) dVar.f542241c.a(sb5.f.class))).f280286r && (t17 = c01.w9.t(j17)) != -1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j17);
            java.lang.String substring = j17.substring(0, t17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            int length = substring.length() - 1;
            int i17 = 0;
            boolean z18 = false;
            while (i17 <= length) {
                boolean z19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(substring.charAt(!z18 ? i17 : length), 32) <= 0;
                if (z18) {
                    if (!z19) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z19) {
                    i17++;
                } else {
                    z18 = true;
                }
            }
            Q0 = substring.subSequence(i17, length + 1).toString();
            java.lang.String substring2 = j17.substring(t17 + 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
            int length2 = substring2.length() - 1;
            int i18 = 0;
            boolean z27 = false;
            while (i18 <= length2) {
                boolean z28 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(substring2.charAt(!z27 ? i18 : length2), 32) <= 0;
                if (z27) {
                    if (!z28) {
                        break;
                    } else {
                        length2--;
                    }
                } else if (z28) {
                    i18++;
                } else {
                    z27 = true;
                }
            }
            j17 = substring2.subSequence(i18, length2 + 1).toString();
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.b9 H6 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).H6(j17);
        if (!x51.t1.b(Q0) && com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(Q0)) {
            Q0 = "";
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5689x3d19c202 c5689x3d19c202 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5689x3d19c202();
        am.ej ejVar = c5689x3d19c202.f136014g;
        ejVar.f88092a = 1;
        ejVar.f88094c = f9Var;
        c5689x3d19c202.e();
        java.lang.String str = c5689x3d19c202.f136015h.f88213a;
        if (x51.t1.b(H6.f275313f) && !H6.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemLocationCardMvvm", "invalid poi: %s, %s", H6.f275313f, java.lang.Boolean.valueOf(H6.c()));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("kMsgId", f9Var.m124847x74d37ac6());
        intent.putExtra("map_view_type", 1);
        intent.putExtra("map_indoor_support", 1);
        intent.putExtra("kwebmap_slat", H6.f275309b);
        intent.putExtra("kwebmap_lng", H6.f275310c);
        intent.putExtra("kwebmap_scale", H6.f275311d);
        intent.putExtra("kPoiName", H6.f275313f);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        intent.putExtra("kisUsername", c01.a2.e(Q0));
        intent.putExtra("Kwebmap_locaion", str);
        intent.putExtra("kimg_path", g83.a.a());
        intent.putExtra("map_talker_name", f9Var.Q0());
        intent.putExtra("view_type_key", 0);
        intent.putExtra("kwebmap_from_to", true);
        intent.putExtra("kPoi_url", H6.f275318k);
        intent.putExtra("kPoiid", H6.f275319l);
        intent.putExtra("KIsFromPoiList", H6.f275320m);
        intent.putExtra("KPoiCategoryTips", H6.f275321n);
        intent.putExtra("kPoiBusinessHour", H6.f275322o);
        intent.putExtra("KPoiPhone", H6.f275323p);
        intent.putExtra("KPoiPriceTips", H6.f275324q);
        intent.putExtra("kBuildingID", H6.f275325r);
        intent.putExtra("kFloorName", H6.f275326s);
        intent.putExtra("key_drawer_allow_no_poiid", true);
        java.lang.String J0 = f9Var.J0();
        if (J0 == null) {
            J0 = "";
        }
        intent.putExtra("soso_street_view_url", J0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 2, "");
        if (dVar.D()) {
            intent.putExtra("type_tag", 2);
        } else {
            intent.putExtra("type_tag", 1);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("poi_from_chat_type", dVar.D() ? 2 : 1);
        bundle.putInt("poi_from_user_type", z17 ? 1 : 2);
        bundle.putString("poi_from_chat_name", z17 ? f9Var.Q0() : gm0.j1.b().k());
        intent.putExtra("poi_from_chat_report_bundle", bundle);
        j45.l.r(dVar.f542242d, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, 2002, new ze5.q7(dVar));
    }

    public static final boolean c(ze5.r7 r7Var, yb5.d dVar, db5.g4 g4Var, android.view.View view, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        r7Var.getClass();
        java.lang.Object tag = view.getTag();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = tag instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag : null;
        if (erVar == null) {
            return false;
        }
        int d17 = erVar.d();
        if (f9Var.P0() == 5) {
            g4Var.c(d17, 103, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5i), com.p314xaae8f345.mm.R.raw.f79887x15f6a8c3);
        }
        g4Var.c(d17, 127, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        if ((r01.q3.cj().u1(16) > 0) && !dVar.F()) {
            g4Var.add(d17, 114, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3l));
        }
        j45.l.g("favorite");
        g4Var.c(d17, 116, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a564 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        am.b6 b6Var = c5348xb8e1a564.f135674g;
        b6Var.f87752a = m124847x74d37ac6;
        b6Var.f87753b = f9Var.Q0();
        c5348xb8e1a564.e();
        if (c5348xb8e1a564.f135675h.f87869a) {
            g4Var.c(d17, 129, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3x), com.p314xaae8f345.mm.R.raw.f79841xc8521962);
        }
        if (!f9Var.t2() && f9Var.L2() && ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, dVar) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0()))) {
            g4Var.c(d17, 123, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
        }
        if (!dVar.F()) {
            g4Var.c(d17, 100, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        }
        return true;
    }

    public static final boolean d(ze5.r7 r7Var, android.view.MenuItem menuItem, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        r7Var.getClass();
        if (menuItem.getItemId() != 127) {
            return false;
        }
        if (f9Var.L2()) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(f9Var);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.d(dVar.g(), linkedList, dVar.D(), dVar.u().d1(), null);
        }
        return true;
    }
}
