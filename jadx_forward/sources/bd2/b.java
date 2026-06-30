package bd2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final bd2.b f100777a = new bd2.b();

    public static /* synthetic */ void b(bd2.b bVar, android.content.Context context, long j17, java.lang.String str, long j18, int i17, int i18, java.lang.Object obj) {
        bVar.a(context, j17, str, (i18 & 8) != 0 ? 0L : j18, (i18 & 16) != 0 ? 58 : i17);
    }

    public static void c(bd2.b bVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, long j17, int i17, int i18, java.lang.Object obj) {
        int i19;
        ec2.d e27;
        long j18 = (i18 & 4) != 0 ? 0L : j17;
        int i27 = (i18 & 8) != 0 ? 58 : i17;
        bVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        long mo2128x1ed62e84 = item.mo2128x1ed62e84();
        jx3.f.INSTANCE.mo68477x336bdfd8(1278L, 8L, 1L, false);
        java.lang.String str = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fys) + "/security/readtemplate?";
        java.lang.String i28 = bVar.i(context, item, j18, i27);
        java.lang.String str2 = str + i28;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209540wd).mo141623x754a37bb()).r()).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExposeLogic", "LiteApp query: " + bVar.i(context, item, j18, i27));
            xc2.y2 y2Var = xc2.y2.f534876a;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
            r45.k74 k74Var = new r45.k74();
            k74Var.set(0, "wxalite949d20096e938e0a9b88fb5793431a26");
            k74Var.set(2, i28);
            k74Var.set(3, str2);
            c19786x6a1e2862.m76551x3af0573b(k74Var);
            i19 = 0;
            xc2.y2.L(y2Var, context, new xc2.p0(c19786x6a1e2862), null, null, null, 28, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExposeLogic", "H5 url: " + str2);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str2);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            i19 = 0;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).nj(mo2128x1ed62e84);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar == null || (e27 = zy2.ra.e2(nyVar, i19, 1, null)) == null) {
            return;
        }
        e27.a(new ec2.a(17, mo2128x1ed62e84, item.w()));
    }

    public static /* synthetic */ void k(bd2.b bVar, android.content.Context context, r45.qt2 qt2Var, long j17, java.lang.String str, java.lang.Long l17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, int i18, java.lang.Object obj) {
        bVar.j(context, qt2Var, j17, str, (i18 & 16) != 0 ? null : l17, (i18 & 32) != 0 ? 62 : i17, (i18 & 64) != 0 ? null : abstractC14490x69736cb5);
    }

    public final void a(android.content.Context context, long j17, java.lang.String str, long j18, int i17) {
        ec2.d e27;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        boolean z17 = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        int i18 = nyVar != null ? nyVar.f216913n : 0;
        jx3.f.INSTANCE.mo68477x336bdfd8(1278L, 8L, 1L, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209540wd).mo141623x754a37bb()).r()).booleanValue()) {
            java.lang.String format = java.lang.String.format("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fys) + "/security/readtemplate?t=weixin_report/w_type&scene=%s&wechat_real_lang=%s&content_ID=%s&comment_ID=%s&commentscene=%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17), com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), pm0.v.u(j17), pm0.v.u(j18), java.lang.Integer.valueOf(i18)}, 5));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", format);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).nj(j17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            if (nyVar2 == null || (e27 = zy2.ra.e2(nyVar2, 0, 1, null)) == null) {
                return;
            }
            e27.a(new ec2.a(17, j17, str));
            return;
        }
        java.lang.String format2 = java.lang.String.format("t=weixin_report/w_type&scene=%s&wechat_real_lang=%s&content_ID=%s&commentscene=%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17), com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), pm0.v.u(j17), java.lang.Integer.valueOf(i18)}, 4));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        java.lang.String ek6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(j17, str, i18);
        if (ek6.length() > 0) {
            format2 = java.lang.String.format(format2.concat("&session_buffer=%s"), java.util.Arrays.copyOf(new java.lang.Object[]{ek6}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        }
        if (j18 != 0) {
            format2 = java.lang.String.format(format2.concat("&comment_ID=%s"), java.util.Arrays.copyOf(new java.lang.Object[]{pm0.v.u(j18)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        }
        pf5.z zVar = pf5.z.f435481a;
        boolean z18 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
        if (!z18) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
        java.lang.String str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216915p;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() > 0) {
            format2 = java.lang.String.format(format2.concat("&context_id=%s"), java.util.Arrays.copyOf(new java.lang.Object[]{str2}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        }
        if (!z18) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.String str3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216919r;
        java.lang.String str4 = str3 != null ? str3 : "";
        if (str4.length() > 0) {
            format2 = java.lang.String.format(format2.concat("&tabcontextid=%s&clicktabcontextid=%s"), java.util.Arrays.copyOf(new java.lang.Object[]{str4, str4}, 2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExposeLogic", "LiteApp query: ".concat(format2));
        xc2.y2 y2Var = xc2.y2.f534876a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
        r45.k74 k74Var = new r45.k74();
        k74Var.set(0, "wxalite949d20096e938e0a9b88fb5793431a26");
        k74Var.set(2, format2);
        c19786x6a1e2862.m76551x3af0573b(k74Var);
        xc2.y2.L(y2Var, context, new xc2.p0(c19786x6a1e2862), null, null, null, 28, null);
    }

    public final void d(android.content.Context context, long j17, long j18, int i17, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(dm.i4.f66865x76d1ec5a, pm0.v.u(j17));
        if (j18 != 0) {
            linkedHashMap.put("comment_ID", pm0.v.u(j18));
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            java.lang.String ek6 = o3Var.ek(j17, str, nyVar != null ? nyVar.f216913n : 0);
            if (!(ek6.length() == 0)) {
                linkedHashMap.put("session_buffer", ek6);
            }
        }
        l(context, h(context, i17, linkedHashMap), z17, sVar);
    }

    public final void f(android.content.Context context, long j17, java.lang.String str, long j18) {
        ec2.d e27;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&comment_ID=%s&Content_ID=%s", java.util.Arrays.copyOf(new java.lang.Object[]{63, pm0.v.u(j18), pm0.v.u(j17)}, 3));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).nj(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar == null || (e27 = zy2.ra.e2(nyVar, 0, 1, null)) == null) {
            return;
        }
        e27.a(new ec2.a(17, j17, str));
    }

    public final void g(android.content.Context context, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String format = java.lang.String.format("t=weixin_report/w_type&scene=%s&wechat_real_lang=%s&feed_id=%s&topic_id=%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54061x54ac4478), com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), pm0.v.u(j17), pm0.v.u(j18)}, 4));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        xc2.y2 y2Var = xc2.y2.f534876a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
        r45.k74 k74Var = new r45.k74();
        k74Var.set(0, "wxalite949d20096e938e0a9b88fb5793431a26");
        k74Var.set(2, format);
        c19786x6a1e2862.m76551x3af0573b(k74Var);
        xc2.y2.L(y2Var, context, new xc2.p0(c19786x6a1e2862), null, null, null, 28, null);
    }

    public final android.os.Bundle h(android.content.Context context, int i17, java.util.Map map) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalite949d20096e938e0a9b88fb5793431a26");
        cl0.g gVar = new cl0.g();
        gVar.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        gVar.o("commentscene", nyVar != null ? nyVar.f216913n : 0);
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                gVar.h((java.lang.String) entry.getKey(), entry.getValue());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExposeLogic", "[getExposeBundle] query: " + gVar);
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
    public final java.lang.String i(android.content.Context r10, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r11, long r12, int r14) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bd2.b.i(android.content.Context, com.tencent.mm.plugin.finder.model.BaseFinderFeed, long, int):java.lang.String");
    }

    public final void j(android.content.Context context, r45.qt2 qt2Var, long j17, java.lang.String username, java.lang.Long l17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        r45.cl2 cl2Var;
        java.lang.String l18;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        r45.dm2 m76806xdef68064;
        r45.cl2 cl2Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject4;
        java.lang.String m76829x97edf6c0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        ae2.in inVar = ae2.in.f85221a;
        java.lang.String str2 = "";
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.W1).mo141623x754a37bb()).r()).intValue() == 1) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
            r45.k74 k74Var = new r45.k74();
            k74Var.set(0, "wxalite1f98cad78dbda45c5954c91bd74da207");
            k74Var.set(1, "");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i17);
            jSONObject.put("liveid", pm0.v.u(j17));
            jSONObject.put("liveidentityid", username);
            if (l17 == null || (str = l17.toString()) == null) {
                str = "";
            }
            jSONObject.put("msgId", str);
            jSONObject.put("commentscene", java.lang.String.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0));
            jSONObject.put("from_scene", java.lang.String.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0));
            jSONObject.put("feed_id", pm0.v.u((abstractC14490x69736cb5 == null || (feedObject5 = abstractC14490x69736cb5.getFeedObject()) == null) ? 0L : feedObject5.m59251x5db1b11()));
            if (abstractC14490x69736cb5 != null && (feedObject3 = abstractC14490x69736cb5.getFeedObject()) != null && (feedObject4 = feedObject3.getFeedObject()) != null && (m76829x97edf6c0 = feedObject4.m76829x97edf6c0()) != null) {
                str2 = m76829x97edf6c0;
            }
            jSONObject.put("session_buffer", str2);
            java.lang.Long valueOf = (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null || (m76806xdef68064 = feedObject2.m76806xdef68064()) == null || (cl2Var2 = (r45.cl2) m76806xdef68064.m75936x14adae67(4)) == null) ? null : java.lang.Long.valueOf(cl2Var2.m75942xfb822ef2(1));
            if (valueOf != null) {
                jSONObject.put("ad_aid", valueOf.longValue());
            }
            k74Var.set(2, jSONObject.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExposeLogic", "liveExpose lite_app_info query:" + k74Var.m75945x2fec8307(2));
            c19786x6a1e2862.m76551x3af0573b(k74Var);
            xc2.y2.L(xc2.y2.f534876a, context, new xc2.p0(c19786x6a1e2862), null, null, null, 28, null);
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
        objArr[4] = java.lang.String.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0);
        objArr[5] = java.lang.String.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0);
        java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&liveid=%s&liveidentityid=%s&msgId=%s&commentscene=%s&from_scene=%s", java.util.Arrays.copyOf(objArr, 6));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        if (abstractC14490x69736cb5 != null) {
            r45.dm2 m76806xdef680642 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76806xdef68064();
            java.lang.Long valueOf2 = (m76806xdef680642 == null || (cl2Var = (r45.cl2) m76806xdef680642.m75936x14adae67(4)) == null) ? null : java.lang.Long.valueOf(cl2Var.m75942xfb822ef2(1));
            if (valueOf2 != null) {
                format = java.lang.String.format(format.concat("&ad_aid=%s"), java.util.Arrays.copyOf(new java.lang.Object[]{pm0.v.u(valueOf2.longValue())}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExposeLogic", "liveExpose liveId:" + j17 + ",username:" + username + ",commentSeq:" + l17 + " url: " + format);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("showShare", false);
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final void l(android.content.Context context, android.os.Bundle bundle, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar) {
        int i17;
        if (z17) {
            boolean z18 = true;
            bundle.putBoolean("isHalfScreen", true);
            double a17 = kx2.a.f394811a.a(context);
            int c17 = com.p314xaae8f345.mm.ui.bl.c(context == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context);
            android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int i18 = b17.x;
            int i19 = b17.y;
            java.lang.System.nanoTime();
            if (!com.p314xaae8f345.mm.ui.bk.y() && !com.p314xaae8f345.mm.ui.bk.Q() && !com.p314xaae8f345.mm.ui.bk.A()) {
                z18 = false;
            }
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (z18) {
                i17 = i19 - c17;
            } else {
                if (i19 >= i18) {
                    i18 = i19;
                }
                i17 = i18 - c17;
            }
            bundle.putDouble("heightPercent", (((int) (a17 * i17)) + com.p314xaae8f345.mm.ui.bl.c(context)) / context.getResources().getDisplayMetrics().heightPixels);
        }
        i95.m c18 = i95.n0.c(q80.g0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) c18)).jk(context, bundle, true, false, sVar, new bd2.a());
    }
}
