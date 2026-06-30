package n44;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public android.app.ProgressDialog f416544a;

    public static final void a(n44.p pVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$dismissDialog", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
        pVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dismissDialog", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
        android.app.ProgressDialog progressDialog = pVar.f416544a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        pVar.f416544a = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dismissDialog", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$dismissDialog", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
    }

    public final android.content.Intent b(android.view.View v17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 timeLineObject, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18) {
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createHalfScreenIntent", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeLineObject, "timeLineObject");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("timeline_material_outer_index", i17);
        intent.putExtra("ad_id", str);
        intent.putExtra("ad_uxInfo", str2);
        intent.putExtra("ad_snsId", str3);
        intent.putExtra("ad_source", i18);
        intent.putExtra("ad_half_screen_click_time", java.lang.System.currentTimeMillis());
        java.util.LinkedList mediaObjList = timeLineObject.f39014x86965dde.f451373h;
        char c17 = 1;
        char c18 = 0;
        if (mediaObjList == null || mediaObjList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdHalfScreenJumpHelper", "mediaList is null or empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createHalfScreenIntent", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseMediaListToArrayList", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialParseHelper$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaObjList, "mediaObjList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = mediaObjList.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(((r45.jj4) it.next()).mo14344x5f01b1f6());
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdHalfScreenMultipleMaterialParseHelper", "parseMediaListToArrayList, e is " + e17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2095x1c644e5f.C17714x97978761 c17714x97978761 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2095x1c644e5f.C17714x97978761(arrayList);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseMediaListToArrayList", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialParseHelper$Companion");
        if (c17714x97978761.a().isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdHalfScreenJumpHelper", "mediaObjectList is null or empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createHalfScreenIntent", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
            return null;
        }
        intent.putExtra("media_list", c17714x97978761);
        java.lang.Object tag = v17.getTag(com.p314xaae8f345.mm.R.id.v8r);
        java.util.ArrayList arrayList2 = tag instanceof java.util.ArrayList ? (java.util.ArrayList) tag : null;
        if ((arrayList2 == null || arrayList2.isEmpty()) || c17714x97978761.a().size() != arrayList2.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdHalfScreenJumpHelper", "viewPositionAndSizeList is error");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2023, 29);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
            }
            arrayList2.clear();
            int size = c17714x97978761.a().size();
            int i27 = 0;
            while (i27 < size) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addViewSizeAndPositionInList", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialParseHelper$Companion");
                int[] iArr = new int[2];
                if (com.p314xaae8f345.mm.ui.bk.y()) {
                    v17.getLocationOnScreen(iArr);
                } else {
                    v17.getLocationInWindow(iArr);
                }
                arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2095x1c644e5f.C17715x7b5a1f8a(iArr[c18], iArr[c17], v17.getWidth(), v17.getHeight()));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addViewSizeAndPositionInList", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialParseHelper$Companion");
                i27++;
                c17 = 1;
                c18 = 0;
            }
            if (arrayList2.isEmpty() || c17714x97978761.a().size() != arrayList2.size()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdHalfScreenJumpHelper", "viewPositionAndSizeList is empty, or dataList size is not equals viewPositionAndSizeList size");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2023, 30);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createHalfScreenIntent", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                return null;
            }
            i19 = 0;
        } else {
            i19 = 0;
        }
        intent.putExtra("view_position_and_size_list", (android.os.Parcelable[]) arrayList2.toArray(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2095x1c644e5f.C17715x7b5a1f8a[i19]));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createHalfScreenIntent", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
        return intent;
    }

    public final void c(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad snsAdClick, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4) {
        java.lang.String str5;
        java.lang.String str6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpH5", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsAdClick, "snsAdClick");
        if (!(view == null)) {
            if (!(c17702x544f64e9 == null)) {
                if (!(c17933xe8d1b226 == null)) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70371x485d7, "getTimeLine(...)");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHalfScreenJumpHelper", "jumpH5, snsId is " + str3 + ", uxInfo is " + str + ", aid is " + str2);
                    if (!(context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpH5", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                        return;
                    }
                    if (!(str == null || str.length() == 0)) {
                        if (!(str3 == null || str3.length() == 0)) {
                            android.content.Intent b17 = b(view, m70371x485d7, i17, str2, str, str3, i18);
                            if (b17 == null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpH5", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                                return;
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateHalfScreenH5Intent", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                            java.lang.String str7 = "";
                            if (c17702x544f64e9 == null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateHalfScreenH5Intent", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                                str5 = "jumpH5";
                            } else {
                                java.lang.String str8 = c17702x544f64e9.f244106c;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHalfScreenJumpHelper", "updateHalfScreenH5Intent, url is " + str8 + ", source is " + i18 + ", snsInfo is " + c17933xe8d1b226 + ", notAppendParamsToActionLink is " + c17702x544f64e9.f244112f);
                                if (str8 == null || str8.length() == 0) {
                                    str5 = "jumpH5";
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateHalfScreenH5Intent", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                                } else {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70347x10413e67 = c17933xe8d1b226.m70347x10413e67(i18);
                                    if (m70347x10413e67 != null) {
                                        java.lang.String uxInfo = m70347x10413e67.f38104xce64ddf1;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uxInfo, "uxInfo");
                                        if (c17702x544f64e9.f244112f) {
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str8);
                                            str5 = "jumpH5";
                                        } else {
                                            java.lang.String D = ca4.m0.D(uxInfo);
                                            java.lang.String P = ca4.m0.P(uxInfo);
                                            if (!(D.length() == 0)) {
                                                if (!(P.length() == 0)) {
                                                    str5 = "jumpH5";
                                                    str7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.b(str8, "traceid=" + P + "&aid=" + D);
                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str7, "appendUri(...)");
                                                    str8 = ca4.z0.b(str7, m70347x10413e67.f38104xce64ddf1);
                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str8, "appendAdUxInfo(...)");
                                                }
                                            }
                                            str5 = "jumpH5";
                                            str8 = ca4.z0.b(str7, m70347x10413e67.f38104xce64ddf1);
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str8, "appendAdUxInfo(...)");
                                        }
                                        java.lang.String e17 = f44.a.e(str8);
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "usePrefetch(...)");
                                        b17.putExtra("KsnsViewId", m70347x10413e67.f38105xcf532ea0);
                                        ca4.z0.c(b17, m70347x10413e67.f38104xce64ddf1);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHalfScreenJumpHelper", "updateHalfScreenH5Intent, updateUrl is " + e17 + ", uxInfo is " + uxInfo);
                                        str6 = e17;
                                        str7 = uxInfo;
                                    } else {
                                        str5 = "jumpH5";
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdHalfScreenJumpHelper", "updateHalfScreenH5Intent, adInfo is null");
                                        str6 = "";
                                    }
                                    android.os.Bundle bundle = new android.os.Bundle();
                                    bundle.putParcelable("KSnsAdTag", snsAdClick);
                                    bundle.putString("key_snsad_statextstr", c17933xe8d1b226.m70371x485d7().f39040xbd345fc4);
                                    if (str7.length() > 0) {
                                        bundle.putString("KAnsUxInfo", str7);
                                    }
                                    b17.putExtra("jsapiargs", bundle);
                                    b17.putExtra("rawUrl", str6);
                                    b17.putExtra("useJs", true);
                                    b17.putExtra("srcUsername", c17933xe8d1b226.f68896xdde069b);
                                    b17.putExtra("stastic_scene", 15);
                                    java.lang.String str9 = "sns_" + ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
                                    b17.putExtra("KPublisherId", str9);
                                    b17.putExtra("pre_username", c17933xe8d1b226.f68896xdde069b);
                                    b17.putExtra("prePublishId", str9);
                                    b17.putExtra("preUsername", c17933xe8d1b226.f68896xdde069b);
                                    if (i18 == 0) {
                                        ca4.z0.a(b17, 81);
                                    } else {
                                        ca4.z0.a(b17, 82);
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateHalfScreenH5Intent", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                                    str7 = str6;
                                }
                            }
                            b17.putExtra("can_show_common_more_btn", c17702x544f64e9.f244114g);
                            b17.putExtra("h5_url", str7);
                            b17.putExtra("is_half_screen_height_assigned", 0);
                            b17.putExtra("scroll_to_top", 1);
                            b17.putExtra("click_action_type", c17702x544f64e9.f244104b);
                            b17.putExtra("half_screen_min_height_percent", c17702x544f64e9.f244110e);
                            b17.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.class);
                            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(b17);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(abstractActivityC21394xb3d2c0cf, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/helper/halfscreen/AdHalfScreenJumpHelper", "jumpH5", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/modelsns/SnsAdClick;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            abstractActivityC21394xb3d2c0cf.startActivity((android.content.Intent) arrayList.get(0));
                            yj0.a.f(abstractActivityC21394xb3d2c0cf, "com/tencent/mm/plugin/sns/ad/helper/halfscreen/AdHalfScreenJumpHelper", "jumpH5", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/modelsns/SnsAdClick;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            abstractActivityC21394xb3d2c0cf.overridePendingTransition(0, 0);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                            return;
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpH5", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdHalfScreenJumpHelper", "jumpH5, click view or clickActionInfo or snsInfo is null");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpH5", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
    }

    public final void d(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openHalfScreenWeComProfile", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (!(view == null)) {
            if (!(c17702x544f64e9 == null)) {
                if (!(c17933xe8d1b226 == null)) {
                    s34.p1 p1Var = c17702x544f64e9.f244145v0;
                    if (p1Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdHalfScreenJumpHelper", "openHalfScreenWeComProfile, qrInfo is null");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openHalfScreenWeComProfile", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHalfScreenJumpHelper", "openHalfScreenWeComProfile and qrUrl is " + p1Var.a() + ", snsId is " + str3 + ", uxInfo is " + str + ", aid is " + str2);
                    java.lang.String a17 = p1Var.a();
                    if (a17 == null || a17.length() == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openHalfScreenWeComProfile", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                        return;
                    }
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70371x485d7, "getTimeLine(...)");
                    if (!(str == null || str.length() == 0)) {
                        if (!(str3 == null || str3.length() == 0)) {
                            android.content.Intent b17 = b(view, m70371x485d7, i17, str2, str, str3, i18);
                            if (b17 == null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openHalfScreenWeComProfile", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                                return;
                            }
                            int i19 = c17702x544f64e9.f244104b;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doHalfScreenWeComProfile", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                            r45.bx5 bx5Var = new r45.bx5();
                            r45.u2 u2Var = new r45.u2();
                            u2Var.f468485d = (i18 == 0 || i18 == 1 || i18 == 2) ? 1 : 0;
                            u2Var.f468486e = ca4.z0.F0(str2);
                            bx5Var.f452669h = u2Var;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHalfScreenJumpHelper", "doHalfScreenWeComProfile, qrUrl is " + p1Var.a() + ", long type aid is " + bx5Var.f452669h.f468486e + ", source is " + i18);
                            ab0.b0 b0Var = (ab0.b0) i95.n0.c(ab0.b0.class);
                            java.lang.String a18 = p1Var.a();
                            ((za0.k) b0Var).getClass();
                            l41.e0 e0Var = new l41.e0(a18, 10, bx5Var);
                            java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574712ly3);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showTipsDialog$default", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showTipsDialog", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                            android.app.ProgressDialog progressDialog = this.f416544a;
                            if (progressDialog != null) {
                                progressDialog.dismiss();
                            }
                            this.f416544a = db5.e1.Q(activity, "", string, true, true, new n44.o(null));
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showTipsDialog", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showTipsDialog$default", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                            if (android.os.Build.VERSION.SDK_INT >= 29) {
                                activity.registerActivityLifecycleCallbacks(new n44.j(this));
                            }
                            v65.i.c(new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("doHalfScreenWeComProfile", activity, 0, 4, null), null, new n44.l(this, e0Var, b17, i19, activity, str, str3, str2, i18, p1Var, str4, null), 1, null);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doHalfScreenWeComProfile", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openHalfScreenWeComProfile", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                            return;
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openHalfScreenWeComProfile", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdHalfScreenJumpHelper", "openHalfScreenWeComProfile, click view or clickActionInfo or snsInfo is null");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openHalfScreenWeComProfile", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
    }
}
