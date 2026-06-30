package bi4;

/* loaded from: classes11.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.text.SimpleDateFormat f21093a = new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS);

    /* renamed from: b, reason: collision with root package name */
    public static final java.text.SimpleDateFormat f21094b = new java.text.SimpleDateFormat("HH:mm");

    /* renamed from: c, reason: collision with root package name */
    public static final java.text.SimpleDateFormat f21095c = new java.text.SimpleDateFormat("yyyy-MM-dd");

    public static bi4.u1 a(java.lang.String str) {
        bi4.u1 u1Var = new bi4.u1();
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                int optInt = jSONObject.optInt("style", 0);
                if (optInt >= 1 && optInt <= 2) {
                    java.util.List<bi4.t1> b17 = bi4.t1.b(jSONObject.optJSONArray("durations"));
                    if (((java.util.LinkedList) b17).size() > 0) {
                        java.util.Calendar b18 = b(c01.id.c());
                        if (b18 != null) {
                            int i17 = (b18.get(11) * 60) + b18.get(12);
                            for (bi4.t1 t1Var : b17) {
                                if (t1Var.a(i17) && !android.text.TextUtils.equals(gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_TEXT_STATUS_FRIENDS_BUTTON_STYLE_CLICK_TAG_STRING, ""), c(java.lang.String.valueOf(optInt), t1Var))) {
                                    u1Var.f21091a = optInt;
                                    u1Var.f21092b = t1Var;
                                    break;
                                }
                            }
                        }
                    } else if (!android.text.TextUtils.equals(gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_TEXT_STATUS_FRIENDS_BUTTON_STYLE_CLICK_TAG_STRING, ""), c(java.lang.String.valueOf(optInt), null))) {
                        u1Var.f21091a = optInt;
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TextStatus.TextStatusSwitch", th6, "convertBtnStyle", new java.lang.Object[0]);
            }
        }
        return u1Var;
    }

    public static java.util.Calendar b(long j17) {
        try {
            java.text.SimpleDateFormat simpleDateFormat = f21093a;
            java.util.Date parse = simpleDateFormat.parse(simpleDateFormat.format(java.lang.Long.valueOf(j17)));
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            if (parse == null) {
                return null;
            }
            calendar.setTime(parse);
            return calendar;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(java.lang.String r10, bi4.t1 r11) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            java.lang.String r2 = "_"
            if (r11 == 0) goto L22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = r11.f21085a
            r3.append(r4)
            r3.append(r2)
            int r4 = r11.f21086b
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L23
        L22:
            r3 = r1
        L23:
            long r4 = c01.id.a()
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            java.text.SimpleDateFormat r7 = bi4.v1.f21095c
            if (r6 == 0) goto L38
            java.lang.Long r11 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = r7.format(r11)     // Catch: java.lang.Throwable -> L72
            goto L72
        L38:
            if (r11 == 0) goto L6a
            boolean r6 = r11.f21087c
            if (r6 != 0) goto L3f
            goto L5a
        L3f:
            java.util.Calendar r6 = b(r4)
            if (r6 == 0) goto L5a
            r8 = 11
            int r8 = r6.get(r8)
            r9 = 12
            int r6 = r6.get(r9)
            int r8 = r8 * 60
            int r8 = r8 + r6
            int r11 = r11.f21088d
            if (r8 >= r11) goto L5a
            r11 = 1
            goto L5b
        L5a:
            r11 = 0
        L5b:
            if (r11 == 0) goto L6a
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 - r8
            java.lang.Long r11 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = r7.format(r11)     // Catch: java.lang.Throwable -> L72
            goto L72
        L6a:
            java.lang.Long r11 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = r7.format(r11)     // Catch: java.lang.Throwable -> L72
        L72:
            r0.append(r10)
            r0.append(r2)
            r0.append(r3)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r10 = r0.toString()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bi4.v1.c(java.lang.String, bi4.t1):java.lang.String");
    }

    public static bi4.u1 d() {
        bi4.u1 a17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("StatusFriendsButtonStyleConfig");
        if (android.text.TextUtils.isEmpty(d17)) {
            a17 = a("");
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusSwitch", "btnStyle convert xConfig src:%s style:%s", "", java.lang.Integer.valueOf(a17.f21091a));
        } else {
            a17 = a(d17);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusSwitch", "btnStyle convert dConfig src:%s style:%s", d17, java.lang.Integer.valueOf(a17.f21091a));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusSwitch", "btnStyle final:%s cost:%s", a17, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return a17;
    }

    public static int e(java.lang.String str, boolean z17) {
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
            return 2;
        }
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("StatusUseBypassMsg", 2);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusSwitch", "getUseByPassMsgSwitchValue result:%s type:%s isFromPassByMsg:%s defValue:%s", java.lang.Integer.valueOf(b17), str, java.lang.Boolean.valueOf(z17), 2);
        return b17;
    }

    public static boolean f() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_text_status_dynamic_label_and, bm5.h0.RepairerConfig_TextStatus_DynamicLabel_Int, 1) == 1) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_group_dynamic_label_enable, true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean g() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_text_state_entry_and, bm5.h0.RepairerConfig_TextStatus_EntrySwitch_Int, 1) == 1;
    }

    public static boolean h() {
        if (g()) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_text_state_icon_timeline_comments_and_like_and, bm5.h0.RepairerConfig_TextStatus_SnsCommentAndLikeIcon_Int, 0) == 1;
        }
        return false;
    }

    public static boolean i() {
        return j62.e.g().c(new com.tencent.mm.repairer.config.textstatus.RepairerConfigTextStatusSquareV3Switch()) == 1;
    }

    public static boolean j() {
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
            return true;
        }
        boolean z17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().c(new com.tencent.mm.repairer.config.textstatus.RepairerConfigTextStatusComment()) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusSwitch", "isOpenTextStatusComment: result:%s", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public static boolean k() {
        return (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_text_state_square_anim_and, bm5.h0.RepairerConfig_TextStatus_EntrySwitch_Int, 1) != 1 || com.tencent.mm.ui.bk.Y() || com.tencent.mm.ui.bk.Z()) ? false : true;
    }

    public static boolean l() {
        boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.textstatus.RepairerConfigTextStatusUseSelfIconIdCluster()) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusSwitch", "isUseSelfIconIdCluster: result:%s", java.lang.Boolean.valueOf(z17));
        return z17;
    }
}
