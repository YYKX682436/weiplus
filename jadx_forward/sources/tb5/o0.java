package tb5;

/* loaded from: classes9.dex */
public abstract class o0 {
    public static boolean a(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        sb5.y1 y1Var;
        if (f9Var != null && cm5.k.e(f9Var) && ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n7) ((sb5.g0) dVar.f542241c.a(sb5.g0.class))).u0()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = dVar.f542241c;
            if (!((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n7) ((sb5.g0) cVar.a(sb5.g0.class))).t0()) {
                if (i17 == 1 && (y1Var = (sb5.y1) cVar.a(sb5.y1.class)) != null) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wk wkVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wk) y1Var;
                    if (wkVar.m0(f9Var.m124847x74d37ac6(), 34077)) {
                        return false;
                    }
                    wkVar.n0(f9Var.m124847x74d37ac6(), 34077);
                }
                return true;
            }
        }
        return false;
    }

    public static java.lang.String b(java.lang.String str, long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("time\t");
        android.text.format.Time time = new android.text.format.Time();
        time.set(j17);
        sb6.append(k35.s.a("yyyy-MM-dd kk:mm", time).toString());
        sb6.append("\ncontent\t");
        sb6.append(str);
        sb6.append("\n");
        return sb6.toString();
    }

    public static void c(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.Map map, int i17) {
        java.lang.String b17;
        if (a(dVar, f9Var, i17)) {
            if (map == null) {
                map = cm5.k.c(f9Var);
            }
            java.util.Map map2 = map;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (f9Var.mo78013xfb85f7b0() != 318767153) {
                if (f9Var.mo78013xfb85f7b0() == 721420337) {
                    if (!android.text.TextUtils.isEmpty(f9Var.j())) {
                        b17 = b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.he9), com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17277xe9e90aaf.f37916x681a0c0c.a(f9Var.j()).f240299m);
                    }
                } else if (f9Var.mo78013xfb85f7b0() == 1075839025) {
                    java.lang.String str = (java.lang.String) map2.get(".msg.appmsg.extinfo.notifymsg.title.nickname");
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (str == null) {
                        str = "";
                    }
                    sb6.append("nickname\t");
                    sb6.append(str);
                    sb6.append("\n");
                    int i18 = 1;
                    java.lang.String str2 = ".msg.appmsg.extinfo.notifymsg.display_list.ext_item";
                    while (map2.containsKey(str2)) {
                        java.lang.String str3 = (java.lang.String) map2.get(str2 + ".content");
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (!android.text.TextUtils.isEmpty(str3)) {
                            sb6.append("content\t");
                            sb6.append(str3);
                            sb6.append("\n");
                        }
                        java.lang.String str4 = (java.lang.String) map2.get(str2 + ".reason");
                        if (str4 == null) {
                            str4 = "";
                        }
                        if (!android.text.TextUtils.isEmpty(str4)) {
                            sb6.append("reason\t");
                            sb6.append(str4);
                            sb6.append("\n");
                        }
                        str2 = ".msg.appmsg.extinfo.notifymsg.display_list.ext_item" + i18;
                        i18++;
                    }
                    if (i18 == 1) {
                        java.lang.String str5 = ".msg.appmsg.extinfo.notifymsg.display_list.item";
                        while (map2.containsKey(str5)) {
                            java.lang.String str6 = (java.lang.String) map2.get(str5 + ".topic");
                            if (str6 == null) {
                                str6 = "";
                            }
                            java.lang.String str7 = (java.lang.String) map2.get(str5 + ".content");
                            if (str7 == null) {
                                str7 = "";
                            }
                            sb6.append(str6);
                            sb6.append("\t");
                            sb6.append(str7);
                            sb6.append("\n");
                            str5 = ".msg.appmsg.extinfo.notifymsg.display_list.item" + i18;
                            i18++;
                        }
                    }
                }
                b17 = sb6.toString();
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map2.get(".msg.appmsg.mmreader.category.item.template_op_type"), -1) == 2) {
                java.lang.String str8 = (java.lang.String) map2.get(".msg.appmsg.mmreader.category.item.schedule_nickname");
                java.lang.String str9 = (java.lang.String) map2.get(".msg.appmsg.mmreader.category.item.schedule_time");
                java.lang.String str10 = (java.lang.String) map2.get(".msg.appmsg.mmreader.category.item.schedule_content");
                sb6.append("nickname\t");
                sb6.append(str8);
                sb6.append("\ntime\t");
                sb6.append(str9);
                sb6.append("\ncontent\t");
                sb6.append(str10);
                sb6.append("\n");
                b17 = sb6.toString();
            } else {
                int i19 = 0;
                while (true) {
                    if (i19 >= 100) {
                        break;
                    }
                    java.lang.String str11 = ".msg.appmsg.mmreader.template_detail.line_content.lines.line";
                    if (i19 != 0) {
                        str11 = ".msg.appmsg.mmreader.template_detail.line_content.lines.line" + i19;
                    }
                    java.lang.String str12 = (java.lang.String) map2.get(str11 + ".value.word");
                    if (str12 == null) {
                        str12 = "";
                    }
                    java.lang.String str13 = (java.lang.String) map2.get(str11 + ".key.word");
                    if (str13 == null) {
                        str13 = "";
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str12) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str13)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ServiceNotifyFoldReport", "getReportContent : lines count = %d", java.lang.Integer.valueOf(i19));
                        break;
                    }
                    sb6.append(str13);
                    sb6.append("\t");
                    sb6.append(str12);
                    sb6.append("\n");
                    i19++;
                }
                b17 = sb6.toString();
            }
            d(dVar, f9Var, map2, b17, i17, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f9, code lost:
    
        if (r8 == null) goto L71;
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(yb5.d r17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r18, java.util.Map r19, java.lang.String r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tb5.o0.d(yb5.d, com.tencent.mm.storage.f9, java.util.Map, java.lang.String, int, boolean):void");
    }
}
