package bd2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final bd2.b f19244a = new bd2.b();

    public static /* synthetic */ void b(bd2.b bVar, android.content.Context context, long j17, java.lang.String str, long j18, int i17, int i18, java.lang.Object obj) {
        bVar.a(context, j17, str, (i18 & 8) != 0 ? 0L : j18, (i18 & 16) != 0 ? 58 : i17);
    }

    public static void c(bd2.b bVar, android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, long j17, int i17, int i18, java.lang.Object obj) {
        int i19;
        ec2.d e27;
        long j18 = (i18 & 4) != 0 ? 0L : j17;
        int i27 = (i18 & 8) != 0 ? 58 : i17;
        bVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        long itemId = item.getItemId();
        jx3.f.INSTANCE.idkeyStat(1278L, 8L, 1L, false);
        java.lang.String str = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fys) + "/security/readtemplate?";
        java.lang.String i28 = bVar.i(context, item, j18, i27);
        java.lang.String str2 = str + i28;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128007wd).getValue()).r()).booleanValue()) {
            com.tencent.mars.xlog.Log.i("FinderExposeLogic", "LiteApp query: " + bVar.i(context, item, j18, i27));
            xc2.y2 y2Var = xc2.y2.f453343a;
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
            r45.k74 k74Var = new r45.k74();
            k74Var.set(0, "wxalite949d20096e938e0a9b88fb5793431a26");
            k74Var.set(2, i28);
            k74Var.set(3, str2);
            finderJumpInfo.setLite_app_info(k74Var);
            i19 = 0;
            xc2.y2.L(y2Var, context, new xc2.p0(finderJumpInfo), null, null, null, 28, null);
        } else {
            com.tencent.mars.xlog.Log.i("FinderExposeLogic", "H5 url: " + str2);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str2);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            i19 = 0;
        }
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).nj(itemId);
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar == null || (e27 = zy2.ra.e2(nyVar, i19, 1, null)) == null) {
            return;
        }
        e27.a(new ec2.a(17, itemId, item.w()));
    }

    public static /* synthetic */ void k(bd2.b bVar, android.content.Context context, r45.qt2 qt2Var, long j17, java.lang.String str, java.lang.Long l17, int i17, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i18, java.lang.Object obj) {
        bVar.j(context, qt2Var, j17, str, (i18 & 16) != 0 ? null : l17, (i18 & 32) != 0 ? 62 : i17, (i18 & 64) != 0 ? null : baseFinderFeed);
    }

    public final void a(android.content.Context context, long j17, java.lang.String str, long j18, int i17) {
        ec2.d e27;
        kotlin.jvm.internal.o.g(context, "context");
        boolean z17 = context instanceof com.tencent.mm.ui.MMFragmentActivity;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = z17 ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        int i18 = nyVar != null ? nyVar.f135380n : 0;
        jx3.f.INSTANCE.idkeyStat(1278L, 8L, 1L, false);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128007wd).getValue()).r()).booleanValue()) {
            java.lang.String format = java.lang.String.format("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fys) + "/security/readtemplate?t=weixin_report/w_type&scene=%s&wechat_real_lang=%s&content_ID=%s&comment_ID=%s&commentscene=%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17), com.tencent.mm.sdk.platformtools.m2.d(), pm0.v.u(j17), pm0.v.u(j18), java.lang.Integer.valueOf(i18)}, 5));
            kotlin.jvm.internal.o.f(format, "format(...)");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", format);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).nj(j17);
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = z17 ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar2 == null || (e27 = zy2.ra.e2(nyVar2, 0, 1, null)) == null) {
                return;
            }
            e27.a(new ec2.a(17, j17, str));
            return;
        }
        java.lang.String format2 = java.lang.String.format("t=weixin_report/w_type&scene=%s&wechat_real_lang=%s&content_ID=%s&commentscene=%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17), com.tencent.mm.sdk.platformtools.m2.d(), pm0.v.u(j17), java.lang.Integer.valueOf(i18)}, 4));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        java.lang.String ek6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(j17, str, i18);
        if (ek6.length() > 0) {
            format2 = java.lang.String.format(format2.concat("&session_buffer=%s"), java.util.Arrays.copyOf(new java.lang.Object[]{ek6}, 1));
            kotlin.jvm.internal.o.f(format2, "format(...)");
        }
        if (j18 != 0) {
            format2 = java.lang.String.format(format2.concat("&comment_ID=%s"), java.util.Arrays.copyOf(new java.lang.Object[]{pm0.v.u(j18)}, 1));
            kotlin.jvm.internal.o.f(format2, "format(...)");
        }
        pf5.z zVar = pf5.z.f353948a;
        boolean z18 = context instanceof androidx.appcompat.app.AppCompatActivity;
        if (!z18) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
        java.lang.String str2 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() > 0) {
            format2 = java.lang.String.format(format2.concat("&context_id=%s"), java.util.Arrays.copyOf(new java.lang.Object[]{str2}, 1));
            kotlin.jvm.internal.o.f(format2, "format(...)");
        }
        if (!z18) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.String str3 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135386r;
        java.lang.String str4 = str3 != null ? str3 : "";
        if (str4.length() > 0) {
            format2 = java.lang.String.format(format2.concat("&tabcontextid=%s&clicktabcontextid=%s"), java.util.Arrays.copyOf(new java.lang.Object[]{str4, str4}, 2));
            kotlin.jvm.internal.o.f(format2, "format(...)");
        }
        com.tencent.mars.xlog.Log.i("FinderExposeLogic", "LiteApp query: ".concat(format2));
        xc2.y2 y2Var = xc2.y2.f453343a;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
        r45.k74 k74Var = new r45.k74();
        k74Var.set(0, "wxalite949d20096e938e0a9b88fb5793431a26");
        k74Var.set(2, format2);
        finderJumpInfo.setLite_app_info(k74Var);
        xc2.y2.L(y2Var, context, new xc2.p0(finderJumpInfo), null, null, null, 28, null);
    }

    public final void d(android.content.Context context, long j17, long j18, int i17, boolean z17, com.tencent.mm.plugin.lite.s sVar, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(dm.i4.COL_ID, pm0.v.u(j17));
        if (j18 != 0) {
            linkedHashMap.put("comment_ID", pm0.v.u(j18));
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            java.lang.String ek6 = o3Var.ek(j17, str, nyVar != null ? nyVar.f135380n : 0);
            if (!(ek6.length() == 0)) {
                linkedHashMap.put("session_buffer", ek6);
            }
        }
        l(context, h(context, i17, linkedHashMap), z17, sVar);
    }

    public final void f(android.content.Context context, long j17, java.lang.String str, long j18) {
        ec2.d e27;
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&comment_ID=%s&Content_ID=%s", java.util.Arrays.copyOf(new java.lang.Object[]{63, pm0.v.u(j18), pm0.v.u(j17)}, 3));
        kotlin.jvm.internal.o.f(format, "format(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).nj(j17);
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar == null || (e27 = zy2.ra.e2(nyVar, 0, 1, null)) == null) {
            return;
        }
        e27.a(new ec2.a(17, j17, str));
    }

    public final void g(android.content.Context context, long j17, long j18) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String format = java.lang.String.format("t=weixin_report/w_type&scene=%s&wechat_real_lang=%s&feed_id=%s&topic_id=%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_CODEC_EXCEPTION), com.tencent.mm.sdk.platformtools.m2.d(), pm0.v.u(j17), pm0.v.u(j18)}, 4));
        kotlin.jvm.internal.o.f(format, "format(...)");
        xc2.y2 y2Var = xc2.y2.f453343a;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
        r45.k74 k74Var = new r45.k74();
        k74Var.set(0, "wxalite949d20096e938e0a9b88fb5793431a26");
        k74Var.set(2, format);
        finderJumpInfo.setLite_app_info(k74Var);
        xc2.y2.L(y2Var, context, new xc2.p0(finderJumpInfo), null, null, null, 28, null);
    }

    public final android.os.Bundle h(android.content.Context context, int i17, java.util.Map map) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalite949d20096e938e0a9b88fb5793431a26");
        cl0.g gVar = new cl0.g();
        gVar.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i17);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        gVar.o("commentscene", nyVar != null ? nyVar.f135380n : 0);
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                gVar.h((java.lang.String) entry.getKey(), entry.getValue());
            }
        }
        com.tencent.mars.xlog.Log.i("FinderExposeLogic", "[getExposeBundle] query: " + gVar);
        bundle.putString("query", gVar.toString());
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String i(android.content.Context r10, com.tencent.mm.plugin.finder.model.BaseFinderFeed r11, long r12, int r14) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bd2.b.i(android.content.Context, com.tencent.mm.plugin.finder.model.BaseFinderFeed, long, int):java.lang.String");
    }

    public final void j(android.content.Context context, r45.qt2 qt2Var, long j17, java.lang.String username, java.lang.Long l17, int i17, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        r45.cl2 cl2Var;
        java.lang.String l18;
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        r45.dm2 object_extend;
        r45.cl2 cl2Var2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject3;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject4;
        java.lang.String sessionBuffer;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject5;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        ae2.in inVar = ae2.in.f3688a;
        java.lang.String str2 = "";
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.W1).getValue()).r()).intValue() == 1) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
            r45.k74 k74Var = new r45.k74();
            k74Var.set(0, "wxalite1f98cad78dbda45c5954c91bd74da207");
            k74Var.set(1, "");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i17);
            jSONObject.put("liveid", pm0.v.u(j17));
            jSONObject.put("liveidentityid", username);
            if (l17 == null || (str = l17.toString()) == null) {
                str = "";
            }
            jSONObject.put("msgId", str);
            jSONObject.put("commentscene", java.lang.String.valueOf(qt2Var != null ? qt2Var.getInteger(5) : 0));
            jSONObject.put("from_scene", java.lang.String.valueOf(qt2Var != null ? qt2Var.getInteger(7) : 0));
            jSONObject.put("feed_id", pm0.v.u((baseFinderFeed == null || (feedObject5 = baseFinderFeed.getFeedObject()) == null) ? 0L : feedObject5.getId()));
            if (baseFinderFeed != null && (feedObject3 = baseFinderFeed.getFeedObject()) != null && (feedObject4 = feedObject3.getFeedObject()) != null && (sessionBuffer = feedObject4.getSessionBuffer()) != null) {
                str2 = sessionBuffer;
            }
            jSONObject.put("session_buffer", str2);
            java.lang.Long valueOf = (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null || (object_extend = feedObject2.getObject_extend()) == null || (cl2Var2 = (r45.cl2) object_extend.getCustom(4)) == null) ? null : java.lang.Long.valueOf(cl2Var2.getLong(1));
            if (valueOf != null) {
                jSONObject.put("ad_aid", valueOf.longValue());
            }
            k74Var.set(2, jSONObject.toString());
            com.tencent.mars.xlog.Log.i("FinderExposeLogic", "liveExpose lite_app_info query:" + k74Var.getString(2));
            finderJumpInfo.setLite_app_info(k74Var);
            xc2.y2.L(xc2.y2.f453343a, context, new xc2.p0(finderJumpInfo), null, null, null, 28, null);
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Long.valueOf(j17);
        objArr[2] = username;
        if (l17 != null && (l18 = l17.toString()) != null) {
            str2 = l18;
        }
        objArr[3] = str2;
        objArr[4] = java.lang.String.valueOf(qt2Var != null ? qt2Var.getInteger(5) : 0);
        objArr[5] = java.lang.String.valueOf(qt2Var != null ? qt2Var.getInteger(7) : 0);
        java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&liveid=%s&liveidentityid=%s&msgId=%s&commentscene=%s&from_scene=%s", java.util.Arrays.copyOf(objArr, 6));
        kotlin.jvm.internal.o.f(format, "format(...)");
        if (baseFinderFeed != null) {
            r45.dm2 object_extend2 = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
            java.lang.Long valueOf2 = (object_extend2 == null || (cl2Var = (r45.cl2) object_extend2.getCustom(4)) == null) ? null : java.lang.Long.valueOf(cl2Var.getLong(1));
            if (valueOf2 != null) {
                format = java.lang.String.format(format.concat("&ad_aid=%s"), java.util.Arrays.copyOf(new java.lang.Object[]{pm0.v.u(valueOf2.longValue())}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
            }
        }
        com.tencent.mars.xlog.Log.i("FinderExposeLogic", "liveExpose liveId:" + j17 + ",username:" + username + ",commentSeq:" + l17 + " url: " + format);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("showShare", false);
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final void l(android.content.Context context, android.os.Bundle bundle, boolean z17, com.tencent.mm.plugin.lite.s sVar) {
        int i17;
        if (z17) {
            boolean z18 = true;
            bundle.putBoolean("isHalfScreen", true);
            double a17 = kx2.a.f313278a.a(context);
            int c17 = com.tencent.mm.ui.bl.c(context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context);
            android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            int i18 = b17.x;
            int i19 = b17.y;
            java.lang.System.nanoTime();
            if (!com.tencent.mm.ui.bk.y() && !com.tencent.mm.ui.bk.Q() && !com.tencent.mm.ui.bk.A()) {
                z18 = false;
            }
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z18) {
                i17 = i19 - c17;
            } else {
                if (i19 >= i18) {
                    i18 = i19;
                }
                i17 = i18 - c17;
            }
            bundle.putDouble("heightPercent", (((int) (a17 * i17)) + com.tencent.mm.ui.bl.c(context)) / context.getResources().getDisplayMetrics().heightPixels);
        }
        i95.m c18 = i95.n0.c(q80.g0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ((com.tencent.mm.feature.lite.i) ((q80.g0) c18)).jk(context, bundle, true, false, sVar, new bd2.a());
    }
}
