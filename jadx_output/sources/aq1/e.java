package aq1;

/* loaded from: classes11.dex */
public class e implements vg3.q3, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public static int f13036d = -1;

    public static java.lang.Object a(java.lang.Object obj, java.util.concurrent.Callable callable) {
        try {
            return callable.call();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BigBallContactAssemblerImpl", th6, "[-] exception thrown.", new java.lang.Object[0]);
            return obj;
        }
    }

    public static boolean b(com.tencent.mm.storage.z3 z3Var, r45.tn4 tn4Var, boolean z17) {
        r61.a h17;
        if (z3Var == null || com.tencent.mm.sdk.platformtools.t8.K0(z3Var.d1())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BigBallContactAssemblerImpl", "dkinit dealModContactExtInfo failed invalid contact");
            return false;
        }
        java.lang.String d17 = z3Var.d1();
        java.lang.String J0 = z3Var.J0();
        if (z3Var.s2()) {
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.Ai().p(d17, true);
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.Ai().p(d17, false);
            ((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).pj(d17);
            com.tencent.mm.modelavatar.d1.Ni().u0(d17);
            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "isDeleteContact, so delete avatar file.");
        } else {
            com.tencent.mm.modelavatar.g.e(d17, tn4Var, z3Var);
        }
        r45.cb6 cb6Var = tn4Var.R;
        if (!z3Var.d1().endsWith("@chatroom") && cb6Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "SnsFlag modcontact " + cb6Var.f371428d + " " + tn4Var.f386589d);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SnsBg modcontact ");
            sb6.append(cb6Var.f371429e);
            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", sb6.toString());
            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "SnsBgId modcontact " + cb6Var.f371430f);
            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "SnsBgId modcontact " + cb6Var.f371431g);
            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "SnsBgId modcontact " + cb6Var.f371432h);
            if (p94.w0.c() != null) {
                ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).z1(z3Var.d1(), cb6Var);
            }
        }
        if (z3Var.r2()) {
            gm0.j1.e().j(new com.tencent.mm.plugin.profile.q1(d17, J0));
        }
        if (z3Var.r2() && ((z3Var.getSource() == 10 || z3Var.getSource() == 13) && (h17 = m61.k.wi().h(z3Var.J0())) != null && !com.tencent.mm.sdk.platformtools.t8.K0(h17.f392805u))) {
            h17.f392792h = z3Var.d1();
            m61.k.wi().j(h17.f392805u, h17);
        }
        e(tn4Var, d17, z3Var, z17);
        if (com.tencent.mm.storage.z3.L3(d17)) {
            r45.va0 va0Var = tn4Var.W;
            if (va0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BigBallContactAssemblerImpl", "[-] cmdMC.CustomizedInfo is null, user:%s", d17);
            } else if (android.text.TextUtils.isEmpty(va0Var.f388022e)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BigBallContactAssemblerImpl", "[-] cmdMC.CustomizedInfo.ExternalInfo is null, user:%s", d17);
            } else {
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "yuanbao config: %s", tn4Var.W.f388022e);
                    final org.json.JSONObject jSONObject = new org.json.JSONObject(tn4Var.W.f388022e);
                    vh0.f1 ij6 = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).ij(d17);
                    ((xh0.e) ij6).f454487b.put("menu", jSONObject.toString());
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
                            ((xh0.e) ij6).f454487b.put("profileInfoDetail", jSONArray.toString());
                        }
                        java.lang.String optString = jSONObject2.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID);
                        if (optString != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "get appid { %s } for username:%s", optString, d17);
                            ((xh0.e) ij6).f454487b.put("openIMId", optString);
                        }
                        java.lang.String optString2 = jSONObject2.optString("desc_id");
                        if (optString2 != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "get openIMDescId { %s } for username:%s", optString2, d17);
                            ((xh0.e) ij6).f454487b.put("openIMDescId", optString2);
                        }
                        java.lang.String optString3 = jSONObject2.optString("custom_info");
                        if (optString3 != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "get openIMCustomInfo { %s } for username:%s", optString3, d17);
                            ((xh0.e) ij6).f454487b.put("openIMCustomInfo", optString3);
                        }
                    }
                    java.lang.Object opt = jSONObject.opt("toolbar_flag");
                    if (opt != null) {
                        ((xh0.e) ij6).f454487b.put("toolbarFlag", java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.F1(opt.toString(), 0L)));
                    }
                    if (com.tencent.mm.storage.z3.L4(d17)) {
                        org.json.JSONObject jSONObject3 = (org.json.JSONObject) a(null, new java.util.concurrent.Callable() { // from class: aq1.e$$c
                            @Override // java.util.concurrent.Callable
                            public final java.lang.Object call() {
                                return jSONObject.getJSONObject("weclaw_info");
                            }
                        });
                        if (jSONObject3 != null) {
                            java.lang.Object opt2 = jSONObject3.opt("shortcut_list");
                            if (opt2 != null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "weclaw shortcut_list: %s, username:%s", opt2, d17);
                                ((xh0.e) ij6).b(opt2.toString());
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "weclaw shortcut_list is empty/null, clear for username:%s", d17);
                                ((xh0.e) ij6).b("");
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "weclaw weclaw_info is empty/invalid, clear shortcutList for username:%s", d17);
                            ((xh0.e) ij6).b("");
                        }
                    }
                    if (!((xh0.e) ij6).a()) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.BigBallContactAssemblerImpl", "[-] fail to do actual update logic, username:%s", d17);
                    }
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BigBallContactAssemblerImpl", e17, "saveChatBotInfo error, user:%s", d17);
                }
            }
        }
        return true;
    }

    public static void c(com.tencent.mm.storage.z3 z3Var) {
        if (z3Var == null || !r01.z.h(z3Var.d1())) {
            return;
        }
        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
        java.lang.String d17 = z3Var.d1();
        ((qv.o) u2Var).getClass();
        if (r01.z.g(d17)) {
            return;
        }
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(z3Var.d1());
        qk.o b17 = r01.q3.cj().b1(z3Var.d1());
        if (r01.z.i(b17.field_username) && p17 == null) {
            com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4(b17.field_username);
            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "Enterprise belong %s, userName: %s", b17.y0(), b17.field_username);
            java.lang.String y07 = b17.y0();
            if (y07 == null) {
                y07 = "";
            }
            l4Var.T1(y07);
            l4Var.f2();
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).G(l4Var);
        }
    }

    public static boolean d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        java.util.regex.Matcher matcher = com.tencent.mm.pluginsdk.ui.span.b0.f191180o.matcher(str);
        return matcher.find() && com.tencent.mm.sdk.platformtools.t8.D0(str, matcher.group(0));
    }

    public static void e(r45.tn4 tn4Var, java.lang.String str, com.tencent.mm.storage.z3 z3Var, boolean z17) {
        org.json.JSONObject jSONObject;
        java.lang.String r17 = c01.z1.r();
        if (r17 == null || r17.equals(str)) {
            return;
        }
        qk.o b17 = r01.q3.cj().b1(str);
        b17.field_username = str;
        b17.field_brandList = tn4Var.V;
        r45.va0 va0Var = tn4Var.W;
        if (va0Var != null) {
            b17.field_brandFlag = va0Var.f388021d;
            b17.field_brandInfo = va0Var.f388023f;
            b17.field_brandIconURL = va0Var.f388024g;
            if (z17) {
                if ("gh_f0a92aa7146c".equals(str) && !com.tencent.mm.sdk.platformtools.t8.K0(va0Var.f388022e)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "is WXPAY_COLLECTION，use wxpay menu data");
                    java.lang.String str2 = va0Var.f388022e;
                    gm0.j1.i();
                    java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WX_PAY_REVEIVE_PLUGIN_MENU_STRING_SYNC, null);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str3) && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        try {
                            jSONObject = new org.json.JSONObject(str2);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.BigBallContactAssemblerImpl", "create Json object from extInfo error. %s.", e17);
                            jSONObject = new org.json.JSONObject();
                        }
                        try {
                            jSONObject.put("MMBizMenu", str3);
                        } catch (org.json.JSONException e18) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.BigBallContactAssemblerImpl", "updateExtInfoAttrs MMBizMenu failed：value(%s), exception : %s.", str3, e18);
                        }
                        str2 = jSONObject.toString();
                    }
                    va0Var.f388022e = str2;
                }
                java.lang.String str4 = va0Var.f388022e;
                b17.field_extInfo = str4;
                com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "update extInfo=%s", str4);
                b17.field_attrSyncVersion = null;
                b17.field_incrementUpdateTime = 0L;
                com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "Reset biz(%s) Attribute syncVersion and incUpdateTime.", str);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(b17.field_extInfo)) {
                b17.D0(true);
            }
        }
        if (b17.D0(false) != null && b17.D0(false).j() == 3 && b17.D0(false).d() != null && !com.tencent.mm.sdk.platformtools.t8.K0(b17.y0())) {
            b17.field_enterpriseFather = b17.y0();
            java.lang.String username = z3Var.d1();
            java.lang.String enterpriseFather = b17.field_enterpriseFather;
            kotlin.jvm.internal.o.g(username, "username");
            kotlin.jvm.internal.o.g(enterpriseFather, "enterpriseFather");
            bn0.g gVar = bn0.g.f22779a;
            bn0.a f17 = gVar.f(username);
            gVar.j(username, new bn0.a(f17 != null ? f17.f22768a : 0, f17 != null ? f17.f22769b : 0, f17 != null ? f17.f22770c : 0, f17 != null ? f17.f22771d : 0, enterpriseFather));
        }
        if (!r01.q3.cj().replace(b17)) {
            r01.q3.cj().insert(b17);
        }
        z3Var.D2(b17.field_type);
    }

    public static boolean f(com.tencent.mm.storage.z3 z3Var, com.tencent.mm.storage.ya yaVar) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(yaVar.field_conDescription)) {
            z3Var.d3(yaVar.field_conDescription);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "syncStrangerDescriptionToContact() isStranger:%s isContact:%s", java.lang.Boolean.valueOf(com.tencent.mm.storage.z3.E4(z3Var.d1())), java.lang.Boolean.valueOf(z3Var.r2()));
        if (com.tencent.mm.storage.z3.E4(z3Var.d1()) || !z3Var.r2()) {
            return false;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(yaVar.field_conDescription)) {
            r45.wn4 wn4Var = new r45.wn4();
            wn4Var.f389311d = z3Var.d1();
            wn4Var.f389312e = yaVar.field_conDescription;
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
    public void M(com.tencent.mm.storage.z3 r38, com.tencent.mm.storage.z3 r39, r45.tn4 r40, byte[] r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 2970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aq1.e.M(com.tencent.mm.storage.z3, com.tencent.mm.storage.z3, r45.tn4, byte[], boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v32, types: [aq1.e$$d] */
    @Override // vg3.q3
    public void b0(final com.tencent.mm.storage.z3 z3Var, com.tencent.mm.storage.z3 z3Var2, r45.tn4 tn4Var, byte[] bArr, boolean z17) {
        java.lang.String stringBuffer;
        java.util.LinkedList linkedList;
        boolean z18;
        r61.a h17;
        r45.vy vyVar;
        java.lang.String[] strArr;
        java.lang.String str;
        com.tencent.mm.storage.ya z07;
        r61.a h18;
        int i17;
        java.lang.String[] strArr2;
        java.util.LinkedList linkedList2;
        java.lang.String d17 = z3Var.d1();
        java.lang.String J0 = z3Var.J0();
        if (z3Var2 != null) {
            java.lang.String str2 = z3Var2.f236591z1;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = tn4Var.E1;
            if (str3 == null) {
                str3 = "";
            }
            str2.equals(str3);
        }
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            b(z3Var, tn4Var, true);
        } else if (com.tencent.mm.storage.z3.D3(z3Var.f1())) {
            e(tn4Var, d17, z3Var, true);
        }
        int i18 = 0;
        boolean z27 = (z3Var2 == null || z3Var2.r2() || !z3Var.r2()) ? false : true;
        if (z27 && com.tencent.mm.storage.z3.E4(d17)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(931, 22);
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = z3Var.d1();
        r45.c85 c85Var = tn4Var.G1;
        objArr[1] = c85Var == null ? "" : java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.q1(java.lang.Integer.valueOf(c85Var.f371374e.size())));
        objArr[2] = java.lang.Integer.valueOf(f13036d);
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s PhoneNumList size:%s mergePhoneSw:%s", objArr);
        if (f13036d == -1) {
            f13036d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_mod_contact_merge_switch, 0);
        }
        if (f13036d == 1) {
            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
            r45.c85 c85Var2 = tn4Var.G1;
            if (c85Var2 != null && (linkedList2 = c85Var2.f371374e) != null) {
                java.util.Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    java.lang.String str4 = ((r45.b85) it.next()).f370631d;
                    if (str4 != null) {
                        stringBuffer2.append(str4);
                        stringBuffer2.append("，");
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s, phoneList %s", z3Var.d1(), stringBuffer2.toString());
            if (z3Var2 != null) {
                str = z3Var2.E1;
                strArr = com.tencent.mm.contact.a.c(z3Var2, str);
            } else {
                strArr = null;
                str = null;
            }
            if ((str == null || str.equals("")) && (z07 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(J0)) != null && (str = z07.field_conPhone) != null) {
                strArr = str.split(",");
            }
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = z3Var.d1();
            boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            objArr2[1] = str != null ? str : "";
            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s, oldPhoneList %s", objArr2);
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
                            if (com.tencent.mm.sdk.platformtools.t8.D0(str5, split[i18])) {
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
                    qo4Var.f384148d = z3Var.d1();
                    r45.c85 c85Var3 = new r45.c85();
                    java.lang.String stringBuffer4 = stringBuffer2.toString();
                    java.lang.String[] split2 = stringBuffer4 != null ? stringBuffer4.split("，") : null;
                    if (split2 != null && split2.length > 0) {
                        c85Var3.f371373d = split2.length;
                        c85Var3.f371374e = new java.util.LinkedList();
                        for (java.lang.String str6 : split2) {
                            r45.b85 b85Var = new r45.b85();
                            b85Var.f370631d = str6;
                            c85Var3.f371374e.add(b85Var);
                        }
                        qo4Var.f384149e = c85Var3;
                        ((e21.z0) c01.d9.b().w()).c(new xg3.p0(60, qo4Var));
                    }
                }
                if (z27 && 15 == tn4Var.G && !com.tencent.mm.sdk.platformtools.t8.K0(z3Var.d1()) && (h18 = m61.k.wi().h(z3Var.d1())) != null) {
                    java.lang.String stringBuffer5 = stringBuffer2.toString();
                    java.lang.String[] split3 = stringBuffer5 != null ? stringBuffer5.split("，") : null;
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.Object[] objArr3 = new java.lang.Object[4];
                    objArr3[0] = z3Var.d1();
                    objArr3[1] = 3;
                    objArr3[2] = java.lang.Integer.valueOf(!com.tencent.mm.sdk.platformtools.t8.K0(h18.e()) ? 1 : 0);
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
            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s, phoneList %s", z3Var.d1(), stringBuffer2.toString());
            stringBuffer = stringBuffer2.toString();
        } else {
            java.lang.StringBuffer stringBuffer6 = new java.lang.StringBuffer();
            r45.c85 c85Var4 = tn4Var.G1;
            if (c85Var4 != null && (linkedList = c85Var4.f371374e) != null) {
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    java.lang.String str7 = ((r45.b85) it6.next()).f370631d;
                    if (str7 != null) {
                        stringBuffer6.append(str7);
                        stringBuffer6.append("，");
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s, phoneList %s", z3Var.d1(), stringBuffer6.toString());
            stringBuffer = stringBuffer6.toString();
        }
        if (stringBuffer == null) {
            stringBuffer = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", stringBuffer);
        z3Var.a3(stringBuffer);
        if (!com.tencent.mm.storage.z3.R4(d17) && (vyVar = tn4Var.B1) != null) {
            java.util.Map map = c01.v1.f37519a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] username is null!");
            } else if (com.tencent.mm.storage.z3.R4(d17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] username is not personal! :%s", d17);
            } else {
                java.lang.String g17 = x51.j1.g(vyVar.f388660g);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] chatroomId:%s size:%s", g17, java.lang.Integer.valueOf(vyVar.f388658e.size()));
                    com.tencent.mm.storage.a3 z08 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(g17);
                    if (z08 != null && vyVar.f388658e.size() > 0 && z08.A0().contains(((r45.wy) vyVar.f388658e.get(0)).f389565d)) {
                        java.lang.String str8 = ((r45.wy) vyVar.f388658e.get(0)).f389565d;
                        mo.b v07 = z08.v0(str8);
                        if (v07 != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomMembersLogic", "oldMember contains:%s displayName:%s", str8, v07.f330248e);
                            v07.f330250g = ((r45.wy) vyVar.f388658e.get(0)).f389571m;
                            c01.v1.M(z08);
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomMembersLogic", "talker:%s oldMemberData is null!", str8);
                        }
                    } else if (z08 == null || vyVar.f388658e.size() <= 0) {
                        if (vyVar.f388658e.size() <= 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] memberData.ChatRoomMember.size() <= 0");
                        }
                        if (z08 != null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] oldMember is null!");
                        }
                    } else {
                        com.tencent.mm.autogen.events.ChatroomMemberInviteerUpdatedEvent chatroomMemberInviteerUpdatedEvent = new com.tencent.mm.autogen.events.ChatroomMemberInviteerUpdatedEvent();
                        java.lang.String str9 = ((r45.wy) vyVar.f388658e.get(0)).f389565d;
                        am.g2 g2Var = chatroomMemberInviteerUpdatedEvent.f54042g;
                        g2Var.f6729a = str9;
                        g2Var.f6730b = ((r45.wy) vyVar.f388658e.get(0)).f389571m;
                        ((com.tencent.mm.sdk.platformtools.r2) c01.v1.f37521c).put(g17 + "#" + g2Var.f6729a, g2Var.f6730b);
                        chatroomMemberInviteerUpdatedEvent.e();
                    }
                }
            }
        }
        com.tencent.mm.storage.ya z09 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(z3Var.d1());
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "dealWithRemark(): stranger:%s, username: %s", z09, z3Var.d1());
        if (z09 == null || com.tencent.mm.sdk.platformtools.t8.K0(z09.field_encryptUsername)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "try get stranger again");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(J0)) {
                z09 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(J0);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(z3Var.w0())) {
            if (z09 == null || com.tencent.mm.sdk.platformtools.t8.K0(z09.field_encryptUsername)) {
                z18 = false;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "mod stranger remark : " + z09.field_encryptUsername);
                z3Var.n1(z09.field_conRemark);
                z3Var.o1(x51.k.a(z09.field_conRemark));
                z3Var.p1(x51.k.b(z09.field_conRemark));
                z18 = f(z3Var, z09);
            }
            int source = z3Var.getSource();
            if (source == 10 || source == 11 || source == 13) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(tn4Var.f386613y0)) {
                    h17 = !com.tencent.mm.sdk.platformtools.t8.K0(J0) ? m61.k.wi().h(J0) : null;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "MobileHash[%s],MobileFullHash[%s]", tn4Var.f386613y0, tn4Var.f386595l1);
                    r61.b wi6 = m61.k.wi();
                    java.lang.String str10 = tn4Var.f386613y0;
                    java.lang.String str11 = tn4Var.f386595l1;
                    h17 = wi6.i(str10);
                    if (h17 == null) {
                        h17 = wi6.i(str11);
                    }
                }
                if (h17 == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "dealWithRemark-> addr == null");
                } else {
                    java.lang.Object[] objArr4 = new java.lang.Object[3];
                    java.lang.String h19 = h17.h();
                    if (h19 == null) {
                        h19 = "";
                    }
                    objArr4[0] = h19;
                    java.lang.String i27 = h17.i();
                    objArr4[1] = i27 != null ? i27 : "";
                    objArr4[2] = java.lang.Boolean.valueOf((h17.f392801q & 1) == 0);
                    com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "remarkName RealName[%s], User[%s], needSetRemark[%s]", objArr4);
                }
                if (h17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(h17.h())) {
                    if ((h17.f392801q & 1) == 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "remarkName RealName[%s], User[%s], remarkChange[%s]", h17.h(), h17.i(), java.lang.Boolean.valueOf(z18));
                        h17.f392792h = z3Var.d1();
                        h17.f392799o = 2;
                        h17.f392801q |= 1;
                        if (!z18) {
                            z3Var.n1(h17.h());
                            z3Var.o1(x51.k.a(h17.h()));
                            z3Var.p1(x51.k.b(h17.h()));
                            z18 = true;
                        }
                        if (z3Var.r2()) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "updateAddrUp RealName[%s], User[%s], remarkChange[%s]", h17.h(), h17.i(), java.lang.Boolean.valueOf(z18));
                            m61.k.wi().j(h17.e(), h17);
                        }
                    }
                }
            }
        } else {
            java.lang.Object[] objArr5 = new java.lang.Object[3];
            objArr5[0] = java.lang.Boolean.valueOf(z09 != null);
            objArr5[1] = z09 != null ? com.tencent.mm.sdk.platformtools.t8.G1(z09.field_conDescription) : "null";
            objArr5[2] = com.tencent.mm.sdk.platformtools.t8.G1(z3Var.f236589y1);
            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "remark is set hasStranger:%s des:%s->%s ", objArr5);
            if (z09 != null && !com.tencent.mm.sdk.platformtools.t8.K0(z09.field_conDescription) && !android.text.TextUtils.equals(z3Var.f236589y1, z09.field_conDescription)) {
                f(z3Var, z09);
            }
            z18 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s needModContact %s encryptUser:%s isNewAddContact:%s", z3Var.d1(), java.lang.Boolean.valueOf(z18), J0, java.lang.Boolean.valueOf(z27));
        if (z18) {
            java.util.Set set = c01.e2.f37117a;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(2, c01.e2.n(z3Var)));
        }
        com.tencent.mm.storage.ya z010 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(z3Var.J0());
        java.lang.String str12 = z010 != null ? z010.field_contactLabels : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str12) && (z010 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(z3Var.d1())) != null) {
            str12 = z010.field_contactLabels;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str12)) {
            c93.b a17 = c93.a.a();
            java.lang.String d18 = z3Var.d1();
            b93.b bVar = (b93.b) a17;
            synchronized (bVar) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel] user:%s labels:%s", d18 + "", str12 + "");
                if (com.tencent.mm.sdk.platformtools.t8.K0(str12)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel] labels is null.");
                } else {
                    java.util.ArrayList arrayList = (java.util.ArrayList) bVar.f(str12);
                    if (arrayList != null && !arrayList.isEmpty()) {
                        bVar.f18585a = d18;
                        bVar.f18586b = arrayList;
                        int size = arrayList.size();
                        bVar.f18587c = new java.util.ArrayList();
                        for (int i28 = 0; i28 < size; i28++) {
                            com.tencent.mm.storage.d4 o17 = b93.r.wi().o1((java.lang.String) arrayList.get(i28));
                            if (o17 != null && o17.field_isTemporary) {
                                bVar.f18587c.add((java.lang.String) arrayList.get(i28));
                            }
                        }
                        com.tencent.mm.modelbase.r1 e17 = c01.d9.e();
                        com.tencent.mm.modelbase.u0 u0Var = bVar.f18588d;
                        e17.a(kd1.c.CTRL_INDEX, u0Var);
                        c01.d9.e().a(638, u0Var);
                        java.util.ArrayList arrayList2 = bVar.f18587c;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel]addList:%s", bVar.f18587c.toString());
                            c01.d9.e().g(new e93.a(bVar.f18587c));
                        }
                        bVar.l(d18, arrayList);
                        bVar.k();
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel] labelList is null.");
                }
            }
            z010.field_contactLabels = "";
            ((com.tencent.mm.storage.ab) c01.d9.b().B()).replace(z010);
        }
        if (z27 && z3Var.getSource() == 15) {
            ?? r17 = new java.lang.Object() { // from class: aq1.e$$d
                public final java.lang.Object a(java.lang.Object obj) {
                    com.tencent.mm.storage.ya yaVar = (com.tencent.mm.storage.ya) obj;
                    if (yaVar != null) {
                        java.lang.String str13 = yaVar.field_conPhone;
                        com.tencent.mm.storage.z3 z3Var3 = com.tencent.mm.storage.z3.this;
                        java.lang.String d19 = z3Var3.d1();
                        java.lang.Object[] objArr6 = new java.lang.Object[4];
                        objArr6[0] = z3Var3.d1();
                        objArr6[1] = z3Var3.J0();
                        objArr6[2] = str13;
                        objArr6[3] = com.tencent.mars.xlog.Log.isDebug() ? yaVar.toJSON() : "";
                        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "dealStrangerPhone() called uctname:%s uctename:%s stranger conPhone:%s %s", objArr6);
                        if (!android.text.TextUtils.isEmpty(str13)) {
                            java.lang.String[] b17 = com.tencent.mm.contact.a.b(z3Var3);
                            java.util.List<java.lang.String> C0 = b17 != null ? kz5.z.C0(b17) : new java.util.ArrayList();
                            r61.a h27 = m61.k.wi().h(z3Var3.d1());
                            java.lang.String f17 = h27 != null ? h27.f() : "";
                            if (f17 != null) {
                                f17 = f17.replace(" ", "");
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "dealStrangerPhone() attrMobile:%s, conPhone:%s", f17, str13);
                            if (!str13.equals(f17) && !C0.contains(str13)) {
                                C0.add(str13);
                                r45.qo4 qo4Var2 = new r45.qo4();
                                qo4Var2.f384148d = z3Var3.d1();
                                r45.c85 c85Var5 = new r45.c85();
                                c85Var5.f371374e = new java.util.LinkedList();
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                for (java.lang.String str14 : C0) {
                                    if (aq1.e.d(str14)) {
                                        r45.b85 b85Var2 = new r45.b85();
                                        b85Var2.f370631d = str14;
                                        c85Var5.f371374e.add(b85Var2);
                                        arrayList3.add(str14);
                                    }
                                }
                                c85Var5.f371373d = arrayList3.size();
                                qo4Var2.f384149e = c85Var5;
                                ((e21.z0) c01.d9.b().w()).c(new xg3.p0(60, qo4Var2));
                                if (((int) z3Var3.E2) > 0 && z3Var3.r2()) {
                                    java.lang.String a18 = com.tencent.mm.contact.a.a(arrayList3);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "[dealModPhoneNumberList] username:%s %s", d19, a18);
                                    z3Var3.a3(a18);
                                    com.tencent.mm.contact.a.d(z3Var3);
                                }
                            }
                            return java.lang.Boolean.TRUE;
                        }
                    }
                    return java.lang.Boolean.FALSE;
                }
            };
            com.tencent.mm.storage.ya z011 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(z3Var.d1());
            if (((java.lang.Boolean) r17.a(z011)).booleanValue()) {
                return;
            }
            java.lang.String J02 = z3Var.J0();
            if (z011 == null || com.tencent.mm.sdk.platformtools.t8.K0(z011.field_encryptUsername)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "try get stranger again");
                if (com.tencent.mm.sdk.platformtools.t8.K0(J02)) {
                    return;
                }
                r17.a(((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(J02));
            }
        }
    }

    @Override // vg3.q3
    public void m1(com.tencent.mm.storage.z3 z3Var, r45.xb0 xb0Var) {
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallContactAssemblerImpl", "onsceneEnd errType:%d,errCode:%d,errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var.getType() == 681 && (m1Var instanceof e21.j) && i17 == 0 && i18 == 0) {
            if (!gm0.j1.b().f273254q) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BigBallContactAssemblerImpl", "initialize notify is not done.");
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).q(new aq1.f(this, m1Var));
        }
    }
}
