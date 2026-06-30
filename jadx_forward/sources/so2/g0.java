package so2;

/* loaded from: classes10.dex */
public abstract class g0 {
    public static final void a(jv2.i iVar, android.content.Context context, java.lang.String bizUsername, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        if (i17 == 120) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentInfoEx", "jumpBizProfile: hit SOURCE_PROFILE_TIMELINE, avatar can't click.");
            ((android.app.Activity) context).finish();
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, context, intent, iVar.f383756d.f67478xf9a02e3e, null, 0, 5, false, 0, null, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
        intent.putExtra("Contact_User", bizUsername);
        intent.putExtra("Contact_Scene", 214);
        intent.putExtra("biz_profile_enter_from_finder", true);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("biz_profile_tab_type", 1);
        j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }

    public static final void b(so2.y0 y0Var, android.content.Context context, java.lang.String bizUsername, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 currentFeed, java.lang.String bypassData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(y0Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentFeed, "currentFeed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bypassData, "bypassData");
        if (i17 == 120) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentInfoEx", "jumpBizProfile: hit SOURCE_PROFILE_TIMELINE, avatar can't click.");
            ((android.app.Activity) context).finish();
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = y0Var.f492236d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, context, intent, yj0Var.f68959xf9a02e3e, null, 0, 5, false, 0, yj0Var.f68957xec748fc6, 192, null);
        intent.putExtra("Contact_User", bizUsername);
        intent.putExtra("Contact_Scene", 214);
        boolean z17 = true;
        intent.putExtra("biz_profile_enter_from_finder", true);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("biz_profile_tab_type", 1);
        java.lang.String m76829x97edf6c0 = currentFeed.getFeedObject().m76829x97edf6c0();
        if (m76829x97edf6c0 != null && m76829x97edf6c0.length() != 0) {
            z17 = false;
        }
        java.lang.String ek6 = z17 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(y0Var.mo2128x1ed62e84(), y0Var.f492236d.f68957xec748fc6, i17) : currentFeed.getFeedObject().m76829x97edf6c0();
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bypassData)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("commentAdInfo", bypassData);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                intent.putExtra("Contact_Finder_Buffer", r26.i0.t(jSONObject2, ",", ";", false));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommentInfoEx", "jumpBizProfile build finder buffer failed, error=" + e17);
        }
        intent.putExtra("Contact_Scene_Note", ek6);
        j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }

    public static final void c(jv2.i iVar, java.lang.String username, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(username)) {
            kk.l lVar = so2.f0.f491867a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(so2.f0.f491868b, username) && (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14074xf8b1598)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14074xf8b1598) context).finish();
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", username);
        intent.putExtra("KEY_FROM_TIMELINE", true);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, context, intent, iVar.f383756d.f67478xf9a02e3e, null, 0, 5, false, 0, null, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(context, intent);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zi(5, iVar.f383756d.f67478xf9a02e3e, xy2.c.d(context), 1, username);
    }

    public static final void d(so2.y0 y0Var, java.lang.String username, android.content.Context context, java.lang.String bypassData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(y0Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bypassData, "bypassData");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(username)) {
            kk.l lVar = so2.f0.f491867a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(so2.f0.f491868b, username) && (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14074xf8b1598)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14074xf8b1598) context).finish();
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", username);
        intent.putExtra("KEY_FROM_TIMELINE", true);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = y0Var.f492236d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, context, intent, yj0Var.f68959xf9a02e3e, null, 0, 5, false, 0, yj0Var.f68957xec748fc6, 192, null);
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bypassData)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("commentAdInfo", bypassData);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                intent.putExtra("key_extra_info", r26.i0.t(jSONObject2, ",", ";", false));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommentInfoEx", "jumpProfile build finder buffer failed, error=" + e17);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(context, intent);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zi(5, y0Var.f492236d.f68959xf9a02e3e, xy2.c.d(context), 1, username);
    }

    public static final void e(r45.my0 my0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(my0Var, "<this>");
        java.lang.String m75945x2fec8307 = my0Var.m75945x2fec8307(1);
        java.lang.String m75945x2fec83072 = my0Var.m75945x2fec8307(4);
        if (m75945x2fec8307 == null || m75945x2fec83072 == null) {
            return;
        }
        xc2.y2 y2Var = xc2.y2.f534876a;
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        su4.r2.o();
    }

    public static final void f(so2.y0 y0Var, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(y0Var, "<this>");
        if (z17) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 u07 = y0Var.f492236d.u0();
            int m76072xefec40f7 = y0Var.f492236d.u0().m76072xefec40f7();
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            u07.m76123x635d8e6b(m76072xefec40f7 | 2);
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 u08 = y0Var.f492236d.u0();
        int m76072xefec40f72 = y0Var.f492236d.u0().m76072xefec40f7();
        java.util.regex.Pattern pattern2 = pm0.v.f438335a;
        u08.m76123x635d8e6b(m76072xefec40f72 & (-3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if (r8 == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean g(so2.y0 r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            java.lang.String r0 = "<this>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            com.tencent.mm.plugin.finder.storage.t70 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a
            jz5.g r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Nc
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.mo141623x754a37bb()
            lb2.j r0 = (lb2.j) r0
            java.lang.Object r0 = r0.r()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_COMMENT_RECOMMEND_SWITCH_INT_SYNC
            r3 = 0
            int r1 = r1.r(r2, r3)
            r2 = -1
            if (r0 == r2) goto L2e
            goto L2f
        L2e:
            r0 = r1
        L2f:
            com.tencent.mm.plugin.finder.storage.yj0 r1 = r4.f492236d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r1 = r1.u0()
            r45.k60 r1 = r1.m76073x14544c()
            if (r1 == 0) goto L40
            java.util.LinkedList r1 = r1.m75941xfb821914(r3)
            goto L41
        L40:
            r1 = 0
        L41:
            r2 = 1
            if (r0 != r2) goto L58
            if (r7 != 0) goto L60
            if (r1 == 0) goto L51
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L4f
            goto L51
        L4f:
            r7 = r3
            goto L52
        L51:
            r7 = r2
        L52:
            if (r7 == 0) goto L60
            if (r6 != 0) goto L60
            if (r8 != 0) goto L60
        L58:
            r6 = 2
            if (r0 == r6) goto L60
            if (r5 == 0) goto L5e
            goto L60
        L5e:
            r5 = r3
            goto L61
        L60:
            r5 = r2
        L61:
            com.tencent.mm.plugin.finder.storage.yj0 r4 = r4.f492236d
            boolean r4 = r4.j1()
            if (r4 != 0) goto L6c
            if (r5 == 0) goto L6c
            r3 = r2
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: so2.g0.g(so2.y0, boolean, boolean, boolean, boolean):boolean");
    }
}
