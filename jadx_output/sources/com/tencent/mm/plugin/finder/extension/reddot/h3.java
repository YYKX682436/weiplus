package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes2.dex */
public final class h3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.extension.reddot.h3 f105549a = new com.tencent.mm.plugin.finder.extension.reddot.h3();

    public final cl0.g a(r45.f03 showInfo, java.lang.String tipsID) {
        kotlin.jvm.internal.o.g(showInfo, "showInfo");
        kotlin.jvm.internal.o.g(tipsID, "tipsID");
        cl0.g gVar = new cl0.g();
        gVar.o("show_type", showInfo.f373887d);
        gVar.o("count", showInfo.f373888e);
        gVar.h(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, showInfo.f373889f);
        gVar.h("icon_url", showInfo.f373890g);
        gVar.h(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, showInfo.f373892i);
        gVar.o("clear_type", showInfo.f373891h);
        gVar.h("parent", showInfo.f373893m);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(tipsID)) {
            gVar.h("tips_id", tipsID);
        }
        return gVar;
    }

    public final java.lang.String b(java.util.HashSet paths, java.lang.String str) {
        java.util.Iterator it;
        jz5.f0 f0Var;
        java.lang.String businessType = str;
        kotlin.jvm.internal.o.g(paths, "paths");
        kotlin.jvm.internal.o.g(businessType, "businessType");
        int i17 = 0;
        int i18 = 1;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127746i3).getValue()).r()).intValue() == 1;
        cl0.g gVar = new cl0.g();
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        com.tencent.mm.plugin.finder.extension.reddot.h3 h3Var = f105549a;
        int i19 = 3;
        int i27 = 2;
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            r45.f03 f03Var = new r45.f03();
            f03Var.f373892i = "h5_creator_auth";
            f03Var.f373893m = "";
            f03Var.f373891h = 1;
            f03Var.f373888e = 0;
            f03Var.f373889f = "";
            f03Var.f373890g = "";
            f03Var.f373887d = 1;
            arrayList.add(f03Var);
            r45.f03 f03Var2 = new r45.f03();
            f03Var2.f373892i = "h5_creator_guide";
            f03Var2.f373893m = "";
            f03Var2.f373891h = 1;
            f03Var2.f373888e = 3;
            f03Var2.f373889f = "";
            f03Var2.f373890g = "";
            f03Var2.f373887d = 2;
            arrayList.add(f03Var2);
            r45.f03 f03Var3 = new r45.f03();
            f03Var3.f373892i = "h5_creator_original";
            f03Var3.f373893m = "";
            f03Var3.f373891h = 1;
            f03Var3.f373888e = 0;
            f03Var3.f373889f = "测试";
            f03Var3.f373890g = "";
            f03Var3.f373887d = 3;
            arrayList.add(f03Var3);
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                r45.f03 f03Var4 = (r45.f03) it6.next();
                java.lang.String str2 = f03Var4.f373892i;
                if (str2 == null) {
                    str2 = "";
                }
                gVar.h(str2, h3Var.a(f03Var4, ""));
            }
        } else {
            java.util.Iterator it7 = paths.iterator();
            while (it7.hasNext()) {
                java.lang.String str3 = (java.lang.String) it7.next();
                kotlin.jvm.internal.o.d(str3);
                if (((com.tencent.mm.sdk.platformtools.t8.D1(businessType, i17) == i27 && kotlin.jvm.internal.o.b(str3, "NewLife.Entrance")) ? i18 : i17) != 0) {
                    java.lang.String str4 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_LONG_VIDEO_REDOT_INFO_STRING_SYNC, null);
                    if (str4 != null) {
                        r45.vs2 vs2Var = new r45.vs2();
                        byte[] bytes = str4.getBytes(r26.c.f368867c);
                        java.lang.String str5 = "getBytes(...)";
                        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                        vs2Var.parseFrom(bytes);
                        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = new com.tencent.mm.plugin.finder.extension.reddot.jb();
                        jbVar.t0(vs2Var);
                        java.util.LinkedList linkedList = vs2Var.f388489g;
                        if (linkedList != null) {
                            java.util.Iterator it8 = linkedList.iterator();
                            while (it8.hasNext()) {
                                r45.f03 f03Var5 = (r45.f03) it8.next();
                                java.lang.String str6 = f03Var5.f373892i;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                int i28 = jbVar.field_businessType;
                                r45.xs2 xs2Var = jbVar.N;
                                java.lang.String u17 = pm0.v.u(xs2Var.getLong(i19));
                                java.lang.String string = xs2Var.getString(8);
                                java.util.Iterator it9 = it7;
                                com.tencent.mm.protobuf.g byteString = xs2Var.getByteString(7);
                                byte[] g17 = byteString != null ? byteString.g() : null;
                                if (g17 == null) {
                                    g17 = "".getBytes(r26.c.f368865a);
                                    kotlin.jvm.internal.o.f(g17, str5);
                                }
                                java.lang.String encodeToString = android.util.Base64.encodeToString(g17, 2);
                                java.lang.String field_tips_uuid = jbVar.field_tips_uuid;
                                java.lang.String str7 = str5;
                                kotlin.jvm.internal.o.f(field_tips_uuid, "field_tips_uuid");
                                int type = jbVar.getType();
                                com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 = jbVar;
                                cl0.g gVar2 = new cl0.g();
                                java.util.Iterator it10 = it8;
                                gVar2.o("business_type", i28);
                                gVar2.o("clear_type", f03Var5.f373891h);
                                gVar2.o("count", f03Var5.f373888e);
                                gVar2.h("icon_url", f03Var5.f373890g);
                                gVar2.h("objectId", u17);
                                if (string == null) {
                                    string = "";
                                }
                                gVar2.h("objectNonceId", string);
                                gVar2.h(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, f03Var5.f373892i);
                                gVar2.o("show_type", f03Var5.f373887d);
                                if (encodeToString == null) {
                                    encodeToString = "";
                                }
                                gVar2.h("tab_tips_by_pass_info", encodeToString);
                                gVar2.h("tips_uuid", field_tips_uuid);
                                gVar2.h(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, f03Var5.f373889f);
                                gVar2.h("parent", f03Var5.f373893m);
                                gVar2.o("type", type);
                                gVar.h(str6, gVar2);
                                it7 = it9;
                                str5 = str7;
                                jbVar = jbVar2;
                                it8 = it10;
                                i19 = 3;
                            }
                        }
                        it = it7;
                        com.tencent.mars.xlog.Log.i("FinderRedDotConverter", "insertLongVideoRedDot " + pm0.b0.g(vs2Var));
                        f0Var = jz5.f0.f302826a;
                    } else {
                        it = it7;
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        com.tencent.mars.xlog.Log.i("FinderRedDotConverter", "insertLongVideoRedDot but long video cache reddot is empty!");
                    }
                } else {
                    it = it7;
                    r45.f03 I0 = nk6.I0(str3);
                    if (I0 != null) {
                        gVar.h(str3, h3Var.a(I0, ""));
                    }
                }
                businessType = str;
                it7 = it;
                i17 = 0;
                i18 = 1;
                i19 = 3;
                i27 = 2;
            }
        }
        java.lang.String gVar3 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar3, "toString(...)");
        return gVar3;
    }

    public final com.tencent.mm.plugin.finder.extension.reddot.jb c(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_LONG_VIDEO_REDOT_INFO_STRING_SYNC, null);
        if (str != null) {
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = new com.tencent.mm.plugin.finder.extension.reddot.jb();
            r45.vs2 vs2Var = new r45.vs2();
            byte[] bytes = str.getBytes(r26.c.f368867c);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            vs2Var.parseFrom(bytes);
            jbVar.t0(vs2Var);
            com.tencent.mars.xlog.Log.i("FinderRedDotConverter", ya.b.SOURCE + source + " getLongVideoReddot suc " + jbVar + '!');
            if (jbVar.field_tips_uuid == null || jbVar.field_tipsId == null || jbVar.N.getLong(3) == 0) {
                jbVar = null;
            }
            if (jbVar != null) {
                return jbVar;
            }
        }
        com.tencent.mars.xlog.Log.i("FinderRedDotConverter", ya.b.SOURCE + source + " getLongVideoReddot but long video cache reddot is empty!");
        return null;
    }

    public final void d(java.lang.String source, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mm.plugin.finder.extension.reddot.jb c17 = c(source);
        if (c17 != null) {
            if (kotlin.jvm.internal.o.b(c17.field_tipsId, jbVar != null ? jbVar.field_tipsId : null)) {
                e(source, "NewLife.Entrance", "2");
            }
        }
    }

    public final void e(java.lang.String source, java.lang.String path, java.lang.String businessType) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(businessType, "businessType");
        com.tencent.mars.xlog.Log.i("FinderRedDotConverter", ya.b.SOURCE + source + " removeLongVideoRedDot path:" + path + ",businessType:" + businessType);
        boolean z17 = false;
        if (com.tencent.mm.sdk.platformtools.t8.D1(businessType, 0) == 2 && kotlin.jvm.internal.o.b(path, "NewLife.Entrance")) {
            z17 = true;
        }
        if (z17) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LONG_VIDEO_REDOT_INFO_STRING_SYNC, "");
        }
    }
}
