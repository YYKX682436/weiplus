package e00;

/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final e00.g f327305a = new e00.g();

    public static final void e(java.lang.String event, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, boolean z17, java.lang.String talkerUserName, int i17, int i18, java.lang.String appId, java.lang.String pagePath, java.lang.Integer num, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerUserName, "talkerUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagePath, "pagePath");
        java.lang.String str2 = z17 ? "2" : "1";
        java.lang.String d17 = g95.e0.d(msg);
        jz5.l[] lVarArr = new jz5.l[9];
        lVarArr[0] = new jz5.l("view_id", "chatting_item_appmsg_appbrand_container_view");
        lVarArr[1] = new jz5.l("card_id", java.lang.Long.valueOf(msg.I0()));
        lVarArr[2] = new jz5.l("card_type", java.lang.Integer.valueOf(i17));
        lVarArr[3] = new jz5.l("card_version", java.lang.Integer.valueOf(i18));
        lVarArr[4] = new jz5.l("appid", appId);
        lVarArr[5] = new jz5.l("pagepath", pagePath);
        lVarArr[6] = new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, str2);
        lVarArr[7] = new jz5.l("chatroomid", talkerUserName);
        if (d17 == null) {
            d17 = "";
        }
        lVarArr[8] = new jz5.l("share_username", d17);
        java.util.Map l17 = kz5.c1.l(lVarArr);
        if (num != null) {
            l17.put("chatroomuv", java.lang.Integer.valueOf(num.intValue()));
        }
        if (str != null) {
            java.lang.String str3 = str.length() > 0 ? str : null;
            if (str3 != null) {
                l17.put("biz_report_data", str3);
            }
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj(event, null, l17, 12, false);
        if (i17 <= 0 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(event, "view_clk")) {
            return;
        }
        f327305a.g(i17, bw5.x8.ECS_REQ_SCENE_CONVERSATION, false, true);
    }

    public final java.lang.String a(java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        int O = r26.n0.O(userName, '@', 0, false, 6, null);
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.s sVar = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.s.f147534a;
        if (O == -1) {
            return sVar.a(userName);
        }
        java.lang.String substring = userName.substring(0, O);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        java.lang.String a17 = sVar.a(substring);
        java.lang.String substring2 = userName.substring(O);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
        return a17.concat(substring2);
    }

    public final int b(java.lang.String talkerName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerName, "talkerName");
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(talkerName) || c01.e2.E(talkerName)) {
            return 4;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(talkerName)) {
            return 3;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(talkerName)) {
            return 2;
        }
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(talkerName) ? 5 : 1;
    }

    public final void c(int i17, bw5.ye0 reqInfo, long j17, bw5.f6 cgiResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqInfo, "reqInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiResult, "cgiResult");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, reqInfo.f116994i[3] ? reqInfo.f116990e : "");
        hashMap.put(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.WXWebPage.f32847x4430964b, java.lang.String.valueOf(reqInfo.f116991f));
        hashMap.put("bulk_buy_id", java.lang.String.valueOf(reqInfo.f116992g));
        d(bw5.g5.BULK_BUY_CARD, i17, j17, cgiResult, hashMap);
    }

    public final void d(bw5.g5 g5Var, int i17, long j17, bw5.f6 f6Var, java.util.Map map) {
        map.put("req_type", java.lang.String.valueOf(i17));
        map.put("cost_time", java.lang.String.valueOf(j17));
        map.put("cgi_result", java.lang.String.valueOf(f6Var.f108702d));
        y02.v0 a17 = y02.x0.f540167d.a();
        if (a17 != null) {
            a17.p1(bw5.d5.EcsEcCardCgiResult, g5Var.f109223d, j(map));
        }
    }

    public final void f(int i17, bw5.p10 reqInfo, long j17, bw5.f6 cgiResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqInfo, "reqInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiResult, "cgiResult");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("card_type", java.lang.String.valueOf(reqInfo.f112965d));
        boolean[] zArr = reqInfo.f112969h;
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, zArr[3] ? reqInfo.f112966e : "");
        hashMap.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, zArr[4] ? reqInfo.f112967f : "");
        d(bw5.g5.WAAPP_CARD, i17, j17, cgiResult, hashMap);
    }

    public final void g(int i17, bw5.x8 jumpScene, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpScene, "jumpScene");
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("jump_scene", java.lang.String.valueOf(jumpScene.f116533d));
        lVarArr[1] = new jz5.l("use_cache", java.lang.String.valueOf(z17));
        lVarArr[2] = new jz5.l("open_success", z18 ? "1" : "0");
        java.util.Map k17 = kz5.c1.k(lVarArr);
        y02.v0 a17 = y02.x0.f540167d.a();
        if (a17 != null) {
            a17.p1(bw5.d5.EcsEcCardOpenAction, i17, j(k17));
        }
    }

    public final void h(bw5.oe0 reqInfo, long j17, bw5.f6 cgiResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqInfo, "reqInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiResult, "cgiResult");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.LinkedList linkedList = reqInfo.f112613d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getProducts(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((bw5.ne0) it.next()).f112185d));
        }
        hashMap.put("product_id", arrayList.toString());
        d(bw5.g5.PRODUCT_CARD, reqInfo.f112614e, j17, cgiResult, hashMap);
    }

    public final void i(bw5.te0 reqInfo, long j17, bw5.f6 cgiResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqInfo, "reqInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiResult, "cgiResult");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.LinkedList linkedList = reqInfo.f114946d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getShops(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(((bw5.se0) it.next()).b());
        }
        hashMap.put("shop_id", arrayList.toString());
        d(bw5.g5.SHOP_CARD, reqInfo.f114947e, j17, cgiResult, hashMap);
    }

    public final java.lang.String j(java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "<this>");
        if (map.isEmpty()) {
            return "{}";
        }
        return "{" + kz5.n0.g0(map.entrySet(), "; ", null, null, 0, null, e00.f.f327294d, 30, null) + '}';
    }
}
