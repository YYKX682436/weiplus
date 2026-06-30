package aq1;

/* loaded from: classes11.dex */
public class e implements vg3.q3, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public static int f94569d = -1;

    public static java.lang.Object a(java.lang.Object obj, java.util.concurrent.Callable callable) {
        try {
            return callable.call();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BigBallContactAssemblerImpl", th6, "[-] exception thrown.", new java.lang.Object[0]);
            return obj;
        }
    }

    public static boolean b(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, r45.tn4 tn4Var, boolean z17) {
        r61.a h17;
        if (z3Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.d1())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BigBallContactAssemblerImpl", "dkinit dealModContactExtInfo failed invalid contact");
            return false;
        }
        java.lang.String d17 = z3Var.d1();
        java.lang.String J0 = z3Var.J0();
        if (z3Var.s2()) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().p(d17, true);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().p(d17, false);
            ((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).pj(d17);
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().u0(d17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "isDeleteContact, so delete avatar file.");
        } else {
            com.p314xaae8f345.mm.p943x351df9c2.g.e(d17, tn4Var, z3Var);
        }
        r45.cb6 cb6Var = tn4Var.R;
        if (!z3Var.d1().endsWith("@chatroom") && cb6Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "SnsFlag modcontact " + cb6Var.f452961d + " " + tn4Var.f468122d);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SnsBg modcontact ");
            sb6.append(cb6Var.f452962e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", sb6.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "SnsBgId modcontact " + cb6Var.f452963f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "SnsBgId modcontact " + cb6Var.f452964g);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "SnsBgId modcontact " + cb6Var.f452965h);
            if (p94.w0.c() != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).z1(z3Var.d1(), cb6Var);
            }
        }
        if (z3Var.r2()) {
            gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.q1(d17, J0));
        }
        if (z3Var.r2() && ((z3Var.m43619x2fa78b11() == 10 || z3Var.m43619x2fa78b11() == 13) && (h17 = m61.k.wi().h(z3Var.J0())) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.f474338u))) {
            h17.f474325h = z3Var.d1();
            m61.k.wi().j(h17.f474338u, h17);
        }
        e(tn4Var, d17, z3Var, z17);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(d17)) {
            r45.va0 va0Var = tn4Var.W;
            if (va0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BigBallContactAssemblerImpl", "[-] cmdMC.CustomizedInfo is null, user:%s", d17);
            } else if (android.text.TextUtils.isEmpty(va0Var.f469555e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BigBallContactAssemblerImpl", "[-] cmdMC.CustomizedInfo.ExternalInfo is null, user:%s", d17);
            } else {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "yuanbao config: %s", tn4Var.W.f469555e);
                    final org.json.JSONObject jSONObject = new org.json.JSONObject(tn4Var.W.f469555e);
                    vh0.f1 ij6 = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).ij(d17);
                    ((xh0.e) ij6).f536020b.put("menu", jSONObject.toString());
                    final org.json.JSONObject jSONObject2 = (org.json.JSONObject) a(null, new java.util.concurrent.Callable() { // from class: aq1.e$$a
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            return jSONObject.getJSONObject("profile_info");
                        }
                    });
                    if (jSONObject2 != null) {
                        org.json.JSONArray jSONArray = (org.json.JSONArray) a(null, new java.util.concurrent.Callable() { // from class: aq1.e$$b
                            @Override // java.util.concurrent.Callable
                            public final java.lang.Object call() {
                                return jSONObject2.getJSONArray("profile_info_detail");
                            }
                        });
                        if (jSONArray != null) {
                            ((xh0.e) ij6).f536020b.put("profileInfoDetail", jSONArray.toString());
                        }
                        java.lang.String optString = jSONObject2.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd);
                        if (optString != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "get appid { %s } for username:%s", optString, d17);
                            ((xh0.e) ij6).f536020b.put("openIMId", optString);
                        }
                        java.lang.String optString2 = jSONObject2.optString("desc_id");
                        if (optString2 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "get openIMDescId { %s } for username:%s", optString2, d17);
                            ((xh0.e) ij6).f536020b.put("openIMDescId", optString2);
                        }
                        java.lang.String optString3 = jSONObject2.optString("custom_info");
                        if (optString3 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "get openIMCustomInfo { %s } for username:%s", optString3, d17);
                            ((xh0.e) ij6).f536020b.put("openIMCustomInfo", optString3);
                        }
                    }
                    java.lang.Object opt = jSONObject.opt("toolbar_flag");
                    if (opt != null) {
                        ((xh0.e) ij6).f536020b.put("toolbarFlag", java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F1(opt.toString(), 0L)));
                    }
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(d17)) {
                        org.json.JSONObject jSONObject3 = (org.json.JSONObject) a(null, new java.util.concurrent.Callable() { // from class: aq1.e$$c
                            @Override // java.util.concurrent.Callable
                            public final java.lang.Object call() {
                                return jSONObject.getJSONObject("weclaw_info");
                            }
                        });
                        if (jSONObject3 != null) {
                            java.lang.Object opt2 = jSONObject3.opt("shortcut_list");
                            if (opt2 != null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "weclaw shortcut_list: %s, username:%s", opt2, d17);
                                ((xh0.e) ij6).b(opt2.toString());
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "weclaw shortcut_list is empty/null, clear for username:%s", d17);
                                ((xh0.e) ij6).b("");
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "weclaw weclaw_info is empty/invalid, clear shortcutList for username:%s", d17);
                            ((xh0.e) ij6).b("");
                        }
                    }
                    if (!((xh0.e) ij6).a()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BigBallContactAssemblerImpl", "[-] fail to do actual update logic, username:%s", d17);
                    }
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BigBallContactAssemblerImpl", e17, "saveChatBotInfo error, user:%s", d17);
                }
            }
        }
        return true;
    }

    public static void c(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        if (z3Var == null || !r01.z.h(z3Var.d1())) {
            return;
        }
        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
        java.lang.String d17 = z3Var.d1();
        ((qv.o) u2Var).getClass();
        if (r01.z.g(d17)) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p(z3Var.d1());
        qk.o b17 = r01.q3.cj().b1(z3Var.d1());
        if (r01.z.i(b17.f66748xdec927b) && p17 == null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4(b17.f66748xdec927b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "Enterprise belong %s, userName: %s", b17.y0(), b17.f66748xdec927b);
            java.lang.String y07 = b17.y0();
            if (y07 == null) {
                y07 = "";
            }
            l4Var.T1(y07);
            l4Var.f2();
            ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).G(l4Var);
        }
    }

    public static boolean d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        java.util.regex.Matcher matcher = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.b0.f272713o.matcher(str);
        return matcher.find() && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, matcher.group(0));
    }

    public static void e(r45.tn4 tn4Var, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17) {
        org.json.JSONObject jSONObject;
        java.lang.String r17 = c01.z1.r();
        if (r17 == null || r17.equals(str)) {
            return;
        }
        qk.o b17 = r01.q3.cj().b1(str);
        b17.f66748xdec927b = str;
        b17.f66736x6bad7fc0 = tn4Var.V;
        r45.va0 va0Var = tn4Var.W;
        if (va0Var != null) {
            b17.f66733x6baace8e = va0Var.f469554d;
            b17.f66735x6bac33d0 = va0Var.f469556f;
            b17.f66734xea1bd3d4 = va0Var.f469557g;
            if (z17) {
                if ("gh_f0a92aa7146c".equals(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(va0Var.f469555e)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "is WXPAY_COLLECTION，use wxpay menu data");
                    java.lang.String str2 = va0Var.f469555e;
                    gm0.j1.i();
                    java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WX_PAY_REVEIVE_PLUGIN_MENU_STRING_SYNC, null);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        try {
                            jSONObject = new org.json.JSONObject(str2);
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BigBallContactAssemblerImpl", "create Json object from extInfo error. %s.", e17);
                            jSONObject = new org.json.JSONObject();
                        }
                        try {
                            jSONObject.put("MMBizMenu", str3);
                        } catch (org.json.JSONException e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BigBallContactAssemblerImpl", "updateExtInfoAttrs MMBizMenu failed：value(%s), exception : %s.", str3, e18);
                        }
                        str2 = jSONObject.toString();
                    }
                    va0Var.f469555e = str2;
                }
                java.lang.String str4 = va0Var.f469555e;
                b17.f66740x26b3182a = str4;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "update extInfo=%s", str4);
                b17.f66731x4b3625c7 = null;
                b17.f66742x48b98940 = 0L;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "Reset biz(%s) Attribute syncVersion and incUpdateTime.", str);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.f66740x26b3182a)) {
                b17.D0(true);
            }
        }
        if (b17.D0(false) != null && b17.D0(false).j() == 3 && b17.D0(false).d() != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.y0())) {
            b17.f66739xdfb76cc2 = b17.y0();
            java.lang.String username = z3Var.d1();
            java.lang.String enterpriseFather = b17.f66739xdfb76cc2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterpriseFather, "enterpriseFather");
            bn0.g gVar = bn0.g.f104312a;
            bn0.a f17 = gVar.f(username);
            gVar.j(username, new bn0.a(f17 != null ? f17.f104301a : 0, f17 != null ? f17.f104302b : 0, f17 != null ? f17.f104303c : 0, f17 != null ? f17.f104304d : 0, enterpriseFather));
        }
        if (!r01.q3.cj().mo11260x413cb2b4(b17)) {
            r01.q3.cj().mo880xb970c2b9(b17);
        }
        z3Var.D2(b17.f66746x2262335f);
    }

    public static boolean f(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, com.p314xaae8f345.mm.p2621x8fb0427b.ya yaVar) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(yaVar.f66690xbe857eff)) {
            z3Var.d3(yaVar.f66690xbe857eff);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "syncStrangerDescriptionToContact() isStranger:%s isContact:%s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.z3.E4(z3Var.d1())), java.lang.Boolean.valueOf(z3Var.r2()));
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.E4(z3Var.d1()) || !z3Var.r2()) {
            return false;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(yaVar.f66690xbe857eff)) {
            r45.wn4 wn4Var = new r45.wn4();
            wn4Var.f470844d = z3Var.d1();
            wn4Var.f470845e = yaVar.f66690xbe857eff;
            ((e21.z0) c01.d9.b().w()).c(new xg3.p0(54, wn4Var));
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003b, code lost:
    
        if (r40.X1 == 1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0b27  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0b3d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0b46  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0b4b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0b48  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0b29  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0390 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0463  */
    @Override // vg3.q3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M(com.p314xaae8f345.mm.p2621x8fb0427b.z3 r38, com.p314xaae8f345.mm.p2621x8fb0427b.z3 r39, r45.tn4 r40, byte[] r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 2970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aq1.e.M(com.tencent.mm.storage.z3, com.tencent.mm.storage.z3, r45.tn4, byte[], boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v32, types: [aq1.e$$d] */
    @Override // vg3.q3
    public void b0(final com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2, r45.tn4 tn4Var, byte[] bArr, boolean z17) {
        java.lang.String stringBuffer;
        java.util.LinkedList linkedList;
        boolean z18;
        r61.a h17;
        r45.vy vyVar;
        java.lang.String[] strArr;
        java.lang.String str;
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z07;
        r61.a h18;
        int i17;
        java.lang.String[] strArr2;
        java.util.LinkedList linkedList2;
        java.lang.String d17 = z3Var.d1();
        java.lang.String J0 = z3Var.J0();
        if (z3Var2 != null) {
            java.lang.String str2 = z3Var2.f318124z1;
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = tn4Var.E1;
            if (str3 == null) {
                str3 = "";
            }
            str2.equals(str3);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            b(z3Var, tn4Var, true);
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(z3Var.f1())) {
            e(tn4Var, d17, z3Var, true);
        }
        int i18 = 0;
        boolean z27 = (z3Var2 == null || z3Var2.r2() || !z3Var.r2()) ? false : true;
        if (z27 && com.p314xaae8f345.mm.p2621x8fb0427b.z3.E4(d17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(931, 22);
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = z3Var.d1();
        r45.c85 c85Var = tn4Var.G1;
        objArr[1] = c85Var == null ? "" : java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(java.lang.Integer.valueOf(c85Var.f452907e.size())));
        objArr[2] = java.lang.Integer.valueOf(f94569d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s PhoneNumList size:%s mergePhoneSw:%s", objArr);
        if (f94569d == -1) {
            f94569d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_mod_contact_merge_switch, 0);
        }
        if (f94569d == 1) {
            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
            r45.c85 c85Var2 = tn4Var.G1;
            if (c85Var2 != null && (linkedList2 = c85Var2.f452907e) != null) {
                java.util.Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    java.lang.String str4 = ((r45.b85) it.next()).f452164d;
                    if (str4 != null) {
                        stringBuffer2.append(str4);
                        stringBuffer2.append("，");
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s, phoneList %s", z3Var.d1(), stringBuffer2.toString());
            if (z3Var2 != null) {
                str = z3Var2.E1;
                strArr = com.p314xaae8f345.mm.p670x38b72420.a.c(z3Var2, str);
            } else {
                strArr = null;
                str = null;
            }
            if ((str == null || str.equals("")) && (z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(J0)) != null && (str = z07.f66691xf9f876b1) != null) {
                strArr = str.split(",");
            }
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = z3Var.d1();
            boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            objArr2[1] = str != null ? str : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s, oldPhoneList %s", objArr2);
            if (strArr != null && strArr.length > 0) {
                java.lang.String stringBuffer3 = stringBuffer2.toString();
                java.lang.String[] split = stringBuffer3 != null ? stringBuffer3.split("，") : null;
                int length = strArr.length;
                int i19 = 0;
                boolean z29 = false;
                boolean z37 = false;
                while (i19 < length) {
                    java.lang.String str5 = strArr[i19];
                    if (split == null || split.length <= 0) {
                        strArr2 = strArr;
                    } else {
                        int length2 = split.length;
                        while (true) {
                            strArr2 = strArr;
                            if (i18 >= length2) {
                                break;
                            }
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str5, split[i18])) {
                                z37 = false;
                                break;
                            } else {
                                i18++;
                                strArr = strArr2;
                                z37 = true;
                            }
                        }
                        if (z37 && d(str5)) {
                            stringBuffer2.append(str5);
                            stringBuffer2.append("，");
                            z29 = true;
                        }
                    }
                    i19++;
                    strArr = strArr2;
                    i18 = 0;
                }
                if (z29) {
                    r45.qo4 qo4Var = new r45.qo4();
                    qo4Var.f465681d = z3Var.d1();
                    r45.c85 c85Var3 = new r45.c85();
                    java.lang.String stringBuffer4 = stringBuffer2.toString();
                    java.lang.String[] split2 = stringBuffer4 != null ? stringBuffer4.split("，") : null;
                    if (split2 != null && split2.length > 0) {
                        c85Var3.f452906d = split2.length;
                        c85Var3.f452907e = new java.util.LinkedList();
                        for (java.lang.String str6 : split2) {
                            r45.b85 b85Var = new r45.b85();
                            b85Var.f452164d = str6;
                            c85Var3.f452907e.add(b85Var);
                        }
                        qo4Var.f465682e = c85Var3;
                        ((e21.z0) c01.d9.b().w()).c(new xg3.p0(60, qo4Var));
                    }
                }
                if (z27 && 15 == tn4Var.G && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.d1()) && (h18 = m61.k.wi().h(z3Var.d1())) != null) {
                    java.lang.String stringBuffer5 = stringBuffer2.toString();
                    java.lang.String[] split3 = stringBuffer5 != null ? stringBuffer5.split("，") : null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    java.lang.Object[] objArr3 = new java.lang.Object[4];
                    objArr3[0] = z3Var.d1();
                    objArr3[1] = 3;
                    objArr3[2] = java.lang.Integer.valueOf(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h18.e()) ? 1 : 0);
                    if (split3 == null) {
                        i17 = 0;
                    } else {
                        i17 = 5;
                        if (split3.length < 5) {
                            i17 = split3.length;
                        }
                    }
                    objArr3[3] = java.lang.Integer.valueOf(i17);
                    g0Var.d(12040, objArr3);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s, phoneList %s", z3Var.d1(), stringBuffer2.toString());
            stringBuffer = stringBuffer2.toString();
        } else {
            java.lang.StringBuffer stringBuffer6 = new java.lang.StringBuffer();
            r45.c85 c85Var4 = tn4Var.G1;
            if (c85Var4 != null && (linkedList = c85Var4.f452907e) != null) {
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    java.lang.String str7 = ((r45.b85) it6.next()).f452164d;
                    if (str7 != null) {
                        stringBuffer6.append(str7);
                        stringBuffer6.append("，");
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s, phoneList %s", z3Var.d1(), stringBuffer6.toString());
            stringBuffer = stringBuffer6.toString();
        }
        if (stringBuffer == null) {
            stringBuffer = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", stringBuffer);
        z3Var.a3(stringBuffer);
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(d17) && (vyVar = tn4Var.B1) != null) {
            java.util.Map map = c01.v1.f119052a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] username is null!");
            } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(d17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] username is not personal! :%s", d17);
            } else {
                java.lang.String g17 = x51.j1.g(vyVar.f470193g);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] chatroomId:%s size:%s", g17, java.lang.Integer.valueOf(vyVar.f470191e.size()));
                    com.p314xaae8f345.mm.p2621x8fb0427b.a3 z08 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(g17);
                    if (z08 != null && vyVar.f470191e.size() > 0 && z08.A0().contains(((r45.wy) vyVar.f470191e.get(0)).f471098d)) {
                        java.lang.String str8 = ((r45.wy) vyVar.f470191e.get(0)).f471098d;
                        mo.b v07 = z08.v0(str8);
                        if (v07 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomMembersLogic", "oldMember contains:%s displayName:%s", str8, v07.f411781e);
                            v07.f411783g = ((r45.wy) vyVar.f470191e.get(0)).f471104m;
                            c01.v1.M(z08);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "talker:%s oldMemberData is null!", str8);
                        }
                    } else if (z08 == null || vyVar.f470191e.size() <= 0) {
                        if (vyVar.f470191e.size() <= 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] memberData.ChatRoomMember.size() <= 0");
                        }
                        if (z08 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] oldMember is null!");
                        }
                    } else {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5242x5950d3a2 c5242x5950d3a2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5242x5950d3a2();
                        java.lang.String str9 = ((r45.wy) vyVar.f470191e.get(0)).f471098d;
                        am.g2 g2Var = c5242x5950d3a2.f135575g;
                        g2Var.f88262a = str9;
                        g2Var.f88263b = ((r45.wy) vyVar.f470191e.get(0)).f471104m;
                        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) c01.v1.f119054c).put(g17 + "#" + g2Var.f88262a, g2Var.f88263b);
                        c5242x5950d3a2.e();
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z09 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(z3Var.d1());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "dealWithRemark(): stranger:%s, username: %s", z09, z3Var.d1());
        if (z09 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z09.f66694xdd77ad16)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "try get stranger again");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J0)) {
                z09 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(J0);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.w0())) {
            if (z09 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z09.f66694xdd77ad16)) {
                z18 = false;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "mod stranger remark : " + z09.f66694xdd77ad16);
                z3Var.n1(z09.f66692x4854b29d);
                z3Var.o1(x51.k.a(z09.f66692x4854b29d));
                z3Var.p1(x51.k.b(z09.f66692x4854b29d));
                z18 = f(z3Var, z09);
            }
            int m43619x2fa78b11 = z3Var.m43619x2fa78b11();
            if (m43619x2fa78b11 == 10 || m43619x2fa78b11 == 11 || m43619x2fa78b11 == 13) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tn4Var.f468146y0)) {
                    h17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J0) ? m61.k.wi().h(J0) : null;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "MobileHash[%s],MobileFullHash[%s]", tn4Var.f468146y0, tn4Var.f468128l1);
                    r61.b wi6 = m61.k.wi();
                    java.lang.String str10 = tn4Var.f468146y0;
                    java.lang.String str11 = tn4Var.f468128l1;
                    h17 = wi6.i(str10);
                    if (h17 == null) {
                        h17 = wi6.i(str11);
                    }
                }
                if (h17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "dealWithRemark-> addr == null");
                } else {
                    java.lang.Object[] objArr4 = new java.lang.Object[3];
                    java.lang.String h19 = h17.h();
                    if (h19 == null) {
                        h19 = "";
                    }
                    objArr4[0] = h19;
                    java.lang.String i27 = h17.i();
                    objArr4[1] = i27 != null ? i27 : "";
                    objArr4[2] = java.lang.Boolean.valueOf((h17.f474334q & 1) == 0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "remarkName RealName[%s], User[%s], needSetRemark[%s]", objArr4);
                }
                if (h17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.h())) {
                    if ((h17.f474334q & 1) == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "remarkName RealName[%s], User[%s], remarkChange[%s]", h17.h(), h17.i(), java.lang.Boolean.valueOf(z18));
                        h17.f474325h = z3Var.d1();
                        h17.f474332o = 2;
                        h17.f474334q |= 1;
                        if (!z18) {
                            z3Var.n1(h17.h());
                            z3Var.o1(x51.k.a(h17.h()));
                            z3Var.p1(x51.k.b(h17.h()));
                            z18 = true;
                        }
                        if (z3Var.r2()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "updateAddrUp RealName[%s], User[%s], remarkChange[%s]", h17.h(), h17.i(), java.lang.Boolean.valueOf(z18));
                            m61.k.wi().j(h17.e(), h17);
                        }
                    }
                }
            }
        } else {
            java.lang.Object[] objArr5 = new java.lang.Object[3];
            objArr5[0] = java.lang.Boolean.valueOf(z09 != null);
            objArr5[1] = z09 != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(z09.f66690xbe857eff) : "null";
            objArr5[2] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(z3Var.f318122y1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "remark is set hasStranger:%s des:%s->%s ", objArr5);
            if (z09 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z09.f66690xbe857eff) && !android.text.TextUtils.equals(z3Var.f318122y1, z09.f66690xbe857eff)) {
                f(z3Var, z09);
            }
            z18 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s needModContact %s encryptUser:%s isNewAddContact:%s", z3Var.d1(), java.lang.Boolean.valueOf(z18), J0, java.lang.Boolean.valueOf(z27));
        if (z18) {
            java.util.Set set = c01.e2.f118650a;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(2, c01.e2.n(z3Var)));
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z010 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(z3Var.J0());
        java.lang.String str12 = z010 != null ? z010.f66693x91130dba : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str12) && (z010 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(z3Var.d1())) != null) {
            str12 = z010.f66693x91130dba;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str12)) {
            c93.b a17 = c93.a.a();
            java.lang.String d18 = z3Var.d1();
            b93.b bVar = (b93.b) a17;
            synchronized (bVar) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel] user:%s labels:%s", d18 + "", str12 + "");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str12)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel] labels is null.");
                } else {
                    java.util.ArrayList arrayList = (java.util.ArrayList) bVar.f(str12);
                    if (arrayList != null && !arrayList.isEmpty()) {
                        bVar.f100118a = d18;
                        bVar.f100119b = arrayList;
                        int size = arrayList.size();
                        bVar.f100120c = new java.util.ArrayList();
                        for (int i28 = 0; i28 < size; i28++) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.d4 o17 = b93.r.wi().o1((java.lang.String) arrayList.get(i28));
                            if (o17 != null && o17.f66584x284d1882) {
                                bVar.f100120c.add((java.lang.String) arrayList.get(i28));
                            }
                        }
                        com.p314xaae8f345.mm.p944x882e457a.r1 e17 = c01.d9.e();
                        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = bVar.f100121d;
                        e17.a(kd1.c.f72435x366c91de, u0Var);
                        c01.d9.e().a(638, u0Var);
                        java.util.ArrayList arrayList2 = bVar.f100120c;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel]addList:%s", bVar.f100120c.toString());
                            c01.d9.e().g(new e93.a(bVar.f100120c));
                        }
                        bVar.l(d18, arrayList);
                        bVar.k();
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel] labelList is null.");
                }
            }
            z010.f66693x91130dba = "";
            ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).mo11260x413cb2b4(z010);
        }
        if (z27 && z3Var.m43619x2fa78b11() == 15) {
            ?? r17 = new java.lang.Object() { // from class: aq1.e$$d
                public final java.lang.Object a(java.lang.Object obj) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.ya yaVar = (com.p314xaae8f345.mm.p2621x8fb0427b.ya) obj;
                    if (yaVar != null) {
                        java.lang.String str13 = yaVar.f66691xf9f876b1;
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.this;
                        java.lang.String d19 = z3Var3.d1();
                        java.lang.Object[] objArr6 = new java.lang.Object[4];
                        objArr6[0] = z3Var3.d1();
                        objArr6[1] = z3Var3.J0();
                        objArr6[2] = str13;
                        objArr6[3] = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349() ? yaVar.mo124851xcc313de3() : "";
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "dealStrangerPhone() called uctname:%s uctename:%s stranger conPhone:%s %s", objArr6);
                        if (!android.text.TextUtils.isEmpty(str13)) {
                            java.lang.String[] b17 = com.p314xaae8f345.mm.p670x38b72420.a.b(z3Var3);
                            java.util.List<java.lang.String> C0 = b17 != null ? kz5.z.C0(b17) : new java.util.ArrayList();
                            r61.a h27 = m61.k.wi().h(z3Var3.d1());
                            java.lang.String f17 = h27 != null ? h27.f() : "";
                            if (f17 != null) {
                                f17 = f17.replace(" ", "");
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "dealStrangerPhone() attrMobile:%s, conPhone:%s", f17, str13);
                            if (!str13.equals(f17) && !C0.contains(str13)) {
                                C0.add(str13);
                                r45.qo4 qo4Var2 = new r45.qo4();
                                qo4Var2.f465681d = z3Var3.d1();
                                r45.c85 c85Var5 = new r45.c85();
                                c85Var5.f452907e = new java.util.LinkedList();
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                for (java.lang.String str14 : C0) {
                                    if (aq1.e.d(str14)) {
                                        r45.b85 b85Var2 = new r45.b85();
                                        b85Var2.f452164d = str14;
                                        c85Var5.f452907e.add(b85Var2);
                                        arrayList3.add(str14);
                                    }
                                }
                                c85Var5.f452906d = arrayList3.size();
                                qo4Var2.f465682e = c85Var5;
                                ((e21.z0) c01.d9.b().w()).c(new xg3.p0(60, qo4Var2));
                                if (((int) z3Var3.E2) > 0 && z3Var3.r2()) {
                                    java.lang.String a18 = com.p314xaae8f345.mm.p670x38b72420.a.a(arrayList3);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "[dealModPhoneNumberList] username:%s %s", d19, a18);
                                    z3Var3.a3(a18);
                                    com.p314xaae8f345.mm.p670x38b72420.a.d(z3Var3);
                                }
                            }
                            return java.lang.Boolean.TRUE;
                        }
                    }
                    return java.lang.Boolean.FALSE;
                }
            };
            com.p314xaae8f345.mm.p2621x8fb0427b.ya z011 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(z3Var.d1());
            if (((java.lang.Boolean) r17.a(z011)).booleanValue()) {
                return;
            }
            java.lang.String J02 = z3Var.J0();
            if (z011 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z011.f66694xdd77ad16)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "try get stranger again");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J02)) {
                    return;
                }
                r17.a(((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(J02));
            }
        }
    }

    @Override // vg3.q3
    public void m1(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, r45.xb0 xb0Var) {
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigBallContactAssemblerImpl", "onsceneEnd errType:%d,errCode:%d,errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var.mo808xfb85f7b0() == 681 && (m1Var instanceof e21.j) && i17 == 0 && i18 == 0) {
            if (!gm0.j1.b().f354787q) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BigBallContactAssemblerImpl", "initialize notify is not done.");
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).q(new aq1.f(this, m1Var));
        }
    }
}
