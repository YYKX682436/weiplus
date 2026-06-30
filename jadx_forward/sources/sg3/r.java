package sg3;

@j95.b
/* loaded from: classes4.dex */
public class r extends jm0.o {

    /* renamed from: m, reason: collision with root package name */
    public android.app.ProgressDialog f489522m = null;

    /* renamed from: n, reason: collision with root package name */
    public ab0.x f489523n;

    public static java.lang.String aj() {
        if (!com.p314xaae8f345.mm.vfs.w6.j("wcf://selectrecord/")) {
            com.p314xaae8f345.mm.vfs.w6.u("wcf://selectrecord/");
        }
        return "wcf://selectrecord/";
    }

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
    }

    @Override // jm0.o
    public void Ni(android.content.Context context) {
        ((ku5.t0) ku5.t0.f394148d).k(new sg3.m(this), 60000L);
    }

    public final java.lang.CharSequence Zi(java.util.ArrayList arrayList) {
        java.lang.CharSequence spannableString = new android.text.SpannableString("");
        if (arrayList == null) {
            return spannableString;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            spannableString = android.text.TextUtils.concat(spannableString, (java.lang.CharSequence) it.next());
        }
        return spannableString;
    }

    public final java.lang.String bj(java.lang.String str, java.lang.String str2) {
        return "FirstSwitchContactTips_" + str + "_" + str2 + "_" + ((java.lang.String) gm0.j1.u().c().l(2, ""));
    }

    public final java.lang.String cj(java.lang.String str, java.lang.String str2) {
        return "switch_contact_prefs_" + str + "_" + str2 + "_" + ((java.lang.String) gm0.j1.u().c().l(2, ""));
    }

    public final java.lang.CharSequence fj(java.lang.CharSequence charSequence) {
        return (charSequence == null || charSequence.length() == 0) ? new android.text.SpannableString("") : charSequence;
    }

    public void hj(java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.String str2, boolean z17) {
        java.lang.String str3;
        java.util.Iterator it;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6 = str;
        try {
            java.lang.String string = bundle.getString("local_session");
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (string == null) {
                string = "";
            }
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            java.lang.String str7 = (java.lang.String) map.get(str6 + ".window_template.$type");
            int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".sysmsg.sysmsgtemplate.content_template.succeed_scene"), 0);
            if ("tmpl_type_succeed_contact_window".equals(str7)) {
                java.lang.String str8 = (java.lang.String) map.get(str6 + ".window_template.template");
                java.lang.String str9 = (java.lang.String) map.get(str6 + ".window_template.tp_username");
                java.lang.String str10 = (java.lang.String) map.get(str6 + ".window_template.headimgurl");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str10)) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    if (com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(str9) == null) {
                        com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
                        r0Var.f152062a = str9;
                        r0Var.f152065d = str10;
                        r0Var.f152063b = 3;
                        r0Var.f152067f = 0;
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                        com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var);
                    }
                }
                java.lang.String str11 = "switch_contact_prefs";
                if (z17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("switch_contact_prefs", 0).getBoolean(cj(str9, str2), false)) {
                    mj(str9);
                    return;
                }
                java.lang.String str12 = (java.lang.String) map.get(str6 + ".window_template.ticket");
                java.lang.String str13 = (java.lang.String) map.get(str6 + ".window_template.antispam_ticket");
                java.lang.String str14 = (java.lang.String) map.get(str6 + ".window_template.title");
                java.lang.String str15 = (java.lang.String) map.get(str6 + ".window_template.cancel_wording");
                java.lang.String str16 = (java.lang.String) map.get(str6 + ".window_template.confirm_wording");
                java.util.ArrayList a17 = ih3.p.a(str8);
                if (a17 == null || a17.size() <= 0) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it6 = a17.iterator();
                java.lang.String str17 = "";
                java.lang.String str18 = str17;
                while (true) {
                    str3 = str11;
                    if (!it6.hasNext()) {
                        break;
                    }
                    ih3.o oVar = (ih3.o) it6.next();
                    if (oVar != null && (str4 = oVar.f373130b) != null) {
                        int i17 = oVar.f373129a;
                        if (i17 == 0) {
                            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                            it = it6;
                            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            ((ke0.e) xVar).getClass();
                            arrayList.add(new android.text.SpannableString(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str4)));
                        } else {
                            it = it6;
                            if (i17 == 1) {
                                int i18 = 0;
                                while (true) {
                                    java.lang.String str19 = str6 + ".window_template.link_list.link";
                                    if (i18 != 0) {
                                        str19 = str19 + i18;
                                    }
                                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(str19))) {
                                        break;
                                    }
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                    sb6.append(str19);
                                    java.lang.String str20 = str16;
                                    sb6.append(".$name");
                                    java.lang.String str21 = (java.lang.String) map.get(sb6.toString());
                                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                    sb7.append(str19);
                                    java.lang.String str22 = str15;
                                    sb7.append(".$type");
                                    java.lang.String str23 = (java.lang.String) map.get(sb7.toString());
                                    java.lang.String str24 = str4;
                                    java.lang.String str25 = str14;
                                    if (str4.equals(str21) && "link_plain".equals(str23)) {
                                        arrayList.add(fj((java.lang.CharSequence) map.get(str19 + ".plain")));
                                    }
                                    if ("company".equals(str21) && "link_userdescid".equals(str23)) {
                                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                                        sb8.append(str19);
                                        str5 = str13;
                                        sb8.append(".userdesc");
                                        str18 = fj((java.lang.CharSequence) map.get(sb8.toString())).toString();
                                    } else {
                                        str5 = str13;
                                    }
                                    if ("nickname".equals(str21) && "link_plain".equals(str23)) {
                                        str17 = fj((java.lang.CharSequence) map.get(str19 + ".plain")).toString();
                                    }
                                    i18++;
                                    str6 = str;
                                    str4 = str24;
                                    str16 = str20;
                                    str15 = str22;
                                    str14 = str25;
                                    str13 = str5;
                                }
                            } else {
                                str6 = str;
                                str11 = str3;
                                it6 = it;
                                str16 = str16;
                                str15 = str15;
                                str14 = str14;
                                str13 = str13;
                            }
                        }
                        str6 = str;
                        str11 = str3;
                        it6 = it;
                        str16 = str16;
                        str15 = str15;
                        str14 = str14;
                        str13 = str13;
                    }
                    it = it6;
                    str6 = str;
                    str11 = str3;
                    it6 = it;
                    str16 = str16;
                    str15 = str15;
                    str14 = str14;
                    str13 = str13;
                }
                java.lang.String str26 = str13;
                java.lang.String str27 = str14;
                java.lang.String str28 = str15;
                java.lang.String str29 = str16;
                if (!z17) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(str3, 0).getBoolean(bj(str9, str2), true)) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(str3, 0).edit().putBoolean(bj(str9, str2), false).commit();
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6803x6d9acd6d c6803x6d9acd6d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6803x6d9acd6d();
                        c6803x6d9acd6d.p(string);
                        c6803x6d9acd6d.q(str2);
                        c6803x6d9acd6d.f141330f = 1L;
                        c6803x6d9acd6d.f141331g = 1L;
                        c6803x6d9acd6d.f141332h = 1L;
                        c6803x6d9acd6d.k();
                        ij((android.content.Context) weakReference.get(), string, Zi(arrayList).toString(), str9, str12, str26, str17, str18, str2, str27, str28, str29);
                        return;
                    }
                    return;
                }
                if (D1 == 1) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6803x6d9acd6d c6803x6d9acd6d2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6803x6d9acd6d();
                    c6803x6d9acd6d2.p(string);
                    c6803x6d9acd6d2.q(str2);
                    c6803x6d9acd6d2.f141330f = 1L;
                    c6803x6d9acd6d2.f141331g = 1L;
                    c6803x6d9acd6d2.f141332h = 3L;
                    c6803x6d9acd6d2.k();
                } else if (D1 == 0) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6803x6d9acd6d c6803x6d9acd6d3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6803x6d9acd6d();
                    c6803x6d9acd6d3.p(string);
                    c6803x6d9acd6d3.q(str2);
                    c6803x6d9acd6d3.f141330f = 1L;
                    c6803x6d9acd6d3.f141331g = 1L;
                    c6803x6d9acd6d3.f141332h = 2L;
                    c6803x6d9acd6d3.k();
                }
                ij((android.content.Context) weakReference.get(), string, Zi(arrayList).toString(), str9, str12, str26, str17, str18, str2, str27, str28, str29);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public void ij(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.C16507x1bb6d76a c16507x1bb6d76a = new com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.C16507x1bb6d76a(context, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str9)) {
            c16507x1bb6d76a.m66651x53bfc606(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hfi));
        } else {
            c16507x1bb6d76a.m66651x53bfc606(str9);
        }
        c16507x1bb6d76a.m66646xe9f5bdb7(str2);
        c16507x1bb6d76a.m66647x76492e13(str6);
        c16507x1bb6d76a.m66650x41d79a2f("@" + str7);
        c16507x1bb6d76a.m66649x5386fef0(str3);
        c16507x1bb6d76a.m66648x3e92b8d8(new sg3.n(this, str3, str5, context));
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str10) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hff) : str10;
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str11) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hfh) : str11;
        u1Var.d(c16507x1bb6d76a);
        u1Var.n(string2);
        u1Var.j(string);
        u1Var.c(new sg3.o(this, str, str8), new sg3.q(this, str3, str, str8, str4, context));
        u1Var.q(false);
    }

    public void mj(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginMessenger", "startChattingUI userName: " + str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", str);
        intent.putExtra("Chat_Mode", 1);
        j45.l.u(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, ".ui.chatting.ChattingUI", intent, null);
    }
}
