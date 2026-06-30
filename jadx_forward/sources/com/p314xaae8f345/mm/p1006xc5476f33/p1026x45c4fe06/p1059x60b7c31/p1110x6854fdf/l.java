package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public abstract class l extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: g, reason: collision with root package name */
    public final int f164706g = cf.b.a(this);

    /* renamed from: h, reason: collision with root package name */
    public boolean f164707h = false;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        try {
            L(c0Var, i17, F(c0Var, jSONObject));
        } catch (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiShareAppMessageBase", e17, "hy: illegal params", new java.lang.Object[0]);
            java.lang.String message = e17.getMessage();
            this.f164707h = false;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (!(message == null ? "" : message).startsWith("fail")) {
                message = "fail: " + message;
            }
            c0Var.a(i17, p(message, null));
        }
    }

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u C();

    public void D(android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07;
        if (uVar.f164798k || uVar.f164791d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareAppMessageBase", "fillIntentForForwardToWeWorkWhenSelectContactsIfNeed, forbid 1");
            intent.putExtra("selectionconversationui_forbid_send_to_wework", true);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareAppMessageBase", "fillIntentForForwardToWeWorkWhenSelectContactsIfNeed, do fill");
        intent.putExtra("from_scene_forward_to_wework", 6);
        intent.putExtra("content_type_forward_to_wework", 5);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = c0Var.t3();
        if (t37 == null || (u07 = t37.u0()) == null) {
            str = null;
            str2 = null;
        } else {
            java.lang.String str3 = u07.f158813f;
            str2 = u07.f158812e;
            str = str3;
        }
        java.lang.String str4 = !android.text.TextUtils.isEmpty(uVar.C) ? uVar.C : uVar.f164796i;
        if (!android.text.TextUtils.isEmpty(str4)) {
            str4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n2.b(str4);
        }
        java.lang.String str5 = str4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareAppMessageBase", "fillIntentForForwardToWeWorkWhenSelectContactsIfNeed, imgPath: %s", str5);
        intent.putExtra("Select_Data_Send_To_WeWork", new com.p314xaae8f345.mm.p2610xe8058ca2.C21008x40c862d0(uVar.f164810w, uVar.f164795h, str, str5, str2, uVar.f164793f, java.lang.Integer.valueOf(uVar.f164792e)));
    }

    public void E(android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar) {
        intent.putExtra("Select_Conv_Type", 35);
        intent.putExtra("mutil_select_is_ret", !uVar.f164791d);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("scene_from", 3);
        intent.putExtra("appbrand_params", uVar.I);
        intent.putExtra("Retr_Msg_Type", 2);
        uVar.f164804q.d(uVar, intent);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareAppMessageBase", "invoke share app message directly.");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u C = C();
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareAppMessageBase", "data is null");
            throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t("data is null");
        }
        android.app.Activity Z0 = c0Var.Z0();
        C.f164788a = Z0;
        if (Z0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareAppMessageBase", "share app message fail, context is null");
            throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t("fail:internal error invalid android context");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) c0Var.W0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7.class);
        C.f164789b = n7Var;
        if (n7Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareAppMessageBase", "share app message fail, pageView is null");
            throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t("current page do not exist");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 H1 = n7Var.H1(3);
        if (H1 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareAppMessageBase", "share app message fail, menuInfo is null.");
            throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t("menu is null");
        }
        java.lang.String optString = jSONObject.optString("type");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1218xd0d16f79.c.a(c0Var.t3());
        if (k01.j.f384572a.b(null, c0Var.t3().f156336n)) {
            optString = "native_game_card";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            optString = "normal";
        }
        C.P = jSONObject.optString(ya.b.f77495x8b74a326, "");
        java.lang.String optString2 = jSONObject.optString("to");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareAppMessageBase", "hy: share type is %s", optString);
        C.f164804q = "video".equalsIgnoreCase(optString) ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.a0() : "h5".equalsIgnoreCase(optString) ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.x() : "weishi".equalsIgnoreCase(optString) ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.b0() : "native_game_card".equals(optString) ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.y() : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.z(null);
        C.f164790c = c0Var.t3().E0();
        boolean d17 = H1.f167529d.d("enable_share_with_share_ticket", false);
        C.f164791d = d17;
        if (!d17 && (c0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.x)) {
            C.f164791d = "withShareTicket".equals(jSONObject.optString("mode"));
        }
        C.H = H1.f167529d.d("is_todo_message", false);
        C.G = H1.f167529d.f("share_todo_activity_id", "");
        C.f164792e = C.f164791d ? 3 : 2;
        C.f164793f = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        C.f164794g = jSONObject.optString("desc", "");
        C.f164795h = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
        C.f164796i = jSONObject.optString("imageUrl");
        C.f164797j = jSONObject.optString("cacheKey");
        boolean optBoolean = jSONObject.optBoolean("disableForward", false);
        C.f164798k = optBoolean;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareAppMessageBase", "disableForward:%b", java.lang.Boolean.valueOf(optBoolean));
        C.f164799l = jSONObject.optString("messageExtraData");
        C.f164800m = jSONObject.optInt("cardSubType", 0);
        C.D = jSONObject.optBoolean("useDefaultSnapshot", true);
        C.f164801n = optString2;
        C.f164802o = jSONObject.optString("thumbDataHash");
        C.f164803p = jSONObject.optString("signature");
        C.L = jSONObject.optBoolean("hasRelievedBuyPlugin");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareAppMessageBase", "thumbDataHash:%s, signature:%s", C.f164802o, C.f164803p);
        C.M = H1.f167529d.d("share_useForChatTool", false) ? "subpackage" : "";
        C.N = H1.f167529d.f("share_participant", "");
        C.O = H1.f167529d.e("share_choose_type", 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = c0Var.t3().u0();
        if (u07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShareAppMessageBase", "hy: no init config");
            throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t("no init config");
        }
        C.f164805r = H1.f167529d.g("enable_share_dynamic");
        C.f164806s = H1.f167529d.g("enable_share_with_updateable_msg");
        C.f164807t = H1.f167529d.g("enable_share_with_private_msg");
        C.f164808u = H1.f167529d.f("enable_share_with_updateable_msg_template_id", "");
        C.f164809v = c0Var.mo48798x74292566();
        C.f164810w = u07.f128811x;
        C.f164811x = C.f164790c.f387385r.f156932d;
        C.f164812y = C.f164790c.f387385r.f33456x1c82a56c;
        C.f164813z = c0Var.t3().u0().f128817z;
        C.A = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v9.b(c0Var.mo48798x74292566());
        C.B = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(C.f164796i);
        java.lang.String e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n2.e(C.f164789b, C.f164796i, C.D);
        C.C = e17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareAppMessageBase", "imgPath[%s] imageUrl[%s] default[%s]", e17, C.f164796i, java.lang.Boolean.valueOf(C.D));
        java.util.HashMap hashMap = new java.util.HashMap();
        C.I = hashMap;
        hashMap.put("desc", C.f164794g);
        C.I.put("type", java.lang.Integer.valueOf(C.f164792e));
        C.I.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, C.f164793f);
        C.I.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, C.f164809v);
        C.I.put("pkg_type", java.lang.Integer.valueOf(C.f164811x));
        C.I.put("pkg_version", java.lang.Integer.valueOf(C.f164812y));
        C.I.put("img_url", C.f164796i);
        C.I.put("is_dynamic", java.lang.Boolean.valueOf(C.f164805r));
        C.I.put("cache_key", C.f164797j);
        C.I.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, C.f164795h);
        C.I.put("disableForward", java.lang.Boolean.valueOf(C.f164798k));
        C.I.put("subType", java.lang.Integer.valueOf(C.f164800m));
        C.I.put("thumbDataHash", C.f164802o);
        C.I.put("signature", C.f164803p);
        C.I.put(dm.i4.f66875xa013b0d5, C.f164810w);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(C.C)) {
            C.I.put("delay_load_img_path", C.C);
        }
        C.E = jSONObject.optString("openId");
        java.lang.String optString3 = jSONObject.optString("chatroomUsername");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            optString3 = H1.f167529d.f("share_to_user", "");
            c01.l2 l2Var = H1.f167529d;
            l2Var.getClass();
            if (!android.text.TextUtils.isEmpty("share_to_user")) {
                ((c01.k2) l2Var.f118838a).remove("share_to_user");
            }
        }
        C.F = optString3;
        C.f164804q.a(C, c0Var, jSONObject);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 V0 = c0Var.V0();
        of1.w1 s37 = V0 == null ? null : V0.s3();
        if (s37 != null) {
            C.K = s37.mo51533xad58292c();
        } else if (V0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.n) {
            C.K = jSONObject.optString("webViewUrl");
        }
        boolean optBoolean2 = jSONObject.optBoolean("sdk_isFromMenu", false);
        java.lang.String k17 = k();
        if (android.text.TextUtils.isEmpty(k17) || k17.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.k.f34812x24728b)) {
            C.f164787J = 0;
        } else if (k17.contains("ToSpecificContact")) {
            C.f164787J = 2;
        } else if (optBoolean2) {
            C.f164787J = 0;
        } else {
            C.f164787J = 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareAppMessageBase", "hy: params: %s", C.m51294x9616526c());
        return C;
    }

    public void G(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12236xd46e1713 c12236xd46e1713, java.lang.String str, java.lang.String str2, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar) {
        boolean b17;
        c12236xd46e1713.f164600m = str2;
        c12236xd46e1713.f164601n = str;
        c12236xd46e1713.f164595f = uVar.f164809v;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = c0Var.t3();
        if (t37 == null || t37.u0() == null || !(t37.u0() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiShareAppMessageBase", "hy: can not retrieve init config");
            c12236xd46e1713.Z = -1;
        } else {
            c12236xd46e1713.Z = t37.u0().L;
        }
        c12236xd46e1713.f164596g = uVar.f164810w;
        c12236xd46e1713.f164597h = uVar.f164793f;
        c12236xd46e1713.f164598i = uVar.f164794g;
        c12236xd46e1713.f164602o = uVar.A;
        c12236xd46e1713.f164609t = uVar.f164795h;
        c12236xd46e1713.f164613x = uVar.f164792e;
        c12236xd46e1713.f164608s = uVar.B;
        c12236xd46e1713.f164603p = uVar.f164796i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a195 = uVar.f164790c;
        c12236xd46e1713.f164606q = c11813xf952a195.f387376f;
        c12236xd46e1713.f164610u = c11813xf952a195.f387385r.f156932d;
        c12236xd46e1713.f164611v = uVar.f164790c.f387385r.f156905md5;
        c12236xd46e1713.f164612w = uVar.f164790c.f387385r.f33456x1c82a56c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a1952 = uVar.f164790c;
        c12236xd46e1713.f164616y = c11813xf952a1952.f387374d;
        c12236xd46e1713.f164619z = uVar.f164799l;
        c12236xd46e1713.K1 = c11813xf952a1952.f158876z1;
        c12236xd46e1713.L1 = c11813xf952a1952.C1;
        c12236xd46e1713.M1 = uVar.L;
        c12236xd46e1713.G = uVar.f164800m;
        c12236xd46e1713.H = uVar.f164802o;
        c12236xd46e1713.I = uVar.f164803p;
        c12236xd46e1713.F = uVar.f164798k ? 1 : 0;
        if (t37.E0() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195) {
            c12236xd46e1713.R1 = k91.a.f387056g.a(t37.E0());
        }
        c12236xd46e1713.f164594J = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(uVar.f164809v).f167242b.getAndIncrement();
        c12236xd46e1713.N = uVar.f164789b.X1();
        c12236xd46e1713.P = uVar.f164789b.J1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 l27 = uVar.f164789b.mo32091x9a3f0ba2().l2();
        if (l27 != null) {
            int i17 = l27.f169323f;
            if (i17 == 0) {
                i17 = 1000;
            }
            c12236xd46e1713.K = i17;
            java.lang.String str3 = l27.f169324g;
            if (str3 == null) {
                str3 = "";
            }
            c12236xd46e1713.L = str3;
            java.lang.String str4 = uVar.f164789b.mo32091x9a3f0ba2().u0().f128809v;
            if (str4 == null) {
                str4 = "";
            }
            c12236xd46e1713.M = str4;
        }
        c12236xd46e1713.f164607r = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n2.b(uVar.C);
        c12236xd46e1713.Q = uVar.f164791d;
        c12236xd46e1713.R = uVar.f164805r;
        c12236xd46e1713.S = uVar.f164806s;
        c12236xd46e1713.T = uVar.f164807t;
        c12236xd46e1713.V = uVar.f164808u;
        c12236xd46e1713.W = uVar.f164797j;
        c12236xd46e1713.Y = uVar.f164813z;
        c12236xd46e1713.X = uVar.K;
        uVar.f164804q.b(uVar, c12236xd46e1713, c0Var);
        c12236xd46e1713.O1 = uVar.H;
        c12236xd46e1713.N1 = uVar.G;
        c12236xd46e1713.P1 = z17;
        c12236xd46e1713.Q1 = uVar.f164787J;
        c12236xd46e1713.S1 = uVar.M;
        c12236xd46e1713.U1 = uVar.N;
        c12236xd46e1713.V1 = uVar.O;
        j91.d dVar = (j91.d) t37.K1(j91.d.class);
        if (dVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t) dVar;
            if (tVar.f()) {
                c12236xd46e1713.T1 = tVar.c();
                c12236xd46e1713.X1 = tVar.e();
                return;
            }
            synchronized (tVar) {
                java.lang.String chatToolMode = tVar.f161993h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatToolMode, "chatToolMode");
                b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(chatToolMode, "subpackage");
            }
            if (b17) {
                c12236xd46e1713.T1 = tVar.c();
                c12236xd46e1713.X1 = new java.util.ArrayList();
            } else {
                c12236xd46e1713.T1 = "";
                c12236xd46e1713.X1 = new java.util.ArrayList();
            }
        }
    }

    public java.util.Map H(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12236xd46e1713 c12236xd46e1713, java.lang.String str) {
        if (!uVar.f164791d) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c12236xd46e1713.I1)) {
                java.util.Iterator it = c12236xd46e1713.I1.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12239x1921410d c12239x1921410d = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12239x1921410d) it.next();
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("shareKey", c12239x1921410d.f164627d);
                    jSONObject.put("shareName", c12239x1921410d.f164628e);
                    jSONArray.put(jSONObject);
                }
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShareAppMessageBase", android.util.Log.getStackTraceString(e17));
        }
        hashMap.put("shareInfos", jSONArray);
        return hashMap;
    }

    public void I(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar) {
    }

    public void J(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, int i17) {
    }

    public void K(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, java.lang.String str) {
    }

    public void L(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar) {
        java.lang.String str;
        java.lang.String str2;
        android.content.Intent intent = new android.content.Intent();
        E(intent, uVar);
        if (this.f164707h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiShareAppMessageBase", "shareAppMessage, last share not complete");
            c0Var.a(i17, o("fail:last share not complete"));
            return;
        }
        this.f164707h = true;
        if (!"__wx_assistant_custom".equals(uVar.P)) {
            if (!android.text.TextUtils.isEmpty(uVar.f164801n) && uVar.f164801n.equals("qyweixin")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShareAppMessageBase", "shareAppMessage, share to wework, why?");
                this.f164707h = false;
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uVar.E) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uVar.F)) {
                D(intent, uVar, c0Var);
                M(c0Var, i17, uVar, intent, false);
                return;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uVar.F)) {
                intent.putExtra("Select_Conv_User", uVar.F);
                intent.putExtra("KSendWording", uVar.f164788a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4x));
                M(c0Var, i17, uVar, intent, true);
                return;
            }
            r45.q46 q46Var = new r45.q46();
            q46Var.f465211d = uVar.f164809v;
            q46Var.f465212e = uVar.E;
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = 1961;
            lVar.f152199c = "/cgi-bin/mmbiz-bin/wxabusiness/share_transid";
            lVar.f152197a = q46Var;
            lVar.f152198b = new r45.r46();
            ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.m(this, intent, uVar, c0Var, i17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareAppMessageBase", "shareAppMessage, custom origin");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.h hVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.h) c0Var.t3().K1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.h.class);
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiShareAppMessageBase", "shareAppMessage, custom origin, shareAppMessageService is null");
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str2, jSONObject));
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.v1) hVar).f164822d;
        if (true ^ copyOnWriteArrayList.isEmpty()) {
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
                try {
                    throw null;
                    break;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShareAppMessageService", "customInvoke: delegate failed, " + e18);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShareAppMessageService", "No delegate registered, skip custom invoke");
        str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        str2 = str != null ? str : "";
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 4);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        c0Var.a(i17, u(str2, jSONObject2));
    }

    public final void M(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, android.content.Intent intent, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N2;
        ce.g gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n(this, c0Var, i17, uVar);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        boolean z18 = uVar.f164804q instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.z;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = c0Var.t3();
        if (z18 && t37 != null && t37.q2() && (N2 = t37.N2()) != null && (gVar = (ce.g) N2.B1(ce.g.class)) != null) {
            ((ce.o) gVar).V(false, true, null);
        }
        c0Var.j(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.q(this, uVar, nVar, z18, t37, z17, intent), uVar.f164804q.e(uVar) ? 200L : 0L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return true;
    }
}
